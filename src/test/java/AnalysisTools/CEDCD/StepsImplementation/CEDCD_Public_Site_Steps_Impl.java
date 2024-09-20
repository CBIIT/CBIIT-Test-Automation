package AnalysisTools.CEDCD.StepsImplementation;

import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.web.CommonUtils;

public class CEDCD_Public_Site_Steps_Impl extends PageInitializer {

    public void user_Selects_All_Types_From_the_Specimen_Type_dropdown(){
        CommonUtils.clickOnElement(cedcdBiospecimenCountsPage.specimenType);
        CommonUtils.sleep(1000);
        CommonUtils.clickOnElement(cedcdBiospecimenCountsPage.specimenTypeDropDownAllTypeValue);
        CommonUtils.sleep(1000);
    }

    public void the_User_Selects_All_Cancers_from_the_Cancer_Type_drop_down(){
        CommonUtils.clickOnElement(cedcdBiospecimenCountsPage.cancerType);
        CommonUtils.sleep(1000);
        CommonUtils.clickOnElement(cedcdBiospecimenCountsPage.cancerTypeDropDownAllTypeValues);
        CommonUtils.sleep(1000);
    }

    public void the_User_Selects_All_Cohorts_from_the_Cohorts_drop_down(){
        CommonUtils.clickOnElement(cedcdBiospecimenCountsPage.cohortType);
        CommonUtils.sleep(1000);
        CommonUtils.clickOnElement(cedcdBiospecimenCountsPage.cohortTypeDropDownAllTypeValue);
        CommonUtils.sleep(1000);
    }

    public void the_User_Clicks_search_on_biospecimen_counts_tab(){
        CommonUtils.clickOnElement(cedcdBiospecimenCountsPage.cohortType);
        CommonUtils.sleep(1000);
        CommonUtils.clickOnElement(cedcdBiospecimenCountsPage.biospecimenSubmitBtn);
    }

    public void the_user_clicks_on_the_Clear_All_button(){
        CommonUtils.sleep(1000);
        CommonUtils.clickOnElement(cedcdBiospecimenCountsPage.biospecimenClearAllBtn);
        CommonUtils.sleep(1000);
    }
}