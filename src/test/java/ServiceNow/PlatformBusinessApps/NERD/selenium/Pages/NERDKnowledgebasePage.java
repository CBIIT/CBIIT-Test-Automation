package ServiceNow.PlatformBusinessApps.NERD.selenium.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NERDKnowledgebasePage {

    /** NERD CSR Knowledge Management System Main page text */
    @FindBy(xpath = "//*[@id='crs-kd-nav']/div")
    public WebElement nerdCRSKnowledgeMainText;

    /** NERD Knowledge base view page text */
    @FindBy(xpath = "//div[@for='kbSelect']")
    public WebElement nerdKnowledgeBaseViewText;

    /** Top Accomplishments NERD Knowledge Base Search Text Box*/
    @FindBy(xpath = "//*[@id='kbSearchInput']")
    public WebElement topAccomplishmentsNerdKnowledgeBaseSearchTextBox;

    /** Top Accomplishments NERD Knowledge Base Search Button*/
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement topAccomplishmentsNerdKnowledgeBaseSearchButton;

    public static WebElement dynamicAccordion(String value) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//*[contains(text(),'" + value + "')]"));
    }

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

    /**
     * Use below method to dynamically locate a published article
     * 
     * @param publishedArticle
     * @return
     */
    public static WebElement dynamicXpathNERDKnowledgeBaseTopAccomplishmentPublishedArticle(String publishedArticle) {
        return WebDriverUtils.webDriver.findElement(By.xpath(
                "//a[contains(text(),'" + publishedArticle + "')]"));
    }

    /**
     * Use below method to inspect the title of an article once it has been opened
     * 
     * @param titleOfArticle
     * @return
     */
    public static WebElement dynamicXpathNERDKnowledgeBasePublishedArticleTitle(String titleOfArticle) {

        return WebDriverUtils.webDriver.findElement(By.xpath(
                "//div[contains(text(),'" + titleOfArticle + "')]"));

    }

    /**
     * Use this method to dynamically locate a submission accordian
     * 
     * @param titleOfPublishedArticle
     * @return
     */
    public static WebElement dynamicXpathNERDAccordian(String titleOfPublishedArticle) {
        return WebDriverUtils.webDriver
                .findElement(By.xpath("//h4[contains(text(),'" + titleOfPublishedArticle + "')]"));

    }

    public NERDKnowledgebasePage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
