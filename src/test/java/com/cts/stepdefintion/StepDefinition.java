package com.cts.stepdefintion;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.cts.pages.DashBoardPage;
import com.cts.pages.HomePage;
import com.cts.pages.LoginPage;
import com.cts.utils.ReadExcel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	WebDriver driver;

	@Given("I have browser with opencartpage")
	public void i_have_browser_with_opencartpage() {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		ChromeOptions chrome = new ChromeOptions();
		chrome.setAcceptInsecureCerts(true);
		driver = new ChromeDriver(chrome);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://opencart.abstracta.us/");

	}

	@When("I enter login details from Excel {string} with SheetName {string}")
	public void i_enter_login_details_from_Excel_with_SheetName(String filedetails, String sheetname)throws IOException {
		ReadExcel readExcel = new ReadExcel();
		String str[][] = readExcel.getSheetIntoStringArray(filedetails,sheetname);
		{
 
		HomePage homePage = new HomePage(driver);

		homePage.clickOnMyAccount();

		homePage.clickOnLogin();

		LoginPage loginPage = new LoginPage(driver);

		loginPage.enteremail(str[0][0]);

		loginPage.enterpassword(str[0][1]);

		loginPage.clickOnLogin();
		}

	}

	@Then("I should access to the portal with title with My Account")
	public void i_should_access_to_the_portal_with_title_with_My_Account() {

		HomePage homePage = new HomePage(driver);
		String actualTitle = homePage.getCurrentTitle();
		Assert.assertEquals("My Account", actualTitle);
		System.out.println(actualTitle);
		driver.quit();
	}

	@When("user enter {string} and Password {string}")
	public void user_enter_and_Password(String username, String password) {

		HomePage homePage = new HomePage(driver);
		homePage.clickOnMyAccount();

		homePage.clickOnLogin();

		LoginPage loginPage = new LoginPage(driver);

		loginPage.enteremail(username);

		loginPage.enterpassword(password);
 
		loginPage.clickOnLogin();

	}

	@Then("I should  not  get access to the portal")
	public void i_should_not_get_access_to_the_portal() {

		HomePage homePage = new HomePage(driver);
		String actualTitle = homePage.getInvalidLoginTitle();
		Assert.assertEquals("Warning: No match for E-Mail Address and/or Password.", actualTitle);
		System.out.println(actualTitle);
		driver.quit();
	}

	@When("I click on the product Phones and PDAs")
	public void i_click_on_the_product_Phones_and_PDAs() {
		HomePage homePage = new HomePage(driver);
		homePage.clickOnPhones();
	}

	@Then("I should get all Phones and PDAs")
	public void i_should_get_all_Phones_and_PDAs() {

		HomePage homepage = new HomePage(driver);
		String actualTitle = homepage.getPhonesTitle();
		Assert.assertEquals("Phones & PDAs", actualTitle);
		System.out.println(actualTitle);
		driver.quit();
	}

	@When("I click on the product MP3 Players")
	public void i_click_on_the_product_MP3_Players() {

		HomePage homePage = new HomePage(driver);
		homePage.clickOnMP3Players();

		homePage.clickOnAllMP3();

		homePage.clickOnipodCart();

	}

	@Then("I should get all MP3 Players")
	public void i_should_get_all_MP3_Players() {
		HomePage homepage = new HomePage(driver);
		String actualTitle = homepage.getAllMP3Title();
		Assert.assertEquals("MP3 Players", actualTitle);
		System.out.println(actualTitle);
		driver.quit();
	}

	@When("I click on currency")
	public void i_click_on_currency() {

		HomePage homePage = new HomePage(driver);
		homePage.currencyClick();
		homePage.usdClick();
	}

	@Then("I should able to select the currency")
	public void i_should_able_to_select_the_currency() {

		driver.quit();
	}
}