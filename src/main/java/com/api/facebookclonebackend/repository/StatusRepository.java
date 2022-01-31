package com.api.facebookclonebackend.repository;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.api.facebookclonebackend.entity.Status;

public interface StatusRepository extends CassandraRepository<Status, UUID> {
  Status save(Status status);
  ArrayList<Status> findAll();
}
