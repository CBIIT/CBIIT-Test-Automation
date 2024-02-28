package ServiceNow.CHARMS.StepsImplementation;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;

import ServiceNow.CHARMS.Constants.FHQConstants;
import ServiceNow.CHARMS.Pages.FHQSubmissionPage;
import ServiceNow.CHARMS.Pages.NativeViewCHARMSDashboardPage;
import ServiceNow.CHARMS.Utils.CharmsUtil;
import appsCommon.PageInitializers.PageInitializer;
import appsCommon.Utils.ServiceNow_Common_Methods;

public class FHQSubmissionStepsImpl extends PageInitializer {
	static SoftAssert softAssert = new SoftAssert();	
	/* Method to submit a FHQ scenario */	
	public static void scenarioSelectorForFHQRelativesList(String excelName ) {	
		if(excelName.contentEquals("FHQScenario1")){		
			fHQ_TestDataManager.dataInitializerFHQ("Participant");
			loginToMainFHQPage();
			fhqParticipantSubmissionScenario1();	
			fHQ_TestDataManager.dataInitializerFHQ("Partner");
			loginToFHQGridPageForARelative();
			fhqPartnerSubmissionScenario1();
			MiscUtils.sleep(600);
			CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("FHQ Home"));
			fHQ_TestDataManager.dataInitializerFHQ("Mother");
			MiscUtils.sleep(300);
			loginToFHQGridPageForARelative();
			fhqMotherSubmissionScenario1();
			fHQ_TestDataManager.dataInitializerFHQ("Father");
			fhqFatherSubmissionScenario1();	 
			CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("FHQ Home"));
			MiscUtils.sleep(600);
			fhqChildrenSubmissionScenario1();
			CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("FHQ Home"));
			MiscUtils.sleep(600);
			fhqSiblingSubmissionScenario1();
			CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("FHQ Home"));
			MiscUtils.sleep(600);
			fhqAuntSubmissionScenario1();
			softAssert.assertAll();				
		}		
	}
	@SuppressWarnings("static-access")
	public static void scenarioSelectorForFHQRelative(String excelName, String sheetName) {
		if (excelName.contentEquals("FHQScenario1")) {
			if (sheetName.contentEquals("Participant")) {
				fHQ_TestDataManager.dataInitializerFHQ(sheetName);
				loginToMainFHQPage();
				fHQSubmissionStepsImpl.fhqParticipantSubmissionScenario1();
			}
			if (sheetName.contentEquals("Partner")) {
				fHQ_TestDataManager.dataInitializerFHQ(sheetName);
				fHQSubmissionStepsImpl.fhqPartnerSubmissionScenario1();
			}
			if (sheetName.contentEquals("Mother")) {
				fHQ_TestDataManager.dataInitializerFHQ(sheetName);
				fHQSubmissionStepsImpl.fhqMotherSubmissionScenario1();
			}
			if (sheetName.contentEquals("Father")) {
				fHQ_TestDataManager.dataInitializerFHQ(sheetName);
				fHQSubmissionStepsImpl.fhqFatherSubmissionScenario1();
			}
			if (sheetName.contentEquals("Children")) {
				fHQ_TestDataManager.dataInitializerFHQ(sheetName);
				fHQSubmissionStepsImpl.fhqChildrenSubmissionScenario1();
			}
			if (sheetName.contentEquals("Sibling")) {
				fHQ_TestDataManager.dataInitializerFHQ(sheetName);
				fHQSubmissionStepsImpl.fhqSiblingSubmissionScenario1();
			}
			if (sheetName.contentEquals("Aunt")) {
				fHQ_TestDataManager.dataInitializerFHQ(sheetName);
				fHQSubmissionStepsImpl.fhqAuntSubmissionScenario1();
			}
			if (sheetName.contentEquals("Uncle")) {
				fHQ_TestDataManager.dataInitializerFHQ(sheetName);
				fHQSubmissionStepsImpl.fhqUncleSubmissionScenario1();
			}
			if (sheetName.contentEquals("NieceNephew")) {
				fHQ_TestDataManager.dataInitializerFHQ(sheetName);
				fHQSubmissionStepsImpl.fhqNieceNephewSubmissionScenario1();
			}
			if (sheetName.contentEquals("MaternalGrandMother")) {
				fHQ_TestDataManager.dataInitializerFHQ(sheetName);
				fHQSubmissionStepsImpl.fhqMaternalGrandMotherSubmissionScenario1();
			}
			if (sheetName.contentEquals("MaternalGrandFather")) {
				fHQ_TestDataManager.dataInitializerFHQ(sheetName);
				fHQSubmissionStepsImpl.fhqMaternalGrandFatherSubmissionScenario1();
			}
			if (sheetName.contentEquals("PaternalGrandMother")) {
				fHQ_TestDataManager.dataInitializerFHQ(sheetName);
				fHQSubmissionStepsImpl.fhqPaternalGrandMotherSubmissionScenario1();
			}
			if (sheetName.contentEquals("PaternalGrandFather")) {
				fHQ_TestDataManager.dataInitializerFHQ(sheetName);
				fHQSubmissionStepsImpl.fhqPaternalGrandFatherSubmissionScenario1();
			}
			if (sheetName.contentEquals("GrandChildren")) {
				fHQ_TestDataManager.dataInitializerFHQ(sheetName);
				fHQSubmissionStepsImpl.fhqGrandChildrenSubmissionScenario1();
			}
			if (sheetName.contentEquals("Cousin")) {
				fHQ_TestDataManager.dataInitializerFHQ(sheetName);
				fHQSubmissionStepsImpl.fhqCousinSubmissionScenario1();
			}
			softAssert.assertAll();
		}
	}	
	/***************************************************/
			/* PARTICIPANT FORM IN PORTAL */
	/**************************************************/
	public static void fhqParticipantSubmissionScenario1() {
		bannerAssertionsForParticipantForm();
		participantBasicInformationSubmissionsAndAssertions1();
		participantChildQuestionsSubmissionsAndAssertions1();	
		assertMRVSTable(1);
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Children"));
		addChildRowInMRVSPage();			
		assertChildRowAddedInMRVSTableForParticipant(1);
		participantPartnerQuestionsSubmissionsAndAssertions1();
		assertMRVSTable(2);
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Partner"));
		addPartnerRowInMRVSPage();
		assertPartnerRowAddedInMRVSTableForParticipant(2);
		participantSiblingQuestionsSubmissionsAndAssertions1();
		assertSiblingMRVSTable();
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Siblings"));
		addSiblingRowInMRVSPageForParticipant();
		assertSiblingRowAddedInMRVSTableForParticipant(3);
		otherInformationForParticipant();
		finalSubmissionSteps();		
	}
	public static void fhqParticipantSubmissionScenario2() {
		bannerAssertionsForParticipantForm();
		participantBasicInformationSubmissionsAndAssertions2();
		participantChildQuestionsSubmissionsAndAssertions2();	
		assertMRVSTable(1);
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Children"));
		addChildRowInMRVSPage();			
		assertChildRowAddedInMRVSTableForParticipant(1);
		participantPartnerQuestionsSubmissionsAndAssertions2();
		assertMRVSTable(2);
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Partner"));
		addPartnerRowInMRVSPage();
		assertPartnerRowAddedInMRVSTableForParticipant(2);
		participantSiblingQuestionsSubmissionsAndAssertions2();
		assertSiblingMRVSTable();
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Siblings"));
		addSiblingRowInMRVSPageForParticipant();
		assertSiblingRowAddedInMRVSTableForParticipant(3);
		otherInformationForParticipant();
		finalSubmissionSteps();	
	}	
	/**************************************************/
			/* PARTNER FORM IN PORTAL */
	/**************************************************/
	public static void fhqPartnerSubmissionScenario1() {
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("Partners"));
		commonFamilyFieldsInListViewPageAssertions();
		partnersListViewTableLabelsAssertions();
		partnerListViewTableValuesAssertions();
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButtonUsingText(FHQConstants.FIRST_NAME));
		assertFamilyFormBanners();
		partnerBasicInformationSubmissionsAndAssertions();
		partnerOtherQuestions();
		finalSubmissionSteps();
	}
	public static void fhqPartnerSubmissionScenario2() {
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("Partners"));
		commonFamilyFieldsInListViewPageAssertions();
		partnersListViewTableLabelsAssertions();
		partnerListViewTableValuesAssertions();
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButtonUsingText(FHQConstants.FIRST_NAME));
		assertFamilyFormBanners();
		partnerBasicInformationSubmissionsAndAssertions();
		partnerOtherQuestions();
		finalSubmissionSteps();
	}
	/**************************************************/
			/* MOTHER FORM IN PORTAL */
	/*************************************************/
	public static void fhqMotherSubmissionScenario1(){
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("Parents"));	
		commonFamilyFieldsInListViewPageAssertions();
		parentsListViewTableLabelsAssertions();
		parentsListViewTableValuesAssertions(" in Mother List View Page ");
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("Biological Mother"));
		assertFamilyFormBanners();  
		parentBasicInformationSubmissionsAndAssertions(" in Mother Form "); 	
		twinOrMultipleBirthQuestionsSubmissionsAndAssertions(12," in Mother Form ");
		miscarriagesOrStillbirthsQuestionsSubmissionsAndAssertions(14," in Mother Form ");
		rASopathyQuestionsSubmissionsAndAssertions(17," in Mother Form ");
		cancerQuestionsSubmissionsAndAssertions(18," in Mother Form ");
		benignTumorQuestionsSubmissionsAndAssertions(19," in Mother Form ");
		medicalConditionQuestionsSubmissionsAndAssertions(20," in Mother Form ");
		siblingzSubmissionsAndAssertionsForParent(" in Mother Form ");
		otherInformation();
		finalSubmissionSteps();				
	}
	public static void fhqMotherSubmissionScenario2(){
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("Parents"));	
		commonFamilyFieldsInListViewPageAssertions();
		parentsListViewTableLabelsAssertions();
		parentsListViewTableValuesAssertions(" in Mother List View Page ");
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("Biological Mother"));
		assertFamilyFormBanners();  
		parentBasicInformationSubmissionsAndAssertions(" in Mother Form "); 	
		twinOrMultipleBirthQuestionsSubmissionsAndAssertions(12," in Mother Form ");
		miscarriagesOrStillbirthsQuestionsSubmissionsAndAssertions(14," Mother ");
		rASopathyQuestionsSubmissionsAndAssertions(17," in Mother Form ");
		cancerQuestionsSubmissionsAndAssertions(18," in Mother Form ");
		benignTumorQuestionsSubmissionsAndAssertions(19," in Mother Form ");	
		medicalConditionQuestionsSubmissionsAndAssertions(20," in Mother Form ");
		siblingzSubmissionsAndAssertionsForParent(" in Mother Form ");
		otherInformation();
		finalSubmissionSteps();			
	}
	/***********************************************/
			/* FATHER FORM IN PORTAL */
	/**********************************************/
	public static void fhqFatherSubmissionScenario1(){
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("Parents"));	
		commonFamilyFieldsInListViewPageAssertions();
		parentsListViewTableLabelsAssertions();
		parentsListViewTableValuesAssertions(" In Father List View Page ");
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("Biological Father"));
		assertFamilyFormBanners();  
		parentBasicInformationSubmissionsAndAssertions(" In Father Form "); 
		twinOrMultipleBirthQuestionsSubmissionsAndAssertions(12," in Father Form ");
		miscarriagesOrStillbirthsQuestionsSubmissionsAndAssertions(14," Father ");
		rASopathyQuestionsSubmissionsAndAssertions(17," In Father Form ");
		cancerQuestionsSubmissionsAndAssertions(18," In Father Form ");
		benignTumorQuestionsSubmissionsAndAssertions(19," in Father Form ");	
		medicalConditionQuestionsSubmissionsAndAssertions(20," In Father Form ");
		siblingzSubmissionsAndAssertionsForParent(" In Father Form ");
		otherInformation();
		finalSubmissionSteps();
	}
	public static void fhqFatherSubmissionScenario2(){
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("Parents"));	
		commonFamilyFieldsInListViewPageAssertions();
		parentsListViewTableLabelsAssertions();
		parentsListViewTableValuesAssertions(" In Father List View Page ");
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("Biological Father"));
		assertFamilyFormBanners();  
		parentBasicInformationSubmissionsAndAssertions(" In Father Form "); 
		twinOrMultipleBirthQuestionsSubmissionsAndAssertions(12," in Father Form ");
		miscarriagesOrStillbirthsQuestionsSubmissionsAndAssertions(14," Father ");
		rASopathyQuestionsSubmissionsAndAssertions(17," In Father Form ");
		cancerQuestionsSubmissionsAndAssertions(18," In Father Form ");
		benignTumorQuestionsSubmissionsAndAssertions(19," in Father Form ");	
		medicalConditionQuestionsSubmissionsAndAssertions(20," In Father Form ");
		siblingzSubmissionsAndAssertionsForParent(" In Father Form ");
		otherInformation();
		finalSubmissionSteps();
	}
	/***************************************************/
			/* CHILDREN FORM IN PORTAL */
	/*************************************************/
	public static void fhqChildrenSubmissionScenario1() {
		MiscUtils.sleep(600);
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("Children"));	
		commonFamilyFieldsInListViewPageAssertions();
		childListViewTableAssertions();
		childListViewTableValuesAssertion();
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButtonUsingText(FHQConstants.FIRST_NAME));
		assertFamilyFormBanners();
		childBasicInformationSubmissionsAndAssertions();
		twinOrMultipleBirthQuestionsForChild();	
		miscarriagesOrStillbirthsSubmissionAndAssertionsForChild();	
		rASopathyQuestionnaireForChild();		
		cancerQuestionnaireForChild();
		benignTumorQuestionnaireForChild();
		medicalConditionQuestionnaireForChild();
		childQuestionnaireForChild(20);
		assertChildrenBannerInMRVSTable(1);		
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Children"));
		addChildRowInMRVSPage();			
		assertChildRowAddedInMRVSTable(5);
		otherInformation();
		finalSubmissionSteps();
	}
	/*************************************************/
			/* SIBLING FORM IN PORTAL */
	/**************************************************/
	public static void fhqSiblingSubmissionScenario1() {
		MiscUtils.sleep(600);
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("Siblings"));	
		commonFamilyFieldsInListViewPageAssertions();
		siblingListViewTableAssertions();
		siblingListViewTableValuesAssertions(" In Sibling List View Page ");
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButtonUsingText(FHQConstants.FIRST_NAME));
		assertFamilyFormBanners();
		siblingBasicInformationSubmissionsAndAssertions();		
		twinOrMultipleBirthQuestionsForSibling();
		miscarriagesOrStillbirthsSubmissionAndAssertionsForSibling();
		rASopathyQuestionnaireForSibling();
		cancerQuestionnaireForSibling();
		benignTumorQuestionnaireForSibling();
		medicalConditionQuestionnaireForSibling();
		childQuestionnaireForSibling(19);
		assertChildrenBannerInMRVSTable(1);		
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Children"));
		addChildRowInMRVSPage();			
		assertChildRowAddedInMRVSTable(5);
		otherInformation();
		finalSubmissionSteps();	
	}
	/******************************************************/
			/* AUNT FORM IN PORTAL */
	/******************************************************/
	public static void fhqAuntSubmissionScenario1() {
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("Aunt/Uncle"));	
		commonFamilyFieldsInListViewPageAssertions();
		auntUncleListViewTableAssertions();
		auntUncleListViewTableValuesAssertions();
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButtonUsingText(FHQConstants.FIRST_NAME,1));
		assertFamilyFormBanners();
		auntUncleBasicInformationSubmissionsAndAssertions();
		twinOrMultipleBirthQuestionsForAuntUncle();
		miscarriagesOrStillbirthsSubmissionAndAssertionsForAuntUncle();
		rASopathyQuestionnaireForAuntUncle();
		cancerQuestionnaireForAuntUncle();
		benignTumorQuestionnaireForAuntUncle();
		medicalConditionQuestionnaireForAuntUncle();	
		childQuestionnaireForAuntUncle(19);
		assertChildrenBannerInMRVSTable(1);		
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Children"));
		addChildRowInMRVSPage();			
		assertChildRowAddedInMRVSTable(5);
		otherInformation();
		finalSubmissionSteps();
	}
	/******************************************************/
			/* UNCLE FORM IN PORTAL */
	/******************************************************/
	public static void fhqUncleSubmissionScenario1() {
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("Aunt/Uncle"));	
		commonFamilyFieldsInListViewPageAssertions();
		auntUncleListViewTableAssertions();
		auntUncleListViewTableValuesAssertions();
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForPrelimRecord);
		assertFamilyFormBanners();
		auntUncleBasicInformationSubmissionsAndAssertions();
		twinOrMultipleBirthQuestionsForAuntUncle();
		miscarriagesOrStillbirthsSubmissionAndAssertionsForAuntUncle();
		rASopathyQuestionnaireForAuntUncle();
		cancerQuestionnaireForAuntUncle();
		benignTumorQuestionnaireForAuntUncle();
		medicalConditionQuestionnaireForAuntUncle();	
		childQuestionnaireForAuntUncle(19);
		assertChildrenBannerInMRVSTable(1);		
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Children"));
		addChildRowInMRVSPage();			
		assertChildRowAddedInMRVSTable(5);
		otherInformation();
		finalSubmissionSteps();
	}
	/****************************************************/
			/*  NIECE/NEPHEW FORM IN PORTAL */
	/*****************************************************/
	public static void fhqNieceNephewSubmissionScenario1() {
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("Niece/Nephew"));	
		commonFamilyFieldsInListViewPageAssertions();
		nieceNephewListViewTableAssertions();
		nieceNephewListViewTableValuesAssertion();
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButtonUsingText(FHQConstants.FIRST_NAME));
		assertFamilyFormBanners();
		nieceNephewBasicInformationSubmissionsAndAssertions();
		twinOrMultipleBirthQuestionsForNieceNephew();
		miscarriagesOrStillbirthsSubmissionAndAssertionsForNieceNephew();	
		rASopathyQuestionnaireForNieceNephew();		
		cancerQuestionnaireForNieceNephew();
		benignTumorQuestionnaireForNieceNephew();
		medicalConditionQuestionnaireForNieceNephew();
		childQuestionnaireForNieceNephew(20);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.OTHER),fHQ_TestDataManager.other," Other Label in Child Form");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.IS_THERE_ANYTHING_ELSE_YOU_WOULD_LIKE_US_TO_KNOW_ABOUT_THIS_RELATIVE),fHQ_TestDataManager.isThereAnythingElseYouWouldLikeUsToKnowAboutThisRelative," Is there anything else you would like us to know about this relative? Label in Child Form ");
		CharmsUtil.sendKeysToElement(fHQSubmissionPage.addOtherInformationForRelativeTextBox, fHQ_TestDataManager.addAdditionalInformation);
		finalSubmissionSteps();	
	}
	/************************************************************************/
	/*  GRANDPARENTS - Maternal Grandmother (Mother's Mother) FORM IN PORTAL */
	/************************************************************************/
	public static void fhqMaternalGrandMotherSubmissionScenario1() {
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("Grandparents"));	
		commonFamilyFieldsInListViewPageAssertions();
		grandParentsListViewTableLabelsAssertions();
		grandParentsListViewTableValuesAssertions(" Maternal Grandmother ");
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForGrandparents("Maternal grandmother (Mother's Mother)"));
		assertFamilyFormBanners();  
		grandParentBasicInformationSubmissionsAndAssertions(" in Maternal Grandmother Form "); 	
		twinOrMultipleBirthQuestionsSubmissionsAndAssertions(12," in Maternal Grandmother Form ");
		miscarriagesOrStillbirthsQuestionsSubmissionsAndAssertions(14," Maternal Grandmother ");
		rASopathyQuestionsSubmissionsAndAssertions(17," in Maternal Grandmother ");
		cancerQuestionsSubmissionsAndAssertions(18," in Maternal Grandmother ");
		benignTumorQuestionsSubmissionsAndAssertions(19," in Maternal Grandmother ");
		medicalConditionQuestionsSubmissionsAndAssertions(20," in Maternal Grandmother ");
		otherInformation();
		finalSubmissionSteps();
	}
	/************************************************************************/
	/*  GRANDPARENTS - Maternal Grandfather (Mother's Father)FORM IN PORTAL */
	/************************************************************************/
	public static void fhqMaternalGrandFatherSubmissionScenario1() {
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("Grandparents"));	
		commonFamilyFieldsInListViewPageAssertions();
		grandParentsListViewTableLabelsAssertions();		
		grandParentsListViewTableValuesAssertions(" Maternal Grandfather ");	
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForGrandparents("Maternal grandfather (Mother's Father)"));
		assertFamilyFormBanners();  
		grandParentBasicInformationSubmissionsAndAssertions(" in Maternal Grandfather Form "); 	
		twinOrMultipleBirthQuestionsSubmissionsAndAssertions(12," in Maternal Grandfather Form ");
		miscarriagesOrStillbirthsQuestionsSubmissionsAndAssertions(14," Maternal Grandfather ");
		rASopathyQuestionsSubmissionsAndAssertions(17," in Maternal Grandfather ");
		cancerQuestionsSubmissionsAndAssertions(18," in Maternal Grandfather ");
		benignTumorQuestionsSubmissionsAndAssertions(19," in Maternal Grandfather ");	
		medicalConditionQuestionsSubmissionsAndAssertions(20," in Maternal Grandfather ");
		otherInformation();
		finalSubmissionSteps();
	}
	/************************************************************************/
	/*  GRANDPARENTS - Paternal GrandMother (Father's Mother) FORM IN PORTAL */
	/************************************************************************/
	public static void fhqPaternalGrandMotherSubmissionScenario1() {
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("Grandparents"));	
		commonFamilyFieldsInListViewPageAssertions();
		grandParentsListViewTableLabelsAssertions();
		grandParentsListViewTableValuesAssertions("Paternal GrandMother");
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForGrandparents("Paternal grandmother (Father's Mother)"));
		assertFamilyFormBanners();  
		grandParentBasicInformationSubmissionsAndAssertions(" in Paternal Grandmother Form "); 	
		twinOrMultipleBirthQuestionsSubmissionsAndAssertions(12," in Paternal Grandmother Form ");
		miscarriagesOrStillbirthsQuestionsSubmissionsAndAssertions(14," Paternal Grandmother ");
		rASopathyQuestionsSubmissionsAndAssertions(17," in Paternal Grandmother ");
		cancerQuestionsSubmissionsAndAssertions(18," in Paternal Grandmother ");
		benignTumorQuestionsSubmissionsAndAssertions(19," in Paternal Grandmother ");
		medicalConditionQuestionsSubmissionsAndAssertions(20," in Paternal Grandmother ");
		otherInformation();
		finalSubmissionSteps();
	}
	/************************************************************************/
	/*  GRANDPARENTS - Paternal Grandfather (Father's Father) FORM IN PORTAL */
	/************************************************************************/
	public static void fhqPaternalGrandFatherSubmissionScenario1() {
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("Grandparents"));	
		commonFamilyFieldsInListViewPageAssertions();
		grandParentsListViewTableLabelsAssertions();		
		grandParentsListViewTableValuesAssertions("Paternal Grandfather");	
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForGrandparents("Paternal grandfather (Father's Father)"));
		assertFamilyFormBanners();  
		grandParentBasicInformationSubmissionsAndAssertions(" in Maternal Grandmother Form "); 	
		twinOrMultipleBirthQuestionsSubmissionsAndAssertions(12," in Maternal Grandmother Form ");
		miscarriagesOrStillbirthsQuestionsSubmissionsAndAssertions(14," Maternal Grandmother ");
		rASopathyQuestionsSubmissionsAndAssertions(17," in Maternal Grandmother ");
		cancerQuestionsSubmissionsAndAssertions(18," in Maternal Grandmother ");
		benignTumorQuestionsSubmissionsAndAssertions(19," in  Maternal Grandmother ");
		medicalConditionQuestionsSubmissionsAndAssertions(20," in Maternal Grandmother ");
		otherInformation();
		finalSubmissionSteps();
	}
	/*******************************************************/
			/*  GRANDCHILDREN FORM IN PORTAL */
	/******************************************************/
	public static void fhqGrandChildrenSubmissionScenario1(){
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("Grandchildren"));	
		commonFamilyFieldsInListViewPageAssertions();
		grandChildrenListViewTableLabelsAssertions();
		grandChildrenListViewTableValuesAssertions();
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButtonUsingText(FHQConstants.FIRST_NAME));
		assertFamilyFormBanners();
		grandChildrenBasicInformationSubmissionsAndAssertions();
		twinOrMultipleBirthQuestionsSubmissionsAndAssertions(11," in GrandChild Form ");
		miscarriagesOrStillbirthsQuestionsSubmissionsAndAssertions(13," in GrandChild Form ");
		rASopathyQuestionsSubmissionsAndAssertions(16," in GrandChild Form ");
		cancerQuestionsSubmissionsAndAssertions(17," in GrandChild Form ");
		benignTumorQuestionsSubmissionsAndAssertions(18," in  GrandChild Form ");
		medicalConditionQuestionsSubmissionsAndAssertions(19," in GrandChild Form ");
		questionsForChildSubmissionsAndAssertions(20," in GrandChild Form ");
		otherInformation();
		finalSubmissionSteps();
	}
	/*************************************************/
			/*  COUSIN FORM IN PORTAL */
	/*************************************************/
	public static void fhqCousinSubmissionScenario1(){
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("Cousins"));	
		commonFamilyFieldsInListViewPageAssertions();
		cousinListViewTableLabelsAssertions();
		cousinListViewTableValuesAssertions(" in Cousin List View Page ");
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingSpanLabel(fHQ_TestDataManager.firstNameValue1));		
		assertFamilyFormBanners();
		cousinBasicInformationSubmissionsAndAssertions();
		twinOrMultipleBirthQuestionsSubmissionsAndAssertions(11," in Cousin Form ");
		miscarriagesOrStillbirthsQuestionsSubmissionsAndAssertions(13," in Cousin Form ");
		rASopathyQuestionsSubmissionsAndAssertions(16," in Cousin Form ");
		cancerQuestionsSubmissionsAndAssertions(17," in Cousin Form ");
		benignTumorQuestionsSubmissionsAndAssertions(18," in Cousin Form ");
		medicalConditionQuestionsSubmissionsAndAssertions(19," in Cousin Form ");
		questionsForChildSubmissionsAndAssertions(20," in Cousin Form ");
		otherInformation();
		finalSubmissionSteps();
	}
	/* ****** METHOD FOR FHQ SCENARIO-1 ASSERTIONS ********* */	
	public static void scenarioAssertionForFHQ(String excelName, String sheetName) {
		if (excelName.contentEquals("FHQScenario1")) {
			if(sheetName.contentEquals("Participant")) {
				fHQ_TestDataManager.dataInitializerFHQ(sheetName);
				FHQSubmissionStepsImpl.fhqParticipantAssertionScenario1();
			}
			if(sheetName.contentEquals("Partner")) {
				fHQ_TestDataManager.dataInitializerFHQ(sheetName);
				FHQSubmissionStepsImpl.fhqPartnerAssertionScenario1();
			}
			if(sheetName.contentEquals("Mother")) {
				fHQ_TestDataManager.dataInitializerFHQ(sheetName);
				FHQSubmissionStepsImpl.fhqMotherAssertionScenario1();
			}
			if(sheetName.contentEquals("Father")) {
				fHQ_TestDataManager.dataInitializerFHQ(sheetName);
				FHQSubmissionStepsImpl.fhqFatherAssertionScenario1();
			}
			if(sheetName.contentEquals("Children")) {
				fHQ_TestDataManager.dataInitializerFHQ(sheetName);
				FHQSubmissionStepsImpl.fhqChildrenAssertionScenario1();
			}
			if(sheetName.contentEquals("Sibling")) {
				fHQ_TestDataManager.dataInitializerFHQ(sheetName);
				FHQSubmissionStepsImpl.fhqSiblingAssertionScenario1();
			}
			if(sheetName.contentEquals("Aunt")) {
				fHQ_TestDataManager.dataInitializerFHQ(sheetName);
				FHQSubmissionStepsImpl.fhqAuntUncleAssertionScenario1();
			}
			if(sheetName.contentEquals("Uncle")) {
				fHQ_TestDataManager.dataInitializerFHQ(sheetName);
				FHQSubmissionStepsImpl.fhqAuntUncleAssertionScenario1();
			}
			if(sheetName.contentEquals("NieceNephew")) {
				fHQ_TestDataManager.dataInitializerFHQ(sheetName);
				FHQSubmissionStepsImpl.fhqNieceNephewAssertionScenario1();
			}
			if(sheetName.contentEquals("MaternalGrandMother")) {
				fHQ_TestDataManager.dataInitializerFHQ(sheetName);
				FHQSubmissionStepsImpl.fhqMaternalGrandMotherAssertionScenario1();
			}
			if(sheetName.contentEquals("MaternalGrandFather")) {
				fHQ_TestDataManager.dataInitializerFHQ(sheetName);
				FHQSubmissionStepsImpl.fhqMaternalGrandFatherAssertionScenario1();
			}
			if(sheetName.contentEquals("PaternalGrandMother")) {
				fHQ_TestDataManager.dataInitializerFHQ(sheetName);
				FHQSubmissionStepsImpl.fhqPaternalGrandMotherAssertionScenario1();
			}
			if(sheetName.contentEquals("PaternalGrandFather")) {
				fHQ_TestDataManager.dataInitializerFHQ(sheetName);
				FHQSubmissionStepsImpl.fhqPaternalGrandFatherAssertionScenario1();
			}
			if(sheetName.contentEquals("GrandChildren")) {
				fHQ_TestDataManager.dataInitializerFHQ(sheetName);
				FHQSubmissionStepsImpl.fhqGrandChildrenAssertionScenario1();
			}
			if(sheetName.contentEquals("Cousin")) {
				fHQ_TestDataManager.dataInitializerFHQ(sheetName);
				FHQSubmissionStepsImpl.fhqCousinAssertionScenario1();
			}
		}
	}	
	/* ****** Methods for Each Relative FHQ scenario-1 Assertions ********* */
	public static void fhqParticipantAssertionScenario1() {
		participantFHQInformationAssertions(" in FHQ Participant Form in NV");
		softAssert.assertAll();
	}
	public static void fhqPartnerAssertionScenario1() {
		partnersFHQInformationAssertions(" in FHQ Partner Form in NV");
		softAssert.assertAll();
	}	
	public static void fhqMotherAssertionScenario1() {
		motherFHQInformationAssertions(" in FHQ Mother Form in NV");
		softAssert.assertAll();
	}
	public static void fhqFatherAssertionScenario1() {
		fatherFHQInformationAssertions(" in FHQ Father Form in NV");
		softAssert.assertAll();
	}
	public static void fhqChildrenAssertionScenario1() {
		childrenFHQInformationAssertions(" in FHQ Children Form in NV");
		softAssert.assertAll();
	}
	public static void fhqSiblingAssertionScenario1() {
		siblingFHQInformationAssertions(" in FHQ Sibling Form in NV");
		softAssert.assertAll();
	}
	public static void fhqAuntUncleAssertionScenario1() {
		auntUncleFHQInformationAssertions(" in FHQ AuntUncle Form in NV");
		softAssert.assertAll();
	}	
	public static void fhqNieceNephewAssertionScenario1() {
		nieceNephewFHQInformationAssertions(" in FHQ NieceNephew Form in NV");
		softAssert.assertAll();
	}
	public static void fhqMaternalGrandMotherAssertionScenario1() {
		maternalGrandMotherFHQInformationAssertions(" in FHQ Maternal GrandMother Form in NV");
		softAssert.assertAll();
	}
	public static void fhqMaternalGrandFatherAssertionScenario1() {
		maternalGrandFatherFHQInformationAssertions(" in FHQ Maternal GrandFather Form in NV");
		softAssert.assertAll();
	}
	public static void fhqPaternalGrandMotherAssertionScenario1() {
		paternalGrandMotherFHQInformationAssertions(" in FHQ Paternal GrandMother Form in NV");
		softAssert.assertAll();
	}
	public static void fhqPaternalGrandFatherAssertionScenario1() {
		paternalGrandFatherFHQInformationAssertions(" in FHQ Paternal GrandFather Form in NV");
		softAssert.assertAll();
	}
	public static void fhqGrandChildrenAssertionScenario1() {
		grandChildrenFHQInformationAssertions(" in FHQ GrandChildren Form in NV");
		softAssert.assertAll();
	}
	public static void fhqCousinAssertionScenario1() {
		cousinFHQInformationAssertions(" in FHQ Cousin Form in NV");
		softAssert.assertAll();
	}		
	/*****************************************************************/
			/* COMMON METHODS FOR ALL RELATIVE FORMS */
	/*****************************************************************/
	/* Method to Login to MyRasLandingPage */
	public static void loginToRASStudyPage(String username, String password) {
		CommonUtils.waitForVisibility(myRASLoginPage.loginToMyRASButton);
		CharmsUtil.clickOnElement(myRASLoginPage.loginToMyRASButton);
		CharmsUtil.sendKeysToElement(oktaLoginPage.usernameTxtBox, username);
		CharmsUtil.clickOnElement(oktaLoginPage.nextButton);
		CharmsUtil.sendKeysToElement(oktaLoginPage.passwordTxtBox, password);
		CharmsUtil.clickOnElement(oktaLoginPage.verifyBtn);	
		CucumberLogUtils.logScreenshot();
		CommonUtils.waitForVisibility(oktaLoginPage.agreeBtn);
		CharmsUtil.clickOnElement(oktaLoginPage.agreeBtn);
	}
	/* Method to click on FHQ Link and landing on the FHQ MAIN Form Page and doing assertions on Help Text */
	public static void loginToMainFHQPage() {
		CharmsUtil.clickOnElement(FHQSubmissionPage.familyHistoryQuestionnaireLink);
		MiscUtils.sleep(300);
		String header1 = "We know families come in different shapes and sizes. This survey is primarily meant to record health information on your biological (blood-related) relatives. It's okay not to know information about some of your relatives.";
		String header2 = "As you go through your relatives information in these forms, you will be able to fill out the information you know and click the Complete button on each page. Please keep in mind you will not be able to make changes to that relative once completed. When all relatives are completed, the Submit FHQ Questionnaire button will appear.";
		String header3 = "Once you click Submit FHQ Questionnaire, you will see a pop up asking if you'd like to provide additional information. If you would like to tell us about any non-biological relatives to add to your family tree (like an adopted sibling, or a step-parent), you can disclose that information here.";
		String header4 = "Note: You will not be able to edit the survey once you click the Submit FHQ Questionnaire button.";	
		String header5="Click here to start your family health questionnaire";
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.NCI_FAMILY_STUDIES_HUB_RASOPATHIES), "NCI Family Studies Hub: RASopathies"," NCI Family Studies Hub: RASopathies Label on FHQ Survey: ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.WE_KNOW_FAMILIES_COME_IN_DIFFERENT_SHAPES_AND_SIZES),header1," We know families come in different shapes and sizes. Label on the FHQ Survey: ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.AS_YOU_GO_THROUGH_YOUR_RELATIVES_INFORMATION_IN_TH),header2," As you go through your relatives information in these forms ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.ONCE_YOU_CLICK_SUBMIT_FHQ_QUESTIONNAIRE,1),header3," Once you click Submit FHQ Questionnaire ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.noteMyRasLandingPage,header4," Note: You will not be able to edit the survey once you click the Submit FHQ Questionnaire button. ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.CLICK_HERE_TO_START_YOUR_FAMILY_HEALTH_QUESTIONNAIRE),header5," Click here to start your family health questionnaire Label the FHQ Survey: ");
		CucumberLogUtils.logScreenshot();
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.CLICK_HERE_TO_START_YOUR_FAMILY_HEALTH_QUESTIONNAIRE));
	} 
	/* Method to land on FHQ Grid page and do text message assertions */
	public static void loginToFHQGridPage() {
		CharmsUtil.clickOnElement(FHQSubmissionPage.familyHistoryQuestionnaireLink);
		MiscUtils.sleep(300);
		String header1 = "We know families come in different shapes and sizes. This survey is primarily meant to record health information on your biological (blood-related) relatives. It's okay not to know information about some of your relatives.";
		String header2 = "As you go through your relatives information in these forms, you will be able to fill out the information you know and click the Complete button on each page. Please keep in mind you will not be able to make changes to that relative once completed. When all relatives are completed, the Submit FHQ Questionnaire button will appear.";
		String header3 = "Once you click Submit FHQ Questionnaire, you will see a pop up asking if you'd like to provide additional information. If you would like to tell us about any non-biological relatives to add to your family tree (like an adopted sibling, or a step-parent), you can disclose that information here.";
		String header4 = "Note: You will not be able to edit the survey once you click the Submit FHQ Questionnaire button.";	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.NCI_FAMILY_STUDIES_HUB_RASOPATHIES), "NCI Family Studies Hub: RASopathies"," NCI Family Studies Hub: RASopathies Label on FHQ Survey: ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.WE_KNOW_FAMILIES_COME_IN_DIFFERENT_SHAPES_AND_SIZES),header1," We know families come in different shapes and sizes. Label on the FHQ Survey: ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.AS_YOU_GO_THROUGH_YOUR_RELATIVES_INFORMATION_IN_TH),header2," As you go through your relatives information in these forms ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.ONCE_YOU_CLICK_SUBMIT_FHQ_QUESTIONNAIRE,1),header3," Once you click Submit FHQ Questionnaire ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.noteMyRasLandingPage,header4," Note: You will not be able to edit the survey once you click the Submit FHQ Questionnaire button. ");		
	}
	/* Method to land on FHQ Grid page on Portal and do text message assertions */
	public static void loginToFHQGridPageForARelative() {
		MiscUtils.sleep(300);
		String header1 = "We know families come in different shapes and sizes. This survey is primarily meant to record health information on your biological (blood-related) relatives. It's okay not to know information about some of your relatives.";
		String header2 = "As you go through your relatives information in these forms, you will be able to fill out the information you know and click the Complete button on each page. Please keep in mind you will not be able to make changes to that relative once completed. When all relatives are completed, the Submit FHQ Questionnaire button will appear.";
		String header3 = "Once you click Submit FHQ Questionnaire, you will see a pop up asking if you'd like to provide additional information. If you would like to tell us about any non-biological relatives to add to your family tree (like an adopted sibling, or a step-parent), you can disclose that information here.";
		String header4 = "Note: You will not be able to edit the survey once you click the Submit FHQ Questionnaire button.";	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.NCI_FAMILY_STUDIES_HUB_RASOPATHIES), "NCI Family Studies Hub: RASopathies"," NCI Family Studies Hub: RASopathies Label on FHQ Survey: ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.WE_KNOW_FAMILIES_COME_IN_DIFFERENT_SHAPES_AND_SIZES),header1," We know families come in different shapes and sizes. Label on the FHQ Survey: ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.AS_YOU_GO_THROUGH_YOUR_RELATIVES_INFORMATION_IN_TH),header2," As you go through your relatives information in these forms ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.ONCE_YOU_CLICK_SUBMIT_FHQ_QUESTIONNAIRE,1),header3," Once you click Submit FHQ Questionnaire ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.noteMyRasLandingPage,header4," Note: You will not be able to edit the survey once you click the Submit FHQ Questionnaire button. ");
	}
	/* Method to Login to NativeView */
	public static void loginToNativeViewForFHQ(String username, String password) {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
		CommonUtils.waitForVisibility(iTrustloginPage.loginLink);
		CharmsUtil.clickOnElement(iTrustloginPage.loginLink);
		CharmsUtil.sendKeysToElement(iTrustloginPage.userNameField, username);
		CharmsUtil.sendKeysToElement(iTrustloginPage.passwordField, password);
		CharmsUtil.clickOnElement(iTrustloginPage.signInButton);
		CommonUtils.waitForVisibility(WebDriverUtils.webDriver.findElement(By.linkText("Native View")));
		CharmsUtil.clickOnElement(WebDriverUtils.webDriver.findElement(By.linkText("Native View")));
		CommonUtils.maximizeWindow();
	}
	/* Method to Login to NativeView using the side door Test Account */
	public static void nativeViewSideDoorLogin(String SideDoorUsername, String SideDoorPassword) {
		MiscUtils.sleep(2000);
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("Native View Side Door"));
		CharmsUtil.clickOnElement(fHQSubmissionPage.nVSideDoorUserName);
		CharmsUtil.sendKeysToElement(fHQSubmissionPage.nVSideDoorUserName,SideDoorUsername);
		CharmsUtil.sendKeysToElement(fHQSubmissionPage.nVSideDoorPassword,SideDoorPassword);
		CharmsUtil.clickOnElement(fHQSubmissionPage.nVSideDoorLogInButton);
		MiscUtils.sleep(2000);
	}	
	/* Method to Login to the FHQ list view in Native View */
	public static void loginToFHQPatientInNativeView() {
		ServiceNow_Common_Methods.filterNavigatorSearchForFHQ("FHQ Patients");
		CommonUtils.clickOnElement(NativeViewCHARMSDashboardPage.nativeViewnewScreenerReceivedLocator("SOnika Jain"));
		MiscUtils.sleep(2000);
		if (CommonUtils.isElementDisplayed(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton)) {
			CucumberLogUtils.logScreenshot();
			CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
			MiscUtils.sleep(2000);
		}
	}
	/* Assertions of common fields on the List View Page */
	public static void commonFamilyFieldsInListViewPageAssertions() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.NCI_FAMILY_STUDIES_HUB_RASOPATHIES), fHQ_TestDataManager.nCIFamilyStudiesHubRASopathies," NCI Family Studies Hub: RASopathies Label "); 
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FHQ_HOME), "FHQ Home", " FHQ Home Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.LIST_VIEW), fHQ_TestDataManager.listView, " List View Label ");		
	}
	/* Assertions of common TABLE fields on the List View Page for all Family members */
	public static void commonFamilyListViewTableAssertions() {	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.rowsDetailsOnListView,fHQ_TestDataManager.theBlueHighlightedRowsRepresentTheIncompletedFamilyRecords, " The blue highlighted rows represent the incompleted family records Label "); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("First Name",1),fHQ_TestDataManager.firstName," First Name Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("First Initial of LAST Name", 1),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Vital Status", 1),fHQ_TestDataManager.vitalStatus, " Vital Status Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Year of Birth", 1),fHQ_TestDataManager.yearOfBirth, " Year of Birth Label ");
	}
	/* Assertions of Banners on the Participant form */
	public static void assertFamilyFormBanners() {
		String header1 = "We know families come in different shapes and sizes. This survey is primarily meant to record health information on your biological (blood-related) relatives. It's okay not to know information about some of your relatives.";
		String header2 = "As you go through your relatives information in these forms, you will be able to fill out the information you know and click the Complete button on each page. Please keep in mind you will not be able to make changes to that relative once completed. When all relatives are completed, the Submit FHQ Questionnaire button will appear.";
		String header3 = "Once you click Submit FHQ Questionnaire, you will see a pop up asking if you'd like to provide additional information. If you would like to tell us about any non-biological relatives to add to your family tree (like an adopted sibling, or a step-parent), you can disclose that information here.";
		String header4 = "Note: You will not be able to edit the survey once you click the Submit FHQ Questionnaire button.";	
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FHQ_HOME), "FHQ Home", " FHQ Home Label ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.LIST_VIEW), fHQ_TestDataManager.listView, " List View Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FORM_VIEW), fHQ_TestDataManager.formView, " Form View Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.NCI_FAMILY_STUDIES_HUB_RASOPATHIES), "NCI Family Studies Hub: RASopathies"," NCI Family Studies Hub: RASopathies Label on FHQ Survey: Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.WE_KNOW_FAMILIES_COME_IN_DIFFERENT_SHAPES_AND_SIZES),header1," We know families come in different shapes and sizes. Label on the FHQ Survey: Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.AS_YOU_GO_THROUGH_YOUR_RELATIVES_INFORMATION_IN_TH),header2," As you go through your relatives information in these forms Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.ONCE_YOU_CLICK_SUBMIT_FHQ_QUESTIONNAIRE,1),header3," Once you click Submit FHQ Questionnaire Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.noteMyRasLandingPage,header4," Note: You will not be able to edit the survey once you click the Submit FHQ Questionnaire button. Label ");
	}
	/* Twin or part of a multiple birth? Questions */
	public static void twinOrMultipleBirthQuestionsSubmissionsAndAssertions(int i, String string){
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.IS_THIS_RELATIVE_A_TWIN_OR_PART_OF_A_MULTIPLE_BIRTH), fHQ_TestDataManager.isThisRelativeATwinOrPartOfAMultipleBirth, " Is this relative a twin or part of a multiple birth? Label" + string);
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(i),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.twinOrPartOfAMultipleBirthValueAdded);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARENT_TYPE_OF_BIRTH), fHQ_TestDataManager.typeOfBirth, " Type of birth Label" + string);
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(i+1),FHQConstants.TYPE_OF_BIRTH,fHQ_TestDataManager.typeOfBirthValueAdded);			
	}
	/* miscarriages or stillbirths? Questionnare */
	public static void miscarriagesOrStillbirthsQuestionsSubmissionsAndAssertions(int i, String string) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.MEDICAL_HISTORY), fHQ_TestDataManager.medicalHistory, " Medical History Label" + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.HAS_THIS_RELATIVE_EVER_HAD_ANY_MISCARRIAGES_OR_STILLBIRTHS),fHQ_TestDataManager.hasThisRelativeEverHadAnyMiscarriagesOrStillbirths," Has this relative ever had any miscarriages or stillbirths? Label" + string);
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(i),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasThisRelativeEverHadAnyMiscarriagesOrStillbirthsValue);		
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PLEASE_IDENTIFY_THE_NUMBER_OF_EACH_OF_THE_FOLLOWING_PREGNANCY_RESULTS),fHQ_TestDataManager.pleaseIdentifyTheNumberOfEachOfTheFollowingPregnancyResults," Please identify the number of each of the following pregnancy results for this person. Label" + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES),fHQ_TestDataManager.totalNumberOfMiscarriages," Total number of Miscarriages Label" + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.LESS_THAN_20_WEEKS_OF_PREGNANCY),fHQ_TestDataManager.lessThan20WeeksOfPregnancy," less than 20 weeks of pregnancy Label" + string);
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(i+1),FHQConstants.numberUpToN(20),fHQ_TestDataManager.totalNumberOfMiscarriagesValue);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS),fHQ_TestDataManager.totalNumberOfStillbirths," Total number of Stillbirths Label" + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.MORE_THAN_20_WEEKS_OF_PREGNANCY),fHQ_TestDataManager.moreThan20WeeksOfPregnancy," More than 20 weeks of pregnancy Label" + string);
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(i+2),FHQConstants.numberUpToN(20),fHQ_TestDataManager.totalNumberOfStillbirthsValue);
	}
	/* RASOPATHY QUESTIONNAIRE Submissions and Assertions */
	public static void rASopathyQuestionsSubmissionsAndAssertions(int i, String string){
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.MEDICAL_HISTORY), fHQ_TestDataManager.medicalHistory, " Medical History Label" + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_BEEN_DIAGNOSED_WITH_A_RASOPATHY), fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathy, " Has this relative been diagnosed with a RASopathy? Label" + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.diagnosedWithRasopathyInformation, fHQ_TestDataManager.rASopathyHistoryBanner, " RASopathy History Banner" + string);	
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(i),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathyValue);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.diagnosedWithRasopathyAddButtonInfo,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachRASopathyThisRelativeHasHad, " Please select the 'Add' button below to add each RASopathy this relative has had. Label" + string);			
		FHQSubmissionStepsImpl.assertRasopathyBannerInMRVSTable(1);			
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for RASopathy(s)"));
		FHQSubmissionStepsImpl.addRASopathyRowInMRVSPage();		
		FHQSubmissionStepsImpl.assertRASopathyRowAddedInMRVSTable(1);
	}
	/* Rasopathy MRVS Table headings Assertion */
	public static void  assertRasopathyBannerInMRVSTable(int i) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.RASOPATHY), fHQ_TestDataManager.rASopathy, " RASopathy Label in RASopathy MRVS Table ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("Add a row for RASopathy(s)"),fHQ_TestDataManager.add," Add Label in RASopathy MRVS Table ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("Remove all rows for RASopathy(s)"),fHQ_TestDataManager.removeAll," Remove All Label in RASopathy MRVS Table ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Actions", i),fHQ_TestDataManager.actions," Actions Label in RASopathy MRVS Table");		 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("RASopathy",i),"RASopathy"," 	RASopathy Label in RASopathy MRVS Table ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Specify other RASopathy", i),fHQ_TestDataManager.specifyOtherRASopathy, " Specify other RASopathy Label in RASopathy MRVS Table ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Please provide the year of diagnosis or the age of diagnosis", i),fHQ_TestDataManager.pleaseProvideTheYearOfDiagnosisOrTheAgeOfDiagnosis, " Please provide the year of diagnosis or the age of diagnosis Label in RASopathy MRVS Table ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Year of diagnosis", i),fHQ_TestDataManager.yearOfDiagnosis, " Year of diagnosis Label in RASopathy MRVS Table ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Age of diagnosis", i),fHQ_TestDataManager.ageOfDiagnosis, " Age of diagnosis Label in RASopathy MRVS Table ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Additional Information", i),fHQ_TestDataManager.additionalInformation, " Additional Information Label in RASopathy MRVS Table ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingContainsNormalizeSpace("No data to display", i),fHQ_TestDataManager.noDataToDisplay, " No data to display Label in RASopathy MRVS Table ");	 
	}
	/* RASopathy MRVS ADD page Assertions and Submissions */
	public static void  addRASopathyRowInMRVSPage() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.ADD_ROW),fHQ_TestDataManager.addRow, " Add Row label for Rasopathy  in MRVS ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("RASopathy"), "RASopathy", " RASopathy Label in RASopathy Add MRVS Table page ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocatorForDropDown(1),FHQConstants.RESOPATHY_TYPE,fHQ_TestDataManager.rASopathyOptionSelected);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PLEASE_PROVIDE_THE_YEAR_OF_DIAGNOSIS_OR_THE_AGE_OF_DIAGNOSIS),fHQ_TestDataManager.pleaseProvideTheYearOfDiagnosisOrTheAgeOfDiagnosis, " Please provide the year of diagnosis or the age of diagnosis Label in RASopathy MRVS ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocatorForDropDown(1),FHQConstants.YEAR_OR_AGE_OF_DIAGNOSIS,fHQ_TestDataManager.pleaseProvideTheYearOfDiagnosisOrTheAgeOfDiagnosisSelected);		
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorClassNormalizeSpace(FHQConstants.YEAR_OF_DIAGNOSIS),fHQ_TestDataManager.yearOfDiagnosis, " Year of diagnosis Label in RASopathy MRVS ");	
		MiscUtils.sleep(300);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.yearOfBirthdateBanner,"An estimated date is preferred over “Don’t Know.” Examples: select 1995 if you know the date is in the 1990s but unsure the exact year; select 1982 if you know it was in the early 1980s; select 1977 if you know it was in the late 1970s.", " An estimated date is preferred banner in RASopathy MRVS ");		
		MiscUtils.sleep(300);
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocatorForDropDown(1),FHQConstants.yearOfBirthOrDeathAfter1900(),fHQ_TestDataManager.yearOfDiagnosisForRasopathySelected);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.ADDITIONAL_INFORMATION), fHQ_TestDataManager.additionalInformation, " Any Additional Information Added for the RASopathy Label "); 	
		CharmsUtil.sendKeysToElement(fHQSubmissionPage.dynamicLocatorTextBox("additional_information_ras"), fHQ_TestDataManager.additionalInformationAddedForRasopathy); 
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.CANCEL),fHQ_TestDataManager.cancel, " Cancel button label for RASopathy in MRVS ");
		CharmsUtil.assertButtonLabel(softAssert, FHQSubmissionPage.addRowSaveButton,fHQ_TestDataManager.add, " Add button label for RASopathy in MRVS ");
		CharmsUtil.clickOnElement(FHQSubmissionPage.addRowSaveButton);
	}
	/* RASopathy MRVS Added Row Assertions */
	public static void  assertRASopathyRowAddedInMRVSTable(int i) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingAnchorTag("Edit Row 1",i),"", " Edit Row for RASopathy label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingAnchorTag("Remove Row 1",i),"", " Remove Row for RASopathy label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(1),fHQ_TestDataManager.rASopathyOptionSelected, " RASopathy Option Selected data ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(2),fHQ_TestDataManager.specifyOtherRASopathySelected, " Specify other RASopathy Selected data ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(3),fHQ_TestDataManager.pleaseProvideTheYearOfDiagnosisOrTheAgeOfDiagnosisSelected, " Please provide the year of diagnosis or the age of diagnosis RASopathy selected data  ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(4),fHQ_TestDataManager.yearOfDiagnosisForRasopathySelected, " Year of diagnosis for RASopathy selected data ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(5),fHQ_TestDataManager.ageOfDiagnosisForRasopathySelected, " Age of diagnosis for RASopathy selected data ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(6),fHQ_TestDataManager.additionalInformationAddedForRasopathy, " Additional Information added for RASopathy data ");
	}	
	/* CANCER QUESTIONNAIRE Submissions and Assertions */
	public static void cancerQuestionsSubmissionsAndAssertions(int i, String string) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_CANCER), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancer, " Has this relative ever been diagnosed with cancer? Label" + string);
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(i),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancerValue);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.diagnosedWithCancerAddButtonInfo,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachCancerThisRelativeHasHad, " Please select the 'Add' button below to add each cancer this relative has had.Label" + string);
		FHQSubmissionStepsImpl.assertCancerBannerInMRVSTable(2);		
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Cancer(s)"));
		FHQSubmissionStepsImpl.addCancerRowInMRVSPage();
		FHQSubmissionStepsImpl.assertCancerRowAddedInMRVSTable(2); 
	}
	/* Cancer MRVS Table headings Assertion */
	public static void assertCancerBannerInMRVSTable(int i) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.CANCERS), fHQ_TestDataManager.cancers, " Cancer(s) Label in Cancer MRVS Table ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("Add a row for Cancer(s)"),fHQ_TestDataManager.add," Add Label in Cancer MRVS Table ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("Remove all rows for Cancer(s)"),fHQ_TestDataManager.removeAll," Remove All Label in Cancer MRVS Table ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Actions", i),fHQ_TestDataManager.actions," Actions Label in Cancer MRVS Table");		 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("Cancer"),fHQ_TestDataManager.cancer," Cancer Label in Cancer MRVS Table ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("Specify other cancer"),fHQ_TestDataManager.specifyOtherCancer, " Specify other Cancer Label in Cancer MRVS Table ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Please provide the year of diagnosis or the age of diagnosis", i),fHQ_TestDataManager.pleaseProvideTheYearOfDiagnosisOrTheAgeOfDiagnosis, " Please provide the year of diagnosis or the age of diagnosis Label in Cancer MRVS Table ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Year of diagnosis", i),fHQ_TestDataManager.yearOfDiagnosis, " Year of diagnosis Label in Cancer MRVS Table ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Age of diagnosis", i),fHQ_TestDataManager.ageOfDiagnosis, " Age of diagnosis Label in Cancer MRVS Table ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Additional Information", i),fHQ_TestDataManager.additionalInformation, " Additional Information Label in Cancer MRVS Table ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingContainsNormalizeSpace("No data to display", i),fHQ_TestDataManager.noDataToDisplay, " No data to display Label in Cancer MRVS Table ");	 
	}
	/* Cancer MRVS ADD page Assertions and Submissions */
	public static void addCancerRowInMRVSPage() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.ADD_ROW),fHQ_TestDataManager.addRow, " Add Row label for Cancer in MRVS ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.CANCER), fHQ_TestDataManager.cancer, " Cancer Label in Cancer MRVS Table ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocatorForDropDown(1),FHQConstants.CANCER_TYPE,fHQ_TestDataManager.cancerOptionSelected);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PLEASE_PROVIDE_THE_YEAR_OF_DIAGNOSIS_OR_THE_AGE_OF_DIAGNOSIS),fHQ_TestDataManager.pleaseProvideTheYearOfDiagnosisOrTheAgeOfDiagnosis, " Please provide the year of diagnosis or the age of diagnosis Label in Cancer MRVS ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocatorForDropDown(1),FHQConstants.YEAR_OR_AGE_OF_DIAGNOSIS,fHQ_TestDataManager.pleaseProvideTheYearOfDiagnosisOrTheAgeOfDiagnosisSelected);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorClassNormalizeSpace(FHQConstants.YEAR_OF_DIAGNOSIS),fHQ_TestDataManager.yearOfDiagnosis, " Year of diagnosis Label in Cancer MRVS ");
		MiscUtils.sleep(300);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.yearOfBirthdateBanner,"An estimated date is preferred over “Don’t Know.” Examples: select 1995 if you know the date is in the 1990s but unsure the exact year; select 1982 if you know it was in the early 1980s; select 1977 if you know it was in the late 1970s.", " An estimated date is preferred banner in Cancer MRVS ");		
		MiscUtils.sleep(300);
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocatorForDropDown(1),FHQConstants.yearOfBirthOrDeathAfter1900(),fHQ_TestDataManager.yearOfDiagnosisForCancerSelected);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.ADDITIONAL_INFORMATION), fHQ_TestDataManager.additionalInformation, " Any Additional Information Added for the Cancer Label "); 	
		CharmsUtil.sendKeysToElement(fHQSubmissionPage.dynamicLocatorTextBox("additional_information_cancer"), fHQ_TestDataManager.additionalInformationAddedForCancer); 
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.CANCEL),fHQ_TestDataManager.cancel, " Cancel button label for Cancer in MRVS ");
		CharmsUtil.assertButtonLabel(softAssert, FHQSubmissionPage.addRowSaveButton,fHQ_TestDataManager.add, " Add button label for Cancer in MRVS ");
		CharmsUtil.clickOnElement(FHQSubmissionPage.addRowSaveButton);
	}
	/* Cancer MRVS Added Row Assertions */
	public static void assertCancerRowAddedInMRVSTable(int i) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingAnchorTag("Edit Row 1",i),"", " Edit Row for Cancer label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingAnchorTag("Remove Row 1",i),"", " Remove Row for Cancer label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(7),fHQ_TestDataManager.cancerOptionSelected, " Cancer Option Selected data ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(8),fHQ_TestDataManager.specifyOtherCancerSelected, " Specify other Cancer Selected data ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(9),fHQ_TestDataManager.pleaseProvideTheYearOfDiagnosisOrTheAgeOfDiagnosisSelected, " Please provide the year of diagnosis or the age of diagnosis for Cancer selected data  ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(10),fHQ_TestDataManager.yearOfDiagnosisForCancerSelected, " Year of diagnosis for Cancer selected data ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(11),fHQ_TestDataManager.ageOfDiagnosisForCancerSelected, " Age of diagnosis for Cancer selected data ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(12),fHQ_TestDataManager.additionalInformationAddedForCancer, " Additional Information added for Cancer data ");
	}
	/* BENIGN TUMOR QUESTIONNAIRE Submissions and Assertions */
	public static void benignTumorQuestionsSubmissionsAndAssertions(int i, String string) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_A_BENIGN_TUMOR), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithABenignTumor, " Has this relative ever been diagnosed with one of the benign tumors listed below? Label" + string);
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(i),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithABenignTumorValue);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.diagnosedWithBenignTumorAddButtonInfo,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachBenignTumorThisRelativeHasHad, " Please select the 'Add' button below to add each benign tumor this relative has had.Label " + string);
		FHQSubmissionStepsImpl.assertBenignTumorBannerInMRVSTable(3);		
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Benign Tumor(s)"));
		FHQSubmissionStepsImpl.addBenignTumorRowInMRVSPage();
		FHQSubmissionStepsImpl.assertBenignTumorRowAddedInMRVSTable(3); 
	}
	/* BENIGN TUMOR MRVS Table headings Assertion */
	public static void assertBenignTumorBannerInMRVSTable(int i) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.BENIGN_TUMOR), fHQ_TestDataManager.benignTumor, " Benign Tumor Label in Benign Tumor MRVS Table ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("Add a row for Benign Tumor(s)"),fHQ_TestDataManager.add," Add Label in Benign Tumor MRVS Table ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("Remove all rows for Benign Tumor(s)"),fHQ_TestDataManager.removeAll," Remove All Label in Benign Tumor MRVS Table ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Actions", i),fHQ_TestDataManager.actions," Actions Label in Benign Tumor MRVS Table");		 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("Benign Tumor"),"Benign Tumor"," Benign Tumor Label in Benign Tumor MRVS Table ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Please provide the year of diagnosis or the age of diagnosis", i),fHQ_TestDataManager.pleaseProvideTheYearOfDiagnosisOrTheAgeOfDiagnosis, " Please provide the year of diagnosis or the age of diagnosis Label in Benign Tumor MRVS Table ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Year of diagnosis", i),fHQ_TestDataManager.yearOfDiagnosis, " Year of diagnosis Label in Benign Tumor MRVS Table ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Age of diagnosis", i),fHQ_TestDataManager.ageOfDiagnosis, " Age of diagnosis Label in Benign Tumor MRVS Table ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Additional Information", i),fHQ_TestDataManager.additionalInformation, " Additional Information Label in Benign Tumor MRVS Table ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingContainsNormalizeSpace("No data to display", i),fHQ_TestDataManager.noDataToDisplay, " No data to display Label in Benign Tumor MRVS Table ");	 
	}
	/* BENIGN TUMOR MRVS ADD page Assertions and Submissions */
	public static void addBenignTumorRowInMRVSPage() {
		String yearOfBirthdateBannerText = "An estimated date is preferred over \"Don't Know.\" Examples: select 1995 if you know the date is in the 1990s but unsure the exact year; select 1982 if you know it was in the early 1980s; select 1977 if you know it was in the late 1970s.";
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.ADD_ROW),fHQ_TestDataManager.addRow, " Add Row label for Benign Tumor in MRVS ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("Benign Tumor"),"Benign Tumor", " Benign Tumor Label in Benign Tumor MRVS Table ");
		MiscUtils.sleep(300);
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocatorForDropDown(1),FHQConstants.BENIGN_TUMOR_TYPE,fHQ_TestDataManager.benignTumorOptionSelected);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PLEASE_PROVIDE_THE_YEAR_OF_DIAGNOSIS_OR_THE_AGE_OF_DIAGNOSIS),fHQ_TestDataManager.pleaseProvideTheYearOfDiagnosisOrTheAgeOfDiagnosis, " Please provide the year of diagnosis or the age of diagnosis Label in Benign Tumor MRVS ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocatorForDropDown(1),FHQConstants.YEAR_OR_AGE_OF_DIAGNOSIS,fHQ_TestDataManager.pleaseProvideTheYearOfDiagnosisOrTheAgeOfDiagnosisSelected);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorClassNormalizeSpace(FHQConstants.YEAR_OF_DIAGNOSIS),fHQ_TestDataManager.yearOfDiagnosis, " Year of diagnosis Label in Benign Tumor MRVS ");
		MiscUtils.sleep(300);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.yearOfBirthdateBanner,yearOfBirthdateBannerText," An estimated date is preferred banner in Benign Tumor MRVS ");				
		MiscUtils.sleep(300);
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocatorForDropDown(1),FHQConstants.yearOfBirthOrDeathAfter1900(),fHQ_TestDataManager.yearOfDiagnosisForBenignTumorSelected);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.ADDITIONAL_INFORMATION), fHQ_TestDataManager.additionalInformation, " Any Additional Information Added for the Benign Tumor Label "); 	
		CharmsUtil.sendKeysToElement(fHQSubmissionPage.dynamicLocatorTextBox("additional_information_benign_tumor"), fHQ_TestDataManager.additionalInformationAddedForBenignTumor); 
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.CANCEL),fHQ_TestDataManager.cancel, " Benign Tumor button label for Benign Tumor in MRVS ");
		CharmsUtil.assertButtonLabel(softAssert, FHQSubmissionPage.addRowSaveButton,fHQ_TestDataManager.add, " Add button label for Benign Tumor in MRVS ");
		CharmsUtil.clickOnElement(FHQSubmissionPage.addRowSaveButton);
	}
	/* BENIGN TUMOR MRVS Added Row Assertions */
	public static void assertBenignTumorRowAddedInMRVSTable(int i) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingAnchorTag("Edit Row 1",i),"", " Edit Row for Benign Tumor label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingAnchorTag("Remove Row 1",i),"", " Remove Row for Benign Tumor label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(13),fHQ_TestDataManager.benignTumorOptionSelected, " Benign Tumor Option Selected data ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(14),fHQ_TestDataManager.pleaseProvideTheYearOfDiagnosisOrTheAgeOfDiagnosisSelected, " Please provide the year of diagnosis or the age of diagnosis for Benign Tumor selected data  ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(15),fHQ_TestDataManager.yearOfDiagnosisForBenignTumorSelected, " Year of diagnosis for Benign Tumor selected data ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(16),fHQ_TestDataManager.ageOfDiagnosisForBenignTumorSelected, " Age of diagnosis for Benign Tumor selected data ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(17),fHQ_TestDataManager.additionalInformationAddedForBenignTumor, " Additional Information added for Benign Tumor data ");
	}
	/* MEDICAL CONDITIONS QUESTIONNAIRE Submissions and Assertions */
	public static void medicalConditionQuestionsSubmissionsAndAssertions(int i, String string) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_ANY_OF_THE_MEDICAL_CONDITIONS_LISTED_BELOW  ), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelow, " Has this relative ever been diagnosed with any of the medical conditions listed below? Label" + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingTitle(FHQConstants.MEDICAL_CONDITIONS_BANNER), fHQ_TestDataManager.medicalConditionsBanner, " Medical conditions Banner" + string);		
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(i),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelowValue);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.parentDiagnosedWithMedicalConditionsAddButtonInfo,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachMedicalConditionThisRelativeHasHad, " Please select the 'Add' button below to add each medical condition this relative has had.Label" + string);
		FHQSubmissionStepsImpl.assertMedicalConditionBannerInMRVSTable(4);		
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Medical Condition(s)"));
		FHQSubmissionStepsImpl.addMedicalConditionRowInMRVSPage();
		FHQSubmissionStepsImpl.assertMedicalConditionRowAddedInMRVSTable(4);
	}
	/* Medical Conditions MRVS Table headings Assertion */
	public static void assertMedicalConditionBannerInMRVSTable(int i) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.MEDICAL_CONDITIONS), fHQ_TestDataManager.medicalConditions, " Medical Condition Label in Medical Condition MRVS Table ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("Add a row for Medical Condition(s)"),fHQ_TestDataManager.add," Add Label in Medical Condition MRVS Table ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("Remove all rows for Medical Condition(s)"),fHQ_TestDataManager.removeAll," Remove All Label in Medical Condition MRVS Table ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Actions", i),fHQ_TestDataManager.actions," Actions Label in Medical Condition MRVS Table");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Medical Condition",1),fHQ_TestDataManager.medicalCondition," Medical Condition Label in Medical Condition MRVS Table ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Specify medical condition", 1),fHQ_TestDataManager.specifyMedicalCondition, " Specify  Medical Condition Label in Medical Condition MRVS Table ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Please provide the year of diagnosis or the age of diagnosis", i),fHQ_TestDataManager.pleaseProvideTheYearOfDiagnosisOrTheAgeOfDiagnosis, " Please provide the year of diagnosis or the age of diagnosis Label in Cancer MRVS Table ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Year of diagnosis", i),fHQ_TestDataManager.yearOfDiagnosis, " Year of diagnosis Label in Medical Condition MRVS Table "); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Age of diagnosis", i),fHQ_TestDataManager.ageOfDiagnosis, " Age of diagnosis Label in Medical Condition MRVS Table ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingContainsNormalizeSpace("No data to display", 1),fHQ_TestDataManager.noDataToDisplay, " No data to display Label in Medical Condition MRVS Table ");
	}
	/* Medical Condition MRVS ADD page Assertions and Submissions */
	public static void addMedicalConditionRowInMRVSPage() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.ADD_ROW),fHQ_TestDataManager.addRow, " Add Row label for Medical Condition in MRVS ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants. MEDICAL_CONDITION), fHQ_TestDataManager.medicalCondition, " Medical Condition Label in Cancer MRVS Table ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocatorForDropDown(1),FHQConstants. MEDICAL_CONDITIONS_TYPE,fHQ_TestDataManager.medicalConditionOptionSelected);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants. SPECIFY_MEDICAL_CONDITION), fHQ_TestDataManager. specifyMedicalCondition, " Specify medical condition Label "); 
		CharmsUtil.sendKeysToElement(fHQSubmissionPage.dynamicLocatorTextBox("specify_other_med"), fHQ_TestDataManager.specifyOtherMedicalConditionSelected); 	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PLEASE_PROVIDE_THE_YEAR_OF_DIAGNOSIS_OR_THE_AGE_OF_DIAGNOSIS),fHQ_TestDataManager.pleaseProvideTheYearOfDiagnosisOrTheAgeOfDiagnosis, " Please provide the year of diagnosis or the age of diagnosis Label in Medical Condition MRVS ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocatorForDropDown(1),FHQConstants.YEAR_OR_AGE_OF_DIAGNOSIS,fHQ_TestDataManager.pleaseProvideTheYearOfDiagnosisOrTheAgeOfDiagnosisSelected);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorClassNormalizeSpace(FHQConstants.YEAR_OF_DIAGNOSIS),fHQ_TestDataManager.yearOfDiagnosis, " Year of diagnosis Label in Medical Condition MRVS ");
		MiscUtils.sleep(300);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.yearOfBirthdateBanner,"An estimated date is preferred over “Don’t Know.” Examples: select 1995 if you know the date is in the 1990s but unsure the exact year; select 1982 if you know it was in the early 1980s; select 1977 if you know it was in the late 1970s.", " An estimated date is preferred banner in Medical Condition MRVS ");		
		MiscUtils.sleep(300);
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocatorForDropDown(1),FHQConstants.yearOfBirthOrDeathAfter1900(),fHQ_TestDataManager.yearOfDiagnosisForMedicalConditionSelected);		
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.CANCEL),fHQ_TestDataManager.cancel, " Cancel button label for Medical Condition in MRVS ");
		CharmsUtil.assertButtonLabel(softAssert, FHQSubmissionPage.addRowSaveButton,fHQ_TestDataManager.add, " Add button label for Medical Condition in MRVS ");
		CharmsUtil.clickOnElement(FHQSubmissionPage.addRowSaveButton);
	}
	/* Medical Condition MRVS Added Row Assertions */
	public static void  assertMedicalConditionRowAddedInMRVSTable(int i) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingAnchorTag("Edit Row 1",i),"", " Edit Row for Medical Condition label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingAnchorTag("Remove Row 1",i),"", " Remove Row for Medical Condition label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(18),fHQ_TestDataManager.medicalConditionOptionSelected, " Medical Condition Option Selected data ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(19),fHQ_TestDataManager.specifyOtherMedicalConditionSelected, " Specify Medical Condition Selected data ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(20),fHQ_TestDataManager.pleaseProvideTheYearOfDiagnosisOrTheAgeOfDiagnosisSelected, " Please provide the year of diagnosis or the age of diagnosis for Medical Condition selected data ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(21),fHQ_TestDataManager.yearOfDiagnosisForMedicalConditionSelected, " Year of diagnosis for Medical Condition selected data ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(22),fHQ_TestDataManager.ageOfDiagnosisForMedicalConditionSelected, " Age of diagnosis for Medical Condition selected data ");
	}
	/* OTHER INFORMATION Added */
	public static void otherInformation() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.OTHER),fHQ_TestDataManager.other," Other Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.IS_THERE_ANYTHING_ELSE_YOU_WOULD_LIKE_US_TO_KNOW_ABOUT_THIS_RELATIVE),fHQ_TestDataManager.isThereAnythingElseYouWouldLikeUsToKnowAboutThisRelative," Is there anything else you would like us to know about this relative? Label ");
		CharmsUtil.sendKeysToElement(fHQSubmissionPage.addOtherInformationForRelativeTextBox, fHQ_TestDataManager.addAdditionalInformation);
		MiscUtils.sleep(700);
	}
	/* Final Steps to submit any Family Relative Form */
	public static void finalSubmissionSteps() {	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.submitFormHelpTextBanner,fHQ_TestDataManager.youWillNotBeAbleToModifyThisRecordAfterYouComplete," You will not be able to modify this record after you click Complete. Label ");	
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.completeButton,fHQ_TestDataManager.complete," Complete Button Label ");	 
		CharmsUtil.clickOnElement(fHQSubmissionPage.completeButton);
	}
	/*************************************************/
			/* METHODS FOR THE PARTICIPANT FORM */
	/*************************************************/
	/* Banner Assertions on the Participant form */
	public static void bannerAssertionsForParticipantForm() {
		String header1 = "We know families come in different shapes and sizes. This survey is primarily meant to record health information on your biological (blood-related) relatives. It's okay not to know information about some of your relatives.";
		String header2 = "As you go through your relatives information in these forms, you will be able to fill out the information you know and click the Complete button on each page. Please keep in mind you will not be able to make changes to that relative once completed. When all relatives are completed, the Submit FHQ Questionnaire button will appear.";
		String header3 = "Once you click Submit FHQ Questionnaire, you will see a pop up asking if you'd like to provide additional information. If you would like to tell us about any non-biological relatives to add to your family tree (like an adopted sibling, or a step-parent), you can disclose that information here.";
		String header4 = "Note: You will not be able to edit the survey once you click the Submit FHQ Questionnaire button.";	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.NCI_FAMILY_STUDIES_HUB_RASOPATHIES), fHQ_TestDataManager.nCIFamilyStudiesHubRASopathies," NCI Family Studies Hub: RASopathies Label "); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FHQ_HOME), fHQ_TestDataManager.fHQHome, " FHQ Home Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FORM_VIEW), fHQ_TestDataManager.formView, " Form View Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.WE_KNOW_FAMILIES_COME_IN_DIFFERENT_SHAPES_AND_SIZES),header1," We know families come in different shapes and sizes. Label on the FHQ Survey: ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.AS_YOU_GO_THROUGH_YOUR_RELATIVES_INFORMATION_IN_TH),header2," As you go through your relatives information in these forms ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.ONCE_YOU_CLICK_SUBMIT_FHQ_QUESTIONNAIRE,1),header3," Once you click Submit FHQ Questionnaire ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.noteMyRasLandingPage,header4," Note: You will not be able to edit the survey once you click the Submit FHQ Questionnaire button. ");
		CucumberLogUtils.logScreenshot();
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT), fHQ_TestDataManager.participant, " Header 6 on the FHQ Participant Form: ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.THIS_FORM_WILL_ASK_QUESTIONS_ABOUT_THE_PARTICIPANT_AND_THEIR_CHILDREN_AND_SIBLINGS),fHQ_TestDataManager.thisFormWillAskQuestionsAboutTheParticipantAndTheirChildrenAndSiblings, " This form will ask questions about the participant and their children and siblings. Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.YOU_ARE_CURRENTLY_FILLING_OUT_INFORMATION_FOR_THE_PARTICIPANT),fHQ_TestDataManager.youAreCurrentlyFillingOutInformationForTheParticipant, " You are currently filling out information for the participant. Label ");	
	}
	/* Participant filling the information for oneself */
	public static void participantBasicInformationSubmissionsAndAssertions1() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PLEASE_INDICATE_YOUR_RELATIONSHIP_TO_THE_PARTICIPANT),"Please indicate your relationship to the participant.", " Please indicate your relationship to the participant. Label ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.fHQFieldDropDown,FHQConstants.RELATIONSHIP_TO_PARTICIPANT,fHQ_TestDataManager.pleaseIndicateYourRelationshipToTheParticipant);
		CucumberLogUtils.logScreenshot();
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.THE_FOLLOWING_QUESTIONS_ARE_ABOUT_THE_STUDY_PARTICIPANT),fHQ_TestDataManager.theFollowingQuestionsAreAboutTheStudyParticipant, " The following questions are about the study participant.Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH),"Sex assigned at birth"," Sex assigned at birth Label for Participant ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.fHQFieldDropDown1,FHQConstants.SEX_ASSIGNED_AT_BIRTH,fHQ_TestDataManager.sexAssignedAtBirth);
		CucumberLogUtils.logScreenshot();
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_GENDER_IDENTITY),"Gender Identity"," Gender Identity Label for Participant ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.fHQFieldDropDown1,FHQConstants.GENDER_IDENTITY,fHQ_TestDataManager.genderIdentity);	
		CucumberLogUtils.logScreenshot();
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.HAS_THE_PARTICIPANT_EVER_HAD_ANY_MISCARRIAGES_OR_STILLBIRTHS),"Has the participant ever had any miscarriages or stillbirths?"," Has the participant ever had any miscarriages or stillbirths? Label ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.fHQFieldDropDown1,FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasTheParticipantEverHadAnyMiscarriagesOrStillbirths);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES),"Total number of Miscarriages"," Total number of Miscarriages Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.LESS_THAN_20_WEEKS_OF_PREGNANCY),fHQ_TestDataManager.lessThan20WeeksOfPregnancy," less than 20 weeks of pregnancy Label ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.fHQFieldDropDown1,FHQConstants.numberUpToN(20),fHQ_TestDataManager.totalNumberOfMiscarriages);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PLEASE_WRITE_THE_FIRST_NAME_OF_THE_PARTNERS_WITH_WHOM_THE_PARTICIPANT_HAD_THE_PREGNANCYIES_ABOVE),fHQ_TestDataManager.pleaseWriteTheFirstNameOfThePartnersWithWhomTheParticipantHadThePregnancyiesAbove," Please write the first name of the partner(s) with whom the participant had the pregnancy(ies) above. Label1 ");
		CharmsUtil.sendKeysToElement(fHQSubmissionPage.dynamicLocatorForTextBox("miscarriage_partners"),fHQ_TestDataManager.pleaseWriteTheFirstNameOfThePartnersWithWhomTheParticipantHadThePregnancyiesAboveMiscarriages);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS),"Total number of Stillbirths"," Total number of Stillbirths Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.MORE_THAN_20_WEEKS_OF_PREGNANCY),fHQ_TestDataManager.moreThan20WeeksOfPregnancy," Header ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.fHQFieldDropDown1,FHQConstants.numberUpToN(20),fHQ_TestDataManager.totalNumberOfStillbirths);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.partnerHeading2,fHQ_TestDataManager.pleaseWriteTheFirstNameOfThePartnersWithWhomTheParticipantHadThePregnancyiesAbove," Please write the first name of the partner(s) with whom the participant had the pregnancy(ies) above. Label2 ");	
		CharmsUtil.sendKeysToElement(fHQSubmissionPage.dynamicLocatorForTextBox("stillbirth_partners"), fHQ_TestDataManager.pleaseWriteTheFirstNameOfThePartnersWithWhomTheParticipantHadThePregnancyiesAboveStillbirths);
	}
	/* Proxy filling the information for Proband */
	public static void participantBasicInformationSubmissionsAndAssertions2() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PLEASE_INDICATE_YOUR_RELATIONSHIP_TO_THE_PARTICIPANT),"Please indicate your relationship to the participant.", " Please indicate your relationship to the participant. Label ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator2ForDropDown(1),FHQConstants.RELATIONSHIP_TO_PARTICIPANT,fHQ_TestDataManager.pleaseIndicateYourRelationshipToTheParticipant);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.THE_FOLLOWING_QUESTIONS_ARE_ABOUT_THE_STUDY_PARTICIPANT),fHQ_TestDataManager.theFollowingQuestionsAreAboutTheStudyParticipant, " The following questions are about the study participant.Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.FIRST_NAME_OF_THE_PARTICIPANT),"First Name of the participant"," First Name of the participant Label for Participant ");
		CharmsUtil.sendKeysToElement(fHQSubmissionPage.dynamicLocatorForTextBox("first_name"), fHQ_TestDataManager.participantFirstName);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.FIRST_INITIAL_OF_LAST_NAME_OF_THE_PARTICIPANT),"First Initial of LAST Name of the participant"," First Initial of LAST Name of the participant Label for Participant ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator2ForDropDown(2),FHQConstants.firstInitialLastName(),fHQ_TestDataManager.participantFirstInitialOfLASTNameValue);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH),"Sex assigned at birth"," Sex assigned at birth Label for Participant ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator2ForDropDown(2),FHQConstants.firstInitialLastName(),fHQ_TestDataManager.participantFirstInitialOfLASTNameValue);
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator2ForDropDown(3),FHQConstants.SEX_ASSIGNED_AT_BIRTH,fHQ_TestDataManager.sexAssignedAtBirth);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_GENDER_IDENTITY),"Gender Identity"," Gender Identity Label for Participant ");	
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator2ForDropDown(4),FHQConstants.GENDER_IDENTITY,fHQ_TestDataManager.genderIdentity);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.HAS_THE_PARTICIPANT_EVER_HAD_ANY_MISCARRIAGES_OR_STILLBIRTHS),"Has the participant ever had any miscarriages or stillbirths?"," Has the participant ever had any miscarriages or stillbirths? Label ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.fHQFieldDropDown,FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasTheParticipantEverHadAnyMiscarriagesOrStillbirths);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES),"Total number of Miscarriages"," Total number of Miscarriages Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.LESS_THAN_20_WEEKS_OF_PREGNANCY),fHQ_TestDataManager.lessThan20WeeksOfPregnancy," less than 20 weeks of pregnancy Label ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.fHQFieldDropDown,FHQConstants.numberUpToN(20),fHQ_TestDataManager.totalNumberOfMiscarriages);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PLEASE_WRITE_THE_FIRST_NAME_OF_THE_PARTNERS_WITH_WHOM_THE_PARTICIPANT_HAD_THE_PREGNANCYIES_ABOVE),fHQ_TestDataManager.pleaseWriteTheFirstNameOfThePartnersWithWhomTheParticipantHadThePregnancyiesAbove," Please write the first name of the partner(s) with whom the participant had the pregnancy(ies) above. Label1 ");
		CharmsUtil.sendKeysToElement(fHQSubmissionPage.dynamicLocatorForTextBox("miscarriage_partners"),fHQ_TestDataManager.pleaseWriteTheFirstNameOfThePartnersWithWhomTheParticipantHadThePregnancyiesAboveMiscarriages);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS),"Total number of Stillbirths"," Total number of Stillbirths Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.MORE_THAN_20_WEEKS_OF_PREGNANCY),fHQ_TestDataManager.moreThan20WeeksOfPregnancy," Header ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.fHQFieldDropDown,FHQConstants.numberUpToN(20),fHQ_TestDataManager.totalNumberOfStillbirths);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.partnerHeading2,fHQ_TestDataManager.pleaseWriteTheFirstNameOfThePartnersWithWhomTheParticipantHadThePregnancyiesAbove," Please write the first name of the partner(s) with whom the participant had the pregnancy(ies) above. Label2 ");	
		CharmsUtil.sendKeysToElement(fHQSubmissionPage.dynamicLocatorForTextBox("stillbirth_partners"), fHQ_TestDataManager.pleaseWriteTheFirstNameOfThePartnersWithWhomTheParticipantHadThePregnancyiesAboveStillbirths);
	}
	/* Participant's Children Questions Asked */
	public static void participantChildQuestionsSubmissionsAndAssertions1() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HOW_MANY_TOTAL_CHILDREN_ALIVE_AND_DECEASED_HAS_THE_PARTICIPANT_HAD),"How many total children (alive and deceased) has the participant had?"," How many total children (alive and deceased) has the participant had? Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.childrenHelpTextBanner,fHQ_TestDataManager.pleaseIncludeLivingAndDeceasedChildren," Please include living and deceased children. Label ");			
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.fHQFieldDropDown1,FHQConstants.numberUpToN(20),fHQ_TestDataManager.howManyTotalChildrenAliveAndDeceasedHasTheParticipantHad);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.CHILDREN),fHQ_TestDataManager.children," Children Label ");		
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("Add a row for Children"),fHQ_TestDataManager.add," Add Label for child ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("Remove all rows for Children"),fHQ_TestDataManager.removeAll," Remove All Label for child ");		
	}
	/* Participant's Children Questions Asked */
	public static void participantChildQuestionsSubmissionsAndAssertions2() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HOW_MANY_TOTAL_CHILDREN_ALIVE_AND_DECEASED_HAS_THE_PARTICIPANT_HAD),"How many total children (alive and deceased) has the participant had?"," How many total children (alive and deceased) has the participant had? Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingTitle(FHQConstants.PLEASE_INCLUDE_LIVING_AND_DECEASED_CHILDREN),fHQ_TestDataManager.pleaseIncludeLivingAndDeceasedChildren," Please include living and deceased children. Label ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.fHQFieldDropDown,FHQConstants.numberUpToN(20),fHQ_TestDataManager.howManyTotalChildrenAliveAndDeceasedHasTheParticipantHad);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.CHILD),fHQ_TestDataManager.child," Child Label ");		
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("Add a row for Children"),fHQ_TestDataManager.add," Add Label for child ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("Remove all rows for Children"),fHQ_TestDataManager.removeAll," Remove All Label for child ");		
	}
	/* Assertion of common fields of all the MRVS Table */
	public static void assertMRVSTable(int i) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Actions", i),fHQ_TestDataManager.actions," Actions Label ");		 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("First Name",i),fHQ_TestDataManager.firstName," First Name Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("First Initial of LAST Name", i),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Vital Status", i),fHQ_TestDataManager.vitalStatus, " Vital Status Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingContainsNormalizeSpace("No data to display", 1),fHQ_TestDataManager.noDataToDisplay, " No data to display Label ");	 
	}
	/* Child MRVS ADD page Assertions and Submissions */
	public static void addChildRowInMRVSPage(){
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.ADD_ROW),fHQ_TestDataManager.addRow, " Add Row label for child  in MRVS Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstName, " First Name label for child  in MRVS Page ");
		CharmsUtil.sendKeysToElement(fHQSubmissionPage.dynamicLocatorForTextBox("first_name_child"), fHQ_TestDataManager.childfirstName);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label for child  in MRVS Page ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.fHQFieldDropDown,FHQConstants.firstInitialLastName(),fHQ_TestDataManager.childfirstInitialOfLASTName);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTICIPANT_VITAL_STATUS),fHQ_TestDataManager.vitalStatus, " Vital Status label for child  in MRVS Page ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.fHQFieldDropDown,FHQConstants.VITAL_STATUS_LIST,fHQ_TestDataManager.childvitalStatus);
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.CANCEL),fHQ_TestDataManager.cancel, " Cancel button label for child  in MRVS Page ");
		CharmsUtil.assertButtonLabel(softAssert, FHQSubmissionPage.addRowSaveButton,fHQ_TestDataManager.add, " Add button label for child  in MRVS Page ");
		CharmsUtil.clickOnElement(FHQSubmissionPage.addRowSaveButton);
	}
	/* Assert the Child Row added */
	public static void assertChildRowAddedInMRVSTableForParticipant(int i) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingAnchorTag("Edit Row 1",i),"", " Edit Row for child label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingAnchorTag("Remove Row 1",i),"", " Remove Row for child label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(i),fHQ_TestDataManager.childfirstName, " Child First Name data ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(i+1),fHQ_TestDataManager.childfirstInitialOfLASTName, " Child First Initial of LAST Name data ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(i+2),fHQ_TestDataManager.childvitalStatus, " Child Vital Status data ");				
	}
	/* Participant's Partner Questions Asked */
	public static void participantPartnerQuestionsSubmissionsAndAssertions1() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HOW_MANY_TOTAL_DIFFERENT_PARTNERS_HAS_THE_PARTICIPANT_HAD_BIOLOGICAL_CHILDREN_WITH), "How many total different partners has the participant had biological children with?"," How many total different partners has the participant had biological children with? label ");		
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingTitle(FHQConstants.PLEASE_DO_NOT_COUNT_THEM_HERE),fHQ_TestDataManager.pleaseDoNotCountThemHere, " Please do not count them here. Label ");					
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.fHQFieldDropDown1,FHQConstants.numberUpToN(10),fHQ_TestDataManager.howManyTotalDifferentPartnersHasTheParticipantHadBiologicalChildrenWith);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTNER),fHQ_TestDataManager.partner, " Partner Label ");		 			 
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("Add a row for Partner"),fHQ_TestDataManager.add, " Add a row for Partner Label ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("Remove all rows for Partner"),fHQ_TestDataManager.removeAll, " Remove all rows for Partner Label ");
	}
	/* Participant's Partner Questions Asked */
	public static void participantPartnerQuestionsSubmissionsAndAssertions2() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HOW_MANY_TOTAL_DIFFERENT_PARTNERS_HAS_THE_PARTICIPANT_HAD_BIOLOGICAL_CHILDREN_WITH), "How many total different partners has the participant had biological children with?"," How many total different partners has the participant had biological children with? label ");		
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingTitle(FHQConstants.PLEASE_DO_NOT_COUNT_THEM_HERE),fHQ_TestDataManager.pleaseDoNotCountThemHere, " Please do not count them here. Label ");					
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.fHQFieldDropDown,FHQConstants.numberUpToNStartingWithOne(10),fHQ_TestDataManager.howManyTotalDifferentPartnersHasTheParticipantHadBiologicalChildrenWith);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTNER),fHQ_TestDataManager.partner, " Partner Label ");		 			 
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("Add a row for Partner"),fHQ_TestDataManager.add, " Add a row for Partner Label ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("Remove all rows for Partner"),fHQ_TestDataManager.removeAll, " Remove all rows for Partner Label ");
	}
	/* Participant's Partner MRVS Page Assertions and Submission */
	public static void addPartnerRowInMRVSPage() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.ADD_ROW),fHQ_TestDataManager.addRow, " Add Row For Partner in MRVS ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstName, " First name of Partner Label in MRVS ");
		CharmsUtil.sendKeysToElement(fHQSubmissionPage.dynamicLocatorForTextBox("first_name_partner"), fHQ_TestDataManager.partnerfirstName);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name of Partner Label in MRVS "); 
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.fHQFieldDropDown,FHQConstants.firstInitialLastName(),fHQ_TestDataManager.partnerfirstInitialOfLASTName);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTICIPANT_VITAL_STATUS),fHQ_TestDataManager.vitalStatus, " Vital Status of Partner Label in MRVS ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.fHQFieldDropDown,FHQConstants.VITAL_STATUS_LIST,fHQ_TestDataManager.partnervitalStatus);
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.CANCEL),fHQ_TestDataManager.cancel, " Cancel Button for Partner MRVS ");
		CharmsUtil.assertButtonLabel(softAssert, FHQSubmissionPage.addRowSaveButton,fHQ_TestDataManager.add," Add Button for Partner MRVS ");
		CharmsUtil.clickOnElement(FHQSubmissionPage.addRowSaveButton);
	}
	/* Assert the Participant's Partner Row added */
	public static void assertPartnerRowAddedInMRVSTableForParticipant(int i) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingAnchorTag("Edit Row 1",2),"", " Edit Row for Partner ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingAnchorTag("Remove Row 1",2),"", " Remove Row for Partner ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(i+ 2),fHQ_TestDataManager.partnerfirstName, " First name of Partner Data ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(i+3),fHQ_TestDataManager.partnerfirstInitialOfLASTName, " First Initial of LAST Name of Partner Data");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(i+4),fHQ_TestDataManager.partnervitalStatus, " Vital Status of Partner Data ");
	}
	/* Participant's Siblings Question Asked */
	public static void participantSiblingQuestionsSubmissionsAndAssertions1() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.WE_WOULD_LIKE_TO_ASK_YOU_SOME_QUESTIONS_ABOUT_SIBLINGS_DETAILS),fHQ_TestDataManager.weWouldLikeToAskYouSomeQuestionsAboutSiblingsDetails, " We would like to ask you some questions about Siblings details Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HOW_MANY_SIBLINGS_DOES_THE_PARTICIPANT_HAVE),"How many siblings does the participant have?", " How many siblings does the participant have? Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForHelpTextBanner(5),fHQ_TestDataManager.pleaseIncludeAllFullAndHalfSiblings, " Please include all full and half siblings Label ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.fHQFieldDropDown1,FHQConstants.numberUpToN(12),fHQ_TestDataManager.howManySiblingsDoesTheParticipantHave);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.SIBLINGS),fHQ_TestDataManager.siblings, " Siblings Label ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("Add a row for Siblings"),fHQ_TestDataManager.add, " Add a row for Siblings Label ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("Remove all rows for Siblings"),fHQ_TestDataManager.removeAll, " Remove all rows for Siblings Label ");
	}
	/* Participant's Siblings Question Asked */
	public static void participantSiblingQuestionsSubmissionsAndAssertions2() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.WE_WOULD_LIKE_TO_ASK_YOU_SOME_QUESTIONS_ABOUT_SIBLINGS_DETAILS),fHQ_TestDataManager.weWouldLikeToAskYouSomeQuestionsAboutSiblingsDetails, " We would like to ask you some questions about Siblings details Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HOW_MANY_SIBLINGS_DOES_THE_PARTICIPANT_HAVE),"How many siblings does the participant have?", " How many siblings does the participant have? Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingTitle(FHQConstants.PLEASE_INCLUDE_ALL_FULL_AND_HALF_SIBLINGS),fHQ_TestDataManager.pleaseIncludeAllFullAndHalfSiblings, " Please include all full and half siblings Label ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.fHQFieldDropDown,FHQConstants.numberUpToN(12),fHQ_TestDataManager.howManySiblingsDoesTheParticipantHave);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.SIBLINGS),fHQ_TestDataManager.siblings, " Siblings Label ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("Add a row for Siblings"),fHQ_TestDataManager.add, " Add a row for Siblings Label ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("Remove all rows for Siblings"),fHQ_TestDataManager.removeAll, " Remove all rows for Siblings Label ");
	}
	/* Assertions for the Participant's Siblings Row on the Participant form */
	public static void assertSiblingMRVSTable() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Actions", 3),fHQ_TestDataManager.actions," Actions Label for Sibling Table  ");		 		
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TYPES_OF_SIBLING_RELATION),"Types of Sibling relation", " Types of Sibling relation Label in Table "); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FIRST_NAME_OF_SIBLING),"First name of Sibling", " First name of Sibling Label in Table "); 
		CharmsUtil.assertTextBoxData(softAssert, FHQSubmissionPage.firstInitalOfLastNameSibling,"First Initial of LAST Name", " First Initial of LAST Name of Sibling Label in Table "); 	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.VITAL_STATUS_OF_SIBLING),"Vital Status of Sibling", " Vital Status of Sibling Label in Table "); 	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingContainsNormalizeSpace("No data to display", 3),fHQ_TestDataManager.noDataToDisplay, " No data to display for Sibling Label in Table ");	 
	}
	/* Participant's Sibling MRVS Page Assertions and Submission */
	public static void addSiblingRowInMRVSPageForParticipant() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.ADD_ROW),fHQ_TestDataManager.addRow, " Add Row For Sibling in MRVS ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TYPES_OF_SIBLING_RELATION),"Types of Sibling relation", " Types of Sibling relation Label in MRVS ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.fHQFieldDropDown,FHQConstants.firstInitialLastName(),fHQ_TestDataManager.typesOfSiblingRelationSelected);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FIRST_NAME_OF_SIBLING),"First name of Sibling", " First name of Sibling Label in MRVS ");
		CharmsUtil.sendKeysToElement(fHQSubmissionPage.dynamicLocatorForTextBox("first_name_of_sibling"),fHQ_TestDataManager.siblingFirstName);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),"First Initial of LAST Name", " First Initial of LAST Name of Sibling Label in MRVS  "); 	
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.fHQFieldDropDown,FHQConstants.firstInitialLastName(),fHQ_TestDataManager.siblingfirstInitialOfLASTName);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.VITAL_STATUS_OF_SIBLING),"Vital Status of Sibling", " Vital Status of Sibling Label in MRVS ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.fHQFieldDropDown,FHQConstants.VITAL_STATUS_LIST,fHQ_TestDataManager.siblingVitalStatus);
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.CANCEL),fHQ_TestDataManager.cancel, " Cancel Button for Sibling MRVS ");
		CharmsUtil.assertButtonLabel(softAssert, FHQSubmissionPage.addRowSaveButton,fHQ_TestDataManager.add, " Add Button for Sibling MRVS ");
		CharmsUtil.clickOnElement(FHQSubmissionPage.addRowSaveButton);
	}
	/* Assert the Participant's Sibling Row added */
	public static void assertSiblingRowAddedInMRVSTableForParticipant(int i) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingAnchorTag("Edit Row 1",i),"", " Edit Row for Sibling ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingAnchorTag("Remove Row 1",i),"", " Remove Row for Sibling  ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(i+4),fHQ_TestDataManager.typesOfSiblingRelationSelected, " Types of Sibling relation Data ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(i+5),fHQ_TestDataManager.siblingFirstName," First name of Sibling Data ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(i+6),fHQ_TestDataManager.siblingfirstInitialOfLASTName, " First Initial of LAST Name of Sibling Data ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(i+7),fHQ_TestDataManager.siblingVitalStatus, " Vital Status of Sibling Data ");
	}
	/* Participant's Other Questions Asked */
	public static void otherInformationForParticipant() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.IS_THERE_ANYTHING_ELSE_YOU_WOULD_LIKE_US_TO_KNOW_ABOUT_THE_PARTICIPANT),"Is there anything else you would like us to know about the participant?"," Is there anything else you would like us to know about the participant? Label "); 	
		CharmsUtil.sendKeysToElement(fHQSubmissionPage.anythingElseAboutThisParticipantTextBox, fHQ_TestDataManager.addAdditionalInformation); 
	}
	/************************************************************/
			/* METHODS FOR THE PARTNER FORM */
	/************************************************************/
	/* Assertions for the Partner Table LABELS on List View Page  */
	public static void partnersListViewTableLabelsAssertions() {
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("FHQ Partners Context Menu"),"", " FHQ Partners Context Menu Label in Partner Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTNERS), fHQ_TestDataManager.partners, " Partners Label in Partner Form ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.newButtonLinkOnListView, fHQ_TestDataManager.addNewPartners, " Add New Partners button Label in Partner Form ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.rowsDetailsOnListView, "The blue highlighted rows represent the incompleted family records. If you have additional relatives in this category, please use the \"Add\" button below", " The blue highlighted rows represent the incompleted family records Label in Partner Form "); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("First Name",1),fHQ_TestDataManager.firstName," First Name Label in Partner Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("First Initial of LAST Name", 1),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name Label in Partner Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Vital Status", 1),fHQ_TestDataManager.vitalStatus, " Vital Status Label in Partner Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Year of Birth", 1),fHQ_TestDataManager.yearOfBirth, " Year of Birth Label in Partner Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Relation to patient", 1),fHQ_TestDataManager.relationToPatient, " Relation to patient Label in Partner Form ");		
	}
	/* Assertions for the Partner Table VALUES on List View Page */ 
	public static void partnerListViewTableValuesAssertions(){
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorForButtonUsingText(FHQConstants.FIRST_NAME), fHQ_TestDataManager.partnerFirstName, " Partner First Name Label in Partner Form ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorForButtonUsingText(FHQConstants.FIRST_INITIAL_OF_LAST_NAME), fHQ_TestDataManager.partnerFirstInitialOfLASTName, " Partner First Initial of LAST Name Label in Partner Form ");			
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorForButtonUsingText(FHQConstants.VITAL_STATUS), fHQ_TestDataManager.partnerVitalStatus, " Partner Vital Status Label in Partner Form ");	
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorForButtonUsingText(FHQConstants.YEAR_OF_BIRTH), fHQ_TestDataManager.partnerYearOfBirth, " Partner Year of Birth Label in Partner Form ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorForButtonUsingText(FHQConstants.RELATION_TO_PATIENT), fHQ_TestDataManager.partnerRelationToPatient, " Partner Relation to patient Label in Partner Form ");		
	}
	public static void partnerBasicInformationSubmissionsAndAssertions(){
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTNER),fHQ_TestDataManager.partner, " Partner Label in Partner Form ");		 			 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.YOU_ARE_CURRENTLY_FILLING_OUT_INFORMATION_FOR_THE_PARTICIPANTS_PARTNER),fHQ_TestDataManager.youAreCurrentlyFillingOutInformationForTheParticipantPartner, " You are currently filling out information for the participant's Partner. Label in Partner Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.shortDescriptionInformationBanner,fHQ_TestDataManager.pleaseProvideWhatInformationYouCanAboutThisPartner, " Please provide what information you can about this partner Label in Partner Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.BASIC_INFORMATION),fHQ_TestDataManager.basicInformation, " Basic Information Label ");		 			 		 			 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.isThisYourCurrentPartnerLabel,fHQ_TestDataManager.isThisTheParticipantCurrentPartner, " Please provide what information you can about this partner Label in Partner Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.fHQFieldDropDown,FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.isThisTheParticipantCurrentPartnerValue);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstName, " First Name label for Partner in Partner Form in Partner Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForTextBox("first_name"),fHQ_TestDataManager.partnerFirstName, " First Name for Partner in Partner Form in Partner Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label of Partner in Partner Form in Partner Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDownValue(2),fHQ_TestDataManager.partnerFirstInitialOfLASTName, " First Initial of LAST Name Value of Partner in Partner Form in Partner Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirth, " Year of Birth label for Partner in Partner Form "); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.yearOfBirthdateBanner,fHQ_TestDataManager.anEstimatedDateIsPreferred, " An estimated date is preferred banner for Partner in Partner Form ");		
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.fHQFieldDropDown,FHQConstants.yearOfBirthOrDeathAfter1900(),fHQ_TestDataManager.partnerYearOfBirthValue);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.VITAL_STATUS),fHQ_TestDataManager.vitalStatus, " Vital Status Label of Partner in Partner Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDownValue(4),fHQ_TestDataManager.partnerVitalStatus, " First Initial of LAST Name Value of Partner in Partner Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH),"Sex assigned at birth"," Sex assigned at birth Label of Partner in Partner Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocatorForDropDown(4),FHQConstants.SEX_ASSIGNED_AT_BIRTH,fHQ_TestDataManager.partnerSexAssignedAtBirth);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_GENDER_IDENTITY),"Gender Identity"," Gender Identity Label of Partner in Partner Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocatorForDropDown(4),FHQConstants.GENDER_IDENTITY,fHQ_TestDataManager.partnerGenderIdentity);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.IS_THE_PARTICIPANT_BLOOD_RELATED_TO_THIS_PERSON),fHQ_TestDataManager.isTheParticipantBloodRelatedToThisPerson," Is the participant blood-related to this person? Label of Partner in Partner Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingTitle(FHQConstants.IF_YOU_ARE_FILLING_OUT_THIS_FORM_FOR_YOURSELF),fHQ_TestDataManager.ifYouAreFillingOutThisFormForYourself," If you are filling out this form for yourself Label of Partner in Partner Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocatorForDropDown(4),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.isTheParticipantBloodRelated);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PLEASE_DESCRIBE_HOW_THE_PARTICIPANT_IS_RELATED_TO_THIS_PERSON),fHQ_TestDataManager.pleaseDescribeHowTheParticipantIsRelatedToThisPerson," Please describe how the participant is related to this person Label of Partner in Partner Form ");
		CharmsUtil.sendKeysToElement(fHQSubmissionPage.dynamicLocatorForTextBox("please_describe_how_the_participant_is_related_to_this_person"), fHQ_TestDataManager.describeTheParticipantRelatedToThisPerson);
	}
	public static void partnerOtherQuestions() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.OTHER),fHQ_TestDataManager.other," Other Label of Partner in Partner Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.IS_THERE_ANY_ADDITIONAL_INFORMATION_YOU_WOULD_LIKE_US_TO_KNOW_OR_UNDERSTAND_ABOUT_THIS_RELATIVE),fHQ_TestDataManager.isThereAnyAdditionalInformationYouWouldLikeUsToKnowOrUnderstandAboutThisRelative," Is there any additional information  Label of Partner in Partner Form ");
		CharmsUtil.sendKeysToElement(fHQSubmissionPage.participantRelatedToThisPartnerTextBox, fHQ_TestDataManager.addAdditionalInformation);
	}
	/***********************************************************/
				/* METHODS FOR THE PARENT FORM */
	/************************************************************/
	/* Assertions for the Parent Table LABELS on List View Page  */
	public static void parentsListViewTableLabelsAssertions() {
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("FHQ Parents Context Menu"),"", " FHQ Parents Context Menu Label in Parent List view page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARENTS), fHQ_TestDataManager.parents, " Parents Label in Parent List view page ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.rowsDetailsOnListView,fHQ_TestDataManager.theBlueHighlightedRowsRepresentTheIncompletedFamilyRecords, " The blue highlighted rows represent the incompleted family records Label in Parent List view page "); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.ALL), fHQ_TestDataManager.all, " All Label in Parent List view page  ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.relationToPatientLink, fHQ_TestDataManager.relationToPatientParent, " Relation to Patient in (Biological Mother, Biological Father) Label in Parent List view page ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("First Name",1),fHQ_TestDataManager.firstName," First Name Label in Parent List view page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("First Initial of LAST Name", 1),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name Label in Parent List view page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Vital Status", 1),fHQ_TestDataManager.vitalStatus, " Vital Status Label in Parent List view page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Year of Birth", 1),fHQ_TestDataManager.yearOfBirth, " Year of Birth Label in Parent List view page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Relation to Patient", 1),fHQ_TestDataManager.relationsToPatient, " Relation to patient Label in Parent List view page ");	
	}
	/* Assertions for the Parents Table VALUES on List View Page */ 
	public static void parentsListViewTableValuesAssertions(String string){
		//First Row
		if (fHQSubmissionPage.dynamicLocatorElementInTable(1,5).getText().trim().equals("Biological Father")) {
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,1), fHQ_TestDataManager.firstNameValue1, string + "First Name Value1 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,2), fHQ_TestDataManager.firstInitialOfLASTNameValue1, string +  "First Initial of LAST Name Value1 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,3), fHQ_TestDataManager.vitalStatusValue1, string + "Vital Status Value1 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,4), fHQ_TestDataManager.yearOfBirthValue1, string + "Year of Birth Value1 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,5), fHQ_TestDataManager.relationToPatientValue1, string + "Relation to Patient Value1 ");		
		}
		else if (fHQSubmissionPage.dynamicLocatorElementInTable(1,5).getText().trim().equals("Biological Mother")) {
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,1), fHQ_TestDataManager.firstNameValue2, string + "First Name Value1 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,2), fHQ_TestDataManager.firstInitialOfLASTNameValue2, string +  "First Initial of LAST Name Value1 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,3), fHQ_TestDataManager.vitalStatusValue2, string + "Vital Status Value1 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,4), fHQ_TestDataManager.yearOfBirthValue2, string + "Year of Birth Value1 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,5), fHQ_TestDataManager.relationToPatientValue2, string + "Relation to Patient Value1 ");	
			}		
		//Second Row
		if (fHQSubmissionPage.dynamicLocatorElementInTable(2,5).getText().trim().equals("Biological Father")) {
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,1), fHQ_TestDataManager.firstNameValue1, string + "First Name Value2 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,2), fHQ_TestDataManager.firstInitialOfLASTNameValue1, string +  "First Initial of LAST Name Value2 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,3), fHQ_TestDataManager.vitalStatusValue1, string + "Vital Status Value2 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,4), fHQ_TestDataManager.yearOfBirthValue1, string + "Year of Birth Value2 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,5), fHQ_TestDataManager.relationToPatientValue1, string + "Relation to Patient Value2 ");		
		}
		else if (fHQSubmissionPage.dynamicLocatorElementInTable(2,5).getText().trim().equals("Biological Mother")) {
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,1), fHQ_TestDataManager.firstNameValue2, string + "First Name Value2 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,2), fHQ_TestDataManager.firstInitialOfLASTNameValue2, string +  "First Initial of LAST Name Value2 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,3), fHQ_TestDataManager.vitalStatusValue2, string + "Vital Status Value2 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,4), fHQ_TestDataManager.yearOfBirthValue2, string + "Year of Birth Value2 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,5), fHQ_TestDataManager.relationToPatientValue2, string + "Relation to Patient Value2 ");	
			}
		}
	/* Submissions and Assertions for the Basic Information of the Parent */
	public static void parentBasicInformationSubmissionsAndAssertions(String string) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.parentTypeHeading,fHQ_TestDataManager.parentType, string + " Label" + string );		 			 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.YOU_ARE_CURRENTLY_FILLING_OUT_INFORMATION),fHQ_TestDataManager.youAreCurrentlyFillingOutInformation, " You are currently filling out information for the participant's Label" + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.I_DO_NOT_KNOW_ANY_INFORMATION_ABOUT_THIS_BIOLOGICAL_RELATIVE),fHQ_TestDataManager.iDoNotKnowAnyInformationAboutThisBiologicalRelative, " I do not know any information about this biological relative Label" + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.BASIC_INFORMATION),fHQ_TestDataManager.basicInformation, " Basic Information Label" + string);		 			 		 			 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstName, " First Name label" + string); 
		CharmsUtil.sendKeysToElement(fHQSubmissionPage.dynamicLocatorForTextBox("first_name"), fHQ_TestDataManager.firstNameValueAdded);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label" + string); 
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator2ForDropDown(3), FHQConstants.firstInitialLastName(),fHQ_TestDataManager.firstInitialOfLASTNameAdded);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.WAS_THIS_RELATIVE_ADOPTED),fHQ_TestDataManager.wasThisRelativeAdopted, " Was this relative adopted? Label" + string);
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator2ForDropDown(4),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.relativeAdoptedValueSelected);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirth, " Year of Birth label" + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.yearOfBirthdateBanner,"An estimated date is preferred over “Don’t Know.” Examples: select 1995 if you know the date is in the 1990s but unsure the exact year; select 1982 if you know it was in the early 1980s; select 1977 if you know it was in the late 1970s.", " An estimated date is preferred banner" + string);			
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator2ForDropDown(5),FHQConstants.yearOfBirthOrDeathAfter1900(),fHQ_TestDataManager.yearOfBirthValueAdded);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.VITAL_STATUS),fHQ_TestDataManager.vitalStatus, " Vital Status Label" + string);
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator2ForDropDown(6),FHQConstants.VITAL_STATUS_LIST,fHQ_TestDataManager.vitalStatusValueAdded);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH),fHQ_TestDataManager.sexAssignedAtBirth," Sex assigned at birth Label" + string);
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator2ForDropDown(10),FHQConstants.SEX_ASSIGNED_AT_BIRTH,fHQ_TestDataManager.sexAssignedAtBirthValueAdded);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_GENDER_IDENTITY), fHQ_TestDataManager.genderIdentity, " Gender Identity Label" + string);
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator2ForDropDown(11),FHQConstants.GENDER_IDENTITY,fHQ_TestDataManager.genderIdentityValueAdded);	
	}
	/* Siblings Information added For Parent */
	public static void siblingzSubmissionsAndAssertionsForParent(String string) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HOW_MANY_SIBLINGS_DOES_THIS_RELATIVE_HAVE), fHQ_TestDataManager.howManySiblingsDoesThisRelativeHave, " How many siblings does this relative have? Label"+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.siblingBanner, fHQ_TestDataManager.howManySiblingsDoesThisRelativeHaveBanner, " Sibling Banner Label" + string);
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator2ForDropDown(21),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.howManySiblingsDoesThisRelativeHaveValue);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.siblingAddButtonInfo,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachSiblingThisRelativeHas, " Please select the 'Add' button below to add each sibling this relative has. Label"+ string);			
		FHQSubmissionStepsImpl.assertSiblingBannerInMRVSTable(4, "in Parent Form ");	
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Siblings"));
		FHQSubmissionStepsImpl.addSiblingRowInMRVSPage(" in Parent Form ");	
		FHQSubmissionStepsImpl.assertSiblingRowAddedInMRVSTable(5, " in Parent Form ");
	}
	/***************************************************/
			/* CHILDREN FORM METHODS */
	/***************************************************/
	/* Assertions for the Child Table on List View Page   */
	public static void childListViewTableAssertions() {
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("FHQ Children Context Menu"),"", " FHQ Children Context Menu Label of child in List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.SONS_DAUGHTERS), fHQ_TestDataManager.sonsDaughters, " Sons/Daughters Label of child in List View Page ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.newButtonLinkOnListView, fHQ_TestDataManager.addNewSonsDaughters, " Add New Sons Daughters button Label of child in List View Page ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.rowsDetailsOnListView, "The blue highlighted rows represent the incompleted family records. If you have additional relatives in this category, please use the \"Add\" button below", " The blue highlighted rows represent the incompleted family records. If you have additional relatives in this category, please use the Add button below Label of child in List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.ALL), fHQ_TestDataManager.all, " All Label of child in List View Page  ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.RELATION_TO_PATIENT_SON_DAUGHTER), fHQ_TestDataManager.relationToPatientSonDaughter, " Relation to patient = Son/Daughter Label of child in List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("First Name",1),fHQ_TestDataManager.firstName," First Name Label of child in List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("First Initial of LAST Name", 1),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name Label of child in List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Parent of this relative", 1),fHQ_TestDataManager.parentOfThisRelative, " Parent of this relative Label of child in List View Page ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Vital Status", 1),fHQ_TestDataManager.vitalStatus, " Vital Status Label of child in List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Year of Birth", 1),fHQ_TestDataManager.yearOfBirth, " Year of Birth Label of child in List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Relation to patient", 1),fHQ_TestDataManager.relationToPatient, " Relation to patient Label of child in List View Page  ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Sex assigned at birth", 1),fHQ_TestDataManager.sexAssignedAtBirth, " Sex assigned at birth Label of child in List View Page ");
	}
	/* Assertions for the CHILD Table VALUES on List View Page */ 
	public static void childListViewTableValuesAssertion() {
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,1), fHQ_TestDataManager.childFirstNameValue, " Child First Name Value in Child List View Page ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,2), fHQ_TestDataManager.childFirstInitialOfLASTNameValue, " Child First Initial of LAST Name Value in Child List View Page ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,3), fHQ_TestDataManager.parentOfThisRelativeValue, " Parent of this relative Value in Child List View Page ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,4), fHQ_TestDataManager.childVitalStatusValue, " Child Vital Status Value in Child List View Page ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,5), fHQ_TestDataManager.childYearOfBirthValue, "Child Year of Birth Value in Child List View Page ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,6), fHQ_TestDataManager.relationToPatientValue, " Child Relation to Patient Value in Child List View Page ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,7), fHQ_TestDataManager.childSexAssignedAtBirthValue, " Sex assigned at birth Value in Child List View Page ");
	}
	/* Submissions and Assertions for the Basic Information of the Child */
	public static void childBasicInformationSubmissionsAndAssertions() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.SON_DAUGHTER),fHQ_TestDataManager.sonDaughter, " Son/Daughter Label ");		 			 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.relativeFillingInfoBanner,fHQ_TestDataManager.youAreCurrentlyFillingOutInformationForTheParticipantsSonDaughter, " You are currently filling out information for the participant's son/daughter.. Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PLEASE_MAKE_SURE_YOU_HAVE_COMPLETED_ALL_PARTNER_RECORDS_BEFORE_COMPLETING_CHILDREN_RECORDS),fHQ_TestDataManager.pleaseMakeSureYouHaveCompletedAllPartnerRecordsBeforeCompletingChildrenRecords, " Please make sure you have completed all Partner records before completing Child records. Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.CHILD_BASIC_INFORMATION),fHQ_TestDataManager.childBasicInformation, " Basic Information Label for Child in Child Form ");		 			 		 			 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstName, " First Name label for Child in Child Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForTextBox("first_name"),fHQ_TestDataManager.childFirstNameValue, " Child First Name Value in Child Form ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label for Child in Child Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocator3ForDropDown(1),fHQ_TestDataManager.childFirstInitialOfLASTNameValue,"");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirth, " Year of Birth label for Child in Child Form "); 
		MiscUtils.sleep(300);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.yearOfBirthdateBanner,"An estimated date is preferred over “Don’t Know.” Examples: select 1995 if you know the date is in the 1990s but unsure the exact year; select 1982 if you know it was in the early 1980s; select 1977 if you know it was in the late 1970s.", " An estimated date is preferred banner for Child in Child Form ");		
		MiscUtils.sleep(300);
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(2),FHQConstants.yearOfBirthOrDeathAfter1900(),fHQ_TestDataManager.childYearOfBirthSelected);
		MiscUtils.sleep(600);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.VITAL_STATUS),fHQ_TestDataManager.vitalStatus, " Vital Status Label for Child in Child Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocator3ForDropDown(3),fHQ_TestDataManager.childVitalStatusValue, " Vital Status Label for Child in Child Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH),"Sex assigned at birth"," Sex assigned at birth Label for Child in Child Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(7),FHQConstants.SEX_ASSIGNED_AT_BIRTH,fHQ_TestDataManager.childSexAssignedAtBirthSelected);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_GENDER_IDENTITY), "Gender Identity", " Gender Identity Label of Child in Child Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(8),FHQConstants.GENDER_IDENTITY,fHQ_TestDataManager.childGenderIdentitySelected);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.WHICH_BEST_DESCRIBES_THIS_RELATIVE), fHQ_TestDataManager.whichBestDescribesThisRelative, " Which best describes this relative? label in Child Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(9),FHQConstants.CHILD_DISCRIPTION,fHQ_TestDataManager.whichBestDescribesThisRelativeSelected);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.IS_THE_OTHER_BIOLOGICAL_PARENT_OF_THIS_RELATIVE_ONE_OF_THE_PARTNERS_YOU_HAVE_ENTERED), fHQ_TestDataManager.isTheOtherBiologicalParentOfThisRelativeOneOfThePartnersYouHaveEntered, " Is the other biological parent of this relative one of the partners you have entered? label in Child Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(10),FHQConstants.OTHER_BIOLOGICAL_PARENT,fHQ_TestDataManager.isTheOtherBiologicalParentOfThisRelativeOneOfThePartnersYouHaveEnteredSelected);	
		if (fHQ_TestDataManager.isTheOtherBiologicalParentOfThisRelativeOneOfThePartnersYouHaveEnteredSelected=="Yes"){
			CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText("If the partner name is not visible in the dropdown"),fHQ_TestDataManager.partnerNameHelpBanner, "Partner Name Help Banner Label in Child Form "); 
			CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingTitle(FHQConstants.OTHER_BIOLOGICAL_PARENT_HELP_BANNER), fHQ_TestDataManager.otherBiologicalParentHelpBanner, " If you are not seeing any \"Other Biological parents\" available, please complete the associated partner record. label in Child Form ");
			CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.CHILD_OTHER_BIOLOGICAL_PARENT), fHQ_TestDataManager.otherBiologicalParent, " Other Biological Parent label in Child Form ");		
			CharmsUtil.selectDropDownValue(fHQSubmissionPage.otherBiologicalParentDropdown,fHQ_TestDataManager.otherBiologicalParentSelected);	
		}
	}
	/* Twin or part of a multiple birth? Questions for CHILD */
	public static void twinOrMultipleBirthQuestionsForChild(){
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.IS_THIS_RELATIVE_A_TWIN_OR_PART_OF_A_MULTIPLE_BIRTH), fHQ_TestDataManager.isThisRelativeATwinOrPartOfAMultipleBirth, " Is this relative a twin or part of a multiple birth? Label of Child in Child Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(11),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.twinOrPartOfAMultipleBirthValue);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARENT_TYPE_OF_BIRTH), fHQ_TestDataManager.typeOfBirth, " Type of birth Label of Child in Child Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(12),FHQConstants.TYPE_OF_BIRTH,fHQ_TestDataManager.typeOfBirthValue);			
	}
	/* miscarriages or stillbirths? Questionnare for CHILD */
	public static void miscarriagesOrStillbirthsSubmissionAndAssertionsForChild() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.MEDICAL_HISTORY), fHQ_TestDataManager.medicalHistory, " Medical History Label in Child Form ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.HAS_THIS_RELATIVE_EVER_HAD_ANY_MISCARRIAGES_OR_STILLBIRTHS),fHQ_TestDataManager.hasThisRelativeEverHadAnyMiscarriagesOrStillbirths," Has this relative ever had any miscarriages or stillbirths? Label in Child Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(13),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasThisRelativeEverHadAnyMiscarriagesOrStillbirthsValue);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PLEASE_IDENTIFY_THE_NUMBER_OF_EACH_OF_THE_FOLLOWING_PREGNANCY_RESULTS),fHQ_TestDataManager.pleaseIdentifyTheNumberOfEachOfTheFollowingPregnancyResults," Please identify the number of each of the following pregnancy results for this person. Label in Child Form ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES),fHQ_TestDataManager.totalNumberOfMiscarriages," Total number of Miscarriages Label in Child Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.LESS_THAN_20_WEEKS_OF_PREGNANCY),fHQ_TestDataManager.lessThan20WeeksOfPregnancy," less than 20 weeks of pregnancy Label in Child Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(14),FHQConstants.numberUpToN(20),fHQ_TestDataManager.totalNumberOfMiscarriagesValue);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS),fHQ_TestDataManager.totalNumberOfStillbirths," Total number of Stillbirths Label in Child Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.MORE_THAN_20_WEEKS_OF_PREGNANCY),fHQ_TestDataManager.moreThan20WeeksOfPregnancy," More than 20 weeks of pregnancy Label in Child Form  ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(15),FHQConstants.numberUpToN(20),fHQ_TestDataManager.totalNumberOfStillbirthsValue);
	}
	/* RASOPATHY QUESTIONNAIRE For CHILD */
	public static void rASopathyQuestionnaireForChild() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_BEEN_DIAGNOSED_WITH_A_RASOPATHY), fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathy, " Has this relative been diagnosed with a RASopathy? Label in Child Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.childDiagnosedWithRasopathyInformation, fHQ_TestDataManager.rASopathyHistoryBanner, " RASopathy History Banner Label in Child Form ");	
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(16),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathyValue);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.parentDiagnosedWithRasopathyAddButtonInfo,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachRASopathyThisRelativeHasHad, " Please select the 'Add' button below to add each RASopathy this relative has had. Label in Child Form ");			
		FHQSubmissionStepsImpl.assertRasopathyBannerInMRVSTable(1);		
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for RASopathy(s)"));
		FHQSubmissionStepsImpl.addRASopathyRowInMRVSPage();		
		FHQSubmissionStepsImpl.assertRASopathyRowAddedInMRVSTable(1);
	}
	/* CANCER QUESTIONNAIRE For CHILD */
	public static void cancerQuestionnaireForChild() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_CANCER), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancer, " Has this relative ever been diagnosed with cancer? Label in Child Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(17),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancerValue);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.parentDiagnosedWithCancerAddButtonInfo,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachCancerThisRelativeHasHad, " Please select the 'Add' button below to add each cancer this relative has had. Label in Child Form ");	
		FHQSubmissionStepsImpl.assertCancerBannerInMRVSTable(2);		
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Cancer(s)")); 
		FHQSubmissionStepsImpl.addCancerRowInMRVSPage();
		FHQSubmissionStepsImpl.assertCancerRowAddedInMRVSTable(2);
	}
	/* BENIGN TUMOR QUESTIONNAIRE For CHILD */
	public static void benignTumorQuestionnaireForChild() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_A_BENIGN_TUMOR), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithABenignTumor, " Has this relative ever been diagnosed with a benign tumor? Label in Child Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(18),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithABenignTumorValue);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.diagnosedWithBenignTumorAddButtonInfo,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachBenignTumorThisRelativeHasHad, " Please select the 'Add' button below to add each benign tumor this relative has had. Label in Child Form ");
		FHQSubmissionStepsImpl.assertBenignTumorBannerInMRVSTable(3);		
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Benign Tumor(s)"));
		FHQSubmissionStepsImpl.addBenignTumorRowInMRVSPage();
		FHQSubmissionStepsImpl.assertBenignTumorRowAddedInMRVSTable(3); 	
	}
	/* MEDICAL CONDITIONS QUESTIONNAIRE For CHILD */
	public static void medicalConditionQuestionnaireForChild() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_ANY_OF_THE_MEDICAL_CONDITIONS_LISTED_BELOW  ), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelow, " Has this relative ever been diagnosed with any of the medical conditions listed below? Label in Child Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingTitle(FHQConstants.MEDICAL_CONDITIONS_BANNER), fHQ_TestDataManager.medicalConditionsBanner, " Medical conditions Banner ");		
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(19),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelowValue);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.parentDiagnosedWithMedicalConditionsAddButtonInfo,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachMedicalConditionThisRelativeHasHad, " Please select the 'Add' button below to add each medical condition this relative has had. Label in Child Form ");
		FHQSubmissionStepsImpl.assertMedicalConditionBannerInMRVSTable(4); 		
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Medical Condition(s)")); 
		FHQSubmissionStepsImpl.addMedicalConditionRowInMRVSPage();
		FHQSubmissionStepsImpl.assertMedicalConditionRowAddedInMRVSTable(4);
	}
	/* Children Questions Asked For CHILD */
	public static void childQuestionnaireForChild(int i) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HOW_MANY_TOTAL_CHILDREN_ALIVE_AND_DECEASED_HAS_THIS_RELATIVE_HAD),"How many total children (alive and deceased) has this relative had?"," How many total children (alive and deceased) has this relative had? Label in Child Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingTitle(FHQConstants.CHILD_BANNER),fHQ_TestDataManager.childBanner," Please include all biological children, living and deceased. Please do not include miscarriages, stillbirths, or abortions. These will be collected elsewhere. Label in Child Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(i),FHQConstants.numberUpToN(20),fHQ_TestDataManager.howManyTotalChildrenAliveAndDeceasedHasThisRelaiveHadSelected);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.childAddButtonInfo,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachChildThisRelativeHas, " Please select the 'Add' button below to add each child this relative has. Label in Child Form ");		
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.CHILDREN),fHQ_TestDataManager.children," Children Label ");
	}
	/****************************************************/
				/* SIBLING FORM METHODS */
	/*****************************************************/
	/* Assertions for the Sibling Table on List View Page   */
	public static void siblingListViewTableAssertions() {
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("FHQ Siblings Context Menu"),"", " FHQ Siblings Context Menu Label for Sibling in List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.SIBLINGS), fHQ_TestDataManager.siblings, " Siblings Label for Sibling in List View Page ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.newButtonLinkOnListView, fHQ_TestDataManager.addNewSiblings, " Add New Siblings button Label for Sibling in List View Page ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.rowsDetailsOnListView, "The blue highlighted rows represent the incompleted family records. If you have additional relatives in this category, please use the \"Add\" button below", " The blue highlighted rows represent the incompleted family records. If you have additional relatives in this category, please use the Add button below Label of child in List View Page ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("First Name",1),fHQ_TestDataManager.firstName," First Name Label of Sibling in List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("First Initial of LAST Name", 1),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name Label of Sibling in List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Vital Status", 1),fHQ_TestDataManager.vitalStatus, " Vital Status Label of Sibling in List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Year of Birth", 1),fHQ_TestDataManager.yearOfBirth, " Year of Birth Label of Sibling in List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Type of Sibling", 1),fHQ_TestDataManager.typeOfSibling, " Type of Sibling Label of Sibling in List View Page ");
	}	
	/* Assertions for the Sibling Table VALUES on List View Page */ 
	public static void siblingListViewTableValuesAssertions(String string){
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,1), fHQ_TestDataManager.firstNameValue, string + "First Name Label ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,2), fHQ_TestDataManager.firstInitialOfLASTNameValue, string +  "First Initial of LAST Name Label ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,3), fHQ_TestDataManager.vitalStatusValue, string + "Vital Status Label ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,4), fHQ_TestDataManager.yearOfBirthValue, string + "Year of Birth Label ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,5), fHQ_TestDataManager.typeOfSiblingValue, string + " Type of Sibling ");
	}
	/* Submissions and Assertions for the Basic Information of the SIBLING */
	public static void siblingBasicInformationSubmissionsAndAssertions() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.SIBLING),fHQ_TestDataManager.sibling, " Sibling Label in the Sibling Form ");		 			 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.siblingInformationBanner,fHQ_TestDataManager.siblingBanner, " We would like to ask some questions about Siblings. Please answer to the best of your ability and skip any questions you do not know. Label in the Sibling Form ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.YOU_ARE_CURRENTLY_FILLING_OUT_INFORMATION),fHQ_TestDataManager.youAreCurrentlyFillingOutInformation, " You are currently filling out information for the participant's sibling.Label in Sibling Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.SIBLING_BASIC_INFORMATION),fHQ_TestDataManager.siblingBasicInformation, " Basic Information Label in Sibling Form ");		 			 		 			 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstName, " First Name label for Sibling in the Sibling Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForTextBox("first_name"),fHQ_TestDataManager.firstNameValue, " Sibling First Name Value in the Sibling Form ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label for Sibling in the Sibling Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocator3ForDropDown(2),fHQ_TestDataManager.firstInitialOfLASTNameValue," First Initial of LAST Name Value for Sibling in the Sibling Form");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirth, " Year of Birth label for Sibling in the Sibling Form "); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.yearOfBirthdateBanner,"An estimated date is preferred over “Don’t Know.” Examples: select 1995 if you know the date is in the 1990s but unsure the exact year; select 1982 if you know it was in the early 1980s; select 1977 if you know it was in the late 1970s.", " An estimated date is preferred banner for Sibling YOB in the Sibling Form ");		
		MiscUtils.sleep(300);
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(3),FHQConstants.yearOfBirthOrDeathAfter1900(),fHQ_TestDataManager.yearOfBirthValueAdded);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.VITAL_STATUS),fHQ_TestDataManager.vitalStatus, " Vital Status Label in the Sibling Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocator3ForDropDown(4),fHQ_TestDataManager.vitalStatusValue, " Vital Status Value for Sibling in the Sibling Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH),"Sex assigned at birth"," Sex assigned at birth Label for Sibling in the Sibling Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(8),FHQConstants.SEX_ASSIGNED_AT_BIRTH,fHQ_TestDataManager.sexAssignedAtBirthValueAdded);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_GENDER_IDENTITY), "Gender Identity", " Gender Identity Label for Sibling in the Sibling Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(9),FHQConstants.GENDER_IDENTITY,fHQ_TestDataManager.genderIdentityValueAdded);	
	}
	/* Twin or part of a multiple birth? Questions for SIBLING */
	public static void twinOrMultipleBirthQuestionsForSibling(){
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.IS_THIS_RELATIVE_A_TWIN_OR_PART_OF_A_MULTIPLE_BIRTH), fHQ_TestDataManager.isThisRelativeATwinOrPartOfAMultipleBirth, " Is this relative a twin or part of a multiple birth? Label of Child in Child Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(10),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.twinOrPartOfAMultipleBirthValue);	
		MiscUtils.sleep(300);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARENT_TYPE_OF_BIRTH), fHQ_TestDataManager.typeOfBirth, " Type of birth Label of Child in Child Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(11),FHQConstants.TYPE_OF_BIRTH,fHQ_TestDataManager.typeOfBirthValue);	
		MiscUtils.sleep(300);
	}
	/* miscarriages or stillbirths? Questionnare for SIBLING */
	public static void miscarriagesOrStillbirthsSubmissionAndAssertionsForSibling() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.MEDICAL_HISTORY), fHQ_TestDataManager.medicalHistory, " Medical History Label in Child Form ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.HAS_THIS_RELATIVE_EVER_HAD_ANY_MISCARRIAGES_OR_STILLBIRTHS),fHQ_TestDataManager.hasThisRelativeEverHadAnyMiscarriagesOrStillbirths," Has this relative ever had any miscarriages or stillbirths? Label in Child Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(12),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasThisRelativeEverHadAnyMiscarriagesOrStillbirthsValue);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES),fHQ_TestDataManager.totalNumberOfMiscarriages," Total number of Miscarriages Label in Child Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.LESS_THAN_20_WEEKS_OF_PREGNANCY),fHQ_TestDataManager.lessThan20WeeksOfPregnancy," less than 20 weeks of pregnancy Label in Child Form ");
		MiscUtils.sleep(500);
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(13),FHQConstants.numberUpToN(20),fHQ_TestDataManager.totalNumberOfMiscarriagesValue);
		MiscUtils.sleep(500);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS),fHQ_TestDataManager.totalNumberOfStillbirths," Total number of Stillbirths Label in Child Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.MORE_THAN_20_WEEKS_OF_PREGNANCY),fHQ_TestDataManager.moreThan20WeeksOfPregnancy," More than 20 weeks of pregnancy Label in Child Form  ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(14),FHQConstants.numberUpToN(20),fHQ_TestDataManager.totalNumberOfStillbirthsValue);
	}
	/* RASOPATHY QUESTIONNAIRE For SIBLING */
	public static void rASopathyQuestionnaireForSibling() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_BEEN_DIAGNOSED_WITH_A_RASOPATHY), fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathy, " Has this relative been diagnosed with a RASopathy? Label in Child Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.childDiagnosedWithRasopathyInformation, fHQ_TestDataManager.rASopathyHistoryBanner, " RASopathy History Banner Label in Child Form ");	
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(15),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathyValue);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.parentDiagnosedWithRasopathyAddButtonInfo,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachRASopathyThisRelativeHasHad, " Please select the 'Add' button below to add each RASopathy this relative has had. Label in Child Form ");			
		FHQSubmissionStepsImpl.assertRasopathyBannerInMRVSTable(1);		
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for RASopathy(s)"));
		FHQSubmissionStepsImpl.addRASopathyRowInMRVSPage(); 		
		FHQSubmissionStepsImpl.assertRASopathyRowAddedInMRVSTable(1);
	}
	/* CANCER QUESTIONNAIRE For SIBLING */
	public static void cancerQuestionnaireForSibling() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_CANCER  ), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancer, " Has this relative ever been diagnosed with cancer? Label in Child Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(16),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancerValue);	
		MiscUtils.sleep(500);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.parentDiagnosedWithCancerAddButtonInfo,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachCancerThisRelativeHasHad, " Please select the 'Add' button below to add each cancer this relative has had. Label in Child Form ");	
		FHQSubmissionStepsImpl.assertCancerBannerInMRVSTable(2);			
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Cancer(s)"));
		FHQSubmissionStepsImpl.addCancerRowInMRVSPage();
		FHQSubmissionStepsImpl.assertCancerRowAddedInMRVSTable(2);
	}
	/* BENIGN TUMOR QUESTIONNAIRE For SIBLING */
	public static void benignTumorQuestionnaireForSibling(){
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_A_BENIGN_TUMOR), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithABenignTumor, " Has this relative ever been diagnosed with one of the benign tumors listed below? Label in Child Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(17),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithABenignTumorValue);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.diagnosedWithBenignTumorAddButtonInfo,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachBenignTumorThisRelativeHasHad, " Please select the 'Add' button below to add each benign tumor this relative has had. Label in Child Form ");
		FHQSubmissionStepsImpl.assertBenignTumorBannerInMRVSTable(3);		
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Benign Tumor(s)"));
		FHQSubmissionStepsImpl.addBenignTumorRowInMRVSPage();
		FHQSubmissionStepsImpl.assertBenignTumorRowAddedInMRVSTable(3); 
	}
	/* MEDICAL CONDITIONS QUESTIONNAIRE For SIBLING */
	public static void medicalConditionQuestionnaireForSibling() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_ANY_OF_THE_MEDICAL_CONDITIONS_LISTED_BELOW  ), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelow, " Has this relative ever been diagnosed with any of the medical conditions listed below? Label in Child Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingTitle(FHQConstants.MEDICAL_CONDITIONS_BANNER), fHQ_TestDataManager.medicalConditionsBanner, " Medical conditions Banner ");		
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(18),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelowValue);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.parentDiagnosedWithMedicalConditionsAddButtonInfo,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachMedicalConditionThisRelativeHasHad, " Please select the 'Add' button below to add each medical condition this relative has had. Label in Child Form ");
		FHQSubmissionStepsImpl.assertMedicalConditionBannerInMRVSTable(4);		
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Medical Condition(s)")); 
		FHQSubmissionStepsImpl.addMedicalConditionRowInMRVSPage();
		FHQSubmissionStepsImpl.assertMedicalConditionRowAddedInMRVSTable(4);
	}
	/* Sibling's Children Questions Asked */
	public static void childQuestionnaireForSibling(int i) {
	//	CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HOW_MANY_TOTAL_CHILDREN_ALIVE_AND_DECEASED_HAS_THIS_RELATIVE_HAD),"How many total children (alive and deceased) has this relative had?"," How many total children (alive and deceased) has this relative had? Label in Sibling Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingTitle(FHQConstants.CHILD_BANNER),fHQ_TestDataManager.childBanner," Please include all biological children, living and deceased. Please do not include miscarriages, stillbirths, or abortions. These will be collected elsewhere. Label in Sibling Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(i),FHQConstants.numberUpToN(20),fHQ_TestDataManager.howManyTotalChildrenAliveAndDeceasedHasThisRelaiveHadSelected);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.childAddButtonInfo1,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachChildThisRelativeHasHad, " Please select the 'Add' button below to add each child this relative has had. Label in Sibling Form ");		
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.CHILDREN),fHQ_TestDataManager.children," Children Label in SIbling Form ");
	}
	/* Siblings MRVS Table headings Assertion */
	public static void  assertSiblingBannerInMRVSTable(int i, String string) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.SIBLINGS), fHQ_TestDataManager.siblings, " Siblings Label in Siblings MRVS Table" + string);
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("Add a row for Siblings"),fHQ_TestDataManager.add," Add Label in Siblings MRVS Table "+ string);
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("Remove all rows for Siblings"),fHQ_TestDataManager.removeAll," Remove All Label in Siblings MRVS Table"+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Actions", i),fHQ_TestDataManager.actions," Actions Label in Siblings MRVS Table"+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Types of Sibling relation",1),fHQ_TestDataManager.typesOfSiblingRelation," Types of Sibling relation Label in Siblings MRVS Table"+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("First name of Sibling", 1),fHQ_TestDataManager.firstNameOfSibling, " First name of Sibling Label in Siblings MRVS Table"+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("First Initial of LAST Name", 1),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name Label in Siblings MRVS Table"+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Vital Status of Sibling", 1),fHQ_TestDataManager.vitalStatusOfSibling, " Vital Status of Sibling Label in Siblings MRVS Table"+ string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingContainsNormalizeSpace("No data to display", 1),fHQ_TestDataManager.noDataToDisplay, " No data to display Label in Medical Condition MRVS Table ");
		}
	/* Sibling MRVS ADD page Assertions and Submissions */
	public static void addSiblingRowInMRVSPage(String string){
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.ADD_ROW),fHQ_TestDataManager.addRow, " Add Row For Sibling in MRVS"+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TYPES_OF_SIBLING_RELATION),"Types of Sibling relation", " Types of Sibling relation Label in MRVS"+ string);
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.fHQFieldDropDown,FHQConstants.TYPES_OF_SIBLING,fHQ_TestDataManager.typesOfSiblingRelationSelected);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FIRST_NAME_OF_SIBLING),"First name of Sibling", " First name of Sibling Label in MRVS"+ string);
		CharmsUtil.sendKeysToElement(fHQSubmissionPage.dynamicLocatorForTextBox("first_name_of_sibling"),fHQ_TestDataManager.siblingFirstNameValue);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FIRST_INITIAL_OF_LAST_NAME),"First Initial of LAST Name", " First Initial of LAST Name of Sibling Label in MRVS" + string);	
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.fHQFieldDropDown,FHQConstants.firstInitialLastName(),fHQ_TestDataManager.siblingFirstInitialOfLastNameValue);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.VITAL_STATUS_OF_SIBLING),"Vital Status of Sibling", " Vital Status of Sibling Label in MRVS"+ string);;
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.fHQFieldDropDown,FHQConstants.VITAL_STATUS_LIST,fHQ_TestDataManager.siblingVitalStatusValue);
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.CANCEL),fHQ_TestDataManager.cancel, " Cancel Button for Sibling MRVS"+ string);
		CharmsUtil.assertButtonLabel(softAssert, FHQSubmissionPage.addRowSaveButton,fHQ_TestDataManager.add, " Add Button for Sibling MRVS"+ string);
		CharmsUtil.clickOnElement(FHQSubmissionPage.addRowSaveButton);	
	}
	/* Sibling MRVS Added Row Assertions */
	public static void  assertSiblingRowAddedInMRVSTable(int i, String string) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingAnchorTag("Edit Row 1",i),"", " Edit Row for Sibling label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingAnchorTag("Remove Row 1",i),"", " Remove Row for Sibling label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(i+18),fHQ_TestDataManager.typesOfSiblingRelationSelected, " Types of Sibling Option Selected ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(i+19),fHQ_TestDataManager.siblingFirstNameValue, " First name of Sibling Value ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(i+20),fHQ_TestDataManager.siblingFirstInitialOfLastNameValue, " First Initial of LAST Name of Sibling  Value ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(i+21),fHQ_TestDataManager.siblingVitalStatusValue, " Vital Status of Sibling Value ");
	}		
	/*********************************************************/
				/* AUNT/UNCLE FORM METHODS */
	/********************************************************/
	/* Assertions for the AUNT/UNCLE Table on List View Page   */
	public static void auntUncleListViewTableAssertions() {
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("FHQ Aunt/Uncles Context Menu"),"", " FHQ Aunt/Uncles Context Menu Label for Aunt/Uncle in List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.AUNT_UNCLES), fHQ_TestDataManager.auntUncles, " Aunt/Uncles Label for Aunt/Uncles in List View Page ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.newButtonLinkOnListView, fHQ_TestDataManager.addNewauntUncles, " Add New Aunt/Uncles button Label for Aunt/Uncles in List View Page ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.rowsDetailsOnListView, "The blue highlighted rows represent the incompleted family records. If you have additional relatives in this category, please use the \"Add\" button below", " The blue highlighted rows represent the incompleted family records. If you have additional relatives in this category, please use the Add button below Label of child in List View Page ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("First Name",1),fHQ_TestDataManager.firstName," First Name Label of Aunt/Uncles in List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("First Initial of LAST Name", 1),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name Label of Aunt/Uncles in List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Vital Status", 1),fHQ_TestDataManager.vitalStatus, " Vital Status Label of Aunt/Uncles in List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Year of Birth", 1),fHQ_TestDataManager.yearOfBirth, " Year of Birth Label of Aunt/Uncles in List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Relation to Patient", 1),fHQ_TestDataManager.relationsToPatient, " Relation to Patient Label of Aunt/Uncles in List View Page ");
	}
	/* Assertions for the AUNT/UNCLE Table VALUES on List View Page */
	public static void auntUncleListViewTableValuesAssertions() {
		if (fHQSubmissionPage.dynamicLocatorElementInTable(1,5).getText()=="Aunt") {		
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,1), fHQ_TestDataManager.auntUncleFirstNameValue1, " Aunt/Uncle First Name Value1 in Aunt/Uncle List View Page ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,2), fHQ_TestDataManager.auntUncleFirstInitialOfLASTNameValue1, " Aunt/Uncle First Initial of LAST Name Value1 in Aunt/Uncle List View Page ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,3), fHQ_TestDataManager.auntUncleVitalStatusValue1, " Aunt/Uncle Vital Status Value1 in Aunt/Uncle List View Page ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,4), fHQ_TestDataManager.auntUncleYearOfBirthValue1, " Aunt/Uncle Year of Birth Value1 in Aunt/Uncle List View Page ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,5), fHQ_TestDataManager.relationToPatientValue1, " Aunt/Uncle Relation to Patient Value1 in Aunt/Uncle List View Page ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,1), fHQ_TestDataManager.auntUncleFirstNameValue2, " Aunt/Uncle First Name Value2 in Aunt/Uncle List View Page ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,2), fHQ_TestDataManager.auntUncleFirstInitialOfLASTNameValue2, " Aunt/Uncle First Initial of LAST Name Value2 in Aunt/Uncle List View Page ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,3), fHQ_TestDataManager.auntUncleVitalStatusValue2, " Aunt/Uncle Vital Status Value2 in Aunt/Uncle List View Page ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,4), fHQ_TestDataManager.auntUncleYearOfBirthValue2, " Aunt/Uncle Year of Birth Value2 in Aunt/Uncle List View Page ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,5), fHQ_TestDataManager.relationToPatientValue2, " Aunt/Uncle Relation to Patient Value2 in Aunt/Uncle List View Page ");
		}
		else {
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,1), fHQ_TestDataManager.auntUncleFirstNameValue2, " Aunt/Uncle First Name Value1 in Aunt/Uncle List View Page ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,2), fHQ_TestDataManager.auntUncleFirstInitialOfLASTNameValue2, " Aunt/Uncle First Initial of LAST Name Value1 in Aunt/Uncle List View Page ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,3), fHQ_TestDataManager.auntUncleVitalStatusValue2, " Aunt/Uncle Vital Status Value1 in Aunt/Uncle List View Page ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,4), fHQ_TestDataManager.auntUncleYearOfBirthValue2, " Aunt/Uncle Year of Birth Value1 in Aunt/Uncle List View Page ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,5), fHQ_TestDataManager.relationToPatientValue2, " Aunt/Uncle Relation to Patient Value1 in Aunt/Uncle List View Page ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,1), fHQ_TestDataManager.auntUncleFirstNameValue1, " Aunt/Uncle First Name Value2 in Aunt/Uncle List View Page ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,2), fHQ_TestDataManager.auntUncleFirstInitialOfLASTNameValue1, " Aunt/Uncle First Initial of LAST Name Value2 in Aunt/Uncle List View Page ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,3), fHQ_TestDataManager.auntUncleVitalStatusValue1, " Aunt/Uncle Vital Status Value2 in Aunt/Uncle List View Page ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,4), fHQ_TestDataManager.auntUncleYearOfBirthValue1, " Aunt/Uncle Year of Birth Value2 in Aunt/Uncle List View Page ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,5), fHQ_TestDataManager.relationToPatientValue1, " Aunt/Uncle Relation to Patient Value2 in Aunt/Uncle List View Page ");		
		}
	}
	/* Submissions and Assertions for the Basic Information of the AUNT/UNCLE */
	public static void auntUncleBasicInformationSubmissionsAndAssertions() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.AUNT_UNCLE),fHQ_TestDataManager.auntUncle, " Aunt/Uncle Label in the Aunt/Uncle Form ");		 			 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.auntUncleInformationBanner,fHQ_TestDataManager.auntUncleBanner, " Please enter one record per each family member for whom you have knowledge:Label in the Aunt/Uncle Form ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.relativeFillingInfoBanner,fHQ_TestDataManager.youAreCurrentlyFillingOutInformationForTheParticipantsAuntUncle, " You are currently filling out information for the participant's aunt/uncle.Label in the Aunt/Uncle Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.AUNT_UNCLE_BASIC_INFORMATION),fHQ_TestDataManager.auntUncleBasicInformation, " Basic Information Label in the Aunt/Uncle Form ");		 			 		 			 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstName, " First Name label for Aunt/Uncle in the Aunt/Uncle Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForTextBox("first_name"),fHQ_TestDataManager.auntUncleFirstNameValue, " Aunt/Uncle First Name Value in the Aunt/Uncle Form ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label for Aunt/Uncle in the Aunt/Uncle Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocator3ForDropDown(2),fHQ_TestDataManager.auntUncleFirstInitialOfLASTNameValue,"");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirth, " Year of Birth label for Aunt/Uncle in the Aunt/Uncle Form "); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.yearOfBirthdateBanner,fHQ_TestDataManager.anEstimatedDateIsPreferred, " An estimated date is preferred banner for Aunt/Uncle in the Aunt/Uncle Form ");		
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(3),FHQConstants.yearOfBirthOrDeathAfter1900(),fHQ_TestDataManager.auntUncleYearOfBirthSelected);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.VITAL_STATUS),fHQ_TestDataManager.vitalStatus, " Vital Status Label for Aunt/Uncle in the Aunt/Uncle Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocator3ForDropDown(4),fHQ_TestDataManager.auntUncleVitalStatusValue, " Vital Status Label for Aunt/Uncle in the Aunt/Uncle Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH),"Sex assigned at birth"," Sex assigned at birth Label for Aunt/Uncle in the Aunt/Uncle Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(8),FHQConstants.SEX_ASSIGNED_AT_BIRTH,fHQ_TestDataManager.auntUncleSexAssignedAtBirthSelected);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_GENDER_IDENTITY), "Gender Identity", " Gender Identity Label for Aunt/Uncle in the Aunt/Uncle Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(9),FHQConstants.GENDER_IDENTITY,fHQ_TestDataManager.auntUncleGenderIdentitySelected);	
	}
	/* Twin or part of a multiple birth? Questions for AUNT/UNCLE */
	public static void twinOrMultipleBirthQuestionsForAuntUncle(){
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.IS_THIS_RELATIVE_A_TWIN_OR_PART_OF_A_MULTIPLE_BIRTH), fHQ_TestDataManager.isThisRelativeATwinOrPartOfAMultipleBirth, " Is this relative a twin or part of a multiple birth? Label of Child in Child Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(10),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.twinOrPartOfAMultipleBirthValue);	
		MiscUtils.sleep(300);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARENT_TYPE_OF_BIRTH), fHQ_TestDataManager.typeOfBirth, " Type of birth Label of Child in Child Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(11),FHQConstants.TYPE_OF_BIRTH,fHQ_TestDataManager.typeOfBirthValue);
		MiscUtils.sleep(300);
	}
	/* miscarriages or stillbirths? Questionnare for AUNT/UNCLE */
	public static void miscarriagesOrStillbirthsSubmissionAndAssertionsForAuntUncle() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.MEDICAL_HISTORY), fHQ_TestDataManager.medicalHistory, " Medical History Label in Child Form ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.HAS_THIS_RELATIVE_EVER_HAD_ANY_MISCARRIAGES_OR_STILLBIRTHS),fHQ_TestDataManager.hasThisRelativeEverHadAnyMiscarriagesOrStillbirths," Has this relative ever had any miscarriages or stillbirths? Label in Child Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(12),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasThisRelativeEverHadAnyMiscarriagesOrStillbirthsValue);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES),fHQ_TestDataManager.totalNumberOfMiscarriages," Total number of Miscarriages Label in Child Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.LESS_THAN_20_WEEKS_OF_PREGNANCY),fHQ_TestDataManager.lessThan20WeeksOfPregnancy," less than 20 weeks of pregnancy Label in Child Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(13),FHQConstants.numberUpToN(20),fHQ_TestDataManager.totalNumberOfMiscarriagesValue);
		MiscUtils.sleep(500);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS),fHQ_TestDataManager.totalNumberOfStillbirths," Total number of Stillbirths Label in Child Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.MORE_THAN_20_WEEKS_OF_PREGNANCY),fHQ_TestDataManager.moreThan20WeeksOfPregnancy," More than 20 weeks of pregnancy Label in Child Form  ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(14),FHQConstants.numberUpToN(20),fHQ_TestDataManager.totalNumberOfStillbirthsValue);
	}
	/* RASOPATHY QUESTIONNAIRE For AUNT/UNCLE */
	public static void rASopathyQuestionnaireForAuntUncle() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_BEEN_DIAGNOSED_WITH_A_RASOPATHY), fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathy, " Has this relative been diagnosed with a RASopathy? Label in Child Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.childDiagnosedWithRasopathyInformation, fHQ_TestDataManager.rASopathyHistoryBanner, " RASopathy History Banner Label in Child Form ");	
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(15),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathyValue);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.parentDiagnosedWithRasopathyAddButtonInfo,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachRASopathyThisRelativeHasHad, " Please select the 'Add' button below to add each RASopathy this relative has had. Label in Child Form ");			
		FHQSubmissionStepsImpl.assertRasopathyBannerInMRVSTable(1);	
		MiscUtils.sleep(500);
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for RASopathy(s)"));	
		FHQSubmissionStepsImpl.addRASopathyRowInMRVSPage();		
		FHQSubmissionStepsImpl.assertRASopathyRowAddedInMRVSTable(1);
	}
	/* CANCER QUESTIONNAIRE For AUNT/UNCLE */
	public static void cancerQuestionnaireForAuntUncle() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_CANCER  ), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancer, " Has this relative ever been diagnosed with cancer? Label in Child Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(16),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancerValue);	
		MiscUtils.sleep(500);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.parentDiagnosedWithCancerAddButtonInfo,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachCancerThisRelativeHasHad, " Please select the 'Add' button below to add each cancer this relative has had. Label in Child Form ");	
		FHQSubmissionStepsImpl.assertCancerBannerInMRVSTable(2);			
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Cancer(s)"));
		FHQSubmissionStepsImpl.addCancerRowInMRVSPage();
		FHQSubmissionStepsImpl.assertCancerRowAddedInMRVSTable(2);
	}
	/* BENIGN TUMOR QUESTIONNAIRE For AUNT/UNCLE */
	public static void benignTumorQuestionnaireForAuntUncle(){
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_A_BENIGN_TUMOR), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithABenignTumor, " Has this relative ever been diagnosed with a benign tumor? Label in Child Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(17),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithABenignTumorValue);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.diagnosedWithBenignTumorAddButtonInfo,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachBenignTumorThisRelativeHasHad, " Please select the 'Add' button below to add each benign tumor this relative has had. Label in Child Form ");
		FHQSubmissionStepsImpl.assertBenignTumorBannerInMRVSTable(3);		
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Benign Tumor(s)"));
		FHQSubmissionStepsImpl.addBenignTumorRowInMRVSPage();
		FHQSubmissionStepsImpl.assertBenignTumorRowAddedInMRVSTable(3); 		
	}
	/* MEDICAL CONDITIONS QUESTIONNAIRE For AUNT/UNCLE */
	public static void medicalConditionQuestionnaireForAuntUncle() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_ANY_OF_THE_MEDICAL_CONDITIONS_LISTED_BELOW  ), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelow, " Has this relative ever been diagnosed with any of the medical conditions listed below? Label in Child Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingTitle(FHQConstants.MEDICAL_CONDITIONS_BANNER), fHQ_TestDataManager.medicalConditionsBanner, " Medical conditions Banner ");		
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(18),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelowValue);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.parentDiagnosedWithMedicalConditionsAddButtonInfo,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachMedicalConditionThisRelativeHasHad, " Please select the 'Add' button below to add each medical condition this relative has had. Label in Child Form ");
		FHQSubmissionStepsImpl.assertMedicalConditionBannerInMRVSTable(4);			
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Medical Condition(s)"));
		FHQSubmissionStepsImpl.addMedicalConditionRowInMRVSPage();
		FHQSubmissionStepsImpl.assertMedicalConditionRowAddedInMRVSTable(4);
	}
	/* Children Questions Asked For AUNT/UNCLE */
	public static void childQuestionnaireForAuntUncle(int i) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HOW_MANY_TOTAL_CHILDREN_ALIVE_AND_DECEASED_HAS_THIS_RELATIVE_HAD),"How many total children (alive and deceased) has this relative had?"," How many total children (alive and deceased) has this relative had? Label in Aunt Uncle Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingTitle(FHQConstants.CHILD_BANNER),fHQ_TestDataManager.childBanner," Child Banner in the Aunt Uncle Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(i),FHQConstants.numberUpToN(20),fHQ_TestDataManager.howManyTotalChildrenAliveAndDeceasedHasThisRelaiveHadSelected);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.childAddButtonInfo1,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachChildThisRelativeHasHad, " Please select the 'Add' button below to add each child this relative has had. Label in Aunt Uncle Form ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.CHILDREN),fHQ_TestDataManager.children," Child Label in Aunt Uncle Form ");
	}
	/*********************************************************/
				/* NEICE/NEPHEW FORM METHODS */
	/********************************************************/
	/* Assertions for the Neice/Nephew Table on List View Page   */
	public static void nieceNephewListViewTableAssertions() {
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("FHQ Children Context Menu"),"", " FHQ Children Context Menu Label of Niece/Nephew in List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.NIECES_NEPHEWS), fHQ_TestDataManager.niecesNephews, " Nieces/Nephews Label of Niece/Nephew in List View Page ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.newButtonLinkOnListView, fHQ_TestDataManager.addNewNiecesNephews, " Add New Nieces Nephews button Label of Niece/Nephew in List View Page ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.rowsDetailsOnListView, "The blue highlighted rows represent the incompleted family records. If you have additional relatives in this category, please use the \"Add\" button below", " The blue highlighted rows represent the incompleted family records. If you have additional relatives in this category, please use the Add button below Label of child in List View Page ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.ALL), fHQ_TestDataManager.all, " All Label of Niece/Nephew in List View Page  ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.RELATION_TO_PATIENT_NIECE_NEPHEW), fHQ_TestDataManager.relationToPatientNieceNephew, " Relation to patient = Niece/Nephew Label of Niece/Nephew in List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("First Name",1),fHQ_TestDataManager.firstName," First Name Label of Niece/Nephew in List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("First Initial of LAST Name", 1),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name Label of Niece/Nephew in List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Parent of this relative", 1),fHQ_TestDataManager.parentOfThisRelative, " Parent of this relative Label of Niece/Nephew in List View Page ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Vital Status", 1),fHQ_TestDataManager.vitalStatus, " Vital Status Label of Niece/Nephew in List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Year of Birth", 1),fHQ_TestDataManager.yearOfBirth, " Year of Birth Label of Niece/Nephew in List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Relation to patient", 1),fHQ_TestDataManager.relationToPatient, " Relation to patient Label of Niece/Nephew in List View Page  ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Sex assigned at birth", 1),fHQ_TestDataManager.sexAssignedAtBirth, " Sex assigned at birth Label of Niece/Nephew in List View Page ");
	}
	/* Assertions for the Neice/Nephew Table VALUES on List View Page */ 
	public static void nieceNephewListViewTableValuesAssertion() {
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,1), fHQ_TestDataManager.nieceNephewFirstNameValue, " Niece/Nephew First Name Value in Niece/Nephew List View Page ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,2), fHQ_TestDataManager.nieceNephewFirstInitialOfLASTNameValue, " Niece/Nephew First Initial of LAST Name Value in Niece/Nephew List View Page ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,3), fHQ_TestDataManager.parentOfThisRelativeValue, " Parent of this relative Value in Niece/Nephew List View Page ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,4), fHQ_TestDataManager.nieceNephewVitalStatusValue, " Niece/Nephew Vital Status Value in Niece/Nephew List View Page ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,5), fHQ_TestDataManager.nieceNephewYearOfBirthValue, " Niece/Nephew Year of Birth Value in Niece/Nephew List View Page ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,6), fHQ_TestDataManager.relationToPatientValue, " Child Relation to Patient Value in Niece/Nephew List View Page ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,7), fHQ_TestDataManager.nieceNephewSexAssignedAtBirthValue, " Sex assigned at birth Value in Niece/Nephew List View Page ");
	}
	/* Submissions and Assertions for the Basic Information of the Neice/Nephew */
	public static void nieceNephewBasicInformationSubmissionsAndAssertions() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.NIECE_NEPHEW),fHQ_TestDataManager.nieceNephew, " Niece/Nephew Label in the Niece/Nephew Form ");		 			 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.relativeFillingInfoBanner,fHQ_TestDataManager.youAreCurrentlyFillingOutInformationForTheParticipantsNieceNephew, " You are currently filling out information for the participant's Niece/Nephew. Label in the Niece/Nephew Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PLEASE_MAKE_SURE_YOU_HAVE_COMPLETED_ALL_SIBLING_RECORDS),fHQ_TestDataManager.pleaseMakeSureYouHaveCompletedAllSiblingRecords, " Please make sure you have completed all siblings records before completing children recordsPlease make sure you have completed all Sibling records before completing Niece/Nephew records.Banner in the Niece/Nephew Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.NIECE_NEPHEW_BASIC_INFORMATION),fHQ_TestDataManager.nieceNephewBasicInformation, " Basic Information Label for Niece/Nephew in Niece/Nephew Form ");		 			 		 			 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstName, " First Name label for Niece/Nephew in Niece/Nephew Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForTextBox("first_name"),fHQ_TestDataManager.nieceNephewFirstNameValue, " Niece/Nephew First Name Value in Niece/Nephew Form ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label for Niece/Nephew in Niece/Nephew Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocator3ForDropDown(1),fHQ_TestDataManager.nieceNephewFirstInitialOfLASTNameValue," Niece/Nephew First Initial of LAST Name Value in Niece/Nephew Form ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirth, " Year of Birth label for Niece/Nephew in Niece/Nephew Form "); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.yearOfBirthdateBanner,fHQ_TestDataManager.anEstimatedDateIsPreferred, " An estimated date is preferred banner for Niece/Nephew in Niece/Nephew Form ");		
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(2),FHQConstants.yearOfBirthOrDeathAfter1900(),fHQ_TestDataManager.neiceNephewYearOfBirthSelected);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.VITAL_STATUS),fHQ_TestDataManager.vitalStatus, " Vital Status Label for Niece/Nephew in Niece/Nephew Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocator3ForDropDown(3),fHQ_TestDataManager.nieceNephewVitalStatusValue, " Vital Status Value for Niece/Nephew in Niece/Nephew Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH),"Sex assigned at birth"," Sex assigned at birth Label for Niece/Nephew in Niece/Nephew Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(7),FHQConstants.SEX_ASSIGNED_AT_BIRTH,fHQ_TestDataManager.neiceNephewSexAssignedAtBirthSelected);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_GENDER_IDENTITY), "Gender Identity", " Gender Identity Label of Niece/Nephew in Niece/Nephew Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(8),FHQConstants.GENDER_IDENTITY,fHQ_TestDataManager.neiceNephewGenderIdentitySelected);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.WHICH_BEST_DESCRIBES_THIS_RELATIVE), fHQ_TestDataManager.whichBestDescribesThisRelative, " Which best describes this relative? label in Niece/Nephew Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(9),FHQConstants.CHILD_DISCRIPTION,fHQ_TestDataManager.whichBestDescribesThisRelativeSelected);			
	}
	/* Twin or part of a multiple birth? Questions for Neice/Nephew */
	public static void twinOrMultipleBirthQuestionsForNieceNephew(){
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.IS_THIS_RELATIVE_A_TWIN_OR_PART_OF_A_MULTIPLE_BIRTH), fHQ_TestDataManager.isThisRelativeATwinOrPartOfAMultipleBirth, " Is this relative a twin or part of a multiple birth? Label of Niece/Nephew in Niece/Nephew Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(11),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.twinOrPartOfAMultipleBirthValue);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARENT_TYPE_OF_BIRTH), fHQ_TestDataManager.typeOfBirth, " Type of birth Label of Niece/Nephew in Niece/Nephew Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(12),FHQConstants.TYPE_OF_BIRTH,fHQ_TestDataManager.typeOfBirthValue);
	}
	/* miscarriages or stillbirths? Questionnare for Neice/Nephew */
	public static void miscarriagesOrStillbirthsSubmissionAndAssertionsForNieceNephew() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.MEDICAL_HISTORY), fHQ_TestDataManager.medicalHistory, " Medical History Label in Neice/Nephew Form ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.HAS_THIS_RELATIVE_EVER_HAD_ANY_MISCARRIAGES_OR_STILLBIRTHS),fHQ_TestDataManager.hasThisRelativeEverHadAnyMiscarriagesOrStillbirths," Has this relative ever had any miscarriages or stillbirths? Label in Neice/Nephew Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(13),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasThisRelativeEverHadAnyMiscarriagesOrStillbirthsValue);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PLEASE_IDENTIFY_THE_NUMBER_OF_EACH_OF_THE_FOLLOWING_PREGNANCY_RESULTS),fHQ_TestDataManager.pleaseIdentifyTheNumberOfEachOfTheFollowingPregnancyResults," Please identify the number of each of the following pregnancy results for this person. Label in Neice/Nephew Form ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES),fHQ_TestDataManager.totalNumberOfMiscarriages," Total number of Miscarriages Label in Neice/Nephew Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.LESS_THAN_20_WEEKS_OF_PREGNANCY),fHQ_TestDataManager.lessThan20WeeksOfPregnancy," less than 20 weeks of pregnancy Label in Neice/Nephew Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(14),FHQConstants.numberUpToN(20),fHQ_TestDataManager.totalNumberOfMiscarriagesValue);
		MiscUtils.sleep(200);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS),fHQ_TestDataManager.totalNumberOfStillbirths," Total number of Stillbirths Label in Neice/Nephew Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.MORE_THAN_20_WEEKS_OF_PREGNANCY),fHQ_TestDataManager.moreThan20WeeksOfPregnancy," More than 20 weeks of pregnancy Label in Neice/Nephew Form  ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(15),FHQConstants.numberUpToN(20),fHQ_TestDataManager.totalNumberOfStillbirthsValue);
	}
	/* RASOPATHY QUESTIONNAIRE For Neice/Nephew */
	public static void rASopathyQuestionnaireForNieceNephew() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_BEEN_DIAGNOSED_WITH_A_RASOPATHY), fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathy, " Has this relative been diagnosed with a RASopathy? Label in Neice/Nephew Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.childDiagnosedWithRasopathyInformation, fHQ_TestDataManager.rASopathyHistoryBanner, " RASopathy History Banner Label in Neice/Nephew Form ");	
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(16),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathyValue);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.parentDiagnosedWithRasopathyAddButtonInfo,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachRASopathyThisRelativeHasHad, " Please select the 'Add' button below to add each RASopathy this relative has had. Label in Neice/Nephew Form ");			
		FHQSubmissionStepsImpl.assertRasopathyBannerInMRVSTable(1);			
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for RASopathy(s)"));	
		FHQSubmissionStepsImpl.addRASopathyRowInMRVSPage(); 		
		FHQSubmissionStepsImpl.assertRASopathyRowAddedInMRVSTable(1);
	}
	/* CANCER QUESTIONNAIRE For Neice/Nephew */
	public static void cancerQuestionnaireForNieceNephew() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_CANCER), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancer, " Has this relative ever been diagnosed with cancer? Label in Neice/Nephew Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(17),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancerValue);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.parentDiagnosedWithCancerAddButtonInfo,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachCancerThisRelativeHasHad, " Please select the 'Add' button below to add each cancer this relative has had. Label in Neice/Nephew Form ");	
		FHQSubmissionStepsImpl.assertCancerBannerInMRVSTable(2); 			
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Cancer(s)"));
		FHQSubmissionStepsImpl.addCancerRowInMRVSPage(); 
		FHQSubmissionStepsImpl.assertCancerRowAddedInMRVSTable(2);
	}
	/* BENIGN TUMOR QUESTIONNAIRE For Neice/Nephew */
	public static void benignTumorQuestionnaireForNieceNephew(){
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_A_BENIGN_TUMOR), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithABenignTumor, " Has this relative ever been diagnosed with a benign tumor? Label in Neice/Nephew Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(18),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithABenignTumorValue);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.diagnosedWithBenignTumorAddButtonInfo,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachBenignTumorThisRelativeHasHad, " Please select the 'Add' button below to add each benign tumor this relative has had. Label in Neice/Nephew Form ");
		FHQSubmissionStepsImpl.assertBenignTumorBannerInMRVSTable(3);		
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Benign Tumor(s)"));
		FHQSubmissionStepsImpl.addBenignTumorRowInMRVSPage();
		FHQSubmissionStepsImpl.assertBenignTumorRowAddedInMRVSTable(3); 		
	}
	/* MEDICAL CONDITIONS QUESTIONNAIRE For Neice/Nephew */
	public static void medicalConditionQuestionnaireForNieceNephew() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_ANY_OF_THE_MEDICAL_CONDITIONS_LISTED_BELOW  ), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelow, " Has this relative ever been diagnosed with any of the medical conditions listed below? Label in Neice/Nephew Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingTitle(FHQConstants.MEDICAL_CONDITIONS_BANNER), fHQ_TestDataManager.medicalConditionsBanner, " Medical conditions Banner ");		
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(19),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelowValue);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.parentDiagnosedWithMedicalConditionsAddButtonInfo,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachMedicalConditionThisRelativeHasHad, " Please select the 'Add' button below to add each medical condition this relative has had. Label in Neice/Nephew Form ");
		FHQSubmissionStepsImpl.assertMedicalConditionBannerInMRVSTable(4);			
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Medical Condition(s)"));
		FHQSubmissionStepsImpl.addMedicalConditionRowInMRVSPage();
		FHQSubmissionStepsImpl.assertMedicalConditionRowAddedInMRVSTable(4);
	}
	/* Children Questions Asked For Neice/Nephew */
	public static void childQuestionnaireForNieceNephew(int i) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HOW_MANY_TOTAL_CHILDREN_ALIVE_AND_DECEASED_HAS_THIS_RELATIVE_HAD),"How many total children (alive and deceased) has this relative had?"," How many total children (alive and deceased) has this relative had? Label in Neice/Nephew Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingTitle(FHQConstants.CHILD_BANNER),fHQ_TestDataManager.childBanner," Please include all biological children, living and deceased. Please do not include miscarriages, stillbirths, or abortions. These will be collected elsewhere. Label in Neice/Nephew Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(i),FHQConstants.numberUpToN(20),fHQ_TestDataManager.howManyTotalChildrenAliveAndDeceasedHasThisRelaiveHadSelected);
		}
	/*********************************************************/
				/* GRANDPARENTS FORM METHODS */
	/********************************************************/
	/* Assertions for the GrandParent Table LABELS on List View Page  */
	public static void grandParentsListViewTableLabelsAssertions() {
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("FHQ Parents Context Menu"),"", " FHQ Grandparents Context Menu Label in Grandparent List view page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.GRANDPARENTS), fHQ_TestDataManager.grandParents, " Grandparents Label in Grandparent List view page ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.rowsDetailsOnListView,fHQ_TestDataManager.theBlueHighlightedRowsRepresentTheIncompletedFamilyRecords, " The blue highlighted rows represent the incompleted family records Label in Grandparent List view page ");   
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.ALL), fHQ_TestDataManager.all, " All Label in Grandparent List view page  ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.relationToPatientGrandParentLink, fHQ_TestDataManager.relationToPatientGrandParent, " Relation to Patient in (Paternal grandfather (Father's Father), Paternal grandmother (Father's Mother),) Label in Grandparent List view page ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("First Name",1),fHQ_TestDataManager.firstName," First Name Label in Grandparent List view page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("First Initial of LAST Name", 1),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name Label in Grandparent List view page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Vital Status", 1),fHQ_TestDataManager.vitalStatus, " Vital Status Label in Grandparent List view page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Year of Birth", 1),fHQ_TestDataManager.yearOfBirth, " Year of Birth Label in Grandparent List view page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Relation to Patient", 1),fHQ_TestDataManager.relationsToPatient, " Relation to patient Label in Grandparent List view page ");	
	}
	/* Assertions for the Paternal Grandmother Table VALUES on List View Page */ 
	public static void grandParentsListViewTableValuesAssertions(String string){
		//First Row
		if (fHQSubmissionPage.dynamicLocatorElementInTable(1,5).getText().trim().equals("Paternal grandmother (Father's Mother)")) {
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,1), fHQ_TestDataManager.firstNameValue1, string + "First Name Value1 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,2), fHQ_TestDataManager.firstInitialOfLASTNameValue1, string +  "First Initial of LAST Name Value1 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,3), fHQ_TestDataManager.vitalStatusValue1, string + "Vital Status Value1 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,4), fHQ_TestDataManager.yearOfBirthValue1, string + "Year of Birth Value1 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,5), fHQ_TestDataManager.relationToPatientValue1, string + "Relation to Patient Value1 ");		
		}
		else if (fHQSubmissionPage.dynamicLocatorElementInTable(1,5).getText().trim().equals("Paternal grandfather (Father's Father)")) {
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,1), fHQ_TestDataManager.firstNameValue2, string + "First Name Value1 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,2), fHQ_TestDataManager.firstInitialOfLASTNameValue2, string +  "First Initial of LAST Name Value1 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,3), fHQ_TestDataManager.vitalStatusValue2, string + "Vital Status Value1 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,4), fHQ_TestDataManager.yearOfBirthValue2, string + "Year of Birth Value1 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,5), fHQ_TestDataManager.relationToPatientValue2, string + "Relation to Patient Value1 ");	
		}
		else if (fHQSubmissionPage.dynamicLocatorElementInTable(1,5).getText().trim().equals("Maternal grandmother (Mother's Mother)")) {
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,1), fHQ_TestDataManager.firstNameValue3, string + "First Name Value1 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,2), fHQ_TestDataManager.firstInitialOfLASTNameValue3, string +  "First Initial of LAST Name Value1 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,3), fHQ_TestDataManager.vitalStatusValue3, string + "Vital Status Value1 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,4), fHQ_TestDataManager.yearOfBirthValue3, string + "Year of Birth Value1 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,5), fHQ_TestDataManager.relationToPatientValue3, string + "Relation to Patient Value1 ");	
		}
		else if (fHQSubmissionPage.dynamicLocatorElementInTable(1,5).getText().trim().equals("Maternal grandfather (Mother's Father)")) {
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,1), fHQ_TestDataManager.firstNameValue4, string + "First Name Value1 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,2), fHQ_TestDataManager.firstInitialOfLASTNameValue4, string +  "First Initial of LAST Name Value1 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,3), fHQ_TestDataManager.vitalStatusValue4, string + "Vital Status Value1 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,4), fHQ_TestDataManager.yearOfBirthValue4, string + "Year of Birth Value1 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,5), fHQ_TestDataManager.relationToPatientValue4, string + "Relation to Patient Value1 ");	
		}
		//second Row
		if (fHQSubmissionPage.dynamicLocatorElementInTable(2,5).getText().trim().equals("Paternal grandmother (Father's Mother)")) {
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,1), fHQ_TestDataManager.firstNameValue1, string + "First Name Value2 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,2), fHQ_TestDataManager.firstInitialOfLASTNameValue1, string +  "First Initial of LAST Name Value2 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,3), fHQ_TestDataManager.vitalStatusValue1, string + "Vital Status Value2 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,4), fHQ_TestDataManager.yearOfBirthValue1, string + "Year of Birth Value2 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,5), fHQ_TestDataManager.relationToPatientValue1, string + "Relation to Patient Value2 ");		
		}
		else if (fHQSubmissionPage.dynamicLocatorElementInTable(2,5).getText().trim().equals("Paternal grandfather (Father's Father))")) {
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,1), fHQ_TestDataManager.firstNameValue2, string + "First Name Value2 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,2), fHQ_TestDataManager.firstInitialOfLASTNameValue2, string +  "First Initial of LAST Name Value2 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,3), fHQ_TestDataManager.vitalStatusValue2, string + "Vital Status Value2 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,4), fHQ_TestDataManager.yearOfBirthValue2, string + "Year of Birth Value2 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,5), fHQ_TestDataManager.relationToPatientValue2, string + "Relation to Patient Value2 ");	
		}
		else if (fHQSubmissionPage.dynamicLocatorElementInTable(2,5).getText().trim().equals("Maternal grandmother (Mother's Mother)")) {
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,1), fHQ_TestDataManager.firstNameValue3, string + "First Name Value2 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,2), fHQ_TestDataManager.firstInitialOfLASTNameValue3, string +  "First Initial of LAST Name Value2 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,3), fHQ_TestDataManager.vitalStatusValue3, string + "Vital Status Value2 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,4), fHQ_TestDataManager.yearOfBirthValue3, string + "Year of Birth Value2 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,5), fHQ_TestDataManager.relationToPatientValue3, string + "Relation to Patient Value2 ");	
		}
		else if (fHQSubmissionPage.dynamicLocatorElementInTable(2,5).getText().trim().equals("Maternal grandfather (Mother's Father)")) {
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,1), fHQ_TestDataManager.firstNameValue4, string + "First Name Value2 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,2), fHQ_TestDataManager.firstInitialOfLASTNameValue4, string +  "First Initial of LAST Name Value2 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,3), fHQ_TestDataManager.vitalStatusValue4, string + "Vital Status Value2 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,4), fHQ_TestDataManager.yearOfBirthValue4, string + "Year of Birth Value2 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,5), fHQ_TestDataManager.relationToPatientValue4, string + "Relation to Patient Value2 ");	
		}
		//Third Row
		if (fHQSubmissionPage.dynamicLocatorElementInTable(3,5).getText().trim().equals("Paternal grandmother (Father's Mother)")) {
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(3,1), fHQ_TestDataManager.firstNameValue1, string + "First Name Value3 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(3,2), fHQ_TestDataManager.firstInitialOfLASTNameValue1, string +  "First Initial of LAST Name Value3 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(3,3), fHQ_TestDataManager.vitalStatusValue1, string + "Vital Status Value3 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(3,4), fHQ_TestDataManager.yearOfBirthValue1, string + "Year of Birth Value3 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(3,5), fHQ_TestDataManager.relationToPatientValue1, string + "Relation to Patient Value3 ");		
		}
		else if (fHQSubmissionPage.dynamicLocatorElementInTable(3,5).getText().trim().equals("Paternal grandfather (Father's Father))")) {
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(3,1), fHQ_TestDataManager.firstNameValue2, string + "First Name Value3 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(3,2), fHQ_TestDataManager.firstInitialOfLASTNameValue2, string +  "First Initial of LAST Name Value3 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(3,3), fHQ_TestDataManager.vitalStatusValue2, string + "Vital Status Value3 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(3,4), fHQ_TestDataManager.yearOfBirthValue2, string + "Year of Birth Value3 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(3,5), fHQ_TestDataManager.relationToPatientValue2, string + "Relation to Patient Value3 ");	
		}
		else if (fHQSubmissionPage.dynamicLocatorElementInTable(3,5).getText().trim().equals("Maternal grandmother (Mother's Mother)")) {
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(3,1), fHQ_TestDataManager.firstNameValue3, string + "First Name Value3 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(3,2), fHQ_TestDataManager.firstInitialOfLASTNameValue3, string +  "First Initial of LAST Name Value3 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(3,3), fHQ_TestDataManager.vitalStatusValue3, string + "Vital Status Value3 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(3,4), fHQ_TestDataManager.yearOfBirthValue3, string + "Year of Birth Value3 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(3,5), fHQ_TestDataManager.relationToPatientValue3, string + "Relation to Patient Value3 ");	
		}
		else if (fHQSubmissionPage.dynamicLocatorElementInTable(3,5).getText().trim().equals("Maternal grandfather (Mother's Father)")) {
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(3,1), fHQ_TestDataManager.firstNameValue4, string + "First Name Value3 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(3,2), fHQ_TestDataManager.firstInitialOfLASTNameValue4, string +  "First Initial of LAST Name Value3 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(3,3), fHQ_TestDataManager.vitalStatusValue4, string + "Vital Status Value3 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(3,4), fHQ_TestDataManager.yearOfBirthValue4, string + "Year of Birth Value3 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(3,5), fHQ_TestDataManager.relationToPatientValue4, string + "Relation to Patient Value3 ");	
		}
		// Fourth Row
		if (fHQSubmissionPage.dynamicLocatorElementInTable(4,5).getText().trim().equals("Paternal grandmother (Father's Mother)")) {
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(4,1), fHQ_TestDataManager.firstNameValue1, string + "First Name Value4 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(4,2), fHQ_TestDataManager.firstInitialOfLASTNameValue1, string +  "First Initial of LAST Name Value4 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(4,3), fHQ_TestDataManager.vitalStatusValue1, string + "Vital Status Value4 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(4,4), fHQ_TestDataManager.yearOfBirthValue1, string + "Year of Birth Value4 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(4,5), fHQ_TestDataManager.relationToPatientValue1, string + "Relation to Patient Value4 ");		
		}
		else if (fHQSubmissionPage.dynamicLocatorElementInTable(4,5).getText().trim().equals("Paternal grandfather (Father's Father))")) {
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(4,1), fHQ_TestDataManager.firstNameValue2, string + "First Name Value4 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(4,2), fHQ_TestDataManager.firstInitialOfLASTNameValue2, string +  "First Initial of LAST Name Value4 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(4,3), fHQ_TestDataManager.vitalStatusValue2, string + "Vital Status Value4 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(4,4), fHQ_TestDataManager.yearOfBirthValue2, string + "Year of Birth Value4 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(4,5), fHQ_TestDataManager.relationToPatientValue2, string + "Relation to Patient Value4 ");	
		}
		else if (fHQSubmissionPage.dynamicLocatorElementInTable(4,5).getText().trim().equals("Maternal grandmother (Mother's Mother)")) {
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(4,1), fHQ_TestDataManager.firstNameValue3, string + "First Name Value3 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(4,2), fHQ_TestDataManager.firstInitialOfLASTNameValue3, string +  "First Initial of LAST Name Value4 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(4,3), fHQ_TestDataManager.vitalStatusValue3, string + "Vital Status Value4 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(4,4), fHQ_TestDataManager.yearOfBirthValue3, string + "Year of Birth Value4 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(4,5), fHQ_TestDataManager.relationToPatientValue3, string + "Relation to Patient Value4 ");	
		}
		else if (fHQSubmissionPage.dynamicLocatorElementInTable(4,5).getText().trim().equals("Maternal grandfather (Mother's Father)")) {
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(4,1), fHQ_TestDataManager.firstNameValue4, string + "First Name Value4 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(4,2), fHQ_TestDataManager.firstInitialOfLASTNameValue4, string +  "First Initial of LAST Name Value4 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(4,3), fHQ_TestDataManager.vitalStatusValue4, string + "Vital Status Value4 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(4,4), fHQ_TestDataManager.yearOfBirthValue4, string + "Year of Birth Value4 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(4,5), fHQ_TestDataManager.relationToPatientValue4, string + "Relation to Patient Value4 ");	
		}
	}
	/* Submissions and Assertions for the Basic Information of the Grandparent */
	public static void grandParentBasicInformationSubmissionsAndAssertions(String string) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.parentTypeHeading,fHQ_TestDataManager.parentType, string + " Label" + string );		 			 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.YOU_ARE_CURRENTLY_FILLING_OUT_INFORMATION),fHQ_TestDataManager.youAreCurrentlyFillingOutInformation, " You are currently filling out information for the participant's Label" + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.I_DO_NOT_KNOW_ANY_INFORMATION_ABOUT_THIS_BIOLOGICAL_RELATIVE),fHQ_TestDataManager.iDoNotKnowAnyInformationAboutThisBiologicalRelative, " I do not know any information about this biological relative Label" + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.BASIC_INFORMATION),fHQ_TestDataManager.basicInformation, " Basic Information Label" + string);		 			 		 			 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstName, " First Name label" + string); 
		CharmsUtil.sendKeysToElement(fHQSubmissionPage.dynamicLocatorForTextBox("first_name"), fHQ_TestDataManager.firstNameValueAdded);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label" + string); 
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator2ForDropDown(3), FHQConstants.firstInitialLastName(),fHQ_TestDataManager.firstInitialOfLASTNameAdded);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.WAS_THIS_RELATIVE_ADOPTED),fHQ_TestDataManager.wasThisRelativeAdopted, " Was this relative adopted? Label" + string);
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator2ForDropDown(4),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.relativeAdoptedValueSelected);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirth, " Year of Birth label" + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.yearOfBirthdateBanner,fHQ_TestDataManager.anEstimatedDateIsPreferred, " An estimated date is preferred banner" + string);		
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator2ForDropDown(5),FHQConstants.yearOfBirthOrDeathAfter1900(),fHQ_TestDataManager.yearOfBirthValueAdded);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.VITAL_STATUS),fHQ_TestDataManager.vitalStatus, " Vital Status Label" + string);
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator2ForDropDown(6),FHQConstants.VITAL_STATUS_LIST,fHQ_TestDataManager.vitalStatusValueAdded);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH),fHQ_TestDataManager.sexAssignedAtBirth," Sex assigned at birth Label" + string);
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator2ForDropDown(10),FHQConstants.SEX_ASSIGNED_AT_BIRTH,fHQ_TestDataManager.sexAssignedAtBirthValueAdded);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_GENDER_IDENTITY), fHQ_TestDataManager.genderIdentity, " Gender Identity Label" + string);
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator2ForDropDown(11),FHQConstants.GENDER_IDENTITY,fHQ_TestDataManager.genderIdentityValueAdded);	
	}
	/*********************************************************/
				/* GRANDCHILDREN FORM METHODS */
	/********************************************************/
	/* Assertions for the GrandChildren Table LABELS on List View Page */
	public static void grandChildrenListViewTableLabelsAssertions() {
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("FHQ Children Context Menu"),"", " FHQ Children Context Menu Label in Grandchild List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.GRANDCHILDREN), fHQ_TestDataManager.grandChildren, " Grandchildren Label in Grandchild List View Page ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.newButtonLinkOnListView, fHQ_TestDataManager.addNewGrandChildren, " Add New Grandchildren button Label in Grandchild List View Page ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.rowsDetailsOnListView, fHQ_TestDataManager.theBlueHighlightedRowsBanner, " The blue highlighted rows represent the incompleted family records. If you have additional relatives in this category, please use the Add button below Label of Grandchild in List View Page ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.ALL), fHQ_TestDataManager.all, " All Label in Grandchild List View Page  ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.RELATION_TO_PATIENT_GRANDCHILD), fHQ_TestDataManager.relationToPatientGrandChild, " Relation to patient = Grandchild Label in Grandchild List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("First Name",1),fHQ_TestDataManager.firstName," First Name Label in Grandchild List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("First Initial of LAST Name", 1),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name Label in Grandchild List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Parent of this relative", 1),fHQ_TestDataManager.parentOfThisRelative, " Parent of this relative Label in Grandchild List View Page ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Vital Status", 1),fHQ_TestDataManager.vitalStatus, " Vital Status Label in Grandchild List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Year of Birth", 1),fHQ_TestDataManager.yearOfBirth, " Year of Birth Label in Grandchild List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Relation to patient", 1),fHQ_TestDataManager.relationToPatient, " Relation to patient Label in Grandchild List View Page  ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Sex assigned at birth", 1),fHQ_TestDataManager.sexAssignedAtBirth, " Sex assigned at birth Label in Grandchild List View Page ");
	}	
	/* Assertions for the GrandChildren Table VALUES on List View Page */ 
	public static void grandChildrenListViewTableValuesAssertions() {
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,1), fHQ_TestDataManager.firstNameValue, " First Name Value in Grandchild List View Page ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,2), fHQ_TestDataManager.firstInitialOfLASTNameValue, " First Initial of LAST Name Value in Grandchild List View Page ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,3), fHQ_TestDataManager.parentOfThisRelativeValue, " Parent of this relative Value in Grandchild List View Page ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,4), fHQ_TestDataManager.vitalStatusValue, " Vital Status Value in Grandchild List View Page ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,5), fHQ_TestDataManager.yearOfBirthValue, " Year of Birth Value in Grandchild List View Page ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,6), fHQ_TestDataManager.relationToPatientValue, " Relation to Patient Value in Grandchild List View Page ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,7), fHQ_TestDataManager.sexAssignedAtBirthValue, " Sex assigned at birth Value in Grandchild List View Page ");
	}
	/* Basic Information Submissions and Assertions for the Grandchildren */
	public static void grandChildrenBasicInformationSubmissionsAndAssertions() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.GRANDCHILD),fHQ_TestDataManager.grandChild, " GrandChild Label in GrandChildren Form ");		 			 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.YOU_ARE_CURRENTLY_FILLING_OUT_INFORMATION),fHQ_TestDataManager.youAreCurrentlyFillingOutInformation, " You are currently filling out information for the participant's maternal grandmother.Label in Grandchild Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PLEASE_MAKE_SURE_YOU_HAVE_COMPLETED_ALL_CHILDREN_RECORDS),fHQ_TestDataManager.pleaseMakeSureYouHaveCompletedAllChildrenRecords, " Please make sure you have completed all Children records before completing Grandchild records. You can use the blue “Back to Home” button to return and edit the Children records if needed. ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.CHILD_BASIC_INFORMATION),fHQ_TestDataManager.childBasicInformation, " Basic Information Label for Maternal grandmother in Grandchild Form ");		 			 		 			 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstName, " First Name label for GrandChild in Grandchild Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForTextBox("first_name"),fHQ_TestDataManager.firstNameValue, " GrandChild First Name Value in Grandchild Form ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label for GrandChild in Grandchild Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocator3ForDropDown(1),fHQ_TestDataManager.firstInitialOfLASTNameValue,"  First Initial of LAST Name Value for GrandChild in Grandchild Form ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirth, " Year of Birth label for GrandChild in Grandchild Form "); 	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.yearOfBirthdateBanner,fHQ_TestDataManager.anEstimatedDateIsPreferred, " An estimated date is preferred banner for Child in Grandchild Form ");		
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(2),FHQConstants.yearOfBirthOrDeathAfter1900(),fHQ_TestDataManager.yearOfBirthValueAdded);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.VITAL_STATUS),fHQ_TestDataManager.vitalStatus, " Vital Status Label for GrandChild in Grandchild Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocator3ForDropDown(3),fHQ_TestDataManager.vitalStatusValue, " Vital Status Value for GrandChild in Grandchild Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH),fHQ_TestDataManager.sexAssignedAtBirth," Sex assigned at birth Label for GrandChild in Grandchild Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(7),FHQConstants.SEX_ASSIGNED_AT_BIRTH,fHQ_TestDataManager.sexAssignedAtBirthValueAdded);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_GENDER_IDENTITY), fHQ_TestDataManager.genderIdentity, " Gender Identity Label for GrandChild in Grandchild Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(8),FHQConstants.GENDER_IDENTITY,fHQ_TestDataManager.genderIdentityValueAdded);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.WHICH_BEST_DESCRIBES_THIS_RELATIVE), fHQ_TestDataManager.whichBestDescribesThisRelative, " Which best describes this relative? label in Grandchild Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(9),FHQConstants.CHILD_DISCRIPTION,fHQ_TestDataManager.whichBestDescribesThisRelativeSelected);	
	}
	/*********************************************************/
				/* COUSINS FORM METHODS */
	/********************************************************/
	/* Assertions for the Cousin Table LABELS on List View Page  */
	public static void cousinListViewTableLabelsAssertions() {
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("FHQ Children Context Menu"),"", " FHQ Children Context Menu Label in Cousin List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.COUSINS), fHQ_TestDataManager.cousins, " Sons/Daughters Label in Cousin List View Page ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.newButtonLinkOnListView, fHQ_TestDataManager.addNewCousins, " Add New Cousins button Label in Cousin List View Page ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.rowsDetailsOnListView, fHQ_TestDataManager.theBlueHighlightedRowsBanner, " The blue highlighted rows represent the incompleted family records. If you have additional relatives in this category, please use the Add button below Label of child in List View Page ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.ALL), fHQ_TestDataManager.all, " All Label of child in List View Page  ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.RELATION_TO_PATIENT_COUSIN), fHQ_TestDataManager.relationToPatientCousin, " Relation to patient = Son/Daughter Label in Cousin List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("First Name",1),fHQ_TestDataManager.firstName," First Name Label in Cousin List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("First Initial of LAST Name", 1),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name Label in Cousin List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Parent of this relative", 1),fHQ_TestDataManager.parentOfThisRelative, " Parent of this relative Label in Cousin List View Page ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Vital Status", 1),fHQ_TestDataManager.vitalStatus, " Vital Status Label in Cousin List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Year of Birth", 1),fHQ_TestDataManager.yearOfBirth, " Year of Birth Label in Cousin List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Relation to patient", 1),fHQ_TestDataManager.relationToPatient, " Relation to patient Label in Cousin List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Sex assigned at birth", 1),fHQ_TestDataManager.sexAssignedAtBirth, " Sex assigned at birth Label in Cousin List View Page ");
	}
	/* Assertions for the Cousin Table VALUES on List View Page */
	public static void cousinListViewTableValuesAssertions(String string) {	
		//First Row
		if (fHQSubmissionPage.dynamicLocatorElementInTable(1,3).getText().trim().equals("FHQ Aunt/Uncle: ParticipantUncleFirstNam...")) {
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,1), fHQ_TestDataManager.firstNameValue1, string + "First Name Value1 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,2), fHQ_TestDataManager.firstInitialOfLASTNameValue1, string +  "First Initial of LAST Name Value1 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,3), fHQ_TestDataManager.parentOfThisRelativeValue1, " Parent of this relative Value1 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,4), fHQ_TestDataManager.vitalStatusValue1, string + "Vital Status Value1 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,5), fHQ_TestDataManager.yearOfBirthValue1, string + "Year of Birth Value1 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,6), fHQ_TestDataManager.relationToPatientValue1, string + "Relation to Patient Value1 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,7), fHQ_TestDataManager.sexAssignedAtBirthValue1, " Sex assigned at birth Value1 ");
		}
		else if (fHQSubmissionPage.dynamicLocatorElementInTable(1,3).getText().trim().equals("FHQ Aunt/Uncle: ParticipantAuntFirstName")) {
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,1), fHQ_TestDataManager.firstNameValue2, string + "First Name Value1 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,2), fHQ_TestDataManager.firstInitialOfLASTNameValue2, string +  "First Initial of LAST Name Value1 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,3), fHQ_TestDataManager.parentOfThisRelativeValue2, " Parent of this relative Value1 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,4), fHQ_TestDataManager.vitalStatusValue2, string + "Vital Status Value1 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,5), fHQ_TestDataManager.yearOfBirthValue2, string + "Year of Birth Value1 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,6), fHQ_TestDataManager.relationToPatientValue2, string + "Relation to Patient Value1 ");	
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,7), fHQ_TestDataManager.sexAssignedAtBirthValue2, " Sex assigned at birth Value1 ");
			}
		//Second Row
		if (fHQSubmissionPage.dynamicLocatorElementInTable(2,3).getText().trim().equals("FHQ Aunt/Uncle: ParticipantUncleFirstNam...")) {
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,1), fHQ_TestDataManager.firstNameValue1, string + "First Name Value2 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,2), fHQ_TestDataManager.firstInitialOfLASTNameValue1, string +  "First Initial of LAST Name Value2 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,3), fHQ_TestDataManager.parentOfThisRelativeValue1, " Parent of this relative Value2 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,4), fHQ_TestDataManager.vitalStatusValue1, string + "Vital Status Value2 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,5), fHQ_TestDataManager.yearOfBirthValue1, string + "Year of Birth Value2 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,6), fHQ_TestDataManager.relationToPatientValue1, string + "Relation to Patient Value2 ");		
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,7), fHQ_TestDataManager.sexAssignedAtBirthValue1, " Sex assigned at birth Value2 ");
			}
		else if (fHQSubmissionPage.dynamicLocatorElementInTable(2,5).getText().trim().equals("Biological Mother")) {
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,1), fHQ_TestDataManager.firstNameValue2, string + "First Name Value2 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,2), fHQ_TestDataManager.firstInitialOfLASTNameValue2, string +  "First Initial of LAST Name Value2 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,3), fHQ_TestDataManager.parentOfThisRelativeValue2, " Parent of this relative Value2 ");	
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,4), fHQ_TestDataManager.vitalStatusValue2, string + "Vital Status Value2 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,5), fHQ_TestDataManager.yearOfBirthValue2, string + "Year of Birth Value2 ");
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,6), fHQ_TestDataManager.relationToPatientValue2, string + "Relation to Patient Value2 ");	
			CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,7), fHQ_TestDataManager.sexAssignedAtBirthValue2, " Sex assigned at birth Value2 ");}
		
	}
	/* Basic Information Submissions and Assertions for the Cousin */
	public static void cousinBasicInformationSubmissionsAndAssertions() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.COUSIN),fHQ_TestDataManager.cousin, " Cousin Label in Cousin Form ");		 			 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.YOU_ARE_CURRENTLY_FILLING_OUT_INFORMATION),fHQ_TestDataManager.youAreCurrentlyFillingOutInformation, " You are currently filling out information for the participant's cousin.Label in Cousin Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText("Please make sure you have completed all Aunt/Uncle"),fHQ_TestDataManager.cousinBanner, " Cousin banner in Cousin Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.CHILD_BASIC_INFORMATION),fHQ_TestDataManager.childBasicInformation, " Basic Information Label in Cousin Form ");		 			 		 			 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstName, " First Name label in Cousin Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForTextBox("first_name"),fHQ_TestDataManager.firstNameValue, " Cousin First Name Value in Cousin Form ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label in Cousin Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocator3ForDropDown(1),fHQ_TestDataManager.firstInitialOfLASTNameValue,"  First Initial of LAST Name Value in Cousin Form ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirth, " Year of Birth label in Cousin Form "); 	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.yearOfBirthdateBanner,fHQ_TestDataManager.anEstimatedDateIsPreferred, " An estimated date is preferred banner in Cousin Form ");		
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(2),FHQConstants.yearOfBirthOrDeathAfter1900(),fHQ_TestDataManager.yearOfBirthValueAdded);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.VITAL_STATUS),fHQ_TestDataManager.vitalStatus, " Vital Status Label in Cousin Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocator3ForDropDown(3),fHQ_TestDataManager.vitalStatusValue, " Vital Status Value in Cousin Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH),fHQ_TestDataManager.sexAssignedAtBirth," Sex assigned at birth Label in Cousin Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(7),FHQConstants.SEX_ASSIGNED_AT_BIRTH,fHQ_TestDataManager.sexAssignedAtBirthValueAdded);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_GENDER_IDENTITY), fHQ_TestDataManager.genderIdentity, " Gender Identity Label in Cousin Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(8),FHQConstants.GENDER_IDENTITY,fHQ_TestDataManager.genderIdentityValueAdded);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.WHICH_BEST_DESCRIBES_THIS_RELATIVE), fHQ_TestDataManager.whichBestDescribesThisRelative, " Which best describes this relative? label in Cousin Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(9),FHQConstants.CHILD_DISCRIPTION,fHQ_TestDataManager.whichBestDescribesThisRelativeSelected);	
	}
	/* Children Questions */
	public static void questionsForChildSubmissionsAndAssertions(int i, String string) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HOW_MANY_TOTAL_CHILDREN_ALIVE_AND_DECEASED_HAS_THIS_RELATIVE_HAD),"How many total children (alive and deceased) has this relative had?"," How many total children (alive and deceased) has this relative had? Label"+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingTitle(FHQConstants.CHILD_BANNER),fHQ_TestDataManager.childBanner," Please include all biological children, living and deceased. Please do not include miscarriages, stillbirths, or abortions. These will be collected elsewhere. Label"+ string);
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(i),FHQConstants.numberUpToN(20),fHQ_TestDataManager.howManyTotalChildrenAliveAndDeceasedHasThisRelaiveHadSelected);
	}
	/* Children MRVS Table headings Assertion */
	public static void  assertChildrenBannerInMRVSTable(int i) {
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("Add a row for Children"),fHQ_TestDataManager.add," Add Label for child ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("Remove all rows for Children"),fHQ_TestDataManager.removeAll," Remove All Label for child in Child Form");
		FHQSubmissionStepsImpl.assertMRVSTable(1);
	}	
	/* Child MRVS Added Row Assertions */
	public static void  assertChildRowAddedInMRVSTable(int i) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingAnchorTag("Edit Row 1",i),"", " Edit Row for child label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingAnchorTag("Remove Row 1",i),"", " Remove Row for child label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(i+18),fHQ_TestDataManager.childfirstName, " Child First Name data in Child Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(i+19),fHQ_TestDataManager.childfirstInitialOfLASTName, " Child First Initial of LAST Name data in Child Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(i+20),fHQ_TestDataManager.childvitalStatus, " Child Vital Status data in Child Form");
	}
	/* ********** PARTICIOPANT(ONESELF) ASSERTION IN NATIVE VIEW ********* */
	public static void participantFHQInformationAssertions(String string) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.RELATIONSHIP_IDENTITY),fHQ_TestDataManager.relationshipIdentity, " Please indicate your relationship to the participant. Label " + string);	
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(1),fHQ_TestDataManager.pleaseIndicateYourRelationshipToTheParticipant, " Participant Relation Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.FIRST_NAME_OF_THE_PARTICIPANT),fHQ_TestDataManager.firstNameOfTheParticipant, " First Name of the participant. Label " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(1),fHQ_TestDataManager.participantFirstName, " Participant First Name Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.FIRST_INITIAL_OF_LAST_NAME_PARTICIPANT),FHQConstants.FIRST_INITIAL_OF_LAST_NAME_PARTICIPANT, " First Initial of LAST Name of the participant. Label " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(2),fHQ_TestDataManager.participantFirstInitialOfLASTNameValue, " First Initial of LAST Name of the participant. Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH),"Sex assigned at birth"," Sex assigned at birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(2),fHQ_TestDataManager.sexAssignedAtBirth, " Sex assigned at birth Value " + string);		
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_GENDER_IDENTITY),"Gender Identity"," Gender Identity Label for Participant "+ string);
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(3),fHQ_TestDataManager.genderIdentity, " Gender Identity Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.HAS_PARTICIPANT_HAD_ANY_MISCARRIAGES_OR_STILLBIRTHS),fHQ_TestDataManager.hasParticipantHadAnyMiscarriagesOrStillbirths,"Has participant had any miscarriage, stillbirth? Label "+ string);
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(4),fHQ_TestDataManager.hasTheParticipantEverHadAnyMiscarriagesOrStillbirths, " Has participant had any miscarriage, stillbirth? Value "+ string);		
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES),"Total number of Miscarriages"," Total number of Miscarriages Label "+ string);		
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(4),fHQ_TestDataManager.totalNumberOfMiscarriages," Total number of Miscarriages Label "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PLEASE_WRITE_FIRST_NAME_OF_PARTNERS_WITH_WHOM_PARTICIPANT_HAD_MISCARRIAGES),fHQ_TestDataManager.pleaseWriteFirstNameOfPartnersWithWhomParticipantHadMiscarriages," Please write first name of partner(s) with whom participant had miscarriage(s) Label "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(5),fHQ_TestDataManager.pleaseWriteTheFirstNameOfThePartnersWithWhomTheParticipantHadThePregnancyiesAboveMiscarriages, " Please write first name of partner(s) with whom participant had miscarriage(s) Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS),"Total number of Stillbirths"," Total number of Stillbirths Label "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(6),fHQ_TestDataManager.totalNumberOfStillbirths," Total number of Stillbirths Label "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PLEASE_WRITE_FIRST_NAME_OF_PARTNERS_WITH_WHOM_PARTICIPANT_HAD_STILLBIRTHS),fHQ_TestDataManager.pleaseWriteFirstNameOfPartnersWithWhomParticipantHadStillbirths," Please write first name of partner(s) with whom participant had stillbirth(s)) Label "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(7),fHQ_TestDataManager.pleaseWriteTheFirstNameOfThePartnersWithWhomTheParticipantHadThePregnancyiesAboveStillbirths, " Please write first name of partner(s) with whom participant had stillbirth(s) Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.HOW_MANY_TOTAL_CHILDREN_ALIVE_AND_DECEASED_HAS_THE_PARTICIPANT_HAD),"How many total children (alive and deceased) has the participant had?"," How many total children (alive and deceased) has the participant had? Label "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(8),fHQ_TestDataManager.howManyTotalChildrenAliveAndDeceasedHasTheParticipantHad, " How many total children (alive and deceased) has the participant had? Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.HOW_MANY_TOTAL_DIFFERENT_PARTNERS_HAS_PARTICIPANT_HAD_BIOLOGICAL_CHILDREN_WITH), "How many total different partners has participant had biological children with?"," How many total different partners has the participant had biological children with? label "+ string);		
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(9),fHQ_TestDataManager.howManyTotalDifferentPartnersHasTheParticipantHadBiologicalChildrenWith, " How many total different partners has the participant had biological children with? label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.HOW_MANY_SIBLINGS_DOES_THE_PARTICIPANT_HAVE),"How many siblings does the participant have?", " How many siblings does the participant have? Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(10),fHQ_TestDataManager.howManySiblingsDoesTheParticipantHave, " How many siblings does the participant have? Label Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, FHQSubmissionPage.additionalInformation,"Is there anything else you would like us to know about this participant?"," Is there anything else you would like us to know about this participant? Label "+ string); 	
		CharmsUtil.assertTextBoxData(softAssert, FHQSubmissionPage.additionalInformationAdded,fHQ_TestDataManager.addAdditionalInformation, " Is there anything else you would like us to know about this participant? Label "+ string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.FHQ_STUDY),"FHQ Study"," FHQ Study Label "+ string); 	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText("FSID"),"FSID"," FSID Label "+ string); 	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(11),"", " FSID Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT),fHQ_TestDataManager.participant, " Participant Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, FHQSubmissionPage.participantName,fHQ_TestDataManager.participantValue, " Participant Value "+ string); 
	}
	/* ************** PARTNER ASSERTION IN NATIVE VIEW *************** */
	public static void partnersFHQInformationAssertions(String string) {
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForRelativeTab(13));
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForPartner(fHQ_TestDataManager.partnerYearOfBirthValueNV));
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("Open Record"));
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPATION_STATUS),fHQ_TestDataManager.participationStatus, " Participation Status Label " + string);	
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(1),fHQ_TestDataManager.participationStatusValue, " Participation Status Label " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText("FSID"),"FSID"," FSID Label "+ string); 	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(1),"", " FSID Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("Participant",1),"Participant", " Participant Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, FHQSubmissionPage.nVPartnerParticipantValue,"", " Participant Value "+ string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForLabels(),"Is this your (the participant's) current partner","Is this your (the participant's) current partner"+ string);	
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(2),fHQ_TestDataManager.isThisTheParticipantCurrentPartnerValue, " Is this your (the participant's) current partner Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("First Name",1),fHQ_TestDataManager.firstName, " First Name label " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(2),fHQ_TestDataManager.partnerFirstName, " First Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("First Initial of LAST Name",1),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(3),fHQ_TestDataManager.partnerFirstInitialOfLASTName, " First Initial of LAST Name Value Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("Year of Birth",1),fHQ_TestDataManager.yearOfBirth, " Year of Birth label " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.partnerYearOfBirthValueNV, " Year of Birth Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("Vital Status",1),fHQ_TestDataManager.vitalStatus, " Vital Status Label " + string);		
		CharmsUtil.compareExpectedActualValue(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxForReadOnlyInput(FHQConstants.VITAL_STATUS),fHQ_TestDataManager.partnerVitalStatus, " Vital Status Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("Sex assigned at birth",1),fHQ_TestDataManager.sexAssignedAtBirth," Sex assigned at birth Label " + string);
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(4),fHQ_TestDataManager.partnerSexAssignedAtBirth, " Sex assigned at birth Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("Gender Identity",1),"Gender Identity"," Gender Identity Label "+ string);
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(5),fHQ_TestDataManager.partnerGenderIdentity, " Gender Identity Value "+ string);
		CharmsUtil.compareExpectedActualValue(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxForReadOnlyInput(FHQConstants.IS_THE_PARTICIPANT_BLOOD_RELATED_TO_THIS_PERSON),fHQ_TestDataManager.isTheParticipantBloodRelated, " Is the participant blood-related to this person? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("Please describe how the participant is related to this person",1),fHQ_TestDataManager.pleaseDescribeHowTheParticipantIsRelatedToThisPerson, " Please describe how the participant is related to this person Label " + string);	
		CharmsUtil.assertTextBoxData(softAssert,fHQSubmissionPage.dynamicLocatorInputTextBox(8),fHQ_TestDataManager.describeTheParticipantRelatedToThisPerson, " Please describe how the participant is related to this person Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("Is there anything else you would like us to know about this relative?",1),"Is there anything else you would like us to know about this relative?"," Is there anything else you would like us to know about this relative? Label " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxForReadOnlyInput1(FHQConstants.IS_THERE_ANYTHING_ELSE_YOU_WOULD_LIKE_US_TO_KNOW_ABOUT_THIS_RELATIVE),fHQ_TestDataManager.addAdditionalInformation, " Is there anything else you would like us to know about this relative? Value "+ string); 
	}	
	/* ******** PARENT (MOTHER) ASSERTION IN NATIVE VIEW ********** */
	public static void motherFHQInformationAssertions(String string) {
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForRelativeTab(5));
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForParents(fHQ_TestDataManager.firstNameValueAdded));	
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingContainsNormalizeSpace("Open Record",1));
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPATION_STATUS),fHQ_TestDataManager.participationStatus, " Participation Status Label " + string);	
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(1),fHQ_TestDataManager.participationStatusValue, " Participation Status Label " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText("FSID"),"FSID"," FSID Label "+ string); 	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(1),"", " FSID Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("Participant",1),"Participant", " Participant Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForParticipant("parent"),"", " Participant Value "+ string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.RELATIONS_TO_PATIENT),fHQ_TestDataManager.relationsToPatient, " Relation to Patient Label " + string);	
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(2),fHQ_TestDataManager.relationToPatientValue2, " Relation to Patient Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.FIRST_NAME,1),fHQ_TestDataManager.firstName, " First Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(2),fHQ_TestDataManager.firstNameValueAdded, " First Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME,1),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(3),fHQ_TestDataManager.firstInitialOfLASTNameAdded, " First Initial of LAST Name Value Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.WAS_THIS_RELATIVE_ADOPTED,1),fHQ_TestDataManager.wasThisRelativeAdopted, " Was this relative adopted? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(3),fHQ_TestDataManager.relativeAdoptedValueSelected, "  Was this relative adopted? " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.YEAR_OF_BIRTH,1),fHQ_TestDataManager.yearOfBirth, " Year of Birth label" + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputYearOfBirth("parent"),fHQ_TestDataManager.yearOfBirthValueNV, " Year of Birth Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.VITAL_STATUS,1),fHQ_TestDataManager.vitalStatus, " Vital Status Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(4),fHQ_TestDataManager.vitalStatusValueAdded, " Vital Status Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH,1),fHQ_TestDataManager.sexAssignedAtBirth," Sex assigned at birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(6),fHQ_TestDataManager.sexAssignedAtBirthValueAdded, " Sex assigned at birth Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARTICIPANT_GENDER_IDENTITY,1), fHQ_TestDataManager.genderIdentity, " Gender Identity Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(7),fHQ_TestDataManager.genderIdentityValueAdded, " Gender Identity Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.IS_THIS_RELATIVE_A_TWIN_OR_PART_OF_A_MULTIPLE_BIRTH,1), fHQ_TestDataManager.isThisRelativeATwinOrPartOfAMultipleBirth, " Is this relative a twin or part of a multiple birth? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(8),fHQ_TestDataManager.twinOrPartOfAMultipleBirthValueAdded, " Is this relative a twin or part of a multiple birth? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARENT_TYPE_OF_BIRTH,1), fHQ_TestDataManager.typeOfBirth, " Type of birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(9),fHQ_TestDataManager.typeOfBirthValueAdded, " Type of birth Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("Has this relative ever had any miscarriages, stillbirths?",1),"Has this relative ever had any miscarriages, stillbirths?", "Has this relative ever had any miscarriages, stillbirths? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(10),fHQ_TestDataManager.hasThisRelativeEverHadAnyMiscarriagesOrStillbirthsValue, "  Has this relative ever had any miscarriages or stillbirths? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES,1),fHQ_TestDataManager.totalNumberOfMiscarriages," Total number of Miscarriages Label " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputTotalMiscarriages("parent"),fHQ_TestDataManager.totalNumberOfMiscarriagesValue, " Total number of Miscarriages Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS,1),fHQ_TestDataManager.totalNumberOfStillbirths," Total number of Stillbirths Label" + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputTotalStillbirths("parent"),fHQ_TestDataManager.totalNumberOfStillbirthsValue, " Total number of Stillbirths Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_BEEN_DIAGNOSED_WITH_A_RASOPATHY,1), fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathy, " Has this relative ever been diagnosed with a RASopathy? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(11),fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathyValue, "  Has this relative ever been diagnosed with a RASopathy? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_CANCER,1), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancer, " Has this relative ever been diagnosed with cancer? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(12),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancerValue, "  Has this relative ever been diagnosed with cancer? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_BENIGN_TUMOR,1), "Has this relative ever been diagnosed with a benign tumor?", " Has this relative ever been diagnosed with a Benign Tumor? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForInputBenignTumor("parent"),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithABenignTumorValue, "  Has this relative ever been diagnosed with a Benign Tumor? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_ANY_MEDICAL_CONDITIONS,1 ), "Has this relative ever been diagnosed with any medical conditions?", " Has this relative ever been diagnosed with any medical conditions? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(13),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelowValue, "  Has this relative ever been diagnosed with any medical conditions? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HOW_MANY_SIBLINGS_DOES_THIS_RELATIVE_HAVE,1), fHQ_TestDataManager.howManySiblingsDoesThisRelativeHave, " How many siblings does this relative have? Label"+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputTotalSiblings("parent"),fHQ_TestDataManager.howManySiblingsDoesThisRelativeHaveValue, " How many siblings does this relative have? Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.IS_THERE_ANYTHING_ELSE_YOU_WOULD_LIKE_US_TO_KNOW_ABOUT_THIS_RELATIVE,1),fHQ_TestDataManager.isThereAnythingElseYouWouldLikeUsToKnowAboutThisRelative," Is there anything else you would like us to know about this relative? Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, FHQSubmissionPage.nVParentAnythingElseValue,fHQ_TestDataManager.addAdditionalInformation, " Is there anything else you would like us to know about this relative? Value "+ string); 
	}	
	/* ************ PARENT (FATHER) ASSERTION IN NATIVE VIEW ******** */
	public static void fatherFHQInformationAssertions(String string) {
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForRelativeTab(5));	
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForParents(fHQ_TestDataManager.firstNameValueAdded));	
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingContainsNormalizeSpace("Open Record",1));
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPATION_STATUS),fHQ_TestDataManager.participationStatus, " Participation Status Label " + string);	
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(1),fHQ_TestDataManager.participationStatusValue, " Participation Status Label " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText("FSID"),"FSID"," FSID Label "+ string); 	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(1),"", " FSID Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("Participant",1),"Participant", " Participant Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForParticipant("parent"),"", " Participant Value "+ string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.RELATIONS_TO_PATIENT),fHQ_TestDataManager.relationsToPatient, " Relation to Patient Label " + string);	
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(2),fHQ_TestDataManager.relationToPatientValue1, " Relation to Patient Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.FIRST_NAME,1),fHQ_TestDataManager.firstName, " First Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(2),fHQ_TestDataManager.firstNameValueAdded, " First Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME,1),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(3),fHQ_TestDataManager.firstInitialOfLASTNameAdded, " First Initial of LAST Name Value Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.WAS_THIS_RELATIVE_ADOPTED,1),fHQ_TestDataManager.wasThisRelativeAdopted, " Was this relative adopted? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(3),fHQ_TestDataManager.relativeAdoptedValueSelected, "  Was this relative adopted? " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.YEAR_OF_BIRTH,1),fHQ_TestDataManager.yearOfBirth, " Year of Birth label" + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputYearOfBirth("parent"),fHQ_TestDataManager.yearOfBirthValueNV, " Year of Birth Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.VITAL_STATUS,1),fHQ_TestDataManager.vitalStatus, " Vital Status Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(4),fHQ_TestDataManager.vitalStatusValueAdded, " Vital Status Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH,1),fHQ_TestDataManager.sexAssignedAtBirth," Sex assigned at birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(6),fHQ_TestDataManager.sexAssignedAtBirthValueAdded, " Sex assigned at birth Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARTICIPANT_GENDER_IDENTITY,1), fHQ_TestDataManager.genderIdentity, " Gender Identity Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(7),fHQ_TestDataManager.genderIdentityValueAdded, " Gender Identity Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.IS_THIS_RELATIVE_A_TWIN_OR_PART_OF_A_MULTIPLE_BIRTH,1), fHQ_TestDataManager.isThisRelativeATwinOrPartOfAMultipleBirth, " Is this relative a twin or part of a multiple birth? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(8),fHQ_TestDataManager.twinOrPartOfAMultipleBirthValueAdded, " Is this relative a twin or part of a multiple birth? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARENT_TYPE_OF_BIRTH,1), fHQ_TestDataManager.typeOfBirth, " Type of birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(9),fHQ_TestDataManager.typeOfBirthValueAdded, " Type of birth Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES,1),fHQ_TestDataManager.totalNumberOfMiscarriages," Total number of Miscarriages Label " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputTotalMiscarriages("parent"),fHQ_TestDataManager.totalNumberOfMiscarriagesValue, " Total number of Miscarriages Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS,1),fHQ_TestDataManager.totalNumberOfStillbirths," Total number of Stillbirths Label" + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputTotalStillbirths("parent"),fHQ_TestDataManager.totalNumberOfStillbirthsValue, " Total number of Stillbirths Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_BEEN_DIAGNOSED_WITH_A_RASOPATHY,1), fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathy, " Has this relative ever been diagnosed with a RASopathy? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(11),fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathyValue, "  Has this relative ever been diagnosed with a RASopathy? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_CANCER,1), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancer, " Has this relative ever been diagnosed with cancer? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(12),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancerValue, "  Has this relative ever been diagnosed with cancer? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_BENIGN_TUMOR,1), "Has this relative ever been diagnosed with a benign tumor?", " Has this relative ever been diagnosed with a Benign Tumor? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForInputBenignTumor("parent"),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithABenignTumorValue, "  Has this relative ever been diagnosed with a Benign Tumor? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_ANY_MEDICAL_CONDITIONS,1 ), "Has this relative ever been diagnosed with any medical conditions?", " Has this relative ever been diagnosed with any medical conditions? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(13),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelowValue, "  Has this relative ever been diagnosed with any medical conditions? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HOW_MANY_SIBLINGS_DOES_THIS_RELATIVE_HAVE,1), fHQ_TestDataManager.howManySiblingsDoesThisRelativeHave, " How many siblings does this relative have? Label"+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputTotalSiblings("parent"),fHQ_TestDataManager.howManySiblingsDoesThisRelativeHaveValue, " How many siblings does this relative have? Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.IS_THERE_ANYTHING_ELSE_YOU_WOULD_LIKE_US_TO_KNOW_ABOUT_THIS_RELATIVE,1),fHQ_TestDataManager.isThereAnythingElseYouWouldLikeUsToKnowAboutThisRelative," Is there anything else you would like us to know about this relative? Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, FHQSubmissionPage.nVParentAnythingElseValue,fHQ_TestDataManager.addAdditionalInformation, " Is there anything else you would like us to know about this relative? Value "+ string); 
		}
	/* ************** CHILDREN ASSERTION IN NATIVE VIEW *************** */
	public static void  childrenFHQInformationAssertions (String string) {
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForRelativeTab(7));		
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForAddedRelative("Son(s)/Daughter(s) related list",fHQ_TestDataManager.yearOfBirthValueNV));	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPATION_STATUS),fHQ_TestDataManager.participationStatus, " Participation Status Label " + string);	
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(1),fHQ_TestDataManager.participationStatusValue, " Participation Status Label " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText("FSID"),"FSID"," FSID Label "+ string); 	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(1),"", " FSID Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("Participant",1),"Participant", " Participant Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForParticipant("child"),"", " Participant Value "+ string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText("Parent of this relative"),fHQ_TestDataManager.parentOfThisRelative, " Parent of this relative Label " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput("Parent of this relative"),fHQ_TestDataManager.parentOfThisRelativeValue, "  Parent of this relative Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.FIRST_NAME,1),fHQ_TestDataManager.firstName, " First Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(3),fHQ_TestDataManager.childFirstNameValue, " First Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME,1),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(4),fHQ_TestDataManager.childFirstInitialOfLASTNameValue, " First Initial of LAST Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.YEAR_OF_BIRTH,1),fHQ_TestDataManager.yearOfBirth, " Year of Birth label" + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputYearOfBirth("child"),fHQ_TestDataManager.yearOfBirthValueNV, " Year of Birth Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.VITAL_STATUS,1),fHQ_TestDataManager.vitalStatus, " Vital Status Label" + string);
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(3),fHQ_TestDataManager.childVitalStatusValue, " Vital Status Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH,1),fHQ_TestDataManager.sexAssignedAtBirth," Sex assigned at birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(5),fHQ_TestDataManager.childSexAssignedAtBirthSelected, " Sex assigned at birth Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARTICIPANT_GENDER_IDENTITY,1), fHQ_TestDataManager.genderIdentity, " Gender Identity Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(6),fHQ_TestDataManager.childGenderIdentitySelected, " Gender Identity Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.WHICH_BEST_DESCRIBES_THIS_RELATIVE,1), fHQ_TestDataManager.whichBestDescribesThisRelative, " Which best describes this relative? label in Child Form ");
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(7),fHQ_TestDataManager.whichBestDescribesThisRelativeSelected, " Which best describes this relative? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("Is the other biological parent of this relative one of the partners entered?",1), "Is the other biological parent of this relative one of the partners entered?", " Is the other biological parent of this relative one of the partners you have entered? label in Child Form ");
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(8),fHQ_TestDataManager.isTheOtherBiologicalParentOfThisRelativeOneOfThePartnersYouHaveEnteredSelected, " Is the other biological parent of this relative one of the partners you have entered? Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.IS_THIS_RELATIVE_A_TWIN_OR_PART_OF_A_MULTIPLE_BIRTH,1), fHQ_TestDataManager.isThisRelativeATwinOrPartOfAMultipleBirth, " Is this relative a twin or part of a multiple birth? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(9),fHQ_TestDataManager.twinOrPartOfAMultipleBirthValue, " Is this relative a twin or part of a multiple birth? Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARENT_TYPE_OF_BIRTH,1), fHQ_TestDataManager.typeOfBirth, " Type of birth Label " + string);	
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(10),fHQ_TestDataManager.typeOfBirthValue, " Type of birth? Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("Has this relative ever had any miscarriages, stillbirths?",1),"Has this relative ever had any miscarriages, stillbirths?"," Has this relative ever had any miscarriages, stillbirths? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(11),fHQ_TestDataManager.hasThisRelativeEverHadAnyMiscarriagesOrStillbirthsValue, "  Has this relative ever had any miscarriages or stillbirths? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES,1),fHQ_TestDataManager.totalNumberOfMiscarriages," Total number of Miscarriages Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputTotalMiscarriages("child"),fHQ_TestDataManager.totalNumberOfMiscarriagesValue, " Total number of Miscarriages Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS,1),fHQ_TestDataManager.totalNumberOfStillbirths," Total number of Stillbirths Label "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputTotalStillbirths("child"),fHQ_TestDataManager.totalNumberOfStillbirthsValue, " Total number of Stillbirths Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_BEEN_DIAGNOSED_WITH_A_RASOPATHY,1), fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathy, " Has this relative ever been diagnosed with a RASopathy? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(12),fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathyValue, "  Has this relative ever been diagnosed with a RASopathy? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_CANCER,1), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancer, "Has this relative ever been diagnosed with cancer? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(13),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancerValue, "  Has this relative ever been diagnosed with cancer? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_BENIGN_TUMOR,1), "Has this relative ever been diagnosed with a benign tumor?", " Has this relative ever been diagnosed with a Benign Tumor? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForInputBenignTumor("child"),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithABenignTumorValue, "  Has this relative ever been diagnosed with a Benign Tumor? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_ANY_MEDICAL_CONDITIONS,1 ), "Has this relative ever been diagnosed with any medical conditions?", " Has this relative ever been diagnosed with any medical conditions? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(15),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelowValue, " Has this relative ever been diagnosed with any medical conditions? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HOW_MANY_TOTAL_CHILDREN_ALIVE_AND_DECEASED_HAS_THIS_RELATIVE_HAD,1),"How many total children (alive and deceased) has this relative had?"," How many total children (alive and deceased) has this relative had? Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputTotalChildren("child"),fHQ_TestDataManager.howManyTotalChildrenAliveAndDeceasedHasThisRelaiveHadSelected," How many total children (alive and deceased) has this relative had? Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.IS_THERE_ANYTHING_ELSE_YOU_WOULD_LIKE_US_TO_KNOW_ABOUT_THIS_RELATIVE,1),fHQ_TestDataManager.isThereAnythingElseYouWouldLikeUsToKnowAboutThisRelative," Is there anything else you would like us to know about this relative? Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, FHQSubmissionPage.nVChildAnythingElseValue,fHQ_TestDataManager.addAdditionalInformation, " Is there anything else you would like us to know about this relative? Value "+ string); 	
	}
	/* ************** SIBLING ASSERTION IN NATIVE VIEW *************** */
	public static void  siblingFHQInformationAssertions (String string) {
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForRelativeTab(11));
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForAddedRelative("FHQ Siblings related list",fHQ_TestDataManager.yearOfBirthValueNV));
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPATION_STATUS),fHQ_TestDataManager.participationStatus, " Participation Status Label " + string);	
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(1),fHQ_TestDataManager.participationStatusValue, " Participation Status Label " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText("FSID"),"FSID"," FSID Label "+ string); 	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(1),"", " FSID Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("Participant",1),"Participant", " Participant Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForParticipant("siblings"),"", " Participant Value "+ string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("Type of Sibling",1),fHQ_TestDataManager.typeOfSibling, " Type of Sibling Label " + string);	
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(2),fHQ_TestDataManager.typeOfSiblingValue, " Type of Sibling Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.FIRST_NAME,1),fHQ_TestDataManager.firstName, " First Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(2),fHQ_TestDataManager.firstNameValue, " First Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME,1),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(3),fHQ_TestDataManager.firstInitialOfLASTNameValue, " First Initial of LAST Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.YEAR_OF_BIRTH,1),fHQ_TestDataManager.yearOfBirth, " Year of Birth label" + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputYearOfBirth("siblings"),fHQ_TestDataManager.yearOfBirthValueNV, " Year of Birth Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.VITAL_STATUS,1),fHQ_TestDataManager.vitalStatus, " Vital Status Label" + string);
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(3),fHQ_TestDataManager.vitalStatusValue, " Vital Status Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH,1),fHQ_TestDataManager.sexAssignedAtBirth," Sex assigned at birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(5),fHQ_TestDataManager.sexAssignedAtBirthValueAdded, " Sex assigned at birth Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARTICIPANT_GENDER_IDENTITY,1), fHQ_TestDataManager.genderIdentity, " Gender Identity Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(6),fHQ_TestDataManager.genderIdentityValueAdded, " Gender Identity Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.IS_THIS_RELATIVE_A_TWIN_OR_PART_OF_A_MULTIPLE_BIRTH,1), fHQ_TestDataManager.isThisRelativeATwinOrPartOfAMultipleBirth, " Is this relative a twin or part of a multiple birth? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(7),fHQ_TestDataManager.twinOrPartOfAMultipleBirthValue, " Is this relative a twin or part of a multiple birth? Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARENT_TYPE_OF_BIRTH,1), fHQ_TestDataManager.typeOfBirth, " Type of birth Label " + string);	
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(8),fHQ_TestDataManager.typeOfBirthValue, " Type of birth? Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("Has this relative ever had any miscarriages, stillbirths?",1),"Has this relative ever had any miscarriages, stillbirths?"," Has this relative ever had any miscarriages, stillbirths? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(9),fHQ_TestDataManager.hasThisRelativeEverHadAnyMiscarriagesOrStillbirthsValue, "  Has this relative ever had any miscarriages or stillbirths? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES,1),fHQ_TestDataManager.totalNumberOfMiscarriages," Total number of Miscarriages Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputTotalMiscarriages("siblings"),fHQ_TestDataManager.totalNumberOfMiscarriagesValue, " Total number of Miscarriages Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS,1),fHQ_TestDataManager.totalNumberOfStillbirths," Total number of Stillbirths Label "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputTotalStillbirths("siblings"),fHQ_TestDataManager.totalNumberOfStillbirthsValue, " Total number of Stillbirths Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_BEEN_DIAGNOSED_WITH_A_RASOPATHY,1), fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathy, " Has this relative ever been diagnosed with a RASopathy? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(10),fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathyValue, "  Has this relative ever been diagnosed with a RASopathy? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_CANCER,1), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancer, "Has this relative ever been diagnosed with cancer? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(11),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancerValue, "  Has this relative ever been diagnosed with cancer? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_BENIGN_TUMOR,1), "Has this relative ever been diagnosed with a benign tumor?", " Has this relative ever been diagnosed with a Benign Tumor? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForInputBenignTumor("siblings"),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithABenignTumorValue, "  Has this relative ever been diagnosed with a Benign Tumor? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_ANY_MEDICAL_CONDITIONS,1 ), "Has this relative ever been diagnosed with any medical conditions?", " Has this relative ever been diagnosed with any medical conditions? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(13),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelowValue, " Has this relative ever been diagnosed with any medical conditions? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HOW_MANY_TOTAL_CHILDREN_ALIVE_AND_DECEASED_HAS_THIS_RELATIVE_HAD,1),"How many total children (alive and deceased) has this relative had?"," How many total children (alive and deceased) has this relative had? Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputTotalChildrenForSibling("siblings"),fHQ_TestDataManager.howManyTotalChildrenAliveAndDeceasedHasThisRelaiveHadSelected," How many total children (alive and deceased) has this relative had? Value "+ string);		
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("Is there anything else you would like us to know about this relative?",1),fHQ_TestDataManager.isThereAnythingElseYouWouldLikeUsToKnowAboutThisRelative," Is there anything else you would like us to know about this relative? Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert,FHQSubmissionPage.nVSiblingAnythingElseValue,fHQ_TestDataManager.addAdditionalInformation, " Is there anything else you would like us to know about this relative? Value " + string);			
	}
	/* ************** AUNT/UNCLE ASSERTION IN NATIVE VIEW *************** */
	public static void  auntUncleFHQInformationAssertions (String string) {
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForRelativeTab(9));
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForAddedRelatives(fHQ_TestDataManager.auntUncleFirstNameValue1,fHQ_TestDataManager.yearOfBirthValueNV));	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPATION_STATUS),fHQ_TestDataManager.participationStatus, " Participation Status Label " + string);	
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(1),fHQ_TestDataManager.participationStatusValue, " Participation Status Label " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText("FSID"),"FSID"," FSID Label "+ string); 	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(1),"", " FSID Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("Participant",1),"Participant", " Participant Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForParticipant("aunts_nephew"),"", " Participant Value "+ string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.SIBLING_TO,1),FHQConstants.SIBLING_TO, " Sibling to Label " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.SIBLING_TO),fHQ_TestDataManager.siblingTo, " Sibling to Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.TYPE_OF_SIBLING_NV,1),fHQ_TestDataManager.typeOfSiblingNV, " Type of Sibling Label " + string);	
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(3),fHQ_TestDataManager.typeOfSiblingValueNV, " Type of Sibling Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.FIRST_NAME,1),fHQ_TestDataManager.firstName, " First Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(3),fHQ_TestDataManager.auntUncleFirstNameValue1, " First Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME,1),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(4),fHQ_TestDataManager.auntUncleFirstInitialOfLASTNameValue1, " First Initial of LAST Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.YEAR_OF_BIRTH,1),fHQ_TestDataManager.yearOfBirth, " Year of Birth label" + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(5),fHQ_TestDataManager.yearOfBirthValueNV, " Year of Birth Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.VITAL_STATUS,1),fHQ_TestDataManager.vitalStatus, " Vital Status Label" + string);
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(4),fHQ_TestDataManager.auntUncleVitalStatusValue1, " Vital Status Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH,1),fHQ_TestDataManager.sexAssignedAtBirth," Sex assigned at birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(6),fHQ_TestDataManager.auntUncleSexAssignedAtBirthSelected, " Sex assigned at birth Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARTICIPANT_GENDER_IDENTITY,1), fHQ_TestDataManager.genderIdentity, " Gender Identity Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(7),fHQ_TestDataManager.auntUncleGenderIdentitySelected, " Gender Identity Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.IS_THIS_RELATIVE_A_TWIN_OR_PART_OF_A_MULTIPLE_BIRTH,1), fHQ_TestDataManager.isThisRelativeATwinOrPartOfAMultipleBirth, " Is this relative a twin or part of a multiple birth? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(8),fHQ_TestDataManager.twinOrPartOfAMultipleBirthValue, " Is this relative a twin or part of a multiple birth? Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARENT_TYPE_OF_BIRTH,1), fHQ_TestDataManager.typeOfBirth, " Type of birth Label " + string);	
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(9),fHQ_TestDataManager.typeOfBirthValue, " Type of birth? Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("Has this relative ever had any miscarriages, stillbirths?",1),"Has this relative ever had any miscarriages, stillbirths?"," Has this relative ever had any miscarriages, stillbirths? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(10),fHQ_TestDataManager.hasThisRelativeEverHadAnyMiscarriagesOrStillbirthsValue, "  Has this relative ever had any miscarriages or stillbirths? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES,1),fHQ_TestDataManager.totalNumberOfMiscarriages," Total number of Miscarriages Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputTotalMiscarriage("aunts_nephew"),fHQ_TestDataManager.totalNumberOfMiscarriagesValue," Total number of Miscarriages Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS,1),fHQ_TestDataManager.totalNumberOfStillbirths," Total number of Stillbirths Label "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputTotalStillbirth("aunts_nephew"),fHQ_TestDataManager.totalNumberOfStillbirthsValue," Total number of Stillbirths Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_BEEN_DIAGNOSED_WITH_A_RASOPATHY,1), fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathy, " Has this relative ever been diagnosed with a RASopathy? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(11),fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathyValue, "  Has this relative ever been diagnosed with a RASopathy? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_CANCER,1), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancer, "Has this relative ever been diagnosed with cancer? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(12),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancerValue, "  Has this relative ever been diagnosed with cancer? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_BENIGN_TUMOR,1), "Has this relative ever been diagnosed with a benign tumor?", " Has this relative ever been diagnosed with a Benign Tumor? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(13),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithABenignTumorValue, "  Has this relative ever been diagnosed with a Benign Tumor? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_ANY_MEDICAL_CONDITIONS,1 ), "Has this relative ever been diagnosed with any medical conditions?", " Has this relative ever been diagnosed with any medical conditions? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(14),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelowValue, " Has this relative ever been diagnosed with any medical conditions? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("How many total children (alive and deceased) does this relative have?",1),"How many total children (alive and deceased) does this relative have?"," How many total children (alive and deceased) does this relative have? Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputTotalChildrenForAuntUncle("aunts_nephew"),fHQ_TestDataManager.howManyTotalChildrenAliveAndDeceasedHasThisRelaiveHadSelected," How many total children (alive and deceased) has this relative had? Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("Is there anything else you would like us to know about this relative?",1),fHQ_TestDataManager.isThereAnythingElseYouWouldLikeUsToKnowAboutThisRelative," Is there anything else you would like us to know about this relative? Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert,FHQSubmissionPage.nVAuntUncleAnythingElseValue,fHQ_TestDataManager.addAdditionalInformation, " Is there anything else you would like us to know about this relative? Value " + string);			
	}
	/* ************** NIECE/NEPHEW ASSERTION IN NATIVE VIEW *************** */
	public static void  nieceNephewFHQInformationAssertions (String string) {	
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForRelativeTab(12));
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForAddedRelatives(fHQ_TestDataManager.nieceNephewFirstNameValue,fHQ_TestDataManager.yearOfBirthValueNV));
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPATION_STATUS),fHQ_TestDataManager.participationStatus, " Participation Status Label " + string);	
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(1),fHQ_TestDataManager.participationStatusValue, " Participation Status Label " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText("FSID"),"FSID"," FSID Label "+ string); 	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(1),"", " FSID Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("Participant",1),"Participant", " Participant Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForParticipant("child"),"", " Participant Value "+ string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARENT_OF_THIS_RELATIVE,1),fHQ_TestDataManager.parentOfThisRelative, " Parent of this relative Label " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.PARENT_OF_THIS_RELATIVE),fHQ_TestDataManager.parentOfThisRelativeValue, " Parent of this relative Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.FIRST_NAME,1),fHQ_TestDataManager.firstName, " First Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(3),fHQ_TestDataManager.nieceNephewFirstNameValue, " First Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME,1),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(4),fHQ_TestDataManager.nieceNephewFirstInitialOfLASTNameValue, " First Initial of LAST Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.YEAR_OF_BIRTH,1),fHQ_TestDataManager.yearOfBirth, " Year of Birth label" + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(5),fHQ_TestDataManager.yearOfBirthValueNV, " Year of Birth Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.VITAL_STATUS,1),fHQ_TestDataManager.vitalStatus, " Vital Status Label" + string);
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(3),fHQ_TestDataManager.nieceNephewVitalStatusValue, " Vital Status Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH,1),fHQ_TestDataManager.sexAssignedAtBirth," Sex assigned at birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(5),fHQ_TestDataManager.neiceNephewSexAssignedAtBirthSelected, " Sex assigned at birth Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARTICIPANT_GENDER_IDENTITY,1), fHQ_TestDataManager.genderIdentity, " Gender Identity Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(6),fHQ_TestDataManager.neiceNephewGenderIdentitySelected, " Gender Identity Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.WHICH_BEST_DESCRIBES_THIS_RELATIVE,1), fHQ_TestDataManager.whichBestDescribesThisRelative, " Which best describes this relative? label in Child Form ");
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(7),fHQ_TestDataManager.whichBestDescribesThisRelativeSelected, " Which best describes this relative? Value " + string);			
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.IS_THIS_RELATIVE_A_TWIN_OR_PART_OF_A_MULTIPLE_BIRTH,1), fHQ_TestDataManager.isThisRelativeATwinOrPartOfAMultipleBirth, " Is this relative a twin or part of a multiple birth? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(9),fHQ_TestDataManager.twinOrPartOfAMultipleBirthValue, " Is this relative a twin or part of a multiple birth? Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARENT_TYPE_OF_BIRTH,1), fHQ_TestDataManager.typeOfBirth, " Type of birth Label " + string);		
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(10),fHQ_TestDataManager.typeOfBirthValue, " Type of birth? Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("Has this relative ever had any miscarriages, stillbirths?",1),"Has this relative ever had any miscarriages, stillbirths?"," Has this relative ever had any miscarriages, stillbirths? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(11),fHQ_TestDataManager.hasThisRelativeEverHadAnyMiscarriagesOrStillbirthsValue, "  Has this relative ever had any miscarriages or stillbirths? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES,1),fHQ_TestDataManager.totalNumberOfMiscarriages," Total number of Miscarriages Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputTotalMiscarriages("child"),fHQ_TestDataManager.totalNumberOfMiscarriagesValue," Total number of Miscarriages Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS,1),fHQ_TestDataManager.totalNumberOfStillbirths," Total number of Stillbirths Label "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputTotalStillbirths("child"),fHQ_TestDataManager.totalNumberOfStillbirthsValue," Total number of Stillbirths Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_BEEN_DIAGNOSED_WITH_A_RASOPATHY,1), fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathy, " Has this relative ever been diagnosed with a RASopathy? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(12),fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathyValue, "  Has this relative ever been diagnosed with a RASopathy? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_CANCER,1), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancer, "Has this relative ever been diagnosed with cancer? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(13),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancerValue, "  Has this relative ever been diagnosed with cancer? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_BENIGN_TUMOR,1), "Has this relative ever been diagnosed with a benign tumor?", " Has this relative ever been diagnosed with a Benign Tumor? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(14),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithABenignTumorValue, "  Has this relative ever been diagnosed with a Benign Tumor? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_ANY_MEDICAL_CONDITIONS,1 ), "Has this relative ever been diagnosed with any medical conditions?", " Has this relative ever been diagnosed with any medical conditions? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(15),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelowValue, " Has this relative ever been diagnosed with any medical conditions? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("How many total children (alive and deceased) has this relative had?",1),"How many total children (alive and deceased) has this relative had?"," How many total children (alive and deceased) does this relative have? Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputTotalChildren("child"),fHQ_TestDataManager.howManyTotalChildrenAliveAndDeceasedHasThisRelaiveHadSelected," How many total children (alive and deceased) has this relative had? Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("Is there anything else you would like us to know about this relative?",1),fHQ_TestDataManager.isThereAnythingElseYouWouldLikeUsToKnowAboutThisRelative," Is there anything else you would like us to know about this relative? Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert,FHQSubmissionPage.nVChildAnythingElseValue,fHQ_TestDataManager.addAdditionalInformation, " Is there anything else you would like us to know about this relative? Value " + string);				
	}
	/* ************** MATERNAL GRANDMOTHER ASSERTION IN NATIVE VIEW *************** */
	public static void  maternalGrandMotherFHQInformationAssertions (String string) {
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForRelativeTab(6));
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForAddedRelatives(fHQ_TestDataManager.firstNameValueAdded,fHQ_TestDataManager.yearOfBirthValueNV));
		MiscUtils.sleep(200);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPATION_STATUS),fHQ_TestDataManager.participationStatus, " Participation Status Label " + string);	
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(1),fHQ_TestDataManager.participationStatusValue, " Participation Status Label " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText("FSID"),"FSID"," FSID Label "+ string); 	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(1),"", " FSID Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("Participant",1),"Participant", " Participant Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForParticipant("parent"),"", " Participant Value "+ string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.RELATIONS_TO_PATIENT),fHQ_TestDataManager.relationsToPatient, " Relation to Patient Label " + string);	
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(2),fHQ_TestDataManager.relationToPatientValue3, " Relation to Patient Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.FIRST_NAME,1),fHQ_TestDataManager.firstName, " First Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(2),fHQ_TestDataManager.firstNameValueAdded, " First Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME,1),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(3),fHQ_TestDataManager.firstInitialOfLASTNameAdded, " First Initial of LAST Name Value Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.WAS_THIS_RELATIVE_ADOPTED,1),fHQ_TestDataManager.wasThisRelativeAdopted, " Was this relative adopted? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(3),fHQ_TestDataManager.relativeAdoptedValueSelected, "  Was this relative adopted? " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.YEAR_OF_BIRTH,1),fHQ_TestDataManager.yearOfBirth, " Year of Birth label" + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputYearOfBirth("parent"),fHQ_TestDataManager.yearOfBirthValueNV, " Year of Birth Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.VITAL_STATUS,1),fHQ_TestDataManager.vitalStatus, " Vital Status Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(4),fHQ_TestDataManager.vitalStatusValueAdded, " Vital Status Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH,1),fHQ_TestDataManager.sexAssignedAtBirth," Sex assigned at birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(6),fHQ_TestDataManager.sexAssignedAtBirthValueAdded, " Sex assigned at birth Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARTICIPANT_GENDER_IDENTITY,1), fHQ_TestDataManager.genderIdentity, " Gender Identity Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(7),fHQ_TestDataManager.genderIdentityValueAdded, " Gender Identity Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.IS_THIS_RELATIVE_A_TWIN_OR_PART_OF_A_MULTIPLE_BIRTH,1), fHQ_TestDataManager.isThisRelativeATwinOrPartOfAMultipleBirth, " Is this relative a twin or part of a multiple birth? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(8),fHQ_TestDataManager.twinOrPartOfAMultipleBirthValueAdded, " Is this relative a twin or part of a multiple birth? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARENT_TYPE_OF_BIRTH,1), fHQ_TestDataManager.typeOfBirth, " Type of birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(9),fHQ_TestDataManager.typeOfBirthValueAdded, " Type of birth Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("Has this relative ever had any miscarriages, stillbirths?",1),"Has this relative ever had any miscarriages, stillbirths?", "Has this relative ever had any miscarriages, stillbirths? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(10),fHQ_TestDataManager.hasThisRelativeEverHadAnyMiscarriagesOrStillbirthsValue, "  Has this relative ever had any miscarriages or stillbirths? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES,1),fHQ_TestDataManager.totalNumberOfMiscarriages," Total number of Miscarriages Label " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputTotalMiscarriages("parent"),fHQ_TestDataManager.totalNumberOfMiscarriagesValue, " Total number of Miscarriages Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS,1),fHQ_TestDataManager.totalNumberOfStillbirths," Total number of Stillbirths Label" + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputTotalStillbirths("parent"),fHQ_TestDataManager.totalNumberOfStillbirthsValue, " Total number of Stillbirths Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_BEEN_DIAGNOSED_WITH_A_RASOPATHY,1), fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathy, " Has this relative ever been diagnosed with a RASopathy? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(11),fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathyValue, "  Has this relative ever been diagnosed with a RASopathy? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_CANCER,1), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancer, " Has this relative ever been diagnosed with cancer? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(12),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancerValue, "  Has this relative ever been diagnosed with cancer? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_BENIGN_TUMOR,1), "Has this relative ever been diagnosed with a benign tumor?", " Has this relative ever been diagnosed with a Benign Tumor? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForInputBenignTumor("parent"),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithABenignTumorValue, "  Has this relative ever been diagnosed with a Benign Tumor? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_ANY_MEDICAL_CONDITIONS,1 ), "Has this relative ever been diagnosed with any medical conditions?", " Has this relative ever been diagnosed with any medical conditions? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(13),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelowValue, "  Has this relative ever been diagnosed with any medical conditions? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.IS_THERE_ANYTHING_ELSE_YOU_WOULD_LIKE_US_TO_KNOW_ABOUT_THIS_RELATIVE,1),fHQ_TestDataManager.isThereAnythingElseYouWouldLikeUsToKnowAboutThisRelative," Is there anything else you would like us to know about this relative? Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, FHQSubmissionPage.nVParentAnythingElseValue,fHQ_TestDataManager.addAdditionalInformation, " Is there anything else you would like us to know about this relative? Value "+ string); 
	}
	/* ************** MATERNAL GRANDFATHER ASSERTION IN NATIVE VIEW *************** */
	public static void  maternalGrandFatherFHQInformationAssertions(String string) {
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForRelativeTab(6));
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForAddedRelatives(fHQ_TestDataManager.firstNameValueAdded,fHQ_TestDataManager.yearOfBirthValueNV));
		MiscUtils.sleep(200);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPATION_STATUS),fHQ_TestDataManager.participationStatus, " Participation Status Label " + string);	
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(1),fHQ_TestDataManager.participationStatusValue, " Participation Status Label " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText("FSID"),"FSID"," FSID Label "+ string); 	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(1),"", " FSID Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("Participant",1),"Participant", " Participant Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForParticipant("parent"),"", " Participant Value "+ string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.RELATIONS_TO_PATIENT),fHQ_TestDataManager.relationsToPatient, " Relation to Patient Label " + string);	
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(2),fHQ_TestDataManager.relationToPatientValue4, " Relation to Patient Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.FIRST_NAME,1),fHQ_TestDataManager.firstName, " First Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(2),fHQ_TestDataManager.firstNameValueAdded, " First Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME,1),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(3),fHQ_TestDataManager.firstInitialOfLASTNameAdded, " First Initial of LAST Name Value Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.WAS_THIS_RELATIVE_ADOPTED,1),fHQ_TestDataManager.wasThisRelativeAdopted, " Was this relative adopted? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(3),fHQ_TestDataManager.relativeAdoptedValueSelected, "  Was this relative adopted? " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.YEAR_OF_BIRTH,1),fHQ_TestDataManager.yearOfBirth, " Year of Birth label" + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputYearOfBirth("parent"),fHQ_TestDataManager.yearOfBirthValueNV, " Year of Birth Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.VITAL_STATUS,1),fHQ_TestDataManager.vitalStatus, " Vital Status Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(4),fHQ_TestDataManager.vitalStatusValueAdded, " Vital Status Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH,1),fHQ_TestDataManager.sexAssignedAtBirth," Sex assigned at birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(6),fHQ_TestDataManager.sexAssignedAtBirthValueAdded, " Sex assigned at birth Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARTICIPANT_GENDER_IDENTITY,1), fHQ_TestDataManager.genderIdentity, " Gender Identity Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(7),fHQ_TestDataManager.genderIdentityValueAdded, " Gender Identity Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.IS_THIS_RELATIVE_A_TWIN_OR_PART_OF_A_MULTIPLE_BIRTH,1), fHQ_TestDataManager.isThisRelativeATwinOrPartOfAMultipleBirth, " Is this relative a twin or part of a multiple birth? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(8),fHQ_TestDataManager.twinOrPartOfAMultipleBirthValueAdded, " Is this relative a twin or part of a multiple birth? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARENT_TYPE_OF_BIRTH,1), fHQ_TestDataManager.typeOfBirth, " Type of birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(9),fHQ_TestDataManager.typeOfBirthValueAdded, " Type of birth Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("Has this relative ever had any miscarriages, stillbirths?",1),"Has this relative ever had any miscarriages, stillbirths?", "Has this relative ever had any miscarriages, stillbirths? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(10),fHQ_TestDataManager.hasThisRelativeEverHadAnyMiscarriagesOrStillbirthsValue, "  Has this relative ever had any miscarriages or stillbirths? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES,1),fHQ_TestDataManager.totalNumberOfMiscarriages," Total number of Miscarriages Label " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputTotalMiscarriages("parent"),fHQ_TestDataManager.totalNumberOfMiscarriagesValue, " Total number of Miscarriages Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS,1),fHQ_TestDataManager.totalNumberOfStillbirths," Total number of Stillbirths Label" + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputTotalStillbirths("parent"),fHQ_TestDataManager.totalNumberOfStillbirthsValue, " Total number of Stillbirths Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_BEEN_DIAGNOSED_WITH_A_RASOPATHY,1), fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathy, " Has this relative ever been diagnosed with a RASopathy? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(11),fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathyValue, "  Has this relative ever been diagnosed with a RASopathy? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_CANCER,1), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancer, " Has this relative ever been diagnosed with cancer? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(12),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancerValue, "  Has this relative ever been diagnosed with cancer? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_BENIGN_TUMOR,1), "Has this relative ever been diagnosed with a benign tumor?", " Has this relative ever been diagnosed with a Benign Tumor? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForInputBenignTumor("parent"),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithABenignTumorValue, "  Has this relative ever been diagnosed with a Benign Tumor? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_ANY_MEDICAL_CONDITIONS,1 ), "Has this relative ever been diagnosed with any medical conditions?", " Has this relative ever been diagnosed with any medical conditions? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(13),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelowValue, "  Has this relative ever been diagnosed with any medical conditions? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.IS_THERE_ANYTHING_ELSE_YOU_WOULD_LIKE_US_TO_KNOW_ABOUT_THIS_RELATIVE,1),fHQ_TestDataManager.isThereAnythingElseYouWouldLikeUsToKnowAboutThisRelative," Is there anything else you would like us to know about this relative? Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, FHQSubmissionPage.nVParentAnythingElseValue,fHQ_TestDataManager.addAdditionalInformation, " Is there anything else you would like us to know about this relative? Value "+ string); 
	}
	/* ************** PATERNAL GRANDMOTHER ASSERTION IN NATIVE VIEW *************** */
	public static void  paternalGrandMotherFHQInformationAssertions (String string) {
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForRelativeTab(6));
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForAddedRelatives(fHQ_TestDataManager.firstNameValueAdded,fHQ_TestDataManager.yearOfBirthValueNV));
		MiscUtils.sleep(200);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPATION_STATUS),fHQ_TestDataManager.participationStatus, " Participation Status Label " + string);	
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(1),fHQ_TestDataManager.participationStatusValue, " Participation Status Label " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText("FSID"),"FSID"," FSID Label "+ string); 	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(1),"", " FSID Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("Participant",1),"Participant", " Participant Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForParticipant("parent"),"", " Participant Value "+ string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.RELATIONS_TO_PATIENT),fHQ_TestDataManager.relationsToPatient, " Relation to Patient Label " + string);	
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(2),fHQ_TestDataManager.relationToPatientValue1, " Relation to Patient Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.FIRST_NAME,1),fHQ_TestDataManager.firstName, " First Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(2),fHQ_TestDataManager.firstNameValueAdded, " First Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME,1),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(3),fHQ_TestDataManager.firstInitialOfLASTNameAdded, " First Initial of LAST Name Value Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.WAS_THIS_RELATIVE_ADOPTED,1),fHQ_TestDataManager.wasThisRelativeAdopted, " Was this relative adopted? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(3),fHQ_TestDataManager.relativeAdoptedValueSelected, "  Was this relative adopted? " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.YEAR_OF_BIRTH,1),fHQ_TestDataManager.yearOfBirth, " Year of Birth label" + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputYearOfBirth("parent"),fHQ_TestDataManager.yearOfBirthValueNV, " Year of Birth Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.VITAL_STATUS,1),fHQ_TestDataManager.vitalStatus, " Vital Status Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(4),fHQ_TestDataManager.vitalStatusValueAdded, " Vital Status Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH,1),fHQ_TestDataManager.sexAssignedAtBirth," Sex assigned at birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(6),fHQ_TestDataManager.sexAssignedAtBirthValueAdded, " Sex assigned at birth Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARTICIPANT_GENDER_IDENTITY,1), fHQ_TestDataManager.genderIdentity, " Gender Identity Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(7),fHQ_TestDataManager.genderIdentityValueAdded, " Gender Identity Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.IS_THIS_RELATIVE_A_TWIN_OR_PART_OF_A_MULTIPLE_BIRTH,1), fHQ_TestDataManager.isThisRelativeATwinOrPartOfAMultipleBirth, " Is this relative a twin or part of a multiple birth? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(8),fHQ_TestDataManager.twinOrPartOfAMultipleBirthValueAdded, " Is this relative a twin or part of a multiple birth? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARENT_TYPE_OF_BIRTH,1), fHQ_TestDataManager.typeOfBirth, " Type of birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(9),fHQ_TestDataManager.typeOfBirthValueAdded, " Type of birth Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("Has this relative ever had any miscarriages, stillbirths?",1),"Has this relative ever had any miscarriages, stillbirths?", "Has this relative ever had any miscarriages, stillbirths? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(10),fHQ_TestDataManager.hasThisRelativeEverHadAnyMiscarriagesOrStillbirthsValue, "  Has this relative ever had any miscarriages or stillbirths? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES,1),fHQ_TestDataManager.totalNumberOfMiscarriages," Total number of Miscarriages Label " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputTotalMiscarriages("parent"),fHQ_TestDataManager.totalNumberOfMiscarriagesValue, " Total number of Miscarriages Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS,1),fHQ_TestDataManager.totalNumberOfStillbirths," Total number of Stillbirths Label" + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputTotalStillbirths("parent"),fHQ_TestDataManager.totalNumberOfStillbirthsValue, " Total number of Stillbirths Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_BEEN_DIAGNOSED_WITH_A_RASOPATHY,1), fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathy, " Has this relative ever been diagnosed with a RASopathy? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(11),fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathyValue, "  Has this relative ever been diagnosed with a RASopathy? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_CANCER,1), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancer, " Has this relative ever been diagnosed with cancer? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(12),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancerValue, "  Has this relative ever been diagnosed with cancer? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_BENIGN_TUMOR,1), "Has this relative ever been diagnosed with a benign tumor?", " Has this relative ever been diagnosed with a Benign Tumor? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForInputBenignTumor("parent"),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithABenignTumorValue, "  Has this relative ever been diagnosed with a Benign Tumor? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_ANY_MEDICAL_CONDITIONS,1 ), "Has this relative ever been diagnosed with any medical conditions?", " Has this relative ever been diagnosed with any medical conditions? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(13),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelowValue, "  Has this relative ever been diagnosed with any medical conditions? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.IS_THERE_ANYTHING_ELSE_YOU_WOULD_LIKE_US_TO_KNOW_ABOUT_THIS_RELATIVE,1),fHQ_TestDataManager.isThereAnythingElseYouWouldLikeUsToKnowAboutThisRelative," Is there anything else you would like us to know about this relative? Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, FHQSubmissionPage.nVParentAnythingElseValue,fHQ_TestDataManager.addAdditionalInformation, " Is there anything else you would like us to know about this relative? Value "+ string); 
	}	
	/* ************** PATERNAL GRANDFATHER ASSERTION IN NATIVE VIEW *************** */
	public static void  paternalGrandFatherFHQInformationAssertions(String string) {
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForRelativeTab(6));
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForAddedRelatives(fHQ_TestDataManager.firstNameValueAdded,fHQ_TestDataManager.yearOfBirthValueNV));
		MiscUtils.sleep(200);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPATION_STATUS),fHQ_TestDataManager.participationStatus, " Participation Status Label " + string);	
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(1),fHQ_TestDataManager.participationStatusValue, " Participation Status Label " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText("FSID"),"FSID"," FSID Label "+ string); 	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(1),"", " FSID Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("Participant",1),"Participant", " Participant Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForParticipant("parent"),"", " Participant Value "+ string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.RELATIONS_TO_PATIENT),fHQ_TestDataManager.relationsToPatient, " Relation to Patient Label " + string);	
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(2),fHQ_TestDataManager.relationToPatientValue2, " Relation to Patient Value " + string);
		MiscUtils.sleep(200);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.FIRST_NAME,1),fHQ_TestDataManager.firstName, " First Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(2),fHQ_TestDataManager.firstNameValueAdded, " First Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME,1),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(3),fHQ_TestDataManager.firstInitialOfLASTNameAdded, " First Initial of LAST Name Value Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.WAS_THIS_RELATIVE_ADOPTED,1),fHQ_TestDataManager.wasThisRelativeAdopted, " Was this relative adopted? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(3),fHQ_TestDataManager.relativeAdoptedValueSelected, "  Was this relative adopted? " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.YEAR_OF_BIRTH,1),fHQ_TestDataManager.yearOfBirth, " Year of Birth label" + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputYearOfBirth("parent"),fHQ_TestDataManager.yearOfBirthValueNV, " Year of Birth Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.VITAL_STATUS,1),fHQ_TestDataManager.vitalStatus, " Vital Status Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(4),fHQ_TestDataManager.vitalStatusValueAdded, " Vital Status Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH,1),fHQ_TestDataManager.sexAssignedAtBirth," Sex assigned at birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(6),fHQ_TestDataManager.sexAssignedAtBirthValueAdded, " Sex assigned at birth Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARTICIPANT_GENDER_IDENTITY,1), fHQ_TestDataManager.genderIdentity, " Gender Identity Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(7),fHQ_TestDataManager.genderIdentityValueAdded, " Gender Identity Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.IS_THIS_RELATIVE_A_TWIN_OR_PART_OF_A_MULTIPLE_BIRTH,1), fHQ_TestDataManager.isThisRelativeATwinOrPartOfAMultipleBirth, " Is this relative a twin or part of a multiple birth? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(8),fHQ_TestDataManager.twinOrPartOfAMultipleBirthValueAdded, " Is this relative a twin or part of a multiple birth? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARENT_TYPE_OF_BIRTH,1), fHQ_TestDataManager.typeOfBirth, " Type of birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(9),fHQ_TestDataManager.typeOfBirthValueAdded, " Type of birth Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("Has this relative ever had any miscarriages, stillbirths?",1),"Has this relative ever had any miscarriages, stillbirths?", "Has this relative ever had any miscarriages, stillbirths? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(10),fHQ_TestDataManager.hasThisRelativeEverHadAnyMiscarriagesOrStillbirthsValue, "  Has this relative ever had any miscarriages or stillbirths? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES,1),fHQ_TestDataManager.totalNumberOfMiscarriages," Total number of Miscarriages Label " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputTotalMiscarriages("parent"),fHQ_TestDataManager.totalNumberOfMiscarriagesValue, " Total number of Miscarriages Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS,1),fHQ_TestDataManager.totalNumberOfStillbirths," Total number of Stillbirths Label" + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputTotalStillbirths("parent"),fHQ_TestDataManager.totalNumberOfStillbirthsValue, " Total number of Stillbirths Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_BEEN_DIAGNOSED_WITH_A_RASOPATHY,1), fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathy, " Has this relative ever been diagnosed with a RASopathy? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(11),fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathyValue, "  Has this relative ever been diagnosed with a RASopathy? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_CANCER,1), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancer, " Has this relative ever been diagnosed with cancer? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(12),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancerValue, "  Has this relative ever been diagnosed with cancer? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_BENIGN_TUMOR,1), "Has this relative ever been diagnosed with a benign tumor?", " Has this relative ever been diagnosed with a Benign Tumor? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForInputBenignTumor("parent"),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithABenignTumorValue, "  Has this relative ever been diagnosed with a Benign Tumor? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_ANY_MEDICAL_CONDITIONS,1 ), "Has this relative ever been diagnosed with any medical conditions?", " Has this relative ever been diagnosed with any medical conditions? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(13),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelowValue, "  Has this relative ever been diagnosed with any medical conditions? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.IS_THERE_ANYTHING_ELSE_YOU_WOULD_LIKE_US_TO_KNOW_ABOUT_THIS_RELATIVE,1),fHQ_TestDataManager.isThereAnythingElseYouWouldLikeUsToKnowAboutThisRelative," Is there anything else you would like us to know about this relative? Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, FHQSubmissionPage.nVParentAnythingElseValue,fHQ_TestDataManager.addAdditionalInformation, " Is there anything else you would like us to know about this relative? Value "+ string); 
	}	
	/* ************** GRANDCHILDREN ASSERTION IN NATIVE VIEW *************** */
	public static void grandChildrenFHQInformationAssertions (String string) {
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("Grandchildren (8)"));
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForAddedRelatives(fHQ_TestDataManager.firstNameValue,fHQ_TestDataManager.yearOfBirthValueNV));
		MiscUtils.sleep(200);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPATION_STATUS),fHQ_TestDataManager.participationStatus, " Participation Status Label " + string);	
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(1),fHQ_TestDataManager.participationStatusValue, " Participation Status Label " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText("FSID"),"FSID"," FSID Label "+ string); 	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(1),"", " FSID Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("Participant",1),"Participant", " Participant Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForParticipant("child"),"", " Participant Value "+ string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText("Parent of this relative"),fHQ_TestDataManager.parentOfThisRelative, " Parent of this relative Label " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput("Parent of this relative"),fHQ_TestDataManager.parentOfThisRelativeValue, "  Parent of this relative Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.FIRST_NAME,1),fHQ_TestDataManager.firstName, " First Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(3),fHQ_TestDataManager.firstNameValue, " First Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME,1),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(4),fHQ_TestDataManager.firstInitialOfLASTNameValue, " First Initial of LAST Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.YEAR_OF_BIRTH,1),fHQ_TestDataManager.yearOfBirth, " Year of Birth label" + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputYearOfBirth("child"),fHQ_TestDataManager.yearOfBirthValueNV, " Year of Birth Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.VITAL_STATUS,1),fHQ_TestDataManager.vitalStatus, " Vital Status Label" + string);
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(3),fHQ_TestDataManager.vitalStatusValue, " Vital Status Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH,1),fHQ_TestDataManager.sexAssignedAtBirth," Sex assigned at birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(5),fHQ_TestDataManager.sexAssignedAtBirthValueAdded, " Sex assigned at birth Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARTICIPANT_GENDER_IDENTITY,1), fHQ_TestDataManager.genderIdentity, " Gender Identity Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(6),fHQ_TestDataManager.genderIdentityValueAdded, " Gender Identity Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.WHICH_BEST_DESCRIBES_THIS_RELATIVE,1), fHQ_TestDataManager.whichBestDescribesThisRelative, " Which best describes this relative? label in Child Form ");
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(7),fHQ_TestDataManager.whichBestDescribesThisRelativeSelected, " Which best describes this relative? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.IS_THIS_RELATIVE_A_TWIN_OR_PART_OF_A_MULTIPLE_BIRTH,1), fHQ_TestDataManager.isThisRelativeATwinOrPartOfAMultipleBirth, " Is this relative a twin or part of a multiple birth? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(9),fHQ_TestDataManager.twinOrPartOfAMultipleBirthValueAdded, " Is this relative a twin or part of a multiple birth? Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARENT_TYPE_OF_BIRTH,1), fHQ_TestDataManager.typeOfBirth, " Type of birth Label " + string);	
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(10),fHQ_TestDataManager.typeOfBirthValueAdded, " Type of birth? Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("Has this relative ever had any miscarriages, stillbirths?",1),"Has this relative ever had any miscarriages, stillbirths?"," Has this relative ever had any miscarriages, stillbirths? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(11),fHQ_TestDataManager.hasThisRelativeEverHadAnyMiscarriagesOrStillbirthsValue, "  Has this relative ever had any miscarriages or stillbirths? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES,1),fHQ_TestDataManager.totalNumberOfMiscarriages," Total number of Miscarriages Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputTotalMiscarriages("child"),fHQ_TestDataManager.totalNumberOfMiscarriagesValue, " Total number of Miscarriages Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS,1),fHQ_TestDataManager.totalNumberOfStillbirths," Total number of Stillbirths Label "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputTotalStillbirths("child"),fHQ_TestDataManager.totalNumberOfStillbirthsValue, " Total number of Stillbirths Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_BEEN_DIAGNOSED_WITH_A_RASOPATHY,1), fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathy, " Has this relative ever been diagnosed with a RASopathy? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(12),fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathyValue, "  Has this relative ever been diagnosed with a RASopathy? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_CANCER,1), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancer, "Has this relative ever been diagnosed with cancer? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(13),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancerValue, "  Has this relative ever been diagnosed with cancer? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_BENIGN_TUMOR,1), "Has this relative ever been diagnosed with a benign tumor?", " Has this relative ever been diagnosed with a Benign Tumor? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForInputBenignTumor("child"),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithABenignTumorValue, "  Has this relative ever been diagnosed with a Benign Tumor? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_ANY_MEDICAL_CONDITIONS,1 ), "Has this relative ever been diagnosed with any medical conditions?", " Has this relative ever been diagnosed with any medical conditions? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(15),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelowValue, " Has this relative ever been diagnosed with any medical conditions? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HOW_MANY_TOTAL_CHILDREN_ALIVE_AND_DECEASED_HAS_THIS_RELATIVE_HAD,1),"How many total children (alive and deceased) has this relative had?"," How many total children (alive and deceased) has this relative had? Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputTotalChildren("child"),fHQ_TestDataManager.howManyTotalChildrenAliveAndDeceasedHasThisRelaiveHadSelected," How many total children (alive and deceased) has this relative had? Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.IS_THERE_ANYTHING_ELSE_YOU_WOULD_LIKE_US_TO_KNOW_ABOUT_THIS_RELATIVE,1),fHQ_TestDataManager.isThereAnythingElseYouWouldLikeUsToKnowAboutThisRelative," Is there anything else you would like us to know about this relative? Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, FHQSubmissionPage.nVChildAnythingElseValue,fHQ_TestDataManager.addAdditionalInformation, " Is there anything else you would like us to know about this relative? Value "+ string); 	
	}
	/* ************** COUSIN ASSERTION IN NATIVE VIEW *************** */
	public static void cousinFHQInformationAssertions (String string) {
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForRelativeTab(10));
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForAddedRelatives(fHQ_TestDataManager.firstNameValue,fHQ_TestDataManager.yearOfBirthValueNV));
		MiscUtils.sleep(200);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPATION_STATUS),fHQ_TestDataManager.participationStatus, " Participation Status Label " + string);	
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(1),fHQ_TestDataManager.participationStatusValue, " Participation Status Label " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText("FSID"),"FSID"," FSID Label "+ string); 	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(1),"", " FSID Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("Participant",1),"Participant", " Participant Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForParticipant("child"),"", " Participant Value "+ string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText("Parent of this relative"),fHQ_TestDataManager.parentOfThisRelative, " Parent of this relative Label " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput("Parent of this relative"),fHQ_TestDataManager.parentOfThisRelativeValue, "  Parent of this relative Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.FIRST_NAME,1),fHQ_TestDataManager.firstName, " First Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(3),fHQ_TestDataManager.firstNameValue, " First Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME,1),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorInputTextBox(4),fHQ_TestDataManager.firstInitialOfLASTNameValue, " First Initial of LAST Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.YEAR_OF_BIRTH,1),fHQ_TestDataManager.yearOfBirth, " Year of Birth label" + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputYearOfBirth("child"),fHQ_TestDataManager.yearOfBirthValueNV, " Year of Birth Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.VITAL_STATUS,1),fHQ_TestDataManager.vitalStatus, " Vital Status Label" + string);
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(3),fHQ_TestDataManager.vitalStatusValue, " Vital Status Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH,1),fHQ_TestDataManager.sexAssignedAtBirth," Sex assigned at birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(5),fHQ_TestDataManager.sexAssignedAtBirthValueAdded, " Sex assigned at birth Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARTICIPANT_GENDER_IDENTITY,1), fHQ_TestDataManager.genderIdentity, " Gender Identity Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(6),fHQ_TestDataManager.genderIdentityValueAdded, " Gender Identity Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.WHICH_BEST_DESCRIBES_THIS_RELATIVE,1), fHQ_TestDataManager.whichBestDescribesThisRelative, " Which best describes this relative? label in Child Form ");
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(7),fHQ_TestDataManager.whichBestDescribesThisRelativeSelected, " Which best describes this relative? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.IS_THIS_RELATIVE_A_TWIN_OR_PART_OF_A_MULTIPLE_BIRTH,1), fHQ_TestDataManager.isThisRelativeATwinOrPartOfAMultipleBirth, " Is this relative a twin or part of a multiple birth? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(9),fHQ_TestDataManager.twinOrPartOfAMultipleBirthValueAdded, " Is this relative a twin or part of a multiple birth? Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.PARENT_TYPE_OF_BIRTH,1), fHQ_TestDataManager.typeOfBirth, " Type of birth Label " + string);	
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(10),fHQ_TestDataManager.typeOfBirthValueAdded, " Type of birth? Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan("Has this relative ever had any miscarriages, stillbirths?",1),"Has this relative ever had any miscarriages, stillbirths?"," Has this relative ever had any miscarriages, stillbirths? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(11),fHQ_TestDataManager.hasThisRelativeEverHadAnyMiscarriagesOrStillbirthsValue, "  Has this relative ever had any miscarriages or stillbirths? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES,1),fHQ_TestDataManager.totalNumberOfMiscarriages," Total number of Miscarriages Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputTotalMiscarriages("child"),fHQ_TestDataManager.totalNumberOfMiscarriagesValue, " Total number of Miscarriages Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS,1),fHQ_TestDataManager.totalNumberOfStillbirths," Total number of Stillbirths Label "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputTotalStillbirths("child"),fHQ_TestDataManager.totalNumberOfStillbirthsValue, " Total number of Stillbirths Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_BEEN_DIAGNOSED_WITH_A_RASOPATHY,1), fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathy, " Has this relative ever been diagnosed with a RASopathy? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(12),fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathyValue, "  Has this relative ever been diagnosed with a RASopathy? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_CANCER,1), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancer, "Has this relative ever been diagnosed with cancer? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(13),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancerValue, "  Has this relative ever been diagnosed with cancer? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_BENIGN_TUMOR,1), "Has this relative ever been diagnosed with a benign tumor?", " Has this relative ever been diagnosed with a Benign Tumor? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForInputBenignTumor("child"),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithABenignTumorValue, "  Has this relative ever been diagnosed with a Benign Tumor? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_ANY_MEDICAL_CONDITIONS,1 ), "Has this relative ever been diagnosed with any medical conditions?", " Has this relative ever been diagnosed with any medical conditions? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(15),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelowValue, " Has this relative ever been diagnosed with any medical conditions? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.HOW_MANY_TOTAL_CHILDREN_ALIVE_AND_DECEASED_HAS_THIS_RELATIVE_HAD,1),"How many total children (alive and deceased) has this relative had?"," How many total children (alive and deceased) has this relative had? Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForInputTotalChildren("child"),fHQ_TestDataManager.howManyTotalChildrenAliveAndDeceasedHasThisRelaiveHadSelected," How many total children (alive and deceased) has this relative had? Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorNormalizeSpaceSpan(FHQConstants.IS_THERE_ANYTHING_ELSE_YOU_WOULD_LIKE_US_TO_KNOW_ABOUT_THIS_RELATIVE,1),fHQ_TestDataManager.isThereAnythingElseYouWouldLikeUsToKnowAboutThisRelative," Is there anything else you would like us to know about this relative? Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, FHQSubmissionPage.nVChildAnythingElseValue,fHQ_TestDataManager.addAdditionalInformation, " Is there anything else you would like us to know about this relative? Value "+ string); 	
	}
	/* Assertions for the Paternal Grandmother Table VALUES on List View Page-CHECK */ 
	public static void grandParentsListViewTableValuesAssertionsOld(String string){
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,1), fHQ_TestDataManager.firstNameValue1, string + "First Name Value1 ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,2), fHQ_TestDataManager.firstInitialOfLASTNameValue1, string +  "First Initial of LAST Name Value1 ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,3), fHQ_TestDataManager.vitalStatusValue1, string + "Vital Status Value1 ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,4), fHQ_TestDataManager.yearOfBirthValue1, string + "Year of Birth Value1 ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,5), fHQ_TestDataManager.relationToPatientValue1, string + "Relation to Patient Value1 ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,1), fHQ_TestDataManager.firstNameValue2, string + "First Name Value2 ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,2), fHQ_TestDataManager.firstInitialOfLASTNameValue2, string + "First Initial of LAST Name Value2 ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,3), fHQ_TestDataManager.vitalStatusValue2, string + "Vital Status Value2 ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,4), fHQ_TestDataManager.yearOfBirthValue2, string + "Year of Birth Value2 ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,5), fHQ_TestDataManager.relationToPatientValue2, string + "Relation to Patient Value2 ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(3,1), fHQ_TestDataManager.firstNameValue3, string + "First Name Value3 ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(3,2), fHQ_TestDataManager.firstInitialOfLASTNameValue3, string + "First Initial of LAST Name Value3 ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(3,3), fHQ_TestDataManager.vitalStatusValue3, string + "Vital Status Value3 ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(3,4), fHQ_TestDataManager.yearOfBirthValue3, string + "Year of Birth Value3 ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(3,5), fHQ_TestDataManager.relationToPatientValue3, string + "Relation to Patient Value3 ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(4,1), fHQ_TestDataManager.firstNameValue4, string + "First Name Value4 ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(4,2), fHQ_TestDataManager.firstInitialOfLASTNameValue4, string + "First Initial of LAST Name Value4 ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(4,3), fHQ_TestDataManager.vitalStatusValue4, string + "Vital Status Value4 ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(4,4), fHQ_TestDataManager.yearOfBirthValue4, string + "Year of Birth Value4 ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(4,5), fHQ_TestDataManager.relationToPatientValue4, string + "Relation to Patient Value4 ");				
	}	
}
