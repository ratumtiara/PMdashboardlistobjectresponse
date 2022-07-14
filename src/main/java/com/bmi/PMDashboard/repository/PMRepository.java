package com.bmi.PMDashboard.repository;

import com.bmi.PMDashboard.entity.PMEntity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PMRepository extends JpaRepository <PMEntity, Long>  {
    @Query (value= " select * from dec_pm_dashboard "
    ,nativeQuery = true)
    List<PMEntity> getALLPM();
}
