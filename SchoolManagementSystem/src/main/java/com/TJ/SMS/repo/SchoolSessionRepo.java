package com.TJ.SMS.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TJ.SMS.entity.SchoolSession;

@Repository
public interface SchoolSessionRepo extends JpaRepository<SchoolSession, Long> {

}
