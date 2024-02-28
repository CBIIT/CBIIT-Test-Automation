package AnalysisTools.GWASExplorer.Steps;

import appsCommon.PageInitializers.PageInitializer;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.nci.automation.services.RestApiHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.json.JSONObject;
import org.testng.Assert;

public class GwasAPIAccessSteps extends PageInitializer {

    RestApiHelper rest;
    @Given("user sends GET request for cancer phenotype")
    public void user_sends_GET_request_for_cancer_phenotype() {
        rest = new RestApiHelper("https://exploregwas-qa.cancer.gov/#/api");
        rest.setResourceUrl("/phenotypes?q=cancer");
        rest.getRequestByChromeVersion86();
    }

    @SuppressWarnings("deprecation")
    @Then("user receives response for cancer phenotype")
    public void user_receives_response_for_cancer_phenotype() {
        JsonParser parser = new JsonParser();
        JsonArray res = parser.parse(rest.getResponseBody().asString()).getAsJsonArray();
        String firstID = res.getAsJsonArray().get(0).getAsJsonObject().get("id").getAsString();
        System.out.println(firstID);
    }

    @Given("user sends GET request for Participant data")
    public void user_sends_get_request_for_participant_data() {
        rest = new RestApiHelper("https://exploregwas-qa.cancer.gov/#/api");
        rest.setResourceUrl("/participants?phenotype_id=2250&columns=sex%2Cage&precision=0");
        rest.getRequestByChromeVersion86();
    }
    @Then("user receives response for Participant data")
    public void user_receives_response_for_participant_data() {
        JsonParser parser = new JsonParser();
        String res = String.valueOf(parser.parse(rest.getResponseBody().asString()));
//        Assert.assertTrue(res.contentEquals("{\"data\":[{\"id\":1,\"p_value_nlog_expected\":7.251811972993799,\"p_value_nlog\":13.54821356447571},{\"id\":2,\"p_value_nlog_expected\":6.774690718274137,\"p_value_nlog\":13.487315603782836},{\"id\":3,\"p_value_nlog_expected\":6.552841968657781,\"p_value_nlog\":13.479516467259208},{\"id\":4,\"p_value_nlog_expected\":6.406713932979542,\"p_value_nlog\":13.416801226031378},{\"id\":5,\"p_value_nlog_expected\":6.297569463554475,\"p_value_nlog\":13.40483458520977},{\"id\":6,\"p_value_nlog_expected\":6.209714835966758,\"p_value_nlog\":12.244277555096541},{\"id\":7,\"p_value_nlog_expected\":6.137272471682025,\"p_value_nlog\":11.682981898951889},{\"id\":8,\"p_value_nlog_expected\":6.075204004202088,\"p_value_nlog\":11.592439150513638},{\"id\":9,\"p_value_nlog_expected\":6.020907099361674,\"p_value_nlog\":11.059981844992336},{\"id\":10,\"p_value_nlog_expected\":5.972650392225243,\"p_value_nlog\":10.989276134608227}],\"columns\":[\"id\",\"p_value_nlog_expected\",\"p_value_nlog\"]}"));
        System.out.println(res);
    }

    @Given("user sends GET request for PCA")
    public void user_sends_get_request_for_pca() {
        rest = new RestApiHelper("https://exploregwas-qa.cancer.gov/#/api");
        rest.setResourceUrl("/pca?phenotype_id=3080&platform=PLCO_GSA&pc_x=1&pc_y=2&limit=10&raw=true");
        rest.getRequestByChromeVersion86();
    }
    @Then("user receives response for PCA")
    public void user_receives_response_for_pca() {
        JsonParser parser = new JsonParser();
        String res = String.valueOf(parser.parse(rest.getResponseBody().asString()));
        Assert.assertTrue(res.contentEquals("{\"columns\":[\"pc_x\",\"pc_y\",\"ancestry\",\"sex\",\"value\"],\"data\":[[0.0012,0.0009,\"european\",\"female\",0],[0.0009,-0.0003,\"european\",\"female\",0],[0.0016,-0.0003,\"european\",\"female\",1],[-0.0096,-0.0148,\"east_asian\",\"female\",0],[0.0011,0.0001,\"european\",\"female\",0],[0.0016,0.0011,\"european\",\"female\",1],[0.0013,0.0001,\"european\",\"female\",0],[0.0009,0.0006,\"european\",\"female\",0],[-0.0137,0.0113,\"african_american\",\"female\",0],[-0.0099,-0.0143,\"other_asian_or_pacific_islander\",\"female\",1]]}"));
        System.out.println(res);
    }

    @Given("user sends GET request for phenotype")
    public void user_sends_get_request_for_phenotype() {
        rest = new RestApiHelper("https://exploregwas-qa.cancer.gov/#/api");
        rest.setResourceUrl("/phenotypes");
        rest.getRequestByChromeVersion86();
    }
    @Then("user receives response for phenotype")
    public void user_receives_response_for_phenotype() {
        JsonParser parser = new JsonParser();
        JsonArray res = parser.parse(rest.getResponseBody().asString()).getAsJsonArray();
        String pcaData = res.getAsJsonArray().get(0).getAsJsonObject().get("id").getAsString();
        System.out.println(pcaData);
    }

    @Given("user sends GET request for API Ping")
    public void user_sends_get_request_for_api_ping() {
        rest = new RestApiHelper("https://exploregwas-qa.cancer.gov/#/api");
        rest.setResourceUrl("/ping");
        rest.getRequestByChromeVersion86();
    }
    @Then("user receives response for API Ping")
    public void user_receives_response_for_api_ping() {
        JsonParser parser = new JsonParser();
        boolean res = parser.parse(rest.getResponseBody().asString()).getAsBoolean();
        System.out.println(res);
        Assert.assertTrue(res);
    }

    @Given("user sends GET request for Points")
    public void user_sends_get_request_for_points() {
        rest = new RestApiHelper("https://exploregwas-qa.cancer.gov/#/api");
        rest.setResourceUrl("/points?phenotype_id=3080&sex=female&ancestry=european&limit=10");
        rest.getRequestByChromeVersion86();
    }
    @Then("user receives response for Points")
    public void user_receives_response_for_points() {
        JsonParser parser = new JsonParser();
        String res = String.valueOf(parser.parse(rest.getResponseBody().asString()));
        Assert.assertTrue(res.contentEquals("{\"data\":[{\"id\":1,\"p_value_nlog_expected\":7.251811972993799,\"p_value_nlog\":13.54821356447571},{\"id\":2,\"p_value_nlog_expected\":6.774690718274137,\"p_value_nlog\":13.487315603782836},{\"id\":3,\"p_value_nlog_expected\":6.552841968657781,\"p_value_nlog\":13.479516467259208},{\"id\":4,\"p_value_nlog_expected\":6.406713932979542,\"p_value_nlog\":13.416801226031378},{\"id\":5,\"p_value_nlog_expected\":6.297569463554475,\"p_value_nlog\":13.40483458520977},{\"id\":6,\"p_value_nlog_expected\":6.209714835966758,\"p_value_nlog\":12.244277555096541},{\"id\":7,\"p_value_nlog_expected\":6.137272471682025,\"p_value_nlog\":11.682981898951889},{\"id\":8,\"p_value_nlog_expected\":6.075204004202088,\"p_value_nlog\":11.592439150513638},{\"id\":9,\"p_value_nlog_expected\":6.020907099361674,\"p_value_nlog\":11.059981844992336},{\"id\":10,\"p_value_nlog_expected\":5.972650392225243,\"p_value_nlog\":10.989276134608227}],\"columns\":[\"id\",\"p_value_nlog_expected\",\"p_value_nlog\"]}"));
        System.out.println(res);
    }

    @Given("user sends GET request for Summary")
    public void user_sends_get_request_for_summary() {
        rest = new RestApiHelper("https://exploregwas-qa.cancer.gov/#/api");
        rest.setResourceUrl("/summary?phenotype_id=3080&sex=female&ancestry=european&p_value_nlog_min=4&limit=10");
        rest.getRequestByChromeVersion86();
    }
    @Then("user receives response for Summary")
    public void user_receives_response_for_summary() {
        JsonParser parser = new JsonParser();
        String res = String.valueOf(parser.parse(rest.getResponseBody().asString()));
        Assert.assertTrue(res.contentEquals("{\"data\":[{\"id\":2761909,\"phenotype_id\":3080,\"sex\":\"female\",\"ancestry\":\"european\",\"chromosome\":5,\"position_abs\":1002086747,\"p_value_nlog\":4.030593535431524},{\"id\":2761910,\"phenotype_id\":3080,\"sex\":\"female\",\"ancestry\":\"european\",\"chromosome\":7,\"position_abs\":1261313821,\"p_value_nlog\":4.030593535431524},{\"id\":2761911,\"phenotype_id\":3080,\"sex\":\"female\",\"ancestry\":\"european\",\"chromosome\":17,\"position_abs\":2495544216,\"p_value_nlog\":4.030593535431524},{\"id\":2761912,\"phenotype_id\":3080,\"sex\":\"female\",\"ancestry\":\"european\",\"chromosome\":19,\"position_abs\":2669651952,\"p_value_nlog\":4.030593535431524},{\"id\":2761913,\"phenotype_id\":3080,\"sex\":\"female\",\"ancestry\":\"european\",\"chromosome\":13,\"position_abs\":2104769075,\"p_value_nlog\":4.030593535431524},{\"id\":2761914,\"phenotype_id\":3080,\"sex\":\"female\",\"ancestry\":\"european\",\"chromosome\":15,\"position_abs\":2360127088,\"p_value_nlog\":4.030593535431524},{\"id\":2761915,\"phenotype_id\":3080,\"sex\":\"female\",\"ancestry\":\"european\",\"chromosome\":4,\"position_abs\":816371829,\"p_value_nlog\":4.030593535431524},{\"id\":2761916,\"phenotype_id\":3080,\"sex\":\"female\",\"ancestry\":\"european\",\"chromosome\":19,\"position_abs\":2696735378,\"p_value_nlog\":4.030593535431524},{\"id\":2761917,\"phenotype_id\":3080,\"sex\":\"female\",\"ancestry\":\"european\",\"chromosome\":8,\"position_abs\":1493457469,\"p_value_nlog\":4.030593535431524},{\"id\":2761918,\"phenotype_id\":3080,\"sex\":\"female\",\"ancestry\":\"european\",\"chromosome\":9,\"position_abs\":1574707746,\"p_value_nlog\":4.030593535431524}],\"columns\":[\"id\",\"phenotype_id\",\"sex\",\"ancestry\",\"chromosome\",\"position_abs\",\"p_value_nlog\"]}"));
        System.out.println(res);
    }

    @Given("user sends GET request for API Variants")
    public void user_sends_get_request_for_api_variants() {
        rest = new RestApiHelper("https://exploregwas-qa.cancer.gov/#/api");
        rest.setResourceUrl("/variants?phenotype_id=3080&sex=female&ancestry=european&chromosome=8&limit=10");
        rest.getRequestByChromeVersion86();
    }
    @Then("user receives response for API Variants")
    public void user_receives_response_for_api_variants() {
        JsonParser parser = new JsonParser();
        String res = String.valueOf(parser.parse(rest.getResponseBody().asString()));
        Assert.assertTrue(res.contentEquals("{\"data\":[{\"phenotype_id\":3080,\"sex\":\"female\",\"ancestry\":\"european\",\"id\":116,\"chromosome\":8,\"position\":54347490,\"snp\":\"rs144717884\",\"allele_effect\":\"T\",\"allele_non_effect\":\"C\",\"allele_effect_frequency\":0.9899,\"p_value\":6.436e-7,\"p_value_heterogenous\":1,\"p_value_nlog\":6.191383964573008,\"beta\":-0.5223,\"odds_ratio\":0.5931547220118166,\"beta_ci_95_low\":-0.727904,\"beta_ci_95_high\":-0.316696,\"odds_ratio_ci_95_low\":0.4829201306385463,\"odds_ratio_ci_95_high\":0.7285522013333781,\"n\":41707},{\"phenotype_id\":3080,\"sex\":\"female\",\"ancestry\":\"european\",\"id\":137,\"chromosome\":8,\"position\":54352387,\"snp\":\"rs183026686\",\"allele_effect\":\"A\",\"allele_non_effect\":\"G\",\"allele_effect_frequency\":0.9892,\"p_value\":0.00000117,\"p_value_heterogenous\":0,\"p_value_nlog\":5.931814138253839,\"beta\":-0.5141,\"odds_ratio\":0.5980385872137474,\"beta_ci_95_low\":-0.721468,\"beta_ci_95_high\":-0.306732,\"odds_ratio_ci_95_low\":0.48603822787306716,\"odds_ratio_ci_95_high\":0.7358477816893411,\"n\":41707},{\"phenotype_id\":3080,\"sex\":\"female\",\"ancestry\":\"european\",\"id\":399,\"chromosome\":8,\"position\":53887715,\"snp\":\"rs188481204\",\"allele_effect\":\"T\",\"allele_non_effect\":\"G\",\"allele_effect_frequency\":0.0086,\"p_value\":0.00001004,\"p_value_heterogenous\":1,\"p_value_nlog\":4.998266287190999,\"beta\":0.4998,\"odds_ratio\":1.6483915594182155,\"beta_ci_95_low\":0.27792800000000006,\"beta_ci_95_high\":0.721672,\"odds_ratio_ci_95_low\":1.3203911256255145,\"odds_ratio_ci_95_high\":2.0578710962435376,\"n\":41707},{\"phenotype_id\":3080,\"sex\":\"female\",\"ancestry\":\"european\",\"id\":411,\"chromosome\":8,\"position\":142177903,\"snp\":\"rs77446635\",\"allele_effect\":\"T\",\"allele_non_effect\":\"C\",\"allele_effect_frequency\":0.0213,\"p_value\":0.00001045,\"p_value_heterogenous\":0,\"p_value_nlog\":4.980883709552927,\"beta\":0.3896,\"odds_ratio\":1.4763901197078002,\"beta_ci_95_low\":0.216336,\"beta_ci_95_high\":0.562864,\"odds_ratio_ci_95_low\":1.2415194594656103,\"odds_ratio_ci_95_high\":1.7556936131384016,\"n\":41707},{\"phenotype_id\":3080,\"sex\":\"female\",\"ancestry\":\"european\",\"id\":429,\"chromosome\":8,\"position\":95195779,\"snp\":\"rs17669235\",\"allele_effect\":\"T\",\"allele_non_effect\":\"C\",\"allele_effect_frequency\":0.0558,\"p_value\":0.00001104,\"p_value_heterogenous\":0,\"p_value_nlog\":4.95703092660682,\"beta\":0.2582,\"odds_ratio\":1.294597712276465,\"beta_ci_95_low\":0.143148,\"beta_ci_95_high\":0.373252,\"odds_ratio_ci_95_low\":1.1539005663129291,\"odds_ratio_ci_95_high\":1.4524503111968683,\"n\":41707},{\"phenotype_id\":3080,\"sex\":\"female\",\"ancestry\":\"european\",\"id\":570,\"chromosome\":8,\"position\":102317396,\"snp\":\"rs185760678\",\"allele_effect\":\"A\",\"allele_non_effect\":\"G\",\"allele_effect_frequency\":0.9847,\"p_value\":0.00001952,\"p_value_heterogenous\":1,\"p_value_nlog\":4.709520186669327,\"beta\":-0.6716,\"odds_ratio\":0.5108904986998769,\"beta_ci_95_low\":-0.979908,\"beta_ci_95_high\":-0.363292,\"odds_ratio_ci_95_low\":0.37534562906085917,\"odds_ratio_ci_95_high\":0.6953833519118681,\"n\":33767},{\"phenotype_id\":3080,\"sex\":\"female\",\"ancestry\":\"european\",\"id\":573,\"chromosome\":8,\"position\":113106887,\"snp\":\"rs34558069\",\"allele_effect\":\"T\",\"allele_non_effect\":\"TCA\",\"allele_effect_frequency\":0.0565,\"p_value\":0.00001979,\"p_value_heterogenous\":1,\"p_value_nlog\":4.703554205793604,\"beta\":-0.2165,\"odds_ratio\":0.8053325349226717,\"beta_ci_95_low\":-0.315872,\"beta_ci_95_high\":-0.117128,\"odds_ratio_ci_95_low\":0.7291527757499551,\"odds_ratio_ci_95_high\":0.8894713335458574,\"n\":41707},{\"phenotype_id\":3080,\"sex\":\"female\",\"ancestry\":\"european\",\"id\":590,\"chromosome\":8,\"position\":37939557,\"snp\":\"rs1902207\",\"allele_effect\":\"A\",\"allele_non_effect\":\"G\",\"allele_effect_frequency\":0.61,\"p_value\":0.00002075,\"p_value_heterogenous\":1,\"p_value_nlog\":4.682981898951889,\"beta\":-0.1097,\"odds_ratio\":0.8961029258536849,\"beta_ci_95_low\":-0.16026800000000002,\"beta_ci_95_high\":-0.059132000000000004,\"odds_ratio_ci_95_low\":0.8519154450302225,\"odds_ratio_ci_95_high\":0.942582340076071,\"n\":41707},{\"phenotype_id\":3080,\"sex\":\"female\",\"ancestry\":\"european\",\"id\":598,\"chromosome\":8,\"position\":37937823,\"snp\":\"rs4956534\",\"allele_effect\":\"T\",\"allele_non_effect\":\"C\",\"allele_effect_frequency\":0.6099,\"p_value\":0.00002199,\"p_value_heterogenous\":1,\"p_value_nlog\":4.657774770639209,\"beta\":-0.1093,\"odds_ratio\":0.8964614387218198,\"beta_ci_95_low\":-0.159868,\"beta_ci_95_high\":-0.05873199999999999,\"odds_ratio_ci_95_low\":0.8522562793705583,\"odds_ratio_ci_95_high\":0.9429594484287439,\"n\":41707},{\"phenotype_id\":3080,\"sex\":\"female\",\"ancestry\":\"european\",\"id\":639,\"chromosome\":8,\"position\":113148855,\"snp\":\"rs6985122\",\"allele_effect\":\"A\",\"allele_non_effect\":\"T\",\"allele_effect_frequency\":0.9553,\"p_value\":0.00002483,\"p_value_heterogenous\":1,\"p_value_nlog\":4.605023280445436,\"beta\":0.2464,\"odds_ratio\":1.2794112356967637,\"beta_ci_95_low\":0.131936,\"beta_ci_95_high\":0.360864,\"odds_ratio_ci_95_low\":1.141035290671742,\"odds_ratio_ci_95_high\":1.4345683463159673,\"n\":41707}],\"columns\":[\"phenotype_id\",\"sex\",\"ancestry\",\"id\",\"chromosome\",\"position\",\"snp\",\"allele_effect\",\"allele_non_effect\",\"allele_effect_frequency\",\"p_value\",\"p_value_heterogenous\",\"p_value_nlog\",\"beta\",\"odds_ratio\",\"beta_ci_95_low\",\"beta_ci_95_high\",\"odds_ratio_ci_95_low\",\"odds_ratio_ci_95_high\",\"n\"]}"));
        System.out.println(res);
    }

    @Given("user sends GET request for Export Variants")
    public void user_sends_get_request_for_export_variants() {
        rest = new RestApiHelper("https://exploregwas-qa.cancer.gov/#/api");
        rest.setResourceUrl("/export-variants?phenotype_id=3080&sex=female&ancestry=european&chromosome=8&limit=10");
        rest.getRequestByChromeVersion86();
    }
    @Then("user receives response for Export Variants")
    public void user_receives_response_for_export_variants() {
        JsonParser parser = new JsonParser();
        int res = rest.getResponseCode();
        Assert.assertEquals(res, 200);
        System.out.println(res);
    }
}