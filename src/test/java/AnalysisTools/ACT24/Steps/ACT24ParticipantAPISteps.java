package AnalysisTools.ACT24.Steps;

import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import org.testng.Assert;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Base64;

public class ACT24ParticipantAPISteps {

    String baseURL = "https://act24-test.cancer.gov/act24/";
    HttpURLConnection conn;
    String globalPass = "ACT24Research!";

    @Then("the GET call to retrieve participant list is requested and the {int} status code is returned")
    public void the_get_call_to_retrieve_participant_list_is_requested_and_the_status_code_is_returned(int statusCode) throws IOException {
        //base request
        RestAssured.baseURI = baseURL;
        String username = "matakevin";
        String password = globalPass;
        String urlString = baseURL + "studyList/";

        // Create a Url object from the urlString.
        URL url = new URL(urlString);

        // Create a connection.
        conn = (HttpURLConnection) url.openConnection();

        // Set the request type to GET.
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");
        // snippet begins
        conn.setRequestProperty("Authorization",
                "Basic " + Base64.getEncoder().encodeToString(
                        (username + ":" + password).getBytes()
                )
        );
        // Get the response code.
        int responseCode = conn.getResponseCode();
        System.out.println("Sending 'GET' request to URL: " + urlString);
        System.out.println("Response Code: " + responseCode);

        // Read the response.
        InputStream is = conn.getInputStream();
        BufferedReader rd = new BufferedReader(new InputStreamReader(is));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            response.append(line);
            response.append('\r');
        }
        rd.close();
        String responseBody = response.toString().trim();
        // Assert the response body equals the expected value
        String expectedText = "[{\"studyId\":7685,\"studyAbbreviation\":\"A24QAT\",\"studyName\":\"ACT24 QA Test\",\"studyStartDate\":\"01/01/2023\",\"studyEndDate\":\"12/31/2024\",\"numberExpectedParticipants\":100000,\"numberExpectedRecallsPerParticipant\":10000},{\"studyId\":7691,\"studyAbbreviation\":\"KTS17\",\"studyName\":\"Kevin's Study\",\"studyStartDate\":\"01/01/2023\",\"studyEndDate\":\"01/01/2024\",\"numberExpectedParticipants\":17,\"numberExpectedRecallsPerParticipant\":1},{\"studyId\":7692,\"studyAbbreviation\":\"A24TTS\",\"studyName\":\"studyTestName\",\"studyStartDate\":\"01/01/2023\",\"studyEndDate\":\"12/31/2023\",\"numberExpectedParticipants\":10,\"numberExpectedRecallsPerParticipant\":1},{\"studyId\":7693,\"studyAbbreviation\":\"LT4000\",\"studyName\":\"Load Test 4000\",\"studyStartDate\":\"01/01/2023\",\"studyEndDate\":\"12/31/2023\",\"numberExpectedParticipants\":4000,\"numberExpectedRecallsPerParticipant\":2},{\"studyId\":7694,\"studyAbbreviation\":\"4KNAPS\",\"studyName\":\"4000NameAndPasswordStudy\",\"studyStartDate\":\"01/01/2023\",\"studyEndDate\":\"12/31/2024\",\"numberExpectedParticipants\":5000,\"numberExpectedRecallsPerParticipant\":30},{\"studyId\":7695,\"studyAbbreviation\":\"AT2205\",\"studyName\":\"Kevin's Study\",\"studyStartDate\":\"01/01/2023\",\"studyEndDate\":\"01/01/2024\",\"numberExpectedParticipants\":17,\"numberExpectedRecallsPerParticipant\":1}]";
        Assert.assertEquals(responseBody, expectedText);
        Assert.assertEquals(conn.getResponseCode(),statusCode);
        // Finally, disconnect the connection.
        conn.disconnect();
    }

    @Then("the Study and Recall Data and {int} status code is returned")
    public void the_study_and_recall_data_and_status_code_is_returned(int statusCode) throws IOException {

        //base request
        RestAssured.baseURI = baseURL;
        String username = "matakevin";
        String password = globalPass;
        String urlString = baseURL + "participantList/7685/";

        // Create a Url object from the urlString.
        URL url = new URL(urlString);

        // Create a connection.
        conn = (HttpURLConnection) url.openConnection();

        // Set the request type to GET.
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");
        // snippet begins
        conn.setRequestProperty("Authorization",
                "Basic " + Base64.getEncoder().encodeToString(
                        (username + ":" + password).getBytes()
                )
        );
        // Get the response code.
        int responseCode = conn.getResponseCode();
        System.out.println("Sending 'GET' request to URL: " + urlString);
        System.out.println("Response Code: " + responseCode);

        // Read the response.
        InputStream is = conn.getInputStream();
        BufferedReader rd = new BufferedReader(new InputStreamReader(is));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            response.append(line);
            response.append('\r');
        }
        rd.close();
        String responseBody = response.toString().trim();
        String timeStamp = new SimpleDateFormat("MM/dd/yyyy").format(new java.util.Date());
        // Assert the response body equals the expected value
        String expectedText = "[{\"subjectId\":\"1\",\"username\":\"A24QAT1\",\"lastLoginDate\":\""+timeStamp+"\",\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/252cff45-fc47-4a01-a85a-b51056db7315\",\"temporaryPassword\":null},{\"subjectId\":\"10\",\"username\":\"A24QAT10\",\"lastLoginDate\":\"04/23/2024\",\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/553eadc2-2759-4fac-8c3d-06442a7aab1b\",\"temporaryPassword\":null},{\"subjectId\":\"11\",\"username\":\"A24QAT11\",\"lastLoginDate\":null,\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/7c4d4835-54dd-48d3-885b-820188f848d3\",\"temporaryPassword\":null},{\"subjectId\":\"12\",\"username\":\"A24QAT12\",\"lastLoginDate\":null,\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/fe88a1f8-c454-4d7c-aa4a-77751590b6d2\",\"temporaryPassword\":null},{\"subjectId\":\"13\",\"username\":\"A24QAT13\",\"lastLoginDate\":null,\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/4a643299-c962-4368-87b3-0095df3339ab\",\"temporaryPassword\":null},{\"subjectId\":\"14\",\"username\":\"A24QAT14\",\"lastLoginDate\":null,\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/e0ed82a5-7456-4399-b4f2-cdf24afd3684\",\"temporaryPassword\":null},{\"subjectId\":\"15\",\"username\":\"A24QAT15\",\"lastLoginDate\":null,\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/5a600343-e334-4060-8a1b-9a8dad2e9372\",\"temporaryPassword\":null},{\"subjectId\":\"16\",\"username\":\"A24QAT16\",\"lastLoginDate\":null,\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/7047e0d2-f543-4e4c-b8b0-9d60d80a25d9\",\"temporaryPassword\":null},{\"subjectId\":\"17\",\"username\":\"A24QAT17\",\"lastLoginDate\":\"04/15/2024\",\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/ad4e6eb8-1d9c-4739-9945-0309a787e32b\",\"temporaryPassword\":null},{\"subjectId\":\"18\",\"username\":\"A24QAT18\",\"lastLoginDate\":null,\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/36b712ea-09c7-44d6-854f-ec11fe04d090\",\"temporaryPassword\":null},{\"subjectId\":\"19\",\"username\":\"A24QAT19\",\"lastLoginDate\":null,\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/9222360d-4b90-4083-ae54-0231085d661e\",\"temporaryPassword\":null},{\"subjectId\":\"2\",\"username\":\"A24QAT2\",\"lastLoginDate\":\"04/18/2024\",\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/88dfa4f5-2d3c-4f29-9568-b3937eed1faa\",\"temporaryPassword\":null},{\"subjectId\":\"20\",\"username\":\"A24QAT20\",\"lastLoginDate\":null,\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/afaf1b20-0cf8-4160-bd44-0e48660cf929\",\"temporaryPassword\":null},{\"subjectId\":\"21\",\"username\":\"A24QAT21\",\"lastLoginDate\":null,\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/ce604cf6-acaa-45f6-a1c6-2da34abf7fbf\",\"temporaryPassword\":null},{\"subjectId\":\"22\",\"username\":\"A24QAT22\",\"lastLoginDate\":null,\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/10c2e851-78e3-4639-b92e-a0ca75ad041f\",\"temporaryPassword\":null},{\"subjectId\":\"23\",\"username\":\"A24QAT23\",\"lastLoginDate\":null,\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/60c4343a-784a-42a9-87a0-47c23e937f0d\",\"temporaryPassword\":null},{\"subjectId\":\"24\",\"username\":\"A24QAT24\",\"lastLoginDate\":null,\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/47936210-7ed3-46da-b470-8728e8edb9bd\",\"temporaryPassword\":null},{\"subjectId\":\"25\",\"username\":\"A24QAT25\",\"lastLoginDate\":null,\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/3f93842d-d7f2-41d2-8707-779aee287827\",\"temporaryPassword\":null},{\"subjectId\":\"26\",\"username\":\"A24QAT26\",\"lastLoginDate\":null,\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/a0be6881-896e-4c6e-85c0-bb36964836dd\",\"temporaryPassword\":null},{\"subjectId\":\"27\",\"username\":\"A24QAT27\",\"lastLoginDate\":null,\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/bf2a75b4-13ef-4d3d-9b0c-7f120c898ea2\",\"temporaryPassword\":null},{\"subjectId\":\"28\",\"username\":\"A24QAT28\",\"lastLoginDate\":null,\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/fb4d2b3d-1619-4a97-82ad-d068f3a1bfd3\",\"temporaryPassword\":null},{\"subjectId\":\"29\",\"username\":\"A24QAT29\",\"lastLoginDate\":null,\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/b4f2f7f5-67b9-468e-b98f-744951776f02\",\"temporaryPassword\":null},{\"subjectId\":\"3\",\"username\":\"A24QAT3\",\"lastLoginDate\":\"04/15/2024\",\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/131c5c02-67fe-458e-a24c-a62b1152bdb8\",\"temporaryPassword\":null},{\"subjectId\":\"30\",\"username\":\"A24QAT30\",\"lastLoginDate\":null,\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/b60219f7-5eed-440c-ba3f-08ff78ce467f\",\"temporaryPassword\":null},{\"subjectId\":\"4\",\"username\":\"A24QAT4\",\"lastLoginDate\":\"04/25/2024\",\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/ab140e84-ad82-451c-80cb-1bed996f00ff\",\"temporaryPassword\":null},{\"subjectId\":\"5\",\"username\":\"A24QAT5\",\"lastLoginDate\":\"04/25/2024\",\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/823fcd80-579a-4702-8cc5-b29c40719d29\",\"temporaryPassword\":null},{\"subjectId\":\"6\",\"username\":\"A24QAT6\",\"lastLoginDate\":\"04/23/2024\",\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/1a57ad65-a504-42bd-bcfa-9e575b2db4d4\",\"temporaryPassword\":null},{\"subjectId\":\"7\",\"username\":\"A24QAT7\",\"lastLoginDate\":null,\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/51db0a7a-621e-4eda-a0cf-e1de349b7a5e\",\"temporaryPassword\":null},{\"subjectId\":\"8\",\"username\":\"A24QAT8\",\"lastLoginDate\":null,\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/b46dd188-57d1-459d-87e2-2e40db99a27e\",\"temporaryPassword\":null},{\"subjectId\":\"9\",\"username\":\"A24QAT9\",\"lastLoginDate\":\"04/23/2024\",\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/57fa098d-3634-4e40-93e5-758f2d842fab\",\"temporaryPassword\":null}]";
        Assert.assertEquals(responseBody, expectedText);
        Assert.assertEquals(conn.getResponseCode(),statusCode);
        // Finally, disconnect the connection.
        conn.disconnect();
    }

    @Then("the Studys {int} Recall Data and {int} status code is returned")
    public void the_studys_recall_data_and_status_code_is_returned(int studyNumber, int statusCode) throws IOException {
        //base request
        RestAssured.baseURI = baseURL;
        String username = "matakevin";
        String password = globalPass;
        String urlString = baseURL + "participantList/"+studyNumber+"/";

        // Create a Url object from the urlString.
        URL url = new URL(urlString);

        // Create a connection.
        conn = (HttpURLConnection) url.openConnection();

        // Set the request type to GET.
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");
        // snippet begins
        conn.setRequestProperty("Authorization",
                "Basic " + Base64.getEncoder().encodeToString(
                        (username + ":" + password).getBytes()
                )
        );
        // Get the response code.
        int responseCode = conn.getResponseCode();
        System.out.println("Sending 'GET' request to URL: " + urlString);
        System.out.println("Response Code: " + responseCode);

        // Read the response.
        InputStream is = conn.getInputStream();
        BufferedReader rd = new BufferedReader(new InputStreamReader(is));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            response.append(line);
            response.append('\r');
        }
        rd.close();
        String responseBody = response.toString().trim();
        System.out.println(responseBody);
        // Assert the response body equals the expected value
        String expectedText = "[{\"subjectId\":\"1\",\"username\":\"A24TTS1\",\"lastLoginDate\":\"05/22/2024\",\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/5ee1e27f-ac57-469b-8e61-3f1569430efb\",\"temporaryPassword\":null},{\"subjectId\":\"10\",\"username\":\"A24TTS10\",\"lastLoginDate\":null,\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/fadf086b-eda2-4ae5-8698-0d99d414dc95\",\"temporaryPassword\":null},{\"subjectId\":\"2\",\"username\":\"A24TTS2\",\"lastLoginDate\":null,\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/a6ffb440-3cd3-462e-84ab-4fcae80f6a3d\",\"temporaryPassword\":null},{\"subjectId\":\"3\",\"username\":\"A24TTS3\",\"lastLoginDate\":null,\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/34142cd4-96ec-4479-ac9a-450a3285d59e\",\"temporaryPassword\":null},{\"subjectId\":\"4\",\"username\":\"A24TTS4\",\"lastLoginDate\":null,\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/a07ea035-f65f-4cad-a6fd-fb3da0a50a46\",\"temporaryPassword\":null},{\"subjectId\":\"5\",\"username\":\"A24TTS5\",\"lastLoginDate\":null,\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/f7af49a8-16df-41a9-8456-def95027efbb\",\"temporaryPassword\":null},{\"subjectId\":\"6\",\"username\":\"A24TTS6\",\"lastLoginDate\":null,\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/c90537fc-13c7-426e-aa0d-83b858b703e9\",\"temporaryPassword\":null},{\"subjectId\":\"7\",\"username\":\"A24TTS7\",\"lastLoginDate\":null,\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/d35621be-de29-40e0-9501-97945ccf7d99\",\"temporaryPassword\":null},{\"subjectId\":\"8\",\"username\":\"A24TTS8\",\"lastLoginDate\":null,\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/b224a615-01f0-4531-83d9-3e1239f769f7\",\"temporaryPassword\":null},{\"subjectId\":\"9\",\"username\":\"A24TTS9\",\"lastLoginDate\":null,\"URL\":\"https://act24-test.cancer.gov/act24/participant/id/a256c351-719f-4c55-9f33-17a1f6626adf\",\"temporaryPassword\":null}]";
        Assert.assertEquals(responseBody, expectedText);
        Assert.assertEquals(conn.getResponseCode(),statusCode);
        // Finally, disconnect the connection.
        conn.disconnect();
    }

    @Then("the Study {int} Recall Data and {int} status code is returned")
    public void the_study_recall_data_and_status_code_is_returned(int studyNumber, int statusCode) throws IOException {
        //base request
        RestAssured.baseURI = baseURL;
        String username = "matakevin";
        String password = globalPass;
        String urlString = baseURL + "participantList/" + studyNumber + "/";

        // Create a Url object from the urlString.
        URL url = new URL(urlString);

        // Create a connection.
        conn = (HttpURLConnection) url.openConnection();

        // Set the request type to GET.
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");
        // snippet begins
        conn.setRequestProperty("Authorization",
                "Basic " + Base64.getEncoder().encodeToString(
                        (username + ":" + password).getBytes()
                )
        );
        // Get the response code.
        int responseCode = conn.getResponseCode();
        System.out.println("Sending 'GET' request to URL: " + urlString);
        System.out.println("Response Code: " + responseCode);

        // Read the response.
        InputStream is = conn.getInputStream();
        BufferedReader rd = new BufferedReader(new InputStreamReader(is));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            response.append(line);
            response.append('\r');
        }
        rd.close();
        String responseBody = response.toString().trim();
        System.out.println(responseBody);
        // Assert the response body equals the expected value
        String expectedText = "[]";
        Assert.assertEquals(responseBody, expectedText);
        Assert.assertEquals(conn.getResponseCode(), statusCode);
        // Finally, disconnect the connection.
        conn.disconnect();
    }

    @Then("the selected participants {string} with specified StudyIDs are returned with status code {int}")
    public void the_selected_participants_with_specified_study_i_ds_are_returned_with_status_code(String studyID, int statusCode) throws IOException{
        //base request
        RestAssured.baseURI = baseURL;
        String username = "matakevin";
        String password = globalPass;
        String urlString = baseURL + "summaryReportQC/"+studyID+"/";

        // Create a Url object from the urlString.
        URL url = new URL(urlString);

        // Create a connection.
        conn = (HttpURLConnection) url.openConnection();

        // Set the request type to GET.
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");
        // snippet begins
        conn.setRequestProperty("Authorization",
                "Basic " + Base64.getEncoder().encodeToString(
                        (username + ":" + password).getBytes()
                )
        );
        // Get the response code.
        int responseCode = conn.getResponseCode();
        System.out.println("Sending 'GET' request to URL: " + urlString);
        System.out.println("Response Code: " + responseCode);

        // Read the response.
        InputStream is = conn.getInputStream();
        BufferedReader rd = new BufferedReader(new InputStreamReader(is));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            response.append(line);
            response.append('\r');
        }
        rd.close();
        String responseBody = response.toString().trim();
        // Assert the response body equals the expected value
        Assert.assertEquals(conn.getResponseCode(),statusCode);
        // Finally, disconnect the connection.
        conn.disconnect();
    }

    @Then("the selected participants with specified StudyID {string} detailed reports are returned with status code {int}")
    public void the_selected_participants_with_specified_study_id_detailed_reports_are_returned_with_status_code(String studyID, int statusCode) throws IOException{
        //base request
        RestAssured.baseURI = baseURL;
        String username = "matakevin";
        String password = globalPass;
        String urlString = baseURL + "detailReportQC/"+studyID+"/";

        // Create a Url object from the urlString.
        URL url = new URL(urlString);

        // Create a connection.
        conn = (HttpURLConnection) url.openConnection();

        // Set the request type to GET.
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");
        // snippet begins
        conn.setRequestProperty("Authorization",
                "Basic " + Base64.getEncoder().encodeToString(
                        (username + ":" + password).getBytes()
                )
        );
        // Get the response code.
        int responseCode = conn.getResponseCode();
        System.out.println("Sending 'GET' request to URL: " + urlString);
        System.out.println("Response Code: " + responseCode);

        // Read the response.
        InputStream is = conn.getInputStream();
        BufferedReader rd = new BufferedReader(new InputStreamReader(is));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            response.append(line);
            response.append('\r');
        }
        rd.close();
        String responseBody = response.toString().trim();
        // Assert the response body equals the expected value
        String expectedText = "[{\"subjectId\":\"1\",\"studyId\":7692,\"studyLastUpdatedDate\":\"03/25/2024\",\"studyAbbreviation\":\"A24TTS\",\"username\":\"A24TTS1\",\"recallId\":24684,\"recallSeqNo\":1,\"recallDate\":\"05/21/2024\",\"reportingDate\":\"05/22/2024\",\"category\":null,\"activity\":null,\"activityNum\":null,\"activitySeqnum\":null,\"activityStartTime\":\"\",\"activityEndTime\":\"\",\"duration\":null,\"metSleep\":null,\"metSedentary\":null,\"metActive\":null,\"percentSedentary\":null,\"percentActive\":null,\"behaviorClassification\":null,\"intensityLevel\":null,\"otherActivity\":null,\"otherActivityPosture\":null,\"otherActivityIntensity\":null,\"transportationPurposeOtherText\":null,\"transportationOtherPosture\":null,\"transportationOtherIntensity\":null,\"transportationPurposeCommuteWork\":null,\"transportationPurposeCommuteSchool\":null,\"transportationPurposeDropOffPickUp\":null,\"transportationPurposeToGoHome\":null,\"transportationPurposeShopErrandAppt\":null,\"transportationPurposeVisitFriendsFamily\":null,\"transportationPurposeEatSocialize\":null,\"transportationPurposeToFromCarBikePublicTranss\":null,\"transportationPurposeOther\":null,\"exerciseWalkDist\":null,\"exerciseWalkDistUnit\":null,\"exerciseRPE\":null,\"exerciseWhereHome\":null,\"exerciseWhereNeighborhood\":null,\"exerciseWhereGymFitnessCenter\":null,\"exerciseWhereSportsFieldCourt\":null,\"exerciseWhereAtWork\":null,\"exerciseWhereMallShoppingCenter\":null,\"exerciseWhereParkTrail\":null,\"exerciseWhereOther\":null,\"exerciseWithAlone\":null,\"exerciseWithSpousePartner\":null,\"exerciseWithYourChildren\":null,\"exerciseWithOtherFamily\":null,\"exerciseWithCoworkers\":null,\"exerciseWithFriends\":null,\"exerciseWithNeighbors\":null,\"exerciseWithAcquaintance\":null,\"exerciseWithOther\":null}]";
        Assert.assertEquals(responseBody, expectedText);
        Assert.assertEquals(conn.getResponseCode(),statusCode);
        // Finally, disconnect the connection.
        conn.disconnect();
    }
}
