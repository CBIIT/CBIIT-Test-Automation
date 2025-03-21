package ANALYSIS_TOOLS.ACT24.stepsImpl;

import ANALYSIS_TOOLS.ACT24.utils.ACT24ApiRequests_Constants;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONArray;
import org.testng.Assert;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static Hooks.Hooks.softAssert;

public class ACT24ApiRequestsStepImpl {

    public static String studyListBaseUrl;
    public static int firstStudyId;
    public static String participantListBaseUrl;
    public static Response response;
    public static int statusCode = 200;
    public static String firstSubjectId;
    public static String studyStartDate;
    public static String formattedStartDate;
    public static String studyEndDate;
    public static String formattedEndDate;
    public static String summaryReportBaseUrl;
    public static String detailReportQCBaseUrl;
    public static String detailReportBaseUrl;

    /**
     * Setting up base url for study list api
     */
    public static void setBaseurlForStudyList() {
        studyListBaseUrl = ACT24ApiRequests_Constants.BASE_URL + ACT24ApiRequests_Constants.STUDY_LIST_ENDPOINT;
    }

    /**
     * Sending request and retrieving the study list
     */
    public static void sendGetRequestForStudyList() {
        response = getRequestWithBodyAndHeader(ACT24ApiRequests_Constants.ACT24_USERNAME, ACT24ApiRequests_Constants.ACT24_PASSWORD, studyListBaseUrl);
        response.prettyPrint();
        String jsonString = response.asString();
        JSONArray jsonArray = new JSONArray(jsonString);
        firstStudyId = jsonArray.getJSONObject(0).getInt("studyId");
        studyStartDate = jsonArray.getJSONObject(0).getString("studyStartDate");
        DateTimeFormatter originalDate = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(studyStartDate, originalDate);
        DateTimeFormatter desiredDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        formattedStartDate = date.format(desiredDate);
        studyEndDate = jsonArray.getJSONObject(0).getString("studyEndDate");
        LocalDate date1 = LocalDate.parse(studyEndDate, originalDate);
        formattedEndDate = date1.format(desiredDate);
        softAssert.assertEquals(response.getStatusCode(), statusCode);
    }

    /**
     * Getting response from get request
     */
    public static Response getRequestWithBodyAndHeader(String username, String password, String baseUri) {
        RestAssured.baseURI = baseUri;
        RequestSpecification requestSpec = RestAssured.given()
                .headers("content-type", "application/json")
                .auth().basic(username, password);
        Response response = requestSpec.get(baseUri);
        return response;
    }

    /**
     * Setting up base url for participant list
     */
    public static void setBaseurlForParticipantList() {
        participantListBaseUrl = ACT24ApiRequests_Constants.BASE_URL + ACT24ApiRequests_Constants.PARTICIPANT_LIST_ENDPOINT + firstStudyId + "/";
        System.out.println(participantListBaseUrl);
    }

    /**
     * Sending request and retrieving the participant list
     */
    public static void sendGetRequestForParticipantList() {
        response = getRequestWithBodyAndHeader(ACT24ApiRequests_Constants.ACT24_USERNAME, ACT24ApiRequests_Constants.ACT24_PASSWORD, participantListBaseUrl);
        response.prettyPrint();
        String jsonString = response.asString();
        JSONArray jsonArray = new JSONArray(jsonString);
        firstSubjectId = jsonArray.getJSONObject(0).getString("subjectId");
        System.out.println(firstSubjectId);
        softAssert.assertEquals(response.getStatusCode(), statusCode);
    }

    /**
     * Setting up base url for QC summary report
     */
    public static void setBaseurlForQCSummaryReport() {
        summaryReportBaseUrl = ACT24ApiRequests_Constants.BASE_URL + "summaryReportQC/" + firstStudyId + "/" + formattedStartDate + "/" + formattedEndDate;
        System.out.println(summaryReportBaseUrl);
    }

    /**
     * Setting up base url for QC summary report
     */
    public static void sendGetRequestForQCSummaryReport() {
        response = getRequestWithBodyAndHeader(ACT24ApiRequests_Constants.ACT24_USERNAME, ACT24ApiRequests_Constants.ACT24_PASSWORD, summaryReportBaseUrl);
        response.prettyPrint();
        softAssert.assertEquals(response.getStatusCode(), statusCode);
    }

    /**
     * Setting up base url for QC detail report
     */
    public static void setBaseurlForQCDetailReport() {
        detailReportQCBaseUrl = ACT24ApiRequests_Constants.BASE_URL + "detailReportQC/" + firstStudyId + "/" + formattedStartDate + "/" + formattedEndDate;
        System.out.println(detailReportQCBaseUrl);
    }

    /**
     * Setting up base url for QC detail report
     */
    public static void sendGetRequestForQCDetailReport() {
        response = getRequestWithBodyAndHeader(ACT24ApiRequests_Constants.ACT24_USERNAME, ACT24ApiRequests_Constants.ACT24_PASSWORD, detailReportQCBaseUrl);
        response.prettyPrint();
        softAssert.assertEquals(response.getStatusCode(), statusCode);
    }

    /**
     * Setting up base url for detail report
     */
    public static void setBaseurlForDetailReport() {
        detailReportBaseUrl = ACT24ApiRequests_Constants.BASE_URL + "detailReport/" + firstStudyId + "/" + formattedStartDate + "/" + formattedEndDate;
        System.out.println(detailReportBaseUrl);
    }

    /**
     * Setting up base url for detail report
     */
    public static void sendGetRequestForDetailReport() {
        response = getRequestWithBodyAndHeader(ACT24ApiRequests_Constants.ACT24_USERNAME, ACT24ApiRequests_Constants.ACT24_PASSWORD, detailReportBaseUrl);
        response.prettyPrint();
        softAssert.assertEquals(response.getStatusCode(), statusCode);
    }
}