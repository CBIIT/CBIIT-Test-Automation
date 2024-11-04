package ServiceNow.NCCR.Pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NCCRPage  extends CommonUtils {
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
    @FindBy(xpath = "//span[.='National Childhood Cancer Registry']")
    public WebElement dataPlatformPageHeader;

    /** Data Requests awaiting my review tab */
    @FindBy(xpath = "//a[.='Data Requests Awaiting My Review']")
    public WebElement dataRequestsAwaitingMyReviewTab;

    /** All Data Data Requests  tab */
    @FindBy(xpath = "//a[.='All Data Requests']")
    public WebElement allDataRequestsTab;

    /** search text field Data Requests awaiting my review tab */
    @FindBy(xpath = "(//input[@name='datatable-search'])[1]")
    public WebElement searchFieldDataRequestsAwaitingMyReviewTab;

    /** search text field All Data Requests tab */
    @FindBy(xpath = "(//input[@name='datatable-search'])[2]")
    public WebElement searchFieldAllDataRequestsTab;

    /** Rows pagination */
    @FindBy(xpath = "(//div[@class='m-t-xs panel-title ng-binding'])[1]")
    public WebElement rowsPaginationDataRequestsAwaitingMyReviewTab;

    /** Rows pagination */
    @FindBy(xpath = "(//div[@class='m-t-xs panel-title ng-binding'])[2]")
    public WebElement rowsPaginationAllDataRequestTab;

    /** show filter button */
    @FindBy(xpath = "//button[@id='filterToggle']")
    public WebElement showFilterButton;

    /** load filter button */
    @FindBy(xpath = "//button[@id='x_g_nci_nccr_data_access_requests-load-filter-button']")
    public WebElement loadFilterButton;

    /** save filter button */
    @FindBy(xpath = "//button[@id='x_g_nci_nccr_data_access_requests-save-filter-button']")
    public WebElement saveFilterButton;

    /** add Sort filter button */
    @FindBy(xpath = "//button[@id='x_g_nci_nccr_data_access_requests-sort-filter-button']")
    public WebElement addSortFilterButton;

    /** new criteria button */
    @FindBy(xpath = "//button[@id='x_g_nci_nccr_data_access_requests-add-new-section']")
    public WebElement newCriteriaButton;

    /** x Filter */
    @FindBy(xpath = "//button[@id='x_g_nci_nccr_data_access_requests-close-filter-button']")
    public WebElement xFilter;


}
