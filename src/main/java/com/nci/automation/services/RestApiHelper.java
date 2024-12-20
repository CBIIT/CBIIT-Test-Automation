package com.nci.automation.services;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class RestApiHelper {
	String baseUri = null;
	String resourceUrl = null;
	Response response;
	static RestApiHelper rest;
	
	public static void main(String[] args) {
		  rest = new RestApiHelper("https://exploregwas-qa.cancer.gov/plco-atlas/api");
		  rest.setResourceUrl("/phenotypes?q=cancer");
		  rest.getRequestByChromeVersion86(); 
		  System.out.println(rest.getResponseBody().asString());
	}
	
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

	/**
	 * Sends a POST request to the specified base URI with a JSON body only.
	 *
	 * @param body
	 */
	public Response postRequestWIthBody(String body) {
		RestAssured.baseURI = baseUri;
		RequestSpecification requestSpec = RestAssured.given();
		requestSpec.body(body);
		response = requestSpec.post(baseUri);
		return response;
	}

	/**
	 * Sends a GET request to the specified base URI.
	 */
	public Response getRequestWithoutResourceUrl() {
		RestAssured.baseURI = baseUri;
		RequestSpecification requestSpec = RestAssured.given();
		response = requestSpec.request(Method.GET);
		return response;
	}

	/**
	 * Sends a POST request to the specified base URI with a JSON body and custom header.
	 *
	 * @param body
	 */
	public Response postRequestWIthBodyAndHeader(String body) {
		RestAssured.baseURI = baseUri;
		RequestSpecification requestSpec = RestAssured.given().headers("content-type","application/json");
		requestSpec.body(body);
		response = requestSpec.post(baseUri);
		return response;
	}

	/**
	 * Sends a POST request to the specified base URI with a file attached as multipart data.
	 *
	 * @param file
	 */
	public Response postRequestWithFile(File file) {
		RestAssured.baseURI = baseUri;
		RequestSpecification requestSpec = RestAssured.given();
		requestSpec.multiPart("files", file);
		response = requestSpec.post(baseUri);
		return response;
	}
}