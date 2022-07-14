package com.bmi.PMDashboard.model;

public class ResPM {
    private String channel;
    private String project_name;
    private String priority;
    private String status;
    private String pic;
    private String cr_date;
    private String target_live;
    private String remarks;
    private ResDocCheckDetail doc_check;

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

    public String getPriority() {
        return this.priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPic() {
        return this.pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getCr_date() {
        return this.cr_date;
    }

    public void setCr_date(String cr_date) {
        this.cr_date = cr_date;
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

    public ResDocCheckDetail getDoc_check() {
        return this.doc_check;
    }

    public void setDoc_check(ResDocCheckDetail doc_check) {
        this.doc_check = doc_check;
    }

}
