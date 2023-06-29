//package GrantsApps.ChangePassword.Pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import com.nci.automation.web.CommonUtils;
//
//public class ChangePasswordBasePage extends CommonUtils {
//    protected WebDriver driver;
//    protected WebDriverWait wait;
//    public static int captureCount = 1;
//
//    protected void clickOnElementByXpath(String xpath) {
//        WebElement element = driver.findElement(By.xpath(xpath));
//        wait.until(ExpectedConditions.visibilityOf(element));
//        wait.until(ExpectedConditions.elementToBeClickable(element));
//        element.click();
//    }
//
//    protected void enterText(WebElement element, String text) {
//        wait.until(ExpectedConditions.elementToBeClickable(element));
//        if (text != null) {
//            element.sendKeys(text);
//        }
//    }
//
//    protected void selectTodayDate(WebElement inputEle) {
//        clickOnElement(inputEle);
//        clickOnElement(driver.findElement(By.cssSelector(".today.day")));
//        System.out.print("");
//    }
//
//    public void waitForElementToLoad(By locator) {
//        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//    }
//
//    public void scrollToElement(WebElement element) {
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//    }
//
//    public void selectOption(WebElement selectEl, String optionText) {
//        Select select = new Select(selectEl);
//        select.selectByVisibleText(optionText);
//    }
//
//    public void selectOptionByIndex(WebElement selectEl) {
//        Select select = new Select(selectEl);
//        select.selectByIndex(2);
//    }
//}
//
