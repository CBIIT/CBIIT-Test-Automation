package AnalysisTools.mSigPortal.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.WebDriverUtils;

public class CatalogPages {
	public CatalogPages() {

		PageFactory.initElements(WebDriverUtils.webDriver, this);

	}

	@FindBy(xpath = "(//div[@title='Activity of activation-induced cytidine deaminase (AID) - SBS84'])[1]")
	public WebElement signaturesSearchIcon;

	@FindBy(xpath = "//div[@class = 'react-transform-component TransformComponent-module_container__3NwNd ']")
	public WebElement catalogResultsGraph;

	@FindBy(xpath = "//strong[contains(text(),'Signature Name:')]")
	public WebElement catalogSignatureName;

	@FindBy(xpath = "//button[contains(text(),'Download Plot')]")
	public WebElement downloadPlotOnEtiologyPage;

	@FindBy(xpath = "//div[normalize-space()='Cancer Reference Signatures']")
	public WebElement catalogCancerrefSignature;

	@FindBy(xpath = "//button[normalize-space()='Aflatoxin']")
	public WebElement catalogCancerrefAflatoxin;

	@FindBy(xpath = "//div[contains(@class,'mb-3 col-md-2 col-sm-4')]//div[contains(@title,'Aflatoxin - SBS24')]")
	public WebElement catalogSignatureSBS24;

	@FindBy(xpath = "//div[contains(text(),'SBS24')]")
	public WebElement catalogSignatureSBS24Display;
	@FindBy(xpath = "//a[@class='secondary-navlinks px-2 py-1 d-inline-block text-catalog']")
	public WebElement catalogReferenceSignature;

	@FindBy(xpath = "//*[contains(text(),'SBS96')]")
	public WebElement catalogReferenceSignatureSBS96;
	@FindBy(xpath = "//button[@data-rb-event-key='RSProfile']")
	public WebElement rsProfile;

	@FindBy(xpath = "//button[@type='button'][normalize-space()='Calculate']")
	public WebElement rsProfileCalculate;

	@FindBy(xpath = "//*[local-name()='svg' and @class='main-svg']//*[name()='g']//*[name()='text' and @data-unformatted='<b>SBS1</b>']")
	public WebElement rsProfileSBS1display;

	@FindBy(xpath = "//*[local-name()='svg' and @class='main-svg']//*[name()='g' and @class='draglayer cursor-crosshair']")
	public WebElement rsProfileGraphDisplay;
	@FindBy(xpath = "(//*[local-name()='svg' and @class='main-svg']//*[name()='g'and @class='point'])[35]")
	public WebElement rsProfileGraphBarsDisplay;

	@FindBy(xpath = "//*[local-name()='svg' and @class='main-svg']//*[name()='g'and @class='hovertext']//*[name()='text']")
	public WebElement rsProfileGraphBarsValue;

}
