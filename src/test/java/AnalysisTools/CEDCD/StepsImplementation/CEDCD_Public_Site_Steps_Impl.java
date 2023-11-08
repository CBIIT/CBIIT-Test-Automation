package AnalysisTools.CEDCD.StepsImplementation;

import appsCommon.PageInitializer;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;

public class CEDCD_Public_Site_Steps_Impl extends PageInitializer {

    public void user_Selects_All_Types_From_the_Specimen_Type_dropdown(){
        CommonUtils.clickOnElement(cedcdBiospecimenCountsPage.specimenType);
        MiscUtils.sleep(1000);
        CommonUtils.clickOnElement(cedcdBiospecimenCountsPage.specimenTypeDropDownAllTypeValue);
        MiscUtils.sleep(1000);
    }

    public void the_User_Selects_All_Cancers_from_the_Cancer_Type_drop_down(){
        CommonUtils.clickOnElement(cedcdBiospecimenCountsPage.cancerType);
        MiscUtils.sleep(1000);
        CommonUtils.clickOnElement(cedcdBiospecimenCountsPage.cancerTypeDropDownAllTypeValues);
        MiscUtils.sleep(1000);
    }

    public void the_User_Selects_All_Cohorts_from_the_Cohorts_drop_down(){
        CommonUtils.clickOnElement(cedcdBiospecimenCountsPage.cohortType);
        MiscUtils.sleep(1000);
        CommonUtils.clickOnElement(cedcdBiospecimenCountsPage.cohortTypeDropDownAllTypeValue);
        MiscUtils.sleep(1000);
    }

    public void the_User_Clicks_search_on_biospecimen_counts_tab(){
        CommonUtils.clickOnElement(cedcdBiospecimenCountsPage.cohortType);
        MiscUtils.sleep(1000);
        CommonUtils.clickOnElement(cedcdBiospecimenCountsPage.biospecimenSubmitBtn);
    }

    public void the_user_clicks_on_the_Clear_All_button(){
        MiscUtils.sleep(1000);
        CommonUtils.clickOnElement(cedcdBiospecimenCountsPage.biospecimenClearAllBtn);
        MiscUtils.sleep(1000);
    }
}
