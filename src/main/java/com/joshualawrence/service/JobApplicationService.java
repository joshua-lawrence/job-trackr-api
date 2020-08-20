package com.joshualawrence.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joshualawrence.entity.JobApplication;
import com.joshualawrence.repository.JobApplicationRepository;

@Service
public class JobApplicationService {
	
	@Autowired
	private JobApplicationRepository repository;
	
	public JobApplication saveApplication(JobApplication jobApplication) {
		return repository.save(jobApplication);
	}

	public List<JobApplication> saveApplications(List<JobApplication> jobApplications) {
		return repository.saveAll(jobApplications);
	}
	
	public List<JobApplication> getApplications() {
		return repository.findAll();
	}
	
	public JobApplication getApplicationById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public String deleteJobApplication(int id) {
		repository.deleteById(id);
		return "Job " + id + " removed.";
	}
	
	public JobApplication updateApplication(JobApplication jobApplication) {
		JobApplication existingJobApplication = repository.findById(jobApplication.getId()).orElse(null);
		existingJobApplication.setTitle(jobApplication.getTitle());
		existingJobApplication.setUrl(jobApplication.getUrl());
		return repository.save(existingJobApplication);
	}
	
	
	
}
