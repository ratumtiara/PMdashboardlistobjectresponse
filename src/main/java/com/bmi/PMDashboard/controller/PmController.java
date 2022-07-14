package com.bmi.PMDashboard.controller;

import java.util.ArrayList;
import java.util.List;
// import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.bmi.PMDashboard.repository.PMDeleteRepo;
import com.bmi.PMDashboard.repository.PMDigitalBankingRepo;

import com.bmi.PMDashboard.repository.PMRepository;
import com.bmi.PMDashboard.repository.PMSelectedRepository;
import com.bmi.PMDashboard.repository.PMUpdatebutton;
import com.bmi.PMDashboard.utility.JsonUtils;
import com.bmi.PMDashboard.entity.PMEntity;
import com.bmi.PMDashboard.entity.SelectedChannelEntity;
import com.bmi.PMDashboard.model.ReqInputForm;
import com.bmi.PMDashboard.model.ResPM;
// import com.bmi.PMDashboard.model.ReqNoCR;
import com.bmi.PMDashboard.model.ResPMDigital;
import com.bmi.PMDashboard.model.requpdatebutton;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@CrossOrigin(allowCredentials = "false", origins = "*", allowedHeaders = "*")
// @CrossOrigin(allowCredentials = "true", origins = "*", allowedMethods = "GET", "PUT", "POST", "PATCH", "DELETE", "OPTIONS")
// @CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/v1")
public class PmController {

    Logger logger = LoggerFactory.getLogger(PmController.class);

    @Autowired
    private PMSelectedRepository pmSelectedRepository;

    @Autowired
    private PMRepository pmrepository;

    @Autowired
    private PMDigitalBankingRepo pmdigitalbankingrepo;

    @Autowired
    private PMDeleteRepo pmdeleteRepo;

    @Autowired
    private PMUpdatebutton pmupdatebutton;
    
    @PostMapping("/eform/createpm21")
    public ResponseEntity<ReqInputForm> createPM(@RequestBody ReqInputForm reqInputForm) {
        PMEntity pmEntity = new PMEntity();
        long unixTime = System.currentTimeMillis() / 1000L;
        String generateAppId = Long.toString(unixTime);
        try {
            pmEntity.setApp_id(generateAppId);
            pmEntity.setAbutton(reqInputForm.getAbutton());
            pmEntity.setBa_implementasi(reqInputForm.getBa_implementasi());
            pmEntity.setBa_uat(reqInputForm.getBa_uat());
            pmEntity.setBrd(reqInputForm.getBrd());
            pmEntity.setBusiness_user(reqInputForm.getBusiness_user());
            pmEntity.setChannel(reqInputForm.getChannel());
            pmEntity.setCompletion(reqInputForm.getCompletion());
            pmEntity.setCr(reqInputForm.getCr());
            pmEntity.setCr_date(reqInputForm.getCr_date());
            pmEntity.setDoc_implementasi(reqInputForm.getDoc_implementasi());
            pmEntity.setDoc_release(reqInputForm.getDoc_release());
            pmEntity.setFsd(reqInputForm.getFsd());
            pmEntity.setLive_date(reqInputForm.getLive_date());
            pmEntity.setMemo(reqInputForm.getMemo());
            pmEntity.setRemarks(reqInputForm.getRemarks());
            pmEntity.setNo_cr(reqInputForm.getNo_cr());
            pmEntity.setPhase(reqInputForm.getPhase());
            pmEntity.setPic(reqInputForm.getPic());
            pmEntity.setPir(reqInputForm.getPir());
            pmEntity.setPriority(reqInputForm.getPriority());
            pmEntity.setProject_name(reqInputForm.getProject_name());
            pmEntity.setRfc(reqInputForm.getRfc());
            pmEntity.setStatus(reqInputForm.getStatus());
            pmEntity.setTarget_live(reqInputForm.getTarget_live());
            pmEntity.setTest_sript_uat(reqInputForm.getTest_sript_uat());
            pmEntity.setTiket_it_hd(reqInputForm.getTiket_it_hd());
            pmEntity.setUser_name(reqInputForm.getUser_name());
            logger.info("REQ: " + JsonUtils.convertObjectToString(pmEntity));
            pmrepository.save(pmEntity);

            SelectedChannelEntity selectedChannelEntity = new SelectedChannelEntity();
            
            logger.info("Size: " + JsonUtils.convertObjectToString(reqInputForm.getSelectedChannel().size()));
            for (int i = 0; i < reqInputForm.getSelectedChannel().size(); i++) {
                long unixTime2 = System.currentTimeMillis() / 1000L;
                selectedChannelEntity.setId(unixTime2);
                selectedChannelEntity.setApp_id(generateAppId);
                
                selectedChannelEntity.setValue(JsonUtils.convertObjectToString(reqInputForm.getSelectedChannel().get(i)).replace("\"", ""));
                logger.info("REQ Selected: "+ JsonUtils.convertObjectToString(selectedChannelEntity));
                pmSelectedRepository.save(selectedChannelEntity);
                Thread.sleep(1000);
            }

            return new ResponseEntity<>(reqInputForm, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    };



    // get data dari database untuk di tampilin di dashboard
    @GetMapping ("/dbpm/getpm11")
    public List<ResPMDigital> getPM11(){
        return pmdigitalbankingrepo.getPM11();        
    };

    // cuma nyobain get didalemnya ada object lagi
    @GetMapping ("/dbpm/getpm12")
    public List<ResPM> getPM12(){
        List<ResPM> res = new ArrayList<>();
        return res;        
    };

    @GetMapping ("/eform/getpmALL")
    public List<PMEntity> getALLPM(){
        return pmrepository.getALLPM();
    };


    // @DeleteMapping
    @GetMapping ("/eform/deletepm42/{app_id}")
    public String delete(@PathVariable String app_id){
        String res = "99";
        try {
            pmdeleteRepo.findByapp_id(app_id);
            res = "00";    
        } catch (Exception e) {
            System.out.println(e.getMessage());
            res = "68";
        }
        return res;
    };

    // Update untuk abutton
    @PostMapping ("/eform/updateabutton")
    public String update(@RequestBody requpdatebutton requpdatebutton){
        String res = "99";
        try {
            pmupdatebutton.findByapp_id(requpdatebutton.getAbutton(), requpdatebutton.getApp_id());
            res = "00";    
        } catch (Exception e) {
            System.out.println(e.getMessage());
            res = "68";
        }
        return res;
    };

    //update all
    @PostMapping ("/eform/updatepm41")
    public ResponseEntity<PMEntity> updatePM(@RequestBody PMEntity newPMEntity) {
        try {
            return new ResponseEntity<>(pmrepository.save(newPMEntity), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    };
    
    @GetMapping ("/eform/getonepm/{app_id}")
    public List<PMEntity> getwb13(@PathVariable String app_id){
        return pmdigitalbankingrepo.findByapp_id(app_id);
    };
     
}
