package com.bmi.PMDashboard.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bmi.PMDashboard.entity.PMEntity;
import com.bmi.PMDashboard.model.ResPMDigital;

public interface PMDigitalBankingRepo extends JpaRepository <PMEntity,Long> {
    @Query (value= " select channel,project_name,priority,status,pic,cr_date,target_live, remarks,concat(' brd: ',brd,', cr: ',cr,', fsd: ',fsd) as doc_check from dec_pm_dashboard where abutton = true "
    ,nativeQuery = true)
    List<ResPMDigital> getPM11();

    @Query (value= " select * from dec_pm_dashboard where app_id = ?",nativeQuery = true)
    List<PMEntity> findByapp_id(String app_id);
}
