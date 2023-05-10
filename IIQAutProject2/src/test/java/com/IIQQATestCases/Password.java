package com.IIQQATestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Password {
@Test
	
	public void AdminCanChangeOtherUserChangingPassword() {
		//Common code
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		//common code
		driver.get("http://localhost:8080/identityiq/identities/identities.jsf#/quickLinks/Manage%20Accounts/identities");
		driver.findElement(By.id("loginForm:accountId")).sendKeys("spadmin");
		driver.findElement(By.id("loginForm:password")).sendKeys("admin");
		driver.findElement(By.id("loginForm:loginButton")).click();
		driver.findElement(By.id("searchInput")).sendKeys("Aspen");
		driver.findElement(By.xpath("//*[@id=\"searchBtn\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"0a0000fa80ce18ff8180ce2504790287ManageButton\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-identity-login-password\"]")).click();
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.id("confirmPassword")).sendKeys("admin");
		driver.findElement(By.id("submitBtn")).click();
		driver.quit();
		
	}
	@Test
	public void AdminResetPasswordforHimself() throws InterruptedException {
		//Common code
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		//common code
		driver.get("http://localhost:8080/identityiq/identities/identities.jsf#/quickLinks/Manage%20Accounts/identities");
		driver.findElement(By.id("loginForm:accountId")).sendKeys("spadmin");
		driver.findElement(By.id("loginForm:password")).sendKeys("admin");
		driver.findElement(By.id("loginForm:loginButton")).click();
		driver.findElement(By.id("searchInput")).sendKeys("The Administrator");
		driver.findElement(By.xpath("//*[@id=\"searchBtn\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"0a0000fa80ce10c68180ce11410000ffManageButton\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-identity-login-password\"]")).click();
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.id("confirmPassword")).sendKeys("admin");
		driver.findElement(By.id("submitBtn")).click();
		driver.quit();
}
	@Test
	public void AdminClickingonCencelButtonOfChangePassword() {
		//common code
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		//Common code
		driver.get("http://localhost:8080/identityiq/identities/identities.jsf#/quickLinks/Manage%20Accounts/identities");
		driver.findElement(By.id("loginForm:accountId")).sendKeys("spadmin");
		driver.findElement(By.id("loginForm:password")).sendKeys("admin");
		driver.findElement(By.id("loginForm:loginButton")).click();
		driver.findElement(By.id("searchInput")).sendKeys("The Administrator");
		driver.findElement(By.xpath("//*[@id=\"searchBtn\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"0a0000fa80ce10c68180ce11410000ffManageButton\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-identity-login-password\"]")).click();
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.id("confirmPassword")).sendKeys("admin");
		driver.findElement(By.id("cancelBtn")).click();
		driver.quit();
		}
	@Test
	public void AdminClickingOnchakeBox_RequireTheUserToChangeTheirPasswordOnNextLogAndClickingOnCencelButton() throws InterruptedException {
		//Common Code
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		//Common code
		driver.get("http://localhost:8080/identityiq/identities/identities.jsf#/quickLinks/Manage%20Accounts/identities");
		driver.findElement(By.id("loginForm:accountId")).sendKeys("spadmin");
		driver.findElement(By.id("loginForm:password")).sendKeys("admin");
		driver.findElement(By.id("loginForm:loginButton")).click();
		driver.findElement(By.id("searchInput")).sendKeys("The Administrator");
		driver.findElement(By.xpath("//*[@id=\"searchBtn\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"0a0000fa80ce10c68180ce11410000ffManageButton\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-identity-login-password\"]")).click();
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.id("confirmPassword")).sendKeys("admin");
		//Thread.sleep(5);
		//driver.findElement(By.xpath("//*[@id=\"identity-login-password-container\"]/div[2]/form/div[3]/label")).click();
		driver.findElement(By.id("cancelBtn")).click();
		driver.quit();
		
	}
	@Test
	public void AdminClickingOnchakeBox_RequireTheUserToChangeTheirPasswordOnNextLogInAndClickingOnSubmitButton() throws InterruptedException {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		//Common code
		driver.get("http://localhost:8080/identityiq/identities/identities.jsf#/quickLinks/Manage%20Accounts/identities");
		driver.findElement(By.id("loginForm:accountId")).sendKeys("spadmin");
		driver.findElement(By.id("loginForm:password")).sendKeys("admin");
		driver.findElement(By.id("loginForm:loginButton")).click();
		driver.findElement(By.id("searchInput")).sendKeys("The Administrator");
		driver.findElement(By.xpath("//*[@id=\"searchBtn\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"0a0000fa80ce10c68180ce11410000ffManageButton\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-identity-login-password\"]")).click();
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.id("confirmPassword")).sendKeys("admin");
		//Thread.sleep(5000);
		//driver.findElement(By.id("requireResetPassword")).click();
		//driver.findElement(By.id("submitBtn")).click();
		driver.quit();		
		
	}
}
