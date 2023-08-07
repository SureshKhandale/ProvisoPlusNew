package com.testing.stepdefination;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;

import com.provisoplus.mainpackege.uikeyword.UIKeyword;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class FirstStepDefinationInLoginPage {
	/**
	 * This Test is a Loging Button This is all field in enter in login page and
	 * login the Procto
	 */
	String uname, pass;

	@Given("Chrome browser is opened")
	public void openPractoUrlInChromeBrowser() {
		UIKeyword.openBrowser("Chrome");
	}

	@And("Url of practo is launched")
	public void openPractoUrl() {
		UIKeyword.lunchUrl("https://www.practo.com/");
	}

	@When("User enters {word} and {word}")
	public void enteruserNameAndPassword(String uname, String pass) throws InterruptedException {
		this.uname = uname;
		this.pass = pass;
		UIKeyword.driver.findElement(By.name("Practo login")).click();
		Thread.sleep(2000);
		UIKeyword.driver.findElement(By.id("username")).sendKeys("9325772706");
		Thread.sleep(2000);
		UIKeyword.driver.findElement(By.id("password")).sendKeys("Suresh@7030");
	}
	
	@Then("User is login and print then")
	public void printUserNameAndPaassword() {
		UIKeyword.driver.findElement(By.id("login")).click();
		System.out.println("username: " + uname + "\t" + "Password: " + pass);

		AShot ashot = new AShot();
		Screenshot sc = ashot.shootingStrategy(ShootingStrategies.viewportPasting(1000))
				.takeScreenshot(UIKeyword.driver);
		try {
			ImageIO.write(sc.getImage(), "PNG", new File("screenshot/LoginPage.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

//		UIKeyword.driver.quit();

	}

	@Given("Click on For Corporates button")
	public void userClickOnForCorpoatesButton() {
		UIKeyword.driver.findElement(By.cssSelector(" span > span.nav-interact")).click();
	}

	@And("Click on a Health and Wellness Partner button and open the Health and Wellness Partner page")
	public void clickOnHealthAndWellnessPartnerButton() throws InterruptedException {
		Thread.sleep(1000);
		UIKeyword.driver.findElement(By.cssSelector(" span > div > div:nth-child(1) > a")).click();
	}

	@When("User enter the all filed in page")
	public void userEnterTheFiledInPage() throws InterruptedException {
		Thread.sleep(2000);
		UIKeyword.driver.findElement(By.id("name")).sendKeys("Suresh");
//		UIKeyword.driver.findElement(By.id("username")).sendKeys("9325772706");

		UIKeyword.driver.findElement(By.id("organizationName")).sendKeys("XYZ");

		UIKeyword.driver.findElement(By.id("contactNumber")).sendKeys("7030239644");

		UIKeyword.driver.findElement(By.id("officialEmailId")).sendKeys("XYZ@7030gmail.com");

		UIKeyword.driver.findElement(By.id("organizationSize")).sendKeys("<500");

		UIKeyword.driver.findElement(By.id("interestedIn")).sendKeys("Taking a demo");
		
		AShot ashot = new AShot();
		Screenshot sc = ashot.shootingStrategy(ShootingStrategies.viewportPasting(1000))
				.takeScreenshot(UIKeyword.driver);
		try {
			ImageIO.write(sc.getImage(), "PNG", new File("screenshot/Health and Wellness.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

	@Then("User click on Schedule a Demo button")
	public void clickOnTakingADemoButtonAndVeryfiyThankuMassage() throws InterruptedException {
		Thread.sleep(1000);
		UIKeyword.driver.findElement(By.cssSelector(" form > button")).click();
	}

}
