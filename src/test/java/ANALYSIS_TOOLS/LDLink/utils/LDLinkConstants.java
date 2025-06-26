package ANALYSIS_TOOLS.LDLink.utils;

public class LDLinkConstants {

    /**
     * THESE ARE THE CONSTANTS FOR THE LDLINK APPLICATION
     * PRIMARILY THE LONGER TEXT BODIES OF THE DOCUMENTATIONS TAB
     */
    public static final String LDLINK_LDSCORE_DOCUMENTATION_BODYTEXT_1 = "LDscore - Perform LD score regression analysis online utilizing the ldsc tool developed in https://github.com/bulik/ldsc.";
    public static final String LDLINK_LDSCORE_DOCUMENTATION_BODYTEXT_2 ="For LD score calculation - genotype information as .bim/.bed/.fam files, as well as window in centiMorgan (cM) or kilobasepairs (kb) selected from the drop-down menu.";
    public static final String LDLINK_LDSCORE_DOCUMENTATION_BODYTEXT_3 ="For heritability analysis - GWAS summary statistics (format: tab-separated files with columns accepted by https://github.com/bulik/ldsc/blob/master/munge_sumstats.py, e.g. with effect size, p-value, SNP identifiers, and allelic information, note header naming format is important). For example: SNP (Variant ID e.g., rs number), A1 (Allele 1, interpreted as reference allele for signed sumstat), A2 (Allele 2, interpreted as non-reference allele for signed sumstat), Frq (Allele frequency), BETA or [linear/logistic] regression coefficient (0 --> no effect; above 0 --> A1 is trait/risk increasing), P (p-Value), N (Sample size). In addition, a reference population needs to be selected from the drop down menu.";
    public static final String LDLINK_LDSCORE_DOCUMENTATION_BODYTEXT_4 ="For genetic correlation - GWAS summary statistics (format: tab-separated files with columns accepted by https://github.com/bulik/ldsc/blob/master/munge_sumstats.py, e.g. with effect size, p-value, SNP identifiers, and allelic information, note header naming format is important). For example: SNP (Variant ID e.g., rs number), A1 (Allele 1, interpreted as reference allele for signed sumstat), A2 (Allele 2, interpreted as non-reference allele for signed sumstat), Frq (Allele frequency), BETA or [linear/logistic] regression coefficient (0 --> no effect; above 0 --> A1 is trait/risk increasing), P (p-Value), N (Sample size). In addition, a reference population needs to be selected from the drop down menu.";
    public static final String LDLINK_LDSCORE_DOCUMENTATION_BODYTEXT_5 ="Reference population - One 1000 Genomes Project/Genome Aggregation Database (gnomAD) sub-population is required for heritability analysis or genetic correlation.";
    public static final String LDLINK_LDSCORE_DOCUMENTATION_BODYTEXT_6 ="For LD Score calculation - A summary of LD Scores, the MAF/LD Score Correlation Matrix, full LD Scores file, as well as the option to download input data, in addition to a code prompt output summary.";
    public static final String LDLINK_LDSCORE_DOCUMENTATION_BODYTEXT_7 ="For heritability analysis - Total Observed scale heritability, Lambda GC, Mean Chi^2, Intercept and LDSC Ratio, as well as a code prompt output summary.";
    public static final String LDLINK_LDSCORE_DOCUMENTATION_BODYTEXT_8 ="For genetic correlation - tables with heritability of phenotype 1, heritability of phenotype 2, Genetic Covariance, Genetic Correlation and a Summary of Genetic Correlation Results, as well as a code prompt output summary.";
}
