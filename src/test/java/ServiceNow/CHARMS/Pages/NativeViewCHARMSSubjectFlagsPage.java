package ServiceNow.CHARMS.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NativeViewCHARMSSubjectFlagsPage {

    /**
     * Native View Participant Text Box
     */
    @FindBy(xpath = "//input[@name='sys_display.x_naci_family_coho_subject_flag.participant']")
    public WebElement subjectFlagsParticipantTextBox;

    /**
     * Native View Subject Flags Preview Record for Field: Study. Button
     */
    @FindBy(xpath = "//button[@aria-label='Preview record for field: Study']")
    public WebElement subjectFlagsPreviewRecordForFieldStudyButton;

    /**
     * Native View Subject Flags IBMFS Affected Status Text
     */
    @FindBy(xpath = "//span[normalize-space()='IBMFS Affected Status']")
    public WebElement subjectFlagsIBMFSAffectedStatusText;

    /**
     * Native View Subject Flags IBMFS Affected Status Drop Down
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_subject_flag.ibmfs_affected_status']")
    public WebElement subjectFlagsIBMFSAffectedStatusDropDown;

    public NativeViewCHARMSSubjectFlagsPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
