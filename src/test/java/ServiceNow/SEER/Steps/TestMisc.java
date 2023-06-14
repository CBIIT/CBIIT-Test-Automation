package ServiceNow.SEER.Steps;

import ServiceNow.SEER.Constants.Registration_Constants;
import appsCommon.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class TestMisc extends PageInitializer {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://seerdataaccess.cancer.gov/seer-data-access?id=seer_user_registration&sysparm_email=hjjghgjhghjg@gmail.com");
//
//        MiscUtils.sleep(3000);
//        String org = driver.findElement(By.xpath("//*[@id=\'organizations\']/option[300]")).getAttribute("value");
//        System.out.println("TEXT: " + org);

       List<WebElement> seerUserRegistrationOrganizations = driver.findElements(By.xpath("//*[@id=\'organizations\']/option"));

        for (WebElement organization : seerUserRegistrationOrganizations){
            String org = organization.getAttribute("value");
            if(org.contains("If non-institutional, enter Not Applicable.")){
                System.out.println("FOUND----------------------------------------------------");
            }
        }


        MiscUtils.sleep(3000);
       }


//        CommonUtils.sendKeys(seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataContentText, Registration_Constants.FIRST_NAME.charAt(0) + "" + Registration_Constants.LAST_NAME.charAt(0));
//        MiscUtils.sleep(2000);
//        CucumberLogUtils.logScreenShot();
//        JavascriptUtils.scrollUpWithinElement(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceText, 8000);
//        CommonUtils.sendKeys(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceInitials, Registration_Constants.FIRST_NAME.charAt(0) + "" + Registration_Constants.LAST_NAME.charAt(0));
//        MiscUtils.sleep(2000);

}
