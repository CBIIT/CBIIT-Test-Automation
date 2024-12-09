package PLATFORM_BUSINESS.NCCR.pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NCCRPage {

    /**My Assigned Data Requests section*/
    @FindBy(xpath = "//h1//strong[.='My Assigned Data Requests']")
    public WebElement sectionMyAssignedDataRequest;

    /**Confidentiality Statement section*/
    @FindBy(xpath = "//h3//strong[.='Confidentiality Statement']")
    public WebElement sectionConfidentialityStatement;

    /**My Assigned Data Requests section text*/
    @FindBy(xpath = "//p[.='This page allows you to manage the NCCR data requests that you have been assigned to review. You can select a data request from the table below to review its details.']")
    public WebElement sectionTextMyAssignedDataRequest;

    /**Confidentiality Statement section text*/
    @FindBy(xpath = "//li[.='Not use or disclose any confidential or proprietary information;'")
    public WebElement sectionTextConfidentialityStatement;

    /**Native View hyperlink*/
    @FindBy(xpath = "//a[@href='https://service-test.nci.nih.gov/now/nav/ui/classic/params/target/x_g_nci_nccr_data_access_requests_list.do%3Fsysparm_userpref_module%3D90a7559a1bdcce50d4c852c6624bcbcd%26sysparm_query%3Dstate%253D5%255EreviewersDYNAMIC90d1921e5f510100a9ad2572f2b477fe%255EEQ']")
    public WebElement nativeViewHyperlink;

    /**NCCR Data Platform hyperlink*/
    @FindBy(xpath = "(//a[@href='https://nccrdataplatform.ccdi.cancer.gov/home'])[2]")
    public WebElement nccrDataPlatformHyperlink;

    /**Data Requests awaiting my review tab*/
    @FindBy(xpath = "//a[.='Data Requests Awaiting My Review']")
    public WebElement dataRequestsAwaitingMyReviewTab;

    /**All Data Data Requests  tab*/
    @FindBy(xpath = "//li[@heading=' All Data Requests']")
    public WebElement allDataRequestsTab;

    /**Search text field Data Requests awaiting my review tab*/
    @FindBy(xpath = "(//input[@name='datatable-search'])[1]")
    public WebElement searchFieldDataRequestsAwaitingMyReviewTab;

    /**Search text field All Data Requests tab*/
    @FindBy(xpath = "(//input[@name='datatable-search'])[2]")
    public WebElement searchFieldAllDataRequestsTab;

    /**Rows pagination*/
    @FindBy(xpath = "(//div [@class='btn-toolbar m-r pull-left'])[1]")
    public WebElement rowsPaginationDataRequestsAwaitingMyReviewTab;

    /**Rows pagination*/
    @FindBy(xpath = "(//div [@class='btn-toolbar m-r pull-left'])[2]")
    public WebElement rowsPaginationAllDataRequestTab;

    /**Show filter button*/
    @FindBy(xpath = "//button[@id='filterToggle']")
    public WebElement showFilterButton;

    /**Load filter button*/
    @FindBy(xpath = "//button[@id='x_g_nci_nccr_data_access_requests-load-filter-button']")
    public WebElement loadFilterButton;

    /**Save filter button*/
    @FindBy(xpath = "//button[@id='x_g_nci_nccr_data_access_requests-save-filter-button']")
    public WebElement saveFilterButton;

    /**Add Sort filter button*/
    @FindBy(xpath = "//button[@id='x_g_nci_nccr_data_access_requests-sort-filter-button']")
    public WebElement addSortFilterButton;

    /**New criteria button*/
    @FindBy(xpath = "//button[@id='x_g_nci_nccr_data_access_requests-add-new-section']")
    public WebElement newCriteriaButton;

    /**x Filter*/
    @FindBy(xpath = "//button[@id='x_g_nci_nccr_data_access_requests-close-filter-button']")
    public WebElement xFilter;

    public NCCRPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
