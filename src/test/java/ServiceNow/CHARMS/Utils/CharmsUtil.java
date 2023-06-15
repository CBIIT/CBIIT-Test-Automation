package ServiceNow.CHARMS.Utils;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;

import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

/*  @author SonikaJain  */

public class CharmsUtil {

	/* @author SonikaJain */
	/* @param webElement: Element to be highlighted */
	@BeforeClass
	public static void labelHighlight(WebElement webElement) {

		JavascriptExecutor jsExecutor = (JavascriptExecutor) WebDriverUtils.webDriver;

		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red')", webElement);

	}

	/* @author SonikaJain */
	/* @param webElement: Element to be Unhighlighted */
	public static void labelUnHighlight(WebElement webElement) {

		JavascriptExecutor jsExecutor = (JavascriptExecutor) WebDriverUtils.webDriver;

		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:none; background:white')", webElement);

	}

	/* @author SonikaJain */
	/* @param webElement: Question Label to be Verified */
	public static boolean verifyQuestionLabel(WebElement webElement, String expectedValue) {

		boolean questionLabelResult = true;

		CharmsUtil.labelHighlight(webElement);

		MiscUtils.sleep(500);

		String actualValue = webElement.getText();
		try {
			Assert.assertTrue(actualValue.equals(expectedValue));
		} catch (AssertionError ae) {
			questionLabelResult = false;

		}

		return questionLabelResult;

	}

	/* @author SonikaJain */
	/*
	 * @param webElement: Method to compare the expected Value to the actual value
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
	/* Method to print the Drop down List values */
	public static void printDropDownListValue(WebElement webElement) {

		Select dropDown = new Select(webElement);
		List<WebElement> e = dropDown.getOptions();
		int itemCount = e.size();

		for (int l = 0; l < itemCount; l++) {
			System.out.println(e.get(l).getText());
		}

	}

	/* @author SonikaJain */
	/* Method to select a value from the Drop down List */
	public static boolean selectDropDownValue(WebElement webElement, String selectedValue) {

		Select dropDown = new Select(webElement);
		List<WebElement> e = dropDown.getOptions();
		int itemCount = e.size();

		for (int l = 0; l < itemCount; l++) {
			if (e.get(l).getText().equals(selectedValue)) {
				e.get(l).click();
				return true;
			}
			System.out.println(e.get(l).getText());
		}
		return false;

	}

	/* @author SonikaJain */
	/* Method to select a value from the Radio Button List */
	public static boolean selectRadioButtonValue(List<WebElement> radioButtonList, String selectedValue) {

		int itemCount = radioButtonList.size();

		for (int l = 0; l < itemCount; l++) {
			if (radioButtonList.get(l).getText().equals(selectedValue)) {
				radioButtonList.get(l).click();
				return true;
			}
			System.out.println(radioButtonList.get(l).getText());
		}
		return false;

	}

	/* @author SonikaJain */
	/*
	 * @param webElement:Drop-down WebElement that needs to be compared to the
	 * expected Drop-down values
	 */
	/*
	 * @param dropdownList: Expected Drop-down value list
	 * 
	 * @return ComponentTestResult: list of comparison results for each option
	 * (actual v.s. expected)
	 */

	public static ComponentTestResult verifyDropDowns(WebElement webElement, List<String> list) {

		CharmsUtil.labelHighlight(webElement);
		MiscUtils.sleep(1000);

		String result = "PASSED";

		List<ComparisionResult> comparisionResultList = new ArrayList<ComparisionResult>();

		Select select = new Select(webElement);
		// getting the list of Drop Down options in the drop-down with getOptions()

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

	/*
	 * @author SonikaJain
	 * 
	 * @param webElement:Drop-down WebElement that needs to be compared to the
	 * expected Drop-down values
	 * 
	 * @param dropdownList: Expected Drop-down value list
	 * 
	 * @param dropdownSelectedIndex:The Drop-down value selected index
	 * 
	 * @return
	 */

	public static ComponentTestResult verifySelect2DropDowns(WebElement webElement, List<String> dropdownList,
			int dropdownSelectedIndex) {

		CharmsUtil.labelHighlight(webElement);
		MiscUtils.sleep(1000);

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

	public static ComponentTestResult selectRandomDropdown(WebElement webElement, int index) {

		CharmsUtil.labelHighlight(webElement);
		MiscUtils.sleep(1000);

		webElement.click();
		MiscUtils.sleep(1000);

		String result = "PASSED";

		WebElement select2ElementResults = WebDriverUtils.webDriver
				.findElement(By.xpath("(//a[@class='select2-choice select2-default form-control'])[1]"));

		List<WebElement> selectResultsAsListCollection = select2ElementResults.findElements(By.tagName("li"));

		List<ComparisionResult> comparisionResultList = new ArrayList<ComparisionResult>();

		try {
			selectResultsAsListCollection.get(0).click();

			MiscUtils.sleep(1000);

		} catch (Exception e) {
			result = "FAILED";
			ComparisionResult comparisionResult = new ComparisionResult("Unable to locate element", 0 + "", "FAILED");
			comparisionResultList.add(comparisionResult);
		}

		ComponentTestResult componentTestResult = new ComponentTestResult();

		componentTestResult.setComparisionResultList(comparisionResultList);
		componentTestResult.setComponentResult(result);

		return componentTestResult;

	}

	/* @author SonikaJain */
	/* Method to select a random value from the Drop down List */
	public static void verifySelectRandomDropDowns(WebElement webElement) {

		CharmsUtil.labelHighlight(webElement);
		MiscUtils.sleep(1000);

		webElement.click();

		@SuppressWarnings("unchecked")
		List<WebElement> suggestionList = (List<WebElement>) WebDriverUtils.webDriver
				.findElement(By.xpath("(//div[@id='s2id_sp_formfield_grandchild_parent>span>i']"));

		suggestionList.get(0).click();

	}

	/* @author SonikaJain */
	/*
	 * @param webElement: Method to compare the expected Value to the actual value
	 * and then adding in to the Comparison Results list and then adding that list
	 * to the final Component Test Result
	 */
	public static ComponentTestResult verifyDataField(WebElement webElement, String expectedValue) {

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

	private static void If(boolean b) {
		// TODO Auto-generated method stub

	}

}
