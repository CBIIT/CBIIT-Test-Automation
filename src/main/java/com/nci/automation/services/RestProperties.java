package com.nci.automation.services;

import java.io.Serializable;

public class RestProperties implements Serializable {

	private static final long serialVersionUID = 1L;
	private String restURI;
    private String sessionId;

	public RestProperties() {
	}

	public RestProperties(String uri) {
		this.restURI = uri;
		this.sessionId = "";
	}

    public RestProperties(String uri,String sessionId) {
        this.restURI = uri;
        this.sessionId = sessionId;
    }
	
	public void setRestURI(String restURI) {
		this.restURI = restURI;
	}

	public String getRestURI() {
		return this.restURI;
	}

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionId() {
        return this.sessionId;
    }
    
	public String toString() {
		return new StringBuilder().append("uri=").append(restURI).toString();
	}

}