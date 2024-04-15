package CloudAndSystemEngineering.IAMRedesign.StepImplementation;

import CloudAndSystemEngineering.IAMRedesign.Constants.IAMRedesignConstants;
import CloudAndSystemEngineering.IAMRedesign.Pages.ADConsoleLocatorsPage;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.openqa.selenium.NoSuchElementException;

public class IAMRedesignStepImpl extends PageInitializer {

    public static List<String> urlsListProd = new ArrayList<>();
    public static HashSet<String> allConsoleMembers = new HashSet<>();

    /**
     * This method will return all the AWS account numbers from an Excel file and a specific sheet
     *
     */
    public static void getAllLinksFromExcelSheet ()  {
        DataFormatter formatter = new DataFormatter();
        try {
            FileInputStream file= new FileInputStream(IAMRedesignConstants.ACCOUNTS_LIST_FILE);
            Workbook book= new XSSFWorkbook(file);
            Sheet sheet= book.getSheet(IAMRedesignConstants.IAM_REDESIGN_SHEET_NAME);
            int lastRowNumber= sheet.getLastRowNum();
            for (int i = 0; i <= lastRowNumber; i++) {
                Row row=sheet.getRow(i);
                Cell keyCell =row.getCell(0);
                String key= formatter.formatCellValue(keyCell);
                urlsListProd.add(key);
            }
            book.close();
            file.close();
        } catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("");
        System.out.println("NUMBER OF ACCOUNTS: " + urlsListProd.size());
        System.out.println("***********************************************************************************************************************");
    }

    /**
     * This method will open the login page and wait for 20 sec to input login credentials
     *
     */
    public static void goToAdUrl() {
        WebDriverUtils.webDriver.get(IAMRedesignConstants.AD_URL);
        MiscUtils.sleep(20000);
    }

    /**
     * This method will validate the prod accounts
     *
     */
    public static void verifyMannagedProdAccount() {
        CucumberLogUtils.logScreenshot();
        try {
            CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneMenuTab);
            CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
        } catch (NoSuchElementException f) {
            CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneMenuTab);
            CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
        }catch (TimeoutException m) {
            try {
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneMenuTab);
                CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
            }catch (TimeoutException s) {
                CommonUtils.waitForVisibility(aDConsoleLocatorsPage.groupsButtonTab);
                CucumberLogUtils.logScreenshot();
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.groupsButtonTab);
                MiscUtils.sleep(5000);
                CommonUtils.waitForVisibility(aDConsoleLocatorsPage.aDSearchBar);
                CommonUtils.sendKeysToElement(aDConsoleLocatorsPage.aDSearchBar, IAMRedesignConstants.NCI_CLOUD_ONE_GROUP);
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.aDSearchButton);
                CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneButton);
                CucumberLogUtils.logScreenshot();
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneButton);
                CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
            }
        }
        int allPassedTests = 0;
        int allFailedTests = 0;
        HashSet<String> failedAccounts = new HashSet<>();
        for (String aWsAccounNumber : urlsListProd) {
            int consolUserPass = 0;
            HashSet<String> nameTypo = new HashSet<>();
            HashSet<String> devNotMatch = new HashSet<>();
            HashSet<String> consoleUserPresent = new HashSet<>();
            HashSet<String> devReadOnlyNames = new HashSet<>();
            HashSet<String> newDevReadOnlyNames = new HashSet<>();
            aDConsoleLocatorsPage.aDSearchBar.clear();
            CommonUtils.sendKeysToElement(aDConsoleLocatorsPage.aDSearchBar, aWsAccounNumber);
            CommonUtils.clickOnElement(aDConsoleLocatorsPage.aDSearchButton);
            try {
                CommonUtils.waitForVisibility(ADConsoleLocatorsPage.idcReadOnlyDynamicCheckbox(aWsAccounNumber));
            } catch (NoSuchElementException e) {
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.aDSearchButton);
                try {
                    CommonUtils.waitForVisibility(ADConsoleLocatorsPage.idcReadOnlyDynamicCheckbox(aWsAccounNumber));
                } catch (NoSuchElementException f) {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.aDSearchButton);
                    CommonUtils.waitForVisibility(ADConsoleLocatorsPage.idcReadOnlyDynamicCheckbox(aWsAccounNumber));
                }
            }
            CucumberLogUtils.logScreenshot();
            try {
                CommonUtils.clickOnElement(ADConsoleLocatorsPage.awsReadOnlyDynamicCheckbox(aWsAccounNumber));
            } catch (NoSuchElementException k) {
                CommonUtils.clickOnElement(ADConsoleLocatorsPage.awsReadOnlyDynamicCheckboxTypo(aWsAccounNumber));
                nameTypo.add(ADConsoleLocatorsPage.awsReadOnlyDynamicCheckboxTypo(aWsAccounNumber).getText());
            }
            CucumberLogUtils.logScreenshot();
            try {
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
            } catch (TimeoutException g) {
                MiscUtils.sleep(2000);
                try {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
                } catch (TimeoutException k) {
                    try {
                        CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneMenuTab);
                        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
                    }catch (TimeoutException s) {
                        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.groupsButtonTab);
                        CucumberLogUtils.logScreenshot();
                        CommonUtils.clickOnElement(aDConsoleLocatorsPage.groupsButtonTab);
                        MiscUtils.sleep(5000);
                        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.aDSearchBar);
                        CommonUtils.sendKeysToElement(aDConsoleLocatorsPage.aDSearchBar, IAMRedesignConstants.NCI_CLOUD_ONE_GROUP);
                        CommonUtils.clickOnElement(aDConsoleLocatorsPage.aDSearchButton);
                        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneButton);
                        CucumberLogUtils.logScreenshot();
                        CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneButton);
                        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
                    }
                }
            } catch (NoSuchElementException f) {
                try {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
                } catch (NoSuchElementException k) {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
                }
            }
            if (aDConsoleLocatorsPage.userNames.size() > 0) {
                for (WebElement nameLocator : aDConsoleLocatorsPage.userNames) {
                    String useName = nameLocator.getText();
                    if (useName.length() > 0) {
                        devReadOnlyNames.add(useName);
                    }
                }
            }
            CucumberLogUtils.logScreenshot();
            try {
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneMenuTab);
                CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
            } catch (NoSuchElementException f) {
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneMenuTab);
                CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
            }catch (TimeoutException m) {
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneMenuTab);
                CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
            }
            CommonUtils.sendKeysToElement(aDConsoleLocatorsPage.aDSearchBar, aWsAccounNumber);
            CommonUtils.clickOnElement(aDConsoleLocatorsPage.aDSearchButton);
            try {
                CommonUtils.waitForVisibility(ADConsoleLocatorsPage.idcReadOnlyDynamicCheckbox(aWsAccounNumber));
            } catch (NoSuchElementException e) {
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.aDSearchButton);
                try {
                    CommonUtils.waitForVisibility(ADConsoleLocatorsPage.idcReadOnlyDynamicCheckbox(aWsAccounNumber));
                } catch (NoSuchElementException f) {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.aDSearchButton);
                    CommonUtils.waitForVisibility(ADConsoleLocatorsPage.idcReadOnlyDynamicCheckbox(aWsAccounNumber));
                }
            }
            try {

                try {
                    CommonUtils.clickOnElement(ADConsoleLocatorsPage.readOnlyDynamicCheckbox(aWsAccounNumber));
                } catch (NoSuchElementException k) {
                    CommonUtils.clickOnElement(ADConsoleLocatorsPage.readOnlyDynamicCheckboxTypo(aWsAccounNumber));
                    nameTypo.add(ADConsoleLocatorsPage.readOnlyDynamicCheckboxTypo(aWsAccounNumber).getText());
                }
                CucumberLogUtils.logScreenshot();
                try {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
                } catch (TimeoutException g) {
                    MiscUtils.sleep(2000);
                    try {
                        CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
                    } catch (TimeoutException k) {
                        CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
                    }
                } catch (NoSuchElementException f) {
                    try {
                        CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
                    } catch (NoSuchElementException k) {
                        CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
                    }
                }
                if (aDConsoleLocatorsPage.userNames.size() > 0) {
                    for (WebElement nameLocator : aDConsoleLocatorsPage.userNames) {
                        String useName = nameLocator.getText();
                        if (useName.length() > 0) {
                            devReadOnlyNames.add(useName);
                        }
                    }
                }
                try {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneMenuTab);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
                } catch (NoSuchElementException f) {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneMenuTab);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
                }catch (TimeoutException m) {
                    try {
                        CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneMenuTab);
                        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
                    }catch (TimeoutException s) {
                        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.groupsButtonTab);
                        CucumberLogUtils.logScreenshot();
                        CommonUtils.clickOnElement(aDConsoleLocatorsPage.groupsButtonTab);
                        MiscUtils.sleep(5000);
                        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.aDSearchBar);
                        CommonUtils.sendKeysToElement(aDConsoleLocatorsPage.aDSearchBar, IAMRedesignConstants.NCI_CLOUD_ONE_GROUP);
                        CommonUtils.clickOnElement(aDConsoleLocatorsPage.aDSearchButton);
                        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneButton);
                        CucumberLogUtils.logScreenshot();
                        CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneButton);
                        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
                    }
                }
                CommonUtils.sendKeysToElement(aDConsoleLocatorsPage.aDSearchBar, aWsAccounNumber);
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.aDSearchButton);
                try {
                    CommonUtils.waitForVisibility(ADConsoleLocatorsPage.idcReadOnlyDynamicCheckbox(aWsAccounNumber));
                } catch (NoSuchElementException e) {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.aDSearchButton);
                    try {
                        CommonUtils.waitForVisibility(ADConsoleLocatorsPage.idcReadOnlyDynamicCheckbox(aWsAccounNumber));
                    } catch (NoSuchElementException f) {
                        CommonUtils.clickOnElement(aDConsoleLocatorsPage.aDSearchButton);
                        CommonUtils.waitForVisibility(ADConsoleLocatorsPage.idcReadOnlyDynamicCheckbox(aWsAccounNumber));
                    }
                }
            } catch (NoSuchElementException h) {
                CucumberLogUtils.logScreenshot();
            }
            CommonUtils.clickOnElement(ADConsoleLocatorsPage.idcReadOnlyDynamicCheckbox(aWsAccounNumber));
            CucumberLogUtils.logScreenshot();
            try {
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
            } catch (TimeoutException g) {
                MiscUtils.sleep(2000);
                try {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
                } catch (TimeoutException k) {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
                }
            } catch (NoSuchElementException f) {
                try {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
                } catch (NoSuchElementException k) {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
                }
            }
            if (aDConsoleLocatorsPage.userNames.size() > 0) {
                for (WebElement nameLocator : aDConsoleLocatorsPage.userNames) {
                    String useName = nameLocator.getText();
                    if (useName.length() > 0) {
                        newDevReadOnlyNames.add(useName);
                        for (String r : allConsoleMembers) {
                            if (r.contains(useName)) {
                                consoleUserPresent.add(useName);
                            }
                        }
                    }
                }
            }
            if (newDevReadOnlyNames.size() == consoleUserPresent.size()) {
                consolUserPass += 1;
            }
            for (String a : devReadOnlyNames) {
                for (String b : newDevReadOnlyNames) {
                    if (a.equals(b)) {
                        devNotMatch.add(b);
                    }
                }
            }
            CucumberLogUtils.logScreenshot();
            try {
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneMenuTab);
                CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
            } catch (NoSuchElementException f) {
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneMenuTab);
                CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
            }catch (TimeoutException m) {
                try {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneMenuTab);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
                }catch (TimeoutException s) {
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.groupsButtonTab);
                    CucumberLogUtils.logScreenshot();
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.groupsButtonTab);
                    MiscUtils.sleep(5000);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.aDSearchBar);
                    CommonUtils.sendKeysToElement(aDConsoleLocatorsPage.aDSearchBar, IAMRedesignConstants.NCI_CLOUD_ONE_GROUP);
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.aDSearchButton);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneButton);
                    CucumberLogUtils.logScreenshot();
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneButton);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
                }
            }
            if (devReadOnlyNames.size() == newDevReadOnlyNames.size() && devReadOnlyNames.size() == devNotMatch.size()){
                consolUserPass += 2;
            }
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
            if(consolUserPass == 3){
                System.out.println("Account:" + aWsAccounNumber + " PASS");
                allPassedTests += 1;
            } else if(consolUserPass == 0){
                System.out.println("Account:" + aWsAccounNumber +" FAIL - Groups members do no match and some members may not be in the Console User Group");
                allFailedTests += 1;
            } else if(consolUserPass == 1){
                System.out.println("Account:" + aWsAccounNumber +" FAIL - Not all members are migrated from the old groups");
                allFailedTests += 1;
            } else if(consolUserPass == 2){
                System.out.println("Account:" + aWsAccounNumber +" FAIL - Some members may not be in the Console User Group");
                allFailedTests += 1;
            } else {
                System.out.println("Account:" + aWsAccounNumber +" FAIL");
                allPassedTests += 1;
            }
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
            System.out.println("OD: " + devReadOnlyNames.size());
            System.out.println("ND: " + newDevReadOnlyNames.size());
            System.out.println("CD: " + consoleUserPresent.size());
            if(nameTypo.size() > 0){
                System.out.println("Group Name Typo: Please check Groups Names for Typos" );
            }
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
            CucumberLogUtils.logScreenshot();
        }
        System.out.println("***********************************************************************************************************************");
        System.out.println("Total accounts:" + urlsListProd.size());
        System.out.println("Accounts PASS:" + allPassedTests);
        System.out.println("Accounts FAIL:" + allFailedTests);
        System.out.println("***********************************************************************************************************************");
        if (failedAccounts.size() > 0) {
            for (String f : failedAccounts) {
                System.out.println(f);
            }
            System.out.println("***********************************************************************************************************************");
        }
    }

    /**
     * This method will validate the non-prod accounts
     *
     */
    public static void verifyMannagedNonProdAccount() {
        CucumberLogUtils.logScreenshot();
        try {
            CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneMenuTab);
            CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
        } catch (NoSuchElementException f) {
            CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneMenuTab);
            CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
        }catch (TimeoutException m) {
            try {
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneMenuTab);
                CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
            }catch (TimeoutException s) {
                CommonUtils.waitForVisibility(aDConsoleLocatorsPage.groupsButtonTab);
                CucumberLogUtils.logScreenshot();
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.groupsButtonTab);
                MiscUtils.sleep(5000);
                CommonUtils.waitForVisibility(aDConsoleLocatorsPage.aDSearchBar);
                CommonUtils.sendKeysToElement(aDConsoleLocatorsPage.aDSearchBar, IAMRedesignConstants.NCI_CLOUD_ONE_GROUP);
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.aDSearchButton);
                CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneButton);
                CucumberLogUtils.logScreenshot();
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneButton);
                CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
            }
        }
        int allPassedTests = 0;
        int allFailedTests = 0;
        HashSet<String> failedAccounts = new HashSet<>();
        for (String aWsAccounNumber : urlsListProd) {
            int consolUserPass = 0;
            int powerUserPass = 0;
            HashSet<String> nameTypo = new HashSet<>();
            HashSet<String> devNotMatch = new HashSet<>();
            HashSet<String> consoleUserPresent = new HashSet<>();
            HashSet<String> devReadOnlyNames = new HashSet<>();
            HashSet<String> newDevReadOnlyNames = new HashSet<>();
            HashSet<String> nciPowerUserNames = new HashSet<>();
            HashSet<String> idcPowerUserNames = new HashSet<>();
            HashSet<String> powerUsersConsolePresent = new HashSet<>();
            HashSet<String> powerUserNotMatch = new HashSet<>();
            aDConsoleLocatorsPage.aDSearchBar.clear();
            CommonUtils.sendKeysToElement(aDConsoleLocatorsPage.aDSearchBar, aWsAccounNumber);
            CommonUtils.clickOnElement(aDConsoleLocatorsPage.aDSearchButton);
            try {
                CommonUtils.waitForVisibility(ADConsoleLocatorsPage.idcReadOnlyDynamicCheckbox(aWsAccounNumber));
            } catch (NoSuchElementException e) {
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.aDSearchButton);
                try {
                    CommonUtils.waitForVisibility(ADConsoleLocatorsPage.idcReadOnlyDynamicCheckbox(aWsAccounNumber));
                } catch (NoSuchElementException f) {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.aDSearchButton);
                    CommonUtils.waitForVisibility(ADConsoleLocatorsPage.idcReadOnlyDynamicCheckbox(aWsAccounNumber));
                }
            }
            CucumberLogUtils.logScreenshot();
            try {
                CommonUtils.clickOnElement(ADConsoleLocatorsPage.awsReadOnlyDynamicCheckbox(aWsAccounNumber));
            } catch (NoSuchElementException k) {
                CommonUtils.clickOnElement(ADConsoleLocatorsPage.awsReadOnlyDynamicCheckboxTypo(aWsAccounNumber));
                nameTypo.add(ADConsoleLocatorsPage.awsReadOnlyDynamicCheckboxTypo(aWsAccounNumber).getText());
            }
            CucumberLogUtils.logScreenshot();
            try {
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
            } catch (TimeoutException g) {
                MiscUtils.sleep(2000);
                try {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
                } catch (TimeoutException k) {
                    try {
                        CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneMenuTab);
                        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
                    }catch (TimeoutException s) {
                        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.groupsButtonTab);
                        CucumberLogUtils.logScreenshot();
                        CommonUtils.clickOnElement(aDConsoleLocatorsPage.groupsButtonTab);
                        MiscUtils.sleep(5000);
                        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.aDSearchBar);
                        CommonUtils.sendKeysToElement(aDConsoleLocatorsPage.aDSearchBar, IAMRedesignConstants.NCI_CLOUD_ONE_GROUP);
                        CommonUtils.clickOnElement(aDConsoleLocatorsPage.aDSearchButton);
                        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneButton);
                        CucumberLogUtils.logScreenshot();
                        CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneButton);
                        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
                    }
                }
            } catch (NoSuchElementException f) {
                try {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
                } catch (NoSuchElementException k) {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
                }
            }
            if (aDConsoleLocatorsPage.userNames.size() > 0) {
                for (WebElement nameLocator : aDConsoleLocatorsPage.userNames) {
                    String useName = nameLocator.getText();
                    if (useName.length() > 0) {
                        devReadOnlyNames.add(useName);
                    }
                }
            }
            CucumberLogUtils.logScreenshot();
            try {
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneMenuTab);
                CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
            } catch (NoSuchElementException f) {
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneMenuTab);
                CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
            }catch (TimeoutException m) {
                try {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneMenuTab);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
                }catch (TimeoutException s) {
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.groupsButtonTab);
                    CucumberLogUtils.logScreenshot();
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.groupsButtonTab);
                    MiscUtils.sleep(5000);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.aDSearchBar);
                    CommonUtils.sendKeysToElement(aDConsoleLocatorsPage.aDSearchBar, IAMRedesignConstants.NCI_CLOUD_ONE_GROUP);
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.aDSearchButton);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneButton);
                    CucumberLogUtils.logScreenshot();
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneButton);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
                }
            }
            CommonUtils.sendKeysToElement(aDConsoleLocatorsPage.aDSearchBar, aWsAccounNumber);
            CommonUtils.clickOnElement(aDConsoleLocatorsPage.aDSearchButton);
            try {
                CommonUtils.waitForVisibility(ADConsoleLocatorsPage.idcReadOnlyDynamicCheckbox(aWsAccounNumber));
            } catch (NoSuchElementException e) {
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.aDSearchButton);
                try {
                    CommonUtils.waitForVisibility(ADConsoleLocatorsPage.idcReadOnlyDynamicCheckbox(aWsAccounNumber));
                } catch (NoSuchElementException f) {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.aDSearchButton);
                    CommonUtils.waitForVisibility(ADConsoleLocatorsPage.idcReadOnlyDynamicCheckbox(aWsAccounNumber));
                }
            }
            try {
                try {
                    CommonUtils.clickOnElement(ADConsoleLocatorsPage.readOnlyDynamicCheckbox(aWsAccounNumber));
                } catch (NoSuchElementException k) {
                    CommonUtils.clickOnElement(ADConsoleLocatorsPage.readOnlyDynamicCheckboxTypo(aWsAccounNumber));
                    nameTypo.add(ADConsoleLocatorsPage.readOnlyDynamicCheckboxTypo(aWsAccounNumber).getText());
                }
                CucumberLogUtils.logScreenshot();
                try {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
                } catch (TimeoutException g) {
                    MiscUtils.sleep(2000);
                    try {
                        CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
                    } catch (TimeoutException k) {
                        CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
                    }
                } catch (NoSuchElementException f) {
                    try {
                        CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
                    } catch (NoSuchElementException k) {
                        CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
                    }
                }
                if (aDConsoleLocatorsPage.userNames.size() > 0) {
                    for (WebElement nameLocator : aDConsoleLocatorsPage.userNames) {
                        String useName = nameLocator.getText();
                        if (useName.length() > 0) {
                            devReadOnlyNames.add(useName);
                        }
                    }
                }
                try {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneMenuTab);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
                } catch (NoSuchElementException f) {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneMenuTab);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
                }catch (TimeoutException m) {
                    try {
                        CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneMenuTab);
                        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
                    }catch (TimeoutException s) {
                        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.groupsButtonTab);
                        CucumberLogUtils.logScreenshot();
                        CommonUtils.clickOnElement(aDConsoleLocatorsPage.groupsButtonTab);
                        MiscUtils.sleep(5000);
                        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.aDSearchBar);
                        CommonUtils.sendKeysToElement(aDConsoleLocatorsPage.aDSearchBar, IAMRedesignConstants.NCI_CLOUD_ONE_GROUP);
                        CommonUtils.clickOnElement(aDConsoleLocatorsPage.aDSearchButton);
                        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneButton);
                        CucumberLogUtils.logScreenshot();
                        CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneButton);
                        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
                    }
                }
                CommonUtils.sendKeysToElement(aDConsoleLocatorsPage.aDSearchBar, aWsAccounNumber);
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.aDSearchButton);
                try {
                    CommonUtils.waitForVisibility(ADConsoleLocatorsPage.idcReadOnlyDynamicCheckbox(aWsAccounNumber));
                } catch (NoSuchElementException e) {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.aDSearchButton);
                    try {
                        CommonUtils.waitForVisibility(ADConsoleLocatorsPage.idcReadOnlyDynamicCheckbox(aWsAccounNumber));
                    } catch (NoSuchElementException f) {
                        CommonUtils.clickOnElement(aDConsoleLocatorsPage.aDSearchButton);
                        CommonUtils.waitForVisibility(ADConsoleLocatorsPage.idcReadOnlyDynamicCheckbox(aWsAccounNumber));
                    }
                }
            } catch (NoSuchElementException h) {
                CucumberLogUtils.logScreenshot();
            }
            CommonUtils.clickOnElement(ADConsoleLocatorsPage.idcReadOnlyDynamicCheckbox(aWsAccounNumber));
            CucumberLogUtils.logScreenshot();
            try {
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
            } catch (TimeoutException g) {
                MiscUtils.sleep(2000);
                try {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
                } catch (TimeoutException k) {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
                }
            } catch (NoSuchElementException f) {
                try {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
                } catch (NoSuchElementException k) {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
                }
            }
            if (aDConsoleLocatorsPage.userNames.size() > 0) {
                for (WebElement nameLocator : aDConsoleLocatorsPage.userNames) {
                    String useName = nameLocator.getText();
                    if (useName.length() > 0) {
                        newDevReadOnlyNames.add(useName);
                        for (String r : allConsoleMembers) {
                            if (r.contains(useName)) {
                                consoleUserPresent.add(useName);
                            }
                        }
                    }
                }
            }
            if (newDevReadOnlyNames.size() == consoleUserPresent.size()) {
                consolUserPass += 1;
            }
            for (String a : devReadOnlyNames) {
                for (String b : newDevReadOnlyNames) {
                    if (a.equals(b)) {
                        devNotMatch.add(b);
                    }
                }
            }
            CucumberLogUtils.logScreenshot();
            try {
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneMenuTab);
                CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
            } catch (NoSuchElementException f) {
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneMenuTab);
                CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
            }catch (TimeoutException m) {
                try {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneMenuTab);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
                }catch (TimeoutException s) {
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.groupsButtonTab);
                    CucumberLogUtils.logScreenshot();
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.groupsButtonTab);
                    MiscUtils.sleep(5000);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.aDSearchBar);
                    CommonUtils.sendKeysToElement(aDConsoleLocatorsPage.aDSearchBar, IAMRedesignConstants.NCI_CLOUD_ONE_GROUP);
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.aDSearchButton);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneButton);
                    CucumberLogUtils.logScreenshot();
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneButton);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
                }
            }
            CommonUtils.sendKeysToElement(aDConsoleLocatorsPage.aDSearchBar, aWsAccounNumber);
            CommonUtils.clickOnElement(aDConsoleLocatorsPage.aDSearchButton);
            try {
                CommonUtils.waitForVisibility(ADConsoleLocatorsPage.idcReadOnlyDynamicCheckbox(aWsAccounNumber));
            } catch (NoSuchElementException e) {
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.aDSearchButton);
                try {
                    CommonUtils.waitForVisibility(ADConsoleLocatorsPage.idcReadOnlyDynamicCheckbox(aWsAccounNumber));
                } catch (NoSuchElementException f) {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.aDSearchButton);
                    CommonUtils.waitForVisibility(ADConsoleLocatorsPage.idcReadOnlyDynamicCheckbox(aWsAccounNumber));
                }
            }
            CucumberLogUtils.logScreenshot();
            try {
            CommonUtils.clickOnElement(ADConsoleLocatorsPage.nciPowerDynamicCheckbox(aWsAccounNumber));
            } catch (NoSuchElementException k) {
                CommonUtils.clickOnElement(ADConsoleLocatorsPage.nciPowerDynamicCheckboxTypo(aWsAccounNumber));
                nameTypo.add(ADConsoleLocatorsPage.nciPowerDynamicCheckboxTypo(aWsAccounNumber).getText());
            }
            CucumberLogUtils.logScreenshot();
            try {
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
            } catch (TimeoutException g) {
                MiscUtils.sleep(2000);
                try {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
                } catch (TimeoutException k) {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
                }
            } catch (NoSuchElementException f) {
                try {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
                } catch (NoSuchElementException k) {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
                }
            }
            if (aDConsoleLocatorsPage.userNames.size() > 0) {
                for (WebElement nameLocator : aDConsoleLocatorsPage.userNames) {
                    String useName = nameLocator.getText();
                    if (useName.length() > 0) {
                        nciPowerUserNames.add(useName);
                    }
                }
            }
            CucumberLogUtils.logScreenshot();
            try {
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneMenuTab);
                CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
            } catch (NoSuchElementException f) {
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneMenuTab);
                CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
            }catch (TimeoutException m) {
                try {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneMenuTab);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
                }catch (TimeoutException s) {
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.groupsButtonTab);
                    CucumberLogUtils.logScreenshot();
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.groupsButtonTab);
                    MiscUtils.sleep(5000);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.aDSearchBar);
                    CommonUtils.sendKeysToElement(aDConsoleLocatorsPage.aDSearchBar, IAMRedesignConstants.NCI_CLOUD_ONE_GROUP);
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.aDSearchButton);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneButton);
                    CucumberLogUtils.logScreenshot();
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneButton);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
                }
            }
            CommonUtils.sendKeysToElement(aDConsoleLocatorsPage.aDSearchBar, aWsAccounNumber);
            CommonUtils.clickOnElement(aDConsoleLocatorsPage.aDSearchButton);
            try {
                CommonUtils.waitForVisibility(ADConsoleLocatorsPage.idcReadOnlyDynamicCheckbox(aWsAccounNumber));
            } catch (NoSuchElementException e) {
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.aDSearchButton);
                try {
                    CommonUtils.waitForVisibility(ADConsoleLocatorsPage.idcReadOnlyDynamicCheckbox(aWsAccounNumber));
                } catch (NoSuchElementException f) {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.aDSearchButton);
                    CommonUtils.waitForVisibility(ADConsoleLocatorsPage.idcReadOnlyDynamicCheckbox(aWsAccounNumber));
                }
            }
            CucumberLogUtils.logScreenshot();
            CommonUtils.clickOnElement(ADConsoleLocatorsPage.idcPowerDynamicCheckbox(aWsAccounNumber));
            CucumberLogUtils.logScreenshot();
            try {
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
            } catch (TimeoutException g) {
                MiscUtils.sleep(2000);
                try {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
                } catch (TimeoutException k) {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
                }
            } catch (NoSuchElementException f) {
                try {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
                } catch (NoSuchElementException k) {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
                }
            }
            if (aDConsoleLocatorsPage.userNames.size() > 0) {
                for (WebElement nameLocator : aDConsoleLocatorsPage.userNames) {
                    String useName = nameLocator.getText();
                    if (useName.length() > 0) {
                        idcPowerUserNames.add(useName);
                        for (String q : allConsoleMembers) {
                            if (q.contains(useName)) {
                                powerUsersConsolePresent.add(useName);
                            }
                        }
                    }
                }
            }
            CucumberLogUtils.logScreenshot();
            if (idcPowerUserNames.size() == powerUsersConsolePresent.size()) {
                powerUserPass += 1;
            }
            for (String s : nciPowerUserNames) {
                for (String m : idcPowerUserNames) {
                    if (s.equals(m)) {
                        powerUserNotMatch.add(m);
                    }
                }
            }
            if (nciPowerUserNames.size() == idcPowerUserNames.size() && nciPowerUserNames.size() == powerUserNotMatch.size()) {
                powerUserPass += 2;
            }
            if (devReadOnlyNames.size() == newDevReadOnlyNames.size() && devReadOnlyNames.size() == devNotMatch.size()){
                consolUserPass += 2;
            }
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
            if(consolUserPass == 3 && powerUserPass == 3){
                System.out.println("Account:" + aWsAccounNumber + " PASS");
                allPassedTests += 1;
            } else if(consolUserPass == 0 && powerUserPass <= 3){
                System.out.println("Account:" + aWsAccounNumber + " FAIL - Groups members do no match and some members may not be in the Console User Group");
                failedAccounts.add("Account:" + aWsAccounNumber + " FAIL - Groups members do no match and some members may not be in the Console User Group");
                allFailedTests += 1;
            } else if(consolUserPass == 1 && powerUserPass <= 3){
                System.out.println("Account:" + aWsAccounNumber + " FAIL - Not all members are migrated from the old groups");
                failedAccounts.add("Account:" + aWsAccounNumber + " FAIL - Not all members are migrated from the old groups");
                allFailedTests += 1;
            } else if(consolUserPass == 2 && powerUserPass <= 3){
                System.out.println("Account:" + aWsAccounNumber + " FAIL - Some members may not be in the Console User Group");
                failedAccounts.add("Account:" + aWsAccounNumber + " FAIL - Some members may not be in the Console User Group");
                allFailedTests += 1;
            } else if(powerUserPass == 2 && consolUserPass <= 3){
                System.out.println("Account:" + aWsAccounNumber + " FAIL - Some Power User members may not be in the Console User Group");
                failedAccounts.add("Account:" + aWsAccounNumber + " FAIL - Some Power User members may not be in the Console User Group");
                allFailedTests += 1;
            } else if(powerUserPass == 1 && consolUserPass <= 3){
                System.out.println("Account:" + aWsAccounNumber + " FAIL - Not all Power User members are migrated from the old groups");
                failedAccounts.add("Account:" + aWsAccounNumber + " FAIL - Some Power User members may not be in the Console User Group");
                allFailedTests += 1;
            } else {
                System.out.println("Account:" + aWsAccounNumber + " FAIL");
                failedAccounts.add("Account:" + aWsAccounNumber + " FAIL");
                allFailedTests += 1;
            }
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
            System.out.println("OD: " + devReadOnlyNames.size());
            System.out.println("ND: " + newDevReadOnlyNames.size());
            System.out.println("CD: " + consoleUserPresent.size());
            System.out.println("--------");
            System.out.println("OP: " + nciPowerUserNames.size());
            System.out.println("NP: " + idcPowerUserNames.size());
            System.out.println("CP: " + powerUsersConsolePresent.size());
            if(nameTypo.size() > 0){
                System.out.println("Group Name Typo: Please check Groups Names for Typos" );
            }
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
            CucumberLogUtils.logScreenshot();
            try {
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneMenuTab);
                CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
            } catch (NoSuchElementException f) {
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneMenuTab);
                CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
            }catch (TimeoutException m) {
                try {
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneMenuTab);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
                }catch (TimeoutException s) {
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.groupsButtonTab);
                    CucumberLogUtils.logScreenshot();
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.groupsButtonTab);
                    MiscUtils.sleep(5000);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.aDSearchBar);
                    CommonUtils.sendKeysToElement(aDConsoleLocatorsPage.aDSearchBar, IAMRedesignConstants.NCI_CLOUD_ONE_GROUP);
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.aDSearchButton);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneButton);
                    CucumberLogUtils.logScreenshot();
                    CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneButton);
                    CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserText);
                }
            }
        }
            System.out.println("***********************************************************************************************************************");
            System.out.println("Total accounts:" + urlsListProd.size());
            System.out.println("Accounts PASS:" + allPassedTests);
            System.out.println("Accounts FAIL:" + allFailedTests);
            System.out.println("***********************************************************************************************************************");
            if (failedAccounts.size() > 0) {
                for (String f : failedAccounts) {
                    System.out.println(f);
                }
                System.out.println("***********************************************************************************************************************");
            }
    }

    /**
     * This method will retrieve all Console Users Group Members
     *
     */
    public static void retrieveAllConsoleUsers() {
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(aDConsoleLocatorsPage.nihAdManagementButton);
        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.activeDirectoryhButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(aDConsoleLocatorsPage.activeDirectoryhButton);
        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.NIHGovButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(aDConsoleLocatorsPage.NIHGovButton);
        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.ADButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(aDConsoleLocatorsPage.ADButton);
        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.NIHButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(aDConsoleLocatorsPage.NIHButton);
        MiscUtils.sleep(3000);
        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.NCIButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(aDConsoleLocatorsPage.NCIButton);
        MiscUtils.sleep(3000);
        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.groupsButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(aDConsoleLocatorsPage.groupsButton);
        MiscUtils.sleep(5000);
        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.aDSearchBar);
        CommonUtils.sendKeysToElement(aDConsoleLocatorsPage.aDSearchBar, IAMRedesignConstants.NCI_CLOUD_ONE_GROUP);
        CommonUtils.clickOnElement(aDConsoleLocatorsPage.aDSearchButton);
        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneButton);
        CommonUtils.waitForVisibility(aDConsoleLocatorsPage.cloudOneConsoleUserCheckBox);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(aDConsoleLocatorsPage.cloudOneConsoleUserCheckBox);
        CucumberLogUtils.logScreenshot();
        try {
            CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
            CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
        } catch (TimeoutException g) {
            MiscUtils.sleep(2000);
            try {
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
            } catch (TimeoutException k) {
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
            }
        } catch (NoSuchElementException f) {
            try {
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
            } catch (NoSuchElementException k) {
                CommonUtils.clickOnElement(aDConsoleLocatorsPage.membersButton);
                CommonUtils.waitForVisibility(aDConsoleLocatorsPage.typeText);
            }
        }
        boolean allMembers = false;
        int i = 2;
        while (!allMembers) {
            try {
                String value = "" + i;
                String consoleMemberName = ADConsoleLocatorsPage.consoleUserMemberName(value).getText();
                JavascriptUtils.scrollIntoView(ADConsoleLocatorsPage.consoleUserMemberName(value));
                for (WebElement c:aDConsoleLocatorsPage.allConsoleUsersNamesText){
                    String consoleMName = c.getText();
                    if (consoleMemberName.length() > 0) {
                        allConsoleMembers.add(consoleMName);
                    }
                }
                i++;
            } catch (NoSuchElementException e) {
                allMembers = true;
            }
        }
    }
}
