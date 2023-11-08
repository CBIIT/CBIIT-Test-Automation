package appsCommon;

import ServiceNow.COVIDDash.NativeView.Pages.NativeViewDashboardPage;
import ServiceNow.COVIDDash.NativeView.StepsImplementation.NativeViewDashboardPageImpl;
import ServiceNow.COVIDDash.Pages.COVIDHomePage;
import ServiceNow.COVIDDash.Pages.SubmissionsPage;
import ServiceNow.COVIDDash.StepsImplementation.COVIDHomePageImpl;
import ServiceNow.COVIDDash.StepsImplementation.SubmissionsPageImpl;

public class PageCache {

	private static ThreadLocal<PageCache> pageCache = new ThreadLocal<PageCache>();

	private PageCache() {
		// Private Constructor
	}

	public synchronized static PageCache getInstance() {
		if (pageCache.get() == null) {
			pageCache.set(new PageCache());
		}
		return pageCache.get();
	}

	// private pages variables
	private ITrustLoginPageImpl loginPageImpl;
	private COVIDHomePageImpl covidHomePageImpl;
	private SubmissionsPageImpl submissionPageImpl;
	private NativeViewDashboardPageImpl nativeViewDashImpl;

	// private Pages variable if any
	private COVIDHomePage covidHomePage;
	private ITrustLoginPage iTrustLoginPage;
	private NativeViewDashboardPage nativeViewDashPage;
	private SubmissionsPage submissionsPage;

	// add implementation class object bellow
	public ITrustLoginPageImpl getITrustLoginPageImpl() {
		if (loginPageImpl == null)
			loginPageImpl = new ITrustLoginPageImpl();
		return loginPageImpl;
	}

	public COVIDHomePageImpl getCOVIDHomePageImpl() {
		if (covidHomePageImpl == null)
			covidHomePageImpl = new COVIDHomePageImpl();
		return covidHomePageImpl;
	}

	public SubmissionsPageImpl getSubmissionsPageImpl() {
		if (submissionPageImpl == null)
			submissionPageImpl = new SubmissionsPageImpl();
		return submissionPageImpl;
	}

	public NativeViewDashboardPageImpl getNativeViewDashboardPageImpl() {
		if (nativeViewDashImpl == null)
			nativeViewDashImpl = new NativeViewDashboardPageImpl();
		return nativeViewDashImpl;
	}

	// Pages Object below
	public ITrustLoginPage getITrustLoginPage() {
		if (iTrustLoginPage == null)
			iTrustLoginPage = new ITrustLoginPage();
		return iTrustLoginPage;
	}

	public COVIDHomePage getCOVIDHomePage() {
		if (covidHomePage == null)
			covidHomePage = new COVIDHomePage();
		return covidHomePage;
	}

	public NativeViewDashboardPage getNativeViewDashboardPage() {
		if (nativeViewDashPage == null)
			nativeViewDashPage = new NativeViewDashboardPage();
		return nativeViewDashPage;
	}

	public SubmissionsPage getSubmissionsPage() {
		if (submissionsPage == null)
			submissionsPage = new SubmissionsPage();
		return submissionsPage;
	}

	
	

	
	/**
	 * This method will destroy any object that was created.
	 */
	public void destroyInstances() {
		
		if (loginPageImpl != null)
			loginPageImpl = null;

		if (covidHomePageImpl != null)
			covidHomePageImpl = null;

		if (submissionPageImpl != null)
			submissionPageImpl = null;

		if (nativeViewDashImpl != null)
			nativeViewDashImpl = null;

		if (covidHomePage != null)
			covidHomePage = null;

		if (iTrustLoginPage != null)
			iTrustLoginPage = null;

		if (nativeViewDashPage != null)
			nativeViewDashPage = null;

		if (submissionsPage != null)
			submissionsPage = null;
	}
}
