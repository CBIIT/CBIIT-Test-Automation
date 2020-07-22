package com.nci.automation.common;

/**
 * Model to represent the QC Test result.
 */
public class QcTestResult {

	private final String scenarioName;

	private final String scenarioResult;
	
	private final String scenarioResultsPath;
	
	public QcTestResult(String scenarioName, String scenarioResult,
			String scenarioResultPath) {
		this.scenarioName = scenarioName;
		this.scenarioResult = scenarioResult;
		this.scenarioResultsPath = scenarioResultPath;
	}

	public String getScenarioName() {
		return this.scenarioName;
	}

	public String getScenarioResult() {
		return this.scenarioResult;
	}

	public String getScenarioResultPath() {
		return this.scenarioResultsPath;
	}

}
