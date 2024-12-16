package CHARMS.Utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.nci.automation.web.CommonUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.ExcelReader;
import com.nci.automation.web.WebDriverUtils;

/* @author SONIKA JAIN */
public class CharmsUtil {
	/* Excel Data Reader */
	public static Map<String, String> testManagerData(String excelSheet, String sheet, int rowNum) {
		ExcelReader excelReader = new ExcelReader();
		Map<String, String> currentRow = null;
		try {
			List<Map<String, String>> excelDataMapList = excelReader.getDataIOStream(excelSheet, sheet);
			currentRow = excelDataMapList.get(rowNum);
		} catch (InvalidFormatException | IOException e) {
			e.printStackTrace();
		}
		return currentRow;
	}

	/* @param webElement:Element to be highlighted */
	public static void labelHighlight(WebElement webElement) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) WebDriverUtils.webDriver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red')", webElement);
	}

	/* @param webElement:Element to be Unhighlighted */
	public static void labelUnHighlight(WebElement webElement) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) WebDriverUtils.webDriver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:none; background:white')", webElement);
	}

	/* @param webElement:Element to be clicked to avoid the exception */
	public static void clickOnElement(WebElement webElement) {
		CharmsUtil.labelHighlight(webElement);
		int count = 0;
		while (count < 5) {
			try {
				webElement.click();
				CommonUtils.sleep(1200);
				break;
			} catch (WebDriverException ex) {
				CommonUtils.sleep(2000);
				count++;
			}
		}
	}

	/* @param webElement:Element to be clicked to avoid the exception */
	public static void clickOnRadioButtonElement(WebElement webElement) {
		CharmsUtil.labelHighlight(webElement);
		int count = 0;
		while (count < 5) {
			try {
				webElement.click();
				CommonUtils.sleep(400);
				break;
			} catch (WebDriverException ex) {
				CommonUtils.sleep(2000);
				count++;
			}
		}
	}

	/* @param webElement:USE THIS METHOD TO SEND KEYS TO STALE ELEMENTS */
	public static void sendKeysToElement(WebElement webElement, String text) {
		int count = 0;
		while (count < 5) {
			try {
				CharmsUtil.labelHighlight(webElement);
				webElement.sendKeys(text);
				CommonUtils.sleep(600);
				break;
			} catch (WebDriverException ex) {
				CommonUtils.sleep(2000);
				count++;
			}
		}
	}

	/* @param webElement:Element to be Verified */
	public static void assertCheckBox(SoftAssert softAssert, WebElement webElement, boolean expectedValue,
			String messsage) {
		CharmsUtil.labelHighlight(webElement);
		boolean actualValue = webElement.isSelected();
		softAssert.assertEquals(actualValue, expectedValue, "Assertion Failed for" + messsage + "-->");
	}
	
	/* @param webElement:Button Labelto be Verified */
	public static void assertButtonLabel(SoftAssert softAssert, WebElement webElement, String expectedValue, String messsage) {		
		CharmsUtil.labelHighlight(webElement);
		String actualValue = webElement.getText();
		softAssert.assertEquals(actualValue, expectedValue, "Assertion Failed for" + messsage + "-->");
	}
	
	/* @param webElement:Button Labelto be Verified */
	public static void assertButtonLabelWithSpace(SoftAssert softAssert, WebElement webElement, String expectedValue, String messsage) {		
		CharmsUtil.labelHighlight(webElement);
		String actualValue = webElement.getText();
		String actualValueWithSpace = actualValue.trim();
		if (expectedValue == null) {		
			expectedValue ="";
		}
		softAssert.assertEquals(actualValueWithSpace, expectedValue, "Assertion Failed for" + messsage + "-->");
	}
	
	public static boolean compareValues(WebElement webElement, String expectedValue) {		
		CharmsUtil.labelHighlight(webElement);
		String actualValue = webElement.getText();
		String actualValueWithSpace = actualValue.trim();
		if (expectedValue == null) {		
			expectedValue ="";
		}
		if(actualValueWithSpace.equals(expectedValue)) {
			return true;
		}
		return false;
	}
	
	/* webElement:A text box to be Verified */
	public static void assertTextBoxData(SoftAssert softAssert, WebElement webElement, String expectedValue,String messsage) {
		CharmsUtil.labelHighlight(webElement);
		CommonUtils.sleep(300);
		String actualValue = null;
		if (webElement.getAttribute("value") != null) {
			actualValue = webElement.getAttribute("value");
			actualValue = actualValue.trim();
		} else {
			actualValue = webElement.getText();
			actualValue = actualValue.trim();
		}
		softAssert.assertEquals(actualValue, expectedValue, "Assertion Failed for" + messsage + "-->");
	}

	/* webElement:A text box to be Verified */
	public static void assertTextBoxDataSelected(SoftAssert softAssert, WebElement webElement, String expectedValue,String messsage) {
		CharmsUtil.labelHighlight(webElement);
		CommonUtils.sleep(300);
		String actualValue = null;
		if (webElement.getAttribute("value") != null) {
			actualValue = webElement.getAttribute("value");
		} 
		if (webElement.getAttribute("value") != null) {
			actualValue = webElement.getAttribute("value");
		}
		else {
			actualValue = webElement.getText();
		}
		softAssert.assertEquals(actualValue, expectedValue, "Assertion Failed for" + messsage + "-->");
	}
	
	/* webElement:A DropDown value to be Verified */
	public static void assertDropDownData(SoftAssert softAssert, WebElement webElement, String expectedValue,String messsage) {
		CharmsUtil.labelHighlight(webElement);
		CommonUtils.sleep(200);
		Select select = new Select(webElement);
		String actualValue = select.getFirstSelectedOption().getText(); // getFirstSelectedOption() returns the selected
		// option in the dropdown.
		if (expectedValue == "Don't know") {
			expectedValue = "Unknown/Unsure";
		}
		softAssert.assertEquals(actualValue, expectedValue, "Assertion Failed for" + messsage + "-->");
	}
	
	public static void compareExpectedActualValue(SoftAssert softAssert,WebElement webElement, String expectedValue,String messsage) {		
		CharmsUtil.labelHighlight(webElement);
		Select select = new Select(webElement);
		String actualValue = select.getFirstSelectedOption().getText(); // getFirstSelectedOption() returns the selected
	softAssert.assertEquals(actualValue, expectedValue, "Assertion Failed for" + messsage + "-->");
	}
	
	/* Method to select a value from the Drop down List */
	public static boolean selectDropDownValue(WebElement webElement, String selectedValue) {
		CharmsUtil.labelHighlight(webElement);
		CharmsUtil.clickOnElement(webElement);
		CommonUtils.sleep(500);
		Select dropDown = new Select(webElement);
		List<WebElement> e = dropDown.getOptions();
		int itemCount = e.size();
		for (int l = 0; l < itemCount; l++) {
			if (e.get(l).getText().equals(selectedValue)) {
				try {
					CharmsUtil.labelHighlight(e.get(l));
					e.get(l).click();
					CommonUtils.sleep(500);
				} catch (Exception ex) {
					CommonUtils.sleep(2000);
					e.get(l).click();
				}
				return true;
			}
		}
		return false;
	}

	public static void clickAutoPopulatedReference (WebElement webElement, List<String> referenceElements, String dropDownValue){
		CharmsUtil.labelHighlight(webElement);
		CharmsUtil.clickOnElement(webElement);
		CommonUtils.sleep(500);
		WebElement select2ElementResults = WebDriverUtils.webDriver
				.findElement(By.xpath("s2id_sp_formfield_other_biological_parent_partner"));
	}
	
	public static void SelectValueFromDropDown(WebElement webElement, List<String> dropdownList, String dropDownValue) {
		CharmsUtil.clickOnElement(webElement);
		WebElement select2ElementResults = WebDriverUtils.webDriver
				.findElement(By.xpath("//div[@id='select2-drop']/ul[@class='select2-results']"));
		List<WebElement> selectResultsAsListCollection = select2ElementResults.findElements(By.tagName("li"));
		int size = dropdownList.size();
		if (selectResultsAsListCollection.size() < size) {
			size = selectResultsAsListCollection.size();
		}
		CucumberLogUtils.logScreenshot();
		for (int i = 0; i < size; i++)  {
			String options = selectResultsAsListCollection.get(i).getText();
			if ( options.equals(dropDownValue))
			{
				selectResultsAsListCollection.get(i).click();
				CommonUtils.sleep(1000);
				break;
			}
		}
	}
	
	/* Method to select a value from the Radio Button List */
	public static boolean selectRadioButtonValue(List<WebElement> radioButtonList, String selectedValue) {
		int itemCount = radioButtonList.size();
		for (int l = 0; l < itemCount; l++) {
			if (radioButtonList.get(l).getText().equals(selectedValue)) {
				try {
					CharmsUtil.labelHighlight(radioButtonList.get(l));
					radioButtonList.get(l).click();
					CommonUtils.sleep(600);
				} catch (Exception ex) {
					radioButtonList.get(l).click();
					CommonUtils.sleep(2000);
				}
				return true;
			}
		}
		return false;
	}

	/* @param webElement: Method to compare the expected Value to the actual value
	 * and then adding in to the Comparison Results list and then adding that list
	 * to the final Component Test Result */
	public static ComponentTestResult verifyLabel(WebElement webElement, String expectedValue) {
		CharmsUtil.labelHighlight(webElement);
		CommonUtils.sleep(500);
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
		CommonUtils.sleep(500);
		ComponentTestResult componentTestResult = new ComponentTestResult();
		componentTestResult.setComparisionResultList(comparisionResultList);
		componentTestResult.setComponentResult(result);
		return componentTestResult;
	}

	/* @param webElement:WebElement is Actual value, List is the Expected Dropdown list.
	 * @return ComponentTestResult:Comparison results list for each option (actual
	 * v.s. expected) */
	public static ComponentTestResult verifyDropDowns(WebElement webElement, List<String> list) {
		CharmsUtil.labelHighlight(webElement);
		CommonUtils.sleep(500);
		String result = "PASSED";
		List<ComparisionResult> comparisionResultList = new ArrayList<ComparisionResult>();
		Select select = new Select(webElement);
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
			CommonUtils.sleep(500);
		}
		CharmsUtil.labelUnHighlight(webElement);
		ComponentTestResult componentTestResult = new ComponentTestResult();
		componentTestResult.setComparisionResultList(comparisionResultList);
		componentTestResult.setComponentResult(result);
		return componentTestResult;
	}

	/* @param webElement:WebElement compared to the expected Dropdown values
	 * @param dropdownList: Expected Dropdown list
	 * @param dropdownSelectedIndex:The Dropdown selected index @return */
	public static ComponentTestResult verifySelect2DropDowns(WebElement webElement, List<String> dropdownList,
			int dropdownSelectedIndex) {
		CharmsUtil.labelHighlight(webElement);
		CommonUtils.sleep(500);
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

	public static ComponentTestResult assertTextBoxDataV(WebElement webElement, String expectedValue) {
		CharmsUtil.labelHighlight(webElement);
		CommonUtils.sleep(500);
		String result = "PASSED";
		List<ComparisionResult> comparisionResultList = new ArrayList<ComparisionResult>();
		String actualValue = null;
		if (webElement.getAttribute("value") != null) {
			actualValue = webElement.getAttribute("value");
		} else {
			actualValue = webElement.getText();
		}
		try {
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(actualValue, expectedValue, "Value is Matching");
			System.out.println("Assertion Passed:" + actualValue + "is equal to " + expectedValue);
		} catch (AssertionError ae) {
			result = "FAILED";
			ComparisionResult comparisionResult = new ComparisionResult(actualValue, expectedValue, "FAILED");
			comparisionResultList.add(comparisionResult);
		}
		CommonUtils.sleep(500);
		ComponentTestResult componentTestResult = new ComponentTestResult();
		componentTestResult.setComparisionResultList(comparisionResultList);
		componentTestResult.setComponentResult(result);
		return componentTestResult;
	}
}