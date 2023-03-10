package ServiceNow.CHARMS.Utils;

import java.util.ArrayList;
import java.util.List;

public class StepTestResult {
	String stepText;
	List<ComponentTestResult> componentTestResultList = new ArrayList<ComponentTestResult>() ;
	String stepResult;

	public StepTestResult(String stepText) {
		this.stepText = stepText;
	}

	public String getStepText() {
		return stepText;
	}

	public void setStepText(String StepText) {
		this.stepText = StepText;
	}

	public List<ComponentTestResult> getComponentTestResultList() {
		return componentTestResultList;
	}

	public void setComponentTestResultList(List<ComponentTestResult> componentTestResultList) {
		this.componentTestResultList = componentTestResultList;
	}

	public String getStepResult() {
		for (ComponentTestResult tr : componentTestResultList) {
			if(tr.getComponentResult().equals("FAILED")) {
				return "FAILED";
			}
		}
		return "PASSED";
	}

	public void setStepResult(String stepResult) {
		this.stepResult = stepResult;
	}

	public void add(ComponentTestResult componentTestResult) {
		componentTestResultList.add(componentTestResult);
	}
	
	

	public String toString() {
		StringBuffer sb = new StringBuffer().append("Verification: ").append(getStepResult()).append("\n")
				.append("STEP-> ").append(stepText).append("\n");
		for (ComponentTestResult tr : componentTestResultList) {
			if (tr.getComponentResult().equals("FAILED")) {
				for (ComparisionResult cr : tr.getComparisionResultList()) {
					sb.append("Expected Value: ").append(cr.getExpectedValue()).append("\n").append("Actual Value:   ")
							.append(cr.getActualValue()).append("\n");
				}
			}

		}
		return sb.toString();

	}

}
