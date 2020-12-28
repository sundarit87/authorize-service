package com.igraffe.authorizeservice.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.igraffe.authorizeservice.entity.AuthorizeDoctor;
import com.igraffe.authorizeservice.repository.AuthorizeDoctorRepository;
import com.igraffe.authorizeservice.service.AuthorizeDoctorService;
@Service
public class AuthorizeDoctorServiceImpl implements AuthorizeDoctorService{

	private AuthorizeDoctorRepository authorizeDoctorRepository;
	
	
	
	public AuthorizeDoctorServiceImpl(AuthorizeDoctorRepository authorizeDoctorRepository) {
		this.authorizeDoctorRepository = authorizeDoctorRepository;
	}

	@Override
	public AuthorizeDoctor addAuthorizeDoctors(AuthorizeDoctor authorizeDoctor) {
		// TODO Auto-generated method stub
		Optional<AuthorizeDoctor> optionalAuthorizeDoctor = authorizeDoctorRepository.findById(authorizeDoctor.getMobileNumber());
		if(optionalAuthorizeDoctor.isPresent()) {
			AuthorizeDoctor newAuthorizeDoctor = optionalAuthorizeDoctor.get();
			newAuthorizeDoctor.setPassCode(authorizeDoctor.getPassCode());
			return authorizeDoctorRepository.save(newAuthorizeDoctor);
		}
		else {
			return authorizeDoctorRepository.save(authorizeDoctor);
		}
			
	}

	@Override
	public List<AuthorizeDoctor> listAuthorizeDoctors() {
		// TODO Auto-generated method stub
		return authorizeDoctorRepository.findAll();
	}

	@Override
	public AuthorizeDoctor getAuthorizeDoctor(long mobileNumber) {
		Optional<AuthorizeDoctor> authorizeDoctor = authorizeDoctorRepository.findById(mobileNumber);
		return authorizeDoctor.get();
	}

}
