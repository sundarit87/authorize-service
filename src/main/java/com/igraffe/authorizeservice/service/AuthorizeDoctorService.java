package com.igraffe.authorizeservice.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.igraffe.authorizeservice.entity.AuthorizeDoctor;

public interface AuthorizeDoctorService {
	
	public AuthorizeDoctor addAuthorizeDoctors(@RequestBody AuthorizeDoctor authorizeDoctor);
	
	public List<AuthorizeDoctor> listAuthorizeDoctors();
	
	public AuthorizeDoctor getAuthorizeDoctor(@PathVariable long mobileNumber);

}
