/**
 * @author Rajat Verma
 * https://www.linkedin.com/in/rajat-v-3b0685128/
 * https://github.com/rajatt95
 * https://rajatt95.github.io/
 *
 * Course: Selenium - Java with Docker, Git and Jenkins (https://www.testingminibytes.com/courses/selenium-java-with-docker-git-and-jenkins/)
 * Tutor: Amuthan Sakthivel (https://www.testingminibytes.com/)
 */

package com.learning.tests;

import com.learning.annotations.FrameworkAnnotation;
import com.learning.driver.DriverManager;
import com.learning.enums.AuthorType;
import com.learning.enums.CategoryType;
import com.learning.pages.HomePage;
import com.learning.pages.LoginPage;
import com.learning.testdata.TestData;
import com.learning.utils.DataProviderUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {

    @FrameworkAnnotation(author = {AuthorType.Rudra, AuthorType.NISHANT},
            category = {CategoryType.BVT, CategoryType.SANITY, CategoryType.REGRESSION})
    @Test(groups = {"BVT","SANITY","REGRESSION"},description = "To check whether the User can logout from the application.",
            dataProvider = "getTestData", dataProviderClass = DataProviderUtils.class)
    public void logoutTest(TestData testData) {

        LoginPage loginPage = new LoginPage();
        HomePage homePage = loginPage.loginToApplication(testData.getUsername(), testData.getPassword());
        homePage.logoutFromApplication();

        Assert.assertTrue(loginPage.getTxtBoxUserame().isDisplayed(),
                "Assertion for TextBox Username presence");
        Assert.assertTrue(loginPage.getTxtBoxPassword().isDisplayed(),
                "Assertion for TextBox Password presence");
        Assert.assertTrue(loginPage.getBtnLogin().isDisplayed(),
                "Assertion for Button Login presence");
    }


    /**
     * --------------------------------------------------------------------- (2nd time)
     */
//    @FrameworkAnnotation(author = { AuthorType.RAJAT, AuthorType.NISHANT},
//            category = {  CategoryType.BVT,CategoryType.REGRESSION })
//    @Test(description = "To check whether the User can not login with Invalid Credentials",
//    dataProvider = "getInvalidLoginData",dataProviderClass = DataProviderUtils.class)
    public void REFERENCE_errorInvalidCredentials(String username, String password, String expectedError) {

        LoginPage loginPage = new LoginPage();
//        loginPage.setUsername("Admin");
//        loginPage.setPassword("admin1234");
//        loginPage.setUsername(username);
//        loginPage.setPassword(password);
//        loginPage.clickLogin();

//          Method Chaining
//        loginPage
//                .setUsername(username)
//                .setPassword(password)
//                .clickLogin();
        loginPage.loginToApplication(username, password);

        String errorInvalidCreds = DriverManager.getDriver().findElement(By.id("spanMessage")).getText();
        Assert.assertEquals(errorInvalidCreds, expectedError,
                "Assertion for Invalid credentials Error message");
    }


    /**
     * --------------------------------------------------------------------- (1st time)
     */

    // @Test(description = "To check whether the User can not login with Invalid Credentials")
    public void REFERENCE__errorInvalidCredentials() {
//        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//        driver.findElement(By.id("txtPassword")).sendKeys("admin1234");
//        driver.findElement(By.id("btnLogin")).click();
        // holdScript(3);

//        Driver.threadLocal.get().findElement(By.id("txtUsername")).sendKeys("Admin");
//        Driver.threadLocal.get().findElement(By.id("txtPassword")).sendKeys("admin1234");
//        Driver.threadLocal.get().findElement(By.id("btnLogin")).click();

//        DriverManager.getDriver().findElement(By.id("txtUsername")).sendKeys("Admin");
//        DriverManager.getDriver().findElement(By.id("txtPassword")).sendKeys("admin1234");
//        DriverManager.getDriver().findElement(By.id("btnLogin")).click();

//        LoginPage loginPage =new LoginPage();
//        loginPage.setUsername("Admin");
//        loginPage.setPassword("admin1234");
//        loginPage.clickLogin();

//        String errorInvalidCreds =  Driver.driver.findElement(By.id("spanMessage")).getText();
        //   String errorInvalidCreds =  Driver.threadLocal.get().findElement(By.id("spanMessage")).getText();
        String errorInvalidCreds = DriverManager.getDriver().findElement(By.id("spanMessage")).getText();


        //        Assert.assertEquals(errorInvalidCreds, "Invalid credentials",
//                "Assertion for Invalid credentials Error message");
        Assert.assertEquals(errorInvalidCreds, "æ— æ•ˆçš„å‡­è¯�",
                "Assertion for Invalid credentials Error message");


    }
}
