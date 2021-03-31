Feature: COVIDCode Follow Up Form Scenarios
  
  Description: This feature file contains scenarios related to the Follow Up Form

  @Smoke @Sprint7 @COVID-209 @updated2/2/21 @juarezds
  Scenario: Follow Up Form - Search Function - Service Portal
    Given a COVIDCode user is on the Follow Up Form to update an existing enrollment
    Then the user is able to search an existing enrollment by patient ID OR last name OR first name OR NIH Medical Record Number

  @Smoke @Sprint7 @COVID-193 @updated2/2/21 @juarezds
  Scenario: Follow Up Form - Verifying Enhanced Symptoms Question - Service Portal
    Given a COVIDCode user is on the Follow Up Form to update an existing enrollment
    When an enrollment is selected
    Then selected enrollment is opened
    When the user is on the Disease Course section to add information
    Then the user is able to select multiple symptoms in the symptoms field
    When the user selects "None of the above" after having selected multiple symptoms
    Then the user sees a pop up with the message "Choosing None of the Above will clear the previously selected values, is that Ok?"
    When the user selects Yes
    Then "None of the above" option displays and replaces all previously selected symptoms
    When the user attempts to add a symptom such as "Cough" after selecting "None of the above" option
    Then the user sees another pop up with the message "Choosing this symptom will result in previous options being removed, is that Ok?"
    When the user selects Yes
    Then "Cough" symptom is displayed
    When selecting "Don't know" after having selected a symptoms
    Then the user is able to see another pop up with the message "Choosing Don't Know will clear the previously selected values, is that Ok?"
    When the user selects Yes
    Then "Don't know" option displays

  @Smoke @Sprint7 @COVID-194 @updated2/2/21 @juarezds
  Scenario: Follow Up Form - Verifying Enhanced Treatment question - Service Portal
    Given a COVIDCode user is on the Follow Up Form to update an existing enrollment
    When an enrollment is selected
    Then selected enrollment is opened
    When the user is on the Disease Course section to add information
    Then the user is able to select multiple treatment items in "Treatment Items" field
    When the user selects "None of the above" after having selected multiple treatment items
    Then the user sees a pop up with the message "Choosing None of the Above will clear the previously selected values, is that Ok?"
    When the user selects Yes
    Then "None of the above" option displays and replaces all previously selected symptoms
    When the user adds a symptom such as "Intubation" after selecting "None of the above" option
    Then the user sees another pop up with the message "Choosing this treatment item will result in previous options being removed, is that Ok?"
    When the user selects Yes
    Then "Intubation" symptom is displayed in treatment item field
    When selecting "Don't know" after having selected a treatment item
    Then the user is able to see another pop up with the message "Choosing Don't Know will clear the previously selected values, is that Ok?"
    When the user selects Yes
    Then "Don't know" option displays

  @Smoke @Sprint8 @COVID-206 @updated2/8/21 @juarezds
  Scenario: Follow Up Form - Verifying Exposure and Risk Factors questions display - Service Portal
    Given a COVIDCode user is on the Follow Up Form to update an existing enrollment
    When an enrollment is selected
    Then selected enrollment is opened
    When on the "Exposures and Risk Factors" section
    Then the following questions should display "Your/Patient's typical self reported health?", "Please tell me if you/the patient have any of the following medical conditions.", "If you/the patient has cancer, what type of cancer is it? (Please specify)", "Are immunizations up to date?", "Have you/the patient received the following vaccinations:", "What were your/the patient's typical walking pace?","Hours spent sitting", "Have you/the patient ever regularly vaped an e-cigarette or similar device?", "Have you/the patient smoked at least 100 cigarettes in your entire life?", "About how often do you/the patient consume alcoholic beverages?", "Hours per week spent exercising"

  @Smoke @New @COVID-425 @juarezds
  Scenario: Follow Up Form - Verifying Error Message for Invalid Data in Inches
    When on the Follow Up form in Service Portal
    And on the Demographics Information section
    When selecting Feet/Inches for Height
    And entering any value for feet
    And entering a value greater than 12
    And clicking anywhere else or attempting to submit the application
    Then a message "Because you have a value in feet, inches cannot be more than 11.99" displays

  @Smoke @New @COVID-422 @juarezds
  Scenario: Add Field Options for "When were you officially diagnosed with COVID-19" field
    When on the Follow Up form in Service Portal
    And navigating to the Symptomology section
    Then "Have you officially been diagnosed with COVID-19?" question displays

  @Smoke @New @COVID-418 @juarezds
  Scenario: Verifying Re-enable "Which Organs Showed Signs of Dysfunction/Failure?"
    Given a COVIDcode user is on the Follow Up form in Service Portal
    When on Disease Course section, when selecting "Yes" for the Organ Failure field
    Then a new question appears that reads "Which organ(s) showed signs of dysfunction/failure?"
    And the field options are: Liver, Kidney, Lungs, Heart, Central Nervous system, Hematologic System, Other, Other (free text field)

  @Smoke @TCCOVID-198 @Sprint8 @COVID-116 @updated2/2/21
  Scenario: Verifying 'Drug Treatments' section - Service Portal
    Given a COVIDCode provider is on the Follow Up Form
    And navigating to the Disease Course section
    Then Drug Treatments section should display along with the values None, Azithromycin, Chloroquine, Corticosteroids, Hydroxycholoquine, JAK Inhibitor, Remdesivir, Tocilizumab, Other

  @Smoke @New @COVID-196 @juarezds
  Scenario: Follow Up Form - Verifying allow any future dates to be selected for any date picker
    Given a COVIDCode user is on the Follow Up form page
    Then the systems does not allow any future dates to be selected for any date picker

  @Smoke @New @COVID-376 @juarezds
  Scenario: Service Portal Follow Up - Verifying Add Symptomology Tab to Follow Up Form
    Given a COVIDcode User is on the Follow Up form Service Portal
    When a navigating to the Symptomology tab
    Then the following field display: 'Were you symptomatic?', 'How was the sample taken?', 'What type of test did the patient receive? (Please select all that apply)', 'Have you officially been diagnosed with COVID-19?'
    And when a selecting 'Yes' to Were you symptomatic?
    Then when did you the first develop symptoms of COVID-19? date picker displays
