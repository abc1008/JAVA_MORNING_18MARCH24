package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentSimpleClass {
	
	
	public static void main(String[] args) {
		
		
		ExtentReports extentReports = new ExtentReports();  // main class of extent report lib
		ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter("D:\\Trainings\\TESTOMETER\\Selenium_JAVA_18Mar24_WEEKDAY\\Reports");
		
		extentReports.attachReporter(extentSparkReporter);
		
		
		extentReports.createTest("");
		
	}
	
	
	

}
