package ServiceNow.ATO.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.WebDriverUtils;

import ServiceNow.ATO.Utils.CommonUtil;
import ServiceNow.ATO.Utils.DriverObjectFactory;

public class AtoPage extends BasePage {

	public AtoPage() {
		PageFactory.initElements(WebDriverUtils.getWebDriver(), this);
	}

	public static String packageCode = "";

	// Dynamic Xpaths
	public static String TAB_HEADER = "//span[@class='tab_header']//span[contains(text(), 'tabMame')]"; // Change
																										// tabName

	public static String firstPackage = ("(//div[@class=\"composite_field_second\"]/a)[1]");
	public static String auditAndAccoLink = "//a[text()='Audit and Accountability']";
	public static String ConfigurationManagLink = "//a[text()='Configuration Management Plan']";
	public static String contigencyLink = "//a[text()='Contingency Plan']";
	public static String eAuthenticationLink = "//a[text()='eAuthentication']";
	public static String FIPS199Link = "//a[text()='FIPS199']";
	public static String IdentityandAccessManagementLink = "//a[text()='Identity and Access Management']";
	public static String IncidentResponseContactListLink = "//a[text()='Incident Response Contact List']";
	public static String SystemSecurityPlan = "//a[text()='System Security Plan']";
	public static By formControlDropdown = By.xpath("//select[@class=\"form-control  \"]");
	public static String updateButton = "//button[text()='Update']";
	public static String signATOButton = "//button[text()='Sign ATO']";
	public static String OKButton = "//button[text()='OK']";
	public static By onlineTxnDropdown = By.xpath("//*[@id='x_g_nci_atoaas_eauthentication.involves_online_transactions']");
	public static String renewButtonXpath = "//button[text()='Renew']";
	public static String datesSection= "//span[text()='Dates']";
	public static String startDate = "//input[@aria-label='Start date']";
	
	@FindBy(css = ".list2_body tr .composite_field_link")
	public WebElement firstPackageLink;

}
