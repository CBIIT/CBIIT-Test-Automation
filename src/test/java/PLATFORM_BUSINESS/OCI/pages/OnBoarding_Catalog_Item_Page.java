package PLATFORM_BUSINESS.OCI.pages;

public class OnBoarding_Catalog_Item_Page {

    /***
     * ONBOARDING REQUEST IS COMPLETE - EMAIL SUBJECT
     */
    public static String onBoarding_Request_Complete_Email_Subject (String ticketNumber){
        return  "Onboarding Request - Request " + ticketNumber + " is Completed";
    }

    /***
     * ONBOARDING REQUEST CONTRACT COMPANY FIELD
     */
    public static String onBoarding_Request_Contract_Company_Field = "Contract Company";
}