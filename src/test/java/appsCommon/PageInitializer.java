package appsCommon;

import ServiceNow.COVIDDash.NativeView.Pages.NativeViewDashboardPage;
import ServiceNow.COVIDDash.Pages.COVIDHomePage;
import ServiceNow.COVIDDash.Pages.SubmissionsPage;

/**
 * This an initializer class which will initialize all pages classes.
 * Once pages class created, create an object it here inside the constructor
 */
public class PageInitializer { 

	// declare protected static variables of types of all the pages
	protected static ITrustLoginPage iTrustloginPage;
	protected static ITrustLoginPageImpl loginImpl;
	protected static COVIDHomePage covidHomePage;
	protected static SubmissionsPage submissionPage;
	protected static NativeViewDashboardPage nativeViewDashPage;
	
	
	public static void initializeAllPages() {
		// create instances of all pages and assign them to the variables
		iTrustloginPage = new ITrustLoginPage();
		 loginImpl=new ITrustLoginPageImpl();
		 covidHomePage = new COVIDHomePage();
		 submissionPage=new SubmissionsPage();
		 nativeViewDashPage=new NativeViewDashboardPage();
	}
	
	
	
}
