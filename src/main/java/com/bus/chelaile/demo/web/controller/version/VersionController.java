package com.bus.chelaile.demo.web.controller.version;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.bus.chelaile.model.T_app_version_temp;
import com.bus.chelaile.server.version.AppVersionService;

@RestController
public class VersionController {

    @Autowired
    AppVersionService appVersionService;

    @GetMapping(path = "/version/add", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String add(VersionModel version) {
        System.out.println("新增版本： version=" + JSONObject.toJSONString(version));
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        try {
            date = dateFormat.parse(version.getOnline_date());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        T_app_version_temp amodel = new T_app_version_temp( version.getPlatform(), version.getApp_version(),
                version.getVc(), date);
        System.out.println("新增版本： amodel=" + JSONObject.toJSONString(amodel));

        boolean addS = appVersionService.add(amodel);
        if (addS) {
            return "add success! ";
        } else {
            return "add faild!";
        }
    }
}
