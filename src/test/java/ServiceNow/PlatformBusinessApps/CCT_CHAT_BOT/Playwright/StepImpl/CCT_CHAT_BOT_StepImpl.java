package ServiceNow.PlatformBusinessApps.CCT_CHAT_BOT.Playwright.StepImpl;

import ServiceNow.PlatformBusinessApps.CCT_CHAT_BOT.Playwright.Constants.CCT_CHAT_BOT_Constants;
import ServiceNow.PlatformBusinessApps.CCT_CHAT_BOT.Playwright.Pages.CCT_CHAT_BOT_Page;
import appsCommon.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.PlaywrightUtils;
import org.testng.Assert;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class CCT_CHAT_BOT_StepImpl {
    public static Page cctChatBotWindow;
    public static Page nciMcCaskillStevensK12AwardsPage;
    public static String firstTabUrl;
    public static String nciMcCaskillStevensK12AwardsPageUrl;

    /**
     * THIS METHOD NAVIGATES TO NATIVE VIEW AND
     * OPENS THE ACTIVE FIND FUNDING CCT CHATBOT WINDOW TO TEST CCT CHAT ADDITIONAL K12 LINKS
     */
    public static void the_user_opens_the_find_funding_chatbot_on_the_nv() {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login();
        PlaywrightUtils.page.getByPlaceholder(CCT_CHAT_BOT_Page.nv_Search_Text_Box_Filter).click();
        PlaywrightUtils.page.getByPlaceholder(CCT_CHAT_BOT_Page.nv_Search_Text_Box_Filter).fill(CCT_CHAT_BOT_Constants.NV_SEARCH_TEXT_BOX_DESIGNER);
        assertThat(PlaywrightUtils.page.getByLabel(CCT_CHAT_BOT_Page.nv_Search_Filter_All_Menu_Label, new Page.GetByLabelOptions().setExact(true))).containsText(CCT_CHAT_BOT_Constants.NV_SEARCH_TEXT_BOX_DESIGNER);
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(CCT_CHAT_BOT_Constants.NV_SEARCH_TEXT_BOX_DESIGNER).setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot();
        PlaywrightUtils.page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).getByTestId(CCT_CHAT_BOT_Page.nv_Designer_Page_Active_Filter_Test_ID).selectOption(CCT_CHAT_BOT_Constants.NV_DESIGNER_PAGE_ACTIVE_FILTER_TRUE);
        assertThat(PlaywrightUtils.page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).getByTestId(CCT_CHAT_BOT_Page.nv_Designer_Page_Active_Filter_Test_ID)).isVisible();
        assertThat(PlaywrightUtils.page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).getByTestId(CCT_CHAT_BOT_Page.nv_Designer_Page_Active_Filter_Test_ID)).hasValue(CCT_CHAT_BOT_Constants.NV_DESIGNER_PAGE_ACTIVE_FILTER_TRUE);
        assertThat(PlaywrightUtils.page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).getByRole(AriaRole.LIST)).containsText(CCT_CHAT_BOT_Constants.NV_DESIGNER_PAGE_FIND_FUNDING_TEXT);
        assertThat(PlaywrightUtils.page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).getByRole(AriaRole.LIST)).containsText(CCT_CHAT_BOT_Constants.NV_DESIGNER_PAGE_CCT_CHATBOT_TEXT);
        CucumberLogUtils.playwrightScreenshot();
        PlaywrightUtils.page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName(CCT_CHAT_BOT_Page.nv_Designer_Page_Find_Funding_CCT_ChatBot_Selected)).click();
        assertThat(PlaywrightUtils.page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Designer_Page_Header_Locator)).containsText(CCT_CHAT_BOT_Constants.NV_DESIGNER_PAGE_VIRTUAL_AGENT_DESIGNER_TAB_TEXT);
        assertThat(PlaywrightUtils.page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).getByTestId(CCT_CHAT_BOT_Page.nv_Designer_Page_Topic_Name_Test_ID)).containsText(CCT_CHAT_BOT_Constants.NV_DESIGNER_PAGE_FIND_FUNDING_BOX_TEXT);
        assertThat(PlaywrightUtils.page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Designer_Page_Language_Panel_Tab_Locator)).containsText(CCT_CHAT_BOT_Constants.NV_DESIGNER_PAGE_LANGUAGES_TAB_TEXT);
        CucumberLogUtils.playwrightScreenshot();
        PlaywrightUtils.page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).getByRole(AriaRole.TAB, new FrameLocator.GetByRoleOptions().setName(CCT_CHAT_BOT_Page.nv_Designer_Page_Languages_Tab)).click();
        assertThat(PlaywrightUtils.page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Language_Tab_Page_Test_Link_Locator)).containsText(CCT_CHAT_BOT_Constants.NV_LANGUAGES_TAB_TEST_LINK_TEXT);
        CucumberLogUtils.playwrightScreenshot();
        firstTabUrl =  PlaywrightUtils.page.url();
        cctChatBotWindow = PlaywrightUtils.page.waitForPopup(() -> {
            PlaywrightUtils.page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName(CCT_CHAT_BOT_Page.nv_Language_Tab_Test_Link)).click();
        });
        CucumberLogUtils.playwrightScreenshot1(cctChatBotWindow);
    }

    /**
     * THIS METHOD SELECTS YES FOR QUESTION ONE ON CCT CHATBOT WINDOW
     */
    public static void selects_yes_to_q1_regarding_finding_funding_opportunities() {
        MiscUtils.sleep(5000); //wait for pop-up CCT ChatBot Window
        assertThat(cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Q_One_Locator)).containsText(CCT_CHAT_BOT_Constants.NV_CCT_CHAT_WINDOW_Q_ONE_TEXT);
        assertThat(cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName(CCT_CHAT_BOT_Constants.NV_CCT_CHAT_WINDOW_Q_OPTION_YES_TEXT))).isVisible();
        CucumberLogUtils.playwrightScreenshot();
        CucumberLogUtils.playwrightScreenshot1(cctChatBotWindow);
        cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Q_Option_Yes_Selected)).click();
        assertThat(cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Q_One_Fragment_Locator)).containsText(CCT_CHAT_BOT_Constants.NV_CCT_CHAT_WINDOW_Q_OPTION_YES_TEXT);
        CucumberLogUtils.playwrightScreenshot();
        CucumberLogUtils.playwrightScreenshot1(cctChatBotWindow);
    }

    /**
     * THIS METHOD SELECTS ESTABLISHED INVESTIGATOR FOR Q2 REGARDING CAREER STAGE ON CCT CHATBOT WINDOW
     * @param establishedInvestigator
     */
    public static void selects_for_q2_regarding_career_stage(String establishedInvestigator) {
        assertThat(cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Locator)).containsText(CCT_CHAT_BOT_Constants.NV_CCT_CHAT_WINDOW_Q_TWO_TEXT);
        assertThat(cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Locator)).containsText(establishedInvestigator);
        cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Q_Option_Established_Investigator_Selected)).click();
        CucumberLogUtils.playwrightScreenshot();
        CucumberLogUtils.playwrightScreenshot1(cctChatBotWindow);
    }

    /**
     * THIS METHOD SELECTS USA FOR Q3 REGARDING CAREER STAGE ON CCT CHATBOT WINDOW
     * @param usa
     */
    public static void selects_for_q3_about_research_training_location(String usa) {
        assertThat(cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Locator)).containsText(CCT_CHAT_BOT_Constants.NV_CCT_CHAT_WINDOW_Q_THREE_TEXT);
        assertThat(cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Locator)).containsText(usa);
        cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Q_Option_USA_Selected).setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot();
    }

    /**
     * THIS METHOD SELECTS YES FOR QUESTION FOUR ON CCT CHATBOT WINDOW
     * @param yes
     */
    public static void the_user_selects_for_q4_indicating_they_belong_to_an_underrepresented_group(String yes) {
        assertThat(cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Locator)).containsText(CCT_CHAT_BOT_Constants.NV_CCT_CHAT_WINDOW_Q_FOUR_TEXT);
        assertThat(cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Locator)).containsText(yes);
        cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Q_Option_Yes_Selected)).click();
        CucumberLogUtils.playwrightScreenshot();
    }

    /**
     * THIS METHOD VERIFIES THE EXPECTED LINK
     * AND ALSO VERIFIES THAT IT IS ON TOP OF THE LINKS LIST
     * @param careerDevelopmentAwardLink
     */
    public static void the_link_should_be_displayed_at_the_top_of_the_list(String careerDevelopmentAwardLink) {
        assertThat(cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Locator)).containsText(CCT_CHAT_BOT_Constants.NV_CCT_CHAT_WINDOW_EXPECTED_LINK_ON_TOP_OF_THE_LIST);
        assertThat(cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Locator)).containsText(careerDevelopmentAwardLink);
        CucumberLogUtils.playwrightScreenshot();
    }

    /**
     * THIS METHOD VERIFIES THE URL FOR THE LINK
     * @param expectedURL
     */
    public static void the_link_to_career_development_award_for_community_oncology_and_prevention_research_k12_pi_should_be_clickable(String expectedURL) {
        MiscUtils.sleep(5000); //wait for the link to open in new tab
        assertThat(cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Locator).getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Expected_Link_Selected))).isVisible();
        nciMcCaskillStevensK12AwardsPage = cctChatBotWindow.waitForPopup(() -> {
            cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Locator).getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Expected_Link_Selected)).click();
        });
        assertThat(nciMcCaskillStevensK12AwardsPage.getByLabel(CCT_CHAT_BOT_Constants.NV_CCT_NEW_TAB_OPENED_PAGE_HEADER_TEXT)).isVisible();
        CucumberLogUtils.playwrightScreenshot();
        nciMcCaskillStevensK12AwardsPageUrl = nciMcCaskillStevensK12AwardsPage.url();
        Assert.assertEquals(nciMcCaskillStevensK12AwardsPageUrl,expectedURL);
    }

    /**
     * THIS METHOD VERIFIES THAT LINK IS OPENED IN A NEW TAB
     */
    public static void the_link_should_open_in_a_new_tab() {
        Assert.assertNotEquals(firstTabUrl,nciMcCaskillStevensK12AwardsPageUrl);
        assertThat(nciMcCaskillStevensK12AwardsPage.locator(CCT_CHAT_BOT_Page.nv_New_Tab_Opened_Page_Header_Locator)).containsText(CCT_CHAT_BOT_Constants.NV_CCT_NEW_TAB_OPENED_PAGE_HEADER_ONE_TEXT);
        CucumberLogUtils.playwrightScreenshot();
    }
}