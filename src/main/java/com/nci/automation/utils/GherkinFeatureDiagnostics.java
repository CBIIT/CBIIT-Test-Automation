package com.nci.automation.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.apache.commons.lang.StringUtils;
//import org.apache.commons.lang.tuple.Pair;

/**
 * This class has functions that will get some states about cucumber gherkin
 * statics.
 */
public class GherkinFeatureDiagnostics {

	private final String DEFAULT_FEATURES_PATH = "/features";

	private final String FEATURE_FILE_EXT = "feature";
	private final String FEATURE_START = "Feature:";
	private final String SCENARIO_START = "Scenario:";
	private final String TAG_START = "@";
	private final String COMMENT_START = "#";
	private final String[] STEPS = { "Given", "When", "Then", "And" };
	private final String[] NON_STEPS = { FEATURE_START, SCENARIO_START,
			TAG_START, COMMENT_START };

	private final Logger LOG = LogManager.getLogger(GherkinFeatureDiagnostics.class);

	private final String featureResourceDir;

	public GherkinFeatureDiagnostics(String featureResourceDir) {
		this.featureResourceDir = featureResourceDir;
	}

	private File getSitFeaturesDir() {
		URL url = null;

		if (StringUtils.isNotBlank(featureResourceDir)) {
			url = GherkinFeatureDiagnostics.class.getResource(featureResourceDir);
		} else {
			url = GherkinFeatureDiagnostics.class.getResource(DEFAULT_FEATURES_PATH);
		}
		File sitFeaturesDir = FileUtils.toFile(url);

		if (sitFeaturesDir == null) {
			LOG.error("No feature directory is found at: " + DEFAULT_FEATURES_PATH);
		}

		return sitFeaturesDir;
	}

	/**
	 * Return number of features under given directory.
	 */
	public int getFeatureCount() {
		int count = 0;

		File sitFeaturesDir = getSitFeaturesDir();

		if (sitFeaturesDir != null) {
			String[] exts = { FEATURE_FILE_EXT };

			Collection<File> featureFiles = FileUtils.listFiles(sitFeaturesDir,
					exts, true);
			count = featureFiles.size();
		}

		return count;
	}

	/**
	 * This method returns list of all names of features.
	 * 
	 * @throws IOException
	 */
	public List<String> getFeatureNames() throws IOException {
		List<String> featureList = new ArrayList<String>();

		File sitFeatureDir = getSitFeaturesDir();

		if (sitFeatureDir != null) {
			String[] exts = { FEATURE_FILE_EXT };

			Collection<File> featureFiles = FileUtils.listFiles(sitFeatureDir,
					exts, true);

			for (File file : featureFiles) {
				LineIterator lineIterator = FileUtils.lineIterator(file);

				while (lineIterator.hasNext()) {
					String line = lineIterator.nextLine().trim();
					line = line.trim();

					if (StringUtils.startsWith(line, FEATURE_START)) {
						line = StringUtils.replaceOnce(line, FEATURE_START, "");
						featureList.add(line.trim());
					}

				}
			}
		}

		return featureList;
	}

	/**
	 * Returns number of steps under given directory
	 */
	public int getStepCount() throws IOException {
		int count = 0;

		File sitFeatureDir = getSitFeaturesDir();

		if (sitFeatureDir != null) {
			String[] exts = { FEATURE_FILE_EXT };

			Collection<File> featureFiles = FileUtils.listFiles(sitFeatureDir,
					exts, true);

			for (File file : featureFiles) {
				LineIterator lineIterator = FileUtils.lineIterator(file);

				while (lineIterator.hasNext()) {
					String line = lineIterator.nextLine().trim();

					if (StringUtils.startsWithAny(line, STEPS)) {
						count++;
					}

				}
			}

		}
		return count;
	}

	private String replaceParamsInSteps(String stepLine) {
		String modLine = stepLine;

		if (StringUtils.isNotBlank(stepLine)) {
			modLine = stepLine.replaceAll("(\".+?\")", "");
		}

		return modLine;
	}

//	/**
//	 * Returns list of all step names in all scenarios under given directory.
//	 * 
//	 * @return Returns all steps under the given directory.
//	 */
//	public Pair<List<String>, Integer> getStepNames() throws IOException {
//		List<String> stepNameList = new ArrayList<String>();
//
//		File sitFeatureDir = getSitFeaturesDir();
//
//		if (sitFeatureDir != null) {
//			String[] exts = { FEATURE_FILE_EXT };
//
//			Collection<File> featureFiles = FileUtils.listFiles(sitFeatureDir,
//					exts, true);
//
//			for (File file : featureFiles) {
//				LineIterator lineIterator = FileUtils.lineIterator(file);
//
//				while (lineIterator.hasNext()) {
//					String line = lineIterator.nextLine().trim();
//
//					if (isStep(line) && StringUtils.isNotBlank(line)) {
//							stepNameList.add(line.trim());
//					}
//
//				}
//			}
//
//		}
//
//		List<List<String>> allSteps = getAllSteps(stepNameList);
//		List<List<String>> uniqueSteps = getUniqueSteps(allSteps);
//
//		Collections.sort(uniqueSteps, new Comparator<List<String>>() {
//
//			public int compare(List<String> first, List<String> second) {
//				String firstLine = first.get(0);
//				String secondLine = second.get(0);
//				String firstWord = firstLine.split("\\s")[0];
//				String secondWord = secondLine.split("\\s")[0];
//
//				return secondWord.compareTo(firstWord);
//			}
//		});
//
//		List<String> flatList = flattenList(uniqueSteps);
//		Pair<List<String>, Integer> stepNameCountPair = Pair.of(
//				flatList,
//				uniqueSteps.size());
//
//		return stepNameCountPair;
//	}

	private List<String> flattenList(List<List<String>> hiList) {
		List<String> flatList = new ArrayList<String>();

		for (List<String> inList : hiList) {
			for (String line : inList) {
				flatList.add(line);
			}

			flatList.add("\n");
		}
		return flatList;
	}

	private boolean isStep(String line) {

		String stepLine = line.trim();

		for (String stepStart : STEPS) {

			if (stepLine.startsWith(stepStart)) {
				return true;
			}
		}

		for (String nonStepStart : NON_STEPS) {

			if (stepLine.startsWith(nonStepStart)) {
				return false;
			}
		}

		return true;
	}

	private List<List<String>> getAllSteps(List<String> stepList) {
		List<List<String>> allSteps = new ArrayList<List<String>>();

		List<String> singleStepList = new ArrayList<String>();

		for (String step : stepList) {

			if (startsWithStepStart(step)) {
				allSteps.add(singleStepList);
				singleStepList = new ArrayList<String>();
				singleStepList.add(step);
			} else {
				singleStepList.add(step);
			}
		}

		// singleStepList.remove(0);
		return allSteps;
	}

	private List<List<String>> getUniqueSteps(List<List<String>> allSteps) {
		List<List<String>> uniqueSteps = new ArrayList<List<String>>();
		
		Set<String> stepSet = new HashSet<String>();
		
		for (List<String> stepList : allSteps) {
			if (stepList != null && !stepList.isEmpty()) {
				String replacedString = replaceParamsInSteps(stepList.get(0));
				boolean isAdded = stepSet.add(replacedString);

				if (isAdded) {
					uniqueSteps.add(stepList);
				}
			}
		}

		return uniqueSteps;
	}

	private boolean startsWithStepStart(String stepLine) {

		for (String stepStart : STEPS) {

			if (stepLine.startsWith(stepStart)) {
				return true;
			}
		}

		return false;
	}

	/**
	 * Return Number of scenarios under the given directory.
	 * 
	 * @return Returns number of scenarios under the given directory.
	 */
	public int getScenarioCount() throws IOException {
		int count = 0;

		File sitFeatureDir = getSitFeaturesDir();

		if (sitFeatureDir != null) {
			String[] exts = { FEATURE_FILE_EXT };

			Collection<File> featureFiles = FileUtils.listFiles(sitFeatureDir,
					exts, true);

			for (File file : featureFiles) {
				LineIterator lineIterator = FileUtils.lineIterator(file);

				while (lineIterator.hasNext()) {
					String line = lineIterator.nextLine().trim();

					if (StringUtils.startsWith(line, SCENARIO_START)) {
						count++;
					}
				}
			}

		}

		return count;
	}

	/**
	 * Returns all scenario names under the given directory path.
	 * 
	 * @return Returns all names of all scenarios under the given directory.
	 */
	public List<String> getScenarioNames() throws IOException {
		List<String> scenarioList = new ArrayList<String>();
		File sitFeatureDir = getSitFeaturesDir();

		if (sitFeatureDir != null) {

			String[] exts = { FEATURE_FILE_EXT };

			Collection<File> featureFiles = FileUtils.listFiles(sitFeatureDir,
					exts, true);

			for (File file : featureFiles) {
				LineIterator lineIterator = FileUtils.lineIterator(file);

				while (lineIterator.hasNext()) {
					String line = lineIterator.nextLine().trim();

					if (StringUtils.startsWith(line, SCENARIO_START)) {
						line = StringUtils
								.replaceOnce(line, SCENARIO_START, "");
						scenarioList.add(line.trim());
					}
				}
			}
		}

		return scenarioList;
	}

}
