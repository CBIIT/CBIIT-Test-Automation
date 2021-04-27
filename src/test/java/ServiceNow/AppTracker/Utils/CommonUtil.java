package ServiceNow.AppTracker.Utils;

public class CommonUtil {
	
	public static void waitBrowser(int ms) {
		try {
			Thread.sleep(ms);
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}

}
}
