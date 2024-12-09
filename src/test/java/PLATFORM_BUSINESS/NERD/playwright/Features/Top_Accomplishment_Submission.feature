Feature: Top Accomplishments Submission

  @NERDSNOW-759 @chaudhryma @Regression @playwright
  Scenario: Test Create a 'Top Accomplishments' Record
    Given any user is on NERD
    When they access the 'NERD' Catalog
    Then they can create a record called "Top Accomplishments"
    And add attachments via the record itself
    And 'Category' Field Auto Populated with the following value "Top Accomplishments"
    And 'Rank' field is mandatory drop-down with the following options "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Not Top 10"
    And 'Fiscal Year' field is mandatory dropdown with the following options for Previous year "2023", and Current year "2024"
    And 'Title' field is mandatory short text field
    And 'DOC' field is mandatory drop down with the applicable DOCs, None (selected by default), "CBIIT", "CCCT", "CCG", "CCR", "CCT", "CGH", "CRCHD", "CRS", "CSSI", "DCB", "DCCPS", "DCEG", "DCP", "DCTD", "Frederick", "OCC", "OHAM","SBIR", "TTC"
    And 'Description' field is mandatory open HTML text field with subtext of "(3 - 4 sentences max) – please define acronyms." when hover over the Description field
    And 'Research Type/Other Programs' field is mandatory drop-down, None (selected by default), "Basic", "Cancer Control", "Epidemiological", "Health Communication Programs", "Population Science", "Research Workforce Recruitment, Training, and Retention Program", "Science Education and Literacy Programs", "Translational-Post Clinical", "Translational-Pre Clinical", "Other"
    And subtext of "Please select the most applicable" when hover over the "Research Type/Other Programs" field
    And 'Other Topics' field is an optional selection to select one or multiple via a list collector, None (selected by default), "Big Data/Data Sharing", "Moonshot", "Technology Development", "COVID-19", "Pediatric", "Research Resources and Infrastructure", "Early Detection", "Rare", "Meeting/Workshop/Conference", "Metastatic", "Training/Workforce Development", "Report/Guidelines/Policy", "Minority Health/Health Disparities", "Women's Health"
    And subtext of "Please select the most applicable" when hover over the Other Topics field
    And 'Cancer Site/Type' field is an optional selection to select one or multiple via a list collector, None (selected by default), "General Cancer/Not Specific Cancer", "Gallbladder","Melanoma", "Bladder", "Gastric/Stomach", "Multiple Myeloma", "Brain", "Glioblastoma", "Neuroblastoma", "Breast", "Head and Neck", "Ovarian", "Central Nervous System", "Kidney", "Pancreatic", "Cervical", "Leukemia", "Prostate", "Colon/Colorectal", "Liver", "Sarcoma", "Endometrial", "Lung", "Skin", "Esophageal", "Lymphoma", "Thyroid"
    And verify the subtext of "Please select a specific cancer site only if the submission is focused on the specific site" when hover over the "Cancer Site/Type" field
    And 'Collaborations' is an optional open HTML text field
    And subtext of "Indicate the ICOs / agencies / organizations involved if citing a collaboration, including who was the lead" when hover over the Collaborations field
    And 'References' is an optional short text field
    And subtext of "Please list PMIDs only, separated by commas" when hover over the References field
    And 'Other References' is short text field
    And subtext of "Please list grant numbers, websites, press release URL etc. To ensure that links are active, please add hyperlinks using the link tool (chain link icon)." when hover over the Other References field
    And 'Point of Contact' is an optional list collector field AND offers multi-selection so more than one Point of Contact can be selected
    And 'Point of Contact Email' is an optional field THAT gets populated with the email of the user selected from the Point of Contact field