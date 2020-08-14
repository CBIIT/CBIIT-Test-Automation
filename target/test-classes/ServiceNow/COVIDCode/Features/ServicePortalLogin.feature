#Author: Diego Juarez
#Supports COVID-33, COVID-64, COVID-86
 
Feature: COVIDcode Study Provider User Login 
Background: 
Given a COVIDcode Study Provider user is on the COVIDcode study homepage
 
 @Smoke       
Scenario: COVIDcode Study Provider Login when clicking 'Access and complete questionnaire' button and verifies expected header text
When the COVIDcode Study Provider user logs in by clicking Access and complete questionnaire button
Then the COVIDcode Study Provider user should see the COVIDcode Enrollment Questionnaire
And the Study Provider user sees the header text "Please fill out each data element to the best of your abilities. If you do not know the answer to a question, select “Don’t know”,  do not leave it blank. Some fields are required and denoted by an asterisk. If you have any questions about completing this survey, please contact the study team at covidcode@mail.nih.gov or (240) 274-6777."
And the Study Provider also sees contact email and phone number as "covidcode@mail.nih.gov or (240) 274-6777." 

@Smoke
Scenario: COVIDcode Study Provider Login when clicking 'Log In' button and verifies expected header text
When the COVIDcode Study Provider user logs in by clicking Log In button
Then the COVIDcode Study Provider user should see the COVIDcode Enrollment Questionnaire
And the Study Provider user sees the header text "Please fill out each data element to the best of your abilities. If you do not know the answer to a question, select “Don’t know”,  do not leave it blank. Some fields are required and denoted by an asterisk. If you have any questions about completing this survey, please contact the study team at covidcode@mail.nih.gov or (240) 274-6777."
And the Study Provider also sees contact email and phone number as "covidcode@mail.nih.gov or (240) 274-6777." 