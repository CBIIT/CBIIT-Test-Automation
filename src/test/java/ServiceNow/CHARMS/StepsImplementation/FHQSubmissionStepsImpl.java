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
import ServiceNow.CHARMS.Utils.CharmsUtil;
import appsCommon.PageInitializers.PageInitializer;

public class FHQSubmissionStepsImpl extends PageInitializer {
	static SoftAssert softAssert = new SoftAssert();	
	/* Method to submit a FHQ scenario */
	@SuppressWarnings("static-access")
	public static void scenarioSelectorForFHQ(String sheetName) {
		if(sheetName.contentEquals("Participant")) {
			fHQ_TestDataManager.dataInitializerFHQ(sheetName);
			fHQSubmissionStepsImpl.fhqParticipantSubmissionScenario1();
		}
		if(sheetName.contentEquals("Partner")) {
			fHQ_TestDataManager.dataInitializerFHQ(sheetName);
			fHQSubmissionStepsImpl.fhqPartnerSubmissionScenario1();
		}
		if(sheetName.contentEquals("Mother")) {
			fHQ_TestDataManager.dataInitializerFHQ(sheetName);
			fHQSubmissionStepsImpl.fhqMotherSubmissionScenario1();
		}
		if(sheetName.contentEquals("Father")) {
			fHQ_TestDataManager.dataInitializerFHQ(sheetName);
			fHQSubmissionStepsImpl.fhqFatherSubmissionScenario1();
		}
		if(sheetName.contentEquals("Children")) {
			fHQ_TestDataManager.dataInitializerFHQ(sheetName);
			fHQSubmissionStepsImpl.fhqChildrenSubmissionScenario1();
		}
		if(sheetName.contentEquals("Sibling")) {
			fHQ_TestDataManager.dataInitializerFHQ(sheetName);
			fHQSubmissionStepsImpl.fhqSiblingSubmissionScenario1();
		}
		if(sheetName.contentEquals("Aunt")) {
			fHQ_TestDataManager.dataInitializerFHQ(sheetName);
			fHQSubmissionStepsImpl.fhqAuntSubmissionScenario1();
		}
		if(sheetName.contentEquals("Uncle")) {
			fHQ_TestDataManager.dataInitializerFHQ(sheetName);
			fHQSubmissionStepsImpl.fhqUncleSubmissionScenario1();
		}
		if(sheetName.contentEquals("NieceNephew")) {
			fHQ_TestDataManager.dataInitializerFHQ(sheetName);
			fHQSubmissionStepsImpl.fhqNieceNephewSubmissionScenario1();
		}
		if(sheetName.contentEquals("MaternalGrandMother")) {
			fHQ_TestDataManager.dataInitializerFHQ(sheetName);
			fHQSubmissionStepsImpl.fhqMaternalGrandMotherSubmissionScenario1();
		}
		if(sheetName.contentEquals("MaternalGrandFather")) {
			fHQ_TestDataManager.dataInitializerFHQ(sheetName);
			fHQSubmissionStepsImpl.fhqMaternalGrandFatherSubmissionScenario1();
		}
		if(sheetName.contentEquals("PaternalGrandMother")) {
			fHQ_TestDataManager.dataInitializerFHQ(sheetName);
			fHQSubmissionStepsImpl.fhqPaternalGrandMotherSubmissionScenario1();
		}
		if(sheetName.contentEquals("PaternalGrandFather")) {
			fHQ_TestDataManager.dataInitializerFHQ(sheetName);
			fHQSubmissionStepsImpl.fhqPaternalGrandFatherSubmissionScenario1();
		}
		if(sheetName.contentEquals("GrandChildren")) {
			fHQ_TestDataManager.dataInitializerFHQ(sheetName);
			fHQSubmissionStepsImpl.fhqGrandChildrenSubmissionScenario1();
		}
		if(sheetName.contentEquals("Cousin")) {
			fHQ_TestDataManager.dataInitializerFHQ(sheetName);
			fHQSubmissionStepsImpl.fhqCousinSubmissionScenario1();		
		}
	}
	/***************************************************/
			/* PARTICIPANT FORM IN PORTAL */
	/**************************************************/
	public static void fhqParticipantSubmissionScenario1() {
		bannerAssertionsForParticipantForm();
		participantBasicInformationSubmissionsAndAssertions();
		participantChildQuestionsSubmissionsAndAssertions();	
		assertMRVSTable(1);
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Child"));
		addChildRowInMRVSPage();			
		assertChildRowAddedInMRVSTableForParticipant(1);
		participantPartnerQuestionsSubmissionsAndAssertions();
		assertMRVSTable(2);
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Partner"));
		addPartnerRowInMRVSPage();
		assertPartnerRowAddedInMRVSTableForParticipant(2);
		participantSiblingQuestionsSubmissionsAndAssertions();
		assertSiblingMRVSTable();
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Siblings"));
		addSiblingRowInMRVSPageForParticipant();
		assertSiblingRowAddedInMRVSTableForParticipant(3);
		otherInformationForParticipant();
		finalSubmissionSteps();
		softAssert.assertAll();		
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
		miscarriagesOrStillbirthsQuestionsSubmissionsAndAssertions(14," Mother ");
		rASopathyQuestionsSubmissionsAndAssertions(17," in Mother Form ");
		cancerQuestionsSubmissionsAndAssertions(18," in Mother Form ");
		medicalConditionQuestionsSubmissionsAndAssertions(19," in Mother Form ");
		siblingzSubmissionsAndAssertionsForParent(" in Mother Form ");
		otherInformation();
		finalSubmissionSteps();	
		softAssert.assertAll();			
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
		rASopathyQuestionsSubmissionsAndAssertions(17," In Father Form ");
		cancerQuestionsSubmissionsAndAssertions(18," In Father Form ");
		medicalConditionQuestionsSubmissionsAndAssertions(19," In Father Form ");
		siblingzSubmissionsAndAssertionsForParent(" In Father Form ");
		otherInformation();
		finalSubmissionSteps();
		softAssert.assertAll();
	}
	/***************************************************/
			/* CHILDREN FORM IN PORTAL */
	/*************************************************/
	public static void fhqChildrenSubmissionScenario1() {
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
		medicalConditionQuestionnaireForChild();
		childQuestionnaireForChild(19);
		assertChildrenBannerInMRVSTable(1);		
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Child"));
		addChildRowInMRVSPage();			
		assertChildRowAddedInMRVSTable(4);
		otherInformation();
		finalSubmissionSteps();
		softAssert.assertAll();
	}
	/*************************************************/
			/* SIBLING FORM IN PORTAL */
	/**************************************************/
	public static void fhqSiblingSubmissionScenario1() {
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
		medicalConditionQuestionnaireForSibling();
		childQuestionnaireForSibling(18);
		assertChildrenBannerInMRVSTable(1);		
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Child"));
		addChildRowInMRVSPage();			
		assertChildRowAddedInMRVSTable(4);
		otherInformation();
		finalSubmissionSteps();
		softAssert.assertAll();		
	}
	/******************************************************/
			/* AUNT FORM IN PORTAL */
	/******************************************************/
	public static void fhqAuntSubmissionScenario1() {
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("Aunt/Uncle"));	
		commonFamilyFieldsInListViewPageAssertions();
		auntUncleListViewTableAssertions();
		auntUncleListViewTableValuesAssertions();
	//	CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingAnchorTag2(fHQ_TestDataManager.auntUncleFirstNameValue2,1));
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButtonUsingText(FHQConstants.FIRST_NAME,1));
		assertFamilyFormBanners();
		auntUncleBasicInformationSubmissionsAndAssertions();
		twinOrMultipleBirthQuestionsForAuntUncle();
		miscarriagesOrStillbirthsSubmissionAndAssertionsForAuntUncle();
		rASopathyQuestionnaireForAuntUncle();
		cancerQuestionnaireForAuntUncle();
		medicalConditionQuestionnaireForAuntUncle();	
		childQuestionnaireForAuntUncle(18);
		assertChildrenBannerInMRVSTable(1);		
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Child"));
		addChildRowInMRVSPage();			
		assertChildRowAddedInMRVSTable(4);
		otherInformation();
		finalSubmissionSteps();
		softAssert.assertAll();
	}
	/******************************************************/
			/* UNCLE FORM IN PORTAL */
	/******************************************************/
	public static void fhqUncleSubmissionScenario1() {
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("Aunt/Uncle"));	
		commonFamilyFieldsInListViewPageAssertions();
		auntUncleListViewTableAssertions();
		auntUncleListViewTableValuesAssertions();
		//CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingAnchorTag2(fHQ_TestDataManager.auntUncleFirstNameValue2,1));
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButtonUsingText(FHQConstants.FIRST_NAME,2));
		assertFamilyFormBanners();
		auntUncleBasicInformationSubmissionsAndAssertions();
		twinOrMultipleBirthQuestionsForAuntUncle();
		miscarriagesOrStillbirthsSubmissionAndAssertionsForAuntUncle();
		rASopathyQuestionnaireForAuntUncle();
		cancerQuestionnaireForAuntUncle();
		medicalConditionQuestionnaireForAuntUncle();	
		childQuestionnaireForAuntUncle(18);
		assertChildrenBannerInMRVSTable(1);		
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Child"));
		addChildRowInMRVSPage();			
		assertChildRowAddedInMRVSTable(4);
		otherInformation();
		finalSubmissionSteps();
		softAssert.assertAll();
	}
	/****************************************************/
			/*  NIECE/NEPHEW FORM IN PORTAL */
	/*****************************************************/
	public static void fhqNieceNephewSubmissionScenario1() {
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("Niece/Nephew"));	
		FHQSubmissionStepsImpl.commonFamilyFieldsInListViewPageAssertions();
		FHQSubmissionStepsImpl.nieceNephewListViewTableAssertions();
		FHQSubmissionStepsImpl.nieceNephewListViewTableValuesAssertion();
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButtonUsingText(FHQConstants.FIRST_NAME));
		FHQSubmissionStepsImpl.assertFamilyFormBanners();
		FHQSubmissionStepsImpl.nieceNephewBasicInformationSubmissionsAndAssertions();
		FHQSubmissionStepsImpl.twinOrMultipleBirthQuestionsForNieceNephew();
		FHQSubmissionStepsImpl.miscarriagesOrStillbirthsSubmissionAndAssertionsForNieceNephew();	
		FHQSubmissionStepsImpl.rASopathyQuestionnaireForNieceNephew();		
		FHQSubmissionStepsImpl.cancerQuestionnaireForNieceNephew();
		FHQSubmissionStepsImpl.medicalConditionQuestionnaireForNieceNephew();
		FHQSubmissionStepsImpl.childQuestionnaireForNieceNephew(19);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.OTHER),fHQ_TestDataManager.other," Other Label in Child Form");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.IS_THERE_ANYTHING_ELSE_YOU_WOULD_LIKE_US_TO_KNOW_ABOUT_THIS_RELATIVE),fHQ_TestDataManager.isThereAnythingElseYouWouldLikeUsToKnowAboutThisRelative," Is there anything else you would like us to know about this relative? Label in Child Form ");
		CharmsUtil.sendKeysToElement(fHQSubmissionPage.addOtherInformationForRelativeTextBox, fHQ_TestDataManager.addAdditionalInformation);
		FHQSubmissionStepsImpl.finalSubmissionSteps();	
		softAssert.assertAll();
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
		medicalConditionQuestionsSubmissionsAndAssertions(19," in Maternal Grandmother ");
		otherInformation();
		finalSubmissionSteps();
		softAssert.assertAll();
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
		medicalConditionQuestionsSubmissionsAndAssertions(19," in Maternal Grandfather ");
		otherInformation();
		finalSubmissionSteps();
		softAssert.assertAll();
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
		medicalConditionQuestionsSubmissionsAndAssertions(19," in Paternal Grandmother ");
		otherInformation();
		finalSubmissionSteps();
		softAssert.assertAll();
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
		medicalConditionQuestionsSubmissionsAndAssertions(19," in Maternal Grandmother ");
		otherInformation();
		finalSubmissionSteps();
		softAssert.assertAll();
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
		medicalConditionQuestionsSubmissionsAndAssertions(18," in GrandChild Form ");
		questionsForChildSubmissionsAndAssertions(19," in GrandChild Form ");
		otherInformation();
		finalSubmissionSteps();
		softAssert.assertAll();
	}
	/*************************************************/
			/*  COUSIN FORM IN PORTAL */
	/*************************************************/
	public static void fhqCousinSubmissionScenario1(){
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("Cousins"));	
		commonFamilyFieldsInListViewPageAssertions();
		cousinListViewTableLabelsAssertions();
		cousinListViewTableValuesAssertions();
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButtonUsingText(FHQConstants.FIRST_NAME,2));
		
		//CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButtonUsingText(FHQConstants.FIRST_NAME));
		assertFamilyFormBanners();
		cousinBasicInformationSubmissionsAndAssertions();
		twinOrMultipleBirthQuestionsSubmissionsAndAssertions(11," in Cousin Form ");
		miscarriagesOrStillbirthsQuestionsSubmissionsAndAssertions(13," in Cousin Form ");
		rASopathyQuestionsSubmissionsAndAssertions(16," in Cousin Form ");
		cancerQuestionsSubmissionsAndAssertions(17," in Cousin Form ");
		medicalConditionQuestionsSubmissionsAndAssertions(18," in Cousin Form ");
		questionsForChildSubmissionsAndAssertions(19," in Cousin Form ");
		otherInformation();
		finalSubmissionSteps();
		softAssert.assertAll();
	}
	/* ****** METHOD FOR FHQ SCENARIO-1 ASSERTIONS ********* */	
	public static void scenarioAssertionForFHQ(String sheetName) {
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
		if(sheetName.contentEquals("AuntUncle")) {
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
	/* Method to Login to RAS Study Page */
	public static void loginToRASStudyPage(String username, String password) {
		CommonUtils.waitForVisibility(myRASLoginPage.loginToMyRASButton);
		CharmsUtil.clickOnElement(myRASLoginPage.loginToMyRASButton);
		CharmsUtil.sendKeysToElement(oktaLoginPage.usernameTxtBox, username);
		CharmsUtil.sendKeysToElement(oktaLoginPage.passwordTxtBox, password);
		CommonUtils.waitForVisibility(oktaLoginPage.loginBtn);
		CharmsUtil.clickOnElement(oktaLoginPage.loginBtn);
		CucumberLogUtils.logScreenshot();
		CommonUtils.waitForVisibility(oktaLoginPage.agreeBtn);
		CharmsUtil.clickOnElement(oktaLoginPage.agreeBtn);
	}
	/* Method to Login to FHQ MAIN Form Page */
	public static void loginToFHQPage() {
		CharmsUtil.clickOnElement(FHQSubmissionPage.familyHistoryQuestionnaireLink);
		MiscUtils.sleep(300);
		String header1 = "We know families come in different shapes and sizes. This survey is primarily meant to record health information on your biological (blood-related) relatives.";
		String header2 = "It's okay not to know information about some of your relatives. You will have a chance to tell us about any non-biological relatives you would like us to add to your family tree (for example, an adopted sibling or a step-parent) at the end of the survey.";
		String header3="Click here to start your family health questionnaire";
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.NCI_FAMILY_STUDIES_HUB_RASOPATHIES), "NCI Family Studies Hub: RASopathies"," NCI Family Studies Hub: RASopathies Label on FHQ Survey: ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.WE_KNOW_FAMILIES_COME_IN_DIFFERENT_SHAPES_AND_SIZES),header1," We know families come in different shapes and sizes. Label on the FHQ Survey: ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.ITS_OKAY_NOT_TO_KNOW_INFORMATION_ABOUT_SOME_OF_YOUR_RELATIVES),header2," It's okay not to know information about some of your relatives. Label on the FHQ Survey: ");		
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.CLICK_HERE_TO_START_YOUR_FAMILY_HEALTH_QUESTIONNAIRE), header3," Click here to start your family health questionnaire Label the FHQ Survey: ");
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.CLICK_HERE_TO_START_YOUR_FAMILY_HEALTH_QUESTIONNAIRE));
		softAssert.assertAll();
	}
	/* Method to land on FHQ Grid page */
	public static void loginToFHQGridPage() {
		CharmsUtil.clickOnElement(FHQSubmissionPage.familyHistoryQuestionnaireLink);
		MiscUtils.sleep(300);
		String header1 = "We know families come in different shapes and sizes. This survey is primarily meant to record health information on your biological (blood-related) relatives.";
		String header2 = "It's okay not to know information about some of your relatives. You will have a chance to tell us about any non-biological relatives you would like us to add to your family tree (for example, an adopted sibling or a step-parent) at the end of the survey.";
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.NCI_FAMILY_STUDIES_HUB_RASOPATHIES), "NCI Family Studies Hub: RASopathies"," NCI Family Studies Hub: RASopathies Label on FHQ Survey: ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.WE_KNOW_FAMILIES_COME_IN_DIFFERENT_SHAPES_AND_SIZES),header1," We know families come in different shapes and sizes. Label on the FHQ Survey: ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.ITS_OKAY_NOT_TO_KNOW_INFORMATION_ABOUT_SOME_OF_YOUR_RELATIVES),header2," It's okay not to know information about some of your relatives. Label on the FHQ Survey: ");		
		softAssert.assertAll();
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
	/* Method to Login to the FHQ list view in Native View */
	public static void loginToFHQPatientInNativeView() {
		CommonUtils.waitForVisibility(nativeViewHomePage.nativeViewFilterNavigator);
		CharmsUtil.clickOnElement(nativeViewHomePage.nativeViewFilterNavigator);
		CharmsUtil.sendKeysToElement(nativeViewHomePage.nativeViewFilterNavigator, "FHQ Application Menu");
		CommonUtils.waitForVisibility(FHQSubmissionPage.nVFHQApplicationMenuLink);
		//CharmsUtil.clickOnElement(FHQSubmissionPage.nVFHQApplicationMenuLink);
		fHQSubmissionPage.dynamicLocatorContainsText("Patient(s)").click();
		CommonUtils.waitForVisibility(fHQSubmissionPage.nVListViewiFrame);
		CommonUtils.switchToFrame(fHQSubmissionPage.nVListViewiFrame);
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicFHQPatientPreviewButtonLocator("sonikatestaccount sonikatestaccount"));
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingContainsNormalizeSpace("Open Record",1));				
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
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.NCI_FAMILY_STUDIES_HUB_RASOPATHIES), fHQ_TestDataManager.nCIFamilyStudiesHubRASopathies," NCI Family Studies Hub: RASopathies Label "); 
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FHQ_HOME), "FHQ Home", " FHQ Home Label ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.LIST_VIEW), fHQ_TestDataManager.listView, " List View Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FORM_VIEW), fHQ_TestDataManager.formView, " Form View Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.WE_KNOW_FAMILIES_COME_IN_DIFFERENT_SHAPES_AND_SIZES),fHQ_TestDataManager.weKnowFamiliesComeInDifferentShapesAndSizes, " We know families come in different shapes and sizes Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.ITS_OKAY_NOT_TO_KNOW_INFORMATION_ABOUT_SOME_OF_YOUR_RELATIVES),fHQ_TestDataManager.itsOkayNotToKnowInformationAboutSomeOfYourRelatives," okay not to know information about some of your relatives. Label ");		
	}
	/* Twin or part of a multiple birth? Questions */
	public static void twinOrMultipleBirthQuestionsSubmissionsAndAssertions(int i , String string){
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.IS_THIS_RELATIVE_A_TWIN_OR_PART_OF_A_MULTIPLE_BIRTH), fHQ_TestDataManager.isThisRelativeATwinOrPartOfAMultipleBirth, " Is this relative a twin or part of a multiple birth? Label" + string);
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(i),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.twinOrPartOfAMultipleBirthValueAdded);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARENT_TYPE_OF_BIRTH), fHQ_TestDataManager.typeOfBirth, " Type of birth Label" + string);
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(i+1),FHQConstants.TYPE_OF_BIRTH,fHQ_TestDataManager.typeOfBirthValueAdded);			
	}
	/* miscarriages or stillbirths? Questionnare */
	public static void miscarriagesOrStillbirthsQuestionsSubmissionsAndAssertions(int i,String string) {
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
		//CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.MEDICAL_HISTORY), fHQ_TestDataManager.medicalHistory, " Medical History Label" + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_BEEN_DIAGNOSED_WITH_A_RASOPATHY), fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathy, " Has this relative been diagnosed with a RASopathy? Label" + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.diagnosedWithRasopathyInformation, fHQ_TestDataManager.rASopathyHistoryBanner, " RASopathy History Banner" + string);	
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(i),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathyValue);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.diagnosedWithRasopathyAddButtonInfo,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachRASopathyThisRelativeHasHad, " Please select the 'Add' button below to add each RASopathy this relative has had. Label" + string);			
		FHQSubmissionStepsImpl.assertRasopathyBannerInMRVSTable(1);  //Assertions for 'Add RASopathy' Table			
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for RASopathy"));  //Click the Add button for RASopathy	
		FHQSubmissionStepsImpl.addRASopathyRowInMRVSPage();  //RASopathy MRVS page Assertions and Submission		
		FHQSubmissionStepsImpl.assertRASopathyRowAddedInMRVSTable(1);  //Assert the RASopathy Row added
	}
	/* RASopathy MRVS ADD page Assertions and Submissions */
	public static void  addRASopathyRowInMRVSPage() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.ADD_ROW),fHQ_TestDataManager.addRow, " Add Row label for child  in MRVS ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.RASOPATHY), fHQ_TestDataManager.rASopathy, " RASopathy Label in RASopathy MRVS Table ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocatorForDropDown(1),FHQConstants.RESOPATHY_TYPE,fHQ_TestDataManager.rASopathyOptionSelected);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PLEASE_PROVIDE_THE_YEAR_OF_DIAGNOSIS_OR_THE_AGE_OF_DIAGNOSIS),fHQ_TestDataManager.pleaseProvideTheYearOfDiagnosisOrTheAgeOfDiagnosis, " Please provide the year of diagnosis or the age of diagnosis Label in RASopathy MRVS ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocatorForDropDown(1),FHQConstants.YEAR_OR_AGE_OF_DIAGNOSIS,fHQ_TestDataManager.pleaseProvideTheYearOfDiagnosisOrTheAgeOfDiagnosisSelected);		
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorClassNormalizeSpace(FHQConstants.YEAR_OF_DIAGNOSIS),fHQ_TestDataManager.yearOfDiagnosis, " Year of diagnosis Label in RASopathy MRVS ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.yearOfBirthdateLabelBanner,fHQ_TestDataManager.anEstimatedDateIsPreferred, " An estimated date is preferred banner for Mother in Mother Form ");			
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocatorForDropDown(1),FHQConstants.yearOfBirthOrDeathAfter1900(),fHQ_TestDataManager.yearOfDiagnosisForRasopathySelected);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.ADDITIONAL_INFORMATION), fHQ_TestDataManager.additionalInformation, " Any Additional Information Added for the RASopathy Label "); 	
		CharmsUtil.sendKeysToElement(fHQSubmissionPage.dynamicLocatorTextBox("additional_information_ras"), fHQ_TestDataManager.additionalInformationAddedForRasopathy); 
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.CANCEL),fHQ_TestDataManager.cancel, " Cancel button label for RASopathy in MRVS ");
		CharmsUtil.assertButtonLabel(softAssert, FHQSubmissionPage.addRowSaveButton,fHQ_TestDataManager.add, " Add button label for RASopathy in MRVS ");
		CharmsUtil.clickOnElement(FHQSubmissionPage.addRowSaveButton);
	}
	/* Rasopathy MRVS Table headings Assertion */
	public static void  assertRasopathyBannerInMRVSTable(int i) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.RASOPATHY), fHQ_TestDataManager.rASopathy, " RASopathy Label in RASopathy MRVS Table ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("Add a row for RASopathy"),fHQ_TestDataManager.add," Add Label in RASopathy MRVS Table ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("Remove all rows for RASopathy"),fHQ_TestDataManager.removeAll," Remove All Label in RASopathy MRVS Table ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Actions", i),fHQ_TestDataManager.actions," Actions Label in RASopathy MRVS Table");		 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("RASopathy",i),fHQ_TestDataManager.rASopathy," 	RASopathy Label in RASopathy MRVS Table ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Specify other RASopathy", i),fHQ_TestDataManager.specifyOtherRASopathy, " Specify other RASopathy Label in RASopathy MRVS Table ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Please provide the year of diagnosis or the age of diagnosis", i),fHQ_TestDataManager.pleaseProvideTheYearOfDiagnosisOrTheAgeOfDiagnosis, " Please provide the year of diagnosis or the age of diagnosis Label in RASopathy MRVS Table ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Year of diagnosis", i),fHQ_TestDataManager.yearOfDiagnosis, " Year of diagnosis Label in RASopathy MRVS Table ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Age of diagnosis", i),fHQ_TestDataManager.ageOfDiagnosis, " Age of diagnosis Label in RASopathy MRVS Table ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Additional Information", i),fHQ_TestDataManager.additionalInformation, " Additional Information Label in RASopathy MRVS Table ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingContainsNormalizeSpace("No data to display", i),fHQ_TestDataManager.noDataToDisplay, " No data to display Label in RASopathy MRVS Table ");	 
	}
	/* RASopathy MRVS Added Row Assertions */
	public static void  assertRASopathyRowAddedInMRVSTable(int i) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingAnchorTag("Edit Row",i),"", " Edit Row for RASopathy label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingAnchorTag("Remove Row",i),"", " Remove Row for RASopathy label ");
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
	public static void  assertCancerBannerInMRVSTable(int i) {
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
	public static void  addCancerRowInMRVSPage() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.ADD_ROW),fHQ_TestDataManager.addRow, " Add Row label for child  in MRVS ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.CANCER), fHQ_TestDataManager.cancer, " Cancer Label in Cancer MRVS Table ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocatorForDropDown(1),FHQConstants.CANCER_TYPE,fHQ_TestDataManager.cancerOptionSelected);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PLEASE_PROVIDE_THE_YEAR_OF_DIAGNOSIS_OR_THE_AGE_OF_DIAGNOSIS),fHQ_TestDataManager.pleaseProvideTheYearOfDiagnosisOrTheAgeOfDiagnosis, " Please provide the year of diagnosis or the age of diagnosis Label in Cancer MRVS ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocatorForDropDown(1),FHQConstants.YEAR_OR_AGE_OF_DIAGNOSIS,fHQ_TestDataManager.pleaseProvideTheYearOfDiagnosisOrTheAgeOfDiagnosisSelected);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorClassNormalizeSpace(FHQConstants.YEAR_OF_DIAGNOSIS),fHQ_TestDataManager.yearOfDiagnosis, " Year of diagnosis Label in Cancer MRVS ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.yearOfBirthdateLabelBanner,fHQ_TestDataManager.anEstimatedDateIsPreferred, " An estimated date is preferred banner for Mother in Mother Form ");			
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocatorForDropDown(1),FHQConstants.yearOfBirthOrDeathAfter1900(),fHQ_TestDataManager.yearOfDiagnosisForCancerSelected);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.ADDITIONAL_INFORMATION), fHQ_TestDataManager.additionalInformation, " Any Additional Information Added for the Cancer Label "); 	
		CharmsUtil.sendKeysToElement(fHQSubmissionPage.dynamicLocatorTextBox("additional_information_cancer"), fHQ_TestDataManager.additionalInformationAddedForCancer); 
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.CANCEL),fHQ_TestDataManager.cancel, " Cancel button label for Cancer in MRVS ");
		CharmsUtil.assertButtonLabel(softAssert, FHQSubmissionPage.addRowSaveButton,fHQ_TestDataManager.add, " Add button label for Cancer in MRVS ");
		CharmsUtil.clickOnElement(FHQSubmissionPage.addRowSaveButton);
	}
	/* Cancer MRVS Added Row Assertions */
	public static void  assertCancerRowAddedInMRVSTable(int i) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingAnchorTag("Edit Row",i),"", " Edit Row for Cancer label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingAnchorTag("Remove Row",i),"", " Remove Row for Cancer label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(7),fHQ_TestDataManager.cancerOptionSelected, " Cancer Option Selected data ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(8),fHQ_TestDataManager.specifyOtherCancerSelected, " Specify other Cancer Selected data ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(9),fHQ_TestDataManager.pleaseProvideTheYearOfDiagnosisOrTheAgeOfDiagnosisSelected, " Please provide the year of diagnosis or the age of diagnosis for Cancer selected data  ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(10),fHQ_TestDataManager.yearOfDiagnosisForCancerSelected, " Year of diagnosis for Cancer selected data ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(11),fHQ_TestDataManager.ageOfDiagnosisForCancerSelected, " Age of diagnosis for Cancer selected data ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(12),fHQ_TestDataManager.additionalInformationAddedForCancer, " Additional Information added for Cancer data ");
	}
	/* MEDICAL CONDITIONS QUESTIONNAIRE Submissions and Assertions */
	public static void medicalConditionQuestionsSubmissionsAndAssertions(int i, String string) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_ANY_OF_THE_MEDICAL_CONDITIONS_LISTED_BELOW  ), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelow, " Has this relative ever been diagnosed with any of the medical conditions listed below? Label" + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingTitle(FHQConstants.MEDICAL_CONDITIONS_BANNER), fHQ_TestDataManager.medicalConditionsBanner, " Medical conditions Banner" + string);		
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(i),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelowValue);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.parentDiagnosedWithMedicalConditionsAddButtonInfo,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachMedicalConditionThisRelativeHasHad, " Please select the 'Add' button below to add each medical condition this relative has had.Label" + string);
		FHQSubmissionStepsImpl.assertMedicalConditionBannerInMRVSTable(3);  //Assertions for 'ADD Medical Condition' Table			
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Medical Condition(s)"));  //Click the Add button for Medical Condition
		FHQSubmissionStepsImpl.addMedicalConditionRowInMRVSPage();  //Medical Condition MRVS page Assertions and Submission	
		FHQSubmissionStepsImpl.assertMedicalConditionRowAddedInMRVSTable(3);
	}
	/* Medical Conditions MRVS Table headings Assertion */
	public static void  assertMedicalConditionBannerInMRVSTable(int i) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.MEDICAL_CONDITIONS), fHQ_TestDataManager.medicalConditions, " Medical Condition Label in Medical Condition MRVS Table ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("Add a row for Medical Condition(s)"),fHQ_TestDataManager.add," Add Label in Medical Condition MRVS Table ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("Remove all rows for Medical Condition(s)"),fHQ_TestDataManager.removeAll," Remove All Label in Medical Condition MRVS Table ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Actions", i),fHQ_TestDataManager.actions," Actions Label in Medical Condition MRVS Table");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Medical Condition",1),fHQ_TestDataManager.medicalCondition," Medical Condition Label in Medical Condition MRVS Table ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Specify medical condition", 1),fHQ_TestDataManager.specifyMedicalCondition, " Specify  Medical Condition Label in Medical Condition MRVS Table ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Please provide the year of diagnosis or the age of diagnosis", i),fHQ_TestDataManager.pleaseProvideTheYearOfDiagnosisOrTheAgeOfDiagnosis, " Please provide the year of diagnosis or the age of diagnosis Label in Cancer MRVS Table ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Year of diagnosis", i),fHQ_TestDataManager.yearOfDiagnosis, " Year of diagnosis Label in Medical Condition MRVS Table "); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Age of diagnosis", i),fHQ_TestDataManager.ageOfDiagnosis, " Age of diagnosis Label in Medical Condition MRVS Table ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingContainsNormalizeSpace("No data to display", i),fHQ_TestDataManager.noDataToDisplay, " No data to display Label in Medical Condition MRVS Table ");
	}
	/* Medical Condition MRVS ADD page Assertions and Submissions */
	public static void  addMedicalConditionRowInMRVSPage() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.ADD_ROW),fHQ_TestDataManager.addRow, " Add Row label for Medical Condition in MRVS ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants. MEDICAL_CONDITION), fHQ_TestDataManager.medicalCondition, " Medical Condition Label in Cancer MRVS Table ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocatorForDropDown(1),FHQConstants. MEDICAL_CONDITIONS_TYPE,fHQ_TestDataManager.medicalConditionOptionSelected);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants. SPECIFY_MEDICAL_CONDITION), fHQ_TestDataManager. specifyMedicalCondition, " Specify medical condition Label "); 
		CharmsUtil.sendKeysToElement(fHQSubmissionPage.dynamicLocatorTextBox("specify_other_med"), fHQ_TestDataManager.specifyOtherMedicalConditionSelected); 	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PLEASE_PROVIDE_THE_YEAR_OF_DIAGNOSIS_OR_THE_AGE_OF_DIAGNOSIS),fHQ_TestDataManager.pleaseProvideTheYearOfDiagnosisOrTheAgeOfDiagnosis, " Please provide the year of diagnosis or the age of diagnosis Label in Medical Condition MRVS ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocatorForDropDown(1),FHQConstants.YEAR_OR_AGE_OF_DIAGNOSIS,fHQ_TestDataManager.pleaseProvideTheYearOfDiagnosisOrTheAgeOfDiagnosisSelected);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorClassNormalizeSpace(FHQConstants.YEAR_OF_DIAGNOSIS),fHQ_TestDataManager.yearOfDiagnosis, " Year of diagnosis Label in Medical Condition MRVS ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.yearOfBirthdateLabelBanner,fHQ_TestDataManager.anEstimatedDateIsPreferred, " An estimated date is preferred banner ");			
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocatorForDropDown(1),FHQConstants.yearOfBirthOrDeathAfter1900(),fHQ_TestDataManager.yearOfDiagnosisForMedicalConditionSelected);		
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.CANCEL),fHQ_TestDataManager.cancel, " Cancel button label for Medical Condition in MRVS ");
		CharmsUtil.assertButtonLabel(softAssert, FHQSubmissionPage.addRowSaveButton,fHQ_TestDataManager.add, " Add button label for Medical Condition in MRVS ");
		CharmsUtil.clickOnElement(FHQSubmissionPage.addRowSaveButton);
	}
	/* Medical Condition MRVS Added Row Assertions */
	public static void  assertMedicalConditionRowAddedInMRVSTable(int i) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingAnchorTag("Edit Row",i),"", " Edit Row for Medical Condition label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingAnchorTag("Remove Row",i),"", " Remove Row for Medical Condition label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(13),fHQ_TestDataManager.medicalConditionOptionSelected, " Medical Condition Option Selected data ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(14),fHQ_TestDataManager.specifyOtherMedicalConditionSelected, " Specify Medical Condition Selected data ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(15),fHQ_TestDataManager.pleaseProvideTheYearOfDiagnosisOrTheAgeOfDiagnosisSelected, " Please provide the year of diagnosis or the age of diagnosis for Medical Condition selected data ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(16),fHQ_TestDataManager.yearOfDiagnosisForMedicalConditionSelected, " Year of diagnosis for Medical Condition selected data ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(17),fHQ_TestDataManager.ageOfDiagnosisForMedicalConditionSelected, " Age of diagnosis for Medical Condition selected data ");
	}
	/* OTHER INFORMATION Added */
	public static void otherInformation() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.OTHER),fHQ_TestDataManager.other," Other Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.IS_THERE_ANYTHING_ELSE_YOU_WOULD_LIKE_US_TO_KNOW_ABOUT_THIS_RELATIVE),fHQ_TestDataManager.isThereAnythingElseYouWouldLikeUsToKnowAboutThisRelative," Is there anything else you would like us to know about this relative? Label ");
		CharmsUtil.sendKeysToElement(fHQSubmissionPage.addOtherInformationForRelativeTextBox, fHQ_TestDataManager.addAdditionalInformation);
	}
	/* Final Steps to submit any Family Relative Form */
	public static void finalSubmissionSteps() {	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.YOU_WILL_NOT_BE_ABLE_TO_MODIFY_THIS_RECORD_AFTER_YOU_SUBMIT),fHQ_TestDataManager.youWillNotBeAbleToModifyThisRecordAfterYouSubmit," You will not be able to modify this record after you submit. Label ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorByNameForButton("submit"),fHQ_TestDataManager.completeAndSubmit," Complete and Submit Button Label ");	 
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.COMPLETE_AND_SUBMIT));
	}
	/***********************************************************/
			/* METHODS FOR THE PARTICIPANT FORM */
	/**********************************************************/
	/* Banner Assertions on the Participant form */
	public static void bannerAssertionsForParticipantForm() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.NCI_FAMILY_STUDIES_HUB_RASOPATHIES), fHQ_TestDataManager.nCIFamilyStudiesHubRASopathies," NCI Family Studies Hub: RASopathies Label "); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FHQ_HOME), fHQ_TestDataManager.fHQHome, " FHQ Home Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FORM_VIEW), fHQ_TestDataManager.formView, " Form View Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.WE_KNOW_FAMILIES_COME_IN_DIFFERENT_SHAPES_AND_SIZES),fHQ_TestDataManager.weKnowFamiliesComeInDifferentShapesAndSizes, " We know families come in different shapes and sizes Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.ITS_OKAY_NOT_TO_KNOW_INFORMATION_ABOUT_SOME_OF_YOUR_RELATIVES),fHQ_TestDataManager.itsOkayNotToKnowInformationAboutSomeOfYourRelatives," okay not to know information about some of your relatives. Label ");		
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.YOU_ARE_CURRENTLY_FILLING_OUT_INFORMATION_FOR_THE_PARTICIPANT),fHQ_TestDataManager.youAreCurrentlyFillingOutInformationForTheParticipant, " You are currently filling out information for the participant. Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT), fHQ_TestDataManager.participant, " Header 6 on the FHQ Participant Form: ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.THIS_FORM_WILL_ASK_QUESTIONS_ABOUT_THE_PARTICIPANT_AND_THEIR_CHILDREN_AND_SIBLINGS),fHQ_TestDataManager.thisFormWillAskQuestionsAboutTheParticipantAndTheirChildrenAndSiblings, " This form will ask questions about the participant and their children and siblings. Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.IF_YOU_ARE_FILLING_OUT_THIS_FORM_FOR_YOURSELF_YOU_ARE_REFERRED_TO_AS_THE_PARTICIPANT),fHQ_TestDataManager.ifYouAreFillingOutThisFormForYourselfYouAreReferredToAsTheParticipant, " Header 8 on the FHQ Participant Form: ");
	}
	/* Participant filling the information for oneself */
	public static void participantBasicInformationSubmissionsAndAssertions() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PLEASE_INDICATE_YOUR_RELATIONSHIP_TO_THE_PARTICIPANT),"Please indicate your relationship to the participant.", " Please indicate your relationship to the participant. Label ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.fHQFieldDropDown,FHQConstants.RELATIONSHIP_TO_PARTICIPANT,fHQ_TestDataManager.pleaseIndicateYourRelationshipToTheParticipant);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.THE_FOLLOWING_QUESTIONS_ARE_ABOUT_THE_STUDY_PARTICIPANT),fHQ_TestDataManager.theFollowingQuestionsAreAboutTheStudyParticipant, " The following questions are about the study participant.Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH),"Sex assigned at birth"," Sex assigned at birth Label for Participant ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.fHQFieldDropDown1,FHQConstants.SEX_ASSIGNED_AT_BIRTH,fHQ_TestDataManager.sexAssignedAtBirth);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_GENDER_IDENTITY),"Gender Identity"," Gender Identity Label for Participant ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.fHQFieldDropDown1,FHQConstants.GENDER_IDENTITY,fHQ_TestDataManager.genderIdentity);	
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
	/* Participant's Children Questions Asked */
	public static void participantChildQuestionsSubmissionsAndAssertions() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HOW_MANY_TOTAL_CHILDREN_ALIVE_AND_DECEASED_HAS_THE_PARTICIPANT_HAD),"How many total children (alive and deceased) has the participant had?"," How many total children (alive and deceased) has the participant had? Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingTitle(FHQConstants.PLEASE_INCLUDE_LIVING_AND_DECEASED_CHILDREN),fHQ_TestDataManager.pleaseIncludeLivingAndDeceasedChildren," Please include living and deceased children. Label ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.fHQFieldDropDown1,FHQConstants.numberUpToN(20),fHQ_TestDataManager.howManyTotalChildrenAliveAndDeceasedHasTheParticipantHad);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.CHILD),fHQ_TestDataManager.child," Child Label ");		
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("Add a row for Child"),fHQ_TestDataManager.add," Add Label for child ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("Remove all rows for Child"),fHQ_TestDataManager.removeAll," Remove All Label for child ");		
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
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.ADD_ROW),fHQ_TestDataManager.addRow, " Add Row label for child  in MRVS ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstName, " First Name label for child  in MRVS ");
		CharmsUtil.sendKeysToElement(fHQSubmissionPage.dynamicLocatorForTextBox("first_name_child"), fHQ_TestDataManager.childfirstName);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label for child  in MRVS ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.fHQFieldDropDown,FHQConstants.firstInitialLastName(),fHQ_TestDataManager.childfirstInitialOfLASTName);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTICIPANT_VITAL_STATUS),fHQ_TestDataManager.vitalStatus, " Vital Status label for child  in MRVS ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.fHQFieldDropDown,FHQConstants.VITAL_STATUS_LIST,fHQ_TestDataManager.childvitalStatus);
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.CANCEL),fHQ_TestDataManager.cancel, " Cancel button label for child  in MRVS ");
		CharmsUtil.assertButtonLabel(softAssert, FHQSubmissionPage.addRowSaveButton,fHQ_TestDataManager.add, " Add button label for child  in MRVS ");
		CharmsUtil.clickOnElement(FHQSubmissionPage.addRowSaveButton);
	}
	/* Assert the Child Row added */
	public static void assertChildRowAddedInMRVSTableForParticipant(int i) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingAnchorTag("Edit Row",i),"", " Edit Row for child label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingAnchorTag("Remove Row",i),"", " Remove Row for child label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(i),fHQ_TestDataManager.childfirstName, " Child First Name data ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(i+1),fHQ_TestDataManager.childfirstInitialOfLASTName, " Child First Initial of LAST Name data ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(i+2),fHQ_TestDataManager.childvitalStatus, " Child Vital Status data ");				
	}
	/* Participant's Partner Questions Asked */
	public static void participantPartnerQuestionsSubmissionsAndAssertions() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HOW_MANY_TOTAL_DIFFERENT_PARTNERS_HAS_THE_PARTICIPANT_HAD_BIOLOGICAL_CHILDREN_WITH), "How many total different partners has the participant had biological children with?"," How many total different partners has the participant had biological children with? label ");		
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingTitle(FHQConstants.PLEASE_DO_NOT_COUNT_THEM_HERE),fHQ_TestDataManager.pleaseDoNotCountThemHere, " Please do not count them here. Label ");					
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.fHQFieldDropDown1,FHQConstants.numberUpToNStartingWithOne(10),fHQ_TestDataManager.howManyTotalDifferentPartnersHasTheParticipantHadBiologicalChildrenWith);
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
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingAnchorTag("Edit Row",2),"", " Edit Row for Partner ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingAnchorTag("Remove Row",2),"", " Remove Row for Partner ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(i+ 2),fHQ_TestDataManager.partnerfirstName, " First name of Partner Data ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(i+3),fHQ_TestDataManager.partnerfirstInitialOfLASTName, " First Initial of LAST Name of Partner Data");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(i+4),fHQ_TestDataManager.partnervitalStatus, " Vital Status of Partner Data ");
	}
	/* Participant's Siblings Question Asked */
	public static void participantSiblingQuestionsSubmissionsAndAssertions() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.WE_WOULD_LIKE_TO_ASK_YOU_SOME_QUESTIONS_ABOUT_SIBLINGS_DETAILS),fHQ_TestDataManager.weWouldLikeToAskYouSomeQuestionsAboutSiblingsDetails, " We would like to ask you some questions about Siblings details Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HOW_MANY_SIBLINGS_DOES_THE_PARTICIPANT_HAVE),"How many siblings does the participant have?", " How many siblings does the participant have? Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingTitle(FHQConstants.PLEASE_INCLUDE_ALL_FULL_AND_HALF_SIBLINGS),fHQ_TestDataManager.pleaseIncludeAllFullAndHalfSiblings, " Please include all full and half siblings Label ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.fHQFieldDropDown1,FHQConstants.numberUpToN(12),fHQ_TestDataManager.howManySiblingsDoesTheParticipantHave);
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
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingAnchorTag("Edit Row",i),"", " Edit Row for Sibling ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingAnchorTag("Remove Row",i),"", " Remove Row for Sibling  ");
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
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("FHQ Partners Context Menu"),"", " FHQ Partners Context Menu Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTNERS), fHQ_TestDataManager.partners, " Partners Label ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.newButtonLinkOnListView, fHQ_TestDataManager.addNewPartners, " Add New Partners button Label ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.rowsDetailsOnListView,fHQ_TestDataManager.theBlueHighlightedRowsRepresentTheIncompletedFamilyRecords, " The blue highlighted rows represent the incompleted family records Label "); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("First Name",1),fHQ_TestDataManager.firstName," First Name Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("First Initial of LAST Name", 1),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Vital Status", 1),fHQ_TestDataManager.vitalStatus, " Vital Status Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Year of Birth", 1),fHQ_TestDataManager.yearOfBirth, " Year of Birth Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Relation to patient", 1),fHQ_TestDataManager.relationToPatient, " Relation to patient Label ");		
	}
	/* Assertions for the Partner Table VALUES on List View Page */ 
	public static void partnerListViewTableValuesAssertions(){
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorForButtonUsingText(FHQConstants.FIRST_NAME), fHQ_TestDataManager.partnerFirstName, " Partner First Name Label ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorForButtonUsingText(FHQConstants.FIRST_INITIAL_OF_LAST_NAME), fHQ_TestDataManager.partnerFirstInitialOfLASTName, " Partner First Initial of LAST Name Label ");			
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorForButtonUsingText(FHQConstants.VITAL_STATUS), fHQ_TestDataManager.partnerVitalStatus, " Partner Vital Status Label ");	
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorForButtonUsingText(FHQConstants.YEAR_OF_BIRTH), fHQ_TestDataManager.partnerYearOfBirth, " Partner Year of Birth Label ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorForButtonUsingText(FHQConstants.RELATION_TO_PATIENT), fHQ_TestDataManager.partnerRelationToPatient, " Partner Relation to patient Label ");		
	}
	public static void partnerBasicInformationSubmissionsAndAssertions(){
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTNER),fHQ_TestDataManager.partner, " Partner Label ");		 			 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.YOU_ARE_CURRENTLY_FILLING_OUT_INFORMATION_FOR_THE_PARTICIPANTS_PARTNER),fHQ_TestDataManager.youAreCurrentlyFillingOutInformationForTheParticipantPartner, " You are currently filling out information for the participant's Partner. Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.shortDescriptionInformationBanner,fHQ_TestDataManager.pleaseProvideWhatInformationYouCanAboutThisPartner, " Please provide what information you can about this partner Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.CHILD_BASIC_INFORMATION),fHQ_TestDataManager.childBasicInformation, " Basic Information Label ");		 			 		 			 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.isThisYourCurrentPartnerLabel,fHQ_TestDataManager.isThisTheParticipantCurrentPartner, " Please provide what information you can about this partner Label ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.fHQFieldDropDown,FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.isThisTheParticipantCurrentPartnerValue);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstName, " First Name label for Partner in Partner Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForTextBox("first_name"),fHQ_TestDataManager.partnerFirstName, " First Name for Partner in Partner Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label of Partner in Partner Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDownValue(2),fHQ_TestDataManager.partnerFirstInitialOfLASTName, " First Initial of LAST Name Value of Partner in Partner Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirth, " Year of Birth label for Partner in Partner Form "); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.yearOfBirthdateLabelBanner,fHQ_TestDataManager.anEstimatedDateIsPreferred, " An estimated date is preferred banner for Partner in Partner Form ");		
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
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.newButtonLinkOnListView, fHQ_TestDataManager.addNewParents, " Add New Parents button Label in Parent List view page ");	
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
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,1), fHQ_TestDataManager.firstNameValue1, string + "First Name Value ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,2), fHQ_TestDataManager.firstInitialOfLASTNameValue1, string +  "First Initial of LAST Name Value ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,3), fHQ_TestDataManager.vitalStatusValue1, string + "Vital Status Value ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,4), fHQ_TestDataManager.yearOfBirthValue1, string + "Year of Birth Value ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,5), fHQ_TestDataManager.relationToPatientValue1, string + "Relation to Patient Value ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,1), fHQ_TestDataManager.firstNameValue2, string + "First Name Value ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,2), fHQ_TestDataManager.firstInitialOfLASTNameValue2, string + "First Initial of LAST Name Value ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,3), fHQ_TestDataManager.vitalStatusValue2, string + "Vital Status Value ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,4), fHQ_TestDataManager.yearOfBirthValue2, string + "Year of Birth Value ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(2,5), fHQ_TestDataManager.relationToPatientValue2, string + "Relation to Patient Value ");
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
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.yearOfBirthdateLabelBanner,fHQ_TestDataManager.anEstimatedDateIsPreferred, " An estimated date is preferred banner" + string);		
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
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorClassNormalizeSpace("Please include all full and half siblings, living and deceased. Please do not include miscarriages, stillbirths, or abortions. These will be collected elsewhere."), fHQ_TestDataManager.howManySiblingsDoesThisRelativeHaveBanner, " Sibling Banner Label" + string);
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator2ForDropDown(20),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.howManySiblingsDoesThisRelativeHaveValue);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.siblingAddButtonInfo,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachSiblingThisRelativeHas, " Please select the 'Add' button below to add each sibling this relative has. Label"+ string);			
		FHQSubmissionStepsImpl.assertSiblingBannerInMRVSTable(4, "in Father Form ");  //Assertions for 'ADD Sibling' Table	
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Siblings"));  //Click the Add button for Siblings
		FHQSubmissionStepsImpl.addSiblingRowInMRVSPage(" in Father Form ");  //Sibling MRVS page Assertions and Submission	
		FHQSubmissionStepsImpl.assertSiblingRowAddedInMRVSTable(4, " in Father Form ");
	}
	/***************************************************/
			/* CHILDREN FORM METHODS */
	/***************************************************/
	/* Assertions for the Child Table on List View Page   */
	public static void childListViewTableAssertions() {
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("FHQ Childs Context Menu"),"", " FHQ Childs Context Menu Label of child in List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.SONS_DAUGHTERS), fHQ_TestDataManager.sonsDaughters, " Sons/Daughters Label of child in List View Page ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.newButtonLinkOnListView, fHQ_TestDataManager.addNewSonsDaughters, " Add New Sons Daughters button Label of child in List View Page ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.rowsDetailsOnListView, fHQ_TestDataManager.theBlueHighlightedRowsRepresentTheIncompletedFamilyRecords, " The blue highlighted rows represent the incompleted family records Label of child in List View Page ");
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
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PLEASE_MAKE_SURE_YOU_HAVE_COMPLETED_ALL_PARTNER_RECORDS_BEFORE_COMPLETING_CHILDREN_RECORDS),fHQ_TestDataManager.pleaseMakeSureYouHaveCompletedAllPartnerRecordsBeforeCompletingChildrenRecords, " Please make sure you have completed all partner records before completing children records. Label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.CHILD_BASIC_INFORMATION),fHQ_TestDataManager.childBasicInformation, " Basic Information Label for Child in Child Form ");		 			 		 			 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstName, " First Name label for Child in Child Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForTextBox("first_name"),fHQ_TestDataManager.childFirstNameValue, " Child First Name Value in Child Form ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label for Child in Child Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocator3ForDropDown(1),fHQ_TestDataManager.childFirstInitialOfLASTNameValue,"");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirth, " Year of Birth label for Child in Child Form "); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.yearOfBirthdateLabelBanner1,fHQ_TestDataManager.anEstimatedDateIsPreferred, " An estimated date is preferred banner for Child in Child Form ");		
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(2),FHQConstants.yearOfBirthOrDeathAfter1900(),fHQ_TestDataManager.childYearOfBirthSelected);
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
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText("If the partner name is not visible in the dropdown"),fHQ_TestDataManager.partnerNameHelpBanner, "Partner Name Help Banner Label in Child Form "); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingTitle(FHQConstants.OTHER_BIOLOGICAL_PARENT_HELP_BANNER), fHQ_TestDataManager.otherBiologicalParentHelpBanner, " If you are not seeing any \"Other Biological parents\" available, please complete the associated partner record. label in Child Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.CHILD_OTHER_BIOLOGICAL_PARENT), fHQ_TestDataManager.otherBiologicalParent, " Other Biological Parent label in Child Form ");
		//Need to work		
		//	CharmsUtil.selectDropDownValue(fHQSubmissionPage.otherBiologicalParentDropdown,fHQ_TestDataManager.otherBiologicalParentSelected);	
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
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for RASopathy"));
		FHQSubmissionStepsImpl.addRASopathyRowInMRVSPage();		
		FHQSubmissionStepsImpl.assertRASopathyRowAddedInMRVSTable(1);
	}
	/* CANCER QUESTIONNAIRE For CHILD */
	public static void cancerQuestionnaireForChild() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_CANCER  ), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancer, " Has this relative ever been diagnosed with cancer? Label in Child Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(17),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancerValue);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.parentDiagnosedWithCancerAddButtonInfo,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachCancerThisRelativeHasHad, " Please select the 'Add' button below to add each cancer this relative has had. Label in Child Form ");	
		FHQSubmissionStepsImpl.assertCancerBannerInMRVSTable(2);		
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Cancer(s)")); 
		FHQSubmissionStepsImpl.addCancerRowInMRVSPage();
		FHQSubmissionStepsImpl.assertCancerRowAddedInMRVSTable(2);
	}
	/* MEDICAL CONDITIONS QUESTIONNAIRE For CHILD */
	public static void medicalConditionQuestionnaireForChild() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_ANY_OF_THE_MEDICAL_CONDITIONS_LISTED_BELOW  ), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelow, " Has this relative ever been diagnosed with any of the medical conditions listed below? Label in Child Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingTitle(FHQConstants.MEDICAL_CONDITIONS_BANNER), fHQ_TestDataManager.medicalConditionsBanner, " Medical conditions Banner ");		
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(18),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelowValue);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.parentDiagnosedWithMedicalConditionsAddButtonInfo,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachMedicalConditionThisRelativeHasHad, " Please select the 'Add' button below to add each medical condition this relative has had. Label in Child Form ");
		FHQSubmissionStepsImpl.assertMedicalConditionBannerInMRVSTable(3); 		
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Medical Condition(s)")); 
		FHQSubmissionStepsImpl.addMedicalConditionRowInMRVSPage();
		FHQSubmissionStepsImpl.assertMedicalConditionRowAddedInMRVSTable(3);
	}
	/* Children Questions Asked For CHILD */
	public static void childQuestionnaireForChild(int i) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HOW_MANY_TOTAL_CHILDREN_ALIVE_AND_DECEASED_HAS_THIS_RELATIVE_HAD),"How many total children (alive and deceased) has this relative had?"," How many total children (alive and deceased) has this relative had? Label in Child Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingTitle(FHQConstants.CHILD_BANNER),fHQ_TestDataManager.childBanner," Please include all biological children, living and deceased. Please do not include miscarriages, stillbirths, or abortions. These will be collected elsewhere. Label in Child Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(i),FHQConstants.numberUpToN(20),fHQ_TestDataManager.howManyTotalChildrenAliveAndDeceasedHasThisRelaiveHadSelected);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.childAddButtonInfo,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachChildThisRelativeHas, " Please select the 'Add' button below to add each child this relative has. Label in Child Form ");		
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.CHILD),fHQ_TestDataManager.child," Child Label ");
	}
	/****************************************************/
				/* SIBLING FORM METHODS */
	/*****************************************************/
	/* Assertions for the Sibling Table on List View Page   */
	public static void siblingListViewTableAssertions() {
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("FHQ Siblings Context Menu"),"", " FHQ Siblings Context Menu Label for Sibling in List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.SIBLINGS), fHQ_TestDataManager.siblings, " Siblings Label for Sibling in List View Page ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.newButtonLinkOnListView, fHQ_TestDataManager.addNewSiblings, " Add New Siblings button Label for Sibling in List View Page ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.rowsDetailsOnListView, fHQ_TestDataManager.theBlueHighlightedRowsRepresentTheIncompletedFamilyRecords, " The blue highlighted rows represent the incompleted family records Label for Sibling in List View Page ");
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
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.yearOfBirthdateLabelBanner1,fHQ_TestDataManager.anEstimatedDateIsPreferred, " An estimated date is preferred banner forfor Sibling in the Sibling Form ");		
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
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for RASopathy"));
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
	/* MEDICAL CONDITIONS QUESTIONNAIRE For SIBLING */
	public static void medicalConditionQuestionnaireForSibling() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_ANY_OF_THE_MEDICAL_CONDITIONS_LISTED_BELOW  ), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelow, " Has this relative ever been diagnosed with any of the medical conditions listed below? Label in Child Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingTitle(FHQConstants.MEDICAL_CONDITIONS_BANNER), fHQ_TestDataManager.medicalConditionsBanner, " Medical conditions Banner ");		
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(17),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelowValue);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.parentDiagnosedWithMedicalConditionsAddButtonInfo,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachMedicalConditionThisRelativeHasHad, " Please select the 'Add' button below to add each medical condition this relative has had. Label in Child Form ");
		FHQSubmissionStepsImpl.assertMedicalConditionBannerInMRVSTable(3);		
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Medical Condition(s)")); 
		FHQSubmissionStepsImpl.addMedicalConditionRowInMRVSPage();
		FHQSubmissionStepsImpl.assertMedicalConditionRowAddedInMRVSTable(3);
	}
	/* Sibling's Children Questions Asked */
	public static void childQuestionnaireForSibling(int i) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HOW_MANY_TOTAL_CHILDREN_ALIVE_AND_DECEASED_HAS_THIS_RELATIVE_HAD),"How many total children (alive and deceased) has this relative had?"," How many total children (alive and deceased) has this relative had? Label in Sibling Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingTitle(FHQConstants.CHILD_BANNER),fHQ_TestDataManager.childBanner," Please include all biological children, living and deceased. Please do not include miscarriages, stillbirths, or abortions. These will be collected elsewhere. Label in Sibling Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(i),FHQConstants.numberUpToN(20),fHQ_TestDataManager.howManyTotalChildrenAliveAndDeceasedHasThisRelaiveHadSelected);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.childAddButtonInfo1,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachChildThisRelativeHasHad, " Please select the 'Add' button below to add each child this relative has had. Label in Sibling Form ");		
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.CHILD),fHQ_TestDataManager.child," Child Label in SIbling Form ");
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
	//	CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.siblingNoDataToDisplay,fHQ_TestDataManager.noDataToDisplay, " No data to display Label in Medical Condition MRVS Table "+ string);
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
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingAnchorTag("Edit Row",i),"", " Edit Row for Sibling label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingAnchorTag("Remove Row",i),"", " Remove Row for Sibling label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(18),fHQ_TestDataManager.typesOfSiblingRelationSelected, " Types of Sibling Option Selected ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(19),fHQ_TestDataManager.siblingFirstNameValue, " First name of Sibling Value ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(20),fHQ_TestDataManager.siblingFirstInitialOfLastNameValue, " First Initial of LAST Name of Sibling  Value ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(21),fHQ_TestDataManager.siblingVitalStatusValue, " Vital Status of Sibling Value ");
	}		
	/*********************************************************/
				/* AUNT/UNCLE FORM METHODS */
	/********************************************************/
	/* Assertions for the AUNT/UNCLE Table on List View Page   */
	public static void auntUncleListViewTableAssertions() {
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("FHQ Aunt/Uncles Context Menu"),"", " FHQ Aunt/Uncles Context Menu Label for Aunt/Uncle in List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.AUNT_UNCLES), fHQ_TestDataManager.auntUncles, " Aunt/Uncles Label for Aunt/Uncles in List View Page ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.newButtonLinkOnListView, fHQ_TestDataManager.addNewauntUncles, " Add New Aunt/Uncles button Label for Aunt/Uncles in List View Page ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.rowsDetailsOnListView, fHQ_TestDataManager.theBlueHighlightedRowsRepresentTheIncompletedFamilyRecords, " The blue highlighted rows represent the incompleted family records Label for Aunt/Uncles in List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("First Name",1),fHQ_TestDataManager.firstName," First Name Label of Aunt/Uncles in List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("First Initial of LAST Name", 1),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name Label of Aunt/Uncles in List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Vital Status", 1),fHQ_TestDataManager.vitalStatus, " Vital Status Label of Aunt/Uncles in List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Year of Birth", 1),fHQ_TestDataManager.yearOfBirth, " Year of Birth Label of Aunt/Uncles in List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Relation to Patient", 1),fHQ_TestDataManager.relationsToPatient, " Relation to Patient Label of Aunt/Uncles in List View Page ");
	}
	/* Assertions for the AUNT/UNCLE Table VALUES on List View Page */
	public static void auntUncleListViewTableValuesAssertions() {
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
	/* Submissions and Assertions for the Basic Information of the AUNT/UNCLE */
	public static void auntUncleBasicInformationSubmissionsAndAssertions() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.AUNT_UNCLE),fHQ_TestDataManager.auntUncle, " Aunt/Uncle Label in the Aunt/Uncle Form ");		 			 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.AUNTS_UNCLES_DETAILS),fHQ_TestDataManager.auntsUnclesDetails, " Aunts/Uncles Details Label in the Aunt/Uncle Form ");		 			 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.auntUncleInformationBanner,fHQ_TestDataManager.auntUncleBanner, " Please enter one record per each family member for whom you have knowledge:Label in the Aunt/Uncle Form ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.relativeFillingInfoBanner,fHQ_TestDataManager.youAreCurrentlyFillingOutInformationForTheParticipantsAuntUncle, " You are currently filling out information for the participant's aunt/uncle.Label in the Aunt/Uncle Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.AUNT_UNCLE_BASIC_INFORMATION),fHQ_TestDataManager.auntUncleBasicInformation, " Basic Information Label in the Aunt/Uncle Form ");		 			 		 			 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstName, " First Name label for Aunt/Uncle in the Aunt/Uncle Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForTextBox("first_name"),fHQ_TestDataManager.auntUncleFirstNameValue, " Aunt/Uncle First Name Value in the Aunt/Uncle Form ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label for Aunt/Uncle in the Aunt/Uncle Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocator3ForDropDown(2),fHQ_TestDataManager.auntUncleFirstInitialOfLASTNameValue,"");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirth, " Year of Birth label for Aunt/Uncle in the Aunt/Uncle Form "); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.yearOfBirthdateLabelBanner1,fHQ_TestDataManager.anEstimatedDateIsPreferred, " An estimated date is preferred banner for Aunt/Uncle in the Aunt/Uncle Form ");		
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
		//CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PLEASE_IDENTIFY_THE_NUMBER_OF_EACH_OF_THE_FOLLOWING_PREGNANCY_RESULTS),fHQ_TestDataManager.pleaseIdentifyTheNumberOfEachOfTheFollowingPregnancyResults," Please identify the number of each of the following pregnancy results for this person. Label in Child Form ");	
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
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for RASopathy"));	
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
	/* MEDICAL CONDITIONS QUESTIONNAIRE For AUNT/UNCLE */
	public static void medicalConditionQuestionnaireForAuntUncle() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_ANY_OF_THE_MEDICAL_CONDITIONS_LISTED_BELOW  ), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelow, " Has this relative ever been diagnosed with any of the medical conditions listed below? Label in Child Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingTitle(FHQConstants.MEDICAL_CONDITIONS_BANNER), fHQ_TestDataManager.medicalConditionsBanner, " Medical conditions Banner ");		
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(17),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelowValue);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.parentDiagnosedWithMedicalConditionsAddButtonInfo,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachMedicalConditionThisRelativeHasHad, " Please select the 'Add' button below to add each medical condition this relative has had. Label in Child Form ");
		FHQSubmissionStepsImpl.assertMedicalConditionBannerInMRVSTable(3);			
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Medical Condition(s)"));
		FHQSubmissionStepsImpl.addMedicalConditionRowInMRVSPage();
		FHQSubmissionStepsImpl.assertMedicalConditionRowAddedInMRVSTable(3);
	}
	/* Children Questions Asked For AUNT/UNCLE */
	public static void childQuestionnaireForAuntUncle(int i) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HOW_MANY_TOTAL_CHILDREN_ALIVE_AND_DECEASED_HAS_THIS_RELATIVE_HAD),"How many total children (alive and deceased) has this relative had?"," How many total children (alive and deceased) has this relative had? Label in Sibling Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingTitle(FHQConstants.CHILD_BANNER),fHQ_TestDataManager.childBanner," Please include all biological children, living and deceased. Please do not include miscarriages, stillbirths, or abortions. These will be collected elsewhere. Label in Sibling Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(i),FHQConstants.numberUpToN(20),fHQ_TestDataManager.howManyTotalChildrenAliveAndDeceasedHasThisRelaiveHadSelected);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.childAddButtonInfo1,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachChildThisRelativeHasHad, " Please select the 'Add' button below to add each child this relative has had. Label in Sibling Form ");		
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.CHILD),fHQ_TestDataManager.child," Child Label in SIbling Form ");
	}
	/*********************************************************/
				/* NEICE/NEPHEW FORM METHODS */
	/********************************************************/
	/* Assertions for the Neice/Nephew Table on List View Page   */
	public static void nieceNephewListViewTableAssertions() {
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("FHQ Childs Context Menu"),"", " FHQ Childs Context Menu Label of Niece/Nephew in List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.NIECES_NEPHEWS), fHQ_TestDataManager.niecesNephews, " Nieces/Nephews Label of Niece/Nephew in List View Page ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.newButtonLinkOnListView, fHQ_TestDataManager.addNewNiecesNephews, " Add New Nieces Nephews button Label of Niece/Nephew in List View Page ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.rowsDetailsOnListView, fHQ_TestDataManager.theBlueHighlightedRowsRepresentTheIncompletedFamilyRecords, " The blue highlighted rows represent the incompleted family records Label of Niece/Nephew in List View Page ");
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
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PLEASE_MAKE_SURE_YOU_HAVE_COMPLETED_ALL_PARTNER_RECORDS_BEFORE_COMPLETING_CHILDREN_RECORDS),fHQ_TestDataManager.pleaseMakeSureYouHaveCompletedAllPartnerRecordsBeforeCompletingChildrenRecords, " Please make sure you have completed all partner records before completing children records. Label in the Niece/Nephew Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.NIECE_NEPHEW_BASIC_INFORMATION),fHQ_TestDataManager.nieceNephewBasicInformation, " Basic Information Label for Niece/Nephew in Niece/Nephew Form ");		 			 		 			 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstName, " First Name label for Niece/Nephew in Niece/Nephew Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForTextBox("first_name"),fHQ_TestDataManager.nieceNephewFirstNameValue, " Niece/Nephew First Name Value in Niece/Nephew Form ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label for Niece/Nephew in Niece/Nephew Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocator3ForDropDown(1),fHQ_TestDataManager.nieceNephewFirstInitialOfLASTNameValue," Niece/Nephew First Initial of LAST Name Value in Niece/Nephew Form ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirth, " Year of Birth label for Niece/Nephew in Niece/Nephew Form "); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.yearOfBirthdateLabelBanner1,fHQ_TestDataManager.anEstimatedDateIsPreferred, " An estimated date is preferred banner for Niece/Nephew in Niece/Nephew Form ");		
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
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.MEDICAL_HISTORY), fHQ_TestDataManager.medicalHistory, " Medical History Label in Child Form ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.HAS_THIS_RELATIVE_EVER_HAD_ANY_MISCARRIAGES_OR_STILLBIRTHS),fHQ_TestDataManager.hasThisRelativeEverHadAnyMiscarriagesOrStillbirths," Has this relative ever had any miscarriages or stillbirths? Label in Child Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(13),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasThisRelativeEverHadAnyMiscarriagesOrStillbirthsValue);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PLEASE_IDENTIFY_THE_NUMBER_OF_EACH_OF_THE_FOLLOWING_PREGNANCY_RESULTS),fHQ_TestDataManager.pleaseIdentifyTheNumberOfEachOfTheFollowingPregnancyResults," Please identify the number of each of the following pregnancy results for this person. Label in Child Form ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES),fHQ_TestDataManager.totalNumberOfMiscarriages," Total number of Miscarriages Label in Child Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.LESS_THAN_20_WEEKS_OF_PREGNANCY),fHQ_TestDataManager.lessThan20WeeksOfPregnancy," less than 20 weeks of pregnancy Label in Child Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(14),FHQConstants.numberUpToN(20),fHQ_TestDataManager.totalNumberOfMiscarriagesValue);
		MiscUtils.sleep(200);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS),fHQ_TestDataManager.totalNumberOfStillbirths," Total number of Stillbirths Label in Child Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.MORE_THAN_20_WEEKS_OF_PREGNANCY),fHQ_TestDataManager.moreThan20WeeksOfPregnancy," More than 20 weeks of pregnancy Label in Child Form  ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(15),FHQConstants.numberUpToN(20),fHQ_TestDataManager.totalNumberOfStillbirthsValue);
	}
	/* RASOPATHY QUESTIONNAIRE For Neice/Nephew */
	public static void rASopathyQuestionnaireForNieceNephew() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_BEEN_DIAGNOSED_WITH_A_RASOPATHY), fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathy, " Has this relative been diagnosed with a RASopathy? Label in Child Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.childDiagnosedWithRasopathyInformation, fHQ_TestDataManager.rASopathyHistoryBanner, " RASopathy History Banner Label in Child Form ");	
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(16),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasThisRelativeBeenDiagnosedWithARASopathyValue);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.parentDiagnosedWithRasopathyAddButtonInfo,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachRASopathyThisRelativeHasHad, " Please select the 'Add' button below to add each RASopathy this relative has had. Label in Child Form ");			
		FHQSubmissionStepsImpl.assertRasopathyBannerInMRVSTable(1);  //Assertions for 'Add RASopathy' Table			
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for RASopathy"));  //Click the Add button for RASopathy	
		FHQSubmissionStepsImpl.addRASopathyRowInMRVSPage();  //RASopathy MRVS page Assertions and Submission		
		FHQSubmissionStepsImpl.assertRASopathyRowAddedInMRVSTable(1);  //Assert the RASopathy Row added
	}
	/* CANCER QUESTIONNAIRE For Neice/Nephew */
	public static void cancerQuestionnaireForNieceNephew() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_CANCER  ), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancer, " Has this relative ever been diagnosed with cancer? Label in Child Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(17),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancerValue);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.parentDiagnosedWithCancerAddButtonInfo,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachCancerThisRelativeHasHad, " Please select the 'Add' button below to add each cancer this relative has had. Label in Child Form ");	
		FHQSubmissionStepsImpl.assertCancerBannerInMRVSTable(2);  //Assertions for 'ADD Cancer' Table			
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Cancer(s)"));  //Click the Add button for Cancer
		FHQSubmissionStepsImpl.addCancerRowInMRVSPage();  //Cancer MRVS page Assertions and Submission
		FHQSubmissionStepsImpl.assertCancerRowAddedInMRVSTable(2);  //Assert the Cancer Row added
	}
	/* MEDICAL CONDITIONS QUESTIONNAIRE For Neice/Nephew */
	public static void medicalConditionQuestionnaireForNieceNephew() {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_ANY_OF_THE_MEDICAL_CONDITIONS_LISTED_BELOW  ), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelow, " Has this relative ever been diagnosed with any of the medical conditions listed below? Label in Child Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingTitle(FHQConstants.MEDICAL_CONDITIONS_BANNER), fHQ_TestDataManager.medicalConditionsBanner, " Medical conditions Banner ");		
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(18),FHQConstants.YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER,fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelowValue);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.parentDiagnosedWithMedicalConditionsAddButtonInfo,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachMedicalConditionThisRelativeHasHad, " Please select the 'Add' button below to add each medical condition this relative has had. Label in Child Form ");
		FHQSubmissionStepsImpl.assertMedicalConditionBannerInMRVSTable(3);  //Assertions for 'ADD Medical Condition' Table			
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForButton("Add a row for Medical Condition(s)"));  //Click the Add button for Medical Condition
		FHQSubmissionStepsImpl.addMedicalConditionRowInMRVSPage();  //Medical Condition MRVS page Assertions and Submission	
		FHQSubmissionStepsImpl.assertMedicalConditionRowAddedInMRVSTable(3);
	}
	/* Children Questions Asked For Neice/Nephew */
	public static void childQuestionnaireForNieceNephew(int i) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HOW_MANY_TOTAL_CHILDREN_ALIVE_AND_DECEASED_HAS_THIS_RELATIVE_HAD),"How many total children (alive and deceased) has this relative had?"," How many total children (alive and deceased) has this relative had? Label in Child Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingTitle(FHQConstants.CHILD_BANNER),fHQ_TestDataManager.childBanner," Please include all biological children, living and deceased. Please do not include miscarriages, stillbirths, or abortions. These will be collected elsewhere. Label in Child Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(i),FHQConstants.numberUpToN(20),fHQ_TestDataManager.howManyTotalChildrenAliveAndDeceasedHasThisRelaiveHadSelected);
		//CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.childAddButtonInfo,fHQ_TestDataManager.pleaseSelectTheAddButtonBelowToAddEachChildThisRelativeHas, " Please select the 'Add' button below to add each child this relative has. Label in Child Form ");		
		//CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.CHILD),fHQ_TestDataManager.child," Child Label ");
	}
	/*********************************************************/
				/* GRANDPARENTS FORM METHODS */
	/********************************************************/
	/* Assertions for the GrandParent Table LABELS on List View Page  */
	public static void grandParentsListViewTableLabelsAssertions() {
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("FHQ Parents Context Menu"),"", " FHQ Grandparents Context Menu Label in Grandparent List view page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.GRANDPARENTS), fHQ_TestDataManager.grandParents, " Grandparents Label in Grandparent List view page ");	
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.newButtonLinkOnListView, fHQ_TestDataManager.addNewGrandParents, " Add New Grandparents button Label in Grandparent List view page ");	
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
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.yearOfBirthdateLabelBanner,fHQ_TestDataManager.anEstimatedDateIsPreferred, " An estimated date is preferred banner" + string);		
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
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("FHQ Childs Context Menu"),"", " FHQ Childs Context Menu Label in Grandchildren List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.GRANDCHILDREN), fHQ_TestDataManager.grandChildren, " Grandchildren Label in Grandchildren List View Page ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.newButtonLinkOnListView, fHQ_TestDataManager.addNewGrandChildren, " Add New Grandchildren button Label in Grandchildren List View Page ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.rowsDetailsOnListView, fHQ_TestDataManager.theBlueHighlightedRowsRepresentTheIncompletedFamilyRecords, " The blue highlighted rows represent the incompleted family records Label of child in List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.ALL), fHQ_TestDataManager.all, " All Label in Grandchildren List View Page  ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.RELATION_TO_PATIENT_GRANDCHILD), fHQ_TestDataManager.relationToPatientGrandChild, " Relation to patient = Grandchild Label in Grandchildren List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("First Name",1),fHQ_TestDataManager.firstName," First Name Label in Grandchildren List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("First Initial of LAST Name", 1),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name Label in Grandchildren List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Parent of this relative", 1),fHQ_TestDataManager.parentOfThisRelative, " Parent of this relative Label in Grandchildren List View Page ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Vital Status", 1),fHQ_TestDataManager.vitalStatus, " Vital Status Label in Grandchildren List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Year of Birth", 1),fHQ_TestDataManager.yearOfBirth, " Year of Birth Label in Grandchildren List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Relation to patient", 1),fHQ_TestDataManager.relationToPatient, " Relation to patient Label in Grandchildren List View Page  ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForBanner("Sex assigned at birth", 1),fHQ_TestDataManager.sexAssignedAtBirth, " Sex assigned at birth Label in Grandchildren List View Page ");
	}	
	/* Assertions for the GrandChildren Table VALUES on List View Page */ 
	public static void grandChildrenListViewTableValuesAssertions() {
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,1), fHQ_TestDataManager.firstNameValue, " First Name Value in Grandchildren List View Page ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,2), fHQ_TestDataManager.firstInitialOfLASTNameValue, " First Initial of LAST Name Value in Grandchildren List View Page ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,3), fHQ_TestDataManager.parentOfThisRelativeValue, " Parent of this relative Value in Grandchildren List View Page ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,4), fHQ_TestDataManager.vitalStatusValue, " Vital Status Value in Grandchildren List View Page ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,5), fHQ_TestDataManager.yearOfBirthValue, " Year of Birth Value in Grandchildren List View Page ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,6), fHQ_TestDataManager.relationToPatientValue, " Relation to Patient Value in Grandchildren List View Page ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,7), fHQ_TestDataManager.sexAssignedAtBirthValue, " Sex assigned at birth Value in Grandchildren List View Page ");
	}
	/* Basic Information Submissions and Assertions for the Grandchildren */
	public static void grandChildrenBasicInformationSubmissionsAndAssertions() {
		//CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.GRANDCHILDREN),fHQ_TestDataManager.grandChildren, " GrandChildren Label in GrandChildren Form ");		 			 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.YOU_ARE_CURRENTLY_FILLING_OUT_INFORMATION),fHQ_TestDataManager.youAreCurrentlyFillingOutInformation, " You are currently filling out information for the participant's maternal grandmother.Label in GrandChildren Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PLEASE_MAKE_SURE_YOU_HAVE_COMPLETED_ALL_PARTNER_RECORDS_BEFORE_COMPLETING_CHILDREN_RECORDS),fHQ_TestDataManager.pleaseMakeSureYouHaveCompletedAllPartnerRecordsBeforeCompletingChildrenRecords, " Please make sure you have completed all partner records before completing children records. Label in GrandChildren Form ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.CHILD_BASIC_INFORMATION),fHQ_TestDataManager.childBasicInformation, " Basic Information Label for Maternal grandmother in GrandChildren Form ");		 			 		 			 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstName, " First Name label for GrandChild in GrandChildren Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForTextBox("first_name"),fHQ_TestDataManager.firstNameValue, " GrandChild First Name Value in GrandChildren Form ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label for GrandChild in GrandChildren Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocator3ForDropDown(1),fHQ_TestDataManager.firstInitialOfLASTNameValue,"  First Initial of LAST Name Value for GrandChild in GrandChildren Form ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirth, " Year of Birth label for GrandChild in GrandChildren Form "); 	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.yearOfBirthdateLabelBanner1,fHQ_TestDataManager.anEstimatedDateIsPreferred, " An estimated date is preferred banner for Child in Child Form ");		
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(2),FHQConstants.yearOfBirthOrDeathAfter1900(),fHQ_TestDataManager.yearOfBirthValueAdded);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.VITAL_STATUS),fHQ_TestDataManager.vitalStatus, " Vital Status Label for GrandChild in GrandChildren Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocator3ForDropDown(3),fHQ_TestDataManager.vitalStatusValue, " Vital Status Value for GrandChild in GrandChildren Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH),fHQ_TestDataManager.sexAssignedAtBirth," Sex assigned at birth Label for GrandChild in GrandChildren Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(7),FHQConstants.SEX_ASSIGNED_AT_BIRTH,fHQ_TestDataManager.sexAssignedAtBirthValueAdded);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_GENDER_IDENTITY), fHQ_TestDataManager.genderIdentity, " Gender Identity Label for GrandChild in GrandChildren Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(8),FHQConstants.GENDER_IDENTITY,fHQ_TestDataManager.genderIdentityValueAdded);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.WHICH_BEST_DESCRIBES_THIS_RELATIVE), fHQ_TestDataManager.whichBestDescribesThisRelative, " Which best describes this relative? label in GrandChildren Form ");
		CharmsUtil.SelectValueFromDropDown(fHQSubmissionPage.dynamicLocator3ForDropDown(9),FHQConstants.CHILD_DISCRIPTION,fHQ_TestDataManager.whichBestDescribesThisRelativeSelected);	
	}
	/*********************************************************/
				/* COUSINS FORM METHODS */
	/********************************************************/
	/* Assertions for the Cousin Table LABELS on List View Page  */
	public static void cousinListViewTableLabelsAssertions() {
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("FHQ Childs Context Menu"),"", " FHQ Childs Context Menu Label in Cousin List View Page ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.COUSINS), fHQ_TestDataManager.cousins, " Sons/Daughters Label in Cousin List View Page ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.newButtonLinkOnListView, fHQ_TestDataManager.addNewCousins, " Add New Cousins button Label in Cousin List View Page ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.rowsDetailsOnListView, fHQ_TestDataManager.theBlueHighlightedRowsRepresentTheIncompletedFamilyRecords, " The blue highlighted rows represent the incompleted family records Label in Cousin List View Page ");
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
	public static void cousinListViewTableValuesAssertions() {	
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,1), fHQ_TestDataManager.firstNameValue, " First Name Value in Cousin List View Page ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,2), fHQ_TestDataManager.firstInitialOfLASTNameValue, " First Initial of LAST Name Value in Cousin List View Page ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,3), fHQ_TestDataManager.parentOfThisRelativeValue, " Parent of this relative Value in Cousin List View Page ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,4), fHQ_TestDataManager.vitalStatusValue, " Vital Status Value in Cousin List View Page ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,5), fHQ_TestDataManager.yearOfBirthValue, " Year of Birth Value in Cousin List View Page ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,6), fHQ_TestDataManager.relationToPatientValue, " Relation to Patient Value in Cousin List View Page ");
		CharmsUtil.assertButtonLabelWithSpace(softAssert, fHQSubmissionPage.dynamicLocatorElementInTable(1,7), fHQ_TestDataManager.sexAssignedAtBirthValue, " Sex assigned at birth Value in Cousin List View Page ");
	}
	/* Basic Information Submissions and Assertions for the Cousin */
	public static void cousinBasicInformationSubmissionsAndAssertions() {
		//CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.COUSIN),fHQ_TestDataManager.cousin, " Cousin Label in Cousin Form ");		 			 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.YOU_ARE_CURRENTLY_FILLING_OUT_INFORMATION),fHQ_TestDataManager.youAreCurrentlyFillingOutInformation, " You are currently filling out information for the participant's cousin.Label in Cousin Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PLEASE_MAKE_SURE_YOU_HAVE_COMPLETED_ALL_PARTNER_RECORDS_BEFORE_COMPLETING_CHILDREN_RECORDS),fHQ_TestDataManager.pleaseMakeSureYouHaveCompletedAllPartnerRecordsBeforeCompletingChildrenRecords, " Please make sure you have completed all partner records before completing children records. Label in Cousin Form ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.CHILD_BASIC_INFORMATION),fHQ_TestDataManager.childBasicInformation, " Basic Information Label in Cousin Form ");		 			 		 			 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstName, " First Name label in Cousin Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForTextBox("first_name"),fHQ_TestDataManager.firstNameValue, " Cousin First Name Value in Cousin Form ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label in Cousin Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocator3ForDropDown(1),fHQ_TestDataManager.firstInitialOfLASTNameValue,"  First Initial of LAST Name Value in Cousin Form ");	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirth, " Year of Birth label in Cousin Form "); 	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.yearOfBirthdateLabelBanner1,fHQ_TestDataManager.anEstimatedDateIsPreferred, " An estimated date is preferred banner in Cousin Form ");		
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
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("Add a row for Child"),fHQ_TestDataManager.add," Add Label for child ");
		CharmsUtil.assertButtonLabel(softAssert, fHQSubmissionPage.dynamicLocatorForButton("Remove all rows for Child"),fHQ_TestDataManager.removeAll," Remove All Label for child in Child Form");
		FHQSubmissionStepsImpl.assertMRVSTable(1);
	}	
	/* Child MRVS Added Row Assertions */
	public static void  assertChildRowAddedInMRVSTable(int i) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingAnchorTag("Edit Row",i),"", " Edit Row for child label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingAnchorTag("Remove Row",i),"", " Remove Row for child label ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(18),fHQ_TestDataManager.childfirstName, " Child First Name data in Child Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(19),fHQ_TestDataManager.childfirstInitialOfLASTName, " Child First Initial of LAST Name data in Child Form ");
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForMRVSTableValue(20),fHQ_TestDataManager.childvitalStatus, " Child Vital Status data in Child Form");
	}
	/* ********** PARTICIOPANT(ONESELF) ASSERTION IN NATIVE VIEW ********* */
	public static void participantFHQInformationAssertions(String string) {
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.RELATIONSHIP_IDENTITY),fHQ_TestDataManager.relationshipIdentity, " Please indicate your relationship to the participant. Label " + string);	
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(1),fHQ_TestDataManager.pleaseIndicateYourRelationshipToTheParticipant, " Participant Relation Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.FIRST_NAME_OF_THE_PARTICIPANT),fHQ_TestDataManager.firstNameOfTheParticipant, " First Name of the participant. Label " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.FIRST_NAME_OF_THE_PARTICIPANT),fHQ_TestDataManager.participantFirstName, " Participant First Name Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.FIRST_INITIAL_OF_LAST_NAME_PARTICIPANT),FHQConstants.FIRST_INITIAL_OF_LAST_NAME_PARTICIPANT, " First Initial of LAST Name of the participant. Label " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.FIRST_INITIAL_OF_LAST_NAME_PARTICIPANT),fHQ_TestDataManager.participantFirstInitialOfLASTNameValue, " First Initial of LAST Name of the participant. Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH),"Sex assigned at birth"," Sex assigned at birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(2),fHQ_TestDataManager.sexAssignedAtBirth, " Sex assigned at birth Value " + string);		
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_GENDER_IDENTITY),"Gender Identity"," Gender Identity Label for Participant "+ string);
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(3),fHQ_TestDataManager.genderIdentity, " Gender Identity Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.HAS_PARTICIPANT_HAD_ANY_MISCARRIAGES_OR_STILLBIRTHS),fHQ_TestDataManager.hasParticipantHadAnyMiscarriagesOrStillbirths,"Has participant had any miscarriage, stillbirth? Label "+ string);
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(4),fHQ_TestDataManager.hasTheParticipantEverHadAnyMiscarriagesOrStillbirths, " Has participant had any miscarriage, stillbirth? Value "+ string);		
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES),"Total number of Miscarriages"," Total number of Miscarriages Label "+ string);		
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES),fHQ_TestDataManager.totalNumberOfMiscarriages," Total number of Miscarriages Label "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PLEASE_WRITE_FIRST_NAME_OF_PARTNERS_WITH_WHOM_PARTICIPANT_HAD_MISCARRIAGES),fHQ_TestDataManager.pleaseWriteFirstNameOfPartnersWithWhomParticipantHadMiscarriages," Please write first name of partner(s) with whom participant had miscarriage(s) Label "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.PLEASE_WRITE_FIRST_NAME_OF_PARTNERS_WITH_WHOM_PARTICIPANT_HAD_MISCARRIAGES),fHQ_TestDataManager.pleaseWriteTheFirstNameOfThePartnersWithWhomTheParticipantHadThePregnancyiesAboveMiscarriages, " Please write first name of partner(s) with whom participant had miscarriage(s) Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS),"Total number of Stillbirths"," Total number of Stillbirths Label "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS),fHQ_TestDataManager.totalNumberOfStillbirths," Total number of Stillbirths Label "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PLEASE_WRITE_FIRST_NAME_OF_PARTNERS_WITH_WHOM_PARTICIPANT_HAD_STILLBIRTHS),fHQ_TestDataManager.pleaseWriteFirstNameOfPartnersWithWhomParticipantHadStillbirths," Please write first name of partner(s) with whom participant had stillbirth(s)) Label "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.PLEASE_WRITE_FIRST_NAME_OF_PARTNERS_WITH_WHOM_PARTICIPANT_HAD_STILLBIRTHS),fHQ_TestDataManager.pleaseWriteTheFirstNameOfThePartnersWithWhomTheParticipantHadThePregnancyiesAboveStillbirths, " Please write first name of partner(s) with whom participant had stillbirth(s) Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.HOW_MANY_TOTAL_CHILDREN_ALIVE_AND_DECEASED_HAS_THE_PARTICIPANT_HAD),"How many total children (alive and deceased) has the participant had?"," How many total children (alive and deceased) has the participant had? Label "+ string);	
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(5),fHQ_TestDataManager.howManyTotalChildrenAliveAndDeceasedHasTheParticipantHad, " How many total children (alive and deceased) has the participant had? Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.HOW_MANY_TOTAL_DIFFERENT_PARTNERS_HAS_PARTICIPANT_HAD_BIOLOGICAL_CHILDREN_WITH), "How many total different partners has participant had biological children with?"," How many total different partners has the participant had biological children with? label "+ string);		
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(6),fHQ_TestDataManager.howManyTotalDifferentPartnersHasTheParticipantHadBiologicalChildrenWith, " How many total different partners has the participant had biological children with? label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.HOW_MANY_SIBLINGS_DOES_THE_PARTICIPANT_HAVE),"How many siblings does the participant have?", " How many siblings does the participant have? Label "+ string);
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(7),fHQ_TestDataManager.howManySiblingsDoesTheParticipantHave, " How many siblings does the participant have? Label Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, FHQSubmissionPage.additionalInformation,"Is there anything else you would like us to know about this participant?"," Is there anything else you would like us to know about this participant? Label "+ string); 	
		CharmsUtil.assertTextBoxData(softAssert, FHQSubmissionPage.additionalInformationAdded,fHQ_TestDataManager.addAdditionalInformation, " Is there anything else you would like us to know about this participant? Label "+ string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.FHQ_STUDY),"FHQ Study"," FHQ Study Label "+ string); 	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT),fHQ_TestDataManager.participant, " Participant Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, FHQSubmissionPage.participantName,fHQ_TestDataManager.participantValue, " Participant Value "+ string); 
	}
	/* ************** PARTNER ASSERTION IN NATIVE VIEW *************** */
	public static void partnersFHQInformationAssertions(String string) {
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForRelativeTab(12));
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForPartner(fHQ_TestDataManager.partnerYearOfBirthValueNV));	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPATION_STATUS),fHQ_TestDataManager.participationStatus, " Participation Status Label " + string);	
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(1),fHQ_TestDataManager.participationStatusValue, " Participation Status Label " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForLabels(),"Is this your (the participant's) current partner","Is this your (the participant's) current partner"+ string);	
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(2),fHQ_TestDataManager.isThisTheParticipantCurrentPartnerValue, " Is this your (the participant's) current partner Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstName, " First Name label " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.FIRST_NAME),fHQ_TestDataManager.partnerFirstName, " First Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.partnerFirstInitialOfLASTName, " First Initial of LAST Name Value Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirth, " Year of Birth label " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.partnerYearOfBirthValueNV, " Year of Birth Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxForReadOnlyInput(FHQConstants.VITAL_STATUS),fHQ_TestDataManager.partnerVitalStatus, " Vital Status Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(3),fHQ_TestDataManager.partnerVitalStatus, " Vital Status Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH),fHQ_TestDataManager.sexAssignedAtBirth," Sex assigned at birth Label " + string);
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(4),fHQ_TestDataManager.partnerSexAssignedAtBirth, " Sex assigned at birth Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_GENDER_IDENTITY),"Gender Identity"," Gender Identity Label "+ string);
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(5),fHQ_TestDataManager.partnerGenderIdentity, " Gender Identity Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.IS_THE_PARTICIPANT_BLOOD_RELATED_TO_THIS_PERSON),fHQ_TestDataManager.isTheParticipantBloodRelatedToThisPerson," Is the participant blood-related to this person? Label " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxForReadOnlyInput(FHQConstants.IS_THE_PARTICIPANT_BLOOD_RELATED_TO_THIS_PERSON),fHQ_TestDataManager.isTheParticipantBloodRelated, " Is the participant blood-related to this person? Value " + string);
		System.out.println(fHQSubmissionPage.dynamicLocatorTextBoxForReadOnlyInput(FHQConstants.IS_THE_PARTICIPANT_BLOOD_RELATED_TO_THIS_PERSON).getAttribute("selected"));
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PLEASE_DESCRIBE_HOW_THE_PARTICIPANT_IS_RELATED_TO_THIS_PERSON),fHQ_TestDataManager.pleaseDescribeHowTheParticipantIsRelatedToThisPerson, " Please describe how the participant is related to this person Label " + string);	
		CharmsUtil.assertTextBoxData(softAssert,fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.PLEASE_DESCRIBE_HOW_THE_PARTICIPANT_IS_RELATED_TO_THIS_PERSON),fHQ_TestDataManager.describeTheParticipantRelatedToThisPerson, " Please describe how the participant is related to this person Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText("Is there anything else you would like us to know a"),"Is there anything else you would like us to know about this relative?"," Is there anything else you would like us to know about this relative? Label " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxForReadOnlyInput1(FHQConstants.IS_THERE_ANYTHING_ELSE_YOU_WOULD_LIKE_US_TO_KNOW_ABOUT_THIS_RELATIVE),fHQ_TestDataManager.addAdditionalInformation, " Is there anything else you would like us to know about this relative? Value "+ string); 
	}	
	/* ******** PARENT (MOTHER) ASSERTION IN NATIVE VIEW ********** */
	public static void motherFHQInformationAssertions(String string) {
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForRelativeTab(4));
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForParents("Biological Mother"));	
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingContainsNormalizeSpace("Open Record",1));
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPATION_STATUS),fHQ_TestDataManager.participationStatus, " Participation Status Label " + string);	
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(1),fHQ_TestDataManager.participationStatusValue, " Participation Status Label " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.RELATIONS_TO_PATIENT),fHQ_TestDataManager.relationsToPatient, " Relation to Patient Label " + string);	
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(2),fHQ_TestDataManager.relationToPatientValue2, " Relation to Patient Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstName, " First Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstNameValueAdded, " First Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTNameAdded, " First Initial of LAST Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.WAS_THIS_RELATIVE_ADOPTED),fHQ_TestDataManager.wasThisRelativeAdopted, " Was this relative adopted? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(3),fHQ_TestDataManager.relativeAdoptedValueSelected, "  Was this relative adopted? " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirth, " Year of Birth label" + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirthValueNV, " Year of Birth Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.VITAL_STATUS),fHQ_TestDataManager.vitalStatus, " Vital Status Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(4),fHQ_TestDataManager.vitalStatusValueAdded, " Vital Status Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH),fHQ_TestDataManager.sexAssignedAtBirth," Sex assigned at birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(6),fHQ_TestDataManager.sexAssignedAtBirthValueAdded, " Sex assigned at birth Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_GENDER_IDENTITY), fHQ_TestDataManager.genderIdentity, " Gender Identity Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(7),fHQ_TestDataManager.genderIdentityValueAdded, " Gender Identity Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.IS_THIS_RELATIVE_A_TWIN_OR_PART_OF_A_MULTIPLE_BIRTH), fHQ_TestDataManager.isThisRelativeATwinOrPartOfAMultipleBirth, " Is this relative a twin or part of a multiple birth? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(8),fHQ_TestDataManager.twinOrPartOfAMultipleBirthValueAdded, " Is this relative a twin or part of a multiple birth? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARENT_TYPE_OF_BIRTH), fHQ_TestDataManager.typeOfBirth, " Type of birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(9),fHQ_TestDataManager.typeOfBirthValueAdded, " Type of birth Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText("Has this relative ever had any miscarriages, still"),"Has this relative ever had any miscarriages, stillbirths?", "Has this relative ever had any miscarriages, stillbirths? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(10),fHQ_TestDataManager.hasThisRelativeEverHadAnyMiscarriagesOrStillbirthsValue, "  Has this relative ever had any miscarriages or stillbirths? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES),fHQ_TestDataManager.totalNumberOfMiscarriages," Total number of Miscarriages Label " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES),fHQ_TestDataManager.totalNumberOfMiscarriagesValue, "  Total number of Miscarriages Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS),fHQ_TestDataManager.totalNumberOfStillbirths," Total number of Stillbirths Label" + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS),fHQ_TestDataManager.totalNumberOfStillbirthsValue, "  Total number of Stillbirths  Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_CANCER), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancer, " Has this relative ever been diagnosed with cancer? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(12),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancerValue, "  Has this relative ever been diagnosed with cancer? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_ANY_MEDICAL_CONDITIONS ), "Has this relative ever been diagnosed with any medical conditions?", " Has this relative ever been diagnosed with any medical conditions? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(13),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelowValue, "  Has this relative ever been diagnosed with any medical conditions? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HOW_MANY_SIBLINGS_DOES_THIS_RELATIVE_HAVE), fHQ_TestDataManager.howManySiblingsDoesThisRelativeHave, " How many siblings does this relative have? Label"+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.HOW_MANY_SIBLINGS_DOES_THIS_RELATIVE_HAVE),fHQ_TestDataManager.howManySiblingsDoesThisRelativeHaveValue, "  How many siblings does this relative have? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.IS_THERE_ANYTHING_ELSE_YOU_WOULD_LIKE_US_TO_KNOW_ABOUT_THIS_RELATIVE),fHQ_TestDataManager.isThereAnythingElseYouWouldLikeUsToKnowAboutThisRelative," Is there anything else you would like us to know about this relative? Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxForReadOnlyInput1(FHQConstants.IS_THERE_ANYTHING_ELSE_YOU_WOULD_LIKE_US_TO_KNOW_ABOUT_THIS_RELATIVE),fHQ_TestDataManager.addAdditionalInformation, " Is there anything else you would like us to know about this relative? Value " + string);
	}	
	/* ************ PARENT (FATHER) ASSERTION IN NATIVE VIEW ******** */
	public static void fatherFHQInformationAssertions(String string) {
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForRelativeTab(4));
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForParents("Biological Father"));
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingContainsNormalizeSpace("Open Record",1));
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPATION_STATUS),fHQ_TestDataManager.participationStatus, " Participation Status Label " + string);	
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(1),fHQ_TestDataManager.participationStatusValue, " Participation Status Label " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.RELATIONS_TO_PATIENT),fHQ_TestDataManager.relationsToPatient, " Relation to Patient Label " + string);	
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(2),fHQ_TestDataManager.relationToPatientValue1, " Relation to Patient Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstName, " First Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstNameValueAdded, " First Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTNameAdded, " First Initial of LAST Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.WAS_THIS_RELATIVE_ADOPTED),fHQ_TestDataManager.wasThisRelativeAdopted, " Was this relative adopted? Label" + string);
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(3),fHQ_TestDataManager.relativeAdoptedValueSelected, "  Was this relative adopted? " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirth, " Year of Birth label" + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirthValueNV, " Year of Birth Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.VITAL_STATUS),fHQ_TestDataManager.vitalStatus, " Vital Status Label" + string);
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(4),fHQ_TestDataManager.vitalStatusValueAdded, " Vital Status Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH),fHQ_TestDataManager.sexAssignedAtBirth," Sex assigned at birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(6),fHQ_TestDataManager.sexAssignedAtBirthValueAdded, " Sex assigned at birth Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_GENDER_IDENTITY), fHQ_TestDataManager.genderIdentity, " Gender Identity Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(7),fHQ_TestDataManager.genderIdentityValueAdded, " Gender Identity Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.IS_THIS_RELATIVE_A_TWIN_OR_PART_OF_A_MULTIPLE_BIRTH), fHQ_TestDataManager.isThisRelativeATwinOrPartOfAMultipleBirth, " Is this relative a twin or part of a multiple birth? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(8),fHQ_TestDataManager.twinOrPartOfAMultipleBirthValueAdded, " Is this relative a twin or part of a multiple birth? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARENT_TYPE_OF_BIRTH), fHQ_TestDataManager.typeOfBirth, " Type of birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(9),fHQ_TestDataManager.typeOfBirthValueAdded, " Type of birth Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_CANCER), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancer, " Has this relative ever been diagnosed with cancer? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(12),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancerValue, "  Has this relative ever been diagnosed with cancer? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_ANY_MEDICAL_CONDITIONS ), "Has this relative ever been diagnosed with any medical conditions?", " Has this relative ever been diagnosed with any medical conditions? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(13),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelowValue, "  Has this relative ever been diagnosed with any medical conditions? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HOW_MANY_SIBLINGS_DOES_THIS_RELATIVE_HAVE), fHQ_TestDataManager.howManySiblingsDoesThisRelativeHave, " How many siblings does this relative have? Label"+ string);
		CharmsUtil.assertTextBoxData(softAssert,fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.HOW_MANY_SIBLINGS_DOES_THIS_RELATIVE_HAVE),fHQ_TestDataManager.howManySiblingsDoesThisRelativeHaveValue, "  How many siblings does this relative have? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.IS_THERE_ANYTHING_ELSE_YOU_WOULD_LIKE_US_TO_KNOW_ABOUT_THIS_RELATIVE),fHQ_TestDataManager.isThereAnythingElseYouWouldLikeUsToKnowAboutThisRelative," Is there anything else you would like us to know about this relative? Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert,fHQSubmissionPage.dynamicLocatorTextBoxForReadOnlyInput1(FHQConstants.IS_THERE_ANYTHING_ELSE_YOU_WOULD_LIKE_US_TO_KNOW_ABOUT_THIS_RELATIVE),fHQ_TestDataManager.addAdditionalInformation, " Is there anything else you would like us to know about this relative? Value " + string);
	}
	/* ************** CHILDREN ASSERTION IN NATIVE VIEW *************** */
	public static void  childrenFHQInformationAssertions (String string) {
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForRelativeTab(6));
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForAddedRelative("Son(s)/Daughter(s) related list",fHQ_TestDataManager.yearOfBirthValueNV));	
		//	CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingAnchorTag1(fHQ_TestDataManager.childFirstNameValue,2));
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingContainsNormalizeSpace("Open Record",1));	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPATION_STATUS),fHQ_TestDataManager.participationStatus, " Participation Status Label " + string);	
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(1),fHQ_TestDataManager.participationStatusValue, " Participation Status Label " + string);			
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("Parent of this relative"),fHQ_TestDataManager.parentOfThisRelative, " Parent of this relative Label " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput("Parent of this relative"),fHQ_TestDataManager.parentOfThisRelativeValue, "  Parent of this relative Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstName, " First Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.FIRST_NAME),fHQ_TestDataManager.childFirstNameValue, " First Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.childFirstInitialOfLASTNameValue, " First Initial of LAST Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirth, " Year of Birth label" + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirthValueNV, " Year of Birth Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.VITAL_STATUS),fHQ_TestDataManager.vitalStatus, " Vital Status Label" + string);
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(3),fHQ_TestDataManager.childVitalStatusValue, " Vital Status Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH),fHQ_TestDataManager.sexAssignedAtBirth," Sex assigned at birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(5),fHQ_TestDataManager.childSexAssignedAtBirthSelected, " Sex assigned at birth Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_GENDER_IDENTITY), fHQ_TestDataManager.genderIdentity, " Gender Identity Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(6),fHQ_TestDataManager.childGenderIdentitySelected, " Gender Identity Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.WHICH_BEST_DESCRIBES_THIS_RELATIVE), fHQ_TestDataManager.whichBestDescribesThisRelative, " Which best describes this relative? label in Child Form ");
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(7),fHQ_TestDataManager.whichBestDescribesThisRelativeSelected, " Which best describes this relative? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.IS_THE_OTHER_BIOLOGICAL_PARENT_OF_THIS_RELATIVE_ONE_OF_THE_PARTNERS_YOU_HAVE_ENTERED1), "Is the other biological parent of this relative one of partners you have entered", " Is the other biological parent of this relative one of the partners you have entered? label in Child Form ");
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(8),fHQ_TestDataManager.isTheOtherBiologicalParentOfThisRelativeOneOfThePartnersYouHaveEnteredSelected, " Is the other biological parent of this relative one of the partners you have entered? Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.CHILD_OTHER_BIOLOGICAL_PARENT), fHQ_TestDataManager.otherBiologicalParent, " Other Biological Parent label " + string);		
		CharmsUtil.assertTextBoxData(softAssert, FHQSubmissionPage.otherBiologicalParentTextBox,fHQ_TestDataManager.otherBiologicalParentSelected, " Other Biological Parent Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.IS_THIS_RELATIVE_A_TWIN_OR_PART_OF_A_MULTIPLE_BIRTH), fHQ_TestDataManager.isThisRelativeATwinOrPartOfAMultipleBirth, " Is this relative a twin or part of a multiple birth? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(9),fHQ_TestDataManager.twinOrPartOfAMultipleBirthValue, " Is this relative a twin or part of a multiple birth? Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARENT_TYPE_OF_BIRTH), fHQ_TestDataManager.typeOfBirth, " Type of birth Label " + string);	
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(10),fHQ_TestDataManager.typeOfBirthValue, " Type of birth? Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText("Has this relative ever had any miscarriages, still"),"Has this relative ever had any miscarriages, stillbirths?"," Has this relative ever had any miscarriages, stillbirths? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(11),fHQ_TestDataManager.hasThisRelativeEverHadAnyMiscarriagesOrStillbirthsValue, "  Has this relative ever had any miscarriages or stillbirths? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES),fHQ_TestDataManager.totalNumberOfMiscarriages," Total number of Miscarriages Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES),fHQ_TestDataManager.totalNumberOfMiscarriagesValue," Total number of Miscarriages Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS),fHQ_TestDataManager.totalNumberOfStillbirths," Total number of Stillbirths Label "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS),fHQ_TestDataManager.totalNumberOfStillbirthsValue," Total number of Stillbirths Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_CANCER), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancer, "Has this relative ever been diagnosed with cancer? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(13),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancerValue, "  Has this relative ever been diagnosed with cancer? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_ANY_MEDICAL_CONDITIONS ), "Has this relative ever been diagnosed with any medical conditions?", " Has this relative ever been diagnosed with any medical conditions? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(14),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelowValue, " Has this relative ever been diagnosed with any medical conditions? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HOW_MANY_TOTAL_CHILDREN_ALIVE_AND_DECEASED_HAS_THIS_RELATIVE_HAD),"How many total children (alive and deceased) has this relative had?"," How many total children (alive and deceased) has this relative had? Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.HOW_MANY_TOTAL_CHILDREN_ALIVE_AND_DECEASED_HAS_THIS_RELATIVE_HAD),fHQ_TestDataManager.howManyTotalChildrenAliveAndDeceasedHasThisRelaiveHadSelected," How many total children (alive and deceased) has this relative had? Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText("Is there anything else you would like us to know a"),fHQ_TestDataManager.isThereAnythingElseYouWouldLikeUsToKnowAboutThisRelative," Is there anything else you would like us to know about this relative? Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert,fHQSubmissionPage.dynamicLocatorTextBoxForReadOnlyInput1(FHQConstants.IS_THERE_ANYTHING_ELSE_YOU_WOULD_LIKE_US_TO_KNOW_ABOUT_THIS_RELATIVE),fHQ_TestDataManager.addAdditionalInformation, " Is there anything else you would like us to know about this relative? Value " + string);		
	}
	/* ************** SIBLING ASSERTION IN NATIVE VIEW *************** */
	public static void  siblingFHQInformationAssertions (String string) {
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForRelativeTab(10));
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForAddedRelative("FHQ Siblings related list",fHQ_TestDataManager.yearOfBirthValueNV));
		//CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingAnchorTag1(fHQ_TestDataManager.firstNameValue,2));
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingContainsNormalizeSpace("Open Record",1));	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPATION_STATUS),fHQ_TestDataManager.participationStatus, " Participation Status Label " + string);	
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(1),fHQ_TestDataManager.participationStatusValue, " Participation Status Label " + string);			
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("Type of Sibling"),fHQ_TestDataManager.typeOfSibling, " Type of Sibling Label " + string);	
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(2),fHQ_TestDataManager.typeOfSiblingValue, " Type of Sibling Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstName, " First Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstNameValue, " First Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTNameValue, " First Initial of LAST Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirth, " Year of Birth label" + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirthValueNV, " Year of Birth Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.VITAL_STATUS),fHQ_TestDataManager.vitalStatus, " Vital Status Label" + string);
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(3),fHQ_TestDataManager.vitalStatusValue, " Vital Status Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH),fHQ_TestDataManager.sexAssignedAtBirth," Sex assigned at birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(5),fHQ_TestDataManager.sexAssignedAtBirthValueAdded, " Sex assigned at birth Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_GENDER_IDENTITY), fHQ_TestDataManager.genderIdentity, " Gender Identity Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(6),fHQ_TestDataManager.genderIdentityValueAdded, " Gender Identity Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.IS_THIS_RELATIVE_A_TWIN_OR_PART_OF_A_MULTIPLE_BIRTH), fHQ_TestDataManager.isThisRelativeATwinOrPartOfAMultipleBirth, " Is this relative a twin or part of a multiple birth? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(7),fHQ_TestDataManager.twinOrPartOfAMultipleBirthValue, " Is this relative a twin or part of a multiple birth? Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARENT_TYPE_OF_BIRTH), fHQ_TestDataManager.typeOfBirth, " Type of birth Label " + string);	
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(8),fHQ_TestDataManager.typeOfBirthValue, " Type of birth? Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText("Has this relative ever had any miscarriages, still"),"Has this relative ever had any miscarriages, stillbirths?"," Has this relative ever had any miscarriages, stillbirths? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(9),fHQ_TestDataManager.hasThisRelativeEverHadAnyMiscarriagesOrStillbirthsValue, "  Has this relative ever had any miscarriages or stillbirths? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES),fHQ_TestDataManager.totalNumberOfMiscarriages," Total number of Miscarriages Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES),fHQ_TestDataManager.totalNumberOfMiscarriagesValue," Total number of Miscarriages Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS),fHQ_TestDataManager.totalNumberOfStillbirths," Total number of Stillbirths Label "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS),fHQ_TestDataManager.totalNumberOfStillbirthsValue," Total number of Stillbirths Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_CANCER), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancer, "Has this relative ever been diagnosed with cancer? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(11),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancerValue, "  Has this relative ever been diagnosed with cancer? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_ANY_MEDICAL_CONDITIONS ), "Has this relative ever been diagnosed with any medical conditions?", " Has this relative ever been diagnosed with any medical conditions? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(12),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelowValue, " Has this relative ever been diagnosed with any medical conditions? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HOW_MANY_TOTAL_CHILDREN_ALIVE_AND_DECEASED_HAS_THIS_RELATIVE_HAD),"How many total children (alive and deceased) has this relative had?"," How many total children (alive and deceased) has this relative had? Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.HOW_MANY_TOTAL_CHILDREN_ALIVE_AND_DECEASED_HAS_THIS_RELATIVE_HAD),fHQ_TestDataManager.howManyTotalChildrenAliveAndDeceasedHasThisRelaiveHadSelected," How many total children (alive and deceased) has this relative had? Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText("Is there anything else you would like us to know a"),fHQ_TestDataManager.isThereAnythingElseYouWouldLikeUsToKnowAboutThisRelative," Is there anything else you would like us to know about this relative? Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert,fHQSubmissionPage.dynamicLocatorTextBoxForReadOnlyInput1(FHQConstants.IS_THERE_ANYTHING_ELSE_YOU_WOULD_LIKE_US_TO_KNOW_ABOUT_THIS_RELATIVE),fHQ_TestDataManager.addAdditionalInformation, " Is there anything else you would like us to know about this relative? Value " + string);			
	}
	/* ************** AUNT/UNCLE ASSERTION IN NATIVE VIEW *************** */
	public static void  auntUncleFHQInformationAssertions (String string) {
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForRelativeTab(8));
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForAddedRelative("FHQ Aunt/Uncles related list",fHQ_TestDataManager.yearOfBirthValueNV));	
	//	CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingAnchorTag1(fHQ_TestDataManager.auntUncleFirstNameValue1,1));
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPATION_STATUS),fHQ_TestDataManager.participationStatus, " Participation Status Label " + string);	
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(1),fHQ_TestDataManager.participationStatusValue, " Participation Status Label " + string);		
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.SIBLING_TO),FHQConstants.SIBLING_TO, " Sibling to Label " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.SIBLING_TO),fHQ_TestDataManager.siblingTo, " Sibling to Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TYPE_OF_SIBLING_NV),fHQ_TestDataManager.typeOfSiblingNV, " Type of Sibling Label " + string);	
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(3),fHQ_TestDataManager.typeOfSiblingValueNV, " Type of Sibling Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstName, " First Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.FIRST_NAME),fHQ_TestDataManager.auntUncleFirstNameValue1, " First Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.auntUncleFirstInitialOfLASTNameValue1, " First Initial of LAST Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirth, " Year of Birth label" + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirthValueNV, " Year of Birth Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.VITAL_STATUS),fHQ_TestDataManager.vitalStatus, " Vital Status Label" + string);
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(4),fHQ_TestDataManager.auntUncleVitalStatusValue1, " Vital Status Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH),fHQ_TestDataManager.sexAssignedAtBirth," Sex assigned at birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(6),fHQ_TestDataManager.auntUncleSexAssignedAtBirthSelected, " Sex assigned at birth Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_GENDER_IDENTITY), fHQ_TestDataManager.genderIdentity, " Gender Identity Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(7),fHQ_TestDataManager.auntUncleGenderIdentitySelected, " Gender Identity Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.IS_THIS_RELATIVE_A_TWIN_OR_PART_OF_A_MULTIPLE_BIRTH), fHQ_TestDataManager.isThisRelativeATwinOrPartOfAMultipleBirth, " Is this relative a twin or part of a multiple birth? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(8),fHQ_TestDataManager.twinOrPartOfAMultipleBirthValue, " Is this relative a twin or part of a multiple birth? Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARENT_TYPE_OF_BIRTH), fHQ_TestDataManager.typeOfBirth, " Type of birth Label " + string);	
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(9),fHQ_TestDataManager.typeOfBirthValue, " Type of birth? Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText("Has this relative ever had any miscarriages, still"),"Has this relative ever had any miscarriages, stillbirths?"," Has this relative ever had any miscarriages, stillbirths? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(10),fHQ_TestDataManager.hasThisRelativeEverHadAnyMiscarriagesOrStillbirthsValue, "  Has this relative ever had any miscarriages or stillbirths? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES),fHQ_TestDataManager.totalNumberOfMiscarriages," Total number of Miscarriages Label "+ string);
		//CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES),fHQ_TestDataManager.totalNumberOfMiscarriagesValue," Total number of Miscarriages Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS),fHQ_TestDataManager.totalNumberOfStillbirths," Total number of Stillbirths Label "+ string);	
		//CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS),fHQ_TestDataManager.totalNumberOfStillbirthsValue," Total number of Stillbirths Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_CANCER), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancer, "Has this relative ever been diagnosed with cancer? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(11),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancerValue, "  Has this relative ever been diagnosed with cancer? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_ANY_MEDICAL_CONDITIONS ), "Has this relative ever been diagnosed with any medical conditions?", " Has this relative ever been diagnosed with any medical conditions? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(12),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelowValue, " Has this relative ever been diagnosed with any medical conditions? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("How many total children (alive and deceased) does this relative have?"),"How many total children (alive and deceased) does this relative have?"," How many total children (alive and deceased) does this relative have? Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput("How many total children (alive and deceased) does this relative have?"),fHQ_TestDataManager.howManyTotalChildrenAliveAndDeceasedHasThisRelaiveHadSelected," How many total children (alive and deceased) has this relative had? Value "+ string);	
		//CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText("Is there anything else you would like us to know a"),fHQ_TestDataManager.isThereAnythingElseYouWouldLikeUsToKnowAboutThisRelative," Is there anything else you would like us to know about this relative? Label "+ string);
		//CharmsUtil.assertTextBoxData(softAssert,fHQSubmissionPage.dynamicLocatorTextBoxForReadOnlyInput1(FHQConstants.IS_THERE_ANYTHING_ELSE_YOU_WOULD_LIKE_US_TO_KNOW_ABOUT_THIS_RELATIVE),fHQ_TestDataManager.addAdditionalInformation, " Is there anything else you would like us to know about this relative? Value " + string);			
	}
	/* ************** NIECE/NEPHEW ASSERTION IN NATIVE VIEW *************** */
	public static void  nieceNephewFHQInformationAssertions (String string) {	
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForRelativeTab(11));
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForAddedRelative("Niece(s)/Nephew(s) related list",fHQ_TestDataManager.yearOfBirthValueNV));
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPATION_STATUS),fHQ_TestDataManager.participationStatus, " Participation Status Label " + string);	
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(1),fHQ_TestDataManager.participationStatusValue, " Participation Status Label " + string);		
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARENT_OF_THIS_RELATIVE),fHQ_TestDataManager.parentOfThisRelative, " Parent of this relative Label " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.PARENT_OF_THIS_RELATIVE),fHQ_TestDataManager.parentOfThisRelativeValue, " Parent of this relative Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstName, " First Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.FIRST_NAME),fHQ_TestDataManager.nieceNephewFirstNameValue, " First Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.nieceNephewFirstInitialOfLASTNameValue, " First Initial of LAST Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirth, " Year of Birth label" + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirthValueNV, " Year of Birth Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.VITAL_STATUS),fHQ_TestDataManager.vitalStatus, " Vital Status Label" + string);
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(3),fHQ_TestDataManager.nieceNephewVitalStatusValue, " Vital Status Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH),fHQ_TestDataManager.sexAssignedAtBirth," Sex assigned at birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(5),fHQ_TestDataManager.neiceNephewSexAssignedAtBirthSelected, " Sex assigned at birth Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_GENDER_IDENTITY), fHQ_TestDataManager.genderIdentity, " Gender Identity Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(6),fHQ_TestDataManager.neiceNephewGenderIdentitySelected, " Gender Identity Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.WHICH_BEST_DESCRIBES_THIS_RELATIVE), fHQ_TestDataManager.whichBestDescribesThisRelative, " Which best describes this relative? label in Child Form ");
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(7),fHQ_TestDataManager.whichBestDescribesThisRelativeSelected, " Which best describes this relative? Value " + string);			
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.IS_THIS_RELATIVE_A_TWIN_OR_PART_OF_A_MULTIPLE_BIRTH), fHQ_TestDataManager.isThisRelativeATwinOrPartOfAMultipleBirth, " Is this relative a twin or part of a multiple birth? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(9),fHQ_TestDataManager.twinOrPartOfAMultipleBirthValue, " Is this relative a twin or part of a multiple birth? Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARENT_TYPE_OF_BIRTH), fHQ_TestDataManager.typeOfBirth, " Type of birth Label " + string);		
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(10),fHQ_TestDataManager.typeOfBirthValue, " Type of birth? Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText("Has this relative ever had any miscarriages, still"),"Has this relative ever had any miscarriages, stillbirths?"," Has this relative ever had any miscarriages, stillbirths? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(11),fHQ_TestDataManager.hasThisRelativeEverHadAnyMiscarriagesOrStillbirthsValue, "  Has this relative ever had any miscarriages or stillbirths? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES),fHQ_TestDataManager.totalNumberOfMiscarriages," Total number of Miscarriages Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES),fHQ_TestDataManager.totalNumberOfMiscarriagesValue," Total number of Miscarriages Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS),fHQ_TestDataManager.totalNumberOfStillbirths," Total number of Stillbirths Label "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS),fHQ_TestDataManager.totalNumberOfStillbirthsValue," Total number of Stillbirths Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_CANCER), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancer, "Has this relative ever been diagnosed with cancer? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(13),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancerValue, "  Has this relative ever been diagnosed with cancer? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_ANY_MEDICAL_CONDITIONS ), "Has this relative ever been diagnosed with any medical conditions?", " Has this relative ever been diagnosed with any medical conditions? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(14),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelowValue, " Has this relative ever been diagnosed with any medical conditions? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HOW_MANY_TOTAL_CHILDREN_ALIVE_AND_DECEASED_HAS_THIS_RELATIVE_HAD),"How many total children (alive and deceased) has this relative had?"," How many total children (alive and deceased) has this relative had? Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.HOW_MANY_TOTAL_CHILDREN_ALIVE_AND_DECEASED_HAS_THIS_RELATIVE_HAD),fHQ_TestDataManager.howManyTotalChildrenAliveAndDeceasedHasThisRelaiveHadSelected," How many total children (alive and deceased) has this relative had? Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText("Is there anything else you would like us to know a"),fHQ_TestDataManager.isThereAnythingElseYouWouldLikeUsToKnowAboutThisRelative," Is there anything else you would like us to know about this relative? Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert,fHQSubmissionPage.dynamicLocatorTextBoxForReadOnlyInput1(FHQConstants.IS_THERE_ANYTHING_ELSE_YOU_WOULD_LIKE_US_TO_KNOW_ABOUT_THIS_RELATIVE),fHQ_TestDataManager.addAdditionalInformation, " Is there anything else you would like us to know about this relative? Value " + string);				
	}
	/* ************** MATERNAL GRANDMOTHER ASSERTION IN NATIVE VIEW *************** */
	public static void  maternalGrandMotherFHQInformationAssertions (String string) {
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForRelativeTab(5));
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForGrandParent(fHQ_TestDataManager.yearOfBirthValueNV,fHQ_TestDataManager.firstNameValueAdded));
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPATION_STATUS),fHQ_TestDataManager.participationStatus, " Participation Status Label " + string);	
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(1),fHQ_TestDataManager.participationStatusValue, " Participation Status Label " + string);		
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.RELATIONS_TO_PATIENT),fHQ_TestDataManager.relationsToPatient, " Relation to Patient Label " + string);	
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(2),fHQ_TestDataManager.relationToPatientValue3, " Relation to Patient Value " + string);		
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstName, " First Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstNameValueAdded, " First Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTNameAdded, " First Initial of LAST Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.WAS_THIS_RELATIVE_ADOPTED),fHQ_TestDataManager.wasThisRelativeAdopted, " Was this relative adopted? Label" + string);
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(3),fHQ_TestDataManager.relativeAdoptedValueSelected, "  Was this relative adopted? " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirth, " Year of Birth label" + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirthValueNV, " Year of Birth Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.VITAL_STATUS),fHQ_TestDataManager.vitalStatus, " Vital Status Label" + string);
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(4),fHQ_TestDataManager.vitalStatusValueAdded, " Vital Status Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH),fHQ_TestDataManager.sexAssignedAtBirth," Sex assigned at birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(6),fHQ_TestDataManager.sexAssignedAtBirthValueAdded, " Sex assigned at birth Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_GENDER_IDENTITY), fHQ_TestDataManager.genderIdentity, " Gender Identity Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(7),fHQ_TestDataManager.genderIdentityValueAdded, " Gender Identity Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.IS_THIS_RELATIVE_A_TWIN_OR_PART_OF_A_MULTIPLE_BIRTH), fHQ_TestDataManager.isThisRelativeATwinOrPartOfAMultipleBirth, " Is this relative a twin or part of a multiple birth? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(8),fHQ_TestDataManager.twinOrPartOfAMultipleBirthValueAdded, " Is this relative a twin or part of a multiple birth? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARENT_TYPE_OF_BIRTH), fHQ_TestDataManager.typeOfBirth, " Type of birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(9),fHQ_TestDataManager.typeOfBirthValueAdded, " Type of birth Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText("Has this relative ever had any miscarriages, still"),"Has this relative ever had any miscarriages, stillbirths?", "Has this relative ever had any miscarriages, stillbirths? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(10),fHQ_TestDataManager.hasThisRelativeEverHadAnyMiscarriagesOrStillbirthsValue, "  Has this relative ever had any miscarriages or stillbirths? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES),fHQ_TestDataManager.totalNumberOfMiscarriages," Total number of Miscarriages Label " + string);
		CharmsUtil.assertTextBoxData(softAssert,fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES),fHQ_TestDataManager.totalNumberOfMiscarriagesValue, "  Total number of Miscarriages Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS),fHQ_TestDataManager.totalNumberOfStillbirths," Total number of Stillbirths Label" + string);
		CharmsUtil.assertTextBoxData(softAssert,fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS),fHQ_TestDataManager.totalNumberOfStillbirthsValue, "  Total number of Stillbirths  Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_CANCER), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancer, " Has this relative ever been diagnosed with cancer? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(12),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancerValue, "  Has this relative ever been diagnosed with cancer? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_ANY_MEDICAL_CONDITIONS ), "Has this relative ever been diagnosed with any medical conditions?", " Has this relative ever been diagnosed with any medical conditions? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(13),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelowValue, "  Has this relative ever been diagnosed with any medical conditions? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.IS_THERE_ANYTHING_ELSE_YOU_WOULD_LIKE_US_TO_KNOW_ABOUT_THIS_RELATIVE),fHQ_TestDataManager.isThereAnythingElseYouWouldLikeUsToKnowAboutThisRelative," Is there anything else you would like us to know about this relative? Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert,fHQSubmissionPage.dynamicLocatorTextBoxForReadOnlyInput1(FHQConstants.IS_THERE_ANYTHING_ELSE_YOU_WOULD_LIKE_US_TO_KNOW_ABOUT_THIS_RELATIVE),fHQ_TestDataManager.addAdditionalInformation, " Is there anything else you would like us to know about this relative? Value " + string);
	}
	/* ************** MATERNAL GRANDFATHER ASSERTION IN NATIVE VIEW *************** */
	public static void  maternalGrandFatherFHQInformationAssertions(String string) {
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForRelativeTab(5));
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForGrandParent(fHQ_TestDataManager.yearOfBirthValueNV,fHQ_TestDataManager.firstNameValueAdded));
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPATION_STATUS),fHQ_TestDataManager.participationStatus, " Participation Status Label " + string);	
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(1),fHQ_TestDataManager.participationStatusValue, " Participation Status Label " + string);		
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.RELATIONS_TO_PATIENT),fHQ_TestDataManager.relationsToPatient, " Relation to Patient Label " + string);	
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(2),fHQ_TestDataManager.relationToPatientValue3, " Relation to Patient Value " + string);		
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstName, " First Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstNameValueAdded, " First Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTNameAdded, " First Initial of LAST Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.WAS_THIS_RELATIVE_ADOPTED),fHQ_TestDataManager.wasThisRelativeAdopted, " Was this relative adopted? Label" + string);
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(3),fHQ_TestDataManager.relativeAdoptedValueSelected, "  Was this relative adopted? " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirth, " Year of Birth label" + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirthValueNV, " Year of Birth Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.VITAL_STATUS),fHQ_TestDataManager.vitalStatus, " Vital Status Label" + string);
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(4),fHQ_TestDataManager.vitalStatusValueAdded, " Vital Status Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH),fHQ_TestDataManager.sexAssignedAtBirth," Sex assigned at birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(6),fHQ_TestDataManager.sexAssignedAtBirthValueAdded, " Sex assigned at birth Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_GENDER_IDENTITY), fHQ_TestDataManager.genderIdentity, " Gender Identity Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(7),fHQ_TestDataManager.genderIdentityValueAdded, " Gender Identity Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.IS_THIS_RELATIVE_A_TWIN_OR_PART_OF_A_MULTIPLE_BIRTH), fHQ_TestDataManager.isThisRelativeATwinOrPartOfAMultipleBirth, " Is this relative a twin or part of a multiple birth? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(8),fHQ_TestDataManager.twinOrPartOfAMultipleBirthValueAdded, " Is this relative a twin or part of a multiple birth? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARENT_TYPE_OF_BIRTH), fHQ_TestDataManager.typeOfBirth, " Type of birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(9),fHQ_TestDataManager.typeOfBirthValueAdded, " Type of birth Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText("Has this relative ever had any miscarriages, still"),"Has this relative ever had any miscarriages, stillbirths?", "Has this relative ever had any miscarriages, stillbirths? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(10),fHQ_TestDataManager.hasThisRelativeEverHadAnyMiscarriagesOrStillbirthsValue, "  Has this relative ever had any miscarriages or stillbirths? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES),fHQ_TestDataManager.totalNumberOfMiscarriages," Total number of Miscarriages Label " + string);
		CharmsUtil.assertTextBoxData(softAssert,fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES),fHQ_TestDataManager.totalNumberOfMiscarriagesValue, "  Total number of Miscarriages Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS),fHQ_TestDataManager.totalNumberOfStillbirths," Total number of Stillbirths Label" + string);
		CharmsUtil.assertTextBoxData(softAssert,fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS),fHQ_TestDataManager.totalNumberOfStillbirthsValue, "  Total number of Stillbirths  Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_CANCER), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancer, " Has this relative ever been diagnosed with cancer? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(12),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancerValue, "  Has this relative ever been diagnosed with cancer? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_ANY_MEDICAL_CONDITIONS ), "Has this relative ever been diagnosed with any medical conditions?", " Has this relative ever been diagnosed with any medical conditions? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(13),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelowValue, "  Has this relative ever been diagnosed with any medical conditions? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.IS_THERE_ANYTHING_ELSE_YOU_WOULD_LIKE_US_TO_KNOW_ABOUT_THIS_RELATIVE),fHQ_TestDataManager.isThereAnythingElseYouWouldLikeUsToKnowAboutThisRelative," Is there anything else you would like us to know about this relative? Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert,fHQSubmissionPage.dynamicLocatorTextBoxForReadOnlyInput1(FHQConstants.IS_THERE_ANYTHING_ELSE_YOU_WOULD_LIKE_US_TO_KNOW_ABOUT_THIS_RELATIVE),fHQ_TestDataManager.addAdditionalInformation, " Is there anything else you would like us to know about this relative? Value " + string);
	}
	/* ************** PATERNAL GRANDMOTHER ASSERTION IN NATIVE VIEW *************** */
	public static void  paternalGrandMotherFHQInformationAssertions (String string) {
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForRelativeTab(5));
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForGrandParent(fHQ_TestDataManager.yearOfBirthValueNV,fHQ_TestDataManager.firstNameValueAdded));
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPATION_STATUS),fHQ_TestDataManager.participationStatus, " Participation Status Label " + string);	
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(1),fHQ_TestDataManager.participationStatusValue, " Participation Status Label " + string);		
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.RELATIONS_TO_PATIENT),fHQ_TestDataManager.relationsToPatient, " Relation to Patient Label " + string);	
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(2),fHQ_TestDataManager.relationToPatientValue3, " Relation to Patient Value " + string);		
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstName, " First Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstNameValueAdded, " First Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTNameAdded, " First Initial of LAST Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.WAS_THIS_RELATIVE_ADOPTED),fHQ_TestDataManager.wasThisRelativeAdopted, " Was this relative adopted? Label" + string);
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(3),fHQ_TestDataManager.relativeAdoptedValueSelected, "  Was this relative adopted? " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirth, " Year of Birth label" + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirthValueNV, " Year of Birth Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.VITAL_STATUS),fHQ_TestDataManager.vitalStatus, " Vital Status Label" + string);
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(4),fHQ_TestDataManager.vitalStatusValueAdded, " Vital Status Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH),fHQ_TestDataManager.sexAssignedAtBirth," Sex assigned at birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(6),fHQ_TestDataManager.sexAssignedAtBirthValueAdded, " Sex assigned at birth Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_GENDER_IDENTITY), fHQ_TestDataManager.genderIdentity, " Gender Identity Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(7),fHQ_TestDataManager.genderIdentityValueAdded, " Gender Identity Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.IS_THIS_RELATIVE_A_TWIN_OR_PART_OF_A_MULTIPLE_BIRTH), fHQ_TestDataManager.isThisRelativeATwinOrPartOfAMultipleBirth, " Is this relative a twin or part of a multiple birth? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(8),fHQ_TestDataManager.twinOrPartOfAMultipleBirthValueAdded, " Is this relative a twin or part of a multiple birth? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARENT_TYPE_OF_BIRTH), fHQ_TestDataManager.typeOfBirth, " Type of birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(9),fHQ_TestDataManager.typeOfBirthValueAdded, " Type of birth Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText("Has this relative ever had any miscarriages, still"),"Has this relative ever had any miscarriages, stillbirths?", "Has this relative ever had any miscarriages, stillbirths? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(10),fHQ_TestDataManager.hasThisRelativeEverHadAnyMiscarriagesOrStillbirthsValue, "  Has this relative ever had any miscarriages or stillbirths? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES),fHQ_TestDataManager.totalNumberOfMiscarriages," Total number of Miscarriages Label " + string);
		CharmsUtil.assertTextBoxData(softAssert,fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES),fHQ_TestDataManager.totalNumberOfMiscarriagesValue, "  Total number of Miscarriages Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS),fHQ_TestDataManager.totalNumberOfStillbirths," Total number of Stillbirths Label" + string);
		CharmsUtil.assertTextBoxData(softAssert,fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS),fHQ_TestDataManager.totalNumberOfStillbirthsValue, "  Total number of Stillbirths  Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_CANCER), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancer, " Has this relative ever been diagnosed with cancer? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(12),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancerValue, "  Has this relative ever been diagnosed with cancer? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_ANY_MEDICAL_CONDITIONS ), "Has this relative ever been diagnosed with any medical conditions?", " Has this relative ever been diagnosed with any medical conditions? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(13),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelowValue, "  Has this relative ever been diagnosed with any medical conditions? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.IS_THERE_ANYTHING_ELSE_YOU_WOULD_LIKE_US_TO_KNOW_ABOUT_THIS_RELATIVE),fHQ_TestDataManager.isThereAnythingElseYouWouldLikeUsToKnowAboutThisRelative," Is there anything else you would like us to know about this relative? Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert,fHQSubmissionPage.dynamicLocatorTextBoxForReadOnlyInput1(FHQConstants.IS_THERE_ANYTHING_ELSE_YOU_WOULD_LIKE_US_TO_KNOW_ABOUT_THIS_RELATIVE),fHQ_TestDataManager.addAdditionalInformation, " Is there anything else you would like us to know about this relative? Value " + string);
	}
	
	
	/* ************** PATERNAL GRANDFATHER ASSERTION IN NATIVE VIEW *************** */
	public static void  paternalGrandFatherFHQInformationAssertions(String string) {
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForRelativeTab(5));
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorForGrandParent(fHQ_TestDataManager.yearOfBirthValueNV,fHQ_TestDataManager.firstNameValueAdded));
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPATION_STATUS),fHQ_TestDataManager.participationStatus, " Participation Status Label " + string);	
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(1),fHQ_TestDataManager.participationStatusValue, " Participation Status Label " + string);		
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.RELATIONS_TO_PATIENT),fHQ_TestDataManager.relationsToPatient, " Relation to Patient Label " + string);	
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(2),fHQ_TestDataManager.relationToPatientValue3, " Relation to Patient Value " + string);		
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstName, " First Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstNameValueAdded, " First Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTNameAdded, " First Initial of LAST Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.WAS_THIS_RELATIVE_ADOPTED),fHQ_TestDataManager.wasThisRelativeAdopted, " Was this relative adopted? Label" + string);
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(3),fHQ_TestDataManager.relativeAdoptedValueSelected, "  Was this relative adopted? " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirth, " Year of Birth label" + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirthValueNV, " Year of Birth Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.VITAL_STATUS),fHQ_TestDataManager.vitalStatus, " Vital Status Label" + string);
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(4),fHQ_TestDataManager.vitalStatusValueAdded, " Vital Status Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH),fHQ_TestDataManager.sexAssignedAtBirth," Sex assigned at birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(6),fHQ_TestDataManager.sexAssignedAtBirthValueAdded, " Sex assigned at birth Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_GENDER_IDENTITY), fHQ_TestDataManager.genderIdentity, " Gender Identity Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(7),fHQ_TestDataManager.genderIdentityValueAdded, " Gender Identity Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.IS_THIS_RELATIVE_A_TWIN_OR_PART_OF_A_MULTIPLE_BIRTH), fHQ_TestDataManager.isThisRelativeATwinOrPartOfAMultipleBirth, " Is this relative a twin or part of a multiple birth? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(8),fHQ_TestDataManager.twinOrPartOfAMultipleBirthValueAdded, " Is this relative a twin or part of a multiple birth? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARENT_TYPE_OF_BIRTH), fHQ_TestDataManager.typeOfBirth, " Type of birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(9),fHQ_TestDataManager.typeOfBirthValueAdded, " Type of birth Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText("Has this relative ever had any miscarriages, still"),"Has this relative ever had any miscarriages, stillbirths?", "Has this relative ever had any miscarriages, stillbirths? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(10),fHQ_TestDataManager.hasThisRelativeEverHadAnyMiscarriagesOrStillbirthsValue, "  Has this relative ever had any miscarriages or stillbirths? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES),fHQ_TestDataManager.totalNumberOfMiscarriages," Total number of Miscarriages Label " + string);
		CharmsUtil.assertTextBoxData(softAssert,fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES),fHQ_TestDataManager.totalNumberOfMiscarriagesValue, "  Total number of Miscarriages Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS),fHQ_TestDataManager.totalNumberOfStillbirths," Total number of Stillbirths Label" + string);
		CharmsUtil.assertTextBoxData(softAssert,fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS),fHQ_TestDataManager.totalNumberOfStillbirthsValue, "  Total number of Stillbirths  Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_CANCER), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancer, " Has this relative ever been diagnosed with cancer? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(12),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancerValue, "  Has this relative ever been diagnosed with cancer? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_ANY_MEDICAL_CONDITIONS ), "Has this relative ever been diagnosed with any medical conditions?", " Has this relative ever been diagnosed with any medical conditions? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(13),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelowValue, "  Has this relative ever been diagnosed with any medical conditions? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.IS_THERE_ANYTHING_ELSE_YOU_WOULD_LIKE_US_TO_KNOW_ABOUT_THIS_RELATIVE),fHQ_TestDataManager.isThereAnythingElseYouWouldLikeUsToKnowAboutThisRelative," Is there anything else you would like us to know about this relative? Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert,fHQSubmissionPage.dynamicLocatorTextBoxForReadOnlyInput1(FHQConstants.IS_THERE_ANYTHING_ELSE_YOU_WOULD_LIKE_US_TO_KNOW_ABOUT_THIS_RELATIVE),fHQ_TestDataManager.addAdditionalInformation, " Is there anything else you would like us to know about this relative? Value " + string);
	}
	/* ************** GRANDCHILDREN ASSERTION IN NATIVE VIEW *************** */
	public static void grandChildrenFHQInformationAssertions (String string) {
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("Grandchildren (10)"));
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingContainsNormalizeSpace(fHQ_TestDataManager.firstNameValue,4));
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPATION_STATUS),fHQ_TestDataManager.participationStatus, " Participation Status Label " + string);	
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(1),fHQ_TestDataManager.participationStatusValue, " Participation Status Label " + string);		
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARENT_OF_THIS_RELATIVE),fHQ_TestDataManager.parentOfThisRelative, " Parent of this relative Label " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.PARENT_OF_THIS_RELATIVE),fHQ_TestDataManager.parentOfThisRelativeValue, " Parent of this relative Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstName, " First Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstNameValue, " First Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTNameValue, " First Initial of LAST Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirth, " Year of Birth label" + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirthValueNV, " Year of Birth Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.VITAL_STATUS),fHQ_TestDataManager.vitalStatus, " Vital Status Label" + string);
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(3),fHQ_TestDataManager.vitalStatusValue, " Vital Status Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH),fHQ_TestDataManager.sexAssignedAtBirth," Sex assigned at birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(5),fHQ_TestDataManager.sexAssignedAtBirthValueAdded, " Sex assigned at birth Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_GENDER_IDENTITY), fHQ_TestDataManager.genderIdentity, " Gender Identity Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(6),fHQ_TestDataManager.genderIdentityValueAdded, " Gender Identity Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.WHICH_BEST_DESCRIBES_THIS_RELATIVE), fHQ_TestDataManager.whichBestDescribesThisRelative, " Which best describes this relative? label in Child Form ");
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(7),fHQ_TestDataManager.whichBestDescribesThisRelativeSelected, " Which best describes this relative? Value " + string);					
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.IS_THIS_RELATIVE_A_TWIN_OR_PART_OF_A_MULTIPLE_BIRTH), fHQ_TestDataManager.isThisRelativeATwinOrPartOfAMultipleBirth, " Is this relative a twin or part of a multiple birth? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(9),fHQ_TestDataManager.twinOrPartOfAMultipleBirthValueAdded, " Is this relative a twin or part of a multiple birth? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARENT_TYPE_OF_BIRTH), fHQ_TestDataManager.typeOfBirth, " Type of birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(10),fHQ_TestDataManager.typeOfBirthValueAdded, " Type of birth Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText("Has this relative ever had any miscarriages, still"),"Has this relative ever had any miscarriages, stillbirths?", "Has this relative ever had any miscarriages, stillbirths? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(11),fHQ_TestDataManager.hasThisRelativeEverHadAnyMiscarriagesOrStillbirthsValue, "  Has this relative ever had any miscarriages or stillbirths? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES),fHQ_TestDataManager.totalNumberOfMiscarriages," Total number of Miscarriages Label " + string);
		CharmsUtil.assertTextBoxData(softAssert,fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES),fHQ_TestDataManager.totalNumberOfMiscarriagesValue, "  Total number of Miscarriages Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS),fHQ_TestDataManager.totalNumberOfStillbirths," Total number of Stillbirths Label" + string);
		CharmsUtil.assertTextBoxData(softAssert,fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS),fHQ_TestDataManager.totalNumberOfStillbirthsValue, "  Total number of Stillbirths  Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_CANCER), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancer, " Has this relative ever been diagnosed with cancer? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(13),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancerValue, "  Has this relative ever been diagnosed with cancer? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_ANY_MEDICAL_CONDITIONS ), "Has this relative ever been diagnosed with any medical conditions?", " Has this relative ever been diagnosed with any medical conditions? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(14),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelowValue, "  Has this relative ever been diagnosed with any medical conditions? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HOW_MANY_TOTAL_CHILDREN_ALIVE_AND_DECEASED_HAS_THIS_RELATIVE_HAD),"How many total children (alive and deceased) has this relative had?"," How many total children (alive and deceased) has this relative had? Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.HOW_MANY_TOTAL_CHILDREN_ALIVE_AND_DECEASED_HAS_THIS_RELATIVE_HAD),fHQ_TestDataManager.howManyTotalChildrenAliveAndDeceasedHasThisRelaiveHadSelected," How many total children (alive and deceased) has this relative had? Value "+ string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.IS_THERE_ANYTHING_ELSE_YOU_WOULD_LIKE_US_TO_KNOW_ABOUT_THIS_RELATIVE),fHQ_TestDataManager.isThereAnythingElseYouWouldLikeUsToKnowAboutThisRelative," Is there anything else you would like us to know about this relative? Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert,fHQSubmissionPage.dynamicLocatorTextBoxForReadOnlyInput1(FHQConstants.IS_THERE_ANYTHING_ELSE_YOU_WOULD_LIKE_US_TO_KNOW_ABOUT_THIS_RELATIVE),fHQ_TestDataManager.addAdditionalInformation, " Is there anything else you would like us to know about this relative? Value " + string);	
	}
	/* ************** COUSIN ASSERTION IN NATIVE VIEW *************** */
	public static void cousinFHQInformationAssertions (String string) {
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace("Cousin(s) (4)"));
		CharmsUtil.clickOnElement(fHQSubmissionPage.dynamicLocatorUsingContainsNormalizeSpace(fHQ_TestDataManager.firstNameValue,2));
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPATION_STATUS),fHQ_TestDataManager.participationStatus, " Participation Status Label " + string);	
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(1),fHQ_TestDataManager.participationStatusValue, " Participation Status Label " + string);		
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARENT_OF_THIS_RELATIVE),fHQ_TestDataManager.parentOfThisRelative, " Parent of this relative Label " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.PARENT_OF_THIS_RELATIVE),fHQ_TestDataManager.parentOfThisRelativeValue, " Parent of this relative Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstName, " First Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.FIRST_NAME),fHQ_TestDataManager.firstNameValue, " First Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTName, " First Initial of LAST Name label " + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME),fHQ_TestDataManager.firstInitialOfLASTNameValue, " First Initial of LAST Name Value "+ string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirth, " Year of Birth label" + string); 
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.YEAR_OF_BIRTH),fHQ_TestDataManager.yearOfBirthValueNV, " Year of Birth Value " + string);	
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.VITAL_STATUS),fHQ_TestDataManager.vitalStatus, " Vital Status Label" + string);
		CharmsUtil.assertDropDownData(softAssert, fHQSubmissionPage.dynamicLocatorForSelectedDropDown(3),fHQ_TestDataManager.vitalStatusValue, " Vital Status Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_SEX_ASSIGNED_AT_BIRTH),fHQ_TestDataManager.sexAssignedAtBirth," Sex assigned at birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(5),fHQ_TestDataManager.sexAssignedAtBirthValueAdded, " Sex assigned at birth Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.PARTICIPANT_GENDER_IDENTITY), fHQ_TestDataManager.genderIdentity, " Gender Identity Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(6),fHQ_TestDataManager.genderIdentityValueAdded, " Gender Identity Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.WHICH_BEST_DESCRIBES_THIS_RELATIVE), fHQ_TestDataManager.whichBestDescribesThisRelative, " Which best describes this relative? label in Child Form ");
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(7),fHQ_TestDataManager.whichBestDescribesThisRelativeSelected, " Which best describes this relative? Value " + string);					
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText(FHQConstants.IS_THIS_RELATIVE_A_TWIN_OR_PART_OF_A_MULTIPLE_BIRTH), fHQ_TestDataManager.isThisRelativeATwinOrPartOfAMultipleBirth, " Is this relative a twin or part of a multiple birth? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(9),fHQ_TestDataManager.twinOrPartOfAMultipleBirthValueAdded, " Is this relative a twin or part of a multiple birth? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.PARENT_TYPE_OF_BIRTH), fHQ_TestDataManager.typeOfBirth, " Type of birth Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(10),fHQ_TestDataManager.typeOfBirthValueAdded, " Type of birth Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorContainsText("Has this relative ever had any miscarriages, still"),"Has this relative ever had any miscarriages, stillbirths?", "Has this relative ever had any miscarriages, stillbirths? Label " + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(11),fHQ_TestDataManager.hasThisRelativeEverHadAnyMiscarriagesOrStillbirthsValue, "  Has this relative ever had any miscarriages or stillbirths? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES),fHQ_TestDataManager.totalNumberOfMiscarriages," Total number of Miscarriages Label " + string);
		CharmsUtil.assertTextBoxData(softAssert,fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.TOTAL_NUMBER_OF_MISCARRIAGES),fHQ_TestDataManager.totalNumberOfMiscarriagesValue, "  Total number of Miscarriages Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS),fHQ_TestDataManager.totalNumberOfStillbirths," Total number of Stillbirths Label" + string);
		CharmsUtil.assertTextBoxData(softAssert,fHQSubmissionPage.dynamicLocatorTextBoxUsingInput(FHQConstants.TOTAL_NUMBER_OF_STILLBIRTHS),fHQ_TestDataManager.totalNumberOfStillbirthsValue, "  Total number of Stillbirths  Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_CANCER), fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancer, " Has this relative ever been diagnosed with cancer? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(13),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithCancerValue, "  Has this relative ever been diagnosed with cancer? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.HAS_THIS_RELATIVE_EVER_BEEN_DIAGNOSED_WITH_ANY_MEDICAL_CONDITIONS ), "Has this relative ever been diagnosed with any medical conditions?", " Has this relative ever been diagnosed with any medical conditions? Label" + string);
		CharmsUtil.assertDropDownData(softAssert,fHQSubmissionPage.dynamicLocatorForSelectedDropDown(14),fHQ_TestDataManager.hasThisRelativeEverBeenDiagnosedWithAnyOfTheMedicalConditionsListedBelowValue, "  Has this relative ever been diagnosed with any medical conditions? Value " + string);
		CharmsUtil.assertTextBoxData(softAssert, fHQSubmissionPage.dynamicLocatorUsingNormalizeSpace(FHQConstants.IS_THERE_ANYTHING_ELSE_YOU_WOULD_LIKE_US_TO_KNOW_ABOUT_THIS_RELATIVE),fHQ_TestDataManager.isThereAnythingElseYouWouldLikeUsToKnowAboutThisRelative," Is there anything else you would like us to know about this relative? Label "+ string);
		CharmsUtil.assertTextBoxData(softAssert,fHQSubmissionPage.dynamicLocatorTextBoxForReadOnlyInput1(FHQConstants.IS_THERE_ANYTHING_ELSE_YOU_WOULD_LIKE_US_TO_KNOW_ABOUT_THIS_RELATIVE),fHQ_TestDataManager.addAdditionalInformation, " Is there anything else you would like us to know about this relative? Value " + string);	
	}
}
