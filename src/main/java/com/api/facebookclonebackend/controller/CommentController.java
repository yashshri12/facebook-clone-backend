package com.api.facebookclonebackend.controller;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.facebookclonebackend.entity.Comment;
import com.api.facebookclonebackend.service.CommentService;

@CrossOrigin
@RestController
@RequestMapping("/api/commentService")
public class CommentController {
 
	@Autowired
	CommentService commentService;
	
	@PostMapping("/save")
	public Comment saveComment(@RequestBody Comment comment) {
		return commentService.saveComment(comment);
	}
	
	@GetMapping("/comments/{postID}")
	public ArrayList<Comment> getComments(@PathVariable("postID") UUID postID){
		return commentService.getAllComment(postID);
	}
	
}
