package com.bmi.PMDashboard.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dec_pm_dashboard")
public class PMEntity {
    @Id
    // @Column(name = "id", unique = true)
    // @GeneratedValue(strategy = GenerationType.AUTO)
    // private Long id;
    @Column(name = "app_id", unique = true)
    private String app_id;

    @Column(name = "no_cr")
    private String no_cr;

    @Column(name = "abutton")
    private Boolean abutton = false;

    @Column(name = "channel")
    private String channel;
    @Column(name = "project_name")
    private String project_name;
    @Column(name = "business_user")
    private String business_user;
    @Column(name = "priority")
    private String priority;

    @Column(name = "user_name")
    private String user_name;
    @Column(name = "pic")
    private String pic;
    @Column(name = "phase")
    private String phase;
    @Column(name = "status")
    private String status;
    @Column(name = "completion")
    private String completion;

    @Column(name = "target_live")
    private String target_live;
    @Column(name = "remarks")
    private String remarks;
    @Column(name = "tiket_it_hd")
    private String tiket_it_hd;
    @Column(name = "memo")
    private String memo;
    @Column(name = "cr")
    private String cr;

    @Column(name = "cr_date")
    private String cr_date;
    @Column(name = "brd")
    private String brd;
    @Column(name = "fsd")
    private String fsd;
    @Column(name = "test_sript_uat")
    private String test_sript_uat;
    @Column(name = "ba_uat")
    private String ba_uat;
    @Column(name = "doc_release")
    private String doc_release;
    @Column(name = "rfc")
    private String rfc;
    @Column(name = "ba_implementasi")
    private String ba_implementasi;
    @Column(name = "doc_implementasi")
    private String doc_implementasi;
    @Column(name = "pir")
    private String pir;
    @Column(name = "live_date")
    private String live_date;


    public PMEntity() {
    }


    public String getApp_id() {
        return this.app_id;
    }

    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }

    public String getNo_cr() {
        return this.no_cr;
    }

    public void setNo_cr(String no_cr) {
        this.no_cr = no_cr;
    }

    public Boolean isAbutton() {
        return this.abutton;
    }

    public Boolean getAbutton() {
        return this.abutton;
    }

    public void setAbutton(Boolean abutton) {
        this.abutton = abutton;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getProject_name() {
        return this.project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getBusiness_user() {
        return this.business_user;
    }

    public void setBusiness_user(String business_user) {
        this.business_user = business_user;
    }

    public String getPriority() {
        return this.priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getUser_name() {
        return this.user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPic() {
        return this.pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getPhase() {
        return this.phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCompletion() {
        return this.completion;
    }

    public void setCompletion(String completion) {
        this.completion = completion;
    }

    public String getTarget_live() {
        return this.target_live;
    }

    public void setTarget_live(String target_live) {
        this.target_live = target_live;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getTiket_it_hd() {
        return this.tiket_it_hd;
    }

    public void setTiket_it_hd(String tiket_it_hd) {
        this.tiket_it_hd = tiket_it_hd;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getCr() {
        return this.cr;
    }

    public void setCr(String cr) {
        this.cr = cr;
    }

    public String getCr_date() {
        return this.cr_date;
    }

    public void setCr_date(String cr_date) {
        this.cr_date = cr_date;
    }

    public String getBrd() {
        return this.brd;
    }

    public void setBrd(String brd) {
        this.brd = brd;
    }

    public String getFsd() {
        return this.fsd;
    }

    public void setFsd(String fsd) {
        this.fsd = fsd;
    }

    public String getTest_sript_uat() {
        return this.test_sript_uat;
    }

    public void setTest_sript_uat(String test_sript_uat) {
        this.test_sript_uat = test_sript_uat;
    }

    public String getBa_uat() {
        return this.ba_uat;
    }

    public void setBa_uat(String ba_uat) {
        this.ba_uat = ba_uat;
    }

    public String getDoc_release() {
        return this.doc_release;
    }

    public void setDoc_release(String doc_release) {
        this.doc_release = doc_release;
    }

    public String getRfc() {
        return this.rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getBa_implementasi() {
        return this.ba_implementasi;
    }

    public void setBa_implementasi(String ba_implementasi) {
        this.ba_implementasi = ba_implementasi;
    }

    public String getDoc_implementasi() {
        return this.doc_implementasi;
    }

    public void setDoc_implementasi(String doc_implementasi) {
        this.doc_implementasi = doc_implementasi;
    }

    public String getPir() {
        return this.pir;
    }

    public void setPir(String pir) {
        this.pir = pir;
    }

    public String getLive_date() {
        return this.live_date;
    }

    public void setLive_date(String live_date) {
        this.live_date = live_date;
    }


    public PMEntity(String app_id, String no_cr, Boolean abutton, String channel, String project_name, String business_user, String priority, String user_name, String pic, String phase, String status, String completion, String target_live, String remarks, String tiket_it_hd, String memo, String cr, String cr_date, String brd, String fsd, String test_sript_uat, String ba_uat, String doc_release, String rfc, String ba_implementasi, String doc_implementasi, String pir, String live_date) {
        this.app_id = app_id;
        this.no_cr = no_cr;
        this.abutton = abutton;
        this.channel = channel;
        this.project_name = project_name;
        this.business_user = business_user;
        this.priority = priority;
        this.user_name = user_name;
        this.pic = pic;
        this.phase = phase;
        this.status = status;
        this.completion = completion;
        this.target_live = target_live;
        this.remarks = remarks;
        this.tiket_it_hd = tiket_it_hd;
        this.memo = memo;
        this.cr = cr;
        this.cr_date = cr_date;
        this.brd = brd;
        this.fsd = fsd;
        this.test_sript_uat = test_sript_uat;
        this.ba_uat = ba_uat;
        this.doc_release = doc_release;
        this.rfc = rfc;
        this.ba_implementasi = ba_implementasi;
        this.doc_implementasi = doc_implementasi;
        this.pir = pir;
        this.live_date = live_date;
    }



    @Override
    public String toString() {
        return "{" +
            " app_id='" + getApp_id() + "'" +
            ", no_cr='" + getNo_cr() + "'" +
            ", abutton='" + isAbutton() + "'" +
            ", channel='" + getChannel() + "'" +
            ", project_name='" + getProject_name() + "'" +
            ", business_user='" + getBusiness_user() + "'" +
            ", priority='" + getPriority() + "'" +
            ", user_name='" + getUser_name() + "'" +
            ", pic='" + getPic() + "'" +
            ", phase='" + getPhase() + "'" +
            ", status='" + getStatus() + "'" +
            ", completion='" + getCompletion() + "'" +
            ", target_live='" + getTarget_live() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", tiket_it_hd='" + getTiket_it_hd() + "'" +
            ", memo='" + getMemo() + "'" +
            ", cr='" + getCr() + "'" +
            ", cr_date='" + getCr_date() + "'" +
            ", brd='" + getBrd() + "'" +
            ", fsd='" + getFsd() + "'" +
            ", test_sript_uat='" + getTest_sript_uat() + "'" +
            ", ba_uat='" + getBa_uat() + "'" +
            ", doc_release='" + getDoc_release() + "'" +
            ", rfc='" + getRfc() + "'" +
            ", ba_implementasi='" + getBa_implementasi() + "'" +
            ", doc_implementasi='" + getDoc_implementasi() + "'" +
            ", pir='" + getPir() + "'" +
            ", live_date='" + getLive_date() + "'" +
            "}";
    }



}
