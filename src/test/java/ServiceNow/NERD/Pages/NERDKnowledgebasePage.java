package ServiceNow.NERD.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.WebDriverUtils;

public class NERDKnowledgebasePage {

    /** NERD Knowledge base view page text */
    @FindBy(xpath = "//div[@for='kbSelect']")
    public WebElement nerdKnowledgeBaseViewText;

    /** Top Accomplishments text */
    @FindBy(xpath = "//*[contains(text(),'Top Accomplishments')]")
    public WebElement topAccomplishmentsText;

    /***
     * Use the below method to locate any accordion by text
     * 
     * @param accordion
     * @return
     */

    public static WebElement dynamicXpathNERDKnowledgeBaseAccordion(String accordion) {

        return WebDriverUtils.webDriver.findElement(By.xpath("//div[contains(text(),'" + accordion + "')]"));

    }

    /***
     * Use the below method to locate the 'Items per page' text uniquely when
     * clicking on an accordion
     * Pass the accordion name as an argument
     * 
     * @param accordionText
     * @return
     */

    public static WebElement dynamicXpathNERDKnowledgeBaseAccordionItemsPerPageText(String accordionText) {

        return WebDriverUtils.webDriver.findElement(By.xpath("((//div[contains(text(),'" + accordionText
                + "')]//parent::span//parent::a//parent::h4//parent::div//following-sibling::div)[2]/div/ul//following-sibling::div/ul//following-sibling::div)[2]"));

    }

    /***
     * Use below method to locate a list of a published article under any accordion
     * 
     * @param accordionText
     * @return
     */
    public static WebElement dynamicXpathNERDKnowledgeBaseAccordionList(String accordionText) {

        return WebDriverUtils.webDriver.findElement(By.xpath(
                "(//div[contains(text(),'" + accordionText
                        + "')]//parent::span//parent::a//parent::h4//parent::div//following-sibling::div)[2]/div/ul"));

    }

    public NERDKnowledgebasePage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }

}
