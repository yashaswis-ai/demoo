package com.abc.magento;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import okio.Timeout;

public class MagentoLogin {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		FileInputStream fis = new FileInputStream("D:\\Testing\\Automation\\class\\xyz\\DataDrivenFramework\\src\\com\\abc\\utilities\\DataDriven.properties");
		Properties property = new Properties();
		property.load(fis);
		
		String urldata = property.getProperty("urldata");
		String emaildata = property.getProperty("emaildata");
		String passworddata = property.getProperty("passworddata");
		
		String myaccountlocator = property.getProperty("myaccount");
		String emaillocator = property.getProperty("email");
		String passwordlocator = property.getProperty("password");
		String loginlocator = property.getProperty("login");
		String logoutlocator = property.getProperty("logout");
		
		System.out.println(urldata);
		System.out.println(emaildata);
		System.out.println(passworddata);
		
		System.out.println(myaccountlocator);
		System.out.println(emaillocator);
		System.out.println(passwordlocator);
		System.out.println(loginlocator);
		System.out.println(logoutlocator);
		
		driver.get(urldata);
		
		driver.findElement(By.xpath(myaccountlocator)).click();
		driver.findElement(By.xpath(emaillocator)).sendKeys(emaildata);
		driver.findElement(By.xpath(passwordlocator)).sendKeys(passworddata);
		driver.findElement(By.xpath(loginlocator)).click();
		driver.findElement(By.xpath(logoutlocator)).click();
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
