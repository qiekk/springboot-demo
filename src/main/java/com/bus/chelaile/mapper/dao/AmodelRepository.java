package com.bus.chelaile.mapper.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bus.chelaile.model.T_app_version_temp;

public interface AmodelRepository extends JpaRepository<T_app_version_temp, Long> {

//    T_app_version findByApp_version(String app_version);
//
//    T_app_version findByNameAndAge(String app_version, Integer vc);

//    @Query("from t_app_version u where u.app_version=:app_version")
//    T_app_version findT_app_version(@Param("app_version") String app_version);

}
