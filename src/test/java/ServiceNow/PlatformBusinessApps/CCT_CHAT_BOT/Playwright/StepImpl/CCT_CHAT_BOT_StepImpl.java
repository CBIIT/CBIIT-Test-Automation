package ServiceNow.PlatformBusinessApps.CCT_CHAT_BOT.Playwright.StepImpl;

import ServiceNow.PlatformBusinessApps.CCT_CHAT_BOT.Playwright.Constants.CCT_CHAT_BOT_Constants;
import ServiceNow.PlatformBusinessApps.CCT_CHAT_BOT.Playwright.Pages.CCT_CHAT_BOT_Page;
import appsCommon.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import org.testng.Assert;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;

public class CCT_CHAT_BOT_StepImpl {
    public static Page cctChatBotWindow;
    public static Page nciMcCaskillStevensK12AwardsPage;
    public static Page nciMentoredResearchScientistDevelopmentAwardPage;
    public static String firstTabUrl;
    public static String nciMcCaskillStevensK12AwardsPageUrl;
    public static String nciMentoredResearchScientistDevelopmentAwardPageUrl;

    /**
     * THIS METHOD NAVIGATES TO NATIVE VIEW AND
     * OPENS THE ACTIVE FIND FUNDING CCT CHATBOT WINDOW TO TEST CCT CHAT ADDITIONAL K12 LINKS
     */
    public static void the_user_opens_the_find_funding_chatbot_on_the_nv() {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login();
        page.getByPlaceholder(CCT_CHAT_BOT_Page.nv_Search_Text_Box_Filter).click();
        page.getByPlaceholder(CCT_CHAT_BOT_Page.nv_Search_Text_Box_Filter).fill(CCT_CHAT_BOT_Constants.NV_SEARCH_TEXT_BOX_DESIGNER);
        assertThat(page.getByLabel(CCT_CHAT_BOT_Page.nv_Search_Filter_All_Menu_Label, new Page.GetByLabelOptions().setExact(true))).containsText(CCT_CHAT_BOT_Constants.NV_SEARCH_TEXT_BOX_DESIGNER);
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(CCT_CHAT_BOT_Constants.NV_SEARCH_TEXT_BOX_DESIGNER).setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).getByTestId(CCT_CHAT_BOT_Page.nv_Designer_Page_Active_Filter_Test_ID).selectOption(CCT_CHAT_BOT_Constants.NV_DESIGNER_PAGE_ACTIVE_FILTER_TRUE);
        assertThat(page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).getByTestId(CCT_CHAT_BOT_Page.nv_Designer_Page_Active_Filter_Test_ID)).isVisible();
        assertThat(page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).getByTestId(CCT_CHAT_BOT_Page.nv_Designer_Page_Active_Filter_Test_ID)).hasValue(CCT_CHAT_BOT_Constants.NV_DESIGNER_PAGE_ACTIVE_FILTER_TRUE);
        assertThat(page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).getByRole(AriaRole.LIST)).containsText(CCT_CHAT_BOT_Constants.NV_DESIGNER_PAGE_FIND_FUNDING_TEXT);
        assertThat(page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).getByRole(AriaRole.LIST)).containsText(CCT_CHAT_BOT_Constants.NV_DESIGNER_PAGE_CCT_CHATBOT_TEXT);
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName(CCT_CHAT_BOT_Page.nv_Designer_Page_Find_Funding_CCT_ChatBot_Selected)).click();
        assertThat(page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Designer_Page_Header_Locator)).containsText(CCT_CHAT_BOT_Constants.NV_DESIGNER_PAGE_VIRTUAL_AGENT_DESIGNER_TAB_TEXT);
        assertThat(page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).getByTestId(CCT_CHAT_BOT_Page.nv_Designer_Page_Topic_Name_Test_ID)).containsText(CCT_CHAT_BOT_Constants.NV_DESIGNER_PAGE_FIND_FUNDING_BOX_TEXT);
        assertThat(page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Designer_Page_Language_Panel_Tab_Locator)).containsText(CCT_CHAT_BOT_Constants.NV_DESIGNER_PAGE_LANGUAGES_TAB_TEXT);
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).getByRole(AriaRole.TAB, new FrameLocator.GetByRoleOptions().setName(CCT_CHAT_BOT_Page.nv_Designer_Page_Languages_Tab)).click();
        assertThat(page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Language_Tab_Page_Test_Link_Locator)).containsText(CCT_CHAT_BOT_Constants.NV_LANGUAGES_TAB_TEST_LINK_TEXT);
        CucumberLogUtils.playwrightScreenshot(page);
        firstTabUrl =  page.url();
        cctChatBotWindow = page.waitForPopup(() -> {
            page.frameLocator(CCT_CHAT_BOT_Page.nv_Page_Frame_Locator).getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName(CCT_CHAT_BOT_Page.nv_Language_Tab_Test_Link)).click();
        });
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * THIS METHOD SELECTS YES FOR QUESTION ONE ON CCT CHATBOT WINDOW
     */
    public static void selects_yes_to_q1_regarding_finding_funding_opportunities() {
        CommonUtils.sleep(5000); //wait for pop-up CCT ChatBot Window
        assertThat(cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Q_One_Locator)).containsText(CCT_CHAT_BOT_Constants.NV_CCT_CHAT_WINDOW_Q_ONE_TEXT);
        assertThat(cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName(CCT_CHAT_BOT_Constants.NV_CCT_CHAT_WINDOW_Q_OPTION_YES_TEXT))).isVisible();
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
        cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Q_Option_Yes_Selected)).click();
        assertThat(cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Q_One_Fragment_Locator)).containsText(CCT_CHAT_BOT_Constants.NV_CCT_CHAT_WINDOW_Q_OPTION_YES_TEXT);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * THIS METHOD SELECTS ESTABLISHED INVESTIGATOR FOR Q2 REGARDING CAREER STAGE ON CCT CHATBOT WINDOW
     * @param establishedInvestigator
     */
    public static void selects_for_q2_regarding_career_stage(String establishedInvestigator) {
        assertThat(cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Locator)).containsText(CCT_CHAT_BOT_Constants.NV_CCT_CHAT_WINDOW_Q_TWO_TEXT);
        assertThat(cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Locator)).containsText(establishedInvestigator);
        cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Q_Option_Established_Investigator_Selected)).click();
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * THIS METHOD SELECTS USA FOR Q3 REGARDING CAREER STAGE ON CCT CHATBOT WINDOW
     * @param usa
     */
    public static void selects_for_q3_about_research_training_location(String usa) {
        assertThat(cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Locator)).containsText(CCT_CHAT_BOT_Constants.NV_CCT_CHAT_WINDOW_Q_THREE_TEXT);
        assertThat(cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Locator)).containsText(usa);
        cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Q_Option_USA_Selected).setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * THIS METHOD SELECTS YES FOR QUESTION FOUR ON CCT CHATBOT WINDOW
     * @param yes
     */
    public static void the_user_selects_for_q4_indicating_they_belong_to_an_underrepresented_group(String yes) {
        assertThat(cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Locator)).containsText(CCT_CHAT_BOT_Constants.NV_CCT_CHAT_WINDOW_Q_FOUR_TEXT);
        assertThat(cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Locator)).containsText(yes);
        cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Q_Option_Yes_Selected)).click();
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * THIS METHOD VERIFIES THE EXPECTED LINK
     * AND ALSO VERIFIES THAT IT IS ON TOP OF THE LINKS LIST
     * @param careerDevelopmentAwardLink
     */
    public static void the_link_should_be_displayed_at_the_top_of_the_list(String careerDevelopmentAwardLink) {
        assertThat(cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Locator)).containsText(CCT_CHAT_BOT_Constants.NV_CCT_CHAT_WINDOW_EXPECTED_LINK_ON_TOP_OF_THE_LIST);
        assertThat(cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Locator)).containsText(careerDevelopmentAwardLink);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * THIS METHOD VERIFIES THE URL FOR THE LINK
     * @param expectedURL
     */
    public static void the_link_to_career_development_award_for_community_oncology_and_prevention_research_k12_pi_should_be_clickable(String expectedURL) {
        CommonUtils.sleep(5000); //wait for the link to open in new tab
        assertThat(cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Locator).getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Expected_Link_Selected))).isVisible();
        nciMcCaskillStevensK12AwardsPage = cctChatBotWindow.waitForPopup(() -> {
            cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Locator).getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Expected_Link_Selected)).click();
        });
        assertThat(nciMcCaskillStevensK12AwardsPage.getByLabel(CCT_CHAT_BOT_Constants.NV_CCT_NEW_TAB_OPENED_PAGE_HEADER_TEXT)).isVisible();
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
        nciMcCaskillStevensK12AwardsPageUrl = nciMcCaskillStevensK12AwardsPage.url();
        Assert.assertEquals(nciMcCaskillStevensK12AwardsPageUrl,expectedURL);
        CucumberLogUtils.playwrightScreenshot(nciMcCaskillStevensK12AwardsPage);
    }

    /**
     * THIS METHOD VERIFIES THAT LINK IS OPENED IN A NEW TAB
     */
    public static void the_link_should_open_in_a_new_tab() {
        Assert.assertNotEquals(firstTabUrl,nciMcCaskillStevensK12AwardsPageUrl);
        assertThat(nciMcCaskillStevensK12AwardsPage.locator(CCT_CHAT_BOT_Page.nv_New_Tab_Opened_Page_Header_Locator)).containsText(CCT_CHAT_BOT_Constants.NV_CCT_NEW_TAB_OPENED_PAGE_HEADER_ONE_TEXT);
        CucumberLogUtils.playwrightScreenshot(nciMcCaskillStevensK12AwardsPage);
    }

    /**
     * Selects an option for question four in the CCT Chatbot window, indicating that the user belongs to an underrepresented group.
     *
     * @param no The selected option for question four
     */
    public static void the_user_selects_for_question4_indicating_they_belong_to_an_underrepresented_group(String no) {
        assertThat(cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Locator)).containsText(CCT_CHAT_BOT_Constants.NV_CCT_CHAT_WINDOW_Q_FOUR_TEXT);
        cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Q_Option_No_Selected)).click();
        assertThat(cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Locator)).containsText(no);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Method to simulate a user selecting an option for question two regarding career stage on the CCT Chatbot window.
     *
     * @param postDoctoral The career stage option selected by the user for question two
     */
    public static void user_selects_for_q2_regarding_career_stage(String postDoctoral) {
        assertThat(cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Locator)).containsText(CCT_CHAT_BOT_Constants.NV_CCT_CHAT_WINDOW_Q_TWO_TEXT);
        assertThat(cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Locator)).containsText(postDoctoral);
        cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName(postDoctoral)).click();
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Selects an option for question four in the CCT Chatbot window, indicating that the user belongs to an underrepresented group.
     *
     * @param yes The selected option for question four
     * @param areYouACitizenOfTheUSA The response to the question about being a citizen of the USA
     */
    public static void selects_for_q4(String yes, String areYouACitizenOfTheUSA) {
        assertThat(cctChatBotWindow.frameLocator("iframe[title=\"Conversation Preview Pane\"]").locator("now-chat-window")).containsText(yes);
        assertThat(cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Locator)).containsText(areYouACitizenOfTheUSA);
        cctChatBotWindow.frameLocator("iframe[title=\"Conversation Preview Pane\"]").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName(yes)).click();
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * The user selects options for Question 5 in the CCT Chatbot window.
     *
     * @param yes The selected option for the first choice
     * @param doYouConsiderYourselfToBelongToAnUnderrepresentedGroup The selected option for the second choice
     */
    public static void the_user_selects_for_q5(String yes, String doYouConsiderYourselfToBelongToAnUnderrepresentedGroup) {
        assertThat(cctChatBotWindow.frameLocator("iframe[title=\"Conversation Preview Pane\"]").locator("now-chat-window")).containsText(doYouConsiderYourselfToBelongToAnUnderrepresentedGroup);
        assertThat(cctChatBotWindow.frameLocator("iframe[title=\"Conversation Preview Pane\"]").locator("now-chat-window")).containsText(yes);
        cctChatBotWindow.frameLocator("iframe[title=\"Conversation Preview Pane\"]").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName(yes)).click();
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Verifies that the specified link is displayed at the top of the funding list in the chatbot window.
     *
     * @param nciMentoredResearchScientistDevelopmentAwardK01Link The link to be verified at the top of the funding list
     */
    public static void the_link_should_be_displayed_at_the_top_of_the_funding_list(String nciMentoredResearchScientistDevelopmentAwardK01Link) {
        cctChatBotWindow.frameLocator("iframe[title=\"Conversation Preview Pane\"]").locator("now-chat-window").scrollIntoViewIfNeeded();
        assertThat(cctChatBotWindow.frameLocator("iframe[title=\"Conversation Preview Pane\"]").locator("now-chat-window")).containsText(nciMentoredResearchScientistDevelopmentAwardK01Link);

        //This assertion verifies that this link is the first/top of the links
        assertThat(cctChatBotWindow.frameLocator("iframe[title=\"Conversation Preview Pane\"]").locator("now-chat-window")).containsText("You may be eligible for the following programs:NCI Mentored Research Scientist Development Award (K01)");
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Verifies that the link with the specified label should be clickable.
     *
     * @param nciMentoredResearchScientistDevelopmentAwardK01Label The label of the link to be clicked
     * @param expectedURL The expected URL that the link should navigate to
     */
    public static void the_link_to_as_should_be_clickable(String nciMentoredResearchScientistDevelopmentAwardK01Label, String expectedURL) {
        CommonUtils.sleep(5000); //wait for the link to open in new tab
        assertThat(cctChatBotWindow.frameLocator("iframe[title=\"Conversation Preview Pane\"]").locator("now-chat-window")).containsText(nciMentoredResearchScientistDevelopmentAwardK01Label);
        nciMentoredResearchScientistDevelopmentAwardPage = cctChatBotWindow.waitForPopup(() -> {
            cctChatBotWindow.frameLocator("iframe[title=\"Conversation Preview Pane\"]").locator("now-chat-window").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName(nciMentoredResearchScientistDevelopmentAwardK01Label)).click();
        });
        assertThat(nciMentoredResearchScientistDevelopmentAwardPage.locator("ol")).containsText(nciMentoredResearchScientistDevelopmentAwardK01Label);
        assertThat(nciMentoredResearchScientistDevelopmentAwardPage.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("NCI Mentored Research"))).isVisible();
        assertThat(nciMentoredResearchScientistDevelopmentAwardPage.getByLabel("Breadcrumbs").getByText("NCI Mentored Research")).isVisible();
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
        CucumberLogUtils.playwrightScreenshot(nciMentoredResearchScientistDevelopmentAwardPage);
        nciMentoredResearchScientistDevelopmentAwardPageUrl = nciMentoredResearchScientistDevelopmentAwardPage.url();
        Assert.assertEquals(nciMentoredResearchScientistDevelopmentAwardPageUrl,expectedURL);
        CucumberLogUtils.playwrightScreenshot(nciMentoredResearchScientistDevelopmentAwardPage);
    }

    /**
     * Verifies that the provided link opens in a new tab.
     * It checks that the URL of the first tab is not the same as the provided link,
     *
     * @param nciMentoredResearchScientistDevelopmentAwardK01Link The link to verify opening in a new tab
     */
    public static void the_link_should_open_in_a_new_tab(String nciMentoredResearchScientistDevelopmentAwardK01Link) {
        Assert.assertNotEquals(firstTabUrl,nciMentoredResearchScientistDevelopmentAwardPageUrl);
        assertThat(nciMentoredResearchScientistDevelopmentAwardPage.locator("h1")).containsText(nciMentoredResearchScientistDevelopmentAwardK01Link);
        CucumberLogUtils.playwrightScreenshot(nciMentoredResearchScientistDevelopmentAwardPage);
    }

    /**
     * Selects an option for question two regarding career stage on the CCT Chatbot window.
     *
     * @param clinicalFellow The career stage option selected by the user for question two
     */
    public static void user_selects_for_question2_regarding_career_stage(String clinicalFellow) {
        assertThat(cctChatBotWindow.frameLocator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Frame_Locator).locator(CCT_CHAT_BOT_Page.nv_Pop_UP_CCT_Chat_Bot_Window_Locator)).containsText(CCT_CHAT_BOT_Constants.NV_CCT_CHAT_WINDOW_Q_TWO_TEXT);
        assertThat(cctChatBotWindow.frameLocator("iframe[title=\"Conversation Preview Pane\"]").locator("now-chat-window")).containsText(clinicalFellow);
        cctChatBotWindow.frameLocator("iframe[title=\"Conversation Preview Pane\"]").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName(clinicalFellow)).click();
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * selects "Outside the USA" for "Let's start with where do you plan to conduct your cancer research training?" Question
     *
     * @param outsideTheUSA The response to where the user plans to conduct cancer research training
     * @param letsStartWithWhereDOYouPlanToConductYourCancerResearchTraining The initial chatbot question text
     */
    public static void selects_for(String outsideTheUSA, String letsStartWithWhereDOYouPlanToConductYourCancerResearchTraining) {
        cctChatBotWindow.frameLocator("iframe[title=\"Conversation Preview Pane\"]").locator("span").filter(new Locator.FilterOptions().setHasText("Let's start with where do you")).click();
        assertThat(cctChatBotWindow.frameLocator("iframe[title=\"Conversation Preview Pane\"]").locator("now-chat-window")).containsText(letsStartWithWhereDOYouPlanToConductYourCancerResearchTraining);
        assertThat(cctChatBotWindow.frameLocator("iframe[title=\"Conversation Preview Pane\"]").locator("now-chat-window")).containsText(outsideTheUSA);
        cctChatBotWindow.frameLocator("iframe[title=\"Conversation Preview Pane\"]").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName(outsideTheUSA)).click();
        assertThat(cctChatBotWindow.frameLocator("iframe[title=\"Conversation Preview Pane\"]").locator("now-chat-window")).containsText(outsideTheUSA);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

    /**
     * Verifies that the "Global Research Training (D43)" text should appear in the chatbot chat window.
     * It scrolls the chat window into view, checks if the text is present, and captures a screenshot.
     *
     * @param globalResearchTrainingD43 The text that is expected to appear in the chat window
     */
    public static void the_following_links_should_appear(String globalResearchTrainingD43) {
        cctChatBotWindow.frameLocator("iframe[title=\"Conversation Preview Pane\"]").locator("now-chat-window").scrollIntoViewIfNeeded();
        assertThat(cctChatBotWindow.frameLocator("iframe[title=\"Conversation Preview Pane\"]").locator("now-chat-window")).containsText(globalResearchTrainingD43);
        CucumberLogUtils.playwrightScreenshot(cctChatBotWindow);
    }

}