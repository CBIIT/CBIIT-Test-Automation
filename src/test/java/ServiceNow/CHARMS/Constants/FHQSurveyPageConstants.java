package ServiceNow.CHARMS.Constants;

import java.util.ArrayList;
import java.util.List;

public class FHQSurveyPageConstants {

	public static final String NCI_FAMILY_STUDIES_HUB_RASOPATHIES = "NCI Family Studies Hub: RASopathies";
	public static final String WE_KNOW_FAMILIES_COME_IN_DIFFERENT_SHAPES_AND_SIZES = "We know families come in different shapes and sizes";
	public static final String ITS_OKAY_NOT_TO_KNOW_INFORMATION_ABOUT_SOME_OF_YOUR_RELATIVES = "It's okay not to know information about some of your relatives.";
	public static final String CLICK_HERE_TO_START_YOUR_FAMILY_HEALTH_QUESTIONNAIRE = "Click here to start your family health questionnaire";
	public static final String FHQ_HOME = "FHQ Home";
	public static final String FORM_VIEW = "Form View";
	public static final String YOU_ARE_CURRENTLY_FILLING_OUT_INFORMATION_FOR_THE_PARTICIPANT = "You are currently filling out information for the participant.";
	public static final String PARTICIPANT = "Participant";
	public static final String THIS_FORM_WILL_ASK_QUESTIONS_ABOUT_THE_PARTICIPANT_AND_THEIR_CHILDREN_AND_SIBLINGS = "This form will ask questions about the participant and their children and siblings.";
	public static final String IF_YOU_ARE_FILLING_OUT_THIS_FORM_FOR_YOURSELF_YOU_ARE_REFERRED_TO_AS_THE_PARTICIPANT = "If you are filling out this form for yourself, you are referred to as the participant.";
	public static final String PLEASE_INDICATE_YOUR_RELATIONSHIP_TO_THE_PARTICIPANT_LABEL = "Please indicate your relationship to the participant. Label";
	public static final String PLEASE_INDICATE_YOUR_RELATIONSHIP_TO_THE_PARTICIPANT = "Please indicate your relationship to the participant.";
	public static final String THE_FOLLOWING_QUESTIONS_ARE_ABOUT_THE_STUDY_PARTICIPANT = "The following questions are about the study participant.";
	public static final String FIRST_NAME_OF_THE_PARTICIPANT = "First Name of the participant";
	public static final String PARTICIPANT_FIRST_NAME = "Participant First Name";
	public static final String FIRST_INITIAL_OF_LAST_NAME_OF_THE_PARTICIPANT_LABEL = "First Initial of LAST Name of the participant Label";
	public static final String FIRST_INITIAL_OF_LAST_NAME_OF_THE_PARTICIPANT = "First Initial of LAST Name of the participant";
	public static final String SEX_ASSIGNED_AT_BIRTH_LABEL = "Sex assigned at birth Label";
	public static final String PARTICIPANT_SEX_ASSIGNED_AT_BIRTH = "Sex assigned at birth";
	public static final String GENDER_IDENTITY_LABEL = "Gender Identity Label";
	public static final String PARTICIPANT_GENDER_IDENTITY = "Gender Identity";
	public static final String HAS_THE_PARTICIPANT_EVER_HAD_ANY_MISCARRIAGES_OR_STILLBIRTHS_LABEL = "Has the participant ever had any miscarriages or stillbirths? Label";
	public static final String HAS_THE_PARTICIPANT_EVER_HAD_ANY_MISCARRIAGES_OR_STILLBIRTHS = "Has the participant ever had any miscarriages or stillbirths?";
	public static final String TOTAL_NUMBER_OF_MISCARRIAGES_LABEL = "Total number of Miscarriages Label";
	public static final String LESS_THAN_20_WEEKS_OF_PREGNANCY = "(less than 20 weeks of pregnancy)";
	public static final String TOTAL_NUMBER_OF_MISCARRIAGES = "Total number of Miscarriages";
	public static final String PLEASE_WRITE_THE_FIRST_NAME_OF_THE_PARTNERS_WITH_WHOM_THE_PARTICIPANT_HAD_THE_PREGNANCYIES_ABOVE_LABEL = "Please write the first name of the partner(s) with whom the participant had the pregnancy(ies) above.";
	public static final String PLEASE_WRITE_THE_FIRST_NAME_OF_THE_PARTNERS_WITH_WHOM_THE_PARTICIPANT_HAD_THE_PREGNANCYIES_ABOVE_MISCARRIAGES = "Please write the first name of the partner(s) with whom the participant had the pregnancy(ies) above. Miscarriages";
	public static final String TOTAL_NUMBER_OF_STILLBIRTHS_LABEL = "Total number of Stillbirths Label";
	public static final String TOTAL_NUMBER_OF_STILLBIRTHS = "Total number of Stillbirths";
	public static final String MORE_THAN_20_WEEKS_OF_PREGNANCY = "(more than 20 weeks of pregnancy)";
	public static final String PLEASE_WRITE_THE_FIRST_NAME_OF_THE_PARTNERS_WITH_WHOM_THE_PARTICIPANT_HAD_THE_PREGNANCIES_ABOVE_STILLBIRTHS = "Please write the first name of the partner(s) with whom the participant had the pregnancy(ies) above. Stillbirths";
	public static final String HOW_MANY_TOTAL_CHILDREN_ALIVE_AND_DECEASED_HAS_THE_PARTICIPANT_HAD_LABEL = "How many total children (alive and deceased) has the participant had? Label";
	public static final String PLEASE_INCLUDE_LIVING_AND_DECEASED_CHILDREN = "Please include living and deceased children.";
	public static final String HOW_MANY_TOTAL_CHILDREN_ALIVE_AND_DECEASED_HAS_THE_PARTICIPANT_HAD = "How many total children (alive and deceased) has the participant had?";
	public static final String CHILD_LABEL = "Child Label";
	public static final String MAIN_ADD_LABEL = "Add Label";
	public static final String REMOVE_ALL_LABEL = "Remove All Label";
	public static final String ACTIONS_LABEL = "Actions label";
	public static final String PARTICIPANT_FIRST_NAME_LABEL = "First Name Label";
	public static final String PARTICIPANT_FIRST_INITIAL_OF_LAST_NAME_LABEL = "First Initial of LAST Name Label";
	public static final String PARTICIPANT_VITAL_STATUS_LABEL = "Vital Status Label";
	public static final String NO_DATA_TO_DISPLAY_LABEL = "No data to display Label";
	public static final String ADD_ROW_LABEL = "Add Row Label";
	public static final String FIRST_NAME_LABEL = "First Name Label";
	public static final String FIRST_INITIAL_OF_LAST_NAME_LABEL = "First Initial of LAST Name Label";
	public static final String VITAL_STATUS_LABEL = "Vital Status Label";
	public static final String CANCEL_LABEL = "Cancel Label";
	public static final String ADD_LABEL = "Add Label";
	
	public static final String CONFIRM_IDENTITY = null;
	
	@SuppressWarnings("serial")
	public static final ArrayList<String> VITAL_STATUS_LIST1 = new ArrayList<String>() {
		{
			add("-- None --");
			add("Alive");
			add("Deceased");
			add("Prefer not to answer");
			add("Don't Know");
		}
	};

	@SuppressWarnings("serial")
	public static final ArrayList<String> VITAL_STATUS_LIST = new ArrayList<String>() {
		{
			add("-- None --");
			add("Alive");
			add("Deceased");
			add("Don't Know");
			add("Prefer not to answer");
		}
	};

	@SuppressWarnings("serial")
	public static final ArrayList<String> RELATIONSHIP_TO_PARTICIPANT = new ArrayList<String>() {
		{
			add("-- None --");
			add("I am the participant");
			add("I am a legal guardian or representative for the participant");
		}
	};

	@SuppressWarnings("serial")
	public static final ArrayList<String> YES_NO_PREFER_NOT_TO_ANSWER = new ArrayList<String>() {
		{
			add("-- None --");
			add("Yes");
			add("No");
			add("Prefer not to answer");
		}
	};

	@SuppressWarnings("serial")
	public static final ArrayList<String> YES_NO_DONT_KNOW_PREFER_NOT_TO_ANSWER = new ArrayList<String>() {
		{
			add("-- None --");
			add("Yes");
			add("No");
			add("Don't Know");
			add("Prefer not to answer");
		}
	};

	@SuppressWarnings("serial")
	public static final ArrayList<String> YES_NO_PREFER_NOT_TO_ANSWER_DONT_KNOW = new ArrayList<String>() {
		{
			add("-- None --");
			add("Yes");
			add("No");
			add("Prefer not to answer");
			add("Don't Know");

		}
	};

	@SuppressWarnings("serial")
	public static final ArrayList<String> TYPES_OF_PARENTS = new ArrayList<String>() {
		{
			add("-- None --");
			add("Biological Mother");
			add("Biological Father");
		}
	};

	@SuppressWarnings("serial")
	public static final ArrayList<String> PARENT_SIBLING = new ArrayList<String>() {
		{
			add("Participant Mother FN");

		}
	};

	@SuppressWarnings("serial")
	public static final ArrayList<String> NIECE_SIBLING = new ArrayList<String>() {
		{
			add("Participant Sibling FN");

		}
	};

	@SuppressWarnings("serial")
	public static final ArrayList<String> GRANDCHILD_PARENT = new ArrayList<String>() {
		{
			add("Participant New Child FN");

		}
	};

	@SuppressWarnings("serial")
	public static final ArrayList<String> PARENT_COUSIN = new ArrayList<String>() {
		{
			add("Participant AuntUncle FN");

		}
	};

	@SuppressWarnings("serial")
	public static final ArrayList<String> PARENT_OF_COUSIN = new ArrayList<String>() {
		{
			add("Participant AuntUncle FN");

		}
	};

	@SuppressWarnings("serial")
	public static final ArrayList<String> TYPES_OF_RELATIVES = new ArrayList<String>() {
		{
			add("-- None --");
			add("Aunt");
			add("Uncle");
		}
	};

	@SuppressWarnings("serial")
	public static final ArrayList<String> TYPES_OF_GRANDPARENTS = new ArrayList<String>() {
		{
			add("-- None --");
			add("Paternal grandfather");
			add("Paternal grandmother");
			add("Maternal grandfather");
			add("Maternal grandmother");
		}
	};

	@SuppressWarnings("serial")
	public static final ArrayList<String> TYPES_OF_SIBLINGS = new ArrayList<String>() {
		{
			add("-- None --");
			add("Sister");
			add("Brother");
			add("Half-sister (same father)");
			add("Half-sister (same mother)");
			add("Half-brother (same father)");
			add("Half-brother (same mother)");
			add("Don't Know");
			add("Prefer not to answer");
		}
	};

	@SuppressWarnings("serial")
	public static final ArrayList<String> TYPES_OF_SIBLING = new ArrayList<String>() {
		{
			add("-- None --");
			add("Sister");
			add("Brother");
			add("Half Sister (same father)");
			add("Half Sister (same mother)");
			add("Half Brother (same father)");
			add("Half Brother (same mother)");
			add("Don't Know");
			add("Prefer not to answer");
		}
	};

	@SuppressWarnings("serial")
	public static final ArrayList<String> TYPE_OF_RELATION = new ArrayList<String>() {
		{
			add("-- None --");
			add("Parent");
			add("Aunt/Uncle");
			add("Sibling");
			add("Child");
			add("Grandparent");
			add("Patient");
		}
	};

	public static final List<String> firstInitialLastName() {
		ArrayList<String> numberList = new ArrayList<String>();
		numberList.add("-- None --");
		for (int i = 65; i <= 90; i++) {
			numberList.add(Character.toString((char) i));
		}
		numberList.add("Don't Know");
		numberList.add("Prefer not to answer");
		return numberList;
	}

	public static final List<String> firstInitialLastName1() {
		ArrayList<String> numberList = new ArrayList<String>();

		numberList.add("-- None --");
		for (int i = 65; i <= 90; i++) {
			numberList.add(Character.toString((char) i));
		}
		numberList.add("Prefer not to answer");
		numberList.add("Don't Know");

		return numberList;
	}

	public static final List<String> numberUpToN(int n) {
		ArrayList<String> numberList = new ArrayList<String>();

		numberList.add("-- None --");
		numberList.add("Don't Know");
		numberList.add("Prefer not to answer");
		for (int i = 0; i <= n; i++) {
			numberList.add(i + "");
		}

		return numberList;
	}

	public static final List<String> numberUpToNStartingWithOne(int n) {
		ArrayList<String> numberList = new ArrayList<String>();

		numberList.add("-- None --");
		numberList.add("Don't Know");
		numberList.add("Prefer not to answer");
		for (int i = 1; i <= n; i++) {
			numberList.add(i + "");
		}

		return numberList;
	}

	public static final List<String> currentAge(int n) {
		ArrayList<String> numberList = new ArrayList<String>();
		numberList.add("-- None --");
		for (int i = 19; i <= 102; i++) {
			numberList.add(i + "");
		}
		numberList.add("Under 18");
		numberList.add("Prefer not to answer");
		numberList.add("Don't Know");
		return numberList;
	}

	public static final List<String> currentAge1(int n) {
		ArrayList<String> numberList = new ArrayList<String>();

		numberList.add("-- None --");
		for (int i = 19; i <= 102; i++) {
			numberList.add(i + "");
		}
		numberList.add("Under 18");
		numberList.add("Don't Know");
		numberList.add("Prefer not to answer");
		return numberList;
	}

	public static final List<String> yearOfBirthOrDeathAfter1900() {
		ArrayList<String> numberList = new ArrayList<String>();

		numberList.add("-- None --");
		numberList.add("Don't Know");
		numberList.add("Prefer not to answer");

		for (int i = 1900; i <= 2022; i++) {
			numberList.add(i + "");
		}

		return numberList;
	}

	public static final List<String> yearOfBirthOrDeath() {
		ArrayList<String> numberList = new ArrayList<String>();

		numberList.add("-- None --");
		numberList.add("Don't Know");
		numberList.add("Prefer not to answer");
		numberList.add("Before 1900");
		for (int i = 1900; i <= 2022; i++) {
			numberList.add(i + "");
		}

		return numberList;
	}

	public static final List<String> yearOfDiagnosis() {
		ArrayList<String> numberList = new ArrayList<String>();

		numberList.add("-- None --");
		numberList.add("Don't Know");
		numberList.add("Prefer not to answer");

		for (int i = 1900; i <= 2022; i++) {
			numberList.add(i + "");
		}

		return numberList;
	}

	public static final List<String> ageOfDiagnosis() {
		ArrayList<String> numberList = new ArrayList<String>();

		numberList.add("-- None --");
		for (int i = 1; i <= 102; i++) {
			numberList.add(i + "");
		}
		numberList.add("Less than 1 Year");
		return numberList;
	}

	public static final List<String> ageOfDeath() {
		ArrayList<String> numberList = new ArrayList<String>();
		numberList.add("-- None --");
		for (int i = 1; i <= 102; i++) {
			numberList.add(i + "");
		}
		numberList.add("Less than 1 year");
		numberList.add("Prefer not to answer");
		numberList.add("Don't Know");
		return numberList;
	}

	@SuppressWarnings("serial")
	public static final ArrayList<String> SEX_ASSIGNED_AT_BIRTH = new ArrayList<String>() {
		{
			add("-- None --");
			add("Male");
			add("Female");
			add("Don't Know");
			add("Prefer not to answer");
		}
	};

	@SuppressWarnings("serial")
	public static final ArrayList<String> SEX_ASSIGNED_AT_BIRTH1 = new ArrayList<String>() {
		{
			add("-- None --");
			add("Male");
			add("Female");
			add("Prefer not to answer");
			add("Don't Know");
		}
	};

	@SuppressWarnings("serial")
	public static final ArrayList<String> GENDER_IDENTITY = new ArrayList<String>() {
		{
			add("-- None --");
			add("Male");
			add("Female");
			add("Transgender man/trans man/female to male (FTM)");
			add("Transgender woman/trans woman/male to female (MTF)");
			add("Genderqueer/Gender nonconforming / neither exclusively male nor female");
			add("Agender");
			add("Additional gender category (write in)");
			add("Don't Know");
			add("Prefer not to answer");
		}
	};

	@SuppressWarnings("serial")
	public static final ArrayList<String> TYPE_OF_BIRTH = new ArrayList<String>() {
		{
			add("-- None --");
			add("Identical Twin");
			add("Fraternal Twin");
			add("Identical triplet");
			add("Twin from triplet birth");
			add("Fraternal triplet");
			add("Quadruplet");
			add("Quintuplet");
			add("Don't Know");
			add("Prefer not to answer");

		}
	};

	@SuppressWarnings("serial")
	public static final ArrayList<String> YEAR_OR_AGE_OF_DEATH = new ArrayList<String>() {
		{
			add("-- None --");
			add("Year of Death");
			add("Age of Death");
			add("Don't Know");
			add("Prefer not to answer");

		}
	};

	@SuppressWarnings("serial")
	public static final ArrayList<String> YEAR_OR_AGE_OF_DIAGNOSIS = new ArrayList<String>() {
		{
			add("-- None --");
			add("Year of diagnosis");
			add("Age of diagnosis");
			add("Don't Know");
			add("Prefer not to answer");

		}
	};

	@SuppressWarnings("serial")
	public static final ArrayList<String> YEAR_OR_AGE_OF_DIAGNOSIS1 = new ArrayList<String>() {
		{
			add("-- None --");
			add("Year of diagnosis");
			add("Age of diagnosis");
			add("Prefer not to answer");
			add("Don't Know");

		}
	};

	@SuppressWarnings("serial")
	public static final ArrayList<String> CHILD_DISCRIPTION = new ArrayList<String>() {
		{
			add("-- None --");
			add("Biological child");
			add("Biological child (adopted out)");
			add("Adopted in Child");
			add("Step-Child");
			add("Conceived with Donor Embryo");
			add("Conceived with Donor Egg or Sperm");
			add("Don't Know");
			add("Prefer not to answer");

		}
	};

	@SuppressWarnings("serial")
	public static final ArrayList<String> OTHER_BIOLOGICAL_PARENT = new ArrayList<String>() {
		{
			add("-- None --");
			add("It is a partner I have entered");
			add("It is a partner I have NOT entered");
			add("It is an Egg/Sperm Donor");
			add("None of the Above");
			add("Don't Know");
			add("Prefer not to answer");
		}
	};

	@SuppressWarnings("serial")
	public static final ArrayList<String> RESOPATHY_TYPE = new ArrayList<String>() {
		{
			add("-- None --");
			add("Noonan Syndrome");
			add("Noonan Syndrome with Multiple Lentigines (formerly known as LEOPARD Syndrome)");
			add("Legius Syndrome (LS)");
			add("Capillary Arteriovenous Malformation Syndrome (CAP-AVM)");
			add("Gingival Fibromatosis");
			add("SYNGAP1 Syndrome");
			add("Other RASopathy");
		}
	};

	@SuppressWarnings("serial")
	public static final ArrayList<String> CANCER_TYPE = new ArrayList<String>() {
		{
			add("-- None --");
			add("Adrenocortical carcinoma");
			add("Anal cancer");
			add("Bladder cancer");
			add("Bone or soft tissue cancer (sarcoma)");
			add("Brain cancer");
			add("Breast cancer");
			add("Cervical cancer");
			add("Colon or rectal cancer");
			add("Endometrial or uterine cancer");
			add("Esophageal cancer");
			add("Germ cell cancer");
			add("Head and neck cancer");
			add("Hodgkin Lymphoma");
			add("Kaposi Sarcoma");
			add("Kidney cancer");
			add("Leukemia - acute lymphoblastic");
			add("Leukemia - acute myeloid");
			add("Leukemia - chronic lymphocytic");
			add("Leukemia - chronic myeloid");
			add("Leukemia - juvenile myelomonocytic");
			add("Liver cancer");
			add("Lung cancer");
			add("Mesothelioma");
			add("Myelodysplastic syndrome");
			add("Myeloma");
			add("Neuroblastoma");
			add("Non-Hodgkin Lymphoma");
			add("Ovarian cancer");
			add("Pancreatic cancer");
			add("Prostate cancer");
			add("Rhabdomyosarcoma");
			add("Skin cancer (non-melanoma, basal, squamous)");
			add("Skin cancer (melanoma)");
			add("Stomach or Gastric cancer");
			add("Testicular cancer");
			add("Throat and Larynx cancer");
			add("Thyroid cancer");
			add("Tongue, Lip and Oral Cavity cancer");
			add("Urinary Tract cancer");
			add("Vulvar, Vaginal cancer");
			add("Other cancer");
		}
	};

	@SuppressWarnings("serial")
	public static final ArrayList<String> MEDICAL_CONDITIONS_TYPE = new ArrayList<String>() {
		{
			add("-- None --");
			add("Congenital heart disease");
			add("Developmental disorder");
			add("Unusual physical features");
			add("Other medical condition");
		}
	};
}
