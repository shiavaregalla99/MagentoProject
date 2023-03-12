package com.magento.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.magento.utils.ConfigsReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
      public static WebDriver driver;
      
      public static WebDriver setUp(String browserName) throws Exception {
       ConfigsReader.readProperties(".\\src\\test\\resources\\Configuration\\configs.properties");
    	  
    	  switch(browserName) {
    	   case "chrome":
    		   WebDriverManager.chromedriver().setup();
    		   driver=new ChromeDriver();
    		   break;
    	   case "firefox":
    		   WebDriverManager.firefoxdriver().setup();
    		   driver=new FirefoxDriver();
    		   break;
    	   case "ie":
    		   WebDriverManager.iedriver().setup();
    		   driver=new InternetExplorerDriver();
    		   break;
    	   default:
    		   throw new Exception("invalid browser Selected By user");
    	   
    	   }
    	   driver.get(ConfigsReader.getKey("URL"));
    	   driver.manage().window().maximize();
    	   PageIntializer.intialize();
    	   return driver;
     
      
      }
      
      public static void tearDown() {
    	  if(driver!=null)
    		  driver.close();
      }
}
