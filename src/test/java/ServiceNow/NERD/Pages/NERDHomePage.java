package ServiceNow.NERD.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.WebDriverUtils;

public class NERDHomePage {

    /** NERD Knowledge base home page text */
    @FindBy(xpath = "//h5[normalize-space()='NERD']")
    public WebElement nerdKnowledgeBaseText;

    /** ROCK Knowledge base home page text */
    @FindBy(xpath = "//h5[normalize-space()='ROCK']")
    public WebElement rockKnowledgeBaseText;

    /** Moonshot Evaluation Knowledge base home page text */
    @FindBy(xpath = "//h5[normalize-space()='Moonshot Evaluation']")
    public WebElement moonshotEvaluationKnowledgeBaseText;

    /** OGCR Knowledge base home page text */
    @FindBy(xpath = "//h5[normalize-space()='OGCR']")
    public WebElement ogcrKnowledgeBaseText;

    public NERDHomePage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
