package com.foodie.au.testing.configuration.soapui;
import org.springframework.stereotype.Component;

@Component
public class SoapuiHandler {
    /*@Value("${soapProjectFileLocation}")
    private String soapProjectFileLocation;

    @Value("${soapUiTestEndPoint}")
    private String soapTestEndPoint;

    public void runSoapUITestCase(String testCastName) throws Throwable {
        SoapUITestCaseRunner runner = new SoapUITestCaseRunner();
        runner.setProjectFile(this.soapProjectFileLocation);
        runner.setTestCase(testCastName);
        runner.run();
    }

    public WsdlTestCase getSoapUiTestCase(String testSuiteName, String testCaseName) throws Throwable {
        WsdlProject project = new WsdlProject(this.soapProjectFileLocation);
        WsdlTestSuite testSuite = project.getTestSuiteByName(testSuiteName);
        WsdlTestCase testCase = testSuite.getTestCaseByName(testCaseName);
        testCase.setPropertyValue(SoapUiCustomProperties.END_POINT, soapTestEndPoint + ADMIN_SERVICE_PATH);
        return testCase;
    }

    public TestStepResult runtTestStep(WsdlTestCase testCase, String testStepName) {
        WsdlTestStep testStep = testCase.getTestStepByName(testStepName);
        WsdlTestCaseRunner wsdlTestCaseRunner = new WsdlTestCaseRunner(testCase, new StringToObjectMap(testCase.getProperties()));
        return wsdlTestCaseRunner.runTestStep(testStep);
    }

    public LoadTestStatistics runLoadTestAndWaitTillFinish(WsdlLoadTest loadTest, int numberOfSeconds, int numberOfThreads) throws Throwable {
        setLoadTestConfig(numberOfSeconds, numberOfThreads, loadTest);
        WsdlLoadTestRunner loadTestRunner = new WsdlLoadTestRunner(loadTest);
        loadTestRunner.start(false);
        loadTestRunner.waitUntilFinished();
        return loadTest.getStatisticsModel();
    }

    public WsdlLoadTestRunner runLoadTestWithoutBlocking(WsdlLoadTest loadTest, int numberOfSeconds, int numberOfThreads) throws Throwable {
        setLoadTestConfig(numberOfSeconds, numberOfThreads, loadTest);
        WsdlLoadTestRunner loadTestRunner = new WsdlLoadTestRunner(loadTest);
        loadTestRunner.start(true);
        return loadTestRunner;
    }

    private void setLoadTestConfig(int numberOfSeconds, int numberOfThreads, WsdlLoadTest loadTest) {
        loadTest.getConfig().setCalculateTPSOnTimePassed(false);
        loadTest.getConfig().setThreadCount(numberOfThreads);
        loadTest.setTestLimit(numberOfSeconds);
    }*/
}
