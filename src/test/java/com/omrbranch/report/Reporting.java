package com.omrbranch.report;

import java.io.File;
import java.util.ArrayList;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
public static void generateJvmReport(String jsonFile) {
	File file = new File("D:\\Eclipse Directory\\OMRBranchGroceryAPIAutomation\\target");
	Configuration configuration = new Configuration(file, "OMR Branch Grocery API Automation");
	configuration.addClassifications("OS", "Windows 11");
	configuration.addClassifications("Sprint", "24");
	ArrayList<String> jsonFiles = new ArrayList<String>();
	jsonFiles.add(jsonFile);
	ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
	builder.generateReports();

}
}
