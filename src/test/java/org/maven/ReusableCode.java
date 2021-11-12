package org.maven;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReusableCode {
	public WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Divya Lokesh\\eclipse-workspace\\MavenProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;

	}

	public void launchUrl(WebDriver driver,String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
		public void type(WebElement element,String data) {
			element.sendKeys(data);
		}
		
		public void btnClick(WebElement element) {
			element.click();
			}
		public void clear(WebElement element) {
			element.clear();

		}
		public void quitBrowser(WebDriver driver) {
			driver.quit();
		}
		public String pageUrl(WebDriver driver) { 
			
			String url = driver.getCurrentUrl();
			return url;
			
		}
		public String getPageTitle(WebDriver driver) {
			String title = driver.getTitle();
			return title;
		}
		public String getPageSource(WebDriver driver) {
			String pageSource = driver.getPageSource();
			return pageSource;
		}
		
		public String getText(WebElement element) {
			String text = element.getText();
			return text;
		}
		public String getTagName(WebElement element) {
			String tagName = element.getTagName();
			return tagName;
		}
		public String getAttribute(WebElement element) {
			String attribute = element.getAttribute(null);
			return attribute;

		}
		public String getCssValue(WebElement element) {
			String cssValue = element.getCssValue(null);
			return cssValue;
		}
		public Object takeScreenshot(WebElement element) {
			Object screenshotAs = element.getScreenshotAs(null);
			return screenshotAs;
			

		}
		public Dimension getSize(WebElement element) {
			Dimension size = element.getSize();
			return size;

		}
		
		public  int getcurrenttime() {
			long currentDateMS = new Date().getTime();
			int seconds = (int) ((currentDateMS / 1000) % 3600);
			return seconds;
		}
		public void Select_The_CheckBox_from_List(WebElement element, String valueToSelect) {
			List<WebElement> allOptions = element.findElements(By.tagName("input"));
			for (WebElement option : allOptions) {
				   System.out.println("Option value "+option.getText());
				        if (valueToSelect.equals(option.getText())) {
				            option.click();
				            break;
				        }
				    }
		}
		
		}
		

