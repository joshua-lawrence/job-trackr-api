package com.joshualawrence.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.joshualawrence.entity.JobApplication;
import com.joshualawrence.service.JobApplicationService;

@RestController
public class JobApplicationController {
	
	@Autowired
	private JobApplicationService service;
	
	
	@PostMapping("/addapplication")
	public JobApplication addJobApplication(@RequestBody JobApplication jobApplication) {
		return service.saveApplication(jobApplication);
	}
	
	@PostMapping("/addapplications")
	public List<JobApplication> addJobApplications(@RequestBody List<JobApplication> jobApplications) {
		return service.saveApplications(jobApplications);
	}
	
	@PutMapping("/updateapplication")
	public JobApplication updateJobApplication(@RequestBody JobApplication jobApplication) {
		return service.updateApplication(jobApplication);
	}
	
	@GetMapping("/getallapplications")
	public List<JobApplication> findAllJobApplications() {
		return service.getApplications();
	}
	
	@GetMapping("/getapplication/{id}")
	public JobApplication findJobApplicationById(@PathVariable int id) {
		return service.getApplicationById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		return service.deleteJobApplication(id);
	}
	
	@GetMapping("/test")
	public String test() {
		return "Hello World";
	}
	
	
}
