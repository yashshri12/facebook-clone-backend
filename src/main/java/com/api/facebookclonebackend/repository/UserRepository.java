package com.api.facebookclonebackend.repository;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.api.facebookclonebackend.entity.User;

@Repository
public interface UserRepository extends CassandraRepository<User, String> {
	User save(User user);
	ArrayList<User> findAll();
	User findAllByuserID(String userID);
}
