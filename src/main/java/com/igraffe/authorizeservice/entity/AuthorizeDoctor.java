package com.igraffe.authorizeservice.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Setter(AccessLevel.PUBLIC)
//@Getter(AccessLevel.PUBLIC)
@Setter
@Getter
@ToString
@NoArgsConstructor
//@Audited
@Document(collection = "authorize_doctor")
public class AuthorizeDoctor 
//extends Auditable<String> 
{

	@Id
	private long mobileNumber;
	
	private String passCode;
	
	@CreatedDate public LocalDateTime createOn;
    @LastModifiedDate public LocalDateTime modifiedOn;
    @Version public long version;
	
//	@CreatedBy
//    private String createUser;
//
//    @CreatedDate
//    private Date createdDate;
//    
//    @LastModifiedBy
//    private String lastModifiedUser;
//    
//    @LastModifiedDate
//    private Date updateDttm;

	public AuthorizeDoctor(long mobileNumber, String passCode) {
		super();
		this.mobileNumber = mobileNumber;
		this.passCode = passCode;
	}

}
