package ServiceNow.CHARMS.Constants;

import java.util.ArrayList;
import java.util.List;

public class FHQSurveyPageConstants {

	public static final String PATIENT_IMMEDIATE_FAMILY_BANNER = "verify the New Details of patient immediate family banner is visible";

	public static final String CONFIRM_IDENTITY = "To confirm your identity, please indicate your relationship to the participant drop-down displays with values I am the participant,I am the legal guardian or legal representative for the participant";
	public static final String CURRENT_MARRIED_RELATIONSHIP = "Are you currently married or in a long term relationship? drop-down displays with values Yes, No, Prefer not to answer";

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

//		@SuppressWarnings("serial")
//		public static final ArrayList<String> GENDER_IDENTITY1 = new ArrayList<String>() {
//			{
//				add("-- None --");
//				add("Male");
//				add("Female");
//				add("Transgender man/trans man/female-to-male (FTM)");
//				add("Transgender woman/trans woman/male-to-female (MTF)");
//				add("Genderqueer/Gender nonconforming/ neither exclusively male nor female");
//				add("Agender");
//				add("Additional gender category (write in)");
//				add("Prefer not to answer");
//				add("Don't Know");
//			}
//		};

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
