package com.nci.automation.web;

import com.microsoft.playwright.*;
import com.nci.automation.utils.FrameworkConstants;

import java.util.ArrayList;

public class PlaywrightUtils {

    public static Page page;
    public static Playwright playwright;
    public static ArrayList<String> arguments = new ArrayList<>();

    public static void setUp() {
        playwright = Playwright.create();
        ConfigReader.readProperties(FrameworkConstants.CONFIGURATION_FILEPATH);
        String testBrowser = ConfUtils.getProperty("browser");
        String maximizeWindow = "--start-maximized";

        if (testBrowser.equalsIgnoreCase(FrameworkConstants.BROWSER_CHROME)) {
            arguments = new ArrayList<>();
            arguments.add(maximizeWindow);
            Browser browser = playwright.chromium().launch(
                    new BrowserType.LaunchOptions().setChannel(FrameworkConstants.BROWSER_CHROME).setHeadless(false).setArgs(arguments).setSlowMo(500));
            BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
            page = context.newPage();
        } else if (testBrowser.equalsIgnoreCase(FrameworkConstants.BROWSER_EDGE)) {
            arguments = new ArrayList<>();
            arguments.add(maximizeWindow);
            Browser browser = playwright.chromium().launch(
                    new BrowserType.LaunchOptions().setChannel(FrameworkConstants.BROWSER_EDGE).setHeadless(false).setArgs(arguments).setSlowMo(2000));
            BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
            page = context.newPage();
        } else if (testBrowser.equalsIgnoreCase(FrameworkConstants.BROWSER_FIREFOX)) {
            arguments = new ArrayList<>();
            arguments.add(maximizeWindow);
            Browser browser = playwright.firefox()
                    .launch(new BrowserType.LaunchOptions().setHeadless(false).setArgs(arguments).setSlowMo(2000));
            BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
            page = context.newPage();
        } else if (testBrowser.equalsIgnoreCase(FrameworkConstants.BROWSER_SAFARI)) {
            arguments = new ArrayList<>();
            arguments.add(maximizeWindow);
            Browser browser = playwright.webkit()
                    .launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(2000));
            BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
            page = context.newPage();
        }
    }
    public static void tearDown() {
        page.close();
        playwright.close();
    }
}

