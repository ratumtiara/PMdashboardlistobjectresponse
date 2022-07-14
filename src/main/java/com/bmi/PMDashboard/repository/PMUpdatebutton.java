package com.bmi.PMDashboard.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.bmi.PMDashboard.entity.PMEntity;
public interface PMUpdatebutton extends JpaRepository <PMEntity,Long> {
    @Transactional
    @Modifying
    @Query (value= " update dec_pm_dashboard set abutton = ?1 where app_id = ?2 ",nativeQuery = true)
    int findByapp_id(Boolean abutton, String app_id);
}
