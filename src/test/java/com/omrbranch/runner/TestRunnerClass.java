package com.omrbranch.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.omrbranch.base.BaseClass;
import com.omrbranch.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false,glue="com.omrbranch.stepdefinition",features = "D:\\Eclipse Directory\\OMRBranchGroceryAPIAutomation\\src\\test\\resources\\Features\\TC1_Login.feature",snippets=SnippetType.CAMELCASE,stepNotifications=true,publish = true, monochrome = true)
public class TestRunnerClass extends BaseClass {
@AfterClass
public static void AfterClass() throws FileNotFoundException, IOException {
	Reporting.generateJvmReport(getPropertyFileValue("jsonPath"));

}

}
