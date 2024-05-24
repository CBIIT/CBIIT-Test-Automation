package com.nci.automation.web;

import com.microsoft.playwright.*;
import com.nci.automation.utils.FrameworkConstants;
import java.util.ArrayList;

public class PlaywrightUtils {

    public static Page page;
    public static Playwright playwright;
    public static ArrayList<String> arguments = new ArrayList<>();
    public static BrowserContext context;

    public static void setUp() {
        playwright = Playwright.create();
        String testBrowser = ConfUtils.getProperty("browser");
        String maximizeWindow = "--start-maximized";
        String headless = ConfUtils.getProperty("headless");
        double setSlowMoTime = Double.parseDouble(ConfUtils.getProperty("setSlowMoTime"));

        if (testBrowser.equalsIgnoreCase(FrameworkConstants.BROWSER_CHROME)) {
            arguments = new ArrayList<>();
            arguments.add(maximizeWindow);
            Browser browser = playwright.chromium().launch(
                    new BrowserType.LaunchOptions().setChannel(FrameworkConstants.BROWSER_CHROME).setHeadless(Boolean.parseBoolean(headless)).setArgs(arguments).setSlowMo(setSlowMoTime));
            context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
            page = context.newPage();
        } else if (testBrowser.equalsIgnoreCase(FrameworkConstants.BROWSER_EDGE)) {
            arguments = new ArrayList<>();
            arguments.add(maximizeWindow);
            Browser browser = playwright.chromium().launch(
                    new BrowserType.LaunchOptions().setChannel(FrameworkConstants.BROWSER_EDGE).setHeadless(Boolean.parseBoolean(headless)).setArgs(arguments).setSlowMo(setSlowMoTime));
            context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
            page = context.newPage();
        } else if (testBrowser.equalsIgnoreCase(FrameworkConstants.BROWSER_FIREFOX)) {
            arguments = new ArrayList<>();
            arguments.add(maximizeWindow);
            Browser browser = playwright.firefox()
                    .launch(new BrowserType.LaunchOptions().setHeadless(Boolean.parseBoolean(headless)).setArgs(arguments).setSlowMo(setSlowMoTime));
            context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
            page = context.newPage();
        } else if (testBrowser.equalsIgnoreCase(FrameworkConstants.BROWSER_SAFARI)) {
            arguments = new ArrayList<>();
            arguments.add(maximizeWindow);
            Browser browser = playwright.webkit()
                    .launch(new BrowserType.LaunchOptions().setHeadless(Boolean.parseBoolean(headless)).setSlowMo(setSlowMoTime));
           context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
            page = context.newPage();
        }
    }
    public static void tearDown() {
        page.close();
        playwright.close();
    }
}
