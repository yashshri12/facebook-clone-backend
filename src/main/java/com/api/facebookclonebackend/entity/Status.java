package com.api.facebookclonebackend.entity;

import java.sql.Timestamp;
import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("Status")
public class Status {

	@PrimaryKey
	private UUID statusID;
	private String userID;
	private String statusImageUrl;
	private Timestamp uploadtime;
	public Status() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Status(UUID statusID, String userID, String statusImageUrl, Timestamp uploadtime) {
		super();
		this.statusID = statusID;
		this.userID = userID;
		this.statusImageUrl = statusImageUrl;
		this.uploadtime = uploadtime;
	}
	public UUID getStatusID() {
		return statusID;
	}
	public void setStatusID(UUID statusID) {
		this.statusID = statusID;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getStatusImageUrl() {
		return statusImageUrl;
	}
	public void setStatusImageUrl(String statusImageUrl) {
		this.statusImageUrl = statusImageUrl;
	}
	public Timestamp getUploadtime() {
		return uploadtime;
	}
	public void setUploadtime(Timestamp uploadtime) {
		this.uploadtime = uploadtime;
	}
	
}
