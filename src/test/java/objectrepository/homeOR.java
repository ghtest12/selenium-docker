package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class homeOR {
	WebDriver driver;
	public homeOR(WebDriver driver){
		this.driver = driver;
	}
	public WebElement homelink() {
		WebElement homelink = driver.findElement(By.xpath("//a[text()='Home']"));
		return homelink;
	}
	public WebElement aboutuslink() {
		WebElement aboutuslink = driver.findElement(By.xpath("//a[text()='About Us']"));
		return aboutuslink;
	}
	public WebElement carlistinglink() {
		WebElement carlistinglink = driver.findElement(By.xpath("//a[text()='Car Listing']"));
		return carlistinglink;
	}
	public WebElement faqslink() {
		WebElement faqslink = driver.findElement(By.xpath("//a[text()='FAQs']"));
		return faqslink;
	}
	
	public void homeLinksVerification(WebDriver driver) throws InterruptedException {
		System.out.println("Running TC");
		homeOR home = new homeOR(driver); 
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(home.homelink().isDisplayed() && home.homelink().isEnabled());
		softAssert.assertTrue(home.aboutuslink().isDisplayed() && home.aboutuslink().isEnabled());
		softAssert.assertTrue(home.carlistinglink().isDisplayed() && home.carlistinglink().isEnabled());
		softAssert.assertTrue(home.faqslink().isDisplayed() && home.faqslink().isEnabled());
		softAssert.assertAll();
		driver.quit();
	}
}
