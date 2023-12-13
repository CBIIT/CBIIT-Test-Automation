package CloudAndSystemEngineering.ShutdownBanner.StepsImplementation;

import CloudAndSystemEngineering.ShutdownBanner.Constants.ShutdownBannerConstants;
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
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ShutdownBannerStepImpl extends PageInitializer {

    public static List<String> urlsListProd = new ArrayList<>();
    public static HashSet<String> brokenLinks = new HashSet<>();
    public static HashSet<String> pagesNotLoading = new HashSet<>();
    public static HashSet<String> pagesWithoutBanner = new HashSet<>();

    public static void generatingLinksFromUrlExcelSheet() {
        HashSet<String> mainWorkingLinks = new HashSet<>();
        for (String listUrlsProd:urlsListProd) {
            mainWorkingLinks.add(listUrlsProd);
            WebDriverUtils.webDriver.get(listUrlsProd);
            MiscUtils.sleep(2000);
            List<WebElement> links = WebDriverUtils.webDriver.findElements(By.tagName("a"));
            String[] urlsplit = listUrlsProd.split("\\.");
        String[] urlSearchWord = urlsplit[0].split("//");
        System.out.println("SEARCH WORD: " + urlsplit[0]);
        System.out.println("TOTAL LINKS NOT FILTERED: " + links.size());
        for(int i=0;i<links.size();i++){
            WebElement E1= links.get(i);
            String url= E1.getAttribute("href");
            if (url !=null && url.contains(urlsplit[0]) && !url.contains(".pdf") && !url.contains(".xls") && !url.contains("#")){
                List<String> uniqueURL = new ArrayList<>();
                for(String j:mainWorkingLinks){
                    if(url.equalsIgnoreCase(j)){
                        uniqueURL.add(url);
                    }
                }
                if (uniqueURL.size()==0){
                    mainWorkingLinks.add(url);
                }
            }
        }
        }
        System.out.println("TOTAL FILTERED LINKS: " + mainWorkingLinks.size());
        System.out.println("***********************************************************************************************************************");
        for(String uniqueLinks:mainWorkingLinks) {
            System.out.println(uniqueLinks);
        }
        }

    public static void theUserShouldSeeTheShutdownBanner() {
        for (String listUrlsProd:urlsListProd) {

            HashSet<String> urlList = new HashSet<>();
            Document doc = null;
            try {
                doc = Jsoup.connect(listUrlsProd + "/sitemap.xml").get();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Elements urls = doc.getElementsByTag("loc");
            for (Element url : urls) {
                String[] urlsplit = url.text().split("\\>");
                String[] urlSearchWord = urlsplit[0].split("\\<");
                urlList.add(urlSearchWord[0]);
            }
            System.out.println("***********************************************************************************************************************");
            System.out.println("NUMBER OF MAIN URLS FROM EXCEL: " + urlsListProd.size());
            System.out.println("NUMBER OF UNIQUE URLS FROM SITEMAP FOR: " + listUrlsProd + " - " + urlList.size());
            for (String urlSet:urlList) {
                try {
                    URL link = new URL(urlSet);
                    HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
                    httpConn.connect();
                    int code = httpConn.getResponseCode();
                    if (code >= 400) {
                        System.out.println("Broken Link: " + urlSet);
                        brokenLinks.add(urlSet);
                    } else{
                        long startTime = System.currentTimeMillis();
                        WebDriverUtils.webDriver.get(urlSet);
                        if (CommonUtils.isElementDisplayed(shutdownBannerLocatorsPage.bannerBodyText)){
                            JavascriptUtils.scrollIntoView(shutdownBannerLocatorsPage.bannerBodyText);
                            CommonUtils.assertEqualsWithMessage(shutdownBannerLocatorsPage.bannerBodyText.getText(), ShutdownBannerConstants.MESSAGE_BODY_ENGLISH, "ASSERTING THE SPANISH BANNER BODY TEXT");
                            CommonUtils.assertEqualsWithMessage(shutdownBannerLocatorsPage.bannerTitleText.getText(), ShutdownBannerConstants.MESSAGE_TITLE_ENGLISH, "ASSERTING THE SPANISH BANNER TITLE TEXT");
                        }
                        else{
                            pagesWithoutBanner.add(urlSet);
                        }
                        CucumberLogUtils.logScreenshot();
                        long endTime = System.currentTimeMillis();
                        long totalTime = endTime - startTime;
                        System.out.println(totalTime + " Milliseconds load time for: " + urlSet);
                        }
                } catch (Exception e) {
                    pagesNotLoading.add(urlSet);
                }
            }
        }
        System.out.println("***********************************************************************************************************************");
        System.out.println("PAGES THAT ARE NOT LOADING: " + pagesNotLoading.size());
        System.out.println("***********************************************************************************************************************");
        for (String bl:pagesNotLoading) {
            System.out.println(bl);
        }
        System.out.println("***********************************************************************************************************************");
        System.out.println("ALL BROKEN LINKS ARE: " + brokenLinks.size());
        System.out.println("***********************************************************************************************************************");
        for (String bl:brokenLinks) {
            System.out.println(bl);
        }
        System.out.println("***********************************************************************************************************************");
        System.out.println("PAGES WITHOUT BANNER: " + pagesWithoutBanner.size());
        System.out.println("***********************************************************************************************************************");
        for (String bl:pagesWithoutBanner) {
            System.out.println(bl);
        }
    }

    public static void theUserShouldSeeTheShutdownBannerNoSiteMap() {
        System.out.println("VERIFYING PAGES: " + urlsListProd.size());
        System.out.println("***********************************************************************************************************************");
            for (String urlSet:urlsListProd) {
                try {
                        URL link = new URL(urlSet);
                        HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
                        httpConn.connect();
                        int code = httpConn.getResponseCode();
                        if (code >= 400) {
                            System.out.println("Broken Link: " + urlSet);
                            brokenLinks.add(urlSet);
                        } else{
                        long startTime = System.currentTimeMillis();
                        WebDriverUtils.webDriver.get(urlSet);
                        if (shutdownBannerLocatorsPage.bannerLinkPresent.size() == 1){
                            JavascriptUtils.scrollIntoView(shutdownBannerLocatorsPage.bannerBodyText);
                            CommonUtils.assertEqualsWithMessage(shutdownBannerLocatorsPage.bannerBodyText.getText(), ShutdownBannerConstants.MESSAGE_BODY_ENGLISH, "ASSERTING THE SPANISH BANNER BODY TEXT");
                            CommonUtils.assertEqualsWithMessage(shutdownBannerLocatorsPage.bannerTitleText.getText(), ShutdownBannerConstants.MESSAGE_TITLE_ENGLISH, "ASSERTING THE SPANISH BANNER TITLE TEXT");
                        }
                        else{
                            pagesWithoutBanner.add(urlSet);
                        }
                        CucumberLogUtils.logScreenshot();
                        long endTime = System.currentTimeMillis();
                        long totalTime = endTime - startTime;
                        System.out.println(totalTime + " Milliseconds load time for: " + urlSet);
                        }

                } catch (IOException e) {
                    pagesNotLoading.add(urlSet);
                }
            }
        System.out.println("***********************************************************************************************************************");
        System.out.println("PAGES THAT ARE NOT LOADING: " + pagesNotLoading.size());
        System.out.println("***********************************************************************************************************************");
        for (String bl:pagesNotLoading) {
            System.out.println(bl);
        }
        System.out.println("***********************************************************************************************************************");
        System.out.println("ALL BROKEN LINKS ARE: " + brokenLinks.size());
        System.out.println("***********************************************************************************************************************");
        for (String bl:brokenLinks) {
            System.out.println(bl);
        }
        System.out.println("***********************************************************************************************************************");
        System.out.println("PAGES WITHOUT BANNER: " + pagesWithoutBanner.size());
        System.out.println("***********************************************************************************************************************");
        for (String bl:pagesWithoutBanner) {
            System.out.println(bl);
        }
    }

    public static void getAllLinksFromExcelSheet ()  {
        DataFormatter formatter = new DataFormatter();
        try {
            FileInputStream file= new FileInputStream(ShutdownBannerConstants.BANNER_URL_LIST_PRPD);
            Workbook book= new XSSFWorkbook(file);
            Sheet sheet= book.getSheet(ShutdownBannerConstants.BANNER_URL_LIST_PROD_SHEET_NAME_NO_SITEMAP);
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
      }
    }


