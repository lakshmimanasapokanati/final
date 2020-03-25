package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

	private By myAccLocator = (By.xpath("//a[@title='My Account']"));
	private By RegisterLocator = (By.xpath("//a[text()='Register']"));
	private By LoginLocator = (By.xpath("//a[text()='Login']"));
	private By InvalidLoginTitleLoc=By.xpath("//div[@class='alert alert-danger']");
	private By PhonesLoc=By.linkText("Phones & PDAs");
	private By PhonesTitleLoc=By.xpath("//h2[text()='Phones & PDAs']");
	private By MP3PlayersLoc=By.linkText("MP3 Players");
	private By AllMp3PlayersLoc=By.linkText("Show All MP3 Players");
	private By Mp3TitleLoc=By.xpath("//h2[text()='MP3 Players']");
	private By ipodclickLoc=By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[10]");
	private By ipodWishLoc=By.xpath("(//button[@type='button'])[19]");
	private By currencyLoc=By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[1]");
	private By usdLoc=By.xpath("//button[@name='USD']");
	
	private WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//click on my account
	public void clickOnMyAccount() 
	{
		driver.findElement(myAccLocator).click();
	}
	
	//Invalid login title
	public String getInvalidLoginTitle()
	{
		String actualTitle=driver.findElement(InvalidLoginTitleLoc).getText();
		return actualTitle;
	}

	//login click
	public void clickOnLogin() 
	{
		driver.findElement(LoginLocator).click();

	}
	
	//print title after login
	public String getCurrentTitle()
	{
		String actualTitle=driver.findElement(By.linkText("My Account")).getText();
		return actualTitle;
	}
	
	//click on phones
	public void clickOnPhones()
	{
		driver.findElement(PhonesLoc).click();
	}
	
	//Print title after clicking phones
	public String getPhonesTitle()
	{
		String actualTitle=driver.findElement(PhonesTitleLoc).getText();
		return actualTitle;
	}
	
	//click on Mp3players
	public void clickOnMP3Players()
	{
		driver.findElement(MP3PlayersLoc).click();
	}
	
	//click on all mp3
	public void clickOnAllMP3()
	{
		Actions actions =new Actions(driver);
	     actions.moveToElement(driver.findElement(AllMp3PlayersLoc)).pause(1000).doubleClick().build().perform();
	}
	
	//Print the titke after clicking on MP3 players
	public String getAllMP3Title()
	{
		String actualTitle=driver.findElement(Mp3TitleLoc).getText();
		return actualTitle;
	}
	
	//Adding ipod to the cart
	public void clickOnipodCart()
	{
		driver.findElement(ipodclickLoc).click();
	}
	
	//Adding ipod model to wishlist
	public void clickOnipodTouchWishList()
	{
		driver.findElement(ipodWishLoc).click();
	}
		public void currencyClick()
	{ 
		driver.findElement(currencyLoc).click();
	}
	
		//click on usd  currency 
	public void usdClick()
	{
	  driver.findElement(usdLoc).click();
	}

	
	}
		
	
	
	
	
	
	
	
	
	
	
	

