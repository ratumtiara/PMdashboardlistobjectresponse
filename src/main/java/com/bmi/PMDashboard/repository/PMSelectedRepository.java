package com.bmi.PMDashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bmi.PMDashboard.entity.SelectedChannelEntity;

@Repository
public interface PMSelectedRepository extends JpaRepository<SelectedChannelEntity, Long> {

}
