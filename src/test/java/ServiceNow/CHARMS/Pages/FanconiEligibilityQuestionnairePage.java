package ServiceNow.CHARMS.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class FanconiEligibilityQuestionnairePage  extends CommonUtils{
  
    public FanconiEligibilityQuestionnairePage(){
        PageFactory.initElements(WebDriverUtils.webDriver, this);  
    }
    
    /* *************************************************************** */
	/* ************ GENERAL LOCATORS ON Fanconi ELigibility Questionnaire PAGE ************* */
	/* *************************************************************** */
    
    /* Next Button */
 	@FindBy(xpath = "//input[@class='NextButton Button']")
 	public WebElement nextButton;
 	
 	/* Question Label:Please indicate your relationship to the participant. */
	@FindBy(xpath = "(//span[normalize-space()='Please indicate your relationship to the participant.'])[1]")
	public WebElement relationshipToParticipantLabel;
 	

 	
     
  
}
