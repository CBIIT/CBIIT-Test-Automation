package CHARMS.Utils;

import java.util.List;

public class ComponentTestResult {
	
	String stepText;
	List<CHARMS.Utils.ComparisionResult> comparisionResultList;
	String componentResult;
	
	public String getStepText() {
		return stepText;
	}
	public void setStepText(String stepText) {
		this.stepText = stepText;
	}
	public List<CHARMS.Utils.ComparisionResult> getComparisionResultList() {
		return comparisionResultList;
	}
	public void setComparisionResultList(List<CHARMS.Utils.ComparisionResult> comparisionResultList) {
		this.comparisionResultList = comparisionResultList;
	}

	public String getComponentResult() {
		return componentResult;
	}
	public void setComponentResult(String componentResult) {
		this.componentResult = componentResult;
	}
	public String toString() {
		StringBuffer sb = new StringBuffer().append("Verification: ").append(componentResult).append("\n")
				.append("For STEP-> ").append(stepText).append("\n");
		for (ComparisionResult tr : comparisionResultList) {
			sb.append("Expected Value: ").append(tr.getExpectedValue()).append("\n").append("Actual Value:   ")
					.append(tr.getActualValue()).append("\n");

		}
		return sb.toString();

	}
}
