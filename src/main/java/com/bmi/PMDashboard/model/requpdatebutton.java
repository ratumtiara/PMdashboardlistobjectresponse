package com.bmi.PMDashboard.model;

public class requpdatebutton {
    private String app_id;
    private Boolean abutton;


    public String getApp_id() {
        return this.app_id;
    }

    public void setApp_id(String app_id) {
        this.app_id = app_id;
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


    public requpdatebutton() {
    }


    public requpdatebutton(String app_id, Boolean abutton) {
        this.app_id = app_id;
        this.abutton = abutton;
    }


    @Override
    public String toString() {
        return "{" +
            " app_id='" + getApp_id() + "'" +
            ", abutton='" + isAbutton() + "'" +
            "}";
    }


}
