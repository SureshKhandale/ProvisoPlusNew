package com.testing.stepdefination;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;

import com.provisoplus.mainpackege.uikeyword.UIKeyword;
import com.provisoplus.utilities.ExcelUtil;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Paramerterization {
	int x, y, r = 0; // instance Variable
	String s, uname, pass;

	@Given("I have number {int} and {int}")
	public void acceptTwoNumber(int x, int y) {
		this.x = x;
		this.y = y;

	}

	@When("I add them")
	public void addNumbers() {
		r = x + y;
	}

	@Then("Check if its addition is prime")
	public void isPrime() {
		int count = 0;
		for (int i = 1; i < 11; i++) {
			if (r % i == 0) {
				count++;
			}

		}
		if (count > 2) {
			System.out.println("Number is not prime");
		} else {
			System.out.println("Number is Prime");
		}
	}

	@Given("I have a string {string}")
	public void acceptString(String s) {
		this.s = s;
	}

	@Then("Print this string on console")
	public void printString() {
		System.out.println("String: " + s);
	}

//	@When("I have numbers as follow:")
//	public void acceptListOfNumber(Map<Integer,Integer> map) {		
//		Set<Integer> keys = map.keySet();
//		System.out.println("Value from MAP: ");
//		for (Integer key : keys) {
//			int value = map.get(key);
//			System.out.print(value+",");
//			
//		}
//
//	}
	@When("I have numbers as follow:")
	public void acceptListOfNumber(DataTable table) {
		Map<Integer, List> map = table.asMap(Integer.class, List.class);
		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			List nums = map.get(key);
			for (Object num : nums) {
				System.out.print(num + ",");
			}
			System.out.println();
		}
	}

	@Given("I have {word} and {word}")
	public void acceptUserNameAndPassword(String uname, String pass) {
		this.uname = uname;
		this.pass = pass;
	}

	@Then("Print them")
	public void printunameAndPass() {
		System.out.println("username: " + uname + "\t" + "Password: " + pass);
	}
	@Given("I have username and password from {int}")
	public void readUserNameAndPassword(int rowNum) {
//		ExcelUtil excel = new ExcelUtil();
//		List rowData = excel.getColumeFromExcel("C:\Users\SAI\Documents\SureshExcelSeet.xlsx", "SureshExcelSeet", rowNum)
//		

	}

//	@Given("Chrome browser is opened")
//	public void openPractoUrlInChromeBrowser() {
//		UIKeyword.openBrowser("Chrome");
//	}
//
//	@And("Url of practo is launched")
//	public void openPractoUrl() {
//		UIKeyword.lunchUrl("https://www.practo.com/");
//	}
//
//	@When("User enters {word} and {word}")
//	public void enteruserNameAndPassword(String uname, String pass) throws InterruptedException {
//		this.uname = uname;
//		this.pass = pass;
//		UIKeyword.driver.findElement(By.name("Practo login")).click();
//		Thread.sleep(5000);
//		UIKeyword.driver.findElement(By.id("username")).sendKeys("9325772706");
//		Thread.sleep(5000);
//		UIKeyword.driver.findElement(By.id("password")).sendKeys("Suresh@7030");
//	}
//
//	@Then("User is login and print then")
//	public void printUserNameAndPaassword() {
//		UIKeyword.driver.findElement(By.id("login")).click();
//		System.out.println("username: " + uname + "\t" + "Password: " + pass);
//
//	}
}
