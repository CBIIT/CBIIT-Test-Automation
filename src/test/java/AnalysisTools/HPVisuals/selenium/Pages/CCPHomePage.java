package AnalysisTools.HPVisuals.selenium.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CCPHomePage {
    public CCPHomePage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }

    @FindBy (xpath = "//select[@id='languageSelect']")
    public static WebElement translationDropdown;


}
