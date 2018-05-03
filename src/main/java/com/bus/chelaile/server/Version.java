package com.bus.chelaile.server;

import java.util.List;

import com.bus.chelaile.model.T_app_version_temp;

public interface Version {

    boolean add(T_app_version_temp amodel);
    
    List<T_app_version_temp> getAll();
    
    boolean delete(String platForm, String appVersion);
}
