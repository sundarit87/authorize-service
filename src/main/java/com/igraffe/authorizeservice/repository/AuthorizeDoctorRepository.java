package com.igraffe.authorizeservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.igraffe.authorizeservice.entity.AuthorizeDoctor;

@Repository
public interface AuthorizeDoctorRepository extends 
MongoRepository<AuthorizeDoctor, Long>{

}
