package com.nci.automation.utils;

public class SessionIdentifiers {

	private String sessionId;
	private String csrfId;
	
	public SessionIdentifiers(String sessionId, String csrfId) {
		this.sessionId = sessionId;
		this.csrfId = csrfId;
	}
	
	public String getSessionId() {
		return sessionId;
	}
	
	public String getCsrfId() {
		return csrfId;
	}
	
}
