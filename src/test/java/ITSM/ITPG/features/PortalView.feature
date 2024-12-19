@ITPG
Feature: ITO feature files


  @ITPGRejctRequest @SanDiego @SNOWPROGOV-212
  Scenario: Validate ITO test case for reject case
    Given User opens IT Procurement Governance application in browser
    When User logins to the application
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Start a new business case
    Then Fill business case details
    Then Fill Alternatives and Analysis details
    Then Fill Financial Considerations details
		Then Click on save and continue
		Then Go to native view
		Then Verify Email notification with subject as "submitted for Review"
		Then Impersonate User as "David Coates"
		Given User opens IT Procurement Governance application in browser
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Filter all casses	
    Then Open latest business Case
		Then User rejects Request
		Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Filter all casses	
    Then Open latest business Case
		Then State is updated to "Pending Program Review"
		Then Go to native view
		Then Verify Email notification with subject as "Not Approved"

		
	@ITPGNeedMoreInfoCase @SanDiego @SNOWPROGOV-213
   Scenario: Validate ITO test case for need more info case
    Given User opens IT Procurement Governance application in browser
    When User logins to the application
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Start a new business case
    Then Fill business case details
    Then Fill Alternatives and Analysis details
    Then Fill Financial Considerations details
		Then Click on save and continue
		Then Go to native view
		Then Verify Email notification with subject as "submitted for Review"
		Then Impersonate User as "David Coates"
		Given User opens IT Procurement Governance application in browser
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Filter all casses	
    Then Open latest business Case
		Then Click On need more info
		Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Filter all casses	
    Then Open latest business Case
		Then State is updated to "Open"
		Then Go to native view
		Then Verify Email notification with subject as "Submitted for Review"
		 
		@ITPGEnterCommentsAndVerifyActivity @SanDiego
		Scenario: Validate notes section on business approval page
		Given User opens IT Procurement Governance application in browser
    When User logins to the application
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Start a new business case
    Then Fill business case details
    Then Fill Alternatives and Analysis details
    Then Fill Financial Considerations details
		Then Click on save and continue
		Then Add comment
		Then User expands activity section and verify comment
		Then Go to native view
		Then Verify Email notification with subject as "Submitted for Review"
				 
		@ITPGApprove @satyaITPGApprove 
    Scenario: Validate ITO approve test case
    Given User opens IT Procurement Governance application in browser
    When User logins to the application
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
		Then Start a new business case
    Then Fill business case details
    Then Fill Alternatives and Analysis details
    Then Fill Financial Considerations details
		Then Click on save and continue
		Then Go to native view
		Then Verify Email notification with subject as "submitted for Review"
		Then Impersonate User as "David Coates"
		Given User opens IT Procurement Governance application in browser
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Filter all casses	
    Then Open latest business Case
    Then Approve the business case
		Then Verify Email notification with subject as "Approved by the Program"
		Then Go to native view
		Then Verify Email notification with subject as "submitted for Review"
		Then Impersonate User as "Sitarah Kassam"
		Given User opens IT Procurement Governance application in browser
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Filter all casses	
    Then Open latest business Case
    Then Approve the business case
  	Then Go to native view
		Then Impersonate User as "Jeff Shilling"
		Given User opens IT Procurement Governance application in browser
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Filter all casses	
    Then Open latest business Case
    Then Approve the business case
		Given User opens IT Procurement Governance application in browser
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Filter all casses	
    Then Open latest business Case
    Then State is updated to "Closed"
   	Then Go to native view
		Then Verify Email notification with subject as "Approved by the CIO"   
    
		 
		@ITPGBusinessCaseRejectAtSecondLevel @SanDiego
    Scenario: Validate ITO Reject test case
    Given User opens IT Procurement Governance application in browser
    When User logins to the application
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
		Then Start a new business case
    Then Fill business case details
    Then Fill Alternatives and Analysis details
    Then Fill Financial Considerations details
		Then Click on save and continue
		Then Go to native view
		Then Verify Email notification with subject as "submitted for Review"
		Then Impersonate User as "David Coates"
		Given User opens IT Procurement Governance application in browser
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Filter all casses	
    Then Open latest business Case
    Then Approve the business case
		Then Verify Email notification with subject as "Approved by the Program"
		Then Go to native view
		Then Verify Email notification with subject as "submitted for Review"
		Then Impersonate User as "Dianna Kelly"
		Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
		Then Filter all casses	
		Then Open latest Business Case
		Then User rejects Request
		Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Filter all casses	
    Then Open latest business Case
		Then State is updated to "Cancelled"
		
		@ITPGBusinessCaseNeedMoreInfoStatusSecondLevel @SanDiego
    Scenario: Validate ITO need more information test case
    Given User opens IT Procurement Governance application in browser
    When User logins to the application
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
		Then Start a new business case
    Then Fill business case details
    Then Fill Alternatives and Analysis details
    Then Fill Financial Considerations details
		Then Click on save and continue
		Then Go to native view
		Then Verify Email notification with subject as "submitted for Review"
		Then Impersonate User as "David Coates"
		Given User opens IT Procurement Governance application in browser
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Filter all casses	
    Then Open latest business Case
    Then Approve the business case
		Then Verify Email notification with subject as "Approved by the Program"
		Then Go to native view
		Then Verify Email notification with subject as "submitted for Review"
		Then Impersonate User as "Dianna Kelly"
		Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
		Then Filter all casses	
		Then Open latest Business Case
		Then Click On need more info
		Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Filter all casses	
    Then Open latest business Case
		Then State is updated to "Open"
		
		@ITPGITONeedMoreInfoAtThirdLevel
    Scenario: Validate ITO need more information test case
    Given User opens IT Procurement Governance application in browser
    When User logins to the application
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
		Then Start a new business case
    Then Fill business case details
    Then Fill Alternatives and Analysis details
    Then Fill Financial Considerations details
		Then Click on save and continue
		Then Go to native view
		Then Verify Email notification with subject as "submitted for Review"
		Then Impersonate User as "David Coates"
		Given User opens IT Procurement Governance application in browser
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Filter all casses	
    Then Open latest business Case
    Then Approve the business case
		Then Verify Email notification with subject as "Approved by the Program"
		Then Go to native view
		Then Verify Email notification with subject as "submitted for Review"
		Then Impersonate User as "Dianna Kelly"
		Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
		Then Filter all casses	
		Then Open latest Business Case
		Then Approve the business case
		Then Go to native view
		Then Verify Email notification with subject as "submitted for Review"
		Then Impersonate User as "Jeff Shilling"
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Filter all casses	
		Then Open latest Business Case
		Then Click On need more info
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Filter all casses
    Then Open latest Business Case
		Then State is updated to "Open"		

		@ITPGOANeedMoreInfoOALevel
    Scenario: Validate OA need more information test case
    Given User opens IT Procurement Governance application in browser
    When User logins to the application
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
		Then Start a new business case
    Then Fill business case details
    Then Fill Alternatives and Analysis details
    Then Fill Financial Considerations details
		Then Click on save and continue
		Then Go to native view
		Then Verify Email notification with subject as "submitted for Review"
		Then Impersonate User as "David Coates"
		Given User opens IT Procurement Governance application in browser
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Filter all casses	
    Then Open latest business Case
    Then Approve the business case
		Then Verify Email notification with subject as "Approved by the Program"
		Then Go to native view
		Then Verify Email notification with subject as "submitted for Review"
		Then Impersonate User as "Dianna Kelly"
		Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
		Then Filter all casses	
		Then Open latest Business Case
		Then Approve the business case
		Then Go to native view
		Then Verify Email notification with subject as "submitted for Review"
		Then Impersonate User as "Jeff Shilling"
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Filter all casses	
		Then Open latest Business Case
		Then Approve the business case
		Then Go to native view
		Then Verify Email notification with subject as "submitted for Review"
		Then Impersonate User as "Kelly Henderson"
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
   	Then Filter all casses	
		Then Open latest Business Case
		Then Click On need more info
    Then State is updated to "Open"		
		
    @ITPGCIONeedMoreInformation @SNOWPROGOV-224
    Scenario: Validate ITO approve test case
    Given User opens IT Procurement Governance application in browser
    When User logins to the application
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Start a new idea case
    Then Fill Idea case details
		Then Click on save and continue
		Then Click on Approve request ITPG
		Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
		Then Open latest Business Case
		Then Update details on business form and submit
		Then Go to native view
		Then Click on Elevate permision
		Given User opens IT Procurement Governance application in browser
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Open latest Business Case
    Then Open Request approval form and approve
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Open latest Business Case
    Then Open Request approval form and approve
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Open latest Business Case
    Then Open Request approval form and approve
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Open latest Business Case
		Then Open Request approval form and ask for more info
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Open latest Business Case
    Then State is updated to "Open"
    
    @ITPGCIOReject @SNOWPROGOV-217 
    Scenario: Validate CIO reject test case
    Given User opens IT Procurement Governance application in browser
    When User logins to the application
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Start a new idea case
    Then Fill Idea case details
		Then Click on save and continue
		Then Click on Approve request
		Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
		Then Open latest Business Case
		Then Update details on business form and submit
		Then Go to native view
		Then Click on Elevate permision
		Given User opens IT Procurement Governance application in browser
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Open latest Business Case
    Then Open Request approval form and approve
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Open latest Business Case
    Then Open Request approval form and approve
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Open latest Business Case
    Then Open Request approval form and approve
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Open latest Business Case
		Then Open Request approval form and reject
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Open latest Business Case
    Then State is updated to "Cancelled"
    
    
    @SNOWPROGOV-198
    Scenario: Update "Approval Date Requested" Block out period from 14BDs to 9 BDs
    Given User opens IT Procurement Governance application in browser
    When User logins to the application
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Start a new business case
    Then enter today plus 8days date in approval date requested field
    Then validate the error message for approval date requested field
    Then enter today plus 9 days in approval date requested field
    Then validate no error message is displayed for approval date requested field
    
    @SNOWPROGOV-204
    Scenario: validate the header text on CIO Review for IT and Biomedical IT Acquisitions page
    Given User opens IT Procurement Governance application in browser
    When User logins to the application
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then validate the text on the page
    
    @SNOWPROGOV-223
    Scenario: Hide Assistance Request from Homepage
    Given User opens IT Procurement Governance application in browser
    When User logins to the application
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then validate that the hide assistance request button is not available on screen
    
    @SNOWPROGOV-162
    Scenario: Verify user has read only access only
    Given User opens IT Procurement Governance application in browser
    When User logins to the application
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Start a new business case
    Then Fill business case details
    Then Fill Alternatives and Analysis details
    Then Fill Financial Considerations details
		Then Click on save and continue
		Then Go to native view
		Then Verify Email notification with subject as "submitted for Review"
		Then Impersonate User as "Scott Keasey"
		Given User opens IT Procurement Governance application in browser
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Filter all casses	
    Then Open latest business Case
    Then verify that user has read only access only
    
    
    @SNOWPROGOV-166
    Scenario: Incorporate the approval process in the Global Actions widget.  
    Given User opens IT Procurement Governance application in browser
    When User logins to the application
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Start a new business case
    Then Fill business case details
    Then Fill Alternatives and Analysis details
    Then Fill Financial Considerations details
		Then Click on save and continue
		Then Go to native view
		Then Verify Email notification with subject as "submitted for Review"
		Then Impersonate User as "David Coates"
		Given User opens IT Procurement Governance application in browser
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
		And I click on the My actions tab and click on latest request
		Then I will be able to approve or reject
    
    
    @SNOWPROGOV-208
    Scenario: Create Actions for approval on Business Case
    Given User opens IT Procurement Governance application in browser
    When User logins to the application
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Start a new business case
    Then Fill business case details
    Then Fill Alternatives and Analysis details
    Then Fill Financial Considerations details
		Then Click on save and continue
		Then Go to native view
		Then Verify Email notification with subject as "submitted for Review"
		Then Impersonate User as "David Coates"
		Given User opens IT Procurement Governance application in browser
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then click on view all approvals and then on take action
    Then Approve the business case
    
    @SNOWPROGOV-205
    Scenario: Investigate Save & Close Action not closing record
    Given User opens IT Procurement Governance application in browser
    When User logins to the application
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Start a new business case
    Then Fill business case details
    Then Fill Alternatives and Analysis details
    Then Fill Financial Considerations details
    Then click on save and close
    Then verify that the ticket menu was closed
    
    @SNOWPROGOV-214
    Scenario: Update short description to include Project Name on Action Widget
    Given User opens IT Procurement Governance application in browser
    When User logins to the application
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Go to native view
		Then Impersonate User as "David Coates"
		Then click on action menu option
		Then along with the ticket number for the business case the project name
		
		@SNOWPROGOV-218
		Scenario: Add Content to Homepage (Application for investments >$250k)
		Given User opens IT Procurement Governance application in browser
    When User logins to the application
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then validate the test as requested
    
    @SNOWPROGOV-220
    Scenario: Make "Request Assistance" action show-up when 1st opening a Business Case.
    Given User opens IT Procurement Governance application in browser
    When User logins to the application
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Start a new business case
    Then verify Request Assistance button is present on the screen
    
    @SNOWPROGOV-221
    Scenario: Duplicate Business Case 	
     Given User opens IT Procurement Governance application in browser
    When User logins to the application
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Start a new business case
    Then verify that clone business case button is available and functional	
    
    @SNOWPROGOV-219
    Scenario: Enhance "More Information Needed" action
    Given User opens IT Procurement Governance application in browser
    When User logins to the application
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Start a new business case
    Then Fill business case details
    Then Fill Alternatives and Analysis details
    Then Fill Financial Considerations details
		Then Click on save and continue
		Then Go to native view
		Then Verify Email notification with subject as "submitted for Review"
		Then Impersonate User as "David Coates"
		Given User opens IT Procurement Governance application in browser
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Filter all casses	
    Then Open latest business Case
		Then Click On need more info
		Then validate the opened popup
		
		@SNOWPROGOV-231 @SNOWPROGOV-232
    Scenario: verify "Request Assistance" button and its usecases.
    Given User opens IT Procurement Governance application in browser
    When User logins to the application
    Then Click on "CIO Review for IT and Biomedical IT Acquisitions"
    Then Start a new business case
    Then verify Request Assistance button is present on the screen
    Then click on Request Assistance button and verify the state of the business case as Request Assistance
    Then verify that Assistance Provided button is available and moves the business case back in open state 
    