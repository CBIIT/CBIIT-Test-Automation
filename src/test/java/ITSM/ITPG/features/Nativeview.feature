@ITAONative
Feature: ITO feature files
	
		@ITAONativeApprove
    Scenario: Validate ITO approve test case from Native View
    Given User opens IT Procurement Governance Application in browser
    When User logs in to the application
    Then Go to Native view
  #  Then Click on Elevate Permision
    Then Go to All Ideas
    Then start a new idea case
    Then Enter Idea case details
		Then Click on Save and Continue
		Then Open Latest Idea Case
		Then Click on approve request
		Then Open Latest Idea Case
		Then Go to All Business Case
		Then Open Latest Business Case
		Then Update details on Business form and submit
    Then Open Latest Business Case
    Then Open Request Approval form and approve
 		Then Open Request Approval form and approve
  	Then Open Request Approval form and approve
  	Then Open Request Approval form and approve
  