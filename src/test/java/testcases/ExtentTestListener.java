package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import utilities.ExtentReportManager;
import utilities.ScreenshotUtil;
import testcases.BaseTest;


public class ExtentTestListener implements ITestListener {
    private static ExtentReports extent = ExtentReportManager.getReportInstance();
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    @Override
    public void onTestStart(ITestResult result) {
        ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName());
        test.set(extentTest);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.get().pass("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.get().fail("Test Failed: " + result.getThrowable());

        Object currentClass = result.getInstance();
        WebDriver driver = ((BaseTest) currentClass).driver;

        String screenshotPath = ScreenshotUtil.takeScreenshot(driver, result.getMethod().getMethodName());

        test.get().fail("Screenshot on failure:",
		        MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }
}
