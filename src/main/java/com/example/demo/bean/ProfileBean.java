package com.example.demo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProfileBean {
	
	@Value("${profile.id:0}")
	private int profileId;
	
	@Value("${profile.name:default profile}")
	private String profileName;

	public int getProfileId() {
		return profileId;
	}

	public String getProfileName() {
		return profileName;
	}
	
}
