package ServiceNow.CHARMS.Utils;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

/*  @author SonikaJain  */

public class FHQUtil {

	/* @author SonikaJain */
	/* @param webElement: Element to be highlighted */
	
	public static void fHQLabelHighlight(WebElement webElement) {

		JavascriptExecutor jsExecutor = (JavascriptExecutor) WebDriverUtils.webDriver;

		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red')",
				webElement);

	}

	public static void fHQLabelUnHighlight(WebElement webElement) {

		JavascriptExecutor jsExecutor = (JavascriptExecutor) WebDriverUtils.webDriver;

		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:none; background:white')", webElement);

	}

	public static void printDropDownListValue(WebElement webElement) {

		Select dropDown = new Select(webElement);
		List<WebElement> e = dropDown.getOptions();
		int itemCount = e.size();

		for (int l = 0; l < itemCount; l++) {
			System.out.println(e.get(l).getText());
		}

	}

	/* @author SonikaJain */
	 /* @param webElement:Drop-down WebElement that needs to be compared to the expected Drop-down values */
	 /* @param dropdownList: Expected Drop-down value list
	 * @return ComponentTestResult: list of comparison results for each option (actual v.s. expected) */

	public static ComponentTestResult verifyDropDowns(WebElement webElement, List<String> list) {

		FHQUtil.fHQLabelHighlight(webElement);
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

		FHQUtil.fHQLabelUnHighlight(webElement);
		MiscUtils.sleep(500);

		ComponentTestResult componentTestResult = new ComponentTestResult();

		componentTestResult.setComparisionResultList(comparisionResultList);
		componentTestResult.setComponentResult(result);

		return componentTestResult;
	}

	/* @author SonikaJain 
	 * @param webElement:Drop-down WebElement that needs to be compared to the expected Drop-down values
	 * @param dropdownList: Expected Drop-down value list
	 * @param dropdownSelectedIndex:The Drop-down value selected index
	 * @return*/

	public static ComponentTestResult verifySelect2DropDowns(WebElement webElement, List<String> dropdownList,
			int dropdownSelectedIndex) {

		FHQUtil.fHQLabelHighlight(webElement);
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

	
	public static ComponentTestResult selectRandomDropdown(WebElement webElement, int index)
			{

		FHQUtil.fHQLabelHighlight(webElement);
		MiscUtils.sleep(1000);

		webElement.click();
		MiscUtils.sleep(1000);


		String result = "PASSED";
		
		WebElement select2ElementResults = WebDriverUtils.webDriver.findElement(By.xpath("(//a[@class='select2-choice select2-default form-control'])[1]"));
		
		

		List<WebElement> selectResultsAsListCollection = select2ElementResults.findElements(By.tagName("li"));

		List<ComparisionResult> comparisionResultList = new ArrayList<ComparisionResult>();

		try {
		selectResultsAsListCollection.get(0).click();
		
		MiscUtils.sleep(1000);
		
		}catch(Exception e) {
			result = "FAILED";
			ComparisionResult comparisionResult = new ComparisionResult("Unable to locate element" , 0+"", "FAILED");
			comparisionResultList.add(comparisionResult);
		}

		ComponentTestResult componentTestResult = new ComponentTestResult();

		componentTestResult.setComparisionResultList(comparisionResultList);
		componentTestResult.setComponentResult(result);

		return componentTestResult;

	}
	
	public static ComponentTestResult verifyLabel(WebElement webElement, String expectedValue) {

		FHQUtil.fHQLabelHighlight(webElement);
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
 
		/* To unhightlight the Label */

		MiscUtils.sleep(500);

		ComponentTestResult componentTestResult = new ComponentTestResult();

		componentTestResult.setComparisionResultList(comparisionResultList);
		componentTestResult.setComponentResult(result);

		return componentTestResult;
	}
	
	public static void verifySelectRandomDropDowns(WebElement webElement) {

		FHQUtil.fHQLabelHighlight(webElement);
		MiscUtils.sleep(1000);

       webElement.click();

       @SuppressWarnings("unchecked")
		List<WebElement> suggestionList = (List<WebElement>) WebDriverUtils.webDriver.findElement(By.xpath("(//div[@id='s2id_sp_formfield_grandchild_parent>span>i']"));

		suggestionList.get(0).click();
		
	}

}
