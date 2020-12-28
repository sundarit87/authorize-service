package com.igraffe.authorizeservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.igraffe.authorizeservice.entity.AuthorizeDoctor;
import com.igraffe.authorizeservice.service.AuthorizeDoctorService;

@RestController
@RequestMapping("/authorizeDoctor")
public class AuthorizeDoctorController {
	
	private AuthorizeDoctorService authorizeDoctorService;

	public AuthorizeDoctorController(AuthorizeDoctorService authorizeDoctorService) {
		this.authorizeDoctorService = authorizeDoctorService;
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public AuthorizeDoctor addAuthorizeDoctors(@RequestBody AuthorizeDoctor authorizeDoctor) {
		return authorizeDoctorService.addAuthorizeDoctors(authorizeDoctor);
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<AuthorizeDoctor> listAuthorizeDoctors() {
		return authorizeDoctorService.listAuthorizeDoctors();
	}
	
	@RequestMapping(value = "/{mobileNumber}", method = RequestMethod.GET)
	public AuthorizeDoctor getAuthorizeDoctor(@PathVariable long mobileNumber) {
		return  authorizeDoctorService.getAuthorizeDoctor(mobileNumber);
	}
}
