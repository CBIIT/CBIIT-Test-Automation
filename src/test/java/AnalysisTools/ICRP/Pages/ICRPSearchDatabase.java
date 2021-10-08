package AnalysisTools.ICRP.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class ICRPSearchDatabase extends CommonUtils {
	
	@FindBy(xpath = "//*[@class='btn btn-primary ml2']")
	public WebElement searchBtn; 
	
	@FindBy(xpath = "//*[@tooltip='Parent projects']")
	public WebElement totalBaseProj;
	
	@FindBy(xpath = "//*[@tooltip='Including linked sub-projects or supplements']")
	public WebElement totalProj;
	
	@FindBy(xpath = "//*[@tooltip='Enter search terms']")
	public WebElement searchTxtbox;
	
	@FindBy(xpath = "(//*[@class='radio-label'])[4]")
	public WebElement exactPhraseRadioBtn;
	
	@FindBy(xpath = "//tr[@class='ng-star-inserted']")
	public List<WebElement> projTitles; 
	
	@FindBy(xpath = "//*[@title=' Glioma organoids as patient avatars to improve precision medicine']")
	public WebElement projGliomaOrganoids; 
	
	@FindBy(xpath = "(//*[@class='ui-panel-header'])[2]")
	public WebElement institutionPanelHeader; 
	
	@FindBy(xpath = "//*[@id='institution']")
	public WebElement institutionTxtBox; 
	
	@FindBy(xpath = "//*[@title='University of Colorado Denver']")
	public List<WebElement> institutionUniversityOfColoradoDenver; 
	
	
	public ICRPSearchDatabase() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

}
