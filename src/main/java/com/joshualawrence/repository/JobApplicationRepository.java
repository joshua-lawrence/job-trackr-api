package com.joshualawrence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joshualawrence.entity.JobApplication;

public interface JobApplicationRepository extends JpaRepository<JobApplication, Integer> {
}
