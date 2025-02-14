package com.nci.automation.web;

import com.microsoft.playwright.*;
import com.nci.automation.utils.FrameworkConstants;
import java.util.ArrayList;

public class PlaywrightUtils {

    public static Page page;
    public static Playwright playwright;
    public static ArrayList<String> arguments = new ArrayList<>();
    public static BrowserContext context;
    public static Browser browser;

    public static void setUp() {
        playwright = Playwright.create();
        String testBrowser = TestProperties.BROWSER;
        String maximizeWindow = "--start-maximized";
        boolean headless = TestProperties.HEADLESS;
        double setSlowMoTime = TestProperties.SET_SLOW_MO_TIME;
        if (testBrowser.equalsIgnoreCase(FrameworkConstants.BROWSER_CHROME) && !headless) {
            arguments = new ArrayList<>();
            arguments.add(maximizeWindow);
            browser = playwright.chromium().launch(
                    new BrowserType.LaunchOptions()
                            .setChannel(FrameworkConstants.BROWSER_CHROME)
                            .setHeadless(headless)
                            .setArgs(arguments)
                            .setSlowMo(setSlowMoTime));
            context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
            page = context.newPage();
        } else if (testBrowser.equalsIgnoreCase(FrameworkConstants.BROWSER_CHROME) && headless) {
            browser = playwright.chromium().launch(
                    new BrowserType.LaunchOptions()
                            .setChannel(FrameworkConstants.BROWSER_CHROME)
                            .setHeadless(headless)
                            .setArgs(arguments)
                            .setSlowMo(setSlowMoTime));
            context = browser.newContext(new Browser.NewContextOptions().setViewportSize(1920, 1080));
            page = context.newPage();
        } else if (testBrowser.equalsIgnoreCase(FrameworkConstants.BROWSER_EDGE) && !headless) {
            arguments = new ArrayList<>();
            arguments.add(maximizeWindow);
            browser = playwright.chromium().launch(
                    new BrowserType.LaunchOptions()
                            .setChannel(FrameworkConstants.BROWSER_EDGE)
                            .setHeadless(headless)
                            .setArgs(arguments)
                            .setSlowMo(setSlowMoTime));
            context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
            page = context.newPage();
        } else if (testBrowser.equalsIgnoreCase(FrameworkConstants.BROWSER_EDGE) && headless) {
            browser = playwright.chromium().launch(
                    new BrowserType.LaunchOptions()
                            .setChannel(FrameworkConstants.BROWSER_EDGE)
                            .setHeadless(headless)
                            .setArgs(arguments)
                            .setSlowMo(setSlowMoTime));
            context = browser.newContext(new Browser.NewContextOptions().setViewportSize(1920, 1080));
            page = context.newPage();
        } else if (testBrowser.equalsIgnoreCase(FrameworkConstants.BROWSER_FIREFOX) && !headless) {
            arguments = new ArrayList<>();
            arguments.add(maximizeWindow);
            browser = playwright.firefox()
                    .launch(new BrowserType.LaunchOptions()
                            .setHeadless(headless)
                            .setArgs(arguments)
                            .setSlowMo(setSlowMoTime));
            context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
            page = context.newPage();
        } else if (testBrowser.equalsIgnoreCase(FrameworkConstants.BROWSER_FIREFOX) && headless) {
            browser = playwright.firefox()
                    .launch(new BrowserType.LaunchOptions()
                            .setHeadless(headless)
                            .setArgs(arguments)
                            .setSlowMo(setSlowMoTime));
            context = browser.newContext(new Browser.NewContextOptions().setViewportSize(1920, 1080));
            page = context.newPage();
        }
    }

    public static void tearDown() {
        page.close();
        playwright.close();
    }
}