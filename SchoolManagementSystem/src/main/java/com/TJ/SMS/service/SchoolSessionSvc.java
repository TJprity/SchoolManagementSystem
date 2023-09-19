package com.TJ.SMS.service;

import java.util.List;
import java.util.Optional;

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
	public Optional<SchoolSession> get(Long id){
		return schoolSessionRepo.findById(id);
	}
	
	public SchoolSession add(@RequestBody SchoolSession sclssn) {
		return schoolSessionRepo.save(sclssn);
	}
	
	public boolean delete(Long id){
		boolean sts=true;
		if(schoolSessionRepo.findById(id).isEmpty()) {sts=false;}
		schoolSessionRepo.deleteById(id);
		return sts;
	}
}
