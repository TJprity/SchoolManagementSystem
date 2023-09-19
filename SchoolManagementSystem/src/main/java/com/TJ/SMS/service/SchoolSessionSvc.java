package com.TJ.SMS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.TJ.SMS.entity.SchoolSession;
import com.TJ.SMS.repo.SchoolSessionRepo;

@Service
public class SchoolSessionSvc {

	@Autowired
	private SchoolSessionRepo schoolSessionRepo;
	
	public List<SchoolSession> getAll(){
		return schoolSessionRepo.findAll();
	}
	
	public SchoolSession add(@RequestBody SchoolSession sclssn) {
		return schoolSessionRepo.save(sclssn);
	}
	
}
