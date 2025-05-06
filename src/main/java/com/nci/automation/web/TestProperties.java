package com.nci.automation.web;

public class TestProperties {

    public static String ENV = "stage";
    public static String BROWSER = "chrome";
    public static boolean HEADLESS = false;
    public static int SET_SLOW_MO_TIME = 600;

    /**
     * SIDE DOOR TEST ACCOUNT CREDENTIALS
     */
    public static String SIDE_DOOR_USERNAME = "CBIITTestAccount";
    public static String SIDE_DOOR_PASSWORD = "Tester123@";

    /**
     * I_TRUST LOGIN CREDENTIALS
     */
    public static String I_TRUST_USERNAME = "juarezds";
    public static String I_TRUST_PASSWORD = "QXZlbmdlcnNBc3NlbWJsZTk5Pw==";

    /**
     * NATIVE VIEW SIDE DOOR URLS
     */
    public static final String NATIVE_VIEW_SIDE_DOOR_STAGE_URL = "https://service-stage.nci.nih.gov/side_door.do";
    public static final String NATIVE_VIEW_SIDE_DOOR_TEST_URL = "https://service-test.nci.nih.gov/side_door.do";
    public static final String NATIVE_VIEW_SIDE_DOOR_SANDBOX_URL = "https://service-sandbox.nci.nih.gov/side_door.do";
    public static String NATIVE_VIEW_SIDE_DOOR_URL;

    /**
     * SSJ URLS
     */
    public static final String SSJ_STAGE_URL = "https://service-stage.nci.nih.gov/nih-ssj.do";
    public static final String SSJ_TEST_URL = "https://service-test.nci.nih.gov/nih-ssj.do";
    public static final String SSJ_SANDBOX_URL = "https://service-sandbox.nci.nih.gov/nih-ssj.do";
    public static String SSJ_URL;

    /**
     * SERVICENOW NCISP URLS
     */
    public static final String SERVICENOW_NCISP_TEST_URL = "https://service-test.nci.nih.gov/ncisp";
    public static final String SERVICENOW_NCISP_STAGE_URL = "https://service-stage.nci.nih.gov/ncisp";
    public static final String SERVICENOW_NCISP_SANDBOX_URL = "https://service-sandbox.nci.nih.gov/ncisp";
    public static String SERVICENOW_NCISP_URL;

    /**
     * CHANGE PASSWORD URLS
     */
    public static final String CHANGE_PASSWORD_TEST_URL = "https://i2e-test.nci.nih.gov/changepassword/";
    public static final String CHANGE_PASSWORD_STAGE_URL = "https://i2e-stage.nci.nih.gov/changepassword/";
    public static String CHANGE_PASSWORD_URL;

    /**
     * ENTERPRISE MAINTENANCE URLS
     */
    public static final String ENTERPRISE_MAINTENANCE_TEST_URL = "https://i2e-test.nci.nih.gov/em";
    public static final String ENTERPRISE_MAINTENANCE_STAGE_URL = "https://i2e-stage.nci.nih.gov/em";
    public static String ENTERPRISE_MAINTENANCE_URL;

    /**
     * FANCONI URLS
     */
    public static final String FANCONI_TEST_URL = "https://service-test.nci.nih.gov/fanconi";
    public static final String FANCONI_STAGE_URL = "https://service-stage.nci.nih.gov/fanconi";
    public static final String FANCONI_SANDBOX_URL = "https://service-sandbox.nci.nih.gov/fanconi";
    public static String FANCONI_URL;

    /**
     * EIDP NHGRI URLS
     */
    public static final String EIDP_NHGRI_TEST_URL = "https://idp-test.nih.gov/nhgri/idp";
    public static final String EIDP_NHGRI_STAGE_URL = "https://idp-stage.nih.gov/nhgri/idp";
    public static String EIDP_NHGRI_URL;

    /**
     * CEDCD URLS
     */
    public static final String CEDCD_TEST_URL = "https://cedcd-qa.nci.nih.gov/home";
    public static final String CEDCD_STAGE_URL = "https://cedcd-stage.nci.nih.gov/home";
    public static String CEDCD_URL;

    /**
     * CCR URLS
     */
    public static final String CCR_TEST_URL = "https://service-test.nci.nih.gov/ccr-careers";
    public static final String CCR_STAGE_URL = "https://service-stage.nci.nih.gov/ccr-careers";
    public static final String CCR_SANDBOX_URL = "https://service-sandbox.nci.nih.gov/ccr-careers";
    public static String CCR_URL;

    /**
     * OA Intake
     */
    public static final String OAINTAKE_TEST_URL = "https://service-test.nci.nih.gov/oa_intake";
    public static final String OAINTAKE_STAGE_URL = "https://service-stage.nci.nih.gov/oa_intake";
    public static String OAINTAKE_URL;

    /**
     * NCCR
     */
    public static final String NCCR_TEST_URL = "https://service-test.nci.nih.gov/nccr";
    public static final String NCCR_STAGE_URL = "https://service-stage.nci.nih.gov/nccr";
    public static String NCCR_URL;

    /**
     * AWARD NOMINATION
     */
    public static final String AWARD_NOMINATION_TEST_URL = "https://service-test.nci.nih.gov/ncisp";
    public static String AWARD_NOMINATION_URL;
    public static final String AWARD_NOMINATION_ADMIN_GROUP_URL = "https://service-test.nci.nih.gov/sys_user_group.do?sys_id=5c673fd31b45921089b9ece0f54bcb03";

    /**
     * E-GRANTS URLS
     */
    public static final String E_GRANTS_TEST_URL = "https://egrants-web-test.nci.nih.gov/";
    public static final String E_GRANTS_STAGE_URL = "https://egrants-web-stage.nci.nih.gov/";
    public static String E_GRANTS_URL;

    /**
     * OASYS URLS
     */
    public static final String OASYS_TEST_URL = "https://oasys-qa.cancer.gov/#/";
    public static final String OASYS_STAGE_URL = "https://oasys-stage.cancer.gov/#/";
    public static String OASYS_URL;

    /**
     * COMETS ANALYTICS URLS
     */
    public static final String COMETS_ANALYTICS_TEST_URL = "https://www.comets-analytics-test.org/analysis";
    public static final String COMETS_ANALYTICS_STAGE_URL = "https://www.comets-analytics-stage.org/analysis";
    public static String COMETS_ANALYTICS_URL;

    /**
     * SCATLAS URLS
     */
    public static final String SCATLAS_TEST_URL = "https://scatlaslc-qa.ccr.cancer.gov/#/";
    public static final String SCATLAS_STAGE_URL = "https://scatlaslc-stage.ccr.cancer.gov/#/";
    public static String SCATLAS_URL;

    /**
     * CERVICAL CP URLS
     */
    public static final String CERVICAL_CP_TEST_URL = "https://globalcxca-qa.cancer.gov/";
    public static final String CERVICAL_CP_STAGE_URL = "https://globalcxca-stage.cancer.gov/";
    public static String CERVICAL_CP_URL;

    /**
     * ICDGenie URLS
     */
    public static final String ICDGenie_TEST_URL = "https://icdgenie-qa.cancer.gov/";
    public static final String ICDGenie_STAGE_URL = "https://icdgenie-stage.cancer.gov/";
    public static String ICDGenie_URL;

    /**
     * EZ-QTL URLS
     */
    public static final String EZ_QTL_TEST_URL = "https://analysistools-qa.cancer.gov/ezqtl/#/home";
    public static final String EZ_QTL_STAGE_URL = "https://analysistools-stage.cancer.gov/ezqtl/#/home";
    public static String EZ_QTL_URL;

    /**
     * NERD URLS
     */
    public static final String NERD_TEST_URL = "https://service-test.nci.nih.gov/nerd";
    public static final String NERD_STAGE_URL = "https://service-stage.nci.nih.gov/nerd";
    public static final String NERD_SANDBOX_URL = "https://service-sandbox.nci.nih.gov/nerd";
    public static String NERD_URL;

    /**
     * NIFE URLS
     */
    public static final String NIFE_TEST_URL = "https://nife-qa.cancer.gov/";
    public static final String NIFE_STAGE_URL = "https://nife-stage.cancer.gov/";
    public static String NIFE_URL;

    /**
     * SEER ODS URLS
     */
    public static final String SEER_ODS_TEST_URL = "https://service-test.nci.nih.gov/seer-data-access";
    public static final String SEER_ODS_STAGE_URL = "https://service-stage.nci.nih.gov/seer-data-access";
    public static final String SEER_ODS_SANDBOX_URL = "https://service-sandbox.nci.nih.gov/seer-data-access";
    public static String SEER_ODS_URL;

    /**
     * COMETS 2 URLS
     */
    public static final String COMETS_2_TEST_URL = "https://www.comets-analytics-test.org/index.html";
    public static final String COMETS_2_STAGE_URL = "https://www.comets-analytics-stage.org/index.html";
    public static String COMETS_2_URL;

    /**
     * RAS LOGIN URLS
     */
    public static final String RAS_LOGIN_TEST_URL = "https://service-test.nci.nih.gov/myras";
    public static final String RAS_LOGIN_STAGE_URL = "https://service-stage.nci.nih.gov/myras";
    public static final String RAS_LOGIN_SANDBOX_URL = "https://service-sandbox.nci.nih.gov/myras";
    public static String RAS_LOGIN_URL;

    /**
     * SOCCER URLS
     */
    public static final String SOCCER_TEST_URL = "https://soccer-qa.nci.nih.gov/";
    public static final String SOCCER_STAGE_URL = "https://soccer-stage.nci.nih.gov/";
    public static String SOCCER_URL;

    /**
     * CADSR URLS
     */
    public static final String CADSR_TEST_URL = "https://service-test.nci.nih.gov/ncisp";
    public static final String CADSR_STAGE_URL = "https://service-stage.nci.nih.gov/ncisp";
    public static final String CADSR_SANDBOX_URL = "https://service-sandbox.nci.nih.gov/ncisp";
    public static String CADSR_URL;

    /**
     * MCA EXPLORER URLS
     */
    public static final String MCA_EXPLORER_TEST_URL = "https://mcaexplorer-qa.cancer.gov/#/mosaic";
    public static final String MCA_EXPLORER_STAGE_URL = "https://mcaexplorer-stage.cancer.gov/#/mosaic";
    public static String MCA_EXPLORER_URL;

    /**
     * THREE D VIZSNP URLS
     */
    public static final String THREE_D_VIZSNP_TEST_URL = "https://analysistools-qa.cancer.gov/3dvizsnp";
    public static final String THREE_D_VIZSNP_STAGE_URL = "https://analysistools-stage.cancer.gov/3dvizsnp";
    public static String THREE_D_VIZSNP_URL;

    /**
     * MELANOMA URLS
     */
    public static String MELANOMA_TEST_URL = "https://service-test.nci.nih.gov/mymelanoma";
    public static String MELANOMA_STAGE_URL = "https://service-stage.nci.nih.gov/mymelanoma";
    public static String MELANOMA_URL;

    /**
     * MSIG PORTAL URLS
     */
    public static String MSIG_PORTAL_TEST_URL = "https://analysistools-qa.cancer.gov/mutational-signatures/#/";
    public static String MSIG_PORTAL_STAGE_URL = "https://analysistools-stage.cancer.gov/mutational-signatures/#/";
    public static String MSIG_PORTAL_URL;

    /**
     * ANALYSIS TOOLS URLS
     */
    public static String ANALYSIS_TOOLS_TEST_URL = "https://analysistools-qa.cancer.gov/";
    public static String ANALYSIS_TOOLS_STAGE_URL = "https://analysistools-stage.cancer.gov/";
    public static String ANALYSIS_TOOLS_URL;

    /**
     * LD LINK URLS
     */
    public static String LD_LINK_TEST_URL = "https://ldlink-qa.nih.gov/?tab=home";
    public static String LD_LINK_STAGE_URL = "https://ldlink-stage.nci.nih.gov/?tab=home";
    public static String LD_LINK_URL;

    /**
     * GP-MATS URLS
     */
    public static String GP_MATS_TEST_URL = "https://i2e-test.nci.nih.gov/gpmats";
    public static String GP_MATS_STAGE_URL = "https://i2e-stage.nci.nih.gov/gpmats";
    public static String GP_MATS_URL;

    /**
     * EXPLORE GWAS URLS
     */
    public static String EXPLORE_GWAS_TEST_URL =  "https://exploregwas-qa.cancer.gov/#/";
    public static String EXPLORE_GWAS_STAGE_URL = "https://exploregwas-stage.cancer.gov/#/";
    public static String EXPLORE_GWAS_URL;

    /**
     * ICRP URLS
     */
    public static String ICRP_TEST_URL = "https://icrpartnership-test.org/";
    public static String ICRP_STAGE_URL = "https://icrpartnership-stage.org/";
    public static String ICRP_URL;

    public static String C_PRO_SITE_TEST_URL = "https://cprosite-qa.ccr.cancer.gov/#/";
    public static String C_PRO_SITE_STAGE_URL = "https://cprosite-stage.ccr.cancer.gov/#/";
    public static String C_PRO_SITE_URL;

    /**
     * GDS TRACKING URLS
     */
    public static String GDS_TRACKING_TEST_URL = "https://gds-test.nci.nih.gov/gds/search/home.action";
    public static String GDS_TRACKING_STAGE_URL = "https://gds-stage.nci.nih.gov/gds/search/home.action";
    public static String GDS_TRACKING_URL;

    /**
     * JP-SURV URLS
     */
    public static String JP_SURV_DEV_URL = "https://analysistools-dev.cancer.gov/jpsurv/";
    public static String JP_SURV_TEST_URL = "https://analysistools-qa.cancer.gov/jpsurv/";
    public static String JP_SURV_STAGE_URL = "https://analysistools-stage.cancer.gov/jpsurv/";
    public static String JP_SURV_URL;

    /**
     * GWAS TARGET URLS
     */
    public static String GWAS_TARGET_TEST_URL = "https://analysistools-qa.cancer.gov/gwas-target/home";
    public static String GWAS_TARGET_STAGE_URL = "https://analysistools-stage.cancer.gov/gwas-target/home";
    public static String GWAS_TARGET_URL;

    /**
     * FORGEDB URLS
     */
    public static String FORGEDB_TEST_URL = "https://forgedb-qa.cancer.gov/";
    public static String FORGEDB_STAGE_URL = "https://forgedb-stage.cancer.gov/";
    public static String FORGEDB_URL;

    /**
     * BCRAT URLS
     */
    public static String BCRAT_TEST_URL = "https://bcrisktool-qa.cancer.gov/";
    public static String BCRAT_STAGE_URL = "https://bcrisktool-stage.cancer.gov/";
    public static String BCRAT_URL;

    /**
     * CCRAT URLS
     */
    public static String CCRAT_TEST_URL = "https://ccrisktool-qa.cancer.gov/";
    public static String CCRAT_STAGE_URL = "https://ccrisktool-stage.cancer.gov/";
    public static String CCRAT_URL;

    /**
     * MRAT URLS
     */
    public static String MRAT_TEST_URL = "https://mrisktool-qa.cancer.gov/";
    public static String MRAT_STAGE_URL = "https://mrisktool-stage.cancer.gov/";
    public static String MRAT_URL;

    /**
     * ACT24 URLS
     */
    public static String ACT24_RESEARCHER_TEST_URL = "https://act24-test.cancer.gov/act24/researcher/login";
    public static String ACT24_RESEARCHER_STAGE_URL = "https://act24-stage.cancer.gov/act24/researcher/login";
    public static String ACT24_RESEARCHER_URL;

    /**
     * ACT24 PARTICIPANT URLS
     */
    public static String ACT24_PARTICIPANT_TEST_URL = "https://act24-test.cancer.gov/act24/participant/login";
    public static String ACT24_PARTICIPANT_STAGE_URL = "https://act24-stage.cancer.gov/act24/participant/login";
    public static String ACT24_PARTICIPANT_URL;

    public static String getNativeViewSideDoorUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                NATIVE_VIEW_SIDE_DOOR_URL = NATIVE_VIEW_SIDE_DOOR_STAGE_URL;
                break;
            case "test":
                NATIVE_VIEW_SIDE_DOOR_URL = NATIVE_VIEW_SIDE_DOOR_TEST_URL;
                break;
            case "sandbox":
                NATIVE_VIEW_SIDE_DOOR_URL = NATIVE_VIEW_SIDE_DOOR_SANDBOX_URL;
                break;
        }
        return NATIVE_VIEW_SIDE_DOOR_URL;
    }

    public static String getSSJUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                SSJ_URL = SSJ_STAGE_URL;
                break;
            case "test":
                SSJ_URL = SSJ_TEST_URL;
                break;
            case "sandbox":
                SSJ_URL = SSJ_SANDBOX_URL;
                break;
        }
        return SSJ_URL;
    }

    public static String getNCISPUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                SERVICENOW_NCISP_URL = SERVICENOW_NCISP_STAGE_URL;
                break;
            case "test":
                SERVICENOW_NCISP_URL = SERVICENOW_NCISP_TEST_URL;
                break;
            case "sandbox":
                SERVICENOW_NCISP_URL = SERVICENOW_NCISP_SANDBOX_URL;
                break;
        }
        return SERVICENOW_NCISP_URL;
    }

    public static String getChangePasswordUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                CHANGE_PASSWORD_URL = CHANGE_PASSWORD_STAGE_URL;
                break;
            case "test":
                CHANGE_PASSWORD_URL = CHANGE_PASSWORD_TEST_URL;
                break;
        }
        return CHANGE_PASSWORD_URL;
    }

    public static String getEnterpriseMaintenanceUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                ENTERPRISE_MAINTENANCE_URL = ENTERPRISE_MAINTENANCE_STAGE_URL;
                break;
            case "test":
                ENTERPRISE_MAINTENANCE_URL = ENTERPRISE_MAINTENANCE_TEST_URL;
                break;
        }
        return ENTERPRISE_MAINTENANCE_URL;
    }

    public static String getFanconiUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                FANCONI_URL = FANCONI_STAGE_URL;
                break;
            case "test":
                FANCONI_URL = FANCONI_TEST_URL;
                break;
            case "sandbox":
                FANCONI_URL = FANCONI_SANDBOX_URL;
                break;
        }
        return FANCONI_URL;
    }

    public static String getEidpNhgriUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                EIDP_NHGRI_URL = EIDP_NHGRI_STAGE_URL;
                break;
            case "test":
                EIDP_NHGRI_URL = EIDP_NHGRI_TEST_URL;
                break;
        }
        return EIDP_NHGRI_URL;
    }

    public static String getCedcdUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                CEDCD_URL = CEDCD_STAGE_URL;
                break;
            case "test":
                CEDCD_URL = CEDCD_TEST_URL;
                break;
        }
        return CEDCD_URL;
    }

    public static String getCcrUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                CCR_URL = CCR_STAGE_URL;
                break;
            case "test":
                CCR_URL = CCR_TEST_URL;
                break;
            case "sandbox":
                CCR_URL = CCR_SANDBOX_URL;
                break;
        }
        return CCR_URL;
    }

    public static String getEGrantsUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                E_GRANTS_URL = E_GRANTS_STAGE_URL;
                break;
            case "test":
                E_GRANTS_URL = E_GRANTS_TEST_URL;
                break;
        }
        return E_GRANTS_URL;
    }

    public static String getOasysUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                OASYS_URL = OASYS_STAGE_URL;
                break;
            case "test":
                OASYS_URL = OASYS_TEST_URL;
                break;
        }
        return OASYS_URL;
    }

    public static String getCometsAnalyticsUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                COMETS_ANALYTICS_URL = COMETS_ANALYTICS_STAGE_URL;
                break;
            case "test":
                COMETS_ANALYTICS_URL = COMETS_ANALYTICS_TEST_URL;
                break;
        }
        return COMETS_ANALYTICS_URL;
    }

    public static String getScatlasUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                SCATLAS_URL = SCATLAS_STAGE_URL;
                break;
            case "test":
                SCATLAS_URL = SCATLAS_TEST_URL;
            break;
        }
        return SCATLAS_URL;
    }

    public static String getNerdUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                NERD_URL = NERD_STAGE_URL;
                break;
            case "test":
                NERD_URL = NERD_TEST_URL;
                break;
            case "sandbox":
                NERD_URL = NERD_SANDBOX_URL;
                break;
        }
        return NERD_URL;
    }

    public static String getNifeUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                NIFE_URL = NIFE_STAGE_URL;
                break;
            case "test":
                NIFE_URL = NIFE_TEST_URL;
                break;
        }
        return NIFE_URL;
    }

    public static String getEzQTLUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                EZ_QTL_URL = EZ_QTL_STAGE_URL;
                break;
            case "test":
                EZ_QTL_URL = EZ_QTL_TEST_URL;
                break;
        }
        return EZ_QTL_URL;
    }

    public static String getCervicalCPUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                CERVICAL_CP_URL = CERVICAL_CP_STAGE_URL;
                break;
            case "test":
                CERVICAL_CP_URL = CERVICAL_CP_TEST_URL;
                break;
        }
        return CERVICAL_CP_URL;
    }

    public static String getICDGenieUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                ICDGenie_URL = ICDGenie_STAGE_URL;
                break;
            case "test":
                ICDGenie_URL = ICDGenie_TEST_URL;
                break;
        }
        return ICDGenie_URL;
    }

    public static String getSeerOdsUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                SEER_ODS_URL = SEER_ODS_STAGE_URL;
                break;
            case "test":
                SEER_ODS_URL = SEER_ODS_TEST_URL;
                break;
            case "sandbox":
                SEER_ODS_URL = SEER_ODS_SANDBOX_URL;
                break;
        }
        return SEER_ODS_URL;
    }

    public static String getComets2Url() {
        switch (ENV.toLowerCase()) {
            case "stage":
                COMETS_2_URL = COMETS_2_STAGE_URL;
                break;
            case "test":
                COMETS_2_URL = COMETS_2_TEST_URL;
                break;
        }
        return COMETS_2_URL;
    }

    public static String getRasLoginUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                RAS_LOGIN_URL = RAS_LOGIN_STAGE_URL;
                break;
            case "test":
                RAS_LOGIN_URL = RAS_LOGIN_TEST_URL;
                break;
            case "sandbox":
                RAS_LOGIN_URL = RAS_LOGIN_SANDBOX_URL;
                break;
        }
        return RAS_LOGIN_URL;
    }

    public static String getSoccerUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                SOCCER_URL = SOCCER_STAGE_URL;
                break;
            case "test":
                SOCCER_URL = SOCCER_TEST_URL;
                break;
        }
        return SOCCER_URL;
    }

    public static String getCadsrUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                CADSR_URL = CADSR_STAGE_URL;
                break;
            case "test":
                CADSR_URL = CADSR_TEST_URL;
                break;
            case "sandbox":
                CADSR_URL = CADSR_SANDBOX_URL;
                break;
        }
        return CADSR_URL;
    }

    public static String getMcaExplorerUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                MCA_EXPLORER_URL = MCA_EXPLORER_STAGE_URL;
                break;
            case "test":
                MCA_EXPLORER_URL = MCA_EXPLORER_TEST_URL;
                break;
        }
        return MCA_EXPLORER_URL;
    }

    public static String getThreeDVizSNPUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                THREE_D_VIZSNP_URL = THREE_D_VIZSNP_STAGE_URL;
                break;
            case "test":
                THREE_D_VIZSNP_URL = THREE_D_VIZSNP_TEST_URL;
                break;
        }
        return THREE_D_VIZSNP_URL;
    }

    public static String getMelanomaUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                MELANOMA_URL = MELANOMA_STAGE_URL;
                break;
            case "test":
                MELANOMA_URL = MELANOMA_TEST_URL;
                break;
        }
        return MELANOMA_URL;
    }

    public static String getMsigPortalUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                MSIG_PORTAL_URL = MSIG_PORTAL_STAGE_URL;
                break;
            case "test":
                MSIG_PORTAL_URL = MSIG_PORTAL_TEST_URL;
                break;
        }
        return MSIG_PORTAL_URL;
    }

    public static String getAnalysisToolsUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                ANALYSIS_TOOLS_URL = ANALYSIS_TOOLS_STAGE_URL;
                break;
            case "test":
                ANALYSIS_TOOLS_URL = ANALYSIS_TOOLS_TEST_URL;
                break;
        }
        return ANALYSIS_TOOLS_URL;
    }

    public static String getLdLinkUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                LD_LINK_URL = LD_LINK_STAGE_URL;
                break;
            case "test":
                LD_LINK_URL = LD_LINK_TEST_URL;
                break;
        }
        return LD_LINK_URL;
    }

    public static String getGpMatsUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                GP_MATS_URL = GP_MATS_STAGE_URL;
                break;
            case "test":
                GP_MATS_URL = GP_MATS_TEST_URL;
                break;
        }
        return GP_MATS_URL;
    }

    public static String getExploreGwasUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                EXPLORE_GWAS_URL = EXPLORE_GWAS_STAGE_URL;
                break;
            case "test":
                EXPLORE_GWAS_URL = EXPLORE_GWAS_TEST_URL;
                break;
        }
        return EXPLORE_GWAS_URL;
    }

    public static String getIcrpUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                ICRP_URL = ICRP_STAGE_URL;
                break;
            case "test":
                ICRP_URL = ICRP_TEST_URL;
                break;
        }
        return ICRP_URL;
    }

    public static String getGdsTrackingUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                GDS_TRACKING_URL = GDS_TRACKING_STAGE_URL;
                break;
            case "test":
                GDS_TRACKING_URL = GDS_TRACKING_TEST_URL;
                break;
        }
        return GDS_TRACKING_URL;
    }

    public static String getCProSiteUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                C_PRO_SITE_URL = C_PRO_SITE_STAGE_URL;
                break;
            case "test":
                C_PRO_SITE_URL = C_PRO_SITE_TEST_URL;
                break;
        }
        return C_PRO_SITE_URL;
    }

    public static String getJpSurvUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                JP_SURV_URL = JP_SURV_STAGE_URL;
                break;
            case "test":
                JP_SURV_URL = JP_SURV_TEST_URL;
                break;
            case "dev":
                JP_SURV_URL = JP_SURV_DEV_URL;
                break;
        }
        return JP_SURV_URL;
    }

    public static String getGwasTargetUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                GWAS_TARGET_URL = GWAS_TARGET_STAGE_URL;
                break;
            case "test":
                GWAS_TARGET_URL = GWAS_TARGET_TEST_URL;
                break;
        }
        return GWAS_TARGET_URL;
    }

    public static String getFORGEdbUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                FORGEDB_URL = FORGEDB_STAGE_URL;
                break;
            case "test":
                FORGEDB_URL = FORGEDB_TEST_URL;
                break;
        }
        return FORGEDB_URL;
    }

    public static String getBCRATUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                BCRAT_URL = BCRAT_STAGE_URL;
                break;
            case "test":
                BCRAT_URL = BCRAT_TEST_URL;
                break;
        }
        return BCRAT_URL;
    }

    public static String getCCRATUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                CCRAT_URL = CCRAT_STAGE_URL;
                break;
            case "test":
                CCRAT_URL = CCRAT_TEST_URL;
                break;
        }
        return CCRAT_URL;
    }

    public static String getOAntakeUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                OAINTAKE_URL = OAINTAKE_STAGE_URL;
                break;
            case "test":
                OAINTAKE_URL = OAINTAKE_TEST_URL;
                break;
        }
        return OAINTAKE_URL;
    }

    public static String getNCCRUrl() {
        switch (ENV.toLowerCase()) {
            case "test":
                NCCR_URL = NCCR_TEST_URL;
                break;
            case "stage":
                NCCR_URL = NCCR_STAGE_URL;
                break;
        }
        return NCCR_URL;
    }

    public static String getMRATUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                MRAT_URL = MRAT_STAGE_URL;
                break;
            case "test":
                MRAT_URL = MRAT_TEST_URL;
                break;
        }
        return MRAT_URL;
    }

    public static String getAwardNominationUrl() {
        switch (ENV.toLowerCase()) {
            case "test":
                AWARD_NOMINATION_URL = AWARD_NOMINATION_TEST_URL ;
                break;
        }
        return AWARD_NOMINATION_URL;
    }

    public static String getAwardNominationAdminGroupUrl() {
        switch (ENV.toLowerCase()) {
            case "test":
                AWARD_NOMINATION_URL = AWARD_NOMINATION_ADMIN_GROUP_URL ;
                break;
        }
        return AWARD_NOMINATION_ADMIN_GROUP_URL;
    }

    public static String getAct24ResearcherUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                ACT24_RESEARCHER_URL = ACT24_RESEARCHER_STAGE_URL;
                break;
            case "test":
                ACT24_RESEARCHER_URL = ACT24_RESEARCHER_TEST_URL;
                break;
        }
        return ACT24_RESEARCHER_URL;
    }

    public static String getAct24ParticipantUrl() {
        switch (ENV.toLowerCase()) {
            case "stage":
                ACT24_PARTICIPANT_URL = ACT24_PARTICIPANT_STAGE_URL;
                break;
            case "test":
                ACT24_PARTICIPANT_URL = ACT24_PARTICIPANT_TEST_URL;
                break;
        }
        return ACT24_PARTICIPANT_URL;
    }
}