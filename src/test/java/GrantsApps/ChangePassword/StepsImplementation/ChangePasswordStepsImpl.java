package GrantsApps.ChangePassword.StepsImplementation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Random;

import com.nci.automation.utils.MiscUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;

public class ChangePasswordStepsImpl extends PageInitializer {

    public static void andreyeveiTrustLogin() throws TestingException {
        MiscUtils.sleep(2000);
        iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "andreyeveUsername");
        iTrustloginPage.enterPassword("andreyevePassword");
        // CucumberLogUtils.logScreenShot();
        iTrustloginPage.clickSignInButton();
        MiscUtils.sleep(500);
    }

    public static String generateNewPassword() {

        int len = 20;
        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghi"
                +"jklmnopqrstuvwxyz!";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(chars.charAt(rnd.nextInt(chars.length())));
        System.out.println(sb.toString());
        return sb.toString();

    }
    public void closeOutlookWindowEM() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_F4);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_F4);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);



    }

}

