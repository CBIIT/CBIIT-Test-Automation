package AnalysisTools.LDLink.Steps;

import appsCommon.PageInitializers.PageInitializer;
import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.*;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

public class LDLinkAPIAccessSteps extends PageInitializer {

    String baseURL = "https://ldlink-qa.nih.gov/LDlinkRest/";
    String qaToken = "21fa1179edd3";
    Response res;

    @When("the POST requests for LDExpress is sent")
    public void the_POST_requests_for_ld_express_is_sent() {

    }
    @Then("the {int} status is returned for LDExpress")
    public void the_status_is_returned_for_ld_express(int statusCode) {

    }

    @When("the GET requests for LDHap is sent")
    public void the_get_requests_for_ld_hap_is_sent() {
        //base request
        RestAssured.baseURI = baseURL;
        RequestSpecification httpRequest = RestAssured.given();
        res = httpRequest.get("ldhap?snps=rs3&pop=ALL&genome_build=grch38&token="+qaToken);
    }

    @Then("the {int} status is returned for LDHap")
    public void the_status_is_returned_for_ld_hap(int statusCode) {
        //retrieve body of response
        ResponseBody body = res.getBody();
        //return body as string
        String bodyAsString = body.asString();
        System.out.println(bodyAsString);
        Assert.assertEquals(bodyAsString.contains("RS_Number\tPosition (hg38)\tAllele Frequency\n" +
                "rs3\tchr13:31872705\tC=0.906, T=0.094"),true,"Response body contains chr13:31872705");
        int appStatusCode = (res.getStatusCode());
        System.out.println(appStatusCode);
        Assert.assertEquals(appStatusCode, statusCode);
    }

    /* SOME ISSUE WITH THE RS NUMBER PARAMS NOT BEING ACCEPTED AS MULTIPLE VALUES -- WILL LOOK INTO */
    @When("the GET requests for LDMatrix is sent")
    public void the_get_requests_for_ld_matrix_is_sent() {
        //base request
        RestAssured.baseURI = baseURL;
        RequestSpecification httpRequest = RestAssured.given();
        res = httpRequest.get("ldmatrix?snps1=rs3&snps2=rs4&snps3=rs148890987&pop=CEU&r2_d=d&genome_build=grch38_high_coverage&token="+qaToken);
        System.out.println(res.asString());
    }
    @Then("the {int} status is returned for LDMatrix GET call")
    public void the_status_is_returned_for_ld_matrix_get_call(int statusCode) {
        //retrieve body of response
        ResponseBody body = res.getBody();
        //return body as string
        String bodyAsString = body.asString();
        System.out.println(bodyAsString);
        //asserting get status code should equal 200
        int appStatusCode = (res.getStatusCode());
        System.out.println(appStatusCode);
        Assert.assertEquals(appStatusCode, statusCode);
    }

    @When("the POST requests for LDMatrix is sent")
    public void the_post_requests_for_ld_matrix_is_sent() {
    }

    @Then("the {int} status is returned for LDMatrix POST call")
    public void the_status_is_returned_for_ld_matrix_post_call(int statusCode) {
    }

    @When("the GET requests for LDPair is sent")
    public void the_get_requests_for_ld_pair_is_sent() {
        RestAssured.baseURI = baseURL;
        RequestSpecification httpRequest = RestAssured.given();
        res = httpRequest.get("ldpair?var1=rs3&var2=rs4&pop=CEU&genome_build=grch37&json_out=false&token="+qaToken);
        System.out.println(res.asString());
    }
    @Then("the {int} status is returned for LDPair GET call")
    public void the_status_is_returned_for_ld_pair_get_call(int statusCode) {
        //retrieve body of response
        ResponseBody body = res.getBody();
        //return body as string
        String bodyAsString = body.asString();
        System.out.println(bodyAsString);
        Assert.assertEquals(bodyAsString.contains("Query SNPs:\n" +
                "rs3 (chr13:32446842)\n" +
                "rs4 (chr13:32447222)\n" +
                "\n" +
                "CEU Haplotypes:\n" +
                "               rs4\n" +
                "               A       G\n" +
                "             -----------------\n" +
                "           C | 183   | 0     | 183   (0.924)\n" +
                "rs3          -----------------\n" +
                "           T | 0     | 15    | 15    (0.076)\n" +
                "             -----------------\n" +
                "               183     15      198\n" +
                "              (0.924) (0.076)\n" +
                "\n" +
                "          C_A: 183 (0.924)\n" +
                "          T_G: 15 (0.076)\n" +
                "          C_G: 0 (0.0)\n" +
                "          T_A: 0 (0.0)\n" +
                "\n" +
                "          D': 1.0\n" +
                "          R2: 1.0\n" +
                "      Chi-sq: 198.0\n" +
                "     p-value: <0.0001\n" +
                "\n" +
                "rs3(C) allele is correlated with rs4(A) allele\n" +
                "rs3(T) allele is correlated with rs4(G) allele"),true,"Response body contains chr13:32446842");
        int appStatusCode = (res.getStatusCode());
        System.out.println(appStatusCode);
        Assert.assertEquals(appStatusCode, statusCode);
    }

    @When("the POST requests for LDPair is sent")
    public void the_post_requests_for_ld_pair_is_sent() {
    }

    @Then("the {int} status is returned for LDPair POST call")
    public void the_status_is_returned_for_ld_pair_post_call(int statusCode) {
    }

    @When("the GET requests for LDPop is sent")
    public void the_get_requests_for_ld_pop_is_sent() {
    }
    @Then("the {int} status is returned for LDPop")
    public void the_status_is_returned_for_ld_pop(int statusCode) {
    }

    @When("the GET requests for LDProxy is sent")
    public void the_get_requests_for_ld_proxy_is_sent() {
    }
    @Then("the {int} status is returned for LDProxy")
    public void the_status_is_returned_for_ld_proxy(int statusCode) {
    }

    @When("the POST requests for SNPChip is sent")
    public void the_post_requests_for_snp_chip_is_sent() {
    }
    @Then("the {int} status is returned for SNPChip")
    public void the_status_is_returned_for_snp_chip(int statusCode) {
    }

    @When("the POST requests for SNPClip is sent")
    public void the_post_requests_for_snp_clip_is_sent() {
    }
    @Then("the {int} status is returned for SNPClip")
    public void the_status_is_returned_for_snp_clip(int statusCode) {
    }
}