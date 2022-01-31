package com.api.facebookclonebackend.service;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.facebookclonebackend.entity.Post;
import com.api.facebookclonebackend.repository.PostRepository;
@Service
public class PostService {
	@Autowired
	PostRepository postRepo;
	
	public ArrayList<Post> submitPostToDB(Post postData){
		Date date = new Date();
		long time = date.getTime();
		Timestamp datetime = new Timestamp(time);
		
		postData.setPostID(UUID.randomUUID());
		postData.setLikes(0);
		postData.setDateTime(datetime);
		postRepo.save(postData);
		ArrayList<Post> result=retrivePostFromDB();
		return result;
	}
	
	
	public ArrayList<Post> retrivePostFromDB(){
		ArrayList<Post> result=postRepo.findAll();
		return result;
	}
	
	public ArrayList<Post> deletePostFromDB(UUID postID){
		postRepo.deleteById(postID);
		
		ArrayList<Post> result=retrivePostFromDB();
		return result;
	}
	
	
}
