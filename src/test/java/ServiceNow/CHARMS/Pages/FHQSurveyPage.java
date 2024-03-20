package ServiceNow.CHARMS.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class FHQSurveyPage extends CommonUtils {

	public FHQSurveyPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

	/* Native View Filter Navigator */
	@FindBy(xpath = "//input[@id='filter']")
	public WebElement nVFHQFilterNavigator;

	/* Native View Record Producers Link */
	@FindBy(xpath = "//div[@class=\"sn-widget-list-title\"][normalize-space()=\"Record Producers\"]")
	public WebElement nVFHQRecordProducers;

	/* Native View FHQ Record Producers iframe */
	@FindBy(xpath = "//iframe[@id='gsft_main']")
	public WebElement nVFHQRecordProducersIframe;

	/* Native View Preview FHQ Patient Personals */
	@FindBy(xpath = "//a[@aria-label=\"Preview record: FHQ Patient Personals\"]")
	public WebElement nVFHQPreviewPatientPersonalslink;

	/* Native View FHQ Patient Personals Open record link */
	@FindBy(xpath = "//a[normalize-space()=\"Open Record\"]")
	public WebElement nVFHQPatientPersonalsOpenRecordButton;

	/* Native View FHQ Patient Personals Preview Item Button */
	@FindBy(xpath = "//a[normalize-space()=\"Preview Item\"]")
	public WebElement nVFHQPatientPersonalsPreviewItemButton;

	/* Native View FHQ Patient Personals: New Details of patient immediate family banner */
	@FindBy(xpath = "//span[normalize-space()=\"New Details of patient immediate family.\"]")
	public WebElement nVFHQPatientPersonalsNewDetailsBanner;

	/*
	 * Native View FHQ Patient Personals: To confirm your identity, please indicate
	 * your relationship to the participant. Label
	 */

	@FindBy(xpath = "//span[contains(text(),\"To confirm your identity, please indicate your rel\")]")
	public WebElement nVFHQPatientPersonalsRelationshipToPatientLabel;

	/*
	 * Native View FHQ Patient Personals: To confirm your identity, please indicate
	 * your relationship to the participant. Drop-down
	 */

	@FindBy(xpath = "//select[contains(@name,\"IO:11ff6ecd1b99c190e541631ee54bcb8c\")]")
	public WebElement nVFHQPatientPersonalsRelationshipToPatientDropDown;

	/*
	 * Native View FHQ Patient Personals: Are you currently married or in a
	 * long-term relationship? Label
	 */
	@FindBy(xpath = "//span[contains(text(),\"Are you currently married or in a long-term relati\")]")
	public WebElement nVFHQPatientPersonalsCurrentlyMarriedLabel;

	/*
	 * Native View FHQ Patient Personals: Are you currently married or in a
	 * long-term relationship? Drop-down
	 */
	@FindBy(xpath = "//select[@name=\"IO:14c9ce0f1bf88d906daea681f54bcbaa\"]")
	public WebElement nVFHQPatientPersonalsCurrentlyMarriedDropDown;

	/*
	 * Native View FHQ Patient Personals: Please fill out the following about your
	 * current partner label
	 */
	@FindBy(xpath = "//span[contains(text(),\"Please fill out the following about your current p\")]")
	public WebElement nVFHQPatientPersonalsCurrentPartnerLabel;

	/* Native View FHQ Patient Personals: Current partner First Name Label */
	@FindBy(xpath = "//span[normalize-space()=\"First Name\"]")
	public WebElement nVFHQPatientPersonalsCurrentPartnerFirstNameLabel;;

	/* Native View FHQ Patient Personals: Current partner First Name textBox */
	@FindBy(xpath = "//input[@id=\"IO:99109a4b1b3c8d906daea681f54bcbf1\"]")
	public WebElement nVFHQPatientPersonalsCurrentPartnerFirstNameTextBox;

	/*
	 * Native View FHQ Patient Personals: Current partner Initial of Last Name Label
	 */
	@FindBy(xpath = "//span[normalize-space()=\"Initial of Last Name\"]")
	public WebElement nVFHQPatientPersonalsCurrentPartnerInitialLastNameLabel;

	/*
	 * Native View FHQ Patient Personals: Current partner Initial of Last Name
	 * Drop-down
	 */
	@FindBy(xpath = "//select[@name=\"IO:aa909e8b1b3c8d906daea681f54bcbaa\"]")
	public WebElement nVFHQPatientPersonalsCurrentPartnerInitialLastNameDropDown;

	/* Native View FHQ Patient Personals: Vital Status Label */
	@FindBy(xpath = "//span[normalize-space()=\"Vital Status\"]")
	public WebElement nVFHQPatientPersonalsCurrentPartnerVitalStatusLabel;

	/* Native View FHQ Patient Personals: Vital Status Drop-down */
	@FindBy(xpath = "//select[contains(@name,\"IO:88defecf1b9dc1d0e541631ee54bcb2b\")]")
	public WebElement nVFHQPatientPersonalsCurrentPartnerVitalStatusDropDown;

	/*
	 * Native View FHQ Patient Personals: Please identify the number of each of the
	 * following pregnancy results Label
	 */
	@FindBy(xpath = "//span[contains(text(),\"Please identify the number of each of the followin\")]")
	public WebElement nVFHQPatientPersonalsPregnancyResultsLabel;

	/*
	 * Native View FHQ Patient Personals: How many TOTAL pregnancies have you had or
	 * fathered? Label
	 */
	@FindBy(xpath = "//span[contains(text(),\"How many TOTAL pregnancies have you had or fathere\")]")
	public WebElement nVFHQPatientPersonalsTotalPregnanciesFatheredLabel;

	/*
	 * Native View FHQ Patient Personals: How many TOTAL pregnancies have you had or
	 * fathered? Drop-down
	 */
	@FindBy(xpath = "//select[contains(@name,\"IO:5c49da8f1b7c8d906daea681f54bcb5a\")]")
	public WebElement nVFHQPatientPersonalsTotalPregnanciesFatheredDropDown;

	/*
	 * Native View FHQ Patient Personals: Have all of your pregnancies been with
	 * Current Partner? Label
	 */
	@FindBy(xpath = "//span[contains(text(),\"Have all of your pregnancies been with Current Par\")]")
	public WebElement nVFHQPatientPersonalsAllPregnanciesWithCurrentPartnerLabel;

	/*
	 * Native View FHQ Patient Personals: Have all of your pregnancies been with
	 * Current Partner? Drop-down
	 */
	@FindBy(xpath = "//select[@name=\"IO:8d82bd381b1545906daea681f54bcb7f\"]")
	public WebElement nVFHQPatientPersonalsAllPregnanciesWithCurrentPartnerDropDown;

	/* Native View FHQ Patient Personals:Total Number of Live Births Label */
	@FindBy(xpath = "//span[normalize-space()=\"Total Number of Live Births\"]")
	public WebElement nVFHQPatientPersonalsTotalLiveBirthsLabel;

	/* Native View FHQ Patient Personals:Total Number of Live Births Drop-down */
	@FindBy(xpath = "//select[@name=\"IO:11cb52431bbc8d906daea681f54bcbfe\"]")
	public WebElement nVFHQPatientPersonalsTotalLiveBirthsDropDown;

	/* Native View FHQ Patient Personals: Total Number of Miscarriages Label */
	@FindBy(xpath = "//span[normalize-space()=\"Total Number of Miscarriages\"]")
	public WebElement nVFHQPatientPersonalsTotalMiscarriagesLabel;

	/* Native View FHQ Patient Personals: Total Number of Miscarriages Drop-down */
	@FindBy(xpath = "//select[@name=\"IO:c81c92c31bbc8d906daea681f54bcbac\"]")
	public WebElement nVFHQPatientPersonalsTotalMiscarriagesDropDown;

	/* Native View FHQ Patient Personals: Total Number of Stillbirths Label */
	@FindBy(xpath = "//span[normalize-space()=\"Total Number of Stillbirths\"]")
	public WebElement nVFHQPatientPersonalsTotalStillbirthsLabel;

	/* Native View FHQ Patient Personals: Total Number of Stillbirths Drop-down */
	@FindBy(xpath = "//select[@name=\"IO:8e4c16071bbc8d906daea681f54bcb70\"]")
	public WebElement nVFHQPatientPersonalsTotalStillbirthsDropDown;

	/* Native View FHQ Patient Personals: Total Number of Induced Abortions Label */
	@FindBy(xpath = "//span[normalize-space()=\"Total Number of Induced Abortions\"]")
	public WebElement nVFHQPatientPersonalsTotalInducedAbortionsLabel;

	/*
	 * Native View FHQ Patient Personals: Total Number of Induced Abortions
	 * Drop-down
	 */
	@FindBy(xpath = "//select[contains(@name,\"IO:458cd6c71bbc8d906daea681f54bcb16\")]")
	public WebElement nVFHQPatientPersonalsTotalInducedAbortionsDropDown;

	/*
	 * Native View FHQ Patient Personals: Total Number of Tubal/Ectopic/Molar
	 * Pregnancies Label
	 */
	@FindBy(xpath = "//tr[@id=\"element.IO:0cbcdec71bbc8d906daea681f54bcb5d\"]//span[2]")
	public WebElement nVFHQPatientPersonalsTotalTubalEctopicMolarPregnanciesLabel;

	/*
	 * Native View FHQ Patient Personals: Total Number of Tubal/Ectopic/Molar
	 * Pregnancies Drop-down
	 */
	@FindBy(xpath = "//select[contains(@name,\"IO:0cbcdec71bbc8d906daea681f54bcb5d\")]")
	public WebElement nVFHQPatientPersonalsTotalTubalEctopicMolarPregnanciesDropDown;

	/*
	 * Native View FHQ Patient Personals: How many total children do you have? Label
	 */
	@FindBy(xpath = "//span[normalize-space()=\"How many total children do you have?\"]")
	public WebElement nVFHQPatientPersonalsTotalChildrenHaveLabel;

	/* Native View FHQ Patient Personals: More Information Link */
	@FindBy(xpath = "//div[contains(@class,\"form-group is-required sc-row sc-row-6\")]//span[contains(@name,\"test\")]")
	public WebElement nVFHQPatientPersonalsTotalChildrenHaveInformationLink;

	/* Native View FHQ Patient Personals: More Information Label */
	@FindBy(xpath = "//div[contains(text(),\"You may include biological, adopted, step, or dono\")]")
	public WebElement nVFHQPatientPersonalsTotalChildrenHaveInformationLabel;
	/*
	 * Native View FHQ Patient Personals: How many total children do you have?
	 * Drop-down
	 */
	@FindBy(xpath = "//select[contains(@name,\"IO:45831a171b7041d06daea681f54bcbd0\")]")
	public WebElement nVFHQPatientPersonalsTotalChildrenHaveDropDown;

	/* Native View FHQ Patient Personals: Child MRVS Label */
	@FindBy(xpath = "//span[normalize-space()=\"Child\"]")
	public WebElement nVFHQPatientPersonalsChildMRVSLabel;

	/* Native View FHQ Patient Personals: Child MRVS Add Button */
	@FindBy(xpath = "//button[@id=\"1580be461b7085906daea681f54bcbc6Add\"]")
	public WebElement nVFHQPatientPersonalsChildMRVSAddButton;

	/* Native View FHQ Patient Personals: Child MRVS Remove All */
	@FindBy(xpath = "//button[@id=\"1580be461b7085906daea681f54bcbc6removeAllRows\"]")
	public WebElement nVFHQPatientPersonalsChildMRVSRemoveAllButton;

	/* Native View FHQ Patient Personals: Patient's Child Add Row Iframe */
	@FindBy(xpath = "//iframe[@id='dialog_frame']")
	public WebElement nVFHQPatientPersonalsChildMRVSAddRowPageIframe;

	/* Native View FHQ Patient Personals: Patient's Child Add Row Page label */
	@FindBy(xpath = "//h2[@id=\"catalog_table_variable_dialog_title\"]")
	public WebElement nVFHQPatientPersonalsChildMRVSAddRowPageLabel;

	/* Native View FHQ Patient Personals: Patient's Child First Name Label */
	@FindBy(xpath = "//span[normalize-space()=\"First Name\"]")
	public WebElement nVFHQPatientPersonalsChildMRVSAddRowFirstNameLabel;

	/* Native View FHQ Patient Personals: Patient's Child First Name TextBox */
	@FindBy(xpath = "//input[@class=\"cat_item_option sc-content-pad form-control\"]")
	public WebElement nVFHQPatientPersonalsChildMRVSAddRowFirstNameTextBox;

	/*
	 * Native View FHQ Patient Personals: Patient's Child First Initial of LAST name
	 * Label
	 */
	@FindBy(xpath = "//span[normalize-space()=\"First Initial of LAST name\"]")
	public WebElement nVFHQPatientPersonalsChildMRVSAddRowFirstInitialLastNameLabel;

	/*
	 * Native View FHQ Patient Personals: Patient's Child First Initial of LAST name
	 * Drop-down
	 */
	@FindBy(xpath = "//select[@id=\"IO:783ffcd11b410510e541631ee54bcb39\"]")
	public WebElement nVFHQPatientPersonalsChildMRVSAddRowFirstInitialLastNameDropDown;

	/* Native View FHQ Patient Personals: Patient's Child Vital Status Label */
	@FindBy(xpath = "//span[normalize-space()=\"Vital Status\"]")
	public WebElement nVFHQPatientPersonalsChildMRVSAddRowVitalStatusLabel;

	/* Native View FHQ Patient Personals: Patient's Child Vital Status Drop-down */
	@FindBy(xpath = "//select[@id=\"IO:5fd534291b110d906daea681f54bcb2f\"]")
	public WebElement nVFHQPatientPersonalsChildMRVSAddRowVitalStatusDropDown;

	/*
	 * Native View FHQ Patient Personals: Patient's Child MRVS Add Row page Add
	 * Button
	 */
	@FindBy(xpath = "//button[normalize-space()=\"Add\"]")
	public WebElement nVFHQPatientPersonalsChildMRVSAddRowAddButton;

	/*
	 * Native View FHQ Patient Personals: Patient's Child MRVS Add Row page Close
	 * Button
	 */
	@FindBy(xpath = "//button[normalize-space()=\"Close\"]")
	public WebElement nVFHQPatientPersonalsChildMRVSAddRowCloseButton;

	/*
	 * Native View FHQ Patient Personals: Have all of your children been with
	 * Current Partner? Label
	 */
	@FindBy(xpath = "//span[contains(text(),\"Have all of your children been with Current Partne\")]")
	public WebElement nVFHQPatientPersonalsChildrenWithCurrentPartnerLabel;

	/*
	 * Native View FHQ Patient Personals: Have all of your children been with
	 * Current Partner? Drop-down
	 */
	@FindBy(xpath = "//tbody/tr[12]/td[1]/div[1]/div[1]/div[2]/select[1]")
	public WebElement nVFHQPatientPersonalsChildrenWithCurrentPartnerDropDown;

	/*
	 * Native View FHQ Patient Personals: How many total different partners have you
	 * had biological children with? Label
	 */
	@FindBy(xpath = "//span[@class=\"sn-tooltip-basic \"][contains(text(),\"How many total different partners have you had bio\")]")
	public WebElement nVFHQPatientPersonalsTotalDiffPartnersBioChildrenWithLabel;

	/*
	 * Native View FHQ Patient Personals: How many total different partners have you
	 * had biological children with? More Information banner
	 */
	@FindBy(xpath = "//span[@id=\"question_help_IO_9b845a571b7041d06daea681f54bcb79_toggle\"]")
	public WebElement nVFHQPatientPersonalsTotalDiffPartnersBioChildrenWithMoreInfoLabel;

	/*
	 * Native View FHQ Patient Personals: How many total different partners have you
	 * had biological children with? More Information banner text
	 */
	@FindBy(xpath = "//div[contains(text(),\"We will ask about donor materials (i.e. sperm, egg\")]")
	public WebElement nVFHQPatientPersonalsTotalDiffPartnersBioChildrenWithMoreInfotext;

	/*
	 * Native View FHQ Patient Personals: How many total different partners have you
	 * had biological children with? Drop-down
	 */
	@FindBy(xpath = "//select[@id=\"IO:9b845a571b7041d06daea681f54bcb79\"]")
	public WebElement nVFHQPatientPersonalsTotalDiffPartnersBioChildrenWithdrpDown;

	/* Native View FHQ Patient Personals: Patient's Partner MRVS Label */
	@FindBy(xpath = "//span[normalize-space()=\"Partner\"]")
	public WebElement nVFHQPatientPersonalsPartnerMRVSLabel;

	/* Native View FHQ Patient Personals: Patient's Partner MRVS Add Button */
	@FindBy(xpath = "//button[@id=\"98ceea421b7085906daea681f54bcb2fAdd\"]")
	public WebElement nVFHQPatientPersonalsPartnerMRVSAddButton;

	/*
	 * Native View FHQ Patient Personals: Patient's Partner MRVS Remove All Button
	 */
	@FindBy(xpath = "//button[@id=\"98ceea421b7085906daea681f54bcb2fremoveAllRows\"]")
	public WebElement nVFHQPatientPersonalsPartnerMRVSRemoveAllbutton;

	/* Native View FHQ Patient Personals: Patient's Partner Add Row Page Iframe */
	@FindBy(xpath = "//iframe[@id='dialog_frame']")
	public WebElement nVFHQPatientPersonalsPartnerMRVSAddRowPageIframe;

	/* Native View FHQ Patient Personals: Patient's Partner Add Row Page label */
	@FindBy(xpath = "//h2[@id=\"catalog_table_variable_dialog_title\"]")
	public WebElement nVFHQPatientPersonalsPartnerMRVSAddRowPageLabel;

	/* Native View FHQ Patient Personals: Patient's Partner First Name Label */
	@FindBy(xpath = "//span[normalize-space()=\"First Name\"]")
	public WebElement nVFHQPatientPersonalsPartnerMRVSAddRowFirstNameLabel;

	/* Native View FHQ Patient Personals: Patient's Partner First Name TextBox */
	@FindBy(xpath = "//input[@id=\"IO:2a0f66ce1b3085906daea681f54bcbc0\"]")
	public WebElement nVFHQPatientPersonalsPartnerMRVSAddRowFirstNameTextBox;

	/*
	 * Native View FHQ Patient Personals: Patient's Partner First Initial of LAST
	 * name Label
	 */
	@FindBy(xpath = "//span[normalize-space()=\"First Initial of LAST name\"]")
	public WebElement nVFHQPatientPersonalsPartnerMRVSAddRowFirstInitialLastNameLabel;

	/*
	 * Native View FHQ Patient Personals: Patient's Partner First Initial of LAST
	 * name Drop-down
	 */
	@FindBy(xpath = "//select[@id=\"IO:dd09910f1bf08d906daea681f54bcb2c\"]")
	public WebElement nVFHQPatientPersonalsPartnerMRVSAddRowFirstInitialLastNameDropDown;

	/* Native View FHQ Patient Personals: Patient's Partner Vital Status Label */
	@FindBy(xpath = "//span[normalize-space()=\"Vital Status\"]")
	public WebElement nVFHQPatientPersonalsPartnerMRVSAddRowVitalStatusLabel;

	/*
	 * Native View FHQ Patient Personals: Patient's Partner Vital Status Drop-down
	 */
	@FindBy(xpath = "//select[@id=\"IO:a833963b1b454950e541631ee54bcbc3\"]")
	public WebElement nVFHQPatientPersonalsPartnerMRVSAddRowVitalStatusDropDown;

	/*
	 * Native View FHQ Patient Personals: Patient's Partner MRVS Add Row page Add
	 * Button
	 */
	@FindBy(xpath = "//button[normalize-space()=\"Add\"]")
	public WebElement nVFHQPatientPersonalsPartnerMRVSAddRowAddButton;

	/*
	 * Native View FHQ Patient Personals: Patient's Partner MRVS Add Row page Close
	 * Button
	 */
	@FindBy(xpath = "//button[normalize-space()=\"Close\"]")
	public WebElement nVFHQPatientPersonalsPartnerMRVSAddRowCloseButton;

	/*
	 * Native View FHQ Patient Personals: We would like to ask you some questions
	 * about Siblings details Banner
	 */
	@FindBy(xpath = "//span[contains(text(),\"We would like to ask you some questions about Sibl\")]")
	public WebElement nVFHQPatientPersonalsSiblingsDetailsBanner;

	/* Native View FHQ Patient Personals: How many siblings do you have? Label */
	@FindBy(xpath = "//span[normalize-space()=\"How many siblings do you have?\"]")
	public WebElement nVFHQPatientPersonalsTotalSiblingsHaveLabel;

	/*
	 * Native View FHQ Patient Personals: How many siblings do you have? Drop-down
	 */
	@FindBy(xpath = "(// td [@class=\"iotd container-iotd\"])[5]//select[@class=\"form-control cat_item_option \"]")
	public WebElement nVFHQPatientPersonalsTotalSiblingsHaveDropDown;

	/*
	 * Native View FHQ Patient Personals: Patient's Siblings MRVS Details of your
	 * siblings Label.
	 */
	@FindBy(xpath = "//span[normalize-space()=\"Siblings\"]")
	public WebElement nVFHQPatientPersonalsSiblingMRVSLabel;

	/* Native View FHQ Patient Personals: Patient's Siblings MRVS Add Button */
	@FindBy(xpath = "//button[@id=\"27200bdb1bf441d06daea681f54bcbe5Add\"]")
	public WebElement nVFHQPatientPersonalsSiblingMRVSAddButton;

	/*
	 * Native View FHQ Patient Personals: Patient's Siblings MRVS Remove All Button
	 */
	@FindBy(xpath = "//button[@id=\"27200bdb1bf441d06daea681f54bcbe5removeAllRows\"]")
	public WebElement nVFHQPatientPersonalsSiblingMRVSRemoveAllButton;

	/* Native View FHQ Patient Personals: Patient's Siblings Add Row Page Iframe */
	@FindBy(xpath = "//iframe[@id='dialog_frame']")
	public WebElement nVFHQPatientPersonalsSiblingMRVSAddRowPageIframe;

	/* Native View FHQ Patient Personals: Patient's Siblings Add Row Page label */
	@FindBy(xpath = "//h2[@id=\"catalog_table_variable_dialog_title\"]")
	public WebElement nVFHQPatientPersonalsSiblingMRVSAddRowPageLabel;

	/*
	 * Native View FHQ Patient Personals: Patient's Siblings MRVS Types of Siblings
	 * relation label
	 */
	@FindBy(xpath = "//span[normalize-space()=\"Types of Siblings relation\"]")
	public WebElement nVFHQPatientPersonalsSiblingMRVSAddRowSiblingsTypeLabel;

	/*
	 * Native View FHQ Patient Personals: Patient's Siblings MRVS Types of Siblings
	 * relation Drop-down
	 */
	@FindBy(xpath = "//tbody/tr[1]/td[1]/div[1]/div[1]/div[2]/select[1]")
	public WebElement nVFHQPatientPersonalsSiblingMRVSAddRowSiblingsTypeDropDown;

	/*
	 * Native View FHQ Patient Personals: Patient's Siblings MRVS First name of
	 * sibling Label
	 */
	@FindBy(xpath = "//span[normalize-space()=\"First name of sibling\"]")
	public WebElement nVFHQPatientPersonalsSiblingMRVSAddRowFirstNameSiblingLabel;;

	/*
	 * Native View FHQ Patient Personals: Patient's Siblings MRVS First name of
	 * sibling TextBox
	 */
	@FindBy(xpath = "//input[@class=\"cat_item_option sc-content-pad form-control\"]")
	public WebElement nVFHQPatientPersonalsSiblingMRVSAddRowFirstNameSiblingTextBox;

	/*
	 * Native View FHQ Patient Personals: Patient's Siblings MRVS First Initial of
	 * LAST name Label
	 */
	@FindBy(xpath = "//span[normalize-space()=\"First Initial of last name\"]")
	public WebElement nVFHQPatientPersonalsSiblingMRVSFirstInitialLastNameLabel;

	/*
	 * Native View FHQ Patient Personals: Patient's Siblings MRVS First Initial of
	 * LAST name Drop-down
	 */
	@FindBy(xpath = "//select[@id=\"IO:05d9a3ff1b814d506daea681f54bcb96\"]")
	public WebElement nVFHQPatientPersonalsSiblingMRVSFirstInitialLastNameDropDopwn;

	/*
	 * Native View FHQ Patient Personals: Patient's Siblings MRVS Vital Status Label
	 */
	@FindBy(xpath = "//span[normalize-space()=\"Vital Status of siblings\"]")
	public WebElement nVFHQPatientPersonalsSiblingMRVSVitalStatusLabel;

	/*
	 * Native View FHQ Patient Personals: Patient's Siblings MRVS Vital Status
	 * Drop-down
	 */
	@FindBy(xpath = "//select[@id=\"IO:520ba7331bc14d506daea681f54bcba8\"]")
	public WebElement nVFHQPatientPersonalsSiblingMRVSVitalStatusDropDown;

	/*
	 * Native View FHQ Patient Personals: Patient's Siblings MRVS Add Row page Add
	 * Button
	 */
	@FindBy(xpath = "//button[normalize-space()=\"Add\"]")
	public WebElement nVFHQPatientPersonalsSiblingMRVSAddRowAddButton;;

	/*
	 * Native View FHQ Patient Personals: Patient's Siblings MRVS Add Row page Close
	 * Button
	 */
	@FindBy(xpath = "//button[normalize-space()=\"Close\"]")
	public WebElement nVFHQPatientPersonalsSiblingMRVSAddRowCloseButton;

	/*
	 * Native View FHQ Patient Personals: Parents We would like to ask you some
	 * questions about your parents and grandparents Banner
	 */
	@FindBy(xpath = "//span[@class=\"sn-tooltip-basic sc-question-label\"][contains(text(),\"We would like to ask you some questions about your\")]")
	public WebElement nVFHQPatientPersonalsParentMRVSBanner;

	/* Native View FHQ Patient Personals: Parents More Information Label */
	@FindBy(xpath = "//span[@id=\"question_help_IO_dd5f14e11b198590e541631ee54bcbb2_toggle\"]")
	public WebElement nVFHQPatientPersonalsParentMRVSMoreInformation;

	/* Native View FHQ Patient Personals: Parents More Information Banner */
	@FindBy(xpath = "//div[@id=\"question_help_IO_dd5f14e11b198590e541631ee54bcbb2_toggle_value\"]")
	public WebElement nVFHQPatientPersonalsParentMRVSMoreInformationBanner;

	/* Native View FHQ Patient Personals: Parents MRVS label */
	@FindBy(xpath = "//span[normalize-space()=\"Parents\"]")
	public WebElement nVFHQPatientPersonalsParentMRVSLabel;

	/* Native View FHQ Patient Personals: Patient's Parents MRVS Add Button */
	@FindBy(xpath = "//button[@id=\"91d260691b198590e541631ee54bcb65Add\"]")
	public WebElement nVFHQPatientPersonalsParentMRVSAddButton;

	/*
	 * Native View FHQ Patient Personals: Patient's Parents MRVS Remove All Button
	 */
	@FindBy(xpath = "//button[@id=\"91d260691b198590e541631ee54bcb65removeAllRows\"]")
	public WebElement nVFHQPatientPersonalsParentMRVSRemoveAllButton;

	/* Native View FHQ Patient Personals: Patient's Parents Add Row Page label */
	@FindBy(xpath = "//h2[@id=\"catalog_table_variable_dialog_title\"]")
	public WebElement nVFHQPatientPersonalsParentMRVSAddRowPageLabel;

	/* Native View FHQ Patient Personals: Patient's Parents MRVS Add Page Iframe */
	@FindBy(xpath = "//iframe[@id='dialog_frame']")
	public WebElement nVFHQPatientPersonalsSParentMRVSAddRowPageIframe;

	/*
	 * Native View FHQ Patient Personals: Patient's Parents MRVS Relationship label
	 */
	@FindBy(xpath = "//span[normalize-space()=\"Relationship\"]")
	public WebElement nVFHQPatientPersonalsParentMRVSAddRowRelationshipLabel;

	/*
	 * Native View FHQ Patient Personals: Patient's Parents MRVS Relationship
	 * Drop-down
	 */
	@FindBy(xpath = "//tbody/tr[1]/td[1]/div[1]/div[1]/div[2]/select[1]")
	public WebElement nVFHQPatientPersonalsParentMRVSAddRowRelationshipDropDown;

	/* Native View FHQ Patient Personals: Patient's Parents MRVS First name Label */
	@FindBy(xpath = "//span[normalize-space()=\"First name\"]")
	public WebElement nVFHQPatientPersonalsParentMRVSAddRowFirstNameLabel;;

	/*
	 * Native View FHQ Patient Personals: Patient's Parents MRVS First name TextBox
	 */
	@FindBy(xpath = "//input[@class=\"cat_item_option sc-content-pad form-control\"]")
	public WebElement nVFHQPatientPersonalsParentMRVSAddRowFirstNameTextBox;

	/*
	 * Native View FHQ Patient Personals: Patient's Parents MRVS First Initial of
	 * LAST name Label
	 */
	@FindBy(xpath = "//span[normalize-space()=\"First Initial of last name\"]")
	public WebElement nVFHQPatientPersonalsParentMRVSFirstInitialLastNameLabel;

	/*
	 * Native View FHQ Patient Personals: Patient's Parents MRVS First Initial of
	 * LAST name Drop-down
	 */
	@FindBy(xpath = "//tbody/tr[3]/td[1]/div[1]/div[1]/div[2]/select[1]")
	public WebElement nVFHQPatientPersonalsParentMRVSFirstInitialLastNameDropDopwn;

	/*
	 * Native View FHQ Patient Personals: Patient's Parents MRVS Vital Status Label
	 */
	@FindBy(xpath = "//span[normalize-space()=\"Vital Status\"]")
	public WebElement nVFHQPatientPersonalsParentMRVSVitalStatusLabel;

	/*
	 * Native View FHQ Patient Personals: Patient's Parents MRVS Vital Status
	 * Drop-down
	 */
	@FindBy(xpath = "//tbody/tr[4]/td[1]/div[1]/div[1]/div[2]/select[1]")
	public WebElement nVFHQPatientPersonalsParentMRVSVitalStatusDropDown;

	/*
	 * Native View FHQ Patient Personals: Patient's Parents MRVS Add Row page Add
	 * Button
	 */
	@FindBy(xpath = "//button[normalize-space()=\"Add\"]")
	public WebElement nVFHQPatientPersonalsParentMRVSAddRowAddButton;;

	/*
	 * Native View FHQ Patient Personals: Patient's Parents MRVS Add Row page Close
	 * Button
	 */
	@FindBy(xpath = "//button[normalize-space()=\"Close\"]")
	public WebElement nVFHQPatientPersonalsParentMRVSAddRowCloseButton;

	/* Native View FHQ Patient Personals: Submit Button */
	@FindBy(xpath = "//button[@id=\"submit_button\"]")
	public WebElement nVFHQPatientPersonalsSubmitButton;
}
