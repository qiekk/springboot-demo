package com.bus.chelaile.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class T_app_version_temp {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = true)
    private String Platform;

    @Column(nullable = true)
    private String app_version;

    @Column(nullable = false)
    private Integer vc;

    @Column(nullable = true)
    private Date online_date;

    public Integer getId() {
        return id;
    }

    public T_app_version_temp() {
        super();
    }

    public T_app_version_temp(String platform, String app_version, Integer vc, Date online_date) {
        super();
        setPlatform(platform);
        this.setApp_version(app_version);
        this.setVc(vc);
        this.setOnline_date(online_date);
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

    public Date getOnline_date() {
        return online_date;
    }

    public void setOnline_date(Date online_date) {
        this.online_date = online_date;
    }

}
