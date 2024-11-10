Feature: OCPL Training Request Form Scenarios
  Description: This Feature file contains OCPL Training Request Form Scenarios

  @SNOWPROJ-149 @Chaudhryma @Regression @playwright
  Scenario: Test OCPL Training Request- Field Additions
    Given the user is filling of the OCPL Training request form,
    When the user reaches the bottom of the form,
    Then the user will see the following two required fields, "Are you requesting Compensatory Time for Travel (CTT) during this training?" and "Are you requesting Comp Time (CT) during this training?"
    And both of the above fields have Yes and No Radion button options
    And verify the tooltip verbiage for the CCT field "Are you requesting Compensatory Time for Travel (CTT) during this training?"
      """
      Compensatory Time for Travel (CTT) is time the traveler spends "in a travel status" outside the employee's regular tour of duty, away from their permanent work site (i.e., travel to/from airport, waiting at airport, flight time, etc.). A CTT approval form is required upon return, signed by both the traveler and their supervisor. Note: Please send the form to your ITAS and Travel Planner.
      """
    And verify the tooltip verbiage for the CT field "Are you requesting Comp Time (CT) during this training?"
      """
      Comp Time (CT) is time staff members work outside their normal tour of duty hours (i.e., working a conference on a weekend). Be advised, travel time does not apply to this category and is considered CTT. A form is not required, but an email approval is needed before. Note: These hours must be worked out between you and your supervisor via email and sent to your ITAS Timekeeper 5 days after your training.
      """
    And when the user submits the form containing their responses to the questions, the system will capture their response.
    And verify the response in the body of "OCPL Training Request" email in the System log emails