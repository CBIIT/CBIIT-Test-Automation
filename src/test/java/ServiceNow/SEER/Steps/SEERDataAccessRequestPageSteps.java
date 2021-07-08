package ServiceNow.SEER.Steps;

import java.util.Iterator;
import java.util.Set;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SEERDataAccessRequestPageSteps extends PageInitializer {  
	

	@Given("a SEER User Registration has been successfully submitted")
	public void a_SEER_User_Registration_has_been_successfully_submitted() throws TestingException { 
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("SEERDataAccess"));
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(seerLandingPage.nonInstitutionalAccountsEmailAddressField);
		MiscUtils.sleep(2000);
		CommonUtils.sendKeys(seerLandingPage.nonInstitutionalAccountsEmailAddressField, CommonUtils.email);
		MiscUtils.sleep(2000);
		seerLandingPage.nonInstitutionalAccountsContinuetoEmailVerificationButton.click();
		MiscUtils.sleep(2000);
		String seerRegistrationPage = WebDriverUtils.getWebDriver().getTitle();
		Assert.assertTrue(seerRegistrationPage.contentEquals("SEER User Registration - ODS SEER Data Access Request"));
		seerUserRegistrationPage.seerUserRegistrationFirstNameField.sendKeys("TestFIRSTname");
		seerUserRegistrationPage.seerUserRegistrationMiddleNameField.sendKeys("TestMIDDLEname");
		seerUserRegistrationPage.seerUserRegistrationLastNameField.sendKeys("TestLASTname");
		MiscUtils.sleep(2000);
		Assert.assertEquals(CommonUtils.email,seerUserRegistrationPage.seerUserRegistrationEmailField.getAttribute("value"));
		Assert.assertTrue(seerUserRegistrationPage.seerUserRegistrationEmailField.getAttribute("disabled").equals("true"));
		MiscUtils.sleep(2000); 
		seerUserRegistrationPage.seerUserRegistrationOrganizationField.click();
		seerUserRegistrationPage.seerUserRegistrationOrganizationField.sendKeys("A. T. Still University");
		MiscUtils.sleep(2000);
		seerUserRegistrationPage.seerUserRegistrationJobTitleField.sendKeys("TestJOBtitle");
		JavascriptUtils.scrollIntoView(seerUserRegistrationPage.seerUserRegistrationEmailField);
		MiscUtils.sleep(2000);
		seerUserRegistrationPage.seerUserRegistrationCountryField.click();
		seerUserRegistrationPage.seerUserRegistrationCountryField.sendKeys("United States of America");
		seerUserRegistrationPage.seerUserRegistrationCountryUSA.click();
		MiscUtils.sleep(2000);
		seerUserRegistrationPage.seerUserRegistrationAddressField.sendKeys("330 Ivy Lane, Apartment 6");
		seerUserRegistrationPage.seerUserRegistrationCityField.sendKeys("NYC");
		seerUserRegistrationPage.seerUserRegistrationStateField.sendKeys("NY");
		seerUserRegistrationPage.seerUserRegistrationZipcodeField.sendKeys("11214");
		seerUserRegistrationPage.seerUserRegistrationPhoneField.sendKeys("6306543343");
		MiscUtils.sleep(2000);
		CommonUtils.selectDropDownValue("General Public",seerUserRegistrationPage.seerUserRegistrationWhichOfTheseBestDescribeYouField);
		MiscUtils.sleep(2000);
		seerUserRegistrationPage.seerUserRegistrationSubmitButton.click();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(2000);
		String seerRegistrationIsCompletePage = WebDriverUtils.getWebDriver().getTitle();
		Assert.assertEquals("SEER Data Confirmation - ODS SEER Data Access Request", seerRegistrationIsCompletePage);
		Assert.assertEquals("Thank you - your registration is complete.",seerUserRegistrationPage.seerUserRegistrationIsCompleteHeader.getText());
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();

	}

	@Given("user verifies email address by clicking on the email verification link that is sent to the user after submitting a SEER User registration form")
	public void user_verifies_email_address_by_clicking_on_the_email_verification_link_that_is_sent_to_the_user_after_submitting_a_SEER_User_registration_form()
			throws TestingException {
		nativeViewLoginImpl.nativeViewLogin();
		CommonUtils.waitForVisibility(nativeViewEnrollementsPage.filterNavigator);
		nativeViewEnrollementsPage.filterNavigator.sendKeys("mailbox");
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(nativeViewSentViewPage.nativeViewmailboxSentLink);
		MiscUtils.sleep(40000);
		nativeViewSentViewPage.nativeViewmailboxSentLink.click();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.switchToFrame(nativeViewSentViewPage.nativeViewFrame);
		MiscUtils.sleep(2000);
		CommonUtils.selectDropDownValue("Recipients", nativeViewSentViewPage.nativeViewSearchDropDown);
		MiscUtils.sleep(2000);
		nativeViewSentViewPage.nativeViewSentSearchField.sendKeys(CommonUtils.email);
		MiscUtils.sleep(2000);
		nativeViewSentViewPage.nativeViewSentSearchField.sendKeys(Keys.ENTER);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		nativeViewSentViewPage.nativeViewCreatedButton.click();
		MiscUtils.sleep(2000);
		nativeViewSentViewPage.nativeViewPreviewVerifyEmailIcon.click();
		MiscUtils.sleep(2000);
		nativeViewSentViewPage.NativeViewPreviewVerifyEmailOpenRecordButton.click();
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(nativeViewSentViewPage.nativeViewPreviewVerifyEmailPreviewHTMLBodyLink);
		MiscUtils.sleep(2000);
		nativeViewSentViewPage.nativeViewPreviewVerifyEmailPreviewHTMLBodyLink.click();
		CommonUtils.switchToFrame(nativeViewSentViewPage.nativeViewPreviewEmailIFRAME);
		MiscUtils.sleep(2000);
		Assert.assertTrue(nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataHeader.getText().contentEquals("SEER Incidence Data: Verify your email address"));
		Assert.assertTrue(nativeViewSentViewPage.nativeViewPreviewEmailHelloNameText.getText().contentEquals("Hello TestFIRSTname,"));
		MiscUtils.sleep(2000);
		nativeViewSentViewPage.nativeViewPreviewEmailVerifyEMAILlink.click();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();	
	}

	@Then("the user is directed to the {string} page")
	public void the_user_is_directed_to_the_page(String landingPageHeaderText) {
		Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
		for (String currentWindow1 : allWindowHandles1) {
			WebDriverUtils.webDriver.switchTo().window(currentWindow1); 
		}
		String landingPageTitle = WebDriverUtils.getWebDriver().getTitle();
		Assert.assertTrue(landingPageTitle.contentEquals("SEER Data Access Request - ODS SEER Data Access Request"));
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(seerDataAccessRequestPage.seerDataAccessRequestHeader);
		Assert.assertTrue(seerDataAccessRequestPage.seerDataAccessRequestHeader.getText().contentEquals(landingPageHeaderText));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("the {string} field contains the name of the requestor in read-only format")
	public void the_field_contains_the_name_of_the_requestor_in_read_only_format(String requestedFor) {
		Assert.assertTrue(seerDataAccessRequestPage.requestedForText.getText().contentEquals(requestedFor));
		Assert.assertEquals("TestFIRSTname TestMIDDLEname TestLASTname",seerDataAccessRequestPage.seerDataAccessRequestedForReadOnlyTextBox.getAttribute("value"));
		Assert.assertTrue(seerDataAccessRequestPage.seerDataAccessRequestedForReadOnlyTextBox.getAttribute("aria-invalid").equals("false"));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("the {string} field displays with {string} in read-only format")
	public void the_field_displays_with_in_read_only_format(String databaseType, String seerResearchDatabase) {
		Assert.assertTrue(seerDataAccessRequestPage.seerDataAccessDatabaseTypeText.getText().contentEquals(databaseType));
		Assert.assertTrue(seerDataAccessRequestPage.seerDataAccessDatabaseTypeReadOnlyTextBox.getText().contains(seerResearchDatabase));
		Assert.assertTrue(seerDataAccessRequestPage.seerDataAccessDatabaseTypeReadOnlyTextBox.getAttribute("disabled").equals("true"));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("the user can select a general purpose for using the data")
	public void the_user_can_select_a_general_purpose_for_using_the_data() {
		Assert.assertTrue(seerDataAccessRequestPage.seerDataAccessRequestWhatIsYourGeneralPurposeUsingTheDataText.getText().contentEquals("What is your general purpose for using the data?"));
		CommonUtils.selectDropDownValue("Administrative",seerDataAccessRequestPage.seerDataAccessRequestWhatIsYourGeneralPurposeForUsingTheDataDD);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}
   
	@Then("before entering initials for {string} the Initials text box displays with the users initials in read-only mode")
	public void before_entering_initials_for_the_Initials_text_box_displays_with_the_users_initials_in_read_only_mode(
			String dataUseAgreementCertification) {
		JavascriptUtils.scrollIntoView(seerDataAccessRequestPage.seerDataAccessRequestWhatIsYourGeneralPurposeForUsingTheDataDD);
		Assert.assertTrue(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationHeaderText.getText().contentEquals(dataUseAgreementCertification));
		Assert.assertTrue(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationInitialsText.getText().contentEquals("Initials"));
		Assert.assertNotNull("Verifying that the Initials field's value is null",seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationInitials.getAttribute("value").equals("false"));
		Assert.assertTrue(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationInitials.getAttribute("disabled").equals("true"));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("the Data Use Agreement Certification text agreement displayed")
	public void the_Data_Use_Agreement_Certification_text_agreement_displayed()  {
		Assert.assertEquals("SEER Research Data Use Certification Agreement\n" + 
				"  This SEER Research Data Use Certification Agreement (the “Agreement”) outlines the terms for access to data in the National Institutes of Health (NIH) Surveillance, Epidemiology, and End Results (SEER) Research and Research Plus Databases (collectively, the “Databases”). The parties to this Agreement include the NIH and the “Authorized User” indicated in the signature block below.  The effective date of this Agreement is the date of Authorized User’s signature (“Effective Date”).\n" + 
				"  Preamble\n" + 
				"  The NIH has established NIH-designated cloud-based data repositories for securely storing and sharing data collected by the National Cancer Institute (NCI) SEER Program.  The SEER Program developed the Databases to support research and makes the Databases available through the SEER*Stat software.\n" + 
				"  Authorized User wishes to access the Databases for research. This Agreement governs Authorized User’s use and disclosure of data obtained from the Databases and data derived from that data (collectively referred to in this Agreement as “Data”).  \n" + 
				"  Agreement and Terms of Use\n" + 
				"  As a condition of access to the Databases and Data, Authorized User agrees to the following provisions:\n" + 
				"Use and Disclosure Restricted: Authorized User will not use or disclose, nor will permit others to use or disclose, the Data for purposes other than the research described in the Data Access Request (DAR) and other application material.\n" + 
				"  Compliance: Authorized User will use Data in full compliance with all applicable laws and NCI policies and guidance documents. To the extent NCI policies or guidance documents are inconsistent with the terms of this Agreement, the terms of this Agreement will supersede NCI policies or guidance.\n" + 
				"  No Data Linkage: Authorized User will not link or attempt to link the Data with information in another database, nor will permit others to do so. This includes, but is not limited to, links or attempts to link two or more SEER Databases to which Authorized User has access.\n" + 
				"  No Re-Identification of Individuals. Authorized User will not attempt to learn the identity of any individual whose Data is contained in the Databases. If Authorized User or any other person inadvertently discovers the identity of an individual whose Data is in the Databases, Authorized User will: (a) make no use of this knowledge, including informing others of the discovered identity, (b) not contact any individual, and (b) notify the NCI Surveillance Research Program (SRP) of the incident under Section 7, below.  Authorized User agrees not to generate information from Data that could allow the identities of individuals to be readily ascertained.\n" + 
				"  No Release to Others. Authorized User will not release, nor permit others to release, the Data to any other person.  All members of a research team who wish to have access to the Data must sign a SEER Research Data Use Agreement.  Authorized User will not disclose Data in any Federal, State, or local civil, criminal, administrative, legislative, or other proceeding without advance written approval of the NCI SRP.\n" + 
				"  Required Safeguards. Authorized User will use appropriate safeguards to prevent use or disclosure of the Data. Authorized User will not share his or her logon name or password with any other person.  Authorized User will not allow any other person to use Authorized User’s computer account after Authorized User has logged on with Authorized User’s logon name and password.\n" + 
				"  Notice of Unauthorized Data Use, Unauthorized Data Sharing, Identification of Individuals in Data, or Breaches of Security. Authorized User agrees to notify the NCI SRP at seercustomdata@imsweb.com of any unauthorized Data use or disclosure, identification of individuals whose Data is in the Databases, or breaches of security that may compromise the confidentiality of Data, within 24 hours of when the incident is discovered.  Within 3 business days of notification, Authorized User agrees to submit to the NCI SRP a detailed written report including the date and nature of the incident, actions taken or that will be taken to remediate the issue(s) and to prevent further problems (the “Remediation Plan”), and a timeline for actions in the Remediation Plan. Authorized User agrees to cooperate with an investigation by NIH (or another entity designated by NIH), to work with NIH to assure that the Remediation Plan is sufficient, and to provide documentation verifying that the Remediation Plan has been implemented. Repeated violations or unresponsiveness to NIH requests may result in further compliance measures affecting Authorized User.\n" + 
				"  Software. For all software provided to Authorized User by the NCI SRP (“NCI Software”), Authorized User will not copy, distribute, reverse engineer, sell, lease, or incorporate NCI Software into any other software system. \n" + 
				"  Publication: Authorized User will not present or publish Data or the results of research conducted with Data in which an individual can be identified.  Authorized User will not publish information on an individual, including information generated by the case listing session of SEER*Stat, even if such information cannot directly identify an individual.  Authorized User will follow all NCI policies, including any policy on small cell sizes.  Authorized User will send a copy of any manuscript or book chapter generated through research conducted with Data to seercustomdata@imsweb.com. \n" + 
				"  Required Acknowledgements.  Authorized User agrees to acknowledge the SEER Databases and specific version of the dataset(s) analyzed, in all oral and written presentations, disclosures, and publications resulting from any analyses of Data.  The appropriate citation is associated with the data file used, which may be found in Suggested Citations on the SEER*Stat Help menu or the Readme.txt associated with the ASCII text version of the SEER data.\n" + 
				"  NCI Use of Information about Authorized Users. Authorized User agrees that information about Authorized User and the approved research will be posted publicly on the SEER website, including Authorized User’s name, the project name, and information provided in the DAR and other application materials.  Authorized User agrees that citations of publications resulting from the use of the Databases may be posted on the SEER website.  Authorized User agrees that NIH may use information provided in the DAR and other application materials for purposes of enforcing this Agreement and administering the NCI SEER Program.\n" + 
				"  Term and Termination of Agreement.  This Agreement will continue until terminated.  NIH may from time to time request Authorized User to submit an application to continue access to the Databases.  This Agreement will automatically terminate if Authorized User fails to submit such application with the time period required. NIH also may terminate this Agreement and immediately revoke or suspend access to Data if NIH determines the Authorized User has breached this Agreement.\n" + 
				"  Disposition of Data upon Termination and Project Close-Out Form.  Upon termination of this Agreement, Authorized User agrees to destroy all Data, including copies and derivatives of Data, wherever located, including local servers and hardware, media, paper, and cloud computing storage, virtual and physical machines, databases, and random-access archives.\n" + 
				"  NO WARRANTY.  DATA IS PROVIDED ON AN AS-IS, WHERE-IS BASIS, AND ARE NOT WARRANTED TO BE ERROR-FREE OR COMPLETE.  NIH MAKES NO EXPRESS OR IMPLIED WARRANTIES AND EXPRESSLY DISCLAIMS THE IMPLIED WARRANTIES OF PERFORMANCE, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.\n" + 
				"  Liability. Each party will be responsible for its own actions. The NIH, as an agency of the United States, may be liable only to the extent provided under the Federal Tort Claims Act, 28 USC 2671 et seq.", seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationText.getText());
		MiscUtils.sleep(4000);
		CucumberLogUtils.logScreenShot();	
	}

	@Then("before entering initials for {string}, the users initials display in read only format")
	public void before_entering_initials_for_the_users_initials_display_in_read_only_format(String bestPracticeAssurance) {
		Assert.assertTrue(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceHeaderText.getText().contentEquals(bestPracticeAssurance));
		Assert.assertTrue(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceInitialsText.getText().contentEquals("Initials"));
		Assert.assertNotNull("Verifying that the Initials field's value is null",seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceInitials.getAttribute("value").equals("false"));
		Assert.assertTrue(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceInitials.getAttribute("disabled").equals("true"));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("the Best Practice Assurance text displayed")
	public void the_Best_Practice_Assurance_text_displayed()  {
		Assert.assertEquals("Introduction\n" + 
				"This document is intended to provide guidance for those requesting access to National Cancer Institute (NCI)-designated data repositories. It provides an outline of the expectations for the management and responsible conduct for the secondary use of data managed by the NCI on local storage systems or in cloud computing systems. This document is intended to ensure that NCI’s data distributed for secondary research purposes are kept secure and that only NCI approved users have access to this data.\n" + 
				"  The information contained in this document is targeted to those individuals who are:\n" + 
				"independent and not affiliated with an institution of higher learning, company, or industry and do not have institutional signing officials1\n" + 
				"  Information Related to the Use of Cloud Computing\n" + 
				"In contrast to traditional computing on local servers and hardware, cloud computing often entails the transfer and storage of NCI registry data on systems managed by a third party. Cloud computing offers a number of advantages for authorized data requestors but also requires additional security considerations.\n" + 
				"Typically, information security in cloud environments is the responsibility of the Requestor’s institution; the implementation of that security is shared between the institution and the cloud service provider. Thus, it is essential that institutions validate that they are partnering with a reputable cloud service provider. Since you are independent of an institution, you, as an Independent Requestor, are expected to understand the security policies and practices utilized and recommended by the cloud service provider of choice and may wish to obtain third party reviews or audits from the cloud service provider. The Independent Requestor should utilize these best practices, work with their cloud service provider to understand and implement the best practices associated with their specific environment and ensure that the cloud service provider can meet information security requirements. Because the use of cloud computing has the potential for being higher risk than using local infrastructure, the NIH strongly recommends that the Independent Requestor consult their Information Technology experts to ensure that an appropriate security plan is developed and that necessary technical, training and policy controls are in place before data is migrated to cloud environments. Remember – The Independent Requestor is accountable for ensuring the security of this data, not the cloud service provider\n" + 
				"\n" + 
				"Local Infrastructure Guidance\n" + 
				"General Information Security Guidelines\n" + 
				"  Ensure data files are not exposed to the Internet, except connections that are required to download data from source repositories. Infrastructure should be behind firewalls that block access from outside your computer system. For cloud infrastructure, Independent Requestors must restrict external access to instances and storage under the Requestor’s control (see section on cloud computing for more details).\n" + 
				"  Do not post data on servers in any fashion that will make it publicly accessible, such as a data requestor’s website. Even files on websites can be “discovered” by Internet search engines, e.g., Google, Bing. The Independent Requestor is prohibited from making the SEER data publicly accessible.\n" + 
				"\n" + 
				"Do not set up web or other electronic services that publicly host data, or provide access to individuals that are not listed on the Data Access Request even if those individuals have access to the same NCI registry data. Providing such access requires that an organization be an NIH Trusted Partner, with different requirements above and beyond those required for access to NCI registry data.\n" + 
				"  Implement and use authentication technology for access control. Two factor authentication technologies (smart cards, hard or soft token, etc.) are preferred. When using single factor passwords, set policies that mandate the following requirements:\n" + 
				"  Minimum length of 12 characters\n" + 
				"Does not contain usernames, real names or company names\n" + 
				"Does not contain a complete dictionary word\n" + 
				"Contains characters from each of the following groups: lowercase letters, uppercase letters, numerals, and special characters\n" + 
				"Passwords should expire every 120 days or at the rate required by institutional policies, whichever is more frequent\n" + 
				"  Avoid allowing users to place NCI registry data on mobile devices (e.g. laptops, smartphones, tablets, mp3 players) or removable media such as USB thumb drives (except where such media are used as backups and follow appropriate physical security controls). If data must be placed on mobile devices, it must be encrypted. NIH recommends the use of the National Institute of Standards and Technology (NIST) validated encryption technologies.\n" + 
				"  Keep all software patches up-to-date.\n" + 
				"\n" + 
				"\n" + 
				"Physical Security Guidelines\n" + 
				"Encrypt and store data that are in hard copy or reside on portable media, e.g., on a USB stick, CD, flash drive or laptop in a locked facility with access granted to the minimum number of individuals required to efficiently carry out research.\n" + 
				"\n" + 
				"Restrict physical access to all servers, network hardware, storage arrays, firewalls and backup media only to those that are required for efficient operations.\n" + 
				"\n" + 
				"Log access to secure facilities, ideally with electronic authentication.\n" + 
				"\n" + 
				"Controls for Servers\n" + 
				"\n" + 
				"Keep servers from being accessible directly from the Internet, (i.e. must be behind a firewall or not connected to a larger network) and disable unnecessary services. It is better to begin with a server image that disables all non-essential services and restore those that are needed than to start with a full-featured image and disable unnecessary services.\n" + 
				"\n" + 
				"Enforce principle of Least Privilege to ensure that individuals and/or processes grant only the rights and permissions necessary to perform their assigned tasks and functions, but no more.\n" + 
				"\n" + 
				"Secure NCI registry data on the systems from unauthorized users (restrict directory permissions to only the owner and group) and if exported via file sharing, ensure limited access to remote systems.\n" + 
				"\n" + 
				"Use encrypted data access (such as Secure Shell (SSH) or Virtual Private Network (VPN)) when accessing systems remotely. It is preferred to use a tool such as Remote Desktop Protocol (RDP), X-windows or Virtual Network Computing (VNC) that does not permit copying of data and provides “View only” support.\n" + 
				"\n" + 
				"Ensure that data access policies are retained throughout the processing of the data on all systems including when data is used on multiple systems (such as a compute cluster). If data is cached on local systems, directory protection must be kept, and data must be removed when processing is complete. Requestors must meet the spirit and intent of these protection requirements to ensure a secure environment 24 hours a day for the period of the agreement.\n" + 
				"  Source Data and Control of Copies of Data\n" + 
				"\n" + 
				"Approved data requestors must retain the original version of the encrypted data, track all copies or extracts and ensure that the information is not divulged to anyone except approved users. Therefore, NIH recommends ensuring careful control of all copies of data and providing appropriate logging on machines where such data is resident.\n" + 
				"\n" + 
				"Additional independent or collaborating investigators from other institutions must submit a separate Data Access Request and be approved to access the data. Approved requestors must restrict outbound access from devices that host NCI registry data.\n" + 
				"  Destruction of Data\n" + 
				"\n" + 
				"Data downloaded from NIH-designated data repositories must be destroyed upon the time of project close-out or project termination.\n" + 
				"  Delete all data for the project from storage, virtual and physical machines, databases, and random-access archives (i.e., archival technology that allows for deletion of specified records within the context of media containing multiple records).\n" + 
				"\n" + 
				"Retain only encrypted copies of the minimum data necessary for publication(s). Ideally, the data will exist on backup media that is not used for other projects and can therefore be destroyed or erased without impacting other users/tenants. If retaining the data on separate backup media is not possible, as will be the case with many users, the media may be retained for the standard media retention period of three years. However, the data may not be recovered for any purpose without a new Data Access Request approved by NCI SEER program staff. Retained data should be deleted at the end of the SEER approved access period.\n" + 
				"\n" + 
				"Delete electronic files securely. For personal computers, the minimum would involve deleting files and emptying the recycle bin or equivalent with equivalent procedures for servers. Optimally, use a secure method that performs a delete and overwrite of the physical media that was used to store the files.\n" + 
				"\n" + 
				"Ensure that backups are reused (data deleted) and any archive copies are also destroyed.\n" + 
				"\n" + 
				"Destroy media according to NIST Guidelines for Information Media Sanitization.\n" + 
				"  Additional Guidance for Cloud Computing\n" + 
				"Independent Requestors wishing to use cloud computing must work with their cloud service provider to devise an appropriate security plan that meets the general Information Security Best Practices outlined in this document as well as additional requirements that derive from the nature of multi-tenant clouds with default access to the internet. Please refer to the specific cloud service provider for methods, processes and procedures for working with NCI registry databases.\n" + 
				"  General Cloud Computing Guidelines\n" + 
				"\n" + 
				"Use end-to-end encryption for network traffic whenever possible. For example, use Hypertext Transfer Protocol (HTTPS) sessions between you and your virtual server instance. Ensure that your service uses only valid and up-to-date certificates.\n" + 
				"\n" + 
				"Encrypt data at rest with a user's own keys. For example, sensitive data should be encrypted into ciphertext while it is stored in a database and decrypt it to plaintext when it is accessed by an authorized user, and vice versa. The Sequence Read Archive (SRA)-toolkit includes this feature; other software providers offer tools to meet this requirement.\n" + 
				"\n" + 
				"Use security groups and firewalls to control inbound traffic access to your instance. Ensure that your security profile is configured to allow access only to the minimum set of ports required to provide necessary functionality for your services and limit access to specific networks or hosts. In addition, allow administrative access only to the minimum set of ports and source IP address ranges necessary.\n" + 
				"\n" + 
				"Be aware of the top 10 vulnerabilities for web applications and build your applications accordingly. To learn more, visit Open Web Application Security Project (OWASP) - Top 10 Web Application Security Risks. When new internet vulnerabilities are discovered, promptly update any web applications included in your Virtual Machine (VM) images. Examples of resources that include this information are Security Focus and the NIST National Vulnerability Database.\n" + 
				"\n" + 
				"Review the Access Control Lists (ACLs), permissions, and security perimeter to ensure consistent definition.\n" + 
				"\n" + 
				"\n" + 
				"Audit and Accountability \n" + 
				"Ensure that data is accessible only to those approved for access, and control for changing that access is retained by the Requestor who submitted the request for access to NCI registry data and the appropriate IT staff. A mechanism for monitoring and notification needs to be in place to monitor changes in permission changes.\n" + 
				"\n" + 
				"Ensure that account access is logged along with access controls and file access. This information must be reviewed by the data requestor on a regular basis to ensure continued secure access.\n" + 
				"  Image Specific Security\n" + 
				"Ensure images do not contain any known vulnerabilities, malware, or viruses. A number of tools are available for scanning the software, such as Chkrootkit, rkhunter, OpenVAS and Nessus.\n" + 
				"\n" + 
				"Ensure that Linux-based Images lock/disable root login and allow only sudo access. Additionally, root password must not be null or blank.\n" + 
				"\n" + 
				"Ensure that images allow end-users with OS-level administration capabilities to allow for compliance requirements, vulnerability updates, and log file access. For Linux-based Images, this is normally through secure shell (SSH), and for Windows-based virtual machine images, this is normally through remote desktop protocol (RDP).\n" + 
				"  Best Practices for Specific Cloud Service Providers\n" + 
				"Examples of cloud service provider best practices are provided in the links below, links to the best practices of additional cloud service providers will be periodically appended to this document when they become available. Please be aware that these are provided for convenience only, and do not imply endorsement by the NIH or the United States Government for any of these services, nor does the government guarantee that these links lead to the most current version of these best practices. NIH recommends that Requestors consult with their cloud service provider to ensure that they are using the most up to date best practice documents.\n" + 
				"  Amazon Web Services:\n" + 
				"  Amazon Machine Images\n" + 
				"\n" + 
				"Amazon’s Best Practices for Elastic Cloud Compute (EC2)\n" + 
				"\n" + 
				"Information on Elastic Cloud Compute (EC2)\n" + 
				"\n" + 
				"\n" + 
				"Additional Resources for Testing and Best Practices\n" + 
				"Examples of cloud best practices from organizations that leverage the cloud are provided in the links below.\n" + 
				"Center for Internet Security (CIS)\n" + 
				"CIS is the only distributor of consensus best practice standards for security configuration. The benchmarks are widely accepted by U.S. government agencies for Federal Security Information Act (FISMA) compliance, and by auditors for compliance with:\n" + 
				"the International Organization for Standardization (ISO)\n" + 
				"the Gramm-Leach-Bliley (GLB) Act\n" + 
				"Sarbanes-Oxley (SOX) Act\n" + 
				"federal Health Insurance Portability and Accountability Act (HIPAA)\n" + 
				"Family Educational Rights and Privacy Act (FERPA)\n" + 
				"and other regulatory requirements for information security\n" + 
				"  End user organizations that build their configuration policies based on the consensus benchmarks cannot acquire them elsewhere.\n" + 
				"  National Institute of Standards and Technology (NIST)\n" + 
				"NIST, an agency of the US Department of Commerce, provides information security standards and best practices for the federal government. The NIST Special Publications (SP) and Federal Information Processing Standards (FIPS) provide useful and concrete guidance to users of information technology systems (http://csrc.nist.gov/publications/).\n" + 
				"  United States Government Configuration Baseline (USGCB)\n" + 
				"USGCB (http://usgcb.nist.gov) provides security configuration baselines for information technology products widely used across the federal government including desktop computers.\n" + 
				" ", seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceText.getText());
		MiscUtils.sleep(4000);
		CucumberLogUtils.logScreenShot();
	}

   
	@Then("when the user scrolls down each agreement")
	public void when_the_user_scrolls_down_each_agreement() {
		JavascriptUtils.scrollUpWithinElement(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationText, 8000);
		MiscUtils.sleep(2000);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollUpWithinElement(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceText, 8000);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();		
	}

	@Then("the user is able to enter intials")
	public void the_user_is_able_to_enter_intials() {
		seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationInitials.sendKeys("TT");
		JavascriptUtils.drawBlueBorder(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationInitials);
		MiscUtils.sleep(2000);
		seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceInitials.sendKeys("TT");
		JavascriptUtils.drawBlueBorder(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceInitials);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("SEER information is displayed on the bottom of the page as follows:")
	public void seer_information_is_displayed_on_the_bottom_of_the_page_as_follows(String expectedText) {
		Assert.assertTrue(seerDataAccessRequestPage.seerDataAccessSEERIsSupportedByTheBottomText.getText().contentEquals(expectedText));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("after entering required information, the user is able to successfully submit the SEER Data Access Request form")
	public void after_entering_required_information_the_user_is_able_to_successfully_submit_the_SEER_Data_Access_Request_form() {
		seerDataAccessRequestPage.seerDataAccessSubmitButton.click();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		String seerRegistrationIsCompletePage = WebDriverUtils.getWebDriver().getTitle();
		Assert.assertEquals("SEER Data Request Confirmation - ODS SEER Data Access Request", seerRegistrationIsCompletePage);
		Assert.assertEquals("Thank you - your data access request is complete.",seerDataAccessRequestPage.seerDataAccessYourDataAccessRequestIsCompleteHeader.getText());
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot(); 	
	}

	@Then("the {string} bread crumb displays")
	public void the_bread_crumb_displays(String seerIncidenceDatabaseLink) {
		Assert.assertEquals(seerIncidenceDatabaseLink, seerLandingPage.seerIncidenceDatabaseBreadcrumb.getText());
	}

	@Then("when clicking, user is directed to {string}")
	public void when_clicking_user_is_directed_to(String seerIncidenceDatabaseUrl) {
		CommonUtils.click(seerLandingPage.seerIncidenceDatabaseBreadcrumb);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		String actualSeerCancerGovDataUrl = WebDriverUtils.getWebDriver().getCurrentUrl();
		Assert.assertEquals(seerIncidenceDatabaseUrl, actualSeerCancerGovDataUrl);
		MiscUtils.sleep(2000);
		WebDriverUtils.getWebDriver().navigate().back();
	}
	
	@When("the user enters an email address for a Non-Institutional Account")
	public void the_user_enters_an_email_address_for_a_Non_Institutional_Account() {
	   CommonUtils.sendKeys(seerLandingPage.nonInstitutionalAccountsEmailAddressField, CommonUtils.email);
	   CommonUtils.click(seerLandingPage.nonInstitutionalAccountsContinuetoEmailVerificationButton);
	   CucumberLogUtils.logScreenShot();
	}


	@When("the user is on the {string} page")
	public void the_user_is_on_the_page(String seerUserRegistrationHeader) {
		Assert.assertEquals(seerUserRegistrationHeader,
				seerUserRegistrationPage.seerUserRegistrationHeaderText.getText());
	}

	@Then("user is directed to the {string} page")
	public void user_is_directed_to_the_page(String seerRegistrationIsCompleteText) {
		Assert.assertEquals(seerRegistrationIsCompleteText,
				seerUserRegistrationPage.seerUserRegistrationIsCompleteHeader.getText());
	}

	@When("user confirms their email address by clicking on the email verifation link sent to the users email address")
	public void user_confirms_their_email_address_by_clicking_on_the_email_verifation_link_sent_to_the_users_email_address()
			throws TestingException {
		nativeViewLoginImpl.nativeViewLogin();
		CommonUtils.waitForVisibility(nativeViewEnrollementsPage.filterNavigator);
		nativeViewEnrollementsPage.filterNavigator.sendKeys("Mailbox");
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(40000);
		CommonUtils.click(nativeViewSentViewPage.nativeViewmailboxSentLink);
		CucumberLogUtils.logScreenShot();
		CommonUtils.switchToFrame(nativeViewSentViewPage.nativeViewFrame);
		MiscUtils.sleep(2000);
		CommonUtils.selectDropDownValue("Recipients", nativeViewSentViewPage.nativeViewSearchDropDown);
		MiscUtils.sleep(2000);
		CommonUtils.sendKeys(nativeViewSentViewPage.nativeViewSentSearchField, SEERUserRegistrationPageSteps.newEmail);
		MiscUtils.sleep(1000);
		CommonUtils.sendKeys(nativeViewSentViewPage.nativeViewSentSearchField, Keys.ENTER);
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.click(nativeViewSentViewPage.sortingCreatedDataInOrderLink);
		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(nativeViewSentViewPage.nativeViewPreviewVerifyEmailIcon);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.click(nativeViewSentViewPage.NativeViewPreviewVerifyEmailOpenRecordButton);
		JavascriptUtils.scrollIntoView(nativeViewSentViewPage.nativeViewPreviewVerifyEmailPreviewHTMLBodyLink);
		MiscUtils.sleep(2000);
		CommonUtils.click(nativeViewSentViewPage.nativeViewPreviewVerifyEmailPreviewHTMLBodyLink);
		CucumberLogUtils.logScreenShot();
		CommonUtils.switchToFrame(nativeViewSentViewPage.nativeViewPreviewEmailIFRAME);
		MiscUtils.sleep(2000);
		Assert.assertTrue(nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataHeader.getText()
				.contentEquals("SEER Incidence Data: Verify your email address"));
		Assert.assertTrue(nativeViewSentViewPage.nativeViewPreviewEmailHelloNameText.getText().contains("FirstName"));
		MiscUtils.sleep(2000);
		String mainPageHandle = WebDriverUtils.getWebDriver().getWindowHandle();
		CommonUtils.click(nativeViewSentViewPage.nativeViewPreviewEmailVerifyEMAILlink);
		MiscUtils.sleep(2000);
		Set<String> allWindows = WebDriverUtils.getWebDriver().getWindowHandles();
		Iterator<String> it = allWindows.iterator();
		while (it.hasNext()) {
			String childHandle = it.next();
			if (!childHandle.equals(mainPageHandle)) {
				WebDriverUtils.getWebDriver().switchTo().window(childHandle);
			}
		}
	}

	@Then("the user is directed to {string} page")
	public void the_user_is_directed_to_page(String seerDataAccessRequestPageText) {
		MiscUtils.sleep(2000);
		Assert.assertEquals(seerDataAccessRequestPageText,
				seerDataAccessRequestPage.seerDataAccessRequestHeader.getText());
	}

	@Then("the user has to select a general purpose for using the data")
	public void the_user_has_to_select_a_general_purpose_for_using_the_data() {
		Assert.assertTrue(seerDataAccessRequestPage.seerDataAccessRequestedForReadOnlyTextBox.getAttribute("disabled")
				.equals("true"));
		MiscUtils.sleep(2000);
		Assert.assertTrue(seerDataAccessRequestPage.seerDataAccessDatabaseTypeReadOnlyTextBox.getAttribute("disabled")
				.equals("true"));
		CommonUtils.selectDropDownValue("Administrative",
				seerDataAccessRequestPage.seerDataAccessRequestWhatIsYourGeneralPurposeForUsingTheDataDD);
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(2000);
	}

	@Then("also has to agree by typing initials to the Data Use Agreement Certification and Best Practice Assurance")
	public void also_has_to_agree_by_typing_initials_to_the_Data_Use_Agreement_Certification_and_Best_Practice_Assurance() {
		JavascriptUtils.scrollUpWithinElement(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationText, 8000);
		CommonUtils.sendKeys(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationInitials, "FL");
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollUpWithinElement(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceText, 8000);
		CommonUtils.sendKeys(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceInitials, "FL");
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("successfully submitting the SEER Data Request form")
	public void successfully_submitting_the_SEER_Data_Request_form() {
		CommonUtils.click(seerDataAccessRequestPage.seerDataAccessSubmitButton);
	}

	@Then("the page {string} displays")
	public void the_page_displays(String yourDataAccessRequestIsCompleteHeader) {
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		Assert.assertEquals(yourDataAccessRequestIsCompleteHeader,
				seerDataAccessRequestPage.seerDataAccessYourDataAccessRequestIsCompleteHeader.getText());
	}

}

