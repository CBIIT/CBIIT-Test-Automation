package CUSTOM_BUSINESS.ETD.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ETDCommonUtils {
	
	/** verify that list of strings is sorted alphabetically/ascending order **/
	public static boolean isSorted(Set<String> set) {
		Iterator<String> iter = set.iterator();
		String current, previous = iter.next();
		while (iter.hasNext()) {
			current = iter.next();
			if (previous.compareTo(current) > 0) {
				return false;
			}
			previous = current;
		}
		return true;
	}

	/** verify that list of strings is sorted descending order **/
	public static boolean isSortedDescending(Set<String> set) {
		Iterator<String> iter = set.iterator();
		String current, previous = iter.next();
		while (iter.hasNext()) {
			current = iter.next();
			if (previous.compareTo(current) < 0) {
				return false;
			}
			previous = current;
		}
		return true;
	}
	
	/** close window**/
	public void closeOutlookWindow() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_F4);
		robot.keyRelease(KeyEvent.VK_ALT);
		robot.keyRelease(KeyEvent.VK_F4);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);

	}
	
	/** compare  dates**/
	public boolean compareDates(Set<String> set) {
		try {
			Iterator<String> iter = set.iterator();
			SimpleDateFormat fmt = new SimpleDateFormat("MM/dd/yyyy");
			String current = iter.next();
			String previous = iter.next();
			java.util.Date Fdate = fmt.parse(current);
			java.util.Date Tdate = fmt.parse(previous);
			while (iter.hasNext()) {
				current = iter.next();
				if (Tdate.compareTo(Fdate) > 0) {
					return false;
				}
				previous = current;
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return true;
	}
	
	/** wait Browser**/
	public static void waitBrowser(int ms) {
		try {
			Thread.sleep(ms);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}
  /** wait till Alert is Present**/
	public static void waitUtilsAlertIsPresent(long timeOut, WebDriver webDriver) {
		WebDriverWait webDriverWait = new WebDriverWait(webDriver,Duration.ofSeconds(10));
		webDriverWait.until(ExpectedConditions.alertIsPresent());
	}
}