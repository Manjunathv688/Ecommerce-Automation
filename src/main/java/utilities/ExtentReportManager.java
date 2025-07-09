package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
    private static ExtentReports extent;

    public static ExtentReports getReportInstance() {
        if (extent == null) {
            ExtentSparkReporter reporter = new ExtentSparkReporter("test-output/ExtentReport.html");
            reporter.config().setReportName("Demoblaze Automation Report");
            reporter.config().setDocumentTitle("Capstone Execution");

            extent = new ExtentReports();
            extent.attachReporter(reporter);
            extent.setSystemInfo("Quality Analyst", "Manjunatha V");
        }
        return extent;
    }
}
