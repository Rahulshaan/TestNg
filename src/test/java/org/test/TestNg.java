package org.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg {
	@Test(groups="smoke")
	private void test1() {
		System.out.println("Smoketest");
	}
	@Test(groups="reg")
	private void test2() {
        System.out.println("Reg");
	}
	@Test(groups="sanity")
	private void test3() {
        System.out.println("Sanity");

	}
	@Test(groups="E2E")
	private void test4() {
        System.out.println("E2E");

	}
	

}
