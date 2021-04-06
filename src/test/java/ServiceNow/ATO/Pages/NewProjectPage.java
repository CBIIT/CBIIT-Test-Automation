package ServiceNow.ATO.Pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ServiceNow.ATO.Utils.CommonUtil;
import ServiceNow.ATO.Utils.DriverObjectFactory;

public class NewProjectPage extends BasePage{
	
	public NewProjectPage() {
		PageFactory.initElements(DriverObjectFactory.getWebDriver(), this);
	}
	
	public static String packageCode = "";

	//Dynamic Xpaths
	public static String TAB_HEADER = "//span[@class='tab_header']//span[contains(text(), 'tabMame')]"; //Change tabName
	
	/**System searchable input */
	@FindBy(css = "[id='sys_display.x_g_nci_atoaas_package.system']")
	public WebElement systemSearchBox;
	
	/**Application hosting solution dropdown */
	@FindBy(css = "[id='x_g_nci_atoaas_package.application_hosting_solution']")
	public WebElement applicationHostDropdown;
	
	/**List of tab elements */
	@FindAll({@FindBy(css = ".tab_caption_text")})
	public List<WebElement> tabs;
	
	/**Start date datepicker */
	@FindBy(css = "[id='x_g_nci_atoaas_package.start_date.ui_policy_sensitive']")
	public WebElement startDate;
	
	/**Approved date datepicker  */
	@FindBy(css = "[id='x_g_nci_atoaas_package.approved_date.ui_policy_sensitive']")
	public WebElement approvedDate;
	
	/**Renewal date datepicker */
	@FindBy(css = "[id='x_g_nci_atoaas_package.renewal_due.ui_policy_sensitive']")
	public WebElement renewalDate;
	
	/**Attested on date datepicker*/
	@FindBy(css = ".date_time_trigger[id='x_g_nci_atoaas_package.attested_on.ui_policy_sensitive']")
	public WebElement attestedDate;
	
	/**Verified on date datepicker */
	@FindBy(css = ".date_time_trigger[id='x_g_nci_atoaas_package.certified_on.ui_policy_sensitive']")
	public WebElement verifiedDate;
	
	@FindBy(css = "[id='x_g_nci_atoaas_package.work_notes']")
	public WebElement workNotes;
	
	@FindBy(css  = ".list2_body tr .composite_field_link")
	public WebElement firstPackageLink;
	
}
