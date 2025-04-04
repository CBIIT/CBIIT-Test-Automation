Feature: SEER Data Access Landing Page Scenarios

@ODS-319 @ODS-329 @bucurgb @Regression @Smoke @selenium
  Scenario: Test Update public submission page text for user who already has access
    Given a user is on the SEER Data Access landing page
    When the user attempts to request research data with existing email address "Diegotest@email.com"
    Then user sees the following header "You Already Have Access to SEER Research Data"  and message pop-up with links:
      """
      Thank you for your request. Our records show that you already have access to the current SEER Research Data with this email address.
      
      If you are interested in the SEER Research Plus data, which include additional variables, please read the requirements on How to Request Access to SEER Data. The Research Plus databases require user authentication through eRA Commons or an HHS PIV card.
      """
    And "← Back to SEER Database details" button is also displayed

@ODS-508 @ODS-318 @ODS-338 @ODS-321 @ODS-331 @ODS-322 @ODS-332 @ODS-323 @ODS-333 @ODS-324 @ODS-335 @ODS-325 @ODS-334 @bucurgb @Regression @Smoke @selenium
  Scenario: Test Data access request landing page updates
    Given a user is on the SEER Data Access landing page
    Then the SEER Data Access landing page has the following text displayed
      """
There are two data products available: SEER Research and SEER Research Plus (which includes access to NCCR data). Access to the Research Plus databases requires user authentication.  Refer to Comparison of Data Products for current information.

About SEER Research Plus and NCCR Data Access
To request access to the Research Plus and NCCR Data, you must log in with an eRA Commons account that is associated with an institutional email address (.edu, .gov, .org, or work email address) for user authentication.
Requesters associated with HHS agencies should log in with their PIV cards to request the data.
Information on how to obtain an eRA Commons login can be found in the FAQ on the SEER webpage.
Users who are approved for access to the SEER Research Plus and NCCR Data will be eligible to request specialized databases.

About Research Data Access
If you cannot obtain an eRA Commons account or do not need access to the additional variables available in the Research Plus and NCCR Data, you can register for the Research Data.
Users with access only to the Research Data are not eligible to request specialized databases and cannot upgrade to Research Plus without an eRA Commons account or an HHS PIV card.
      """