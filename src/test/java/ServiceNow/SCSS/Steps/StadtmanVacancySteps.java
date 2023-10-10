package ServiceNow.SCSS.Steps;

import appsCommon.PageInitializer;
import com.nci.automation.web.CommonUtils;


public class StadtmanVacancySteps  extends PageInitializer {

    @Given("User marks Enables Focus Area as checked")
    public void user_marks_enables_focus_area_as_checked() {
        CommonUtils.clickOnElement(stadtmanVacancyPage.enableFocusAreaCheckbox);
    }
}
