package ServiceNow.CHARMS.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RAS_Survey_Native_View_Page {

    /**
     * STORE RAS SURVEY NATIVE VIEW ELEMENTS HERE
     */

    /** ------------------BEGINNING OF DEMOGRAPHIC INFORMATION SECTION--------------------- */

    /** Included in published case report or in a different public manner drop down */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.published_case']")
    public WebElement includedInPublishedCaseReportDropDown;

    /** Included in published case report or in a different public manner drop down values */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.published_case']//option")
    public List<WebElement> includedInPublishedCaseReportDropDownValues;

    /** Biological Mother Birth Location text field */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.bio_mom_birth_location']")
    public WebElement biologicalMotherBirthLocation;

    /** Biological Mother Birth Location Unknown checkbox */
    @FindBy(xpath = "//label[@id='label.ni.x_naci_family_coho_rasopathy_iiq.bio_mom_birth_location_unknown']")
    public WebElement biologicalMotherBirthLocationUnknown;

    /** Biological Mothers Age At Birth text field */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.bio_mom_age']")
    public WebElement biologicalMothersAgeAtBirth;

    /** Biological Mothers Heigth (cm) number/digit field */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.mom_height']")
    public WebElement biologicalMothersHeight;

    /** Biological Mothers Heigth Unknown checkbox */
    @FindBy(xpath = "//label[@id='label.ni.x_naci_family_coho_rasopathy_iiq.bio_mom_height_unknown']")
    public WebElement biologicalMothersHeightUnknown;

    /** Biological Father Birth Location text field */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.bio_dad_birth_location']")
    public WebElement biologicalFatherBirthLocation;

    /** Biological Father Birth Location Unknown checkbox */
    @FindBy(xpath = "//label[@id='label.ni.x_naci_family_coho_rasopathy_iiq.bio_dad_birth_location_unknown']")
    public WebElement biologicalFatherBirthLocationUnknown;

    /** Biological Fathers Age At Birth text field */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.bio_dad_age']")
    public WebElement biologicalFathersAgeAtBirth;

    /** Biological Fathers Heigth (cm) number/digit field */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.dad_height']")
    public WebElement biologicalFathersHeight;

    /** Biological Father Heigth Unknown checkbox */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.dad_height']")
    public WebElement biologicalFatherHeightUnknown;

    /** Update Button on Demographics tab */
    @FindBy(xpath = "//button[@id='sysverb_update_bottom']")
    public WebElement updateButton;

    /** Add Attachment Button on Demographics tab */
    @FindBy(xpath = "//button[@id='add_attachment_bottom']")
    public WebElement addAttachmentButton;

    /** Insert Button on Demographics tab */
    @FindBy(xpath = "//button[@id='sysverb_insert_bottom']")
    public WebElement insertButton;

    /** Insert And Stay Button on Demographics tab */
    @FindBy(xpath = "//button[@id='sysverb_insert_and_stay_bottom']")
    public WebElement insertAndStayButton;

    /** Save Button on Demographics tab */
    @FindBy(xpath = "//button[@id='sysverb_update_and_stay_bottom']")
    public WebElement saveButtonDemographicsTab;

    /** Insert And Stay Button on Demographics tab */
    @FindBy(xpath = "//button[@id='sysverb_delete_bottom']")
    public WebElement deleteButtonDemographicsTab;

    /** ------------------END OF DEMOGRAPHIC INFORMATION SECTION--------------------- */

    /***
     * USE THIS METHOD TO DYNAMICALLY LOCATE TABS BY SPECIFYING EXACT TEXT
     * @param text
     * @return
     */
    public WebElement dynamicTabLocator(String text){
        return WebDriverUtils.webDriver.findElement(By.xpath("//span[text()='"+ text +"']"));
    }
    public RAS_Survey_Native_View_Page(){
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
