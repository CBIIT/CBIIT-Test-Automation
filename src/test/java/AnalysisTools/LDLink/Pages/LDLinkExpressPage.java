package AnalysisTools.LDLink.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class LDLinkExpressPage{

	public LDLinkExpressPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
	
	@FindBy(xpath = "//div[@id='ldexpress-tab']/div/h2")
	private WebElement lblLdExpressHeader;
	
	@FindBy(xpath = "//textarea[@id='ldtrait-file-snp-numbers']")
	private WebElement  txtSnp;
	
	@FindBy(xpath = "//a[@id='ldtrait-population-codes-zero']/..//button")
	private WebElement btnExpandPopulationDropDown;
	
	@FindBy(xpath = "//a[@id='ldtrait-population-codes-zero']/..//button/following-sibling::ul/li")
	private List<WebElement> chkListOfPopulationOptions;
	
	@FindBy(xpath = "//input[@value='Calculate' and @id='ldtrait']")
	private WebElement btnCalculate;
	
	public void clickCalculateButton() {
		CommonUtils.click(btnCalculate);
	}
	
	
	public void selectPopulation() {
		CommonUtils.click(btnExpandPopulationDropDown);
		CommonUtils.click(chkListOfPopulationOptions.get(3).findElement(By.xpath(".//input")));
	}
	
	
	
	
	public void enterValueSnpTextBox(String value) {
		CommonUtils.sendKeys(txtSnp, value);
	}
	
	public String getLDExpressHeaderText() {
		return CommonUtils.getText(lblLdExpressHeader).trim();
	}

}
