package com.nci.automation.services;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class RestApiHelper {
	String baseUri = null;
	String resourceUrl = null;
	Response response;
	

	public RestApiHelper(String baseUri) {
		this.baseUri = baseUri;
	}
	
	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}
	
	public int getResponseCode() {
		return response.statusCode();
	}
	
	public ResponseBody getResponseBody() {
		return response.body();
		
	}
	
	public Response getRequest() {
		RestAssured.baseURI = baseUri;
		RequestSpecification requestSpec = RestAssured.given(); 
		response = requestSpec.request(Method.GET, resourceUrl);
		return response;
	}
	
	public Response getRequest(String userAgent , String browserVersion) {
		RestAssured.baseURI = baseUri;
		RequestSpecification requestSpec = RestAssured.given(); 
		Map<String, String> headers = new HashMap<String, String>();
		headers.put(userAgent, browserVersion);
		requestSpec.headers(headers);
		response = requestSpec.request(Method.GET, resourceUrl);
		return response;
		
	}
	
	public Response getRequestWithHeader(String headerKey, String headerValue) {
		RestAssured.baseURI = baseUri;
		RequestSpecification requestSpec = RestAssured.given(); 
		Map<String, String> headers = new HashMap<String, String>();
		headers.put(headerKey, headerValue);
		requestSpec.headers(headers);
		response = requestSpec.request(Method.GET, resourceUrl);
		return response;
	}
	
	public Response getRequestWithMultipleHeaders(String[] headerKey, String [] headerValue) {
		RestAssured.baseURI = baseUri;
		RequestSpecification requestSpec = RestAssured.given(); 
		Map<String, String> headers = new HashMap<String, String>();
		for(int i = 0; i < headerKey.length ; i++) {
			headers.put(headerKey[i], headerValue[i]);
		}
		requestSpec.headers(headers);
		response = requestSpec.request(Method.GET, resourceUrl);
		return response;
	}
	
	public Response getRequestByChromeVersion86() {
		RestAssured.baseURI = baseUri;
		RequestSpecification requestSpec = RestAssured.given(); 
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("user-agent", "Chrome/86.0.4240.111");
		requestSpec.headers(headers);
		response = requestSpec.request(Method.GET, resourceUrl);
		return response;
	}
	
	public Response getRequestByMozillaVersion5() {
		RestAssured.baseURI = baseUri;
		RequestSpecification requestSpec = RestAssured.given(); 
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("user-agent", "Mozilla/5.0");
		requestSpec.headers(headers);
		response = requestSpec.request(Method.GET, resourceUrl);
		return response;
	}
	
	public Response getRequestByAppleWebKitVersion537() {
		RestAssured.baseURI = baseUri;
		RequestSpecification requestSpec = RestAssured.given(); 
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("user-agent", "AppleWebKit/537.36 ");
		requestSpec.headers(headers);
		response = requestSpec.request(Method.GET, resourceUrl);
		return response;
	}
	
	public Response getRequestBySafari537() {
		RestAssured.baseURI = baseUri;
		RequestSpecification requestSpec = RestAssured.given(); 
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("user-agent", "Safari/537.3");
		requestSpec.headers(headers);
		response = requestSpec.request(Method.GET, resourceUrl);
		return response;
	}
	
	
	
	
}
