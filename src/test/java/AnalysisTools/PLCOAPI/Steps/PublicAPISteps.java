package AnalysisTools.PLCOAPI.Steps;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.nci.automation.services.RestApiHelper;
import com.nci.automation.web.CommonUtils;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;


public class PublicAPISteps extends PageInitializer {
	
	RestApiHelper rest;
	
	@Given("user sends GET request for cancer phenotype")
	public void user_sends_GET_request_for_cancer_phenotype() {
		  rest = new RestApiHelper("https://exploregwas-qa.cancer.gov/plco-atlas/api");
		  rest.setResourceUrl("/phenotypes?q=cancer");
		  rest.getRequestByChromeVersion86(); 
	}
	
	@SuppressWarnings("deprecation")
	@Then("user receives response for cancer phenotype")
	public void user_receives_response_for_cancer_phenotype() {
		JsonParser parser = new JsonParser();
		JsonArray res = parser.parse(rest.getResponseBody().asString()).getAsJsonArray();
		String firstID = res.getAsJsonArray().get(0).getAsJsonObject().get("id").getAsString();
//		Assert.assertEquals(, expected, actual);
		
		
	}

}
