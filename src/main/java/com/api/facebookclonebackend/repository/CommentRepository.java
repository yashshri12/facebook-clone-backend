package com.api.facebookclonebackend.repository;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

import com.api.facebookclonebackend.entity.Comment;

public interface CommentRepository extends CassandraRepository<Comment, UUID> {
   Comment save(Comment comment);
	
	@AllowFiltering
	ArrayList<Comment> findAllByPostID(UUID postID);
}
