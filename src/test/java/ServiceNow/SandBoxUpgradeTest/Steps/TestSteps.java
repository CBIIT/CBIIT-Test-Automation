package ServiceNow.SandBoxUpgradeTest.Steps;

import appsCommon.PageInitializer;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestSteps extends PageInitializer {
    @Given("testing")
    public void testing() throws InterruptedException {
        WebDriverUtils.webDriver.get("https://service-sandbox.nci.nih.gov/side_door.do");

        WebDriverUtils.webDriver.findElement(By.xpath("//input[@type='text']")).sendKeys("CBIITTestAccount");
        WebDriverUtils.webDriver.findElement(By.xpath("//input[@type='password']")).sendKeys("curlbylawdighalvekinlarswould");
        WebDriverUtils.webDriver.findElement(By.xpath("//button[@type='submit']")).click();

        try {
            //webDriver.get("https://example.com"); // Replace with your target URL

            // Use JavaScriptExecutor to navigate through the fifth level of Shadow DOM
            JavascriptExecutor jsExecutor = (JavascriptExecutor) webDriver;

            WebElement targetElement = findElementInFifthLevelShadowDOM(jsExecutor, webDriver, "macroponent-f51912f4c700201072b211d4d8c26010", "your-target-element-selector");

            // Now you can interact with the target element
            targetElement.click();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            webDriver.quit();
        }
    }

    public static WebElement findElementInFifthLevelShadowDOM(JavascriptExecutor jsExecutor, WebDriver driver, String topLevelShadowHostSelector, String targetElementSelector) {
        WebElement topLevelShadowHost = (WebElement) jsExecutor.executeScript("return document.querySelector(arguments[0]);", topLevelShadowHostSelector);

        // Traverse through the four levels of Shadow DOM (up to the fifth level)
        for (int i = 0; i < 4; i++) {
            jsExecutor.executeScript("arguments[0].shadowRoot", topLevelShadowHost);
            topLevelShadowHost = (WebElement) jsExecutor.executeScript("return arguments[0].querySelector(arguments[1]);", topLevelShadowHost, topLevelShadowHostSelector);
        }

        // Find the desired element within the fifth level Shadow DOM
        return (WebElement) jsExecutor.executeScript("return arguments[0].shadowRoot.querySelector(arguments[1]);", topLevelShadowHost, targetElementSelector);
    }
}






    /*** Tried JS Executor but fails to pass the value to the field


    JavascriptExecutor jscriptex = (JavascriptExecutor)webDriver;
    Thread.sleep(3000);
    WebElement searchBox = (WebElement) jscriptex.executeScript("return document.querySelector(\"macroponent-f51912f4c700201072b211d4d8c26010\").shadowRoot.querySelector(\"div > sn-canvas-appshell-root > sn-canvas-appshell-layout > sn-polaris-layout\").shadowRoot.querySelector(\"div.sn-polaris-layout.polaris-enabled > div.layout-main > div.header-bar > sn-polaris-header\").shadowRoot.querySelector(\"nav > div > div.ending-header-zone > div.polaris-header-controls > div.polaris-search.polaris-enabled > sn-search-input-wrapper\").shadowRoot.querySelector(\"sn-component-workspace-global-search-typeahead\").shadowRoot.querySelector(\"#sncwsgs-typeahead-input\")");

            //document.querySelector('body > macroponent-f51912f4c700201072b211d4d8c26010').shadowRoot.querySelector('div > sn-canvas-appshell-root > sn-canvas-appshell-layout > sn-polaris-layout').shadowRoot.querySelector('div.sn-polaris-layout.polaris-enabled > div.layout-main > div.header-bar > sn-polaris-header').shadowRoot.querySelector('nav > div > div.ending-header-zone > div.polaris-header-controls > div.polaris-search.polaris-enabled > sn-search-input-wrapper').shadowRoot.querySelector('sn-component-workspace-global-search-typeahead').shadowRoot.querySelector('#sncwsgs-typeahead-input')");
    Thread.sleep(2000);
    //ENTER VALUE INTO SEARCH BOX
    ((JavascriptExecutor)webDriver).executeScript("arguments[0].click();", searchBox);
    String js = "arguments[0].setAttribute('value', 'HELLO')";

    ((JavascriptExecutor)webDriver).executeScript(js, searchBox);


    Thread.sleep(10000);


     * document.querySelector('macroponent-f51912f4c700201072b211d4d8c26010').shadowRoot.querySelector('sn-canvas-appshell-root > sn-canvas-appshell-layout > sn-polaris-layout').shadowRoot.querySelector('sn-polaris-header').shadowRoot.querySelector('sn-search-input-wrapper').shadowRoot.querySelector('sn-component-workspace-global-search-typeahead').shadowRoot.querySelector('input')

     ***/




        // WebElement tagShadowDom1 = WebDriverUtils.webDriver.findElement(By.tagName("macroponent-f51912f4c700201072b211d4d8c26010"));
/*
        String tagNameForHost1 = "macroponent-f51912f4c700201072b211d4d8c26010";
        String tagNameForHost2 = "sn-polaris-layout";
        String tagNameForHost3 = "sn-polaris-header";
        String tagNameForHost4 = "sn-search-input-wrapper";
        String tagNameForHost5 = "sn-component-workspace-global-search-typeahead";

       // WebElement shadowHost1 = webDriver.findElement(By.tagName(tagNameForHost1));
        //SearchContext shadowRoot1 = shadowHost1.getShadowRoot();

        SearchContext shadow0 = webDriver.findElement(By.tagName(tagNameForHost1)).getShadowRoot();
        System.out.println(shadow0);
        Thread.sleep(1000);
        SearchContext shadow1 = webDriver.findElement(By.tagName(tagNameForHost2)).getShadowRoot();
        System.out.println(shadow1);
        Thread.sleep(1000);
        SearchContext shadow2 = shadow1.findElement(By.tagName(tagNameForHost3)).getShadowRoot();
        System.out.println(shadow2);
        Thread.sleep(1000);
        SearchContext shadow3 = shadow2.findElement(By.tagName(tagNameForHost4)).getShadowRoot();
        System.out.println(shadow3);
        Thread.sleep(1000);
        SearchContext shadow4 = shadow3.findElement(By.tagName(tagNameForHost5)).getShadowRoot();
        System.out.println(shadow4);
        Thread.sleep(1000);
        shadow4.findElement(By.cssSelector("#sncwsgs-typeahead-input")).sendKeys("123");  */




        /*
        Shadow shadow = new Shadow(WebDriverUtils.webDriver);

        WebDriverUtils.webDriver.findElement(By.xpath("//input[@type='text']")).sendKeys("CBIITTestAccount");
        WebDriverUtils.webDriver.findElement(By.xpath("//input[@type='password']")).sendKeys("curlbylawdighalvekinlarswould");
        WebDriverUtils.webDriver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
        shadow.findElementByXPath("//*[@id='sncwsgs-typeahead-input']").sendKeys("Charms");
        Thread.sleep(3000);
        shadow.findElementByXPath("//*[@id='sncwsgs-typeahead-input']").sendKeys(Keys.ENTER);
        Thread.sleep(3000);

        Thread.sleep(10000);

    }
}*/