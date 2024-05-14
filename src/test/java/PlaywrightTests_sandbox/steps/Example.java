package PlaywrightTests_sandbox.steps;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class Example {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext(new Browser.NewContextOptions()
                    .setViewportSize(1920, 867));
            Page page = context.newPage();

            page.navigate("https://service-test.nci.nih.gov/auth_redirect.do?sysparm_stack=no&sysparm_url=https%3A%2F%2Fauthtest.nih.gov%2Faffwebservices%2Fpublic%2Fsaml2sso%3FSAMLRequest%3DjVLLbsIwEPyVyPc8CAGERZBSUFUkSiOS9tCb4yxgKbFTrwPt3zevCnqhva5nZ2ZnvEBWFn5Fo9qc5B4%252BakBjfZaFRNq%252FhKTWkiqGAqlkJSA1nCbR85b6jkcrrYziqiBWhAjaCCVXSmJdgk5AnwWH1%252F02JCdjKqSui%252F3MNo2KI7lwpDg5R3V2ibVuRkKyluGKZ42rHjvg2OFwgWygQbeqs0Jwt3OKqIj1qDSH7paQHFiBQKzNOiTJbsU5ZDwIOIOcT2GSzSZjls093%252FNGfJKN8waIMUMUZ7iuItawkWiYNCHxPT%252BwvcAee%252BloRr059X1nOp6%252BEyseUngQMhfyeD%252ByrAchfUrT2I5fkrQjOIsc9K5B%252FyutN9DYJdUwkuWiC4B2dvVte%252FedsJ%252FKyPIvyYV7KzEIVrT1u1nHqinhy4qKQl1WGphpbjC6hq6Okpn7LtqJyO1DB6VVexgakIa4y0H19%252B9cfgM%253D%26RelayState%3Dhttps%253A%252F%252Fservice-test.nci.nih.gov%252Fsaml_redirector.do%253Fsysparm_nostack%253Dtrue%2526sysparm_uri%253D%25252Fnav_to.do%25253Furi%25253D%2525252Fnih-ssj.do#/");
            page.navigate("https://authtest.nih.gov/CertAuthV3/forms/PIVandUserPass.aspx?TYPE=33554433&REALMOID=06-cb35c56a-d473-482b-b0b6-55a949080b3a&GUID=&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=KBOVzJPmg7U9p2DaNAD3qDXdXMgspkc0na0nj5mEHO0BNjfVBVkwRJb6LR9zr7VV&TARGET=-SM-HTTPS%3a%2f%2fauthtest%2enih%2egov%2faffwebservices%2fredirectjsp%2fSAML2redirect%2ejsp%3fSAMLRequest%3djVLLbsIwEPyVyPc8CAGERZBSUFUkSiOS9tCb4yxgKbFTrwPt3zevCnqhva5nZ2ZnvEBWFn5Fo9qc5B4-%2BakBjfZaFRNq-%2FhKTWkiqGAqlkJSA1nCbR85b6jkcrrYziqiBWhAjaCCVXSmJdgk5AnwWH1-%2F02JCdjKqSui-%2F3MNo2KI7lwpDg5R3V2ibVuRkKyluGKZ42rHjvg2OFwgWygQbeqs0Jwt3OKqIj1qDSH7paQHFiBQKzNOiTJbsU5ZDwIOIOcT2GSzSZjls093-%2FNGfJKN8waIMUMUZ7iuItawkWiYNCHxPT-%2BwvcAee-%2BloRr059X1nOp6-%2BEyseUngQMhfyeD-%2ByrAchfUrT2I5fkrQjOIsc9K5B-%2FyutN9DYJdUwkuWiC4B2dvVte-%2FedsJ-%2FKyPIvyYV7KzEIVrT1u1nHqinhy4qKQl1WGphpbjC6hq6Okpn7LtqJyO1DB6VVexgakIa4y0H19-%2B9cfgM-%3D%26RelayState%3dhttps-%3A-%2F-%2Fservice--test%2enci%2enih%2egov-%2Fsaml_redirector%2edo-%3Fsysparm_nostack-%3Dtrue-%26sysparm_uri-%3D-%252Fnav_to%2edo-%253Furi-%253D-%25252Fnih--ssj%2edo%26SMPORTALURL%3dhttps-%3A-%2F-%2Fauthtest%2enih%2egov-%2Faffwebservices-%2Fpublic-%2Fsaml2sso%26SAMLTRANSACTIONID%3dfa1f7873--d19c194c--2b1a1bbe--511fba6e--621d880a--883");


            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("+ Create Vacancy")).click();


            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save")).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save")).click();


            page.getByText("A vacancy title is required.").click();
            assertThat(page.locator("body")).containsText("A vacancy title is required.");
            page.getByPlaceholder("Please enter").click();


            page.getByPlaceholder("Please enter").fill("Testing Title");

            page.locator("#BasicInfo_description div").nth(2).click();



            page.locator("#BasicInfo_description div").nth(2).fill("Vacancy description text");


            page.getByLabel("Utilizing a Set Close Date").check();


            assertThat(page.getByLabel("Close Date", new Page.GetByLabelOptions().setExact(true))).isVisible();
            page.getByLabel("Allow HR Specialist to Triage").check();


            assertThat(page.locator("#BasicInfo")).containsText("Allow HR Specialist to Triage");



            page.getByLabel("Are you the point of contact").click();
            assertThat(page.locator("body")).containsText("Yes");
            page.getByLabel("Are you the point of contact").click();
            page.getByTitle("No").locator("div").click();
            page.locator("#BasicInfo").getByTitle("No").click();
            page.locator("#BasicInfo").getByText("No", new Locator.GetByTextOptions().setExact(true)).click();
            assertThat(page.locator("#BasicInfo")).containsText("No");




            page.locator("#BasicInfo").getByText("No", new Locator.GetByTextOptions().setExact(true)).click();
            page.getByText("Yes", new Page.GetByTextOptions().setExact(true)).click();

            assertThat(page.locator("#BasicInfo")).containsText("Holly Gemar-Griffith");



            page.getByLabel("Open Date").click();
            page.getByText("30", new Page.GetByTextOptions().setExact(true)).click();


            page.getByLabel("Close Date", new Page.GetByLabelOptions().setExact(true)).click();
            page.locator("div:nth-child(105) > div > .ant-picker-dropdown > .ant-picker-panel-container > .ant-picker-panel > .ant-picker-date-panel > .ant-picker-header > .ant-picker-header-next-btn").click();
            page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName("31")).locator("div").click();





            page.getByLabel("Scoring Due By Date").click();
            page.locator("div:nth-child(106) > div > .ant-picker-dropdown > .ant-picker-panel-container > .ant-picker-panel > .ant-picker-date-panel > .ant-picker-header > .ant-picker-header-next-btn").click();
            page.getByRole(AriaRole.TABLE).getByTitle("-05-30").locator("div").click();


            assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("plus Add More"))).isVisible();



            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("plus Add More")).click();
            page.locator("#BasicInfo_applicationDocuments_4_document").click();
            page.locator("#BasicInfo_applicationDocuments_4_document").fill("Reference Letter");

            assertThat(page.locator("#BasicInfo")).containsText("Enable Reference Collection");
            assertThat(page.locator("#BasicInfo")).containsText("15");
            assertThat(page.locator("#BasicInfo")).containsText("6");











            assertThat(page.getByRole(AriaRole.TOOLTIP)).containsText("Select the Intramural or Extramural Professional Designation for your vacancy. Select “N/A” for Stadtman positions.");
            page.locator("label").filter(new Locator.FilterOptions().setHasText("Position Classification")).locator("a").click();





            page.locator("label").filter(new Locator.FilterOptions().setHasText("Organizational Code")).locator("a").click();
            assertThat(page.getByRole(AriaRole.TOOLTIP)).containsText("Provide SAC code for organization where the position will reside.");


            page.locator("label").filter(new Locator.FilterOptions().setHasText("Personnel Action Tracking Solution (PATS) Initiator")).locator("a").click();
            assertThat(page.getByRole(AriaRole.TOOLTIP)).containsText("Populate the individual who will be assembling the appointment package within the Personnel Action Tracking Solution (PATS). Value defaults to the SSJ Vacancy Manager, but can be updated within the SSJ or later in PATS.");

            page.getByLabel("Position Classification").click();
            page.getByTitle("Research Fellow", new Page.GetByTitleOptions().setExact(true)).locator("div").click();
            page.getByLabel("Organizational Code").click();
            page.getByTitle("HNC", new Page.GetByTitleOptions().setExact(true)).locator("div").click();



            assertThat(page.locator("#BasicInfo")).containsText("Holly Gemar-Griffith");
            page.getByText("Holly Gemar-Griffith").nth(1).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save")).click();
        }
    }
}