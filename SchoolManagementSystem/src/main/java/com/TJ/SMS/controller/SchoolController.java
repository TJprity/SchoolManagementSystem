package com.TJ.SMS.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TJ.SMS.entity.SchoolSession;
import com.TJ.SMS.service.SchoolSessionSvc;


@RestController
@RequestMapping("/api/v1")
public class SchoolController {

	@Autowired
	private SchoolSessionSvc schoolSessionSvc;
	
	@GetMapping("/school-session")
	public List<SchoolSession> getSchoolSession(){
		return schoolSessionSvc.getAll();
	}
	@GetMapping("/school-session/{id}")
	public Optional<SchoolSession> getSchoolSessionById(@PathVariable Long id){
		return schoolSessionSvc.get(id);
	}
	
	@PostMapping("/school-session")
	public SchoolSession addSchoolSession(@RequestBody SchoolSession sclssn) {
		return schoolSessionSvc.add(sclssn);
//		return "new route added"+route;
	}
	
	@DeleteMapping("/school-session/{id}")
	public boolean deleteSchoolSessionById(@PathVariable Long id){
		return schoolSessionSvc.delete(id);
	}
}
