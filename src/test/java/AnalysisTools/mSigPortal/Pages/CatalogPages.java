package AnalysisTools.mSigPortal.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.WebDriverUtils;

public class CatalogPages {
	public CatalogPages() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

	/* This is the locator for signaturesSearchIcon */
	@FindBy(xpath = "(//div[@title='Activity of activation-induced cytidine deaminase (AID) - SBS84'])[1]")
	public WebElement signaturesSearchIcon;

	/* This is the locator for catalogResultsGraph */
	@FindBy(xpath = "//div[@class = 'react-transform-component TransformComponent-module_container__3NwNd ']")
	public WebElement catalogResultsGraph;

	/* This is the locator for catalogSignatureName */
	@FindBy(xpath = "//strong[contains(text(),'Signature Name:')]")
	public WebElement catalogSignatureName;

	/* This is the locator for downloadPlotOnEtiologyPage */
	@FindBy(xpath = "//button[contains(text(),'Download Plot')]")
	public WebElement downloadPlotOnEtiologyPage;

	/* This is the locator for catalogCancerrefSignature */
	@FindBy(xpath = "//div[normalize-space()='Cancer Reference Signatures']")
	public WebElement catalogCancerrefSignature;

	/* This is the locator for catalogCancerrefAflatoxin */
	@FindBy(xpath = "//button[normalize-space()='Aflatoxin']")
	public WebElement catalogCancerrefAflatoxin;

	/* This is the locator for catalogSignatureSBS24 */
	@FindBy(xpath = "//div[contains(@class,'mb-3 col-md-2 col-sm-4')]//div[contains(@title,'Aflatoxin - SBS24')]")
	public WebElement catalogSignatureSBS24;

	/* This is the locator for catalogSignatureSBS24Display */
	@FindBy(xpath = "//div[contains(text(),'SBS24')]")
	public WebElement catalogSignatureSBS24Display;

	/* This is the locator for catalogReferenceSignature */
	@FindBy(xpath = "//a[@class='secondary-navlinks px-2 py-1 d-inline-block text-catalog']")
	public WebElement catalogReferenceSignature;

	/* This is the locator for catalogReferenceSignatureSBS96 */
	@FindBy(xpath = "//*[contains(text(),'SBS96')]")
	public WebElement catalogReferenceSignatureSBS96;

	/* This is the locator for rsProfile */
	@FindBy(xpath = "//button[@data-rb-event-key='RSProfile']")
	public WebElement rsProfile;

	/* This is the locator for rsProfileCalculate */
	@FindBy(xpath = "//button[@type='button'][normalize-space()='Calculate']")
	public WebElement rsProfileCalculate;

	/* This is the locator for rsProfileSBS1display */
	@FindBy(xpath = "//*[local-name()='svg' and @class='main-svg']//*[name()='g']//*[name()='text' and @data-unformatted='<b>SBS1</b>']")
	public WebElement rsProfileSBS1display;

	/* This is the locator for rsProfileGraphDisplay */
	@FindBy(xpath = "//*[local-name()='svg' and @class='main-svg']//*[name()='g' and @class='draglayer cursor-crosshair']")
	public WebElement rsProfileGraphDisplay;

	/* This is the locator for rsProfileGraphBarsDisplay */
	@FindBy(xpath = "(//*[local-name()='svg' and @class='main-svg']//*[name()='g'and @class='point'])[35]")
	public WebElement rsProfileGraphBarsDisplay;

	/* This is the locator for rsProfileGraphBarsValue */
	@FindBy(xpath = "//*[local-name()='svg' and @class='main-svg']//*[name()='g'and @class='hovertext']//*[name()='text']")
	public WebElement rsProfileGraphBarsValue;
}