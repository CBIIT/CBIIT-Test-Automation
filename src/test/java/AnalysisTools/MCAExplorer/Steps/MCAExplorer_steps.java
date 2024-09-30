package AnalysisTools.MCAExplorer.Steps;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import appsCommon.PageInitializers.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.nci.automation.web.TestProperties.getMcaExplorerUrl;

public class MCAExplorer_steps extends PageInitializer {

	@Given("User navigates to MCAExplorer page")
	public void user_navigates_to_mca_explorer_page() {
		WebDriverUtils.webDriver.get(getMcaExplorerUrl());
	}

	@Then("clicks on advance filters")
	public void clicks_on_advance_filters() {
		mcaExplorerStepImp.clickOnAdvaceFilter();
	}

	@Then("user clicks export data, file should get downloaded")
	public void user_clicks_export_data_should_get_downloaded() {
		mcaExplorerStepImp.clickOnExportData();
	}

	@Then("clicks on submit button")
	public void clicks_on_submit_button() {
		mcaExplorerStepImp.clickOnSubmitButton();
	}

	@Then("verify if the circle is present on the screen")
	public void verify_if_the_circle_is_present_on_the_screen() {
		mcaExplorerStepImp.isCircleImageIsAvailable();
	}

	@Then("Verify the chart header is {string}")
	public void verifyChartHeader(String expectedHeader) {
		CommonUtils.assertTrue(CommonUtils.isElementDisplayed(mcaExplorerPage.chartHeader));
	}

	@Then("verify that there are some rows in the result")
	public void verify_that_there_are_rows_in_the_result() {
		mcaExplorerStepImp.validateNumberOfRows();
	}
	
	@Then("Verify there is alert on the screen")
	public void verify_there_is_alert_present_on_screen() {
		mcaExplorerStepImp.verifyIfAlertIsPresent();
	}

	@Then("Zoom in in the circle")
	public void zoom_function() {
		mcaExplorerStepImp.zoom_feature();
	}

	@Then("go back to full circle")
	public void resetZoom() throws InterruptedException {
		CommonUtils.clickOnElement(mcaExplorerPage.breadcrum);
	}

	@Then("user select Chromosome level in plot type")
	public void user_select_in_plot_type() {
		mcaExplorerStepImp.select_plot_type();
	}

	@Then("select chromosome {int} in chromosome dropdown")
	public void select_chromosome_in_chromosome_dropdown(Integer chromosomeNumber) {
		mcaExplorerStepImp.select_chtomosome(chromosomeNumber);
	}

	@When("User clears the mandatory field Study")
	public void user_clears_the_mandatory_field_study() {
		mcaExplorerStepImp.clearAllValuesFromStudy();
	}

	@When("User selects {string} include chromosome")
	public void user_selects_include_chromosome(String chromosome) {
		mcaExplorerStepImp.selectChromosome(chromosome);
	}

	@Then("verify the graph contains the {string} value")
	public void verify_the_graph_contains_the_value(String chromosome) {
		mcaExplorerStepImp.verifyChromosomeDisplayedInGraph(chromosome);
	}

	@When("User verify the end range as {string}")
	public void user_verify_the_end_range_as(String endRangeValue) {
		mcaExplorerStepImp.verifyEndRange(endRangeValue);
	}

	@Then("verify {string} rows displayed in the table")
	public void verify_rows_displayed_in_the_table(String rows) {
		mcaExplorerStepImp.verifyNoOfRows(rows);
	}

	@Then("select the pagination drop down as {string}")
	public void select_the_pagination_drop_down_as(String dropDownValue) {
		mcaExplorerStepImp.selectThePaginationDropDownValue(dropDownValue);
	}
	
	@Given("User is able to set the env for opensearch request")
	public void user_is_able_to_set_the_env_for_opensearch_request() {
		mcaExplorerStepImp.setApiBaseUrl("https://mcaexplorer-qa.cancer.gov/api/opensearch/mca");
	}
	
	@Then("User is able to send request and receive valid response back")
	public void user_is_able_to_send_request_and_receive_valid_response_back() {
		mcaExplorerStepImp.sendPostReqestWithBody("{\n"
				+ "  \"dataset\": [\n"
				+ "    {\n"
				+ "      \"value\": \"plco\",\n"
				+ "      \"label\": \"PLCO\"\n"
				+ "    }\n"
				+ "  ],\n"
				+ "  \"ancestry\": [\n"
				+ "    {\n"
				+ "      \"value\": \"ADMIXED_EUR\",\n"
				+ "      \"label\": \"ADMIXED_EUR\"\n"
				+ "    },\n"
				+ "    {\n"
				+ "      \"value\": \"AFR\",\n"
				+ "      \"label\": \"African\"\n"
				+ "    },\n"
				+ "    {\n"
				+ "      \"value\": \"AFR_EUR\",\n"
				+ "      \"label\": \"AFR_EUR\"\n"
				+ "    },\n"
				+ "    {\n"
				+ "      \"value\": \"ASN\",\n"
				+ "      \"label\": \"Asian\"\n"
				+ "    },\n"
				+ "    {\n"
				+ "      \"value\": \"ASN_EUR\",\n"
				+ "      \"label\": \"ASN_EUR\"\n"
				+ "    },\n"
				+ "    {\n"
				+ "      \"value\": \"EUR\",\n"
				+ "      \"label\": \"European\"\n"
				+ "    }\n"
				+ "  ],\n"
				+ "  \"maxcf\": \"1\",\n"
				+ "  \"mincf\": \"0\",\n"
				+ "  \"sex\": [\n"
				+ "    {\n"
				+ "      \"value\": \"male\"\n"
				+ "    }\n"
				+ "  ],\n"
				+ "  \"types\": [\n"
				+ "    {\n"
				+ "      \"value\": \"loh\",\n"
				+ "      \"label\": \"CN-LOH\"\n"
				+ "    },\n"
				+ "    {\n"
				+ "      \"value\": \"loss\",\n"
				+ "      \"label\": \"Loss\"\n"
				+ "    },\n"
				+ "    {\n"
				+ "      \"value\": \"gain\",\n"
				+ "      \"label\": \"Gain\"\n"
				+ "    },\n"
				+ "    {\n"
				+ "      \"value\": \"undermined\",\n"
				+ "      \"label\": \"Undermined\"\n"
				+ "    }\n"
				+ "  ]\n"
				+ "}");
	}
	
	@Given("User is able to set the env for open search chromosome request")
	public void setOpenSerchEnv() {
		mcaExplorerStepImp.setApiBaseUrl("https://mcaexplorer-qa.cancer.gov/api/opensearch/chromosome");
	}
	
	@Then("User is able to send request and receive valid response back for chromosome search")
	public void sendRequstAndVerify() {
		mcaExplorerStepImp.sendPostReqestWithBody("{\n"
				+ "  \"chr\": \"2\",\n"
				+ "  \"study\": [\n"
				+ "    {\n"
				+ "      \"value\": \"plco\",\n"
				+ "      \"label\": \"PLCO\"\n"
				+ "    }\n"
				+ "  ],\n"
				+ "  \"ancestry\": [\n"
				+ "    {\n"
				+ "      \"value\": \"ADMIXED_EUR\"\n"
				+ "    },\n"
				+ "    {\n"
				+ "      \"value\": \"AFR\"\n"
				+ "    },\n"
				+ "    {\n"
				+ "      \"value\": \"AFR_EUR\"\n"
				+ "    },\n"
				+ "    {\n"
				+ "      \"value\": \"ASN\"\n"
				+ "    },\n"
				+ "    {\n"
				+ "      \"value\": \"ASN_EUR\"\n"
				+ "    },\n"
				+ "    {\n"
				+ "      \"value\": \"EUR\"\n"
				+ "    }\n"
				+ "  ],\n"
				+ "  \"maxcf\": \"1\",\n"
				+ "  \"mincf\": \"0\",\n"
				+ "  \"sex\": [\n"
				+ "    {\n"
				+ "      \"value\": \"male\"\n"
				+ "    }\n"
				+ "  ],\n"
				+ "  \"types\": [\n"
				+ "    {\n"
				+ "      \"value\": \"loh\",\n"
				+ "      \"label\": \"CN-LOH\"\n"
				+ "    },\n"
				+ "    {\n"
				+ "      \"value\": \"loss\",\n"
				+ "      \"label\": \"Loss\"\n"
				+ "    },\n"
				+ "    {\n"
				+ "      \"value\": \"gain\",\n"
				+ "      \"label\": \"Gain\"\n"
				+ "    },\n"
				+ "    {\n"
				+ "      \"value\": \"undermined\",\n"
				+ "      \"label\": \"Undermined\"\n"
				+ "    }\n"
				+ "  ]\n"
				+ "}");
	}
}