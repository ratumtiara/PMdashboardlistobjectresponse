package com.bmi.PMDashboard.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.bmi.PMDashboard.entity.PMEntity;

public interface PMDeleteRepo extends JpaRepository <PMEntity,Long> {
    @Transactional
    @Modifying
    @Query (value= " delete from dec_pm_dashboard where app_id = ? ",nativeQuery = true)
    int findByapp_id(String app_id);
}
