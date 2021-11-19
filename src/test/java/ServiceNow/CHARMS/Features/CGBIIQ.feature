Feature: These are features pertaining to the CGB IIQ

Description: These scenarios will complete the CGB IIQ in the flows specified in the scenario

@matarodriguezko 
Scenario: Female Participant (Proxy) A user lands on the CHARMS
Given the user is redirected to the log in page of the Individual Information Questionnaire 
When types the email address in the textbook labeled Email 
And types the One-time pin in the textbook labeled One Time pin 
And on the CGB Statement of Confidentiality page clicks next arrow button 
And on the CGB Instructions page clicks next arrow button 
And on the General Background Information section of IIQ Survey page clicks next arrow button
And selects the radio button labelled I am completing this form for someone else 
And fills out the participant "Jennifer Slogan" for whom the user is completing the IIQ form. 
And selects Female as the biological sex of the participant assigned at birth 
And selects for which Sex the participant is identified 
And selects what the participant is considered to be 
And selects the Race of the participant 
And selects if the participant is from the Ashkenazi Eastern European JewishDescent 
And selects if the participant is Adopted 
And selects Yes for the participant raised by someone other than their biological parent 
And adds Information regarding individuals who raised the participant "Joanne","Step Mother"
And adds the participant DOB in MMDDYYYY format 
And adds the Demographic information of the participant "Bethesda", "Maryland", "United States"
And selects the participant Biological Mothers Ancestral Background or add the free text for the box labelled Other SPECIFY 
And selects the participant Biological Fathers Ancestral Background or add the free text for the box labelled Other SPECIFY 
And selects the participant Familys Religious Background or add the free text for the box labelled Other SPECIFY
And selects the participant Current Marital Status 
And adds the participant "Software Engineer" 
And selects if the participant currently have health insurance? 
And selects the total combined yearly income for all the persons in participant household 
And selects the highest level of schooling participant has completed 
And on the medical history section of IIQ Survey page clicks on the forward arrow button
And the user selects if the participant conceived using in vitro fertilization IVF
And selects if the participant conceived through a donor egg or sperm
And selects if the participant Preimplantation Genetic Diagnosis PGD used
And selects option Yes if the participant is a twin or multiple birth
And selects the option Twin for what type of birth was the participant
And selects whether the participant have a fraternal or identical twin
And adds the information for the names of the children in the twin or multiple birth "Twin","Bryan","L","Fraternal twin"
And selects the option Yes for the participants biological parents blood-related to each other
And adds "Second cousins once removed" of the participant how the biological parents blood-related to each other
And selects how was the participant born
And adds the participants birth "7", "17" and "10" Numerical Value and "pounds", "inches" and "inches" for Unit Of Measure
And the user clicks the forward arrow on the cancer and benign tumor history section of IIQ Survey page
And the user selects option Yes if participant ever been diagnosed with any cancer and or benign tumor
And selects or adds the primary cancers or benign tumors that have been diagnosed
And adds primary cancer or tumor information "2021","17","Baltimore Maryland","Fairfax Virginia" and selects what kind of the treatment received
And selects Yes if the participant ever been evaluated for ANY genetic disease or syndrome?
And selects if participant ever had genetic counseling for ANY reason?
And selects the details for the genetic evaluations that have been completed includes "Li-Fraumeni Syndrome (TP53)" summarization of the evaluation and adds the information "12/19", "16", "John Hopkins Hospital, Baltimore, Maryland, United States of America", and "No abnormality found" 
And selects Yes if the participant has copy of the genetic test results and would like to upload them to this questionnaire?
And upload the genetic test results
And the user adds the participant height and weight at the indicated ages "170","6","130","170","180" and selects "pounds", "feet", "pounds", "pounds" and "pounds" for Unit of Measurements
And selects the most participant has ever weighed "180 lbs" EXCLUDING WEIGHT DURING PREGNANCY
And selects at what "18" was the participant at their highest weight?
And the user adds the "14" of the participant at first menstrual period
And adds the last menstrual period "10/2021"
And selects the reason if participant period has not occurred for the last year or more
And selects Yes if the participant ever been pregnant?
And adds the participant "18" at their first pregnancy?
And adds the "4" the participant has been pregnant?
And selects Yes if the participant has ever tried to become pregnant for more than one year without success
And selects Yes for participant ever being consulted a doctor because of difficulty in getting pregnant
And adds "40" was participant when they first consulted a doctor about difficulty in getting pregnant
And selects all diagnosis that was made to explain the difficulties getting pregnant
And on the Female Hormones section of IIQ Survey page clicks on the forward arrow button
And the user selects if participant has ever taken pills, injections or implants for birth control or for any other reason?
And selects Yes if participant has ever prescribed female hormones for this reason?
And adds at what "35" was participant prescribed female hormones for hormone replacement therapy?
And adds the total amount of time the participant has taken hormone replacement therapy "43"
Then the user lands on the "You are almost done!" page
And the user clicks the forward arrow button
Then the end of the IIQ survey page "EndOfSurvey" is displayed