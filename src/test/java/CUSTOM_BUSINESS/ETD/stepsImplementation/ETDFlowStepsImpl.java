package CUSTOM_BUSINESS.ETD.stepsImplementation;

import APPS_COMMON.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class ETDFlowStepsImpl extends PageInitializer {

	public void etdLogin(String userName) {
		WebDriverUtils.webDriver.get("");
		iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "nekrashevicha2Username");
		CommonUtils.sleep(3000);
		iTrustloginPage.enterPassword("nekrashevicha2Password");
		CommonUtils.sleep(5000);
		iTrustloginPage.clickSignInButton();
		CommonUtils.sleep(3000);
		JavascriptUtils.scrollIntoView(etdAdminNCIPage.changeUserButtonNCI);
		JavascriptUtils.clickByJS(etdAdminNCIPage.changeUserButtonNCI);
		CommonUtils.sleep(3000);
		CommonUtils.clickOnElement(etdAdminNCIPage.inputFieldChangeUser);
		CommonUtils.sleep(4000);
		CommonUtils.sendKeys(etdAdminNCIPage.inputFieldChangeUser, userName);
		CommonUtils.sleep(4000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(etdAdminNCIPage.dropdownChangeUser);
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
	}


	public void selectTab(String tab) {
		if (tab.equalsIgnoreCase("Home")) {
			CommonUtils.clickOnElement(etdAdminNCIPage.homeTab);
			CommonUtils.sleep(2000);
		} else if (tab.equalsIgnoreCase("About ETD")) {
			CommonUtils.clickOnElement(etdAdminNCIPage.aboutETDTab);
			CommonUtils.sleep(2000);
		} else if (tab.equalsIgnoreCase("Manage ETD")) {
			CommonUtils.clickOnElement(etdAdminNCIPage.manageETDTab);
			CommonUtils.sleep(2000);
		} else {
			CommonUtils.clickOnElement(etdAdminNCIPage.manageRolesTab);
			CommonUtils.sleep(2000);
		}
	}

	public void verifyContent(String content) {
		if (content.equalsIgnoreCase("Home")) {
			CommonUtils.assertTrue(etdAdminNCIPage.titleHomeTab.isDisplayed());
			CommonUtils.sleep(2000);
			CucumberLogUtils.logScreenshot();
		} else if (content.equalsIgnoreCase("About ETD")) {
			CommonUtils.assertTrue(etdAdminNCIPage.titleAboutETD.isDisplayed());
			CommonUtils.sleep(2000);
			CucumberLogUtils.logScreenshot();
		} else if (content.equalsIgnoreCase("Manage ETD")) {
			CommonUtils.assertTrue(etdAdminNCIPage.organizationNCI.isDisplayed());
			CommonUtils.sleep(2000);
			CucumberLogUtils.logScreenshot();
		} else {
			CommonUtils.assertTrue(etdAdminNCIPage.titleManageRoles.isDisplayed());
			CommonUtils.sleep(2000);
			CucumberLogUtils.logScreenshot();
		}
	}

	public void selectTierUser(String tier) {
		JavascriptUtils.scrollIntoView(etdAdminNCIPage.changeUserButtonNCI);
		JavascriptUtils.clickByJS(etdAdminNCIPage.changeUserButtonNCI);
		CommonUtils.sleep(3000);
		CommonUtils.clickOnElement(etdAdminNCIPage.inputFieldChangeUser);
		CommonUtils.sleep(4000);
		if (tier.equalsIgnoreCase("Tier User1")) {
			CommonUtils.sendKeys(etdAdminNCIPage.inputFieldChangeUser, "ABER, ETAN");
			CommonUtils.sleep(4000);
			CucumberLogUtils.logScreenshot();
			CommonUtils.clickOnElement(etdAdminNCIPage.dropdownChangeUser);
			CommonUtils.sleep(3000);
		} else if (tier.equalsIgnoreCase("Tier User2")) {
			CommonUtils.sendKeys(etdAdminNCIPage.inputFieldChangeUser, "ADAMS, GREGORY");
			CommonUtils.sleep(4000);
			CucumberLogUtils.logScreenshot();
			CommonUtils.clickOnElement(etdAdminNCIPage.dropdownChangeUser);
			CommonUtils.sleep(3000);
		} else if (tier.equalsIgnoreCase("Tier User3")) {
			CommonUtils.sendKeys(etdAdminNCIPage.inputFieldChangeUser, "BILD, ANDREA");
			CommonUtils.sleep(4000);
			CucumberLogUtils.logScreenshot();
			CommonUtils.clickOnElement(etdAdminNCIPage.dropdownChangeUser);
			CommonUtils.sleep(3000);
		} else {
			CommonUtils.sendKeys(etdAdminNCIPage.inputFieldChangeUser, "BERG, LESLIE");
			CommonUtils.sleep(4000);
			CucumberLogUtils.logScreenshot();
			CommonUtils.clickOnElement(etdAdminNCIPage.dropdownChangeUser);
			CommonUtils.sleep(3000);
		}
	}

	public void selectAlert(String alert) {
		if (alert.equalsIgnoreCase("content of Tier1")) {
			CommonUtils.assertTrue(etdAdminNCIPage.tier1Alert.isDisplayed());
			CommonUtils.sleep(2000);
			CucumberLogUtils.logScreenshot();
		} else if (alert.equalsIgnoreCase("content of Tier2")) {
			CommonUtils.assertTrue(etdAdminNCIPage.tier2Alert.isDisplayed());
			CommonUtils.sleep(2000);
			CucumberLogUtils.logScreenshot();
		} else if (alert.equalsIgnoreCase("content of Tier3")) {
			CommonUtils.assertTrue(etdAdminNCIPage.tier3Alert.isDisplayed());
			CommonUtils.sleep(2000);
			CucumberLogUtils.logScreenshot();
		} else {
			CommonUtils.assertTrue(etdAdminNCIPage.tier3DAlert.isDisplayed());
			CommonUtils.sleep(2000);
			CucumberLogUtils.logScreenshot();
		}
	}

	public void selectTier(String tier) {
		if (tier.equalsIgnoreCase("All")) {
			CommonUtils.clickOnElement(etdAdminNCIPage.searchButton);
			CommonUtils.sleep(30000);
			CucumberLogUtils.logScreenshot();
		} else if (tier.equalsIgnoreCase("Tier I")) {
			CommonUtils.clickOnElement(etdAdminNCIPage.tierDropdown);
			CommonUtils.sleep(30000);
			CommonUtils.clickOnElement(etdAdminNCIPage.tierSearch);
			CommonUtils.sleep(2000);
			CommonUtils.sendKeys(etdAdminNCIPage.tierSearch, "Tier I");
			CommonUtils.sleep(2000);
			etdAdminNCIPage.tierSearch.sendKeys(Keys.ENTER);
			CommonUtils.sleep(7000);
			JavascriptUtils.scrollIntoView(etdAdminNCIPage.searchButton);
			CommonUtils.clickOnElement(etdAdminNCIPage.searchButton);
			CommonUtils.sleep(3000);
			CucumberLogUtils.logScreenshot();
		} else if (tier.equalsIgnoreCase("Tier II   ")) {
			CommonUtils.clickOnElement(etdAdminNCIPage.tierDropdown);
			CommonUtils.sleep(2000);
			CommonUtils.clickOnElement(etdAdminNCIPage.tierSearch);
			CommonUtils.sleep(2000);
			CommonUtils.sendKeys(etdAdminNCIPage.tierSearch, "Tier II");
			CommonUtils.sleep(2000);
			etdAdminNCIPage.tierSearch.sendKeys(Keys.ENTER);
			CommonUtils.sleep(2000);
			JavascriptUtils.scrollIntoView(etdAdminNCIPage.searchButton);
			CommonUtils.clickOnElement(etdAdminNCIPage.searchButton);
			CommonUtils.sleep(3000);
			CucumberLogUtils.logScreenshot();
		} else if (tier.equalsIgnoreCase("Tier III")) {
			CommonUtils.clickOnElement(etdAdminNCIPage.tierDropdown);
			CommonUtils.sleep(30000);
			CommonUtils.clickOnElement(etdAdminNCIPage.tierSearch);
			CommonUtils.sleep(2000);
			CommonUtils.sendKeys(etdAdminNCIPage.tierSearch, "Tier III");
			CommonUtils.sleep(2000);
			etdAdminNCIPage.tierSearch.sendKeys(Keys.ENTER);
			CommonUtils.sleep(2000);
			JavascriptUtils.scrollIntoView(etdAdminNCIPage.searchButton);
			CommonUtils.clickOnElement(etdAdminNCIPage.searchButton);
			CommonUtils.sleep(3000);
			CucumberLogUtils.logScreenshot();
		} else {
			CommonUtils.clickOnElement(etdAdminNCIPage.tierDropdown);
			CommonUtils.sleep(30000);
			CommonUtils.clickOnElement(etdAdminNCIPage.tierSearch);
			CommonUtils.sleep(2000);
			CommonUtils.sendKeys(etdAdminNCIPage.tierSearch, "Tier III-D");
			CommonUtils.sleep(2000);
			etdAdminNCIPage.tierSearch.sendKeys(Keys.ENTER);
			CommonUtils.sleep(2000);
			JavascriptUtils.scrollIntoView(etdAdminNCIPage.searchButton);
			CommonUtils.clickOnElement(etdAdminNCIPage.searchButton);
			CommonUtils.sleep(3000);
			CucumberLogUtils.logScreenshot();
		}
	}
	public void verifyContentTier(String content) {
		if (content.equalsIgnoreCase("contentAll")) {
			CommonUtils.sleep(3000);
			List<WebElement> namesList = WebDriverUtils.webDriver.findElements(By.xpath("//tbody//tr//td[3]"));
			System.out.println(namesList);
			for (WebElement each : namesList) {
				System.out.println("Tier  " + each.getText());
			}
			CucumberLogUtils.logScreenshot();
		} else if (content.equalsIgnoreCase("content1")) {
			CommonUtils.sleep(3000);
			List<WebElement> namesList = WebDriverUtils.webDriver.findElements(By.xpath("//tbody//tr//td[3]"));
			System.out.println(namesList);
			for (WebElement each : namesList) {
				System.out.println("Tier  " + each.getText());
			}
			CucumberLogUtils.logScreenshot();
		} else if (content.equalsIgnoreCase("content2")) {
			CommonUtils.sleep(3000);
			List<WebElement> namesList = WebDriverUtils.webDriver.findElements(By.xpath("//tbody//tr//td[3]"));
			System.out.println(namesList);
			for (WebElement each : namesList) {
				System.out.println("Tier  " + each.getText());
			}
			CucumberLogUtils.logScreenshot();
		} else if (content.equalsIgnoreCase("content3")) {
			CommonUtils.sleep(3000);
			List<WebElement> namesList = WebDriverUtils.webDriver.findElements(By.xpath("//tbody//tr//td[3]"));
			System.out.println(namesList);
			for (WebElement each : namesList) {
				System.out.println("Tier  " + each.getText());
			}
			CucumberLogUtils.logScreenshot();
		} else {
			List<WebElement> namesList = WebDriverUtils.webDriver.findElements(By.xpath("//tbody//tr//td[3]"));
			System.out.println(namesList);
			for (WebElement each : namesList) {
				System.out.println("Tier  " + each.getText());
			}
			CucumberLogUtils.logScreenshot();
		}
	}
}