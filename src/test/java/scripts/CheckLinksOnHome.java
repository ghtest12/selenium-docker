package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import objectrepository.homeOR;

public class CheckLinksOnHome {
	@Test
	public void checkLinksOnHome1() throws InterruptedException {
		CreateDriver cd = new CreateDriver();
		WebDriver driver = cd.returnChromeDriver();
		
		driver.get("http://192.168.29.159/carrental/");
		
		homeOR home = new homeOR(driver);
		home.homeLinksVerification(driver);
		
	}
	@Test
	public void checkLinksOnHome2() throws InterruptedException {
		CreateDriver cd = new CreateDriver();
		WebDriver driver = cd.returnChromeDriver();
		
		driver.get("http://192.168.29.159/carrental/");
		
		homeOR home = new homeOR(driver);
		home.homeLinksVerification(driver);
		
	}
	@Test
	public void checkLinksOnHome3() throws InterruptedException {
		CreateDriver cd = new CreateDriver();
		WebDriver driver = cd.returnChromeDriver();
		
		driver.get("http://192.168.29.159/carrental/");
		
		homeOR home = new homeOR(driver);
		home.homeLinksVerification(driver);
		
	}
	@Test
	public void checkLinksOnHome4() throws InterruptedException {
		CreateDriver cd = new CreateDriver();
		WebDriver driver = cd.returnChromeDriver();
		
		driver.get("http://192.168.29.159/carrental/");
		
		homeOR home = new homeOR(driver);
		home.homeLinksVerification(driver);
		
	}
}