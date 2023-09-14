package ServiceNow.SCSS.StepsImplementation;

import appsCommon.PageInitializer;
import com.nci.automation.web.CommonUtils;

public class ApplicantFlowStepsImplementation extends PageInitializer {
    public void clickEditButton(String tab){
        if(tab.equals("Basic Information")){
            CommonUtils.clickOnElement(applicantFlowPage.btnEditProfileTab);
        }else if(tab.equals("Demographics")){
            CommonUtils.clickOnElement(applicantFlowPage.tabDemographics);
            CommonUtils.clickOnElement(applicantFlowPage.btnEditProfileTab);
        }
    }

    public void pickDegree(String degree){
        if(degree.equals("Masters")){
            CommonUtils.clickOnElement(applicantFlowPage.dropdownDegree);
            CommonUtils.clickOnElement(applicantFlowPage.degreeMasters);
        }else if(degree.equals("Bachelors")){
            CommonUtils.clickOnElement(applicantFlowPage.dropdownDegree);
            CommonUtils.clickOnElement(applicantFlowPage.degreeBachelors);
        }
    }
}
