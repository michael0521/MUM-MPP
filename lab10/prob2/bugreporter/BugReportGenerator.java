package lab10.prob2.bugreporter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import lab10.prob2.classfinder.ClassFinder;

/**
 * This class scans the package lesson10.labs.prob2.javapackage for classes with
 * annotation @BugReport. It then generates a bug report bugreport.txt,
 * formatted like this:
 * 
 * Joe Smith reportedBy: classname: description: severity:
 * 
 * reportedBy: classname: description: severity:
 * 
 * Tom Jones reportedBy: classname: description: severity:
 * 
 * reportedBy: classname: description: severity:
 * 
 *
 */
public class BugReportGenerator {
	private static final Logger LOG = Logger.getLogger(BugReportGenerator.class
			.getName());
	private static final String PACKAGE_TO_SCAN = "lab10.prob2.javapackage";
	private static final String REPORT_NAME = "bug_report.txt";
	private static final String REPORTED_BY = "reportedBy: ";
	private static final String CLASS_NAME = "classname: ";
	private static final String DESCRIPTION = "description: ";
	private static final String SEVERITY = "severity: ";

	public void reportGenerator() {
		List<Class<?>> classes = ClassFinder.find(PACKAGE_TO_SCAN);

		Map<String, List<String>> map = new HashMap<>();
		List<String> values = new ArrayList<>();

		for (Class clazz : classes) {
			try {
				clazz = Class.forName(clazz.getName());
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			BugReport br = (BugReport) clazz.getAnnotation(BugReport.class);
			String record = "\treportedBy: " + br.reportedBy()
					+ "\n\tclassname: " + clazz.getName() + "\n\tdescription: "
					+ br.description() + "\n\tsererity: " + br.severity()
					+ "\n";
			if (map.containsKey(br.assignedTo())) {
				map.get(br.assignedTo()).add(record);
			} else {
				List<String> newValues = new ArrayList<>();
				newValues.add(record);
				map.put(br.assignedTo(), newValues);
			}

		}
		File file = new File("bug_report.txt");
		try {
			file.createNewFile();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try (FileWriter w = new FileWriter(file)) {
			for (String name : map.keySet()) {
				w.write(name + "\n");
				w.write(map.get(name).toString());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
