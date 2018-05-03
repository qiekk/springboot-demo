package com.bus.chelaile.demo.web.controller.version;

public class VersionModel {
    private Integer id;

    private String Platform;

    private String app_version;

    private Integer vc;

    private String online_date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlatform() {
        return Platform;
    }

    public void setPlatform(String platform) {
        Platform = platform;
    }

    public String getApp_version() {
        return app_version;
    }

    public void setApp_version(String app_version) {
        this.app_version = app_version;
    }

    public Integer getVc() {
        return vc;
    }

    public void setVc(Integer vc) {
        this.vc = vc;
    }

    public String getOnline_date() {
        return online_date;
    }

    public void setOnline_date(String online_date) {
        this.online_date = online_date;
    }
}
