package com.api.facebookclonebackend.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.facebookclonebackend.entity.Status;
import com.api.facebookclonebackend.repository.StatusRepository;

@Service
public class StatusService {

	@Autowired
	StatusRepository statusrepository;
  
	public Status saveStatus(Status status) {
		Date date =new Date();
		long time =date.getTime();
		Timestamp uploadtime= new Timestamp(time);
		
		status.setStatusID(UUID.randomUUID());
		status.setUploadtime(uploadtime);
		return statusrepository.save(status);
	}

	public ArrayList<Status> getStatus(){
		ArrayList<Status> result=new ArrayList<Status>();
		result=statusrepository.findAll();
		result.sort((e1, e2) -> e2.getUploadtime().compareTo(e1.getUploadtime()));
		return result;
	}
}
