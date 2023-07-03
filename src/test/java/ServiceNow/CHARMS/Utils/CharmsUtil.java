package ServiceNow.CHARMS.Utils;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.WebDriverUtils;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CharmsUtil {

	/* @author SonikaJain @param webElement:Element to be highlighted */
	public static void labelHighlight(WebElement webElement) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) WebDriverUtils.webDriver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red')", webElement);

	}

	/* @author SonikaJain @param webElement:Element to be Unhighlighted */
	public static void labelUnHighlight(WebElement webElement) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) WebDriverUtils.webDriver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:none; background:white')", webElement);

	}
	
	/* @author SonikaJain @param webElement:Element to be Verified */
	public static void verifyDataValue(WebElement webElement,String expectedValue) {

		CharmsUtil.labelHighlight(webElement);
		MiscUtils.sleep(500);
		
		String actualValue = null;
		if (webElement.getAttribute("value") != null) {
			actualValue = webElement.getAttribute("value");
		}
		else {
			actualValue = webElement.getText();
		}
	SoftAssert softAssert = new SoftAssert();
	softAssert.assertEquals(actualValue,expectedValue,"Value is Matching");
		System.out.println("Assertion Passed:" + actualValue + "is equal to " +expectedValue );	
}


	
	
	public static ComponentTestResult verifyDataField(WebElement webElement,String expectedValue) {

		CharmsUtil.labelHighlight(webElement);
		MiscUtils.sleep(500);

		String result = "PASSED";
		List<ComparisionResult> comparisionResultList = new ArrayList<ComparisionResult>();

		String actualValue = null;

		if (webElement.getAttribute("value") != null) {
			actualValue = webElement.getAttribute("value");
		}

		else {
			actualValue = webElement.getText();
		}
		try {
			
			Assert.assertTrue(actualValue.equals(expectedValue));

		} catch (AssertionError ae) {
			result = "FAILED";
			ComparisionResult comparisionResult = new ComparisionResult(actualValue, expectedValue, "FAILED");
			comparisionResultList.add(comparisionResult);
		}

		MiscUtils.sleep(500);
		ComponentTestResult componentTestResult = new ComponentTestResult();
		
		componentTestResult.setComparisionResultList(comparisionResultList);
		componentTestResult.setComponentResult(result);

		return componentTestResult;
	}



	/* @author SonikaJain Method to select a value from the Drop down List */
	public static boolean selectDropDownValue(WebElement webElement, String selectedValue) {

		Select dropDown = new Select(webElement);
		List<WebElement> e = dropDown.getOptions();
		int itemCount = e.size();

		for (int l = 0; l < itemCount; l++) {
			if (e.get(l).getText().equals(selectedValue)) {
				e.get(l).click();
				System.out.println(e.get(l).getText());
				return true;
			}
		}
		return false;

	}
	
	
	/* @author SonikaJain @param webElement:DropDown value to be Verified */
	public static void verifyDropDownValue (WebElement webElement,String expectedValue, String assertResult) {	
	
		Select select = new Select(webElement);
		String actualValue = select.getFirstSelectedOption().getText(); //getFirstSelectedOption() returns the selected option in the dropdown.
		
		String expectedValues=expectedValue;
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualValue,expectedValues,"Value is Matching");
			System.out.println("Assertion Passed for :-" + assertResult + actualValue + "is equal to " +expectedValue );	
		
	}

	/* @author SonikaJain Method to print the Dropdown List values */
	public static void printDropDownValue(WebElement webElement) {

		Select dropDown = new Select(webElement);
		List<WebElement> e = dropDown.getOptions();
		
		int itemCount = e.size();
		for (int l = 0; l < itemCount; l++) {
			System.out.println(e.get(l).getText());
		}
	}

	/* @author SonikaJain */
	/* Method to select a value from the Radio Button List */
	public static boolean selectRadioButtonValue(List<WebElement> radioButtonList, String selectedValue) {

		int itemCount = radioButtonList.size();
		for (int l = 0; l < itemCount; l++) {
			if (radioButtonList.get(l).getText().equals(selectedValue)) {
				radioButtonList.get(l).click();
				System.out.println(radioButtonList.get(l).getText());
				return true;
			}
		}
		return false;
	}
	
	
	/* @author SonikaJain 
	/* @param webElement: Method to compare the expected Value to the actual value
	 * and then adding in to the Comparison Results list and then adding that list
	 * to the final Component Test Result
	 */
	
	/* @author SonikaJain 
	/* @param webElement: Method to compare the expected Value to the actual value
	 * and then adding in to the Comparison Results list and then adding that list
	 * to the final Component Test Result
	 */
	public static ComponentTestResult verifyLabel(WebElement webElement, String expectedValue) {

		CharmsUtil.labelHighlight(webElement);
		MiscUtils.sleep(500);

		String result = "PASSED";
		List<ComparisionResult> comparisionResultList = new ArrayList<ComparisionResult>();
		String actualValue = webElement.getText();

		try {
			Assert.assertTrue(actualValue.equals(expectedValue));

		} catch (AssertionError ae) {
			result = "FAILED";
			ComparisionResult comparisionResult = new ComparisionResult(actualValue, expectedValue, "FAILED");
			comparisionResultList.add(comparisionResult);
		}
		MiscUtils.sleep(500);

		ComponentTestResult componentTestResult = new ComponentTestResult();
		componentTestResult.setComparisionResultList(comparisionResultList);
		componentTestResult.setComponentResult(result);
		return componentTestResult;
	}

	/* @author SonikaJain */
	/* @param webElement:Dropdown WebElement is Actual value, List is the Expected Dropdown list */
	/* @return ComponentTestResult:Comparison results list for each option (actual v.s. expected) */

	public static ComponentTestResult verifyDropDowns(WebElement webElement, List<String> list) {

		CharmsUtil.labelHighlight(webElement);
		MiscUtils.sleep(500);

		String result = "PASSED";
		List<ComparisionResult> comparisionResultList = new ArrayList<ComparisionResult>();
		
		Select select = new Select(webElement);
		// getting the list in the dropdown with getOptions()

		List<WebElement> dropDownOptions = select.getOptions();

		int size = list.size();
		if (dropDownOptions.size() < size) {
			size = dropDownOptions.size();

		}
		for (int i = 0; i < dropDownOptions.size(); i++) {

			String options = dropDownOptions.get(i).getText();
			try {
				Assert.assertTrue(options.equals(list.get(i)));

			} catch (AssertionError ae) {
				result = "FAILED";

				ComparisionResult comparisionResult = new ComparisionResult(options, list.get(i), "FAILED");
				comparisionResultList.add(comparisionResult);
			}
			MiscUtils.sleep(500);
		}

		CharmsUtil.labelUnHighlight(webElement);
		MiscUtils.sleep(500);

		ComponentTestResult componentTestResult = new ComponentTestResult();

		componentTestResult.setComparisionResultList(comparisionResultList);
		componentTestResult.setComponentResult(result);

		return componentTestResult;
	}

	/* @author SonikaJain 
	 /* @param webElement:WebElement compared to the expected Dropdown values
	 *  @param dropdownList: Expected Dropdown list
	 *  @param dropdownSelectedIndex:The Dropdown selected index
	 *  @return
	 *   */

	public static ComponentTestResult verifySelect2DropDowns(WebElement webElement, List<String> dropdownList,
			int dropdownSelectedIndex) {

		CharmsUtil.labelHighlight(webElement);
		MiscUtils.sleep(500);

		webElement.click();

		String result = "PASSED";
		WebElement select2ElementResults = WebDriverUtils.webDriver
				.findElement(By.xpath("//div[@id='select2-drop']/ul[@class='select2-results']"));

		List<WebElement> selectResultsAsListCollection = select2ElementResults.findElements(By.tagName("li"));

		int size = dropdownList.size();
		List<ComparisionResult> comparisionResultList = new ArrayList<ComparisionResult>();

		if (selectResultsAsListCollection.size() < size) {
			size = selectResultsAsListCollection.size();

		}

		for (int i = 0; i < size; i++) {

			String options = selectResultsAsListCollection.get(i).getText();

			try {
				Assert.assertTrue(options.equals(dropdownList.get(i)));

			} catch (AssertionError ae) {
				result = "FAILED";
				ComparisionResult comparisionResult = new ComparisionResult(options, dropdownList.get(i), "FAILED");
				comparisionResultList.add(comparisionResult);
			}
		}

		selectResultsAsListCollection.get(dropdownSelectedIndex).click();

		ComponentTestResult componentTestResult = new ComponentTestResult();
		componentTestResult.setComparisionResultList(comparisionResultList);
		componentTestResult.setComponentResult(result);

		return componentTestResult;
	}
	}
	

	


