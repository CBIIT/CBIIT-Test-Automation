package AnalysisTools.JPSurv.StepsImplementations;

import io.restassured.path.json.JsonPath;
import org.apache.commons.io.IOUtils;
import org.testng.Assert;
import com.nci.automation.services.RestApiHelper;
import appsCommon.PageInitializers.PageInitializer;
import io.restassured.response.Response;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class JPSurvHomePageStepImp extends PageInitializer {

	public static String zipFilePath = "./src/test/resources/jpsurv-6bce02ba-b041-49df-b453-3cf35d15c6ce.zip";
	static Response response;

	/**
	 * TEST HELPER CLASS OBJECT
	 */
	public static RestApiHelper rest;

	/**
	 * SETTING REST HELP CLASS BASE URL
	 *
	 * @param url
	 */
	public static void setApiBaseUrl(String url) {
		rest = new RestApiHelper(url);
	}

	/**
	 * VERIFY THE RESPONSE IS 200
	 *
	 * @param body
	 */
	public static void sendPostReqestWithBody(String body) {
		response = rest.postRequestWIthBodyAndHeader(body);
		System.out.println(response.getStatusCode());
		response.prettyPrint();
        Assert.assertEquals(response.getStatusCode(), (200));
	}

	/**
	 * VERIFY THE RESPONSE IS 200
	 */
	public static void sendGetRequestForExport() {
		Response response = rest.getRequestWithoutResourceUrl();
		System.out.println(response.getStatusCode());
		response.prettyPrint();
		Assert.assertEquals(response.getStatusCode(), 200);
	}

	/**
	 * VERIFY THE RESPONSE IS 200
	 *
	 * @param body
	 */
	public static void sendPostReqestWithBodyAndHeader(String body) {
		response = rest.postRequestWIthBodyAndHeader(body);
		System.out.println(response.getStatusCode());
		response.prettyPrint();
		Assert.assertEquals(response.getStatusCode(), (200));
	}

	/**
	 * VERIFY THE RESPONSE IS 200
	 */
	public static void sendPostRequestForImport() {
		File file = new File(zipFilePath);
		Response response = rest.postRequestWithFile(file);
		System.out.println(response.getStatusCode());
		response.prettyPrint();
		Assert.assertEquals(response.getStatusCode(), 200);
	}

	/**
	 * SEND REQUEST BODY USING FILE
	 */
	public static void sendPostRequestForSubmit() throws IOException {
		try(FileInputStream inputStream = new FileInputStream("./src/test/resources/submit_body.json")){
			String body = IOUtils.toString(inputStream);
			JPSurvHomePageStepImp.sendPostReqestWithBody(body);
		}
	}

	/**
	 * VALIDATE THE SUBMITTED STATUS IN THE RESPONSE
	 */
	public static void validateSubittedResponse() {
		String jsonString = response.asString();
		String status = JsonPath.from(jsonString).get("status");
		Assert.assertEquals(status, "SUBMITTED");

	}

	/**
	 * VALIDATE THE START AND END YEAR IN THE RESPONSE
	 */
	public static void validateStartAndEndYear() {
		String jsonString = response.asString();
		JsonPath jsonPath = JsonPath.from(jsonString);
		List<List<List<Map<String, Object>>>> dataList = jsonPath.getList("$");

		for (List<List<Map<String, Object>>> outerList : dataList) {
			for (List<Map<String, Object>> innerList : outerList) {
				for (Map<String, Object> innerMap : innerList) {
				int startYear = (int) innerMap.get("start.year");
				int endYear = (int) innerMap.get("end.year");

				Assert.assertEquals( 1, startYear);
				Assert.assertEquals( 4, endYear);}
			}
		}
	}
}