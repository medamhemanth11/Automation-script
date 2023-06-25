package com.hemanth;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class Codingninjas {
	WebDriver driver;	
		public static void main(String[] args) throws Exception {
	        //System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://sakshingp.github.io/assignment/login.html");
	        driver.manage().window().maximize();
	        driver.findElement(By.xpath("//*[@id=\"username\"]")).clear();
	        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("j2ee");
	        //driver.findElement(By.name("password")).clear();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
	        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("j2ee");
	        //sendKeys("j2ee");
	        driver.findElement(By.xpath("//*[@id=\"log-in\"]")).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath("//*[@id=\"amount\"]")).click();

	        

	    }

	}