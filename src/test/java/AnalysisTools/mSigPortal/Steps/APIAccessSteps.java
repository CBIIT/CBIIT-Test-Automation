package AnalysisTools.mSigPortal.Steps;

import java.util.LinkedHashMap;
import org.testng.Assert;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class APIAccessSteps extends PageInitializer {

    LinkedHashMap<String, String> headerValue = new LinkedHashMap<>();

    @Given("user sets api mutational signature data with signature name as SBS One")
    public void userSetsApiMutationalSignatureDataWithSignatureNameAsSBSOne() {
        headerValue.put("source", "Reference_signatures");
        headerValue.put("strategy", "WGS");
        headerValue.put("profile", "SBS");
        headerValue.put("matrix", "96");
        headerValue.put("signatureSetName", "COSMIC_v3_Signatures_GRCh37_SBS96");
        headerValue.put("signatureName", "SBS1");
        headerValue.put("limit", "10");
        headerValue.put("offset", "0");
    }

    @Then("SBS One data is received")
    public void sbsOneDataIsReceived() {
        RestAssured.baseURI = "https://analysistools-qa.cancer.gov/mutational-signatures/";
        String resourceURI = "api/mutational_signature";
        Response response = RestAssured.given().header("accept", "*/*").params(headerValue).get(resourceURI).then()
                .assertThat().log().all().extract().response();
        Assert.assertEquals(response.getStatusCode(), 200);
        ResponseBody responseBody = response.getBody();
        String responseBodyAsString = responseBody.asString();
        Assert.assertEquals(responseBodyAsString.toLowerCase().contains("26474"), true);
        Assert.assertEquals(responseBodyAsString.toLowerCase().contains("26470"), true);
        Assert.assertEquals(responseBodyAsString.toLowerCase().contains("26471"), true);
        Assert.assertEquals(responseBodyAsString.toLowerCase().contains("26472"), true);
        Assert.assertEquals(responseBodyAsString.contains("A[C>A]A"), true);
        Assert.assertEquals(responseBodyAsString.contains("A[C>A]C"), true);
        Assert.assertEquals(responseBodyAsString.contains("A[C>A]G"), true);
        Assert.assertEquals(responseBodyAsString.contains("A[C>A]T"), true);
    }

    @Given("user sets api mutational spectrum with default parameters on API access page")
    public void userSetsApiMutationalSpectrumWithDefaultParametersOnAPIAccessPage() {
        headerValue.put("study", "PCAWG");
        headerValue.put("cancer", "Lung-AdenoCA");
        headerValue.put("strategy", "WGS");
        headerValue.put("sample", "SP50263");
        headerValue.put("profile", "SBS");
        headerValue.put("matrix", "96");
        headerValue.put("limit", "10");
        headerValue.put("offset", "0");
    }

    @Then("mutational spectrum data is received")
    public void mutationalSpectrumDataIsReceived() {
        RestAssured.baseURI = "https://analysistools-qa.cancer.gov/mutational-signatures/";
        String resourceURI = "api/mutational_spectrum";
        Response response = RestAssured.given().header("accept", "*/*").params(headerValue).get(resourceURI).then()
                .assertThat().log().all().extract().response();
        Assert.assertEquals(response.getStatusCode(), 200);
        ResponseBody responseBody = response.getBody();
        String responseBodyAsString = responseBody.asString();
        Assert.assertEquals(responseBodyAsString.toLowerCase().contains("49340801"), true);
        Assert.assertEquals(responseBodyAsString.toLowerCase().contains("49343581"), true);
        Assert.assertEquals(responseBodyAsString.toLowerCase().contains("49346361"), true);
        Assert.assertEquals(responseBodyAsString.toLowerCase().contains("49351921"), true);
        Assert.assertEquals(responseBodyAsString.contains("A[C>A]A"), true);
        Assert.assertEquals(responseBodyAsString.contains("A[C>A]C"), true);
        Assert.assertEquals(responseBodyAsString.contains("A[C>A]G"), true);
        Assert.assertEquals(responseBodyAsString.contains("A[C>A]T"), true);
    }

    @Given("user sets api signature activity with default parameters on API access page")
    public void userSetsApiSignatureActivityWithDefaultParametersOnAPIAccessPage() {
        headerValue.put("study", "PCAWG");
        headerValue.put("strategy", "WGS");
        headerValue.put("signatureSetName", "COSMIC_v3_Signatures_GRCh37_SBS96");
        headerValue.put("limit", "10");
        headerValue.put("offset", "0");
    }

    @Then("signature activity data is received")
    public void signatureActivityDataIsReceived() {
        RestAssured.baseURI = "https://analysistools-qa.cancer.gov/mutational-signatures/";
        String resourceURI = "api/signature_activity";
        Response response = RestAssured.given().header("accept", "*/*").params(headerValue).get(resourceURI).then()
                .assertThat().log().all().extract().response();
        Assert.assertEquals(response.getStatusCode(), 200);
        ResponseBody responseBody = response.getBody();
        String responseBodyAsString = responseBody.asString();
        Assert.assertEquals(responseBodyAsString.toLowerCase().contains("3616221"), true);
        Assert.assertEquals(responseBodyAsString.toLowerCase().contains("3616222"), true);
        Assert.assertEquals(responseBodyAsString.toLowerCase().contains("3616223"), true);
        Assert.assertEquals(responseBodyAsString.toLowerCase().contains("3616224"), true);
    }

    @Given("user sets api signature association with default parameters on API access page")
    public void userSetsApiSignatureAssociationWithDefaultParametersOnAPIAccessPage() {
        headerValue.put("study", "PCAWG");
        headerValue.put("strategy", "WGS");
        headerValue.put("cancer", "Biliary-AdenoCA");
        headerValue.put("limit", "10");
        headerValue.put("offset", "0");
    }

    @Then("signature association data is received")
    public void signatureAssociationDataIsReceived() {
        RestAssured.baseURI = "https://analysistools-qa.cancer.gov/mutational-signatures/";
        String resourceURI = "api/signature_association";
        Response response = RestAssured.given().header("accept", "*/*").params(headerValue).get(resourceURI).then()
                .assertThat().log().all().extract().response();
        Assert.assertEquals(response.getStatusCode(), 200);
        ResponseBody responseBody = response.getBody();
        String responseBodyAsString = responseBody.asString();
        Assert.assertEquals(responseBodyAsString.toLowerCase().contains("1"), true);
        Assert.assertEquals(responseBodyAsString.toLowerCase().contains("2"), true);
        Assert.assertEquals(responseBodyAsString.toLowerCase().contains("3"), true);
        Assert.assertEquals(responseBodyAsString.toLowerCase().contains("4"), true);
    }

    @Given("user sets api ethiology data with default parameters on API access page")
    public void userSetsApiEthiologyDataWithDefaultParametersOnAPIAccessPage() {
        headerValue.put("study", "PCAWG");
        headerValue.put("strategy", "WGS");
        headerValue.put("signatureName", "SBS2");
        headerValue.put("limit", "10");
        headerValue.put("offset", "0");
    }

    @Then("ethiology data is received")
    public void ethiologyDataIsReceived() {
        RestAssured.baseURI = "https://analysistools-qa.cancer.gov/mutational-signatures/";
        String resourceURI = "api/signature_etiology";
        Response response = RestAssured.given().header("accept", "*/*").params(headerValue).get(resourceURI).then()
                .assertThat().log().all().extract().response();
        Assert.assertEquals(response.getStatusCode(), 200);
        ResponseBody responseBody = response.getBody();
        String responseBodyAsString = responseBody.asString();
        Assert.assertEquals(responseBodyAsString.toLowerCase().contains("6813"), true);
        Assert.assertEquals(responseBodyAsString.toLowerCase().contains("6821"), true);
        Assert.assertEquals(responseBodyAsString.toLowerCase().contains("6825"), true);
        Assert.assertEquals(responseBodyAsString.toLowerCase().contains("6830"), true);
    }
}