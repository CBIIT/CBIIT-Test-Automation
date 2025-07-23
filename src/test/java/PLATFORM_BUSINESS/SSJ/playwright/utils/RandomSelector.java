package PLATFORM_BUSINESS.SSJ.playwright.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomSelector {

    private final List<String> values = new ArrayList<>();
    private final Random random = new Random();

    // Initialize the data structure with the provided 26 string values
    public RandomSelector() {
        values.add("Cell Biology");
        values.add("Cancer Biology");
        values.add("Biochemistry/Proteomics/Metabolomics");
        values.add("Biomedical Engineering/Biophysics/Physics");
        values.add("Chemistry/Chemical Biology/Toxicology");
        values.add("Chromosome Biology/Epigenetics/Transcription");
        values.add("Cognitive Neuroscience");
        values.add("Computational Biology/Bioinformatics/Biostatistics/Mathematics");
        values.add("Developmental Biology");
        values.add("Epidemiology/Population Sciences");
        values.add("Genetics/Genomics");
        values.add("Health Disparities");
        values.add("Immunology");
        values.add("Microbiology/Infectious diseases (non-viral)");
        values.add("Molecular and Cellular Neuroscience");
        values.add("Molecular Biology");
        values.add("Molecular Pharmacology/Cell Signaling");
        values.add("Neurodevelopment");
        values.add("RNA Biology");
        values.add("Social and Behavioral Sciences");
        values.add("Stem Cells/Induced Pluripotent Stem Cells");
        values.add("Structural Biology");
        values.add("Synapses and Circuits");
        values.add("Systems Biology/Physiology");
        values.add("Translation from Pre-clinical to Clinical Research/Clinical Informatics");
        values.add("Virology");
    }

    // Method to select two random values
    public List<String> getRandomValues() {
        List<String> selectedValues = new ArrayList<>();
        int size = values.size();

        // Ensure two unique values are selected
        int firstIndex = random.nextInt(size);
        int secondIndex;
        do {
            secondIndex = random.nextInt(size);
        } while (secondIndex == firstIndex);

        selectedValues.add(values.get(firstIndex));
        selectedValues.add(values.get(secondIndex));

        return selectedValues;
    }

    public static void main(String[] args) {
        RandomSelector randomSelector = new RandomSelector();

        // Call the method multiple times to demonstrate the functionality
        System.out.println("Random Pair: " + randomSelector.getRandomValues());
        System.out.println("Random Pair: " + randomSelector.getRandomValues());
        System.out.println("Random Pair: " + randomSelector.getRandomValues());
    }
}