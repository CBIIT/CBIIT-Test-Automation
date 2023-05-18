# Author: @SonikaJain
Feature: FHQ Landing Page on the RASopathies Longitudinal Cohort Study Portal for the Initial visit of the Participant to fill all the relatives Record Producers
  
  Description: This feature file contains the FHQ Regression scenarios to submit all the New FHQ record producers for all relations to the Participant. It includes Participant, Partner, Parent, Child, Sibling, Aunt Uncle, Niece Nephew, Grandchild, Cousin.

  @jains @FHQRegression
  Scenario: FHQ Regression Record (Participant RP)
    Given a proxy is on the RASopathies Longitudinal Cohort Study login page
    And logs in Rasopathy page via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
    When the user navigates to CHARMS FHQ Survey page and opens FHQ Landing Page Qualtrics
    Then Verify the New Details of participant immediate family banner is visible on the page
    And selects option To confirm your identity, please indicate your relationship to the participant drop-down
    And Sex assigned at birth, Gender Identity information of the participant are filled
    And Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies details of the participant are filled
    And Participant Total children details are filled
    And Participant Child MRVS details are filled
    And Participant Child MRVS table are verified
    And Participant Partner details are filled
    And Participant Partner MRVS details are filled
    And Participant Partner MRVS table are verified
    And Participant Siblings details are filled
    And Participant Sibling MRVS details are filled
    And Participant Sibling MRVS table are verified
    And Participant additional Informations are filled
    And finally the Complete-Submit Button is clicked to submit the Participant Personal record producer
    And Generate Scenario Report for the Initial visit of the Participant on the FHQ Survey landing page
    And verifies FHQ Family Cohort Study Management Page
    And user clicks the Partner Grid link on FHQ Grid page to land on the FHQ Partners list view page
    And verifies the Partner List View details
    When clicks the New button on the FHQ Partners list view page it lands on the New FHQ Partner record producer page
    And fills the First Name, First Initial of LAST name information of the Partner related to the Patient
    And fills the Year of Birth, Current Age of the Partner related to the Patient
    And fills the Vital Status,Year of Death, Age of Death information of the Partner related to the Patient
    And fills the Sex assigned at birth, Gender Identity information of the partner related to the Patient
    And fills if the participant is blood-related to this person details
    And finally click the Complete and Submit Button to submit the New FHQ Partner of the Patient Record Producer
    And Partner list view page is updated and verified
    And Generate Scenario Report for the details of the Patient Partner in the FHQ Survey
    And click the new Partner added and verify the completed record producer data
    And click the FHQ Home button
    And verifies FHQ Family Cohort Study Management Page
    And user clicks the Parents Grid link on FHQ Grid page to land on the FHQ Parents list view page
    And verifies the Parents List View details
    When clicks the New button on the FHQ Parents list view page it lands on the New FHQ Parent record producer page
    And fills the First Name, First Initial of LAST name, Year of Birth, Vital Status,Year of Death, Age of Death information of the Parent related to the Patient
    And fills the Sex assigned at birth, Gender Identity information for the Parent
    And fills the Type of birth Information for the Parent
    And fills Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies details of this person
    And fills the Patient Parent Resopathy details
    And Parent Rasopathy MRVS details are filled
    And Parent Rasopathy MRVS table are verified
    And fills the Patient Parent Cancer details
    And Parent Cancer MRVS details are filled
    And Parent Cancer MRVS table are verified
    And fills the Patient Parent Medical Conditions details
    And Parent Medical Conditions MRVS details are filled
    And Parent Medical Conditions MRVS table are verified
    And fills the Patient Parent siblings details
    And Parent Sibling MRVS details are filled
    And Parent Sibling MRVS table are verified
    And finally click the Complete-Submit Button to submit the patient Parent record producer
    And Parents list view page is updated and verified
    And Generate Scenario Report for the details of the Patient Parent in the FHQ Survey
    And click the new parent added and verify the completed record producer data
    And click the FHQ Home button
    And verifies FHQ Family Cohort Study Management Page
    And user clicks the Children Grid link on FHQ Grid page to land on the FHQ Childs list view page
    And verifies the Child List View details
    When clicks the New button on the FHQ Childs list view page it lands on the FHQ new child record producer page
    And fills the First Name, First Initial of LAST name, Year of Birth, Vital Status,Year of Death, Age of Death information for the Child
    And fills the Sex assigned at birth, Gender Identity information
    And fills the Which best describes this relative? information
    And fills the other biological parent of this relative
    And fills the Type of birth, Which best describes this child? information
    And fills Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies details of this child
    And fills the Patient Child Resopathy details
    And Rasopathy MRVS details are filled
    And Child Rasopathy MRVS table are verified
    And fills the Patient Child Cancer details
    And Cancer MRVS details are filled
    And Child Cancer MRVS table are verified
    And fills the Patient Child Medical Conditions details
    And Medical Conditions MRVS details are filled
    And Child Medical Conditions MRVS table are verified
    And Child Total children details are filled
    And Child MRVS details are filled
    And Child children MRVS table are verified
    And fills the additional Information about the child
    And Generate Scenario Report for the details of the patient Child in the FHQ Survey
    And finally click the Complete-Submit Button to submit the patient child record producer
    And Child list view page is updated and verified
    And click the new Child added and verify the completed record producer data
    And click the FHQ Home button
    And verifies FHQ Family Cohort Study Management Page
    And user clicks the Siblings Grid link on FHQ Grid page to land on the FHQ Siblings list view page
    And verifies the Sibling List View details
    When clicks the New button on the FHQ Siblings list view page it lands on the New FHQ Sibling record producer page
    And fills the First Name, First Initial of LAST name, Year of Birth, Vital Status,Year of Death, Age of Death information of the Sibling related to the Patient
    And fills the Sex assigned at birth, Gender Identity information of the sibling related to the Patient
    And fills the Type of birth Information for the Sibling
    And fills Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies details of this sibling
    And fills the patient sibling Resopathy details
    And Rasopathy MRVS details are filled for the sibling
    And Sibling Rasopathy MRVS table are verified
    And fills the Patient sibling Cancer details
    And Sibling Cancer MRVS details are filled
    And Sibling Cancer MRVS table are verified
    And fills the patient sibling Medical Conditions details
    And Sibling Medical Conditions MRVS details are filled
    And Sibling Medical Conditions MRVS table are verified
    And Sibling Total children details are filled
    And Sibling Child MRVS details are filled
    And Sibling Child MRVS table are verified
    And fills the additional Information about the sibling
    And Generate Scenario Report for the details of the Sibling Partner in the FHQ Survey
    And finally click the Complete-Submit Button to submit the patient sibling record producer
    And Sibling list view page is updated and verified
    And click the new Sibling added and verify the completed record producer data
    And click the FHQ Home button
    And verifies FHQ Family Cohort Study Management Page
    And user clicks the AuntUncle Grid link on FHQ Grid page to land on the FHQ AuntUncle list view page
    And verifies the AuntUncle List View details
    When clicks the New button on the FHQ AuntUncle list view page it lands on the New FHQ AuntUncle record producer page
    Then fills the AuntUncle information
    And fills the First Name, First Initial of LAST name, Year of Birth, Vital Status,Year of Death, Age of Death information of the AuntUncle related to the Patient
    And fills the Sex assigned at birth, Gender Identity information for the AuntUncle
    And fills the Type of birth Information for the AuntUncle
    And fills Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies details of this AuntUncle
    And fills the Patient AuntUncle Resopathy details
    And AuntUncle Rasopathy MRVS details are filled
    And AuntUncle Rasopathy MRVS table are verified
    And fills the Patient AuntUncle Cancer details
    And AuntUncle Cancer MRVS details are filled
    And AuntUncle Cancer MRVS table are verified
    And fills the Patient AuntUncle Medical Conditions details
    And AuntUncle Medical Conditions MRVS details are filled
    And AuntUncle Medical Conditions MRVS table are verified
    And AuntUncle Total children details are filled
    And AuntUncle Child MRVS details are filled
    And AuntUncle child MRVS table are verified
    And fills the additional Information about the AuntUncle
    And Generate Scenario Report for the details of the patient AuntUncle in the FHQ Survey
    And finally click the Complete-Submit Button to submit the patient AuntUncle record producer
    And click the new AuntUncle added and verify the completed record producer data
    And click the FHQ Home button
    And verifies FHQ Family Cohort Study Management Page
    And user clicks the NieceNephew Grid link on FHQ Grid page to land on the FHQ NieceNephew list view page
    And verifies the NieceNephew List View details
    When clicks the New button on the FHQ NieceNephew list view page it lands on the New FHQ NieceNephew record producer page
    Then fills the NieceNephew information
    And fills the First Name, First Initial of LAST name, Year of Birth, Vital Status,Year of Death, Age of Death information of the NieceNephew related to the Patient
    And fills the Sex assigned at birth, Gender Identity information for the NieceNephew
    And fills the Which best describes this relative? information for NieceNephew
    And fills the Type of birth Information for the NieceNephew
    And fills Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies details of this NieceNephew
    And NieceNephew Resopathy details are filled
    And NieceNephew Rasopathy MRVS details are filled
    And NeiceNephew Rasopathy MRVS table are verified
    And NeiceNephew Cancer details are filled
    And NeiceNephew Cancer MRVS details are filled
    And NeiceNephew Cancer MRVS table are verified
    And NieceNephew Medical Conditions details are filled
    And NieceNephew  Medical Conditions MRVS details are filled
    And NieceNephew  Medical Conditions MRVS table are verified
    And NieceNephew Total children details are filled
    And NieceNephew additional Information details are filled
    And Generate Scenario Report for the details of the patient NieceNephew in the FHQ Survey
    And finally click the Complete-Submit Button to submit the patient NieceNephew record producer
    And NieceNephew list view page is updated and verified
    And click the new NieceNephew added and verify the completed record producer data
    And click the FHQ Home button
    And verifies FHQ Family Cohort Study Management Page
    And user clicks the Grandparents Grid link on FHQ Grid page to land on the FHQ Grandparents list view page
    And verifies the Grandparents List View details
    When clicks the New button on the FHQ Grandparent list view page it lands on the New FHQ Grandparent record producer page
    And fills the First Name, First Initial of LAST name, Year of Birth, Vital Status,Year of Death, Age of Death information of the Grandparent related to the Patient
    And fills the Sex assigned at birth, Gender Identity about Grandparent related to the Patient
    And fills the Type of birth Information for the Participant_Grandparent
    And fills Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies details of this Participant_Grandparent
    And fills the Patient Grandparent Resopathy details
    And Grandparent Rasopathy MRVS details are filled
    And Grandparent Rasopathy MRVS table are verified
    And fills the Patient Grandparent Cancer details
    And Grandparent Cancer MRVS details are filled
    And Grandparent Cancer MRVS table are verified
    And fills the Patient Medical Conditions details
    And Grandparent Medical Condition MRVS details are filled
    And Grandparent Medical Condition MRVS table are verified
    And Generate Scenario Report for the details of the patient Grandparent in the FHQ Survey
    And finally click the Complete-Submit Button to submit the patient Grandparent record producer
    And Grandparents list view page is updated and verified
    And click the new GrandParent added and verify the completed record producer data
    And click the FHQ Home button
    And verifies FHQ Family Cohort Study Management Page
    And user clicks the Grandchildren Grid link on FHQ Grid page to land on the FHQ Grandchildren list view page
    And verifies the Grandchildren List View details
    When clicks the New button on the FHQ Grandchildren list view page it lands on the New FHQ Grandchild record producer page
    And fills the First Name, First Initial of LAST name, Year of Birth, Vital Status,Year of Death, Age of Death information for the GrandChild
    And fills the Sex assigned at birth, Gender Identity information for the GrandChild
    And fills the Which best describes this relative? information for GrandChild
    And fills the Type of birth, Which best describes this GrandChild? information
    And fills Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies details of this Grandchild
    And fills the Patient GrandChild Resopathy details
    And GrandChild Rasopathy MRVS details are filled
    And GrandChild Rasopathy MRVS table are verified
    And fills the Patient Grandchild Cancer details
    And Grandchild Cancer MRVS details are filled
    And Grandchild Cancer MRVS table are verified
    And fills the Patient Grandchild Medical Conditions details
    And Grandchild Medical Conditions MRVS details are filled
    And Grandchild Medical Conditions MRVS table are verified
    And Grandchild Total children details are filled
    And fills the additional Information about the Grandchild
    And Generate Scenario Report for the details of the patient Grandchild in the FHQ Survey
    And finally click the Complete-Submit Button to submit the patient Grandchild record producer
    And Grandchild list view page is updated and verified
    And click the new GrandChild added and verify the completed record producer data
    And click the FHQ Home button
    And verifies FHQ Family Cohort Study Management Page
    And user clicks the Cousin Grid link on FHQ Grid page to land on the FHQ Cousin list view page
    And verifies the Cousin List View details
    When clicks the New button on the FHQ Cousin list view page it lands on the New FHQ Cousin record producer page
    And fills the First Name, First Initial of LAST name, Year of Birth, Vital Status,Year of Death, Age of Death information for the Cousin
    And fills the Sex assigned at birth, Gender Identity information for the Cousin
    And fills Which best describes this Cousin and the Type of birth Information for the Cousin related to the Patients
    And fills Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies details of this Cousin
    And fills the Resopathy details for Cousin
    And Rasopathy MRVS details are filled for Cousin
    And Cousin Rasopathy MRVS table are verified
    And fills the Cancer details for Cousin
    And Cancer MRVS details are filled for Cousin
    And Cousin Cancer MRVS table are verified
    And fills the Medical Conditions details for Cousin
    And Medical Conditions MRVS details are filled for Cousin
    And Cousin Medical Conditions MRVS table are verified
    And Cousin Total children details are filled
    And fills the additional Information about the Cousin
    And Generate Scenario Report for the details of the patient Cousin in the FHQ Survey
    And finally click the Complete-Submit Button to submit the patient Cousin record producer
    And Cousin list view page is updated and verified
    And click the new Cousin added and verify the completed record producer data
    And click the FHQ Home button

   @jains @FHQRegression
  Scenario: FHQ Regression Record (Participant RP)
    Given a proxy is on the RASopathies Longitudinal Cohort Study login page
    And logs in Rasopathy page via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
    When the user navigates to CHARMS FHQ Survey page and opens FHQ Landing Page Qualtrics
    Then Verify the New Details of participant immediate family banner is visible on the page
    And selects option To confirm your identity, please indicate your relationship to the participant drop-down
    And Sex assigned at birth, Gender Identity information of the participant are filled
    And Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies details of the participant are filled
    And Participant Total children details are filled
    And Participant Child MRVS details are filled
    And Participant Child MRVS table are verified
    And Participant Partner details are filled
    And Participant Partner MRVS details are filled
    And Participant Partner MRVS table are verified
    And Participant Siblings details are filled
    And Participant Sibling MRVS details are filled
    And Participant Sibling MRVS table are verified
    And Participant additional Informations are filled
    And finally the Complete-Submit Button is clicked to submit the Participant Personal record producer
    And Generate Scenario Report for the Initial visit of the Participant on the FHQ Survey landing page

  @jains @FHQRegression
  Scenario: FHQ Regression Record (Partner RP)
    Given a proxy is on the RASopathies Longitudinal Cohort Study login page
    And logs in Rasopathy page via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
    Given a user is logged on FHQ Family Cohort Study Management Page
    And verifies FHQ Family Cohort Study Management Page
    And user clicks the Partner Grid link on FHQ Grid page to land on the FHQ Partners list view page
    And verifies the Partner List View details
    When clicks the New button on the FHQ Partners list view page it lands on the New FHQ Partner record producer page
    And fills the First Name, First Initial of LAST name information of the Partner related to the Patient
    And fills the Year of Birth, Current Age of the Partner related to the Patient
    And fills the Vital Status,Year of Death, Age of Death information of the Partner related to the Patient
    And fills the Sex assigned at birth, Gender Identity information of the partner related to the Patient
    And fills if the participant is blood-related to this person details
    And finally click the Complete and Submit Button to submit the New FHQ Partner of the Patient Record Producer
    And Partner list view page is updated and verified
    And Generate Scenario Report for the details of the Patient Partner in the FHQ Survey
    And click the new Partner added and verify the completed record producer data
    And click the FHQ Home button
    And the ExtentReport is generated
    And Partner FHQ results are added to the ExtentReport

  @jains @FHQRegression
  Scenario: FHQ Regression Record (Parent RP)
    Given a proxy is on the RASopathies Longitudinal Cohort Study login page
    And logs in Rasopathy page via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
    Given a user is logged on FHQ Family Cohort Study Management Page
    And verifies FHQ Family Cohort Study Management Page
    And user clicks the Parents Grid link on FHQ Grid page to land on the FHQ Parents list view page
    And verifies the Parents List View details
    When clicks the New button on the FHQ Parents list view page it lands on the New FHQ Parent record producer page
    And fills the First Name, First Initial of LAST name, Year of Birth, Vital Status,Year of Death, Age of Death information of the Parent related to the Patient
    And fills the Sex assigned at birth, Gender Identity information for the Parent
    And fills the Type of birth Information for the Parent
    And fills Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies details of this person
    And fills the Patient Parent Resopathy details
    And Parent Rasopathy MRVS details are filled
    And Parent Rasopathy MRVS table are verified
    And fills the Patient Parent Cancer details
    And Parent Cancer MRVS details are filled
    And Parent Cancer MRVS table are verified
    And fills the Patient Parent Medical Conditions details
    And Parent Medical Conditions MRVS details are filled
    And Parent Medical Conditions MRVS table are verified
    And fills the Patient Parent siblings details
    And Parent Sibling MRVS details are filled
    And Parent Sibling MRVS table are verified
    And finally click the Complete-Submit Button to submit the patient Parent record producer
    And Parents list view page is updated and verified
    And Generate Scenario Report for the details of the Patient Parent in the FHQ Survey
    And click the new parent added and verify the completed record producer data
    And click the FHQ Home button

  @jains @FHQRegression
  Scenario: FHQ Regression Record (Child RP)
    Given a proxy is on the RASopathies Longitudinal Cohort Study login page
    And logs in Rasopathy page via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
    Given a user is logged on FHQ Family Cohort Study Management Page
    And verifies FHQ Family Cohort Study Management Page
    And user clicks the Children Grid link on FHQ Grid page to land on the FHQ Childs list view page
    And verifies the Child List View details
    When clicks the New button on the FHQ Childs list view page it lands on the FHQ new child record producer page
    And fills the First Name, First Initial of LAST name, Year of Birth, Vital Status,Year of Death, Age of Death information for the Child
    And fills the Sex assigned at birth, Gender Identity information
    And fills the Which best describes this relative? information
    And fills the other biological parent of this relative
    And fills the Type of birth, Which best describes this child? information
    And fills Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies details of this child
    And fills the Patient Child Resopathy details
    And Rasopathy MRVS details are filled
    And Child Rasopathy MRVS table are verified
    And fills the Patient Child Cancer details
    And Cancer MRVS details are filled
    And Child Cancer MRVS table are verified
    And fills the Patient Child Medical Conditions details
    And Medical Conditions MRVS details are filled
    And Child Medical Conditions MRVS table are verified
    And Child Total children details are filled
    And Child MRVS details are filled
    And Child children MRVS table are verified
    And fills the additional Information about the child
    And Generate Scenario Report for the details of the patient Child in the FHQ Survey
    And finally click the Complete-Submit Button to submit the patient child record producer
    And Child list view page is updated and verified
    And click the new Child added and verify the completed record producer data
    And click the FHQ Home button

  @jains @FHQRegression
  Scenario: FHQ Regression Record (Sibling RP)
    Given a proxy is on the RASopathies Longitudinal Cohort Study login page
    And logs in Rasopathy page via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
    Given a user is logged on FHQ Family Cohort Study Management Page
    And verifies FHQ Family Cohort Study Management Page
    And user clicks the Siblings Grid link on FHQ Grid page to land on the FHQ Siblings list view page
    And verifies the Sibling List View details
    When clicks the New button on the FHQ Siblings list view page it lands on the New FHQ Sibling record producer page
    And fills the First Name, First Initial of LAST name, Year of Birth, Vital Status,Year of Death, Age of Death information of the Sibling related to the Patient
    And fills the Sex assigned at birth, Gender Identity information of the sibling related to the Patient
    And fills the Type of birth Information for the Sibling
    And fills Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies details of this sibling
    And fills the patient sibling Resopathy details
    And Rasopathy MRVS details are filled for the sibling
    And Sibling Rasopathy MRVS table are verified
    And fills the Patient sibling Cancer details
    And Sibling Cancer MRVS details are filled
    And Sibling Cancer MRVS table are verified
    And fills the patient sibling Medical Conditions details
    And Sibling Medical Conditions MRVS details are filled
    And Sibling Medical Conditions MRVS table are verified
    And Sibling Total children details are filled
    And Sibling Child MRVS details are filled
    And Sibling Child MRVS table are verified
    And fills the additional Information about the sibling
    And Generate Scenario Report for the details of the Sibling Partner in the FHQ Survey
    And finally click the Complete-Submit Button to submit the patient sibling record producer
    And Sibling list view page is updated and verified
    And click the new Sibling added and verify the completed record producer data
    And click the FHQ Home button

  @jains @FHQRegression
  Scenario: FHQ Regression Record (AuntUncle RP)
    Given a proxy is on the RASopathies Longitudinal Cohort Study login page
    And logs in Rasopathy page via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
    Given a user is logged on FHQ Family Cohort Study Management Page
    And verifies FHQ Family Cohort Study Management Page
    And user clicks the AuntUncle Grid link on FHQ Grid page to land on the FHQ AuntUncle list view page
    And verifies the AuntUncle List View details
    When clicks the New button on the FHQ AuntUncle list view page it lands on the New FHQ AuntUncle record producer page
    Then fills the AuntUncle information
    And fills the First Name, First Initial of LAST name, Year of Birth, Vital Status,Year of Death, Age of Death information of the AuntUncle related to the Patient
    And fills the Sex assigned at birth, Gender Identity information for the AuntUncle
    And fills the Type of birth Information for the AuntUncle
    And fills Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies details of this AuntUncle
    And fills the Patient AuntUncle Resopathy details
    And AuntUncle Rasopathy MRVS details are filled
    And AuntUncle Rasopathy MRVS table are verified
    And fills the Patient AuntUncle Cancer details
    And AuntUncle Cancer MRVS details are filled
    And AuntUncle Cancer MRVS table are verified
    And fills the Patient AuntUncle Medical Conditions details
    And AuntUncle Medical Conditions MRVS details are filled
    And AuntUncle Medical Conditions MRVS table are verified
    And AuntUncle Total children details are filled
    And AuntUncle Child MRVS details are filled
    And AuntUncle child MRVS table are verified
    And fills the additional Information about the AuntUncle
    And Generate Scenario Report for the details of the patient AuntUncle in the FHQ Survey
    And finally click the Complete-Submit Button to submit the patient AuntUncle record producer
    And click the new AuntUncle added and verify the completed record producer data
    And click the FHQ Home button

  @jains @FHQRegression
  Scenario: FHQ Regression Record (NieceNephew RP)
    Given a proxy is on the RASopathies Longitudinal Cohort Study login page
    And logs in Rasopathy page via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
    Given a user is logged on FHQ Family Cohort Study Management Page
    And verifies FHQ Family Cohort Study Management Page
    And user clicks the NieceNephew Grid link on FHQ Grid page to land on the FHQ NieceNephew list view page
    And verifies the NieceNephew List View details
    When clicks the New button on the FHQ NieceNephew list view page it lands on the New FHQ NieceNephew record producer page
    Then fills the NieceNephew information
    And fills the First Name, First Initial of LAST name, Year of Birth, Vital Status,Year of Death, Age of Death information of the NieceNephew related to the Patient
    And fills the Sex assigned at birth, Gender Identity information for the NieceNephew
    And fills the Which best describes this relative? information for NieceNephew
    And fills the Type of birth Information for the NieceNephew
    And fills Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies details of this NieceNephew
    And NieceNephew Resopathy details are filled
    And NieceNephew Rasopathy MRVS details are filled
    And NeiceNephew Rasopathy MRVS table are verified
    And NeiceNephew Cancer details are filled
    And NeiceNephew Cancer MRVS details are filled
    And NeiceNephew Cancer MRVS table are verified
    And NieceNephew Medical Conditions details are filled
    And NieceNephew  Medical Conditions MRVS details are filled
    And NieceNephew  Medical Conditions MRVS table are verified
    And NieceNephew Total children details are filled
    And NieceNephew additional Information details are filled
    And Generate Scenario Report for the details of the patient NieceNephew in the FHQ Survey
    And finally click the Complete-Submit Button to submit the patient NieceNephew record producer
    And NieceNephew list view page is updated and verified
    And click the FHQ Home button

  @jains @FHQRegression
  Scenario: FHQ Regression Record (GrandParents RP)
    Given a proxy is on the RASopathies Longitudinal Cohort Study login page
    And logs in Rasopathy page via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
    Given a user is logged on FHQ Family Cohort Study Management Page
    And verifies FHQ Family Cohort Study Management Page
    And user clicks the Grandparents Grid link on FHQ Grid page to land on the FHQ Grandparents list view page
    And verifies the Grandparents List View details
    When clicks the New button on the FHQ Grandparent list view page it lands on the New FHQ Grandparent record producer page
    And fills the First Name, First Initial of LAST name, Year of Birth, Vital Status,Year of Death, Age of Death information of the Grandparent related to the Patient
    And fills the Sex assigned at birth, Gender Identity about Grandparent related to the Patient
    And fills the Type of birth Information for the Participant_Grandparent
    And fills Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies details of this Participant_Grandparent
    And fills the Patient Grandparent Resopathy details
    And Grandparent Rasopathy MRVS details are filled
    And Grandparent Rasopathy MRVS table are verified
    And fills the Patient Grandparent Cancer details
    And Grandparent Cancer MRVS details are filled
    And Grandparent Cancer MRVS table are verified
    And fills the Patient Medical Conditions details
    And Grandparent Medical Condition MRVS details are filled
    And Grandparent Medical Condition MRVS table are verified
    And Generate Scenario Report for the details of the patient Grandparent in the FHQ Survey
    And finally click the Complete-Submit Button to submit the patient Grandparent record producer
    And Grandparents list view page is updated and verified
    And click the new GrandParent added and verify the completed record producer data
    And click the FHQ Home button

   @jains @FHQRegression
  Scenario: FHQ Regression Record (GrandChild RP)
    Given a proxy is on the RASopathies Longitudinal Cohort Study login page
    And logs in Rasopathy page via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
    Given a user is logged on FHQ Family Cohort Study Management Page
    And verifies FHQ Family Cohort Study Management Page
    And user clicks the Grandchildren Grid link on FHQ Grid page to land on the FHQ Grandchildren list view page
    And verifies the Grandchildren List View details
    When clicks the New button on the FHQ Grandchildren list view page it lands on the New FHQ Grandchild record producer page
    And fills the First Name, First Initial of LAST name, Year of Birth, Vital Status,Year of Death, Age of Death information for the GrandChild
    And fills the Sex assigned at birth, Gender Identity information for the GrandChild
    And fills the Which best describes this relative? information for GrandChild
    And fills the Type of birth, Which best describes this GrandChild? information
    And fills Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies details of this Grandchild
    And fills the Patient GrandChild Resopathy details
    And GrandChild Rasopathy MRVS details are filled
    And GrandChild Rasopathy MRVS table are verified
    And fills the Patient Grandchild Cancer details
    And Grandchild Cancer MRVS details are filled
    And Grandchild Cancer MRVS table are verified
    And fills the Patient Grandchild Medical Conditions details
    And Grandchild Medical Conditions MRVS details are filled
    And Grandchild Medical Conditions MRVS table are verified
    And Grandchild Total children details are filled
    And fills the additional Information about the Grandchild
    And Generate Scenario Report for the details of the patient Grandchild in the FHQ Survey
    And finally click the Complete-Submit Button to submit the patient Grandchild record producer
    And Grandchild list view page is updated and verified
    And click the new GrandChild added and verify the completed record producer data
    And click the FHQ Home button

  @jains @FHQRegression
  Scenario: FHQ Regression Record (Cousin RP)
    Given a proxy is on the RASopathies Longitudinal Cohort Study login page
    And logs in Rasopathy page via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
    Given a user is logged on FHQ Family Cohort Study Management Page
    And verifies FHQ Family Cohort Study Management Page
    And user clicks the Cousin Grid link on FHQ Grid page to land on the FHQ Cousin list view page
    And verifies the Cousin List View details
    When clicks the New button on the FHQ Cousin list view page it lands on the New FHQ Cousin record producer page
    And fills the First Name, First Initial of LAST name, Year of Birth, Vital Status,Year of Death, Age of Death information for the Cousin
    And fills the Sex assigned at birth, Gender Identity information for the Cousin
    And fills Which best describes this Cousin and the Type of birth Information for the Cousin related to the Patients
    And fills Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies details of this Cousin
    And fills the Resopathy details for Cousin
    And Rasopathy MRVS details are filled for Cousin
    And Cousin Rasopathy MRVS table are verified
    And fills the Cancer details for Cousin
    And Cancer MRVS details are filled for Cousin
    And Cousin Cancer MRVS table are verified
    And fills the Medical Conditions details for Cousin
    And Medical Conditions MRVS details are filled for Cousin
    And Cousin Medical Conditions MRVS table are verified
    And Cousin Total children details are filled
    And fills the additional Information about the Cousin
    And Generate Scenario Report for the details of the patient Cousin in the FHQ Survey
    And finally click the Complete-Submit Button to submit the patient Cousin record producer
    And Cousin list view page is updated and verified
    And click the new Cousin added and verify the completed record producer data
    And click the FHQ Home button
