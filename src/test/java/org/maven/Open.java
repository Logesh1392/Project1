package org.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Divya Lokesh\\eclipse-workspace\\MavenProject\\Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.facebook.com/");
	}

}
