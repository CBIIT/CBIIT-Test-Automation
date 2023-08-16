package ServiceNow.CHARMS.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RAS_Survey_Native_View_Page {

    /**
     * STORE RAS SURVEY NATIVE VIEW ELEMENTS HERE
     */
    /** Diagnosed with a RASopathy by a physician through testing dropdown **/
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.diagnosed_rasopathy']")
    public WebElement dropdownDiagnosedWithRasopathyByPhysician;

    /** Diagnosed with hypoglycemia during the newborn period dropdown **/
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.hypoglycemia']")
    public WebElement dropdownDiagnosedWithHypoglycemiaDuringNewbornPeriod;

    /** Were medications taken while biological mother was pregnant with the participant dropdown **/
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.medications_while_pregnant']")
    public WebElement dropdownWereMedicationsTakenWhileMotherWasPregnant;

    /** Were vaping products use by participants bio mom during pregnancy dropdown **/
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.were_vaping_products_used']")
    public WebElement dropdownWereVapingProductsUsedDuringPregnancy;

    /** Did participants bio mother use recreational drugs during pregnancy dropdown **/
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.drugs_used_during_pregnancy']")
    public WebElement dropdownDidBioMotherUsedRecreationalDrugsDuringPregnancy;

    /** Biological mothers occupation while pregnant with the participant field **/
    @FindBy(xpath = "//div//textarea[@id='x_naci_family_coho_rasopathy_iiq.occuption_while_pregnant']")
    public WebElement fieldBiologicalMothersOccupationWhilePregnant;

    /** Biological mothers occupation unknown checkbox **/
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.bio_mom_occupation_unknown']")
    public WebElement checkboxBiologicalMothersOccupationUnknown;

    /** Biological father occupation unknown checkbox **/
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.bio_dad_occupation_unknown']")
    public WebElement checkboxBiologicalFathersOccupationUnknown;

    /** Did biological mother receive prenatal tests for birth defects/medical problems dropdown **/
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.prenatal_testing']")
    public WebElement dropdownDidBioMotherReceivePrenatalTests;

    /** Did participants biological mother use tobacco products while pregnant dropdown **/
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.tobacco_used_while_pregnant_mom']")
    public WebElement dropdownDidBioMotherUseTobacco;

    /** Did participants biological mother drink alcohol while pregnant with participant dropdown **/
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.alcohol_while_pregnant']")
    public WebElement dropdownDidBioMotherUseAlcohol;

    /** Did the participants mother ever live/work in a place where others use tobacco dropdown **/
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.live_work_near_tobacco_usage']")
    public WebElement dropdownDidBioMotherEverLiveWorkWhereOtherUseTobacco;

    /** Biological fathers occupation while mother was pregnant with the participant field **/
    @FindBy(xpath = "//div//textarea[@id='x_naci_family_coho_rasopathy_iiq.fathers_occupation_while_pregnant']")
    public WebElement fieldBioFatherOccupationWhileMotherWasPregnant;

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
