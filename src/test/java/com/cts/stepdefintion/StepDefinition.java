package com.cts.stepdefintion;

import java.io.File;
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

	@When("I enter {string} and password {string}")
	public void i_enter_and_password(String username, String password) {

		HomePage homepage = new HomePage(driver);

		homepage.clickOnMyAccount();

		homepage.clickOnLogin();

		LoginPage loginpage = new LoginPage(driver);

		loginpage.enteremail(username);

		loginpage.enterpassword(password);

		loginpage.clickOnLogin();

	}

	@Then("I should access to the portal with title with My Account")
	public void i_should_access_to_the_portal_with_title_with_My_Account() {

		HomePage homepage = new HomePage(driver);
		String actualTitle = homepage.getCurrentTitle();
		Assert.assertEquals("My Account", actualTitle);
		System.out.println(actualTitle);
		driver.quit();
	}

	@When("user enter {string} and Password {string}")
	public void user_enter_and_Password(String username, String password) {

		HomePage homepage = new HomePage(driver);
		homepage.clickOnMyAccount();

		homepage.clickOnLogin();

		LoginPage loginpage = new LoginPage(driver);

		loginpage.enteremail(username);

		loginpage.enterpassword(password);

		loginpage.clickOnLogin();

	}

	@Then("I should  not  get access to the portal")
	public void i_should_not_get_access_to_the_portal() {

		HomePage homepage = new HomePage(driver);
		String actualTitle = homepage.getInvalidLoginTitle();
		Assert.assertEquals("Warning: No match for E-Mail Address and/or Password.", actualTitle);
		System.out.println(actualTitle);
		driver.quit();
	}

	@When("I click on the product Phones and PDAs")
	public void i_click_on_the_product_Phones_and_PDAs() {
		HomePage homepage = new HomePage(driver);
		homepage.clickOnPhones();
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

		HomePage homepage = new HomePage(driver);
		homepage.clickOnMP3Players();

		homepage.clickOnAllMP3();

		homepage.clickOnipodCart();

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

		HomePage homepage = new HomePage(driver);
		homepage.currencyClick();
		homepage.usdClick();
	}

	@Then("I should able to select the currency")
	public void i_should_able_to_select_the_currency() {

		driver.quit();
	}
}