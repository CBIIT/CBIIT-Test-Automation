package CHARMS.Utils;

public class ComparisionResult {

	private String stepResult;
	private String expectedValue;
	private String actualValue;

	public ComparisionResult(String expectedValue, String actualValue, String stepResult) {
		super();
		this.stepResult = stepResult;
		this.expectedValue = expectedValue;
		this.actualValue = actualValue;
	}

	public void setStepResult(String stepResult) {
		this.stepResult = stepResult;
	}

	public String getExpectedValue() {
		return expectedValue;
	}

	public String getActualValue() {
		return actualValue;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer().append("<b> Expected Value:</b> ").append(expectedValue)
				.append("<b> Actual Value:</b> ").append(actualValue).append("\n").append(" <b>Result: </b>")
				.append(stepResult);

		return sb.toString();

	}
}
