package CustomBusiness.DCEG.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class BranchAdminPage extends CommonUtils {
	public BranchAdminPage() {
		PageFactory.initElements(WebDriverUtils.getWebDriver(), this);
	}

	/**View ODRequest*/
	@FindBy(xpath = "(//a[@id='editpub'])[6]")
	public WebElement viewODRequest;
	
	/**View ODRequest Published*/
	@FindBy(xpath = "(//a[@id='editpub'])[10]")
	public WebElement viewODRequestPublished;
	
	/**Publication Title Field*/
	@FindBy(xpath = "//input[@name='publication.publicationTitle']")
	public WebElement publicationTitleField;
	
	/**first page*/
	@FindBy(xpath = "(//a[@class='paginate_button '])[1]")
	public WebElement firstPage;
	
	/**first OD*/
	@FindBy(xpath = "(//td[contains(text(),'OD')])[1]")
	public WebElement firstODentry;

	/**first OD*/
	@FindBy(xpath = "(//a[@id='editpub'])[1]")
	public WebElement firstView;
	
}