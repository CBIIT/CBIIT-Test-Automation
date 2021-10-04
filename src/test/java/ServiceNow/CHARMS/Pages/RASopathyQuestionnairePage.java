package ServiceNow.CHARMS.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.WebDriverUtils;

public class RASopathyQuestionnairePage {

	/** --------------- BEGINNING OF RASopathy Questionnaire PAGE --------------- */

	/* STUDY INTRODUCTION next button (THIS WORKS FOR ALL NEXT BUTTONS) */
	@FindBy(xpath = "//input[@title='→']")
	public WebElement studyNextButton;

	/**
	 * --------------- BEGINNING OF Are you completing this form for someone else or
	 * for yourself? PAGE ---------------
	 */

	/* I am completing this form for someone else option */
	@FindBy(xpath = "//span[contains(text(),'I am completing this form for someone else')]")
	public WebElement iAmCompletingThisFormForSomeoneElseOption;

	/**
	 * --------------- END OF Are you completing this form for someone else or for
	 * yourself? PAGE ---------------
	 */

	/**
	 * --------------- BEGINNING OF What is the name of the person who may be
	 * eligible for this study? PAGE ---------------
	 */

	/* First Name text box */
	@FindBy(xpath = "//input[@name='QR~QID105~4~TEXT']")
	public WebElement firstNameTextBox;

	/* Middle Name text box */
	@FindBy(xpath = "//input[@name='QR~QID105~5~TEXT']")
	public WebElement middleNameTextBox;

	/* Last Name text box */
	@FindBy(xpath = "//input[@name='QR~QID105~6~TEXT']")
	public WebElement lastNameTextBox;

	/**
	 * --------------- END OF What is the name of the person who may be eligible for
	 * this study? PAGE ---------------
	 */

	/** --------------- BEGINNING OF What is your name? PAGE --------------- */

	/* First Name of What is your name? text box */
	@FindBy(xpath = "//input[@name='QR~QID3~4~TEXT']")
	public WebElement firstNameWhatIsYourNameTextBox;

	/* Middle Name of What is your name? text box */
	@FindBy(xpath = "//input[@name='QR~QID3~5~TEXT']")
	public WebElement middleNameWhatIsYourNameTextBox;

	/* Last Name of What is your name? text box */
	@FindBy(xpath = "//input[@name='QR~QID3~6~TEXT']")
	public WebElement lastNameWhatIsYourNameTextBox;

	/** --------------- END OF What is your name? PAGE --------------- */

	/**
	 * --------------- BEGINNING OF What is your relationship to name? PAGE
	 * ---------------
	 */

	/* What is your relationship to name? Other option */
	@FindBy(xpath = "//span[contains(text(),'Other')]")
	public WebElement whatIsYourRelationshipToNameOption;

	/* What is your relationship to name? Other text box */
	@FindBy(xpath = "//input[@title='Other']")
	public WebElement whatIsYourRelationshipToNameTextBox;

	/**
	 * --------------- END OF What is your relationship to name? PAGE
	 * ---------------
	 */

	/**
	 * --------------- BEGINNING OF Are you the legal guardian of -- name? PAGE
	 * ---------------
	 */

	/* Are you the legal guardian of -- name? Yes option */
	@FindBy(xpath = "//span[@class='LabelWrapper']//label[@for='QR~QID5~1']")
	public WebElement areYouTheLegalGuardianYesOption;

	/**
	 * --------------- END OF Are you the legal guardian of automated name? PAGE
	 * ---------------
	 */

	/** --------------- BEGINNING OF Date of birth of "name" PAGE --------------- */

	/* Calendar month drop down */
	@FindBy(xpath = "//select[@aria-label='Month']")
	public WebElement calendarMonthDropDown;

	/* Calendar year text box */
	@FindBy(xpath = "//input[@aria-label='Year']")
	public WebElement calendarYearTextBox;

	/* Calendar day option */
	@FindBy(xpath = "//span[@aria-label='April 1, 1990']")
	public WebElement calendarDayOption;

	/** --------------- END OF Date of birth of "name" PAGE --------------- */

	/**
	 * --------------- BEGINNING OF Sex of "name" assigned at birth PAGE
	 * ---------------
	 */

	/* Sex Male option */
	@FindBy(xpath = "//span[contains(text(),'Male')]")
	public WebElement sexMaleOptionAssignedAtBirth;

	/**
	 * --------------- END OF Sex of "name" assigned at birth PAGE ---------------
	 */
	
	/** --------------- BEGINNING OF Is "name" adopted? PAGE --------------- */
	
	/* Yes option */
	@FindBy(xpath = "//span[@class='LabelWrapper']//label[@for='QR~QID11~1']")
	public WebElement isProxyAdoptedYesOption;
	
	
	/** --------------- END OF Is "name" adopted? PAGE --------------- */
	
	/** --------------- BEGINNING OF Is "name" still alive? PAGE --------------- */
	
	/* Yes option */
	@FindBy(xpath = "//span[@class='LabelWrapper']//label[@for='QR~QID12~1']")
	public WebElement isProxyStillAliveYesOption;
	
	
	/** --------------- END OF Is "name" still alive? PAGE --------------- */
	
	/** --------------- BEGINNING OF Does "name" currently live in the United States? PAGE --------------- */
	
	/* Yes option */
	@FindBy(xpath = "//span[@class='LabelWrapper']//label[@for='QR~QID112~1']")
	public WebElement doesProxyLiveInUnitedStatesYesOption;
	
	
	/** --------------- END OF Does "name" currently live in the United States? PAGE --------------- */
	
	/** --------------- BEGINNING OF Does "name" currently live in the United States? PAGE --------------- */
	
	/* Street text box */
	@FindBy(xpath = "//input[@name='QR~QID14~4~TEXT']")
	public WebElement addressForStudyMaterialsToBeSentStreetTextBox;
	
	/* City text box */
	@FindBy(xpath = "//input[@name='QR~QID14~6~TEXT']")
	public WebElement addressForStudyMaterialsToBeSentCityTextBox;
	
	/* State text box */
	@FindBy(xpath = "//input[@name='QR~QID14~7~TEXT']")
	public WebElement addressForStudyMaterialsToBeSentStateTextBox;
	
	/* Zip Code text box */
	@FindBy(xpath = "//input[@name='QR~QID14~8~TEXT']")
	public WebElement addressForStudyMaterialsToBeSentZipCodeTextBox;
	
	
	/** --------------- END OF Does "name" currently live in the United States? PAGE --------------- */
	
	/** --------------- BEGINNING OF What is your email address? PAGE --------------- */
	
	/* Email address text box */
	@FindBy(xpath = "//input[@name='QR~QID15~TEXT']")
	public WebElement whatIsYourEmailAddressTextBox;
	
	/** --------------- END OF What is your email address? PAGE --------------- */
	
	/** --------------- BEGINNING OF Please confirm your email address PAGE --------------- */
	
	/* Email address text box */
	@FindBy(xpath = "//input[@name='QR~QID16~TEXT']")
	public WebElement pleaseConfirmYourEmailAddressTextBox;
	
	/** --------------- END OF Please confirm your email address PAGE --------------- */
	
	/** --------------- BEGINNING OF Please list your phone numbers below. Please also select your preferred contact number. PAGE --------------- */
	
	/* Home phone number text box  */
	@FindBy(xpath = "//input[@name='QR~QID17~4~TEXT']")
	public WebElement pleaseListHomePhoneNumberTextBox;
	
	/* Cell phone number text box  */
	@FindBy(xpath = "//input[@name='QR~QID17~5~TEXT']")
	public WebElement pleaseListCellPhoneNumberTextBox;
	
	/* Work phone number text box  */
	@FindBy(xpath = "//input[@name='QR~QID17~8~TEXT']")
	public WebElement pleaseListWorkPhoneNumberTextBox;
	
	/* Preferred Contact cell phone number check box  */
	@FindBy(xpath = "//tbody/tr[@class='ChoiceRow ReadableAlt ']/td[1]/label[1]")
	public WebElement pleaseSelectCellPhonePreferredContactCheckBox;
	
	
	/** --------------- END OF Please list your phone numbers below. Please also select your preferred contact number. PAGE --------------- */
	
	/** --------------- BEGINNING OF Ethnicity of "Name" PAGE --------------- */
	
	/* Not hispanic/latino option  */
	@FindBy(xpath = "//span[contains(@class,'LabelWrapper')]//label[contains(@for,'QR~QID18~2')]")
	public WebElement authenticityOfProxyNotHispanicLatinoOption;
	
	/** --------------- END OF Ethnicity of "Name" PAGE --------------- */
	
	

	/** --------------- END OF RASopathy Questionnaire PAGE --------------- */

	public RASopathyQuestionnairePage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

}
