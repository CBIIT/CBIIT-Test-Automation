package ServiceNow.NCCR.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NCCRPage {
    public NCCRPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }

    /**My Assigned Data Requests section*/
    @FindBy(xpath = "//h1//strong[.='My Assigned Data Requests']")
    public WebElement sectionMyAssignedDataRequest;

    /** Confidentiality Statement section */
    @FindBy(xpath = "//h3//strong[.='Confidentiality Statement']")
    public WebElement sectionConfidentialityStatement;

    /**My Assigned Data Requests section text*/
    @FindBy(xpath = "//p[.='This page allows you to manage the NCCR data requests that you have been assigned to review. You can select a data request from the table below to review its details.']")
    public WebElement sectionTextMyAssignedDataRequest;

    /** Confidentiality Statement section text */
    @FindBy(xpath = "//li[.='Not use or disclose any confidential or proprietary information;'")
    public WebElement sectionTextConfidentialityStatement;

    /** Native View hyperlink */
    @FindBy(xpath = "//*[@id='nci-header-top']/div/div/div/div[2]/a")
    public WebElement nativeViewHyperlink;

    /** Native View page header */
    @FindBy(xpath = "(//span[.='Data Access Requests'])[1]")
    public WebElement nativeViewPageHeader;

    /** NCCR Data Platform hyperlink */
    @FindBy(xpath = "//*[@id='x2e1819b01b88da90c5c40e1ce54bcba1']/div/div/p/a")
    public WebElement nccrDataPlatformHyperlink;

    /** Data Platform page header */
    @FindBy(xpath = "  //span[.='National Childhood Cancer Registry']")
    public WebElement dataPlatformPageHeader;
}
