package ANALYSIS_TOOLS.ACT24.stepsImpl;

import APPS_COMMON.PageInitializers.PageInitializer;
import com.nci.automation.web.CommonUtils;

public class ACT24ParticipantStepImpl extends PageInitializer {

    /** THIS ADDS A WAKE UP TIME TO THE SPLASH SCREEN UPON PARTICIPANT LOGIN **/
    public void addWakeTimeOnSplashScreen(){
        CommonUtils.clickOnElement(act24ParticipantPortalPage.splashScreenLastPageButton);
        CommonUtils.clickOnElement(act24ParticipantPortalPage.nextButtonOnSplashScreen);
        CommonUtils.clickOnElement(act24ParticipantPortalPage.wakeupTimeOnSplashScreenButton);
    }
}
