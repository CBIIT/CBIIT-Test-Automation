Feature: RAS Survey Scenarios (Preview)
    This feature file contains RAS Survey submission scenarios via Qualtrics Preview

    @juarezds @RASSurveyPreview
    Scenario: RASSurvey Preview Self Submission #submit page next button has been commented out/disabled
        Given a participant is on the Rassurvey Questionaire login page - myRAS Survey
        And logs in via Okta with username "diego1@test.com" and password "123456" on login page - myRAS Survey
        And clicks on survey next button after reviewing the survey details to start on the myRAS Survey questions. page - myRAS Survey
        And clicks next button on The first block of questions will collect basic demographic information. page - myRAS Survey
        And selects I am completing this form for myself option on who is completing this form page - myRAS Survey
        And clicks YES option for Have you ever been included in a published case report or otherwise represented in a public manner by a healthcare provider or researcher? page - myRAS Survey
        And enters information about a previous cancer study "PUBLISHED IN ANOTHER CANCER STUDY" Please provide any additional information about the authors, year of publication or PubMed ID (PMID), if available. page - myRAS Survey
        And clicks Next button for The next set of questions will ask about birth and neonatal history. page - myRAS Survey
        And enters Biological Mother birth city "LOS ANGELES", select Mothers Age "23" and enters Father birth city "PUERTO VALLARTA",and selects Fathers age "26" for What was your biological parents age in Years when you were born? page - myRAS Survey
        And clicks YES Were you diagnosed with hypoglycemia (low blood sugar) during the newborn period. page - myRAS Survey
        And selects All that apply and enters in other prenatal condition "ABNORMAL BONE STRUCTURE" for Were you diagnosed with any of the following conditions during your mothers pregnancy? page - myRAS Survey
        And click YES During her pregnancy with you, did your mother have any prenatal tests to identify fetal birth defects or fetal medical problems? page - myRAS Survey
        And selects All normal results and enters other prenatal test "GENETIC" for Please indicate the results of the prenatal tests administered to your biological mother during her pregnancy with you. page - myRAS Survey
        And selects All that apply and enters mothers prenatal type of infection "FLU" prenatal type of rash "ECZEMA", other complications "STREP THROAT" for Was your biological mother diagnosed with any of the following conditions prior to or during her pregnancy with you? page - myRAS Survey
        And click YES During her pregnancy with you, did your biological mother take any medications vitamins or supplements for any reason? page - myRAS Survey
        And selects All that apply for and enters herbal supplement "OREGANO", other medication "TUMERIC", and other medication "MELATONIN" for Please select all medications your mother took during her pregnancy with you. page - myRAS Survey
        And adds details in Please provide details on the name of the medication taken reason it was taken and approximate length of time it was taken. page - myRAS Survey
        And clicks YES Did your biological mother use any tobacco products during her pregnancy with you? page - myRAS Survey
        And selects All that apply and enters other tobacco product "WAX" for What tobacco products did your biological mother use during her pregnancy with you? page - myRAS Survey
        And clicks YES Did your biological mother use any vaping products during her pregnancy with you? - myRAS Survey
        And selects All that apply and enters other vape product "ELECTRONIC CIGARS" for Which vaping products did your mother use during her pregnancy with you? Please select all that apply. page - myRAS Survey
        And clicks YES Did your biological mother drink any alcoholic beverages during her pregnancy with you? page - myRAS Survey
        And selects All that apply and enters other alcoholic beverage "ABSINTHE" for What alcoholic beverages did your mother drink during her pregnancy with you? page - myRAS Survey
        And clicks YES Did your biological mother use any recreational drugs during her pregnancy with you? page - myRAS Survey
        And selects All that apply and enters other recreational drug "HASH" for What recreational drug did your biological mother use during her pregnancy with you? page - myRAS Survey
        And clicks YES Did your biological mother ever live or work in a place where others smoked cigarettes, pipes or cigars around her during her pregnancy with you? page - myRAS Survey
        And selects All that apply and enters other products used around your mother "JUUL" for What products were used around your biological mother during her pregnancy with you? page - myRAS Survey
        And adds Please describe your biological parents occupation(s) during your mothers pregnancy with you? and enters mothers occupation "TEACHER" and enters fathers occupation "DIRECTOR" in Please list all of the occupations during the pregnancy. page - myRAS Survey
        And enters height in cm for biological mother height "150" and biological fathers height "180" in What is the height of your biological mother and father? page - myRAS Survey
        And clicks next The next set of questions will ask about hormone-related growth. Growth is influenced by many things including nutrition, parental height/genetics and secreted hormones that tell the body to grow taller. page - myRAS Survey
        And clicks YES Have you ever been evaluated by an endocrinologist for any reason? These are doctors that specialize in the endocrine system, which is made up of many glands that secrete hormones. Hormones play a role in many things in the body including growth, metabolism and salt regulation. Endocrinologists often diagnose conditions such as diabetes and thyroid problems. page - myRAS Survey
        And enters Endocrinologist medical provider name "DOCTOR GERALDINE TZU", medical provider city, state, country "ASHBURN, VA, UNITED STATES", hospital or medical affiliation "INOVA" in What is the name of the endocrinologist who completed your examination? page - myRAS Survey
        And clicks YES Have you ever had growth hormone testing? page - myRAS Survey
        And selects All options that apply enters other hormone testing "ADRENALINE OR EPINEPHRINE" for What were the results of your growth hormone testing? page - myRAS Survey
        And clicks YES Have you ever received growth hormone treatment? page - myRAS Survey
        And enters height before growth hormone treatment "5.5 Feet" for What was your height before starting growth hormone? page - myRAS Survey
        And selects number of growth hormone treatment "3" for How many times have you received growth hormone treatment? page - myRAS Survey
        And adds details in Please provide the details of growth hormone replacement by completing the table below. page - myRAS Survey
        And clicks Next button The next set of questions will ask about development. Development includes things such as crawling walking and speaking understanding language. page - myRAS Survey
        And clicks YES Were you ever diagnosed with hypotonia as an infant or child? This is often described as unusually low muscle tone or floppy muscle tone. page - myRAS Survey
        And clicks twelve-eighteen months option At what age were you able to sit without support? page - myRAS Survey
        And clicks twelve-eighteen months option At what age were you able to walk without support? page - myRAS Survey
        And clicks YES Have you ever received physical therapy? page - myRAS Survey
        And clicks twenty-four to thirthy-six months option At what age were you able to use simple two-word phrases? page - myRAS Survey
        And selects Simple speech compared to people of the same age How would you describe your current speech capabilities? page - myRAS Survey
        And clicks YES Have you ever received speech therapy? page - myRAS Survey
        And clicks Severe Cognitive Delay Between the ages of three and six years old preschool years, were you ever diagnosed with issues of cognitive development? Cognitive development can include difficulties in learning, understanding, andprocessing information or making decisions. page - myRAS Survey
        And clicks YES Didyou receive occupational therapy between three and six years of age? Occupational therapy is based on engagement in activities of daily life (such as self-care skills, education, work, or social interaction). page - myRAS Survey
        And clicks Attended typical elementary school without support Between the ages of six and ten (elementary school age)Please select the option that best describes your schooling. page - myRAS Survey
        And clicks Attended typical elementary school without support Between the ages of ten and seventeen (middle and high school age) please select the option that best describes your schooling. page - myRAS Survey
        And clicks Bachelors degree four-year college with BA, BS, AB, Please indicate the highest degree or level of schooling you have completed. page - myRAS Survey
        And click Working full time What is your current employment status? page - myRAS Survey
        And clicks All that apply and enters other learning differences "DYSGRAPHIA" for if other Have you ever been diagnosed with any of the following learning differences? page - myRAS Survey
        And clicks Next button If you have ever had formal IQ testing and have a copy, please upload it here. page - myRAS Survey
        And clicks Next button The next set of questions will ask about medical conditions associated with the heart. page - myRAS Survey
        And clicks YES Have you ever been evaluated by a cardiologist? These are doctors that specialize in the heart. Cardiologists often diagnose conditions such as an irregular heart beat, an enlarged heart, and heartdefects. page - myRAS Survey
        And enters name of Cardiologist doctor "DOCTOR RUSS JUNIOR", and enters Location "WASHINGTON DC, USA" ,and enters for Hospital "G.W. HOSPITAL" for What is the name of the cardiologist who completed your heart evaluation? page - myRAS Survey
        And clicks YES Have you ever been diagnosed with any structural heart issue(s)? page - myRAS Survey
        And clicks All that apply and enters "GIANT HEART" for Have you been diagnosed with any of the following structural heart issues? Structural issues affect how the heart is shaped. page - myRAS Survey
        And clicks All that apply for Have you ever had any of the following symptoms? page - myRAS Survey
        And enters all details for all symptom occurences and where and when they were evaluated for Please complete the table below for the following symptoms, indicating when these symptoms occurred and where these symptoms wereevaluated. You only have to provide the age or date for each symptom. If you dont recall when the symptom first started or when it most recently occurred, place an X under dont know. page - myRAS Survey
        And clicks YES Have you ever received treatment for heart problems? Some examples include: medication, catheter intervention, and surgery. page - myRAS Survey
        And select All that apply and enters for medication "BENAZEPRIL" and enters for other treatment "HEART EXAM" for Have you ever had any of the following treatments for heart problems? page - myRAS Survey
        And enters all details for Please complete the table below by providing information for the FIRST treatment and the MOST RECENT treatment. You only need to provide the age at which symptoms occurred or date (not both). If you donot recall the details, please place an X in the Dont know box. page - myRAS Survey
        And clicks YES button Are you still on? page - myRAS Survey
        And clicks YES button Have you ever been diagnosed with any functional heart issue(s)? page - myRAS Survey
        And clicks All that apply and enters other functional heart issues "GIANT HEART" for Have you ever been diagnosed with any of the following functional heart issues? page - myRAS Survey
        And enters all details for Please provide any details known for the condition(s) for which you have been diagnosed. For each condition, you need to provide either the age or date at which the condition occurred (not both). If you do not know or cannot recall, place an X in the Dont know box. For each condition, also provide any information regarding treatment. If none, please state None in the treatment. page - myRAS Survey
        And clicks Next button The next two questions will ask about RASopathy diagnoses. page - myRAS Survey
        And clicks YES button Have you been diagnosed with a RASopathy by a physician or through genetic testing? page - myRAS Survey
        And clicks All that apply and enters other RASopathies "CAPILLARY MALFORMATION-ARTERIOVENOUS MALFORMATION SYNDROME" for Please indicate if you have been diagnosed with any of the following RASopathies? page - myRAS Survey
        And clicks Next button The next set of questions will ask about general medical history. page - myRAS Survey
        And clicks YES Do you have a primary care provider? A primary care provider is a health professional (doctor, physician assistant, nurse practitioner) for which you go to for routine care. Examples of routine care include immunizations/vaccines, annual or sports physicals, or to treat common minor illnesses, such as sinus or ear infections. page - myRAS Survey
        And enters name of Primary Care medical provider "DOCTOR GEORGE PEABODY" and enter for location "FAIRFAX" and enters hospital "INOVA" for Please provide the information for your primary care provider below. page - myRAS Survey
        And clicks YES to all allergies for Please indicate in the table below if you have allergies to the listed items. We will ask about the specifics of these allergies in later questions. page - myRAS Survey
        And clicks + sign to add Medication "TYLENOL" and enters for allergic reaction "RASH" for Please complete the table below for all medications to which you are allergic. page - myRAS Survey
        And clicks + sign to add first food allergy "MILK" and enters allergic reaction "RASH" and clicks + sign for second food allergy "NUTS" and enters allergic reaction "HIVES" for Please complete the table below for all Foods to which you are allergic. page - myRAS Survey
        And clicks + sign to add other allergy "MOSQUITO BITES" and enters "ITCHING" for allergic reaction and clicks + sign for second allergy "BEE STINGS" and enters	"SWELLING OF THE THROAT" for items to which you are allergic that were notincluded in medication or food allergies. page - myRAS Survey
        And clicks YES button Have you ever had an operation or biopsy? page - myRAS Survey
        And clicks + sign to add type of surgery "C SECTION" and enters age for surgery "20" and selects reason for surgery "Childbirth" and enters hospital name "INOVA, ARLINGTON, VA, USA" in Please provide the information for eachbiopsy and surgery in the table below. To add a surgery or biopsy, click on the + button located in the upper left corner of the table. page - myRAS Survey
        And clicks YES button Have you ever been hospitalized for any reason other than a surgery or childbirth? page - myRAS Survey
        And clicks + sign to add reason for hospitalization "LONG TERM BLOODY NOSE" and enters when it occureed "9 NOVEMBER 2020" and enters hospital "INOVA, FAIRFAX, VA, USA" for Please provide the information for eachhospitalization in the table below. To add a new hospitalization, please click on the + sign in the upper left corner of the table. page - myRAS Survey
        And clicks Next button The next set of questions will ask about GI(gastrointestinal) symptoms or conditions. page - myRAS Survey
        And clicks YES button Have you ever been evaluated by a gastroenterologist? These are doctors that specialize in the GI tract and liver. The GI tract includes your esophagus, stomach, small intestine, large intestine/colon, liver and pancreas. page - myRAS Survey
        And enters Gastroenterologist doctors name "DOCTOR PHIL VOSS" and enters city, state "FAIRFAX, VA" then enters hospital "INOVA" for Please provide the details for the gastroenterologist who completed the evaluation. page - myRAS Survey
        And clicks All that apply and enters other feeding difficulties "TROUBLE SWALLOWING" for Have you ever been diagnosed with any of the following feeding difficulties? These issues often include problems eating food by mouth or keeping food from being vomited. page - myRAS Survey
        And clicks age and enters amount of time "10 DAYS" for At what age was the nasogastric or nasojejunal tube placed? page - myRAS Survey
        And clicks age and enters amount of time "20 DAYS" for At what age was the gastrostomy (G-tube) or gastrostomy-jejunostomy (GJ) tube placed? page - myRAS Survey
        And clicks age and enters amount of time "30 DAYS" for At what age was the gastrostomy (G-tube) or gastrostomy-jejunostomy (GJ) tube removed? page - myRAS Survey
        And click YES button Have you ever had any physical symptoms that likely involved your gastrointestinal (GI) system? There are many symptoms that are connected to the GI system. page - myRAS Survey
        And clicks All that apply Which of the following symptoms related to the GI system have occurred? page - myRAS Survey
        And clicks All previous resolved symptom for let us know if the symptoms listed below were previous symptoms or current (ongoing) symptoms. page - myRAS Survey
        And clicks YES for All for Did choking/gagging ever lead to. page - myRAS Survey
        And click YES for All that apply and enters heartburn symptoms at age "20" and enters heartburn medication "TUMS" for Please complete the Testing Docs table below regarding heartburn/reflux symptoms. page - myRAS Survey
        And click YES for All and enters nausea symptoms at age "12" and enters medication "PEPTOBISMOL" for Please complete the table below regarding nausea symptoms. page - myRAS Survey
        And clicks YES for ALL for Please complete the next set of questions regarding abdominal pain. page - myRAS Survey
        And clicks YES button Have any medications ever been taken for abdominal pain? page - myRAS Survey
        And selects abdominal medication amount "2" for How many medications have been taken for abdominal pain. page - myRAS Survey
        And enters abdominal pain details at age "18" and enters medication "ADVIL" and enters "LASTS 45 MINUTES AT A TIME" for Please complete the table below regarding the medications taken for abdominal pain to the best of your ability. page - myRAS Survey
        And clicks YES button for all Please complete the next set of questions regarding vomiting. page - myRAS Survey
        And clicks YES button for Has any medication ever been taken for vomiting? page - myRAS Survey
        And selects vomiting medication amount "2" for How many medications have been taken for vomiting? page - myRAS Survey
        And enters vomiting details at age "16" and enters medication "PEPTOBISMOL" and enters second age "16" for second medication "IMODIUM" for second medication for Please complete the list below by describing any medications taken for vomiting and the age when these medications were taken. page - myRAS Survey
        And selects all symptoms for Have any of the following symptoms occurred four or more days/month for at least two months? Select all that apply. page - myRAS Survey
        And enters amount of time "1 DAY" for when jaundice occured and enters "2 DAYS" for how long jaundice lasted for Please answer the below questions regarding jaundice (yellowing of the skin). page - myRAS Survey
        And clicks YES Do you take a lactose supplement? page - myRAS Survey
        And enters avoided foods "EGGS" for foods you avoid in Describe foods that you avoid because you do not like the texture or other physical qualities of the food. page - myRAS Survey
        And clicks YES button for all for Please answer the next two questions about diarrhea. page - myRAS Survey
        And enters amount of episodes "2 A DAY" for episodes in a day and enters "TUMS" for medication used and enters "12" for age when medication was taken in Please complete the table below regarding diarrhea. If medications have never been used, please put N/A in the box. page - myRAS Survey
        And clicks YES for All for Please complete the table regarding constipation. page - myRAS Survey
        And enters medication "ADVIL" for medication and enters "16" for age in Please complete the table below regarding encopresis. If medications have never been used, please put N/A in the box. page - myRAS Survey
        And enters weight "20 POUNDS" for weight lost and enters "30 DAYS " for over period of time where loss of weight occured and enters "YES" for gained back weight in Please complete the table below regarding weight loss. page - myRAS Survey
        And clicks YES for All and clicks all checkboxes regarding supplemental nutrition for Please complete the information below regarding decreased appetite. page - myRAS Survey
        And clicks YES. Are you toilet trained? page - myRAS Survey
        And selects toilet trained age "2" for At what age (approximately) were you toilet trained? page - myRAS Survey
        And clicks YES for ALL for Please complete the information below regarding urination. page - myRAS Survey
        And clicks YES for ALL for Please complete the information below regarding bowel movements. page - myRAS Survey
        And selects bowel movement per week amount "2" for How many bowel movements do you have per week? page - myRAS Survey
        And selects longest amount of time since last bowel movement "2 days" What is the longest amount of time that has passed without you having a bowel movement? page - myRAS Survey
        And clicks type one for Please use the Bristol Stool Chart shown below and select the choice that best represents what typical bowel movements look like. page - myRAS Survey
        And clicks YES for Have you ever had a procedure, test or study to evaluate your gastrointestinal (GI) system? page - myRAS Survey
        And selects All and enters for other GI test "ANAL FISSURES EXAM" Please indicate which of the following procedures have been performed. page - myRAS Survey
        And enters all details for Please provide the information below for the first procedure of each kind that was performed. page - myRAS Survey
        And clicks Next button for The next set of questions ask about breathing and the lungs. page - myRAS Survey
        And clicks YES button for Have you ever had an evaluation by a pulmonologist? page - myRAS Survey
        And enters Name of Pulmonologist Physician "DOCTOR LEE VOSS", and enters hospital Location "MONROVIA, MD, USA" and enters Hospital name "HOLLYCROSS" for Please provide the information below for the pulmonologist who completed your evaluation. page - myRAS Survey
        And clicks YES button for Have you ever had wheezing or whistling in your chest? page - myRAS Survey
        And clicks YES button for Has a doctor diagnosed you with reactive airway disease or asthma? page - myRAS Survey
        And clicks YES button for Have you ever been seen in the emergency room for a breathing problem? page - myRAS Survey
        And clicks YES button. Have you ever been admitted to the hospital for a breathing problem? page - myRAS Survey
        And clicks Next button for The next set of questions will ask about oral health and dental history. page - myRAS Survey
        And clicks YES button for Do you receive regular dental care? page - myRAS Survey
        And enters name of Dentist "DOCTOR DEAN ROY" and enters location "ARLINGTON, VA", and enters Medical Center "INOVA" for Please provide the information below for where dental care is received. page - myRAS Survey
        And enters last dentist visit date "12/21/2012" for when did you last visit a dentist? Please use format month/year as MM/YY. page - myRAS Survey
        And clicks cleaning for What was the reason for your last dental visit? page - myRAS Survey
        And clicks YES button for Do your gums bleed regularly with tooth brushing now? page - myRAS Survey
        And click YES button for Do your teeth or gums hurt regularly? page - myRAS Survey
        And click YES button for Do you have periodontal or gum disease? page - myRAS Survey
        And clicks YES button for Have you had dental sealants placed? page - myRAS Survey
        And clicks YES button for Do you currently have cavities? page - myRAS Survey
        And clicks YES button for Have you previously had any dental fillings? page - myRAS Survey
        And clicks YES button for Does your mouth usually feel dry? page - myRAS Survey
        And clicks Fair button for Overall, how would you rate the overall health of your teeth and gums? page - myRAS Survey
        And clicks Fair button for Overall, how would you rate your dental hygiene routine (regular tooth brushing, flossing, and your home oral mouth rinse)? page - myRAS Survey
        And clicks YES button for Have you had any changes in your sense of smell (NOT related to a diagnosis of COVID)? page - myRAS Survey
        And clicks YES button for Have you had any changes in your sense of taste (NOT related to a diagnosis of COVID)? page - myRAS Survey
        And clicks YES button for Do you have jaw or temporomandibular joint pain? page - myRAS Survey
        And clicks YES button for Do you have frequent headaches? page - myRAS Survey
        And clicks YES button for Have you had any orthodontic treatment? page - myRAS Survey
        And clicks YES button for Have you had a palatal expansion? page - myRAS Survey
        And clicks YES button for Have you had any facial or dental trauma? page - myRAS Survey
        And clicks YES button and enters dental surgery "ROOT CANAL" for Did the facial or dental trauma require surgery? page - myRAS Survey
        And clicks YES button Have you had elective jaw surgery? page - myRAS Survey
        And clicks YES button enters mouth or jaw cancer "SQUAMOUS CELL CARCINOMA" for Do you have a history of cancer in the mouth or jaw? page - myRAS Survey
        And clicks YES button enters jaw abnormality "SMALL UPPER JAW" for Do you have a family member with a jaw abnormality? page - myRAS Survey
        And clicks YES button Do you have any numbness in or around your mouth? page - myRAS Survey
        And clicks YES button Do you have any mouth sores? page - myRAS Survey
        And clicks YES button Do your teeth feel sensitive to hot or cold foods? page - myRAS Survey
        And clicks YES button Do you have problems moving your lips, tongue or mouth? page - myRAS Survey
        And clicks YES button enters unusual dental condition "EXTRA TEETH" for Is there anything unusual about your teeth or mouth extra teeth, missing teeth, severe dental diseases, jawbone problems, enamel problems, etc.? page - myRAS Survey
        And clicks Occasionally for Have you had trouble pronouncing any words because of problems with your teeth, mouth or dentures? page - myRAS Survey
        And clicks Occasionally for Have you felt that your sense of taste has worsened because of problems with your teeth, mouth or dentures? page - myRAS Survey
        And clicks Occasionally for Have you had painful aching in your mouth? page - myRAS Survey
        And clicks Occasionally for Have you found it uncomfortable to eat any foods because of problems with your teeth, mouth or dentures? page - myRAS Survey
        And clicks Occasionally for Are you self-conscious because of your teeth, mouth or dentures? page - myRAS Survey
        And clicks Occasionally for Have you felt tense because of problems with your teeth, mouth or dentures? page - myRAS Survey
        And clicks Occasionally Has your diet been unsatisfactory because of problems with your teeth, mouth or dentures? page - myRAS Survey
        And clicks Occasionally Have you had to interrupt meals because of problems with your teeth, mouth or dentures? page - myRAS Survey
        And clicks Occasionally Have you found it difficult to relax because of problems with your teeth, mouth or dentures? page - myRAS Survey
        And clicks Occasionally Have you been a bit embarrassed because of problems with your teeth, mouth or dentures? page - myRAS Survey
        And clicks Occasionally Have you been irritable with other people because of problems with your teeth, mouth or dentures? page - myRAS Survey
        And clicks Occasionally Have you had difficulty doing your usual jobs because of problems with your teeth, mouth or dentures? page - myRAS Survey
        And clicks Occasionally Have you felt that life in general is less satisfying because of problems with your teeth, mouth or dentures? page - myRAS Survey
        And clicks Occasionally Have you been totally unable to function because of problems with your teeth, mouth or dentures? page - myRAS Survey
        And clicks Next button The next set of questions ask about fluid balance and if any fluid builds up throughout the body. page - myRAS Survey
        And clicks YES button for Have you ever been diagnosed with a lymphatic system issue? Some examples include: neonatal lymphedema, lymphedema, congenital chylothorax, pleural effusion/chylothorax, and lymphangioma. page - myRAS Survey
        And clicks All and enters for other lymphatic condition "POOR LYMPHATIC DRAINAGE" for Have you ever been diagnosed with any of the following lymphatic system issues? The lymphatic system is a network of vessels and nodes (lymph nodes) that carry a fluid called lymph throughout our bodies. Lymph helps the body fight infection. Please select all that apply. page - myRAS Survey
        And enters all details for Please complete the table below to the best of your ability about the onset of symptoms, when you were diagnosed and if any procedures or medications were undertaken. page - myRAS Survey
        And click Next button for The next set of questions will ask about the kidneys. page - myRAS Survey
        And clicks YES button Start Have you ever been evaluated by a nephrologist? These are doctors that specialize in the kidneys.They often diagnose conditions related to kidney function and help people get dialysis if their kidneys are not working well. page - myRAS Survey
        And enters name of Neuphrologist doctor "DOCTOR LAUREN RODNEY", and enters City "ARLINGTON, VA" and enters Hospital "INOVA" for Please list the information below for the nephrologist who completed your evaluation. page - myRAS Survey
        And clicks YES button for Have you ever been diagnosed with a kidney problem? Some examples include: minor issues with kidney shape, underdeveloped kidney, missing kidney, or swollen kidney. page - myRAS Survey
        And clicks All that apply and enters other kidney problem "KIDNEY DISEASE" Have you ever been diagnosed with any of the following kidney problems? Please select all that apply. page - myRAS Survey
        And enters All details for Please complete the table below to the best of your ability regarding date of onset of symptoms, diagnosis and if any medications or procedures were undertaken. page - myRAS Survey
        And clicks Next button for The next set of questions ask about hair and skin qualities. page - myRAS Survey
        And clicks Yes button for Have you ever been evaluated by a dermatologist? Dermatologists are physicians who specialize in conditions of the skin. They diagnose and treat a range of conditions such as melanoma, acne, and hemangiomas. page - myRAS Survey
        And enters name of Dermatologist Physician "DOCTOR DERMA CLOONEY" and enters city/state "WASHINGTON, DC" and enters Hospital "G.W. HOSPITAL" for Please provide the information below for the dermatologist who completed your evaluation. page - myRAS Survey
        And clicks all and enters other hair condition "THICK HAIR" for Please choose the best term(s) to describe your hair. Please select all that apply. page - myRAS Survey
        And clicks YES button for Is the texture or amount of your hair similar to biological family members, such as your mother, father, sibling, and children? page -  myRAS Survey
        And clicks All that apply and enters other skin issue "VITILIGO" for Have you ever been diagnosed with any of the following issues involving patches of thickened skin, also known as hyperkeratotis skin? Please select all that apply. page - myRAS Survey
        And clicks All that apply and enters other pigmented skin issue "ALBINISM" for Do you have any of the following pigmented skin findings? Select all that apply. page - myRAS Survey
        And clicks Three or more hemangiomas for Do you have any hemangiomas? Hemangiomas are bright red marks on the skin made up of blood vessels, which may appear as a mass or lump. A hemangioma may appear in infancy or childhood and fade over time. page - myRAS Survey
        And clicks All that apply and enters other skin tumor "BENIGN TUMOR" for Have you ever been diagnosed with any of the following skin tumors? Please select all that applyfor this page. page - myRAS Survey
        And clicks Next button for The next set of questions ask about skeletal conditions. Skeletal conditions involve the bones throughout the body page. page - myRAS Survey
        And clicks YES button for Have you ever been evaluated by an orthopaedic surgeon? Orthopaedic surgeons are doctors who specialize in the bones and muscles. They diagnose and treat a range of conditions including broken bones, osteosarcoma, and torn ligaments. page - myRAS Survey
        And enters Name of Orthapaedic Physican "DOCTOR BASHIR ZIKRIA" and enters Location "BETHESDA, MD" and enters Hospital "JOHNS HOPKINS" for Please provide the details below for the orthopaedic surgeon who completed your evaluation. page - myRAS Survey
        And clicks All that apply and enters other skeletal condition "RICKETS" for Have you been diagnosed with any of the following skeletal findings in the thoracic area? The thoracic area includes the chest and ribs. page - myRAS Survey
        And clicks YES button for Do you have any issues with curving of the spine? This would often be diagnosed or evaluated by an orthopaedic surgeon. Examples include scoliosis and kyphosis. page - myRAS Survey
        And clicks All that apply and enters other spine condition "ARTHRITIS OF THE SPINE" for Have you ever been diagnosed with any of the following types of curvature of the spin. page - myRAS Survey
        And enters all details for Please complete the table below for each of the spine issues listed. For each condition, please indicate your age or date when they occurred (you do not need to include both). If you do not recall the details, place	an X in the column Dont know. For the treatment column, if no treatment was	required, please write None. page - myRAS Survey
        And clicks YES button for Has your neck been described as short or webbed? Individuals with a short, webbed neck may have a low hairline or extra skin where the neck meets the shoulders. Page - myRAS Survey
        And clicks YES button for Have you ever been diagnosed with joint issues? These conditions are often diagnosed by neurologists, rheumatologists and orthopaedic surgeons. Examples include ulnar deviation, Achilles tendon contracture, hip dysplasia. page - myRAS Survey
        And clicks ALL that apply and enters other joint issue "GOUT" for Have you ever been diagnosed with the following joint issues page? page - myRAS Survey
        And enters all details for Please complete the table below for each of the joint issues listed. For each condition, please include the date or age when symptoms first occurred and date or age at diagnosis (you do not need to include both the date and age). If you do not recall the details, please place an X in the column Dont know. If no treatment was required, please put None in the Treatment column. page - myRAS Survey
        And clicks Next button for The next set of questions ask about blood disorders. Blood disorders include immune system problems white blood cells or bleeding clotting issues platelets or other bone marrow problems where white blood cells, red blood cells and platelets are produced. page - myRAS Survey
        And clicks YES button for Have you ever had an evaluation by a hematologist or oncologist? Hematologists are physicians who specialize in the blood system, including white blood cells, platelets, red blood cells and clotting factors. Oncologists are physicians who specialize in cancer. page - myRAS Survey
        And enters Name of Hematologist Physican "DOCTOR LILY KING" and enters Location "ARLINGTON, VA",and enters Hospital "INOVA" for Please provide the information below for the hematologist/oncologist who completed your evaluation. page - myRAS Survey
        And clicks YES button for Do you have issues with bleeding or bruising? Examples include easy bruising, poor blood clotting. These conditions are often evaluated and diagnosed by a hematologist (a physician who specializes in the blood). page - myRAS Survey
        And clicks All that apply and enters other blood issue "ANEMIA" for Do you have any of the following issues with bleeding or bruising? Please select all that apply. page - myRAS Survey
        And enters All details for Please complete the table below for each of the bleeding bruising issues listed. For each condition, please provide your age or date when symptoms first started and at diagnosis, you only need to provide date or age, but not both. If you do not recall the details, please place an X in the Dont know column. If no treatment was required, please write None in the treatment column. page - myRAS Survey
        And clicks YES button for Do you have any known blood disorders or symptoms of blood disorders? Examples include an enlarged spleen, leukemia, low plateletsor low blood cells. page - myRAS Survey
        And clicks All that apply and enters other leukemia condition "CHRONIC LYMPHOCYTIC LEUKEMIA" and other blood condition "FACTOR V DEFICIENCY" in Have you ever been diagnosed with any of the following blood disorders or symptoms of blood disorders? Please select all that apply. page - myRAS Survey
        And enters All details for Please complete the table below for each of the blood disorders issues listed. For each condition listed, please include either your age or date of symptoms and diagnosis (you do not need to include both date and age). If you do not recall the details, please place an X in the column Dont know. If no treatment was required, please write None in the Treatment column. page - myRAS Survey
        And clicks All that apply and enters other tumor condition "BRAIN TUMOR" for Have you ever been diagnosed with any of the following tumors? Please select all that apply. page - myRAS Survey
        And enters All details for Please complete the table below for each of the tumors listed. Please include your age or date when symptoms first started and diagnosis you do not need to include both age and date. If you do not recall the details, please place an X under the Dont know column. page - myRAS Survey
        And clicks YES button for Do you have a history of frequent infections (typically recurrent sinus infections or pneumonia) or immunodeficiency? page - myRAS Survey
        And clicks YES button for Have you ever been evaluated by an immunologist or rheumatologist? These are physicians who specialize in the immune system and how it functions. They diagnose conditions such as lupus, autoimmune thyroiditis, and psoriasis. page - myRAS Survey
        And enter Name of Immunologist Physican "DOCTOR JOSE MORENO" and enters Location "DECATUR, GA" and enters Hospital "GEORGIA REGIONAL HOSPITAL" for Please provide the name of the immunologist/rheumatologist who completed your evaluation. page - myRAS Survey
        And clicks All and enters for other infection frequency "FREQUENT INFECTIONS IN ADULTHOOD" for How would you describe infection frequency and your immune system? Please select all that apply. page - myRAS Survey
        And enters All details for Please complete the table below for each of the immunodeficiencies listed. For each, please provide the date or age at which symptoms occurred and diagnosis (you do not need to include both age and date). If you do not recall details, please place an X in the Dont know column. If no treatment has been required, place None in the Treatment column. page - myRAS Survey
        And clicks YES button for Have you ever been diagnosed with an autoimmune disorder? An autoimmune disorder is when the immune system attacks the bodys own healthy tissues; can include Hashimoto thyroiditis, lupus, or autoimmune thrombocytopenia, etc. page - myRAS Survey
        And clicks All that apply and enters autoimmune blood condition "VASCULITIS" and enters for other "GULLAIN-BARRE SYNDROME" for With what autoimmune disorder have you been diagnosed? page - myRAS Survey
        And enters All details for Please complete the table below for each of the autoimmune conditions listed below. Please provide the date or age when symptoms first occurred and diagnosis, you do not need to include both age and date. If you do not recall the details, please place an X in the Dont know box. If no treatment was required, please state None in the Treatment column. page - myRAS Survey
        And clicks Next button for The next set of questions ask about conditions associated with the central nervous system. The central nervous system includes the brain and spinal cord. page - myRAS Survey
        And clicks YES button for Have you ever been evaluated by a neurologist or neurosurgeon? These are physicians who specialize in the brain and spinal cord. They diagnose conditions such as seizures, brain tumors, and brain malformations. page - myRAS Survey
        And enters Name of Neurologist Physican "DOCTOR JENNIFER LOPEZ" and enters Location "MAIMI, FL" and enters Hospital "MERCY HOSPITAL" for Please provide the information for the neurologist or neurosurgeon who completed your evaluation. page - myRAS Survey
        And clicks YES button for Have you ever been diagnosed with a structural brain abnormality? Examples include Chiari one malformation, hydrocephalus, tethered spinal cord. These conditions are often diagnosed using a CT or MRI scan and evaluated by neurosurgeons. page - myRAS Survey
        And clicks All that apply and enters brain issue "DIMENTIA" for Have you ever been diagnosed with any of the following issues of the brain? page - myRAS Survey
        And enters All details for Please complete the table below for each of the conditions listed. For each condition, please list either the date or age when the symptoms started and time of diagnosis (you do not need to include both age and date). If you do not recall, place an X in the Dont know column. page - myRAS Survey
        And clicks YES button for Do you have a history of seizures page? page - myRAS Survey
        And clicks All that apply and enters seizure type "MYOCLONIC SEIZURES" for Please select all seizure disorders for which you have been diagnosed. page - myRAS Survey
        And enters All details for Please complete the table below for each of the conditions listed. For each condition, please include the age or date when symptoms occurred and when diagnosed (you do not need to include both age and date). If you do not recall, please place an X in the Dont know box. page - myRAS Survey
        And clicks YES button for Have you ever been evaluated by a psychiatrist, psychologist or behavioral pediatrician? These medical providers often diagnose conditions such as depression, anxiety, learning difficulties, and developmental disorders. page - myRAS Survey
        And enters Name of Behavioral Physican "DOCTOR BRAD PITT" and enters Location "WASHINGTON, DC" and enters hospital "G.W. HOSPITAL" for Please provide the information listed below for the medical providers who completed your evaluation. page - myRAS Survey
        And clicks YES button for Have you ever been diagnosed with a behavioral or psychiatric condition? Examples include mood disorders (depression), self-harm acts, anxiety, bipolar disorder, autism spectrum disorder, aggression. page - myRAS Survey
        And clicks All that apply and enters other behaviorial condition "ASPERGERS" for Have you ever been diagnosed with a behavioral or psychiatric condition? page - myRAS Survey
        And enters All details for Please complete the table below for each of the diagnosed behavioral and/or psychiatric conditions listed. For each condition, please list the date or age of symptom onset and diagnosis (you do not need to include both age and date). If you do not recall, please place an X in the Dont know box. If no treatment was required, place None in the Treatment column. page - myRAS Survey
        And enters neurologic conditions and enters other neurologic condition "ATAXIA" for Please list and describe any additional neurologic conditions here that were not covered by the previous questions. page - myRAS Survey
        And clicks Next button for The next set of questions ask about vision and hearing page. page - myRAS Survey
        And clicks YES button for Have you ever been diagnosed with ptosis (droopiness of the upper eyelid)? page - myRAS Survey
        And clicks YES button for Did you require treatment for ptosis? page - myRAS Survey
        And clicks YES button for Have you ever had any issues with your vision or eyesight? page - myRAS Survey
        And clicks All that apply and enters for other vision condition "GLAUCOMA" for Please select all the vision/eyesight conditions for which you have been diagnosed. page - myRAS Survey
        And enters All details for Please complete the table below for each of the conditions listed. For each condition, please list the age or date when symptoms first started and when the diagnosis was made you do not need to include both date and age. If you do not recall, place an X in the Dont know column. If no treatment was required, place None in the Treatment column. page - myRAS Survey
        And clicks YES button for Have you ever experienced strabismus? Strabismus is when the eyes are not aligned properly; one may wander up, down or sideways. page - myRAS Survey
        And enters strabismus first symptoms date "03/13" and enters age "23" and enters diagnosis date "04/14" and enters age "24" and clicks occlusion treatment for Please complete the table below regarding strabismus. Please list the age or date when symptoms first started and when the diagnosis was made (you do not need to include both date and age). If you do not recall, place an X in the Dont know column. If no treatment was required, place None in the Treatment column. page - myRAS Survey
        And clicks YES button for Have you ever experienced nystagmus? Nystagmus is when the eye makes sudden, uncontrolled movements, like tremors. page - myRAS Survey
        And enters nystagmus first symptoms date "05/09" and enters age "11" and enters diagnosis date "06/13" and enters age "15" and clicks yes treatment mild shorterm severity for Please complete the table below regarding nystagmus. Please include the age or date when symptoms first occurred and when the diagnosis was made you do not need to include both age and date. page - myRAS Survey
        And clicks YES button for Have you experienced hearing loss? page - myRAS Survey
        And clicks All that apply and enters other hearing loss "SEVERE HEARING LOSS" for Have you experienced any of the following types of hearing loss? page - myRAS Survey
        And enters for other hearing loss "SEVERE HEARING LOSS" and clicks YES for all treatment and enters All details for Please complete the table below for each of the conditions listed. For each condition, please list the age or date when symptoms first occurred and when the diagnosis was made you do not need to include both age and date. If you do not recall the details, place an X in the Dont know column. page - myRAS Survey
        And select All that apply and enters other ear issue "INNER EAR INFECTION" for Do you have any of the following issues with your ears? page - myRAS Survey
        And enters other health issue "FOREIGN ACCENT SYNDROME" for If there are any other health issues present that have not been captured by this survey page. page - myRAS Survey
        And clicks Next button to end survey for You are almost done! To submit your responses, you must continue in the questionnaire by clicking the forward arrow below. The information you have provided will be reviewed by our study team. In the meantime, you should receive an email confirming this submission. page - myRAS Survey


    @juarezds @RASSurveyPreview @Progression
    Scenario: RAS Survey Proxy Scenario  #submit page next button has been commented out/disabled
        Given a participant is on the Rassurvey Questionaire login page - myRAS Survey
        And logs in via Okta with username "diego1@test.com" and password "123456" on login page - myRAS Survey
        And clicks on survey next button after reviewing the survey details to start on the myRAS Survey questions. page - myRAS Survey
        And clicks next button on The first block of questions will collect basic demographic information. page - myRAS Survey
        And clicks I am completing this form for someone else - myRAS Survey
        And enters name of person completing "Christina", "E", "Ramirez" this questionaire -myRAS Survey
        And clicks YES button for is Christina still alive -myRAS Survey
        And clicks YES button for Has Christina ever been included in a published case report or otherwise represented in a public manner by a healthcare provider or researcher page - myRAS Survey
        And enters information about a previous cancer study "PUBLISHED IN ANOTHER CANCER STUDY" Please provide any additional information about the authors, year of publication or PubMed ID (PMID), if available. page - myRAS Survey
        And clicks Next button for The next set of questions will ask about birth and neonatal history. page - myRAS Survey
        And enters Christinas Biological Mother birth city "LOS ANGELES", select Mothers Age "23" and enters Father birth city "PUERTO VALLARTA",and selects Fathers age "26" for What was your biological parents age in Years when you were born? page - myRAS Survey
        And clicks YES Was Christina Ramirez diagnosed with hypoglycemia (low blood sugar) during the newborn period - myRAS Survey
        And selects All that apply and enters in other condition "ABNORMAL BONE STRUCTURE" for Was Christina Ramirez diagnosed with any of the following conditions during your mothers pregnancy? These are conditions often detected on routine fetal ultrasound page  - myRAS Survey
        And click YES During her pregnancy with Christina Ramirez did their mother have any prenatal tests to identify fetal birth defects or fetal medical problems? - myRAS Survey
        And selects All normal results and enters in other "GENETIC" Please indicate the results of the prenatal tests administered to the biological mother of Christina Ramirez during her pregnancy with Christina Ramirez page - myRAS Survey
        And selects All that apply and enters for infection "FLU", and enters for rash "ECZEMA" and enters for other complications "STREP THROAT" for Was the biological mother of Christina Ramirez diagnosed with any of the following conditions prior to or during her pregnancy with Christina Ramirez?  - myRAS Survey
        And click YES During her pregnancy with Christina Ramirez, did their biological mother take any medications, vitamins or supplements for any reason? - myRAS Survey
        And selects All that apply and enters herbal supplements "OREGANO" and enters for first other medication "TURMERIC" and enters for second medication "MELATONIN" for Please select all medications Christinas mother took during her pregnancy with them.  - myRAS Survey
        And adds details for Christina in Please provide details on the name of the medication taken reason it was taken and approximate length of time it was taken. page - myRAS Survey
        And clicks YES Did Christinas biological mother use any tobacco products during her pregnancy with Christina?  - myRAS Survey
        And selects All that apply and enters for other "WAX" What tobacco products did Christinas biological mother use during her pregnancy with Christina?  - myRAS Survey
        And clicks YES Did Christinas biological mother use any vaping products during her pregnancy with Christina?  - myRAS Survey
        And selects All that apply and enters for other "ELECTRONIC CIGARS" for Which vaping products did Christinas mother use during her pregnancy with Christina?  - myRAS Survey
        And clicks YES Did Christinas biological mother drink any alcoholic beverages during her pregnancy with Christina? - myRAS Survey
        And selects All that apply and enters for other "ABSINTHE" for What alcoholic beverages did Christinas mother drink during her pregnancy with Christina?   - myRAS Survey
        And clicks YES for Did Christinas biological mother use any recreational drugs during her pregnancy with Christina? - myRAS Survey
        And selects All that apply and enters for other "HASH" What recreational drug did Christinas biological mother use during her pregnancy with Christina? - myRAS Survey
        And clicks YES for Did Christinas biological mother ever live or work in a place where others smoked cigarettes, pipes or cigars around her during her pregnancy with Christina? - myRAS Survey
        And selects All that apply and enters for others "JUUL" for What products were used around Christinas biological mother during her pregnancy with Christina?  - myRAS Survey
        And enters Please describe Christinas biological parents occupation(s) during their mothers pregnancy with Christina?  and enters mothers occupation "TEACHER" and enters fathers occupation "DIRECTOR" in Please list all of the occupations during the pregnancy. - myRAS Survey
        And enters height in cm for biological mother height "150" and biological fathers height "180" in What is the height of Christinas biological mother and father?  - myRASSurvey
        And clicks next The next set of questions will ask about hormone-related growth.Growth is influenced by many things including nutrition, parental height/genetics and secreted hormones that tell the body to grow taller. - myRAS Survey
        And clicks YES for Has Christina ever been evaluated by an endocrinologist for any reason?  These are doctors that specialize in the endocrine system, which is made up of many glands that secrete hormones.  Hormones play a role in many things in the body including growth, metabolism and salt regulation. Endocrinologists often diagnose conditions such as diabetes and thyroid problems.    - myRAS Survey
        And enters endocrinologist medical provider name "DOCTOR GERALDINE", medical provider city, state, country "ASHBURN, VA, UNITED STATES", hospital or medical affiliation "INOVA" in What is the name of the endocrinologist who completed Christinas examination? - myRAS Survey
        And clicks YES for Has Christina ever had growth hormone testing?- myRAS Survey
        And selects All options that apply for What were the results of Christinas growth hormone testing? and enters other hormone testing "ADRENALINE OR EPINEPHRINE"- myRAS Survey
        And clicks YES for Has Christina ever received growth hormone treatment?- myRAS Survey
        And enters height before growth hormone treatment "5.5 Feet" for What was Christinas height before starting growth hormone? - myRAS Survey
        And selects number "3" for How many times has Christina received growth hormone treatment?- myRAS Survey
        And adds details in Please provide the details of growth hormone replacement by completing the table below.- myRAS Survey
        And clicks Next button The next set of questions will ask about development. Development includes things such as crawling walking and speaking understanding language.- myRAS Survey
        And clicks YES for Was Christina ever diagnosed with hypotonia as an infant or child?  This is often described as unusually low muscle tone or floppy muscle tone. - myRAS Survey
        And clicks twelve-eighteen months option for At what age was Christina able to sit without support? - myRAS Survey
        And clicks twelve-eighteen months option for At what age was Christina able to walk without support? - myRAS Survey
        And clicks YES for Has Christina ever received physical therapy? - myRAS Survey
        And clicks thirthy-six to forty eight months option At what age was Christina able to use simple two-word phrases? - myRAS Survey
        And selects Simple speech compared to people of the same age for How would you describe Christinas current speech capabilities? - myRAS Survey
        And clicks YES for Has Christina ever received speech therapy? - myRAS Survey
        And clicks Severe Cognitive Delay in Between the ages of three and six years old (preschool years), was Christina ever diagnosed with issues of cognitive development? Cognitive development can include difficulties in learning, understanding, and processing information or making decisions. - myRAS Survey
        And clicks YES for Did Christina receive occupational therapy between three and six years of age? Occupational therapy is based on engagement in activities of daily life such as self-care skills, education, work, or social interaction. - myRAS Survey
        And clicks Attended typical elementary school without support for Between the ages of six and ten elementary school age please select the option that best describes Christinas schooling. - myRAS Survey
        And clicks Attended typical classroom without support for Between the ages of ten and seventeen middle and high school age please select the option that best describes Christinas schooling. - myRAS Survey
        And clicks Some college, no degree for Please indicate the highest degree or level of schooling Christina has completed - myRAS Survey
        And click Working full time for What is Christinas current employment status? - myRAS Survey
        And clicks All that apply and enters in other "DYSGRAPHIA" for Has Christina ever been diagnosed with any of the following learning differences? - myRAS Survey
        And clicks Next button for If Christina has ever had formal IQ testing and have a copy, please upload it here. Please note, only PDFs are accepted.  - myRAS Survey
        And clicks Next button The next set of questions will ask about medical conditions associated with the heart. - myRAS Survey
        And clicks YES for Has Christina ever been evaluated by a cardiologist? These are doctors that specialize in the heart. Cardiologists often diagnose conditions such as an irregular heart beat, an enlarged heart, and heart defects. - myRAS Survey
        And enters name of doctor "DOCTOR RUSS JUNIOR", and enters Location "WASHINGTON DC, USA" ,and enters for Hospital "G.W. HOSPITAL" for What is the name of the cardiologist who completed Christinas heart evaluation? - myRAS Survey
        And clicks YES for Has Christina ever been diagnosed with any structural heart issues? - myRAS Survey
        And clicks All that apply and enters for other "GIANT HEART" for Has Christina ever been diagnosed with any of the following structural heart issues? - myRAS Survey
        And clicks All that apply for Has Christina ever had any of the following symptoms? - myRAS Survey
        And enters all details for all symptom occurences and where and when they were evaluated for Please complete the table below for the following symptoms, indicating when these symptoms occurred and where these symptoms were evaluated. You only have to provide the age or date for each symptom not both. If you dont recall when the symptom first started or when it most recently occurred, place an X under dont know. - myRAS Survey
        And clicks YES Has Christina ever received treatment for heart problems? Some examples include: medication, catheter intervention, and surgery - myRAS Survey
        And select All that apply and enters for medication "BENAZEPRIL" and enters for other treatment "HEART EXAM" for Has Christina ever had any of the following treatments for heart problems? - myRAS Survey
        And enters all details for Please complete the table below by providing information for the FIRST treatment and the MOST RECENT treatment. You only need to provide the age at which symptoms occurred or date (not both). If you do not recall the details, please place an X in the Dont know box. - myRAS Survey
        And clicks YES button Is Christina still on benza? - myRAS Survey
        And clicks YES button Has Christina ever been diagnosed with any functional heart issues?- myRAS Survey
        And clicks All that apply and enters for other "GIANT HEART" for Has Christina ever been diagnosed with any of the following functional heart issues?  -myRAS Survey
        And enters All details for Please provide any details known for the conditions for which Christina has been diagnosed. For each condition, you need to provide either the age or date at which the condition occurred not both. If you do not know or cannot recall, place an X in the Dont know box.  For each condition, also provide any information regarding treatment. If none, please state None in the treatment box.  If treatment was required, please provide some details as to what was needed medication with name, procedure type etc.  - myRAS Survey
        And clicks Next button The next two questions will ask about RASopathy diagnoses.- myRAS Survey
        And clicks YES button Has been diagnosed with a RASopathy by a physician or through genetic testing? - myRAS Survey
        And clicks All that apply and enters for other "CAPILLARY MALFORMATION- ARTERIOVENOUS MALFORMATION SYNDROME" for Please indicate if Christina has been diagnosed with any of the following RASopathies? - myRAS Survey
        And clicks Next button The next set of questions will ask about general medical history. - myRAS Survey
        And clicks YES Does Christina have a primary care provider?  A primary care provider is a health professional (doctor, physician assistant, nurse practitioner) for which you go to for routine care. Examples of routine care include immunizations/vaccines, annual or sports physicals, or to treat common minor illnesses, such as sinus or ear infections.- myRAS Survey
        And enters name of medical provider "DOCTOR GEORGE" and enter for location " FAIRFAX" and enters hospital "INOVA" for Please provide the information for Christinas primary care provider below.   - myRAS Survey
        And clicks YES to all allergies for Please indicate in the table below if Christina has allergies to the listed items.  We will ask about the specifics of these allergies in later questions.  - myRAS Survey
        And clicks + sign to add Medication "TYLENOL" and enters for allergic reaction "RASH" for Please complete the table below for all medications to which Christina is allergic. - myRAS Survey
        And clicks + sign to add first food allergy "MILK" and enters "RASH" for allergic reaction and clicks + sign for second food allergy "NUTS" and enters "HIVES" for allergic reaction for Please complete the table below for all foods to which Christina is allergic. - myRAS Survey
        And clicks + sign to add other allergy "MOSQUITO BITES" and enters "ITCHING" for allergic reaction and clicks + sign for second allergy "BEE STINGS" and enters "SWELLING OF THE THROAT" for Please complete the table below for all other items to which Christina is allergic that were not included in medication or food allergies. - myRAS Survey
        And clicks YES button Has Christina ever had an operation or biopsy? -myRAS Survey
        And clicks + sign to add type of surgery "C SECTION" and enters "20" for age of surgery and selects reason for surgery "Childbirth" and enters " INOVA, ARLINGTON, VA, USA" for hospital name in Please provide the information for each biopsy and surgery in the table below. -myRAS Survey
        And clicks YES button Has Christina ever been hospitalized for any reason other than a surgery or childbirth? -myRAS Survey
        And clicks + sign to add reason for hospitalization "LONG TERM BLOODY NOSE" and enters "9 NOVEMBER 2020" for when it occured and enters for hospital "INOVA, FAIRFAX, VA, USA" for Please provide the information for each hospitalization in the table below. To add a new hospitalization, please click on the + sign in the upper left corner of the table. -myRAS Survey
        And clicks Next button The next set of questions will ask about GI (gastrointestinal) symptoms or conditions. -myRAS Survey
        And clicks YES button Has Christina ever been evaluated by a gastroenterologist?  These are doctors that specialize in the GI tract and liver. The GI tract includes your esophagus, stomach, small intestine, large intestine/colon, liver and pancreas.  Gastroenterologists often diagnose conditions such as inflammatory bowel disease Crohns disease or ulcerative colitis, Celiac disease, ulcers, and pancreas inflammation pancreatitis.   -myRAS Survey
        And enters doctors name "DOCTOR PHIL VOSS" and enters city, state "FAIRFAX, VA" and enters hospital "INOVA" for Please provide the details for the gastroenterologist who completed the evaluation -myRAS Survey
        And clicks All that apply and enters for other "TROUBLE SWALLOWING" for Has Christina ever been diagnosed with any of the following feeding difficulties?  These issues often include problems eating food by mouth or keeping food from being vomited. -myRAS Survey
        And clicks age and enters "10 DAYS" for At what age was the nasogastric or nasojejunal tube placed? -myRAS Survey
        And clicks age and enters "20 DAYS" for At what age was the gastrostomy G- tube or gastrostomy-jejunostomy GJ tube placed? -myRAS Survey
        And clicks age and enters "30 DAYS" for At what age was the gastrostomy (G- tube) or gastrostomy-jejunostomy (GJ) tube removed? -myRAS Survey
        And click YES button for Has Christina ever had any physical symptoms that likely involved their gastrointestinal (GI) system?  There are many symptoms that are connected to the GI system.  -myRAS Survey
        And clicks All that apply Which of the following symptoms related to the GI system have occurred? -myRAS Survey
        And clicks All previous resolved symptom for Please let us know if the symptoms listed below were previous symptoms or current (ongoing) symptoms. -myRAS Survey
        And clicks YES for All for Did choking/gagging ever lead to. -myRAS Survey
        And click YES for All that apply and enters "20" for age and enters "TUMS" for heartburn medication for Please complete the table below regarding heartburn/reflux symptoms -myRAS Survey
        And click YES for All and enters nausea symptoms at age "12" and enters medication "PEPTOBISMOL" for Please complete the table below regarding nausea symptoms. page - myRAS Survey
        And clicks YES for ALL for Please complete the next set of questions regarding abdominal pain. -myRAS Survey
        And clicks YES button Have any medications ever been taken for abdominal pain?-myRAS Survey
        And selects "2" for How many medications have been taken for abdominal pain. - myRAS Survey
        And enters age "18" and enters medication "ADVIL" and enters "LASTS 45 MINUTES AT A TIME" for Please complete the table below regarding the medications taken for abdominal pain to the best of your ability. -myRAS Survey
        And clicks YES button for all Please complete the next set of questions regarding vomiting. -myRAS Survey
        And clicks YES button for Has any medication ever been taken for vomiting. - myRAS Survey
        And selects "2" for How many medications have been taken for vomiting? - myRAS Survey
        And enters "16"for age and enters "PEPTOBISMOL" for medication  and enters "16" for second medication age and "IMODIUM" for second medication for Please complete the list below by describing any medications taken for vomiting and the age when these medications were taken. -myRAS Survey
        And selects all symptoms for Have any of the following symptoms occurred four or more days/month for at least two months? Select all that apply. -myRAS Survey
        And enters "1 DAY" for when jaundice occured and enters "2 DAYS" for how long jaundice lasted for Please answer the below questions regarding jaundice yellowing of the skin -myRAS Survey
        And clicks YES Does Christina take a lactose supplement? -myRAS Survey
        And enters "EGGS" for To what foods is Christina averse?  Please describe foods that Christina avoids because they do not like the texture or other physical qualities of the food  -myRAS Survey
        And clicks YES button for all for Please answer the next two questions about diarrhea. -myRAS Survey
        And enters "2 A DAY" for episodes in a day and enters "TUMS" for medication used and enters "12" for age when medication was taken in Please complete the table below regarding diarrhea. If medications have never been used, please put N/A in the box. -myRAS Survey
        And clicks YES for All for Please complete the table regarding constipation. - myRAS Survey
        And enters "ADVIL" for medication and enters "16" for age in Please complete the table below regarding encopresis. If medications have never been used, please put N/A in the box. -myRAS Survey
        And enters "20 POUNDS" for weight lost and enters "30 DAYS " for over period of time where loss of weight occured and enters "YES" for gained back weight in Please complete the table below regarding weight loss. -myRAS Survey
        And clicks YES for All and clicks all checkboxes regarding supplemental nutrition for Please complete the information below regarding decreased appetite. - myRAS Survey
        And clicks YES for Is Christina toilet trained? - myRAS Survey
        And selects "2" for At what age approximately was Christina toilet trained? -myRAS Survey
        And clicks YES for ALL for Please complete the information below regarding urination. -myRAS Survey
        And clicks YES for ALL for Please complete the information below regarding bowel movements. -myRAS Survey
        And selects "2" for How many bowel movements does Christina have per week?   - myRAS Survey
        And selects "2 days" What is the longest amount of time that has passed without Christina having a bowel movement? -myRAS Survey
        And clicks type one for Please use the Bristol Stool Chart shown below and select the choice that best represents what typical bowel movements look like. - myRAS Survey
        And clicks YES for Has Christina ever had a procedure, test or study to evaluate your gastrointestinal GI system? -myRAS Survey
        And selects All and enters for other GI test "ANAL FISSURES EXAM" Please indicate which of the following procedures have been performed. -myRAS Survey
        And enters all details and clicks only had one procedure type for Please provide the information below for the MOST RECENT procedure of each kind that was performed. -myRAS Survey
        And clicks Next button for The next set of questions ask about breathing and the lungs. -myRAS Survey
        And clicks YES button for Has Christina ever had an evaluation by a pulmonologist?  These are doctors that specialize in the airway and lungs. -myRAS Survey
        And enters Name of physician "DOCTOR LEE VOSS", and enters Location "MONROVIA ,MD,USA" and enters Hospital "HOLLYCROSS" for Please provide the information below for the pulmonologist who completed Christinas evaluation.  -myRAS Survey
        And clicks YES button for Has Christina ever had wheezing or whistling in their chest? -myRAS Survey
        And clicks YES button for Has a doctor diagnosed Christina with reactive airway disease or asthma? -myRAS Survey
        And clicks YES button for Has Christina ever been seen in the emergency room for a breathing problem? -myRAS Survey
        And clicks YES button for Has Christina ever been admitted to the hospital for a breathing problem? -myRAS Survey
        And clicks Next button for The next set of questions will ask about oral health and dental history. -myRAS Survey
        And clicks YES button for Does Christina receive regular dental care? -myRAS Survey
        And enters name of dentist "DOCTOR GEORGE ROY" and enters location "ARLINGTON, VA" ,and enters Medical Center "INOVA" for Please provide the information below for where dental care is received. -myRAS Survey
        And enters "12/12" for when did Christina last visit a dentist? Please use format month/year as MM/YY. -myRAS Survey
        And clicks cleaning for What was the reason for Christinas last dental visit? myRAS
        And clicks YES button for Do Christinas gums bleed regularly with tooth brushing now? -myRAS Survey
        And click YES button for Do Christinas teeth or gums hurt regularly? -myRAS Survey
        And click YES button for Do you have periodontal or gum disease? -myRAS Survey
        And clicks YES button for Has Christina had dental sealants placed? -myRAS Survey
        And clicks YES button for Does Christina currently have cavities? -myRAS Survey
        And clicks YES button for Has Christina previously had any dental fillings? -myRAS Survey
        And clicks YES button for Does Christinas mouth usually feel dry? -myRAS Survey
        And clicks Fair button for Overall how would you rate the overall health of Christinas teeth and gums? -myRAS Survey
        And clicks Fair button for Overall how would you rate Christinas dental hygiene routine regular tooth brushing, flossing, and your home oral mouth rinse? -myRAS Survey
        And clicks YES button for Has Christina had any changes in their sense of smell NOT related to a diagnosis of COVID? -myRAS Survey
        And clicks YES button for Has Christina had any changes in their sense of taste NOT related to a diagnosis of COVID? -myRAS Survey
        And clicks YES button for Does Christina have jaw or temporomandibular joint pain? - myRAS Survey
        And clicks YES button for Does Christina have frequent headaches? -myRAS Survey
        And clicks YES button for Has Christina had any orthodontic treatment? -myRAS Survey
        And clicks YES button for Has Christina had a palatal expansion? -myRAS Survey
        And clicks YES button for Has Christina had any facial or dental trauma? -myRAS Survey
        And clicks YES button and enters "ROOT CANAL" for Did the facial or dental trauma require surgery? -myRAS Survey
        And clicks YES button Has Christina had elective jaw surgery? -myRAS Survey
        And clicks YES button enters "SQUAMOUS CELL CARCINOMA" for Does Christina have a history of cancer in the mouth or jaw? -myRAS Survey
        And clicks YES button enters "SMALL UPPER JAW" for Does Christina have a family member with a jaw abnormality? -myRAS Survey
        And clicks YES button Does Christina have any numbness in or around their mouth? -myRAS Survey
        And clicks YES button Does Christina have any mouth sores? -myRAS Survey
        And clicks YES button Do Christinas teeth feel sensitive to hot or cold foods? -myRAS Survey
        And clicks YES button Does Christina have problems moving their lips tongue or mouth? -myRAS Survey
        And clicks YES button enters "EXTRA TEETH" for Overall -- Is there anything unusual about Christinas teeth or mouth extra teeth, missing teeth, severe dental diseases, jawbone problems, enamel problems, etc. -myRAS Survey
        And clicks Occasionally for Has Christina had trouble pronouncing any words because of problems with their teeth, mouth or dentures? -myRAS Survey
        And clicks Occasionally for Has Christinas sense of taste worsened because of problems with their teeth, mouth or dentures? -myRAS Survey
        And clicks Occasionally for Has Christina had painful aching in their mouth? -myRAS Survey
        And clicks Occasionally for Has Christina found it uncomfortable to eat any foods because of problems with their teeth, mouth or dentures? -myRAS Survey
        And clicks Occasionally for Is Christina self-conscious because of their teeth, mouth or dentures? -myRAS Survey
        And clicks Occasionally for Has Christina felt tense because of problems with their teeth, mouth or dentures? -myRAS Survey
        And clicks Occasionally for Has Christinas diet been unsatisfactory because of problems with their teeth, mouth or dentures? -myRAS Survey
        And clicks Occasionally for Has Christina had to interrupt meals because of problems with their teeth mouth or dentures? -myRAS Survey
        And clicks Occasionally Has Christina found it difficult to relax because of problems with their teeth, mouth or dentures? -myRAS Survey
        And clicks Occasionally Has Christina been a bit embarrassed because of problems with their teeth, mouth or dentures? -myRAS Survey
        And clicks Occasionally Has Christina been irritable with other people because of problems with their teeth, mouth or dentures? -myRAS Survey
        And clicks Occasionally Has Christina had difficulty doing their usual activities because of problems with their teeth mouth or dentures?-myRAS Survey
        And clicks Occasionally Has Christina felt that life in general is less satisfying because of problems with their teeth mouth or dentures?-myRAS Survey
        And clicks Occasionally Has Christina been totally unable to function because of problems with their teeth mouth or dentures? -myRAS Survey
        And clicks Next button The next set of questions ask about fluid balance and if any fluid builds up throughout the body. -myRAS Survey
        And clicks YES button for Has Christina ever been diagnosed with a lymphatic system issue? -myRAS Survey
        And clicks All and enters for other "POOR LYMPHATIC DRAINAGE" for Has Christina ever been diagnosed with any of the following lymphatic system issues?  -myRAS Survey
        And enters All details for Please complete the table below to the best of your ability about the onset of symptoms, when you were diagnosed and if any procedures or medications were undertaken. -myRASSurvey
        And click Next button for The next set of questions will ask about the kidneys.-myRAS Survey
        And clicks YES button Start Has Christina ever been evaluated by a nephrologist?  These are doctors that specialize in the kidneys.  They often diagnose conditions related to kidney function and help people get dialysis if their kidneys are not working well.  -myRAS Survey
        And enters name of doctor "DOCTOR LAUREN RODNEY", and enters City "ARLINGTON,VA" and enters Hospital "INOVA" for Please list the information below for the nephrologist who completed Christinas evaluation. -myRAS Survey
        And clicks YES button for Has Christina ever been diagnosed with a kidney problem? Some examples include: minor issues with kidney shape, underdeveloped kidney, missing kidney, or swollen kidney -myRAS Survey
        And clicks All that apply and enters other "KIDNEY DISEASE" Has Christina ever been diagnosed with any of the following kidney problems? -myRAS Survey
        And enters All details for Please complete the table below to the best of your ability regarding date of onset of symptoms, diagnosis and if any medications or procedures were undertaken. -myRA SSurvey
        And clicks Next button for The next set of questions ask about hair and skin qualities. -myRAS Survey
        And clicks Yes button for Has Christina ever been evaluated by a dermatologist?  Dermatologists are physicians who specialize in conditions of the skin. -myRAS Survey
        And enters name of Physician "DOCTOR DERMA CLOONEY" and enters city/state "WASHINGTON,DC"and enters Hospital "G.W.HOSPITAL" for Please provide the information below for the dermatologist who completed Christinas evaluation.-myRAS Survey
        And clicks All and enters other "THICK HAIR" for Please choose the best terms to describe Christinas hair. -myRAS Survey
        And clicks YES button for Is the texture or amount of Christinas hair similar to biological family members, such as Christinas mother, father, sibling, and children? -myRAS Survey
        And clicks All that apply and enters other "VITILIGO" for Has Christina ever been diagnosed with any of the following issues involving patches of thickened skin, also known as hyperkeratotis skin? -myRAS Survey
        And clicks All that apply and enters other "ALBINISM" for Does Christina have any of the following pigmented skin findings? Select all that apply. -myRAS Survey
        And clicks Three or more hemangiomas for Does Christina have any hemangiomas?  Hemangiomas are bright red marks on the skin made up of blood vessels, which may appear as a mass or lump. A hemangioma may appear in infancy or childhood and fade over time. -myRASSurvey
        And clicks All that apply and enters "BENIGN TUMOR" for Has Christina ever been diagnosed with any of the following skin tumors? -myRAS Survey
        And clicks Next button for  The next set of questions ask about skeletal conditions. Skeletal conditions involve the bones throughout the body.-myRAS Survey
        And clicks YES button for Has Christina ever been evaluated by an orthopaedic surgeon?  Orthopaedic surgeons are doctors who specialize in the bones and muscles.  They diagnose and treat a range of conditions including broken bones, osteosarcoma, and torn ligaments. -myRAS Survey
        And enters Name of Physican "DOCTOR BASHIR ZIKRIA" and enters Location "BETHESDA,MD"and enters Hospital "JOHNS HOPKINS" for Please provide the details below for the orthopaedic surgeon who completed Christinas evaluation. Please provide the details below for -myRAS Survey
        And clicks All that apply and enters other "RICKETS" for Has Christina been diagnosed with any of the following skeletal findings in the thoracic area? The thoracic area includes the chest and ribs. -myRAS Survey
        And clicks YES button for Does Christina have any issues with curving of the spine?  This would often be diagnosed or evaluated by an orthopaedic surgeon. -myRAS Survey
        And clicks All that apply and enters "ARTHRITIS OF THE SPINE" for Has Christina ever been diagnosed with any of the following types of curvature of the spine? -myRAS Survey
        And enters All details for Please complete the table below for each of the spine issues listed.  For each condition please indicate Christinas age or date when they occurred you do not need to include both-myRAS Survey
        And clicks YES button for Has Christinas neck been described as short or webbed? Individuals with a short, webbed neck may have a low hairline or extra skin where the neck meets the shoulders. -myRAS Survey
        And clicks YES button for Has Christina ever been diagnosed with joint issues?  These conditions are often diagnosed by neurologists, rheumatologists and orthopaedic surgeons. -myRAS Survey
        And clicks ALL that apply and enters "GOUT" for Has Christina ever been diagnosed with the following joint issues?-myRAS Survey
        And enters All details for Please complete the table below for each of the joint issues listed.  For each condition, please include the date or age when symptoms first occurred and date or age at diagnosis (you do not need to include both the date and age). -myRAS Survey
        And clicks Next button for The next set of questions ask about blood disorders.  Blood disorders include immune system problems white blood cells or bleeding/clotting issues platelets or other bone marrow problems where white blood cells, red blood cells and platelets are produced.-myRAS Survey
        And clicks YES button for Has Christina ever had an evaluation by a hematologist or oncologist?  Hematologists are physicians who specialize in the blood system, including white blood cells, platelets, red blood cells and clotting factors.  Oncologists are physicians who specialize in cancer. -myRAS Survey
        And enters Name of Physican "DOCTOR LILY KING" and enters Location "ARLINGTON,VA",and enters Hospital "INOVA" for Please provide the information below for the hematologist/oncologist who completed Christinas evaluation. Page -myRAS Survey
        And clicks YES button for Does Christina have issues with bleeding or bruising?  Examples include easy bruising, poor blood clotting.  These conditions are often evaluated and diagnosed by a hematologist a physician who specializes in the blood Page -myRAS Survey
        And clicks All that apply and enters "HEMOPHILIA" for Does Christina have any of the following issues with bleeding or bruising?  Please select all that apply.  -myRAS Survey
        And enters All details for Please complete the table below for each of the bleeding/bruising issues listed.  For each condition, please provide Christinas age or date when symptoms first started and at diagnosis you only need to provide date or age, but not both -myRAS Survey
        And clicks YES button for Does Christina have any known blood disorders or symptoms of blood disorders? Page -myRAS Survey
        And clicks All that apply and enters for other leukemia text box "CHRONIC LYMPHOCYTICLEUKEMIA"and enters "FACTOR V DEFICIENCY" for other text box in Has Christina ever been diagnosed with any of the following blood disorders or symptoms of blood disorders? -myRAS Survey
        And enters All details for Please complete the table below for each of the blood disorders issues listed.  For each condition listed, please include either Christinas age or date of symptoms and diagnosis .-myRAS Survey
        And clicks All that apply and enters other "BRAIN TUMOR" for Has Christina ever been diagnosed with any of the following tumors? -myRAS Survey
        And enters All details for Please complete the table below for each of the tumors listed.  Please include Christinas age or date when symptoms first started and diagnosis you do not need to include both age and date. If you do not recall the details, please place an X under the Dont know column  Page -myRASSurvey
        And clicks YES button for Does Christina have a history of frequent infections typically recurrent sinus infections or pneumonia or immunodeficiency?-myRAS Survey
        And clicks YES button for Has Christina ever been evaluated by an immunologist or rheumatologist? These are physicians who specialize in the immune system and how it functions. They diagnose conditions such as lupus autoimmune thyroiditis and psoriasis Page-myRAS Survey
        And enters Name of Physican "DOCTOR JOSE MORENO" and enters Location "DECATUR, GA" and enters Hospital "GEORGIA REGIONAL HOSPITAL" for Please provide the name of the immunologist/rheumatologist who completed Christinas evaluation. -myRAS Survey
        And clicks All and enters for other "FREQUENT INFECTIONS IN ADULTHOOD" for How would you describe infection frequency and Christinas immune system?-myRAS Survey
        And enters All details for Page Please complete the table below for each of the immunodeficiencies listed.  For each, please provide the date or age at which symptoms occurred and diagnosis you do not need to include both age and date.  If you do not recall details please place an X in the Dont know column.-myRAS Survey
        And clicks YES button for Has Christina ever been diagnosed with an autoimmune disorder? -myRAS Survey
        And clicks All that apply and enters autoimmune blood condition "VASCULITIS" and enters for other "GULLAIN-BARRE SYNDROME" for With what autoimmune disorder has Christina been diagnosed? -myRAS Survey
        And enters All details for Please complete the table below for each of the autoimmune conditions listed below. Please provide the date or age when symptoms first occurred and diagnosis you do not need to include both age and date. -myRAS Survey
        And clicks Next button for The next set of questions ask about conditions associated with the central nervous system. The central nervous system includes the brain and spinal cord. -myRAS Survey
        And clicks YES button for Has Christina ever been evaluated by a neurologist or neurosurgeon?  These are physicians who specialize in the brain and spinal cord. -myRAS Survey
        And enters Name of Physican "DOCTOR JENNIFER LOPEZ" and enters Location  "MIAMI,FL" and enters Hospital "MERCY HOSPITAL" for Please provide the information for the neurologist or neurosurgeon who completed Christinas evaluation. -myRAS Survey
        And clicks YES button for Has Christina ever been diagnosed with a structural brain abnormality? Examples include Chiari One malformation, hydrocephalus, tethered spinal cord.  -myRAS Survey
        And clicks All that apply and enters "DIMENTIA" for Has Christina ever been diagnosed with any of the following issues of the brain? -myRAS Survey
        And enters All details for Please complete the table below for each of the conditions listed. For each condition, please list either the date or age when the symptoms started and time of diagnosis you do not need to include both age and date. If you do not recall, place an X in the Dont know column. -myRAS Survey
        And clicks YES button for Does Christina have a history of seizures? -myRAS Survey
        And clicks All that apply and enters "MYOCLONIC SEIZURES"for Please select all seizure disorders for which Christina has been diagnosed. -myRASSurvey
        And enters All details for Please complete the table below for each of the conditions listed. For each condition, please include the age or date when symptoms occurred and when diagnosed you do not need to include both age and date.  -myRAS Survey
        And clicks YES button for Has Christina ever been evaluated by a psychiatrist, psychologist or behavioral pediatrician? These medical providers often diagnose conditions such as depression, anxiety, learning difficulties, and developmental disorders. -myRA SSurvey
        And enters Name of Physican "DOCTOR BRAD PITT" and enters Location "WASHINGTON,DC" and enters hospital "G.W. HOSPITAL" for Please provide the information listed below for the medical providers who completed Christinas evaluation. -myRAS Survey
        And clicks YES button for Has Christina ever been diagnosed with a behavioral or psychiatric condition?  -myRAS Survey
        And clicks All that apply and enters other "ASPERGERS" for Has Christina ever been diagnosed with a behavioral or psychiatric condition? Please select all that apply. -myRAS Survey
        And enters All details for Please complete the table below for each of the diagnosed behavioral and/or psychiatric conditions listed.  For each condition, please list the date or age of symptom onset and diagnosis you do not need to include both age and date. If you do not recall, please place an X in the Dont know box.  If no treatment was required place None' in the Treatment column.-myRASSurvey
        And enters neurologic conditions and enters "ATAXIA" for Please list and describe any additional neurologic conditions here that were not covered by the previous questions. -myRAS Survey
        And clicks Next button for The next set of questions ask about vision and hearing page.-myRASSurvey
        And clicks YES button for Has Christina ever been diagnosed with ptosis (droopiness of the upper eyelid)? -myRASSurvey
        And clicks YES button for Did Christina require treatment for ptosis? -myRAS Survey
        And clicks YES button for Has Christina ever had any issues with your vision or eyesight? Examples include nearsightedness when things in the distance look fuzzy, astigmatism, lazy eye. -myRASSurvey
        And clicks All that apply and enters for other "GLAUCOMA" for Please select all the vision/eyesight conditions for which Christina has been diagnosed. -myRAS Survey
        And enters All details for Please complete the table below for each of the conditions listed.  For each condition, please list the age or date when symptoms first started and when the diagnosis was made you do not need to include both date and age.  If you do not recall, place an X in the Dont know column. -myRAS Survey
        And clicks YES button for Has Christina ever experienced strabismus? Strabismus is when the eyes are not aligned properly one may wander up, down or sideways. -myRAS Survey
        And enters first syptoms date "03/13" and enters age "23" and enters diagnosis date "04/14" and enters age "24" and clicks occlusion treatment for Please complete the table below regarding strabismus.  Please list the age or date when symptoms first started and when the diagnosis was made you do not need to include both date and age. If you do not recall, place an X in the Dont know column. If no treatment was required, place None in the Treatment column.  -myRAS Survey
        And clicks YES button for Has Christina ever experienced nystagmus? Nystagmus is when the eye makes sudden, uncontrolled movements, like tremors. -myRASSurvey
        And enters first symtoms date "05/09" and enters age "11" and enters diagnosis date "06/13" and enters age "15" and clicks yes treatment mild shorterm severity for Please complete the table below regarding nystagmus. Please include the age or date when symptoms first occurred and when the diagnosis was made you do not need to include both age and date. -myRASSurvey
        And clicks YES button for Has Christina experienced hearing loss? -myRASSurvey
        And clicks All that apply and enters "SEVERE HEARING LOSS" for Has Christina experienced any of the following types of hearing loss? -myRASSurvey
        And enters for other "SEVERE HEARING LOSS" and clicks YES for all treatment and enters All details for Please complete the table below for each of the conditions listed.  For each condition, please list the age or date when symptoms first occurred and when the diagnosis was made you do not need to include both age and date. -myRASSurvey
        And select All that apply and enters "INNER EAR INFECTION" for Does Christina have any of the following issues with their ears? -myRASSurvey
        And enters "FOREIGN ACCENT SYNDROME" for If there are any other health issues present that have not been captured by this survey, please list them here -myRASSurvey
        And clicks Next button to end survey for You are almost done! To submit your responses, you must continue in the questionnaire by clicking the forward arrow below. The information you have provided will be reviewed by our study team. In the meantime, you should receive an email confirming this submission. page - myRAS Survey


    Scenario: RASSurvey Preview Self Submissions #submit page next button has been commented out/disabled
        Given a participant is on the Rassurvey Questionaire login page - myRAS Survey
        And logs in via Okta with username "diego1@test.com" and password "123456" on login page - myRAS Survey
        And clicks on survey next button after reviewing the survey details to start on the myRAS Survey questions. page - myRAS Survey
        And clicks next button on The first block of questions will collect basic demographic information. page - myRAS Survey
        And selects I am completing this form for myself option on who is completing this form page - myRAS Survey
        And clicks Unsure/Unknown option for Have you ever been included in a published case report or otherwise represented in a public manner by a healthcare provider or researcher? page - myRAS Survey
        And clicks Next button for The next set of questions will ask about birth and neonatal history. page - myRAS Survey
        And clicks Unsure/Unknown option for Please complete the table below regarding your biological parents. page - myRAS Survey
#And clicks YES Were you diagnosed with hypoglycemia (low blood sugar) during the newborn period. page - myRAS Survey
#And selects All that apply and enters in other prenatal condition "ABNORMAL BONE STRUCTURE" for Were you diagnosed with any of the following conditions during your mothers pregnancy? page - myRAS Survey
#And click YES During her pregnancy with you, did your mother have any prenatal tests to identify fetal birth defects or fetal medical problems? page - myRAS Survey
#And selects All normal results and enters other prenatal test "GENETIC" for Please indicate the results of the prenatal tests administered to your biological mother during her pregnancy with you. page - myRAS Survey
#And selects All that apply and enters mothers prenatal type of infection "FLU" prenatal type of rash "ECZEMA", other complications "STREP THROAT" for Was your biological mother diagnosed with any of the following conditions prior to or during her pregnancy with you? page - myRAS Survey
#And click YES During her pregnancy with you, did your biological mother take any medications vitamins or supplements for any reason? page - myRAS Survey
#And selects All that apply for and enters herbal supplement "OREGANO", other medication "TUMERIC", and other medication "MELATONIN" for Please select all medications your mother took during her pregnancy with you. page - myRAS Survey


