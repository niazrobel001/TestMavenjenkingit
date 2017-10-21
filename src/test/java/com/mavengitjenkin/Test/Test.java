package com.mavengitjenkin.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test 
{
    public static void main( String[] args )
    {
    	WebDriver driver =new FirefoxDriver();
    	driver.get("https://www.facebook.com/");
    	driver.close();
        System.out.println( "This is the test!" );
    }
}
