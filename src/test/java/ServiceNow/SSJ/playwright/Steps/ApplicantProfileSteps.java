package ServiceNow.SSJ.playwright.Steps;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.EncryptionUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.ConfUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.en.Given;

public class ApplicantProfileSteps {

    @Given("User is on SCSS Landing page and user is {string} - PW")
    public void user_is_on_scss_landing_page_and_user_is_pw(String string) {
        PlaywrightUtils.page.navigate(EnvUtils.getApplicationUrl("nativeviewSideDoor"));
        //PlaywrightUtils.page.getByLabel("User name").click();
        PlaywrightUtils.page.getByLabel("User name").fill(ConfUtils.getProperty("SideDoorUsername"));
        //PlaywrightUtils.page.getByLabel("Password", new Page.GetByLabelOptions().setExact(true)).click();
        PlaywrightUtils.page.getByLabel("Password", new Page.GetByLabelOptions().setExact(true)).fill(EncryptionUtils.decrypt(ConfUtils.getProperty("SideDoorPassword")));
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log in")).click();
        PlaywrightUtils.page.getByLabel("Avatar: available, user").click();
        PlaywrightUtils.page.getByRole(AriaRole.MENUITEM, new Page.GetByRoleOptions().setName("Impersonate user")).click();
        PlaywrightUtils.page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Select a user")).click();

        //PlaywrightUtils.page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Select a user")).fill("Abhishek Desai");

        PlaywrightUtils.page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Select a user")).fill("Abhishek Desai");

        PlaywrightUtils.page.locator("seismic-hoist").getByRole(AriaRole.OPTION, new Locator.GetByRoleOptions().setName("Abhishek Desai Abhishek Desai")).click();
        MiscUtils.sleep(2000);
        // PlaywrightUtils.page.getByRole(AriaRole.RADIO, new Page.GetByRoleOptions().setName("Abhishek Desai Abhishek Desai")).click();
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Impersonate user")).click();
        PlaywrightUtils.page.navigate(EnvUtils.getApplicationUrl("AppTracker"));
    }

    @Given("User is on Profile tab - PW")
    public void user_is_on_profile_tab_pw() {
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Profile")).click();
    }

    @Given("User inputs {string} into first name field - PW")
    public void user_inputs_into_first_name_field_pw(String firstName) {
        PlaywrightUtils.page.getByLabel("First Name").fill(firstName);
    }

    @Given("User inputs {string} into last name field - PW")
    public void user_inputs_into_last_name_field_pw(String lastName) {
        PlaywrightUtils.page.getByLabel("Last Name").fill(lastName);
    }

    @Given("User inputs {string} into email field - PW")
    public void user_inputs_into_email_field_pw(String email) {
        PlaywrightUtils.page.getByLabel("Email").fill(email);
    }

    @Given("User inputs {string} into phone field - PW")
    public void user_inputs_into_phone_field_pw(String phoneNumber) {
        PlaywrightUtils.page.getByLabel("Phone", new Page.GetByLabelOptions().setExact(true)).fill(phoneNumber);
    }
}
