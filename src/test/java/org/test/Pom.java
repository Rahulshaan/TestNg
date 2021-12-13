package org.test;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Pom  {
	@Test
	private void test11() {
	      System.out.println(Thread.currentThread().getId());
		}
	@Test
	private void test12() {
		      System.out.println(Thread.currentThread().getId());
			}
	@Test
	private void test13() {
		      System.out.println(Thread.currentThread().getId());
			}
		
}
