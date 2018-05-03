package com.bus.chelaile.server.version;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.chelaile.mapper.dao.AmodelRepository;
import com.bus.chelaile.model.T_app_version_temp;
import com.bus.chelaile.server.Version;

@Service
public class AppVersionService implements Version {
    
    @Autowired
    AmodelRepository amodelRepository;
    
    @Override
    public boolean add(T_app_version_temp amodel) {
        amodelRepository.save(amodel);
        return true;
    }

    @Override
    public List<T_app_version_temp> getAll() {
        
        return null;
    }

    @Override
    public boolean delete(String platForm, String appVersion) {
        
        return false;
    }

}
