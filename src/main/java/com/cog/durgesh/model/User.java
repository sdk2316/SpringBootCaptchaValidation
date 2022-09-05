package com.cog.durgesh.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Entity
public class User {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String email;
	
	@Transient
	private String captcha;
	
	@Transient
	private String hiddenCaptcha;
	
	@Transient
	private String realCaptcha;
}
