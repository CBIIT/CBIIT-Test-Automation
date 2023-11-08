Feature: These are features pertaining to the CGB IIQ

  Description: These scenarios will complete the CGB IIQ in the flows specified in the scenario

  @Smoke @matarodriguezko
  Scenario: Female Participant (Proxy) A user lands on the CHARMS
    Given the user is redirected to the log in page of the Individual Information Questionnaire - CGB IIQ
    When types the email address in the textbook labeled Email - CGB IIQ
    And types the One-time pin in the textbook labeled One Time pin - CGB IIQ
    And on the CGB Statement of Confidentiality page clicks next arrow button - CGB IIQ
    And on the CGB Instructions page clicks next arrow button - CGB IIQ
    And on the General Background Information section of IIQ Survey page clicks next arrow button - CGB IIQ
    And selects the radio button labelled I am completing this form for someone else - CGB IIQ
    And fills out the participant "Jennifer' Slogan" for whom the user is completing the IIQ form. - CGB IIQ
    And selects Female as the biological sex of the participant assigned at birth - CGB IIQ
    And selects for which Sex the participant is identified - CGB IIQ
    And selects what the participant is considered to be - CGB IIQ
    And selects the Race of the participant - CGB IIQ
    And selects if the participant is from the Ashkenazi Eastern European JewishDescent - CGB IIQ
    And selects if the participant is Adopted - CGB IIQ
    And selects Yes for the participant raised by someone other than their biological parent - CGB IIQ
    And adds Information regarding individuals who raised the participant "Joan$ne","Step $ Mother" - CGB IIQ
    And adds the participant DOB in MMDDYYYY format - CGB IIQ
    And adds the Demographic information of the participant "Bethesda!", "Maryland", "United States" - CGB IIQ
    And selects the participant Biological Mothers Ancestral Background or add the free text for the box labelled Other SPECIFY - CGB IIQ
    And selects the participant Biological Fathers Ancestral Background or add the free text for the box labelled Other SPECIFY - CGB IIQ
    And selects the participant Familys Religious Background or add the free text for the box labelled Other SPECIFY - CGB IIQ
    And selects the participant Current Marital Status - CGB IIQ
    And adds the participant "Software & Engineer" - CGB IIQ
    And selects if the participant currently have health insurance? - CGB IIQ
    And selects the total combined yearly income for all the persons in participant household - CGB IIQ
    And selects the highest level of schooling participant has completed - CGB IIQ
    And on the medical history section of IIQ Survey page clicks on the forward arrow button - CGB IIQ
    And the user selects if the participant conceived using in vitro fertilization IVF - CGB IIQ
    And selects if the participant conceived through a donor egg or sperm - CGB IIQ
    And selects if the participant Preimplantation Genetic Diagnosis PGD used - CGB IIQ
    And selects option Yes if the participant is a twin or multiple birth - CGB IIQ
    And selects the option Twin for what type of birth was the participant - CGB IIQ
    And adds the information for the names of the children in the twin or multiple birth table "Bryan","L","Fraternal twin" - CGB IIQ
    And selects the option Yes for the participants biological parents blood-related to each other - CGB IIQ
    And adds "Second cousins 'once removed" of the participant how the biological parents blood-related to each other - CGB IIQ
    And selects how was the participant born - CGB IIQ
    And adds the participants birth weight "7" and Unit Of Measure "pounds" - CGB IIQ
    And adds the participants birth measurements "17" and "10" Numerical Value and "inches" and "inches" for Unit Of Measure - CGB IIQ
    And the user clicks the forward arrow on the cancer and benign tumor history section of IIQ Survey page - CGB IIQ
    And the user selects option Yes if participant ever been diagnosed with any cancer and or benign tumor - CGB IIQ
    And selects or adds the primary cancers or benign tumors that have been diagnosed - CGB IIQ
    And adds primary cancer or tumor information "2021","17","Baltimore$$ Maryland","Fairfax' Virginia" and selects what kind of the treatment received - CGB IIQ
    And selects Yes if the participant ever been evaluated for ANY genetic disease or syndrome? - CGB IIQ
    And selects details for the genetic evaluations that have been completed by the proxy includes "Li-Fraumeni Syndrome (TP53 gene)" summarization of the evaluation and adds the information "12/19", "16", "John Hopkins Hospital, Baltimore, Maryland, United States of America", and "No genetic change found/negative test" - CGB IIQ
    And selects Yes if the participant has copy of the genetic test results and would like to upload them to this questionnaire? - CGB IIQ
    And upload the genetic test results - CGB IIQ
    And the user adds the participant height by proxy "6", "feet" - CGB IIQ
    And the user adds the participant weight at the indicated ages "170","180","130","170","180" and selects "pounds", "pounds", "pounds", "pounds" and "pounds" for Unit of Measurements - CGB IIQ
    And selects at what "18" was the participant at their highest weight? - CGB IIQ
    And the user adds the "14" of the participant at first menstrual period - CGB IIQ
    And adds the last menstrual period "10/2021" - CGB IIQ
    And selects the reason if participant period has not occurred for the last year or more - CGB IIQ
    And selects Yes if the participant ever been pregnant? - CGB IIQ
    And adds the participant age "18" at their first pregnancy - CGB IIQ
    And adds the number of times "4" the participant has been pregnant - CGB IIQ
    And selects Yes if the participant has ever tried to become pregnant for more than one year without success - CGB IIQ
    And selects Yes for participant ever being consulted a doctor because of difficulty in getting pregnant - CGB IIQ
    And adds "40" was participant when they first consulted a doctor about difficulty in getting pregnant - CGB IIQ
    And selects all diagnosis that was made to explain the difficulties getting pregnant - CGB IIQ
    And on the Female Hormones section of IIQ Survey page clicks on the forward arrow button - CGB IIQ
    And the user selects if participant has ever taken pills, injections or implants for birth control or for any other reason? - CGB IIQ
    And selects Yes if participant has ever prescribed female hormones for this reason? - CGB IIQ
    And adds at what "35" was participant prescribed female hormones for hormone replacement therapy? - CGB IIQ
    And adds the total amount of time the participant has taken hormone replacement therapy "43" - CGB IIQ
    Then the user lands on the "You are almost done!" page - CGB IIQ
    And the user clicks the forward arrow button - CGB IIQ
    Then the end of the IIQ survey page "EndOfSurvey" is displayed - CGB IIQ

  @Smoke @matarodriguezko
  Scenario: Male Participant (Proxy) A user lands on the CHARMS
    Given the user is redirected to the log in page of the Individual Information Questionnaire - CGB IIQ
    When types the email address in the textbook labeled Email - CGB IIQ
    And types the One-time pin in the textbook labeled One Time pin - CGB IIQ
    And on the CGB Statement of Confidentiality page clicks next arrow button - CGB IIQ
    And on the CGB Instructions page clicks next arrow button - CGB IIQ
    And on the General Background Information section of IIQ Survey page clicks next arrow button - CGB IIQ
    And selects the radio button labelled I am completing this form for someone else - CGB IIQ
    And fills out the participants "Kevin Mata" for whom the user is completing the IIQ form. - CGB IIQ
    And selects Male as the biological sex of the participant assigned at birth - CGB IIQ
    And selects for which Sex the participant identifies as - CGB IIQ
    And selects what the participant is considered to be - CGB IIQ
    And selects the Race of the participant - CGB IIQ
    And selects if the participant is from the Ashkenazi Eastern European JewishDescent - CGB IIQ
    And selects if the participant is Adopted - CGB IIQ
    And selects Yes for the participant raised by someone other than their biological parent - CGB IIQ
    And adds Information regarding individuals who raised the participant "Joanne","Step Mother" - CGB IIQ
    And adds the participant DOB in MMDDYYYY format - CGB IIQ
    And adds the Demographic information of the participant "Bethesda", "Maryland", "United States" - CGB IIQ
    And selects the participant Biological Mothers Ancestral Background or add the free text for the box labelled Other SPECIFY - CGB IIQ
    And selects the participant Biological Fathers Ancestral Background or add the free text for the box labelled Other SPECIFY - CGB IIQ
    And selects the participant Familys Religious Background or add the free text for the box labelled Other SPECIFY - CGB IIQ
    And selects the participant Current Marital Status - CGB IIQ
    And adds the participant "Software Engineer" - CGB IIQ
    And selects if the participant currently have health insurance? - CGB IIQ
    And selects the total combined yearly income for all the persons in participant household - CGB IIQ
    And selects the highest level of schooling participant has completed - CGB IIQ
    And on the medical history section of IIQ Survey page clicks on the forward arrow button - CGB IIQ
    And the user selects if the participant conceived using in vitro fertilization IVF - CGB IIQ
    And selects if the participant conceived through a donor egg or sperm - CGB IIQ
    And selects if the participant Preimplantation Genetic Diagnosis PGD used - CGB IIQ
    And selects option Yes if the participant is a twin or multiple birth - CGB IIQ
    And selects the option Twin for what type of birth was the participant - CGB IIQ
    And adds the information for the names of the children in the twin or multiple birth table "Bryan","L","Fraternal twin" - CGB IIQ
    And selects the option Yes for the participants biological parents blood-related to each other - CGB IIQ
    And adds "Second cousins once removed" of the participant how the biological parents blood-related to each other - CGB IIQ
    And selects how was the participant born - CGB IIQ
    And adds the participants birth weight "7" and Unit Of Measure "pounds" - CGB IIQ
    And adds the participants birth measurements "17" and "10" Numerical Value and "inches" and "inches" for Unit Of Measure - CGB IIQ
    And the user clicks the forward arrow on the cancer and benign tumor history section of IIQ Survey page - CGB IIQ
    And the user selects option Yes if participant ever been diagnosed with any cancer and or benign tumor - CGB IIQ
    And selects or adds the primary cancers or benign tumors that have been diagnosed - CGB IIQ
    And adds primary cancer or tumor information "2021","17","Baltimore Maryland","Fairfax Virginia" and selects what kind of the treatment received - CGB IIQ
    And selects Yes if the participant ever been evaluated for ANY genetic disease or syndrome? - CGB IIQ
    And selects details for the genetic evaluations that have been completed by the proxy includes "Li-Fraumeni Syndrome (TP53 gene)" summarization of the evaluation and adds the information "12/19", "16", "John Hopkins Hospital, Baltimore, Maryland, United States of America", and "No genetic change found/negative test" - CGB IIQ
    And selects Yes if the participant has copy of the genetic test results and would like to upload them to this questionnaire? - CGB IIQ
    And upload the genetic test results - CGB IIQ
    And the user adds the participant height by proxy "6", "feet" - CGB IIQ
    And the user adds the participant weight at the indicated ages "170","180","130","170","180" and selects "pounds", "pounds", "pounds", "pounds" and "pounds" for Unit of Measurements - CGB IIQ
    And selects at what "18" was the participant at their highest weight? - CGB IIQ
    And selects how many "4" the proband has gotten a women pregnant - CGB IIQ
    And selects if Proband or Partner have sought help with fertility - CGB IIQ
    And selects all diagnosis that was made to explain the difficulties getting pregnant - CGB IIQ
    Then the user lands on the "You are almost done!" page - CGB IIQ
    And the user clicks the forward arrow button - CGB IIQ
    Then the end of the IIQ survey page "EndOfSurvey" is displayed - CGB IIQ

  @Smoke @matarodriguezko
  Scenario: Female Participant (Proband) A user lands on the CHARMS
    Given the user is redirected to the log in page of the Individual Information Questionnaire - CGB IIQ
    When types the email address in the textbook labeled Email - CGB IIQ
    And types the One-time pin in the textbook labeled One Time pin - CGB IIQ
    And on the CGB Statement of Confidentiality page clicks next arrow button - CGB IIQ
    And on the CGB Instructions page clicks next arrow button - CGB IIQ
    And on the General Background Information section of IIQ Survey page clicks next arrow button - CGB IIQ
    And selects the radio button labelled I am completing this form for myself - CGB IIQ
    And selects Female as the biological sex of the participant assigned at birth - CGB IIQ
    And selects for which Sex the participant is identified - CGB IIQ
    And selects what the participant is considered to be - CGB IIQ
    And selects the Race of the participant - CGB IIQ
    And selects if the participant is from the Ashkenazi Eastern European JewishDescent - CGB IIQ
    And selects if the participant is Adopted - CGB IIQ
    And selects Yes for the participant raised by someone other than their biological parent - CGB IIQ
    And adds Information regarding the individual who raised the participant "Richard","Grandpa" - CGB IIQ
    And adds the participant DOB in MMDDYYYY format - CGB IIQ
    And adds the Demographic information of participant "Bethesda", "Maryland", "United States" - CGB IIQ
    And selects the participant Biological Mothers Ancestral Background or add the free text for the box labelled Other SPECIFY - CGB IIQ
    And selects the participant Biological Fathers Ancestral Background or add the free text for the box labelled Other SPECIFY - CGB IIQ
    And selects the participant Familys Religious Background or add the free text for the box labelled Other SPECIFY - CGB IIQ
    And selects the participant Current Marital Status - CGB IIQ
    And adds participant "Software Engineer" - CGB IIQ
    And selects if the participant currently have health insurance? - CGB IIQ
    And selects the total combined yearly income for all the persons in participant household - CGB IIQ
    And selects the highest level of schooling participant has completed - CGB IIQ
    And on the medical history section of IIQ Survey page clicks on the forward arrow button - CGB IIQ
    And the user selects if the participant conceived using in vitro fertilization IVF - CGB IIQ
    And selects if the participant conceived through a donor egg or sperm - CGB IIQ
    And selects if the participant Preimplantation Genetic Diagnosis PGD used - CGB IIQ
    And selects option Yes if the participant is a twin or multiple birth - CGB IIQ
    And selects the option Twin for what type of birth was the participant - CGB IIQ
    And adds the information for the names of the children in the twin or multiple birth table "Bryan","L","Fraternal twin" - CGB IIQ
    And selects the option Yes for the participants biological parents blood-related to each other - CGB IIQ
    And adds "Second cousins once removed" of the participant how the biological parents blood-related to each other - CGB IIQ
    And selects how was the participant born - CGB IIQ
    And adds the probands birth weight "7" and Unit Of Measure "pounds" - CGB IIQ
    And adds the probands birth measurements "17" and "10" Numerical Value and "inches" and "inches" for Unit Of Measure - CGB IIQ
    And the user clicks the forward arrow on the cancer and benign tumor history section of IIQ Survey page - CGB IIQ
    And the user selects option Yes if participant ever been diagnosed with any cancer and or benign tumor - CGB IIQ
    And selects or adds the primary cancers or benign tumors that have been diagnosed - CGB IIQ
    And adds primary cancer or tumor information "2021","17","Baltimore Maryland","Fairfax Virginia" and selects what kind of the treatment received - CGB IIQ
    And selects Yes if the participant ever been evaluated for ANY genetic disease or syndrome? - CGB IIQ
    And selects details for the genetic evaluations that have been completed by the proband includes "Li-Fraumeni Syndrome (TP53 gene)" summarization of the evaluation and adds the information "12/19", "16", "John Hopkins Hospital, Baltimore, Maryland, United States of America", and "No genetic change found/negative test" - CGB IIQ
    And selects Yes if the participant has copy of the genetic test results and would like to upload them to this questionnaire? - CGB IIQ
    And upload the genetic test results - CGB IIQ
    And the user adds the participant height by proband "6", "feet" - CGB IIQ
    And the user adds probands weight at the indicated ages "170","180","130","170","180" and selects "pounds", "pounds", "pounds", "pounds" and "pounds" for Unit of Measurements - CGB IIQ
    And selects at what "18" was the participant at their highest weight? - CGB IIQ
    And the user adds the "14" of the participant at first menstrual period - CGB IIQ
    And adds the last menstrual period "10/2021" - CGB IIQ
    And selects the reason if participant period has not occurred for the last year or more - CGB IIQ
    And selects Yes if the participant ever been pregnant? - CGB IIQ
    And adds the participant age "18" at their first pregnancy - CGB IIQ
    And adds the number of times "4" the participant has been pregnant - CGB IIQ
    And selects Yes if the participant has ever tried to become pregnant for more than one year without success - CGB IIQ
    And selects Yes for participant ever being consulted a doctor because of difficulty in getting pregnant - CGB IIQ
    And adds "40" was participant when they first consulted a doctor about difficulty in getting pregnant - CGB IIQ
    And selects all diagnosis that was made to explain the difficulties getting pregnant - CGB IIQ
    And on the Female Hormones section of IIQ Survey page clicks on the forward arrow button - CGB IIQ
    And the user selects if participant has ever taken pills, injections or implants for birth control or for any other reason? - CGB IIQ
    And selects Yes if participant has ever prescribed female hormones for this reason? - CGB IIQ
    And adds at what "35" was participant prescribed female hormones for hormone replacement therapy? - CGB IIQ
    And adds the total amount of time the participant has taken hormone replacement therapy "43" - CGB IIQ
    Then the user lands on the "You are almost done!" page - CGB IIQ
    And the user clicks the forward arrow button - CGB IIQ
    Then the end of the IIQ survey page "EndOfSurvey" is displayed - CGB IIQ

  @Smoke @matarodriguezko
  Scenario: Male Participant (Proband) A user lands on the CHARMS
    Given the user is redirected to the log in page of the Individual Information Questionnaire - CGB IIQ
    When types the email address in the textbook labeled Email - CGB IIQ
    And types the One-time pin in the textbook labeled One Time pin - CGB IIQ
    And on the CGB Statement of Confidentiality page clicks next arrow button - CGB IIQ
    And on the CGB Instructions page clicks next arrow button - CGB IIQ
    And on the General Background Information section of IIQ Survey page clicks next arrow button - CGB IIQ
    And selects the radio button labelled I am completing this form for myself - CGB IIQ
    And selects Male as the biological sex of the participant assigned at birth - CGB IIQ
    And selects for which Sex the participant identifies as - CGB IIQ
    And selects what the participant is considered to be - CGB IIQ
    And selects the Race of the participant - CGB IIQ
    And selects if the participant is from the Ashkenazi Eastern European JewishDescent - CGB IIQ
    And selects if the participant is Adopted - CGB IIQ
    And selects Yes for the participant raised by someone other than their biological parent - CGB IIQ
    And adds Information regarding the individual who raised the participant "Richard","Grandpa" - CGB IIQ
    And adds the participant DOB in MMDDYYYY format - CGB IIQ
    And adds the Demographic information of participant "Bethesda", "Maryland", "United States" - CGB IIQ
    And selects the participant Biological Mothers Ancestral Background or add the free text for the box labelled Other SPECIFY - CGB IIQ
    And selects the participant Biological Fathers Ancestral Background or add the free text for the box labelled Other SPECIFY - CGB IIQ
    And selects the participant Familys Religious Background or add the free text for the box labelled Other SPECIFY - CGB IIQ
    And selects the participant Current Marital Status - CGB IIQ
    And adds participant "Software Engineer" - CGB IIQ
    And selects if the participant currently have health insurance? - CGB IIQ
    And selects the total combined yearly income for all the persons in participant household - CGB IIQ
    And selects the highest level of schooling participant has completed - CGB IIQ
    And on the medical history section of IIQ Survey page clicks on the forward arrow button - CGB IIQ
    And the user selects if the participant conceived using in vitro fertilization IVF - CGB IIQ
    And selects if the participant conceived through a donor egg or sperm - CGB IIQ
    And selects if the participant Preimplantation Genetic Diagnosis PGD used - CGB IIQ
    And selects option Yes if the participant is a twin or multiple birth - CGB IIQ
    And selects the option Twin for what type of birth was the participant - CGB IIQ
    And adds the information for the names of the children in the twin or multiple birth table "Bryan","L","Fraternal twin" - CGB IIQ
    And selects the option Yes for the participants biological parents blood-related to each other - CGB IIQ
    And adds "Second cousins once removed" of the participant how the biological parents blood-related to each other - CGB IIQ
    And selects how was the participant born - CGB IIQ
    And adds the probands birth weight "7" and Unit Of Measure "pounds" - CGB IIQ
    And adds the probands birth measurements "17" and "10" Numerical Value and "inches" and "inches" for Unit Of Measure - CGB IIQ
    And the user clicks the forward arrow on the cancer and benign tumor history section of IIQ Survey page - CGB IIQ
    And the user selects option Yes if participant ever been diagnosed with any cancer and or benign tumor - CGB IIQ
    And selects or adds the primary cancers or benign tumors that have been diagnosed - CGB IIQ
    And adds primary cancer or tumor information "2021","17","Baltimore Maryland","Fairfax Virginia" and selects what kind of the treatment received - CGB IIQ
    And selects Yes if the participant ever been evaluated for ANY genetic disease or syndrome? - CGB IIQ
    And selects details for the genetic evaluations that have been completed by the proband includes "Li-Fraumeni Syndrome (TP53 gene)" summarization of the evaluation and adds the information "12/19", "16", "John Hopkins Hospital, Baltimore, Maryland, United States of America", and "No genetic change found/negative test" - CGB IIQ
    And selects Yes if the participant has copy of the genetic test results and would like to upload them to this questionnaire? - CGB IIQ
    And upload the genetic test results - CGB IIQ
    And the user adds the participant height by proband "6", "feet" - CGB IIQ
    And the user adds probands weight at the indicated ages "170","180","130","170","180" and selects "pounds", "pounds", "pounds", "pounds" and "pounds" for Unit of Measurements - CGB IIQ
    And selects at what "18" was the participant at their highest weight? - CGB IIQ
    And selects how many "4" the proband has gotten a women pregnant - CGB IIQ
    And selects if Proband or Partner have sought help with fertility - CGB IIQ
    And selects all diagnosis that was made to explain the difficulties getting pregnant - CGB IIQ
    Then the user lands on the "You are almost done!" page - CGB IIQ
    And the user clicks the forward arrow button - CGB IIQ
    Then the end of the IIQ survey page "EndOfSurvey" is displayed - CGB IIQ

  @matarodriguezko
  Scenario: Female Participant (Proxy) A user lands on the CHARMS
    Given the user is redirected to the log in page of the Individual Information Questionnaire - CGB IIQ
    When types the email address in the textbook labeled Email - CGB IIQ
    And types the One-time pin in the textbook labeled One Time pin - CGB IIQ
    And on the CGB Statement of Confidentiality page clicks next arrow button - CGB IIQ
    And on the CGB Instructions page clicks next arrow button - CGB IIQ
    And on the General Background Information section of IIQ Survey page clicks next arrow button - CGB IIQ
    And selects the radio button labelled I am completing this form for someone else - CGB IIQ
    And fills out the participant "Jennifer Slogan" for whom the user is completing the IIQ form. - CGB IIQ
    And selects Female as the biological sex of the participant assigned at birth - CGB IIQ
    And selects for which Sex the participant is identified - CGB IIQ
    And selects what the participant is considered to be - CGB IIQ
    And selects the Race of the participant - CGB IIQ
    And selects if the participant is from the Ashkenazi Eastern European JewishDescent - CGB IIQ
    And selects if the participant is Adopted - CGB IIQ
    And selects Yes for the participant raised by someone other than their biological parent - CGB IIQ
    And adds Information regarding individuals who raised the participant "Joanne","Step Mother" - CGB IIQ
    And adds the participant DOB in MMDDYYYY format - CGB IIQ
    And adds the Demographic information of the participant "Bethesda", "Maryland", "United States" - CGB IIQ
    And selects the participant Biological Mothers Ancestral Background or add the free text for the box labelled Other SPECIFY - CGB IIQ
    And selects the participant Biological Fathers Ancestral Background or add the free text for the box labelled Other SPECIFY - CGB IIQ
    And selects the participant Familys Religious Background or add the free text for the box labelled Other SPECIFY - CGB IIQ
    And selects the participant Current Marital Status - CGB IIQ
    And adds the participant "Software Engineer" - CGB IIQ
    And selects if the participant currently have health insurance? - CGB IIQ
    And selects the total combined yearly income for all the persons in participant household - CGB IIQ
    And selects the highest level of schooling participant has completed - CGB IIQ
    And on the medical history section of IIQ Survey page clicks on the forward arrow button - CGB IIQ
    And the user selects if the participant conceived using in vitro fertilization IVF - CGB IIQ
    And selects if the participant conceived through a donor egg or sperm - CGB IIQ
    And selects if the participant Preimplantation Genetic Diagnosis PGD used - CGB IIQ
    And selects option Yes if the participant is a twin or multiple birth - CGB IIQ
    And selects the option Twin for what type of birth was the participant - CGB IIQ
    And adds the information for the names of the children in the twin or multiple birth table "Bryan","L","Fraternal twin" - CGB IIQ
    And selects the option Yes for the participants biological parents blood-related to each other - CGB IIQ
    And adds "Second cousins once removed" of the participant how the biological parents blood-related to each other - CGB IIQ
    And selects how was the participant born - CGB IIQ
    And adds the participants birth weight "7" and Unit Of Measure "pounds" - CGB IIQ
    And adds the participants birth measurements "17" and "10" Numerical Value and "inches" and "inches" for Unit Of Measure - CGB IIQ
    And the user clicks the forward arrow on the cancer and benign tumor history section of IIQ Survey page - CGB IIQ
    And the user selects option Yes if participant ever been diagnosed with any cancer and or benign tumor - CGB IIQ
    And selects or adds the primary cancers or benign tumors that have been diagnosed - CGB IIQ
    And adds primary cancer or tumor information "2021","17","Baltimore Maryland","Fairfax Virginia" and selects what kind of the treatment received - CGB IIQ
    And selects Yes if the participant ever been evaluated for ANY genetic disease or syndrome? - CGB IIQ
    And selects details for the genetic evaluations that have been completed by the proband includes "Li-Fraumeni Syndrome (TP53 gene)" summarization of the evaluation and adds the information "12/19", "16", "John Hopkins Hospital, Baltimore, Maryland, United States of America", and "No genetic change found/negative test" - CGB IIQ
    And selects Yes if the participant has copy of the genetic test results and would like to upload them to this questionnaire? - CGB IIQ
    And upload the genetic test results - CGB IIQ
    And the user adds the participant height by proxy "6", "feet" - CGB IIQ
    And the user adds the participant weight at the indicated ages "170","180","130","170","180" and selects "pounds", "pounds", "pounds", "pounds" and "pounds" for Unit of Measurements - CGB IIQ
    And selects at what "18" was the participant at their highest weight? - CGB IIQ
    And the user adds the "14" of the participant at first menstrual period - CGB IIQ
    And adds the last menstrual period "10/2021" - CGB IIQ
    And selects the reason if participant period has not occurred for the last year or more - CGB IIQ
    And selects Yes if the participant ever been pregnant? - CGB IIQ
    And adds the participant age "18" at their first pregnancy - CGB IIQ
    And adds the number of times "4" the participant has been pregnant - CGB IIQ
    And selects Yes if the participant has ever tried to become pregnant for more than one year without success - CGB IIQ
    And selects Yes for participant ever being consulted a doctor because of difficulty in getting pregnant - CGB IIQ
    And adds "40" was participant when they first consulted a doctor about difficulty in getting pregnant - CGB IIQ
    And selects all diagnosis that was made to explain the difficulties getting pregnant - CGB IIQ
    And on the Female Hormones section of IIQ Survey page clicks on the forward arrow button - CGB IIQ
    And the user selects if participant has ever taken pills, injections or implants for birth control or for any other reason? - CGB IIQ
    And selects Yes if participant has ever prescribed female hormones for this reason? - CGB IIQ
    And adds at what "35" was participant prescribed female hormones for hormone replacement therapy? - CGB IIQ
    And adds the total amount of time the participant has taken hormone replacement therapy "43" - CGB IIQ
    Then the user lands on the "You are almost done!" page - CGB IIQ
    And the user clicks the forward arrow button - CGB IIQ
    Then the end of the IIQ survey page "EndOfSurvey" is displayed - CGB IIQ

  @jains @E2E
  Scenario: Proxy Screener Submission with data verification
    Given a proxy is on the RASopathies Longitudinal Cohort Study login page
    And logs in via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
    And clicks on Eligibility Questionnaire to begin questionnaire
    And clicks next after reviewing the STUDY INTRODCTION
    And selects I am completing this form for someone else option
    And enters First Name "Automated", Middle Name "Middle", Last Name "Test" for What is the name of the person who may be eligible for this study?
    And enters First Name "FirstNameTest", Middle Name "MiddleNameTest", Last Name "lastNameTest" for What is your name?
    And enters "Entering Other Relationship" for What is your relationship to the participant?
    And selects Yes option for Are you the legal guardian of the participant?
    And clicks next for The next set of questions will collect basic information about the participant
    And selects participants Date of Birth from the calendar picker
    And selects Male option for participants Sex assigned at birth
    And selects Yes option for participant being adopted
    And selects Yes for participant still being alive
    And selects Yes option for participant currently living in the United States
    And enters mailing address for where study materials can be sent, street "9609 Medical Center Dr" street Optional "New Avenue Park" city "Rockville" state "Maryland" zip code "20850"
    And enters proxy email address "automatedTest@nci.gov"
    And enters proxy email address "automatedTest@nci.gov" to confirm email address
    And enters proxy home phone number "703-687-5816", cell phone number "703-687-5816", work phone number "703-687-5816" and selects cell phone number as Preferred Contact
    And selects Not Hispanic/Latino option for Ethnicity of participant
    And selects White, Black/African American, Native Hawaiian/Pacific Islander, American Indian/Alaskan Native, Asian and enters "Entering other Race" for other when selecting Race of participant
    And selects Other option and enters "LFS Study" for is the participant participated in any other research study or registry group?
    And proceeds with providing information for medical diagnosis
    And selects Feeding problems, failure to thrive, or other stomach/digestive problems option for participant being diagnosed with any of the listed conditions
    And selects Neurocognitive developmental delay such as:Intellectual disability and language impairment option for participant being diagnosed with any of the listed conditions
    And selects Skeletal deformities such as: Short stature, short webbed neck, unusual chest shape, curved spine, muscle or joint problems, limb overgrowth option for participant being diagnosed with any of the listed conditions
    And selects Head craniofacial abnormalities such as: Large head, broad or high forehead, short nose, small chin, swelling or bleeding of the gums, abnormal shape or movement of teeth option for participant being diagnosed with any of the listed conditions
    And selects Eye Ear abnormalities such as: Widely spaced eyes, eye diseases, droopy eye lids, sparse-absent eye lashes-eyebrows, low set ears, vision or hearing impairment option for participant being diagnosed with any of the listed conditions
    And selects skin/hair abnormalitiessuch as: soft loose skin, fine/thin/thick/dry/brittle/curly hair, slow growing hair, tumors or small skin tags near the nose or anus, lipomas, light to dark brown birth marks (cafe au lait spots), freckles in the armpits option for participant being diagnosed with any of the listed conditions
    And selects Heart problems such as cardiomyopathy or pulmonary valve stenosis option for participant being diagnosed with any of the listed conditions
    And selects Genital abnormalities such as undescended testes for participant being diagnosed with any of the listed conditions
    And selects Non-cancerous tumors for participant being diagnosed with any of the listed conditions
    And selects Lymphedema or participant being diagnosed with any of the listed conditions
    And selects Other such as endocrine issues, bleeding disorders, seizures, tethered cord for participant being diagnosed with any of the listed conditions
    And enters "Diagnosed with other conditions" for participant being diagnosed with any of the listed conditions
    And selects Yes option for participant being diagnosed with cancer
    And for participants primary cancers diagnosed selects cancer types "Leukemia", "Brain tumor (ie, glioma)", "Rhabdomyosarcoma", "Skin cancer (ie, melanoma)" and selects age at diagnosis for primary cancers entered for all options "20", "21", "22", "23" and year of diagnosis "2000", "2001", "2002", "2003" and selects Yes option for currently receiving treatment
    And selects Yes option for participant being diagnosed with a Rasopathy
    And selects Other and enters "Entering Other RASopathy" for selecting a specific RASopathy diagnosed of the participant
    And enters participants age in years "20" of diagnosis
    And enters participants year of diagnosis "2010"
    And proceeds with providing genetic testing information
    And selects I have no information on my biological relatives option to family members of participants having been diagnosed with a RASopathy
    And selects Yes option to participant having had genetic testing
    And selects No option to participant having a copy of genetic test results
    And selects all the option for any genetic changes detected for the following syndromes for the participant
    And the user proceeds on answering few remaining questions regarding the study
    And selects Other option and enters "Entering other option" for how did you hear about this study?
    And selects the Yes option for the participant or other family members ever participated in another study on RASopathies at another medical institution
    And provides the following information regarding previous participation in other RASopathy studies
    And for What are the main reasons for participating in this study? selects All options and for Participate in research enters "Reason one", for Identify a diagnosis enters "Reason two", for Receive genetic testing enters "Reason three", and for Other enters "Reason four"
    And proceeds with submitting the Eligibility Questionnaire
    Then the Eligibility Questionnaire is sucessfully submitted
    When a ServiceNow user navigates to CHARMS Native view and opens records that are Waiting for Elegibility Review
    And selects the submitted MyRAS screener record
    And verifies data submitted in Qualtrics is imported as expected in ServiceNow
    And verifies Personal Information data submitted in Qualtrics is imported as expected in the Family Member Details page of ServiceNow
    And verifies Demographics data submitted in Qualtrics is imported as expected in the Family Member Details page of ServiceNow
    And verifies Contact Info data submitted in Qualtrics is imported as expected in the Family Member Details page of ServiceNow
    And verifies Medical Information data submitted Qualtrics is imported as expected in the Family Member Details page of ServiceNow
    And verifies data submitted in Qualtrics is imported as expected in the RAS Referral page of ServiceNow
    And verifies Contact Info data submitted in Qualtrics is imported as expected in the RAS Referral page of ServiceNow
    And verifies Demographics data submitted in Qualtrics is imported as expected in the RAS Referral page of ServiceNow
    And verifies RASopathy History data submitted in Qualtrics is imported as expected in the RAS Referral page of ServiceNow
    And verifies Cancer History data submitted in Qualtrics is imported as expected in the RAS Referral page of ServiceNow
    And verifies Participant Cancer History data submitted Qualtrics is imported as expected in the Family Member Details page of ServiceNow
    And verifies Genetic Testing History data submitted in Qualtrics is imported as expected in the RAS Referral page of ServiceNow
    And verifies Final Information data submitted in Qualtrics is imported as expected in the RAS Referral page of ServiceNow
    And verifies Comments data submitted in Qualtrics is imported as expected in the RAS Referral page of ServiceNow
    And verifies Participant Cancer History data submitted Qualtrics is imported as expected in the Family Member Details page of ServiceNow
    And verifies Participant Genetic History data submitted Qualtrics is imported as expected in the Family Member Details page of ServiceNow
    And the ServiceNow user submits the study for eligibility review
    And the ServiceNow user marks the study eligible
    And the ServiceNow user adds comments in the history section "Sending consent form to the participant" and sends consent form
    When the myRAS user signs the consent form in the Service Portal
    When a ServiceNow user navigates to CHARMS Native view and opens records that are Awaiting PI Signature
    And selects the submitted MyRAS screener record that has signed consent form from participant attached
    And the ServiceNow user signs the consent form
