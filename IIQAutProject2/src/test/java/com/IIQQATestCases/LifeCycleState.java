package com.IIQQATestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class LifeCycleState {
	@Test
	public void AccountStatus() {
			
			ChromeOptions ops = new ChromeOptions();
			ops.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(ops);
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
			driver.get("http://localhost:8080/identityiq/identities/identities.jsf#/quickLinks/Manage%20Accounts/identities");
			driver.findElement(By.id("loginForm:accountId")).sendKeys("spadmin");
			driver.findElement(By.id("loginForm:password")).sendKeys("admin");
			driver.findElement(By.id("loginForm:loginButton")).click();
			driver.findElement(By.id("searchInput")).sendKeys("Alan.Duffy");
			driver.findElement(By.id("searchBtn")).click();
			driver.findElement(By.xpath("//div/button[contains(.,'Manage')]")).click();
			//Actions a =new Actions(driver);
			//a.moveToElement(driver.findElement(By.id("dropDownMenuButton-0a00020f879d182781879d807e970026"))).click().build().perform();

			driver.quit();
			
			

	}


}
