Feature: COVIDCode Follow Up Form Scenarios 

Description: This feature file contains scenarios related to the Follow Up Form

@Sprint7 @COVID-95 @Smoke
Scenario: Follow Up Form - Verifying added education question - Service Portal
When a COVIDCode user accesses a Follow Up Form to update an existing enrollment
Then the question "What is the highest level of school that you/the patient completed?" should display in the demographics section

@Sprint7 @COVID-209 @Smoke
Scenario: Follow Up Form - Search Function - Service Portal
Given a COVIDCode user is on the Follow Up Form to update an existing enrollment
Then the user is able to search an existing enrollment by patient ID, last name, first name, or NIH Medical Record Number

@Sprint7 @COVID-177 @Smoke 
Scenario: Follow Up Form - Verifying Group ID and Hospital Code fields are locked - Service Portal
Given a COVIDCode Provider is on the Follow Up Form to update an existing enrollment
When an enrollment is selected
Then the Group ID and Hospital Code fields should be locked 

@Sprint7 @COVID-193 @Smoke
Scenario: Follow Up Form - Verifying Enhanced Symptoms Question - Service Portal
Given a COVIDCode user is on the Follow Up Form to update an existing enrollment
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

@Sprint7 @COVID-194 @Smoke
Scenario: Follow Up Form - Verifying Enhanced Treatment question - Service Portal
Given a COVIDCode user is on the Follow Up Form to update an existing enrollment
When the user is on the Disease Course section to add information
Then the user is able to select multiple treatment items in "Treatment Items" field
When the user selects "None of the above" after having selected multiple treatment items
Then the user sees a pop up with the message "Choosing None of the Above will clear the previously selected values, is that Ok?"
When the user selects Yes
Then "None of the above" option displays and replaces all previously selected symptoms
When the user adds a symptom such as "Intubation" after selecting "None of the above" option
Then the user sees another pop up with the message "Choosing this drug treatment will result in previous options being removed, is that Ok?"
When the user selects Yes 
Then "Intubation" symptom is displayed in treatment item field
When selecting "Don't know" after having selected a treatment item
Then the user is able to see another pop up with the message "Choosing Don't Know will clear the previously selected values, is that Ok?"
When the user selects Yes
Then "Don't know" option displays

@Sprint7 @COVID-201 @Smoke
Scenario: Follow Up Form - Verifying Auto Populate FLD Hospital Code - Service Portal
Given a COVIDCode user is on the Follow Up Form to update an existing enrollment
When the user selects a group 3 enrollment 
Then the Host Hospital Code field should auto populate with "FLD"

@Sprint7 @COVID-206 @Progession
Scenario: Follow Up Form - Verifying Exposure and Risk Factors questions display - Service Portal
Given a COVIDCode Provider is on the Follow Up Form to update an existing enrollment
When on the "Exposures and Risk Factors" section 
Then the following questions should display "Your/Patient's typical self reported health?", "Medical Conditions", "If you/the patient has cancer, what type of cancer is it? (Please specify)", "Are immunizations up to date?", "Have you/the patient received the following vaccinations:", "What were your/the patient's typical walking pace?","Hours spent sitting", "Have you/the patient ever regularly vaped an e-cigarette or similar device?", "Have you/the patient smoked at least 100 cigarettes in your/their entire life?", "About how often do you/the patient consume alcoholic beverages?", "Hours per week spent exercising" 





