package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import objectrepository.contactusOR;

public class ContactUs {
	@Test
	public void contactUs1() throws InterruptedException {
		CreateDriver cd = new CreateDriver();
		WebDriver driver = cd.returnChromeDriver();
		
		driver.get("http://192.168.29.159/carrental/");
		
		contactusOR ctus = new contactusOR(driver);
		ctus.contactUs(driver);
		
	}
	
	@Test
	public void contactUs2() throws InterruptedException {
		CreateDriver cd = new CreateDriver();
		WebDriver driver = cd.returnChromeDriver();
		
		driver.get("http://192.168.29.159/carrental/");
		
		contactusOR ctus = new contactusOR(driver);
		ctus.contactUs(driver);
		
	}
	
	@Test
	public void contactUs3() throws InterruptedException {
		CreateDriver cd = new CreateDriver();
		WebDriver driver = cd.returnChromeDriver();
		
		driver.get("http://192.168.29.159/carrental/");
		
		contactusOR ctus = new contactusOR(driver);
		ctus.contactUs(driver);
		
	}
	
	@Test
	public void contactUs4() throws InterruptedException {
		CreateDriver cd = new CreateDriver();
		WebDriver driver = cd.returnChromeDriver();
		
		driver.get("http://192.168.29.159/carrental/");
		
		contactusOR ctus = new contactusOR(driver);
		ctus.contactUs(driver);
		
	}
	
//	@Test
//	public void contactUs5() throws InterruptedException {
//		CreateDriver cd = new CreateDriver();
//		WebDriver driver = cd.returnChromeDriver();
//		
//		driver.get("http://192.168.29.159/carrental/");
//		
//		contactusOR ctus = new contactusOR(driver);
//		ctus.contactUs(driver);
//		
//	}
//	
//	@Test
//	public void contactUs6() throws InterruptedException {
//		CreateDriver cd = new CreateDriver();
//		WebDriver driver = cd.returnChromeDriver();
//		
//		driver.get("http://192.168.29.159/carrental/");
//		
//		contactusOR ctus = new contactusOR(driver);
//		ctus.contactUs(driver);
//		
//	}
//	
//	@Test
//	public void contactUs7() throws InterruptedException {
//		CreateDriver cd = new CreateDriver();
//		WebDriver driver = cd.returnChromeDriver();
//		
//		driver.get("http://192.168.29.159/carrental/");
//		
//		contactusOR ctus = new contactusOR(driver);
//		ctus.contactUs(driver);
//		
//	}
//	
//	@Test
//	public void contactUs8() throws InterruptedException {
//		CreateDriver cd = new CreateDriver();
//		WebDriver driver = cd.returnChromeDriver();
//		
//		driver.get("http://192.168.29.159/carrental/");
//		
//		contactusOR ctus = new contactusOR(driver);
//		ctus.contactUs(driver);
//		
//	}
//	
//	@Test
//	public void contactUs9() throws InterruptedException {
//		CreateDriver cd = new CreateDriver();
//		WebDriver driver = cd.returnChromeDriver();
//		
//		driver.get("http://192.168.29.159/carrental/");
//		
//		contactusOR ctus = new contactusOR(driver);
//		ctus.contactUs(driver);
//		
//	}
//	
//	@Test
//	public void contactUs10() throws InterruptedException {
//		CreateDriver cd = new CreateDriver();
//		WebDriver driver = cd.returnChromeDriver();
//		
//		driver.get("http://192.168.29.159/carrental/");
//		
//		contactusOR ctus = new contactusOR(driver);
//		ctus.contactUs(driver);
//		
//	}
//	
//	@Test
//	public void contactUs11() throws InterruptedException {
//		CreateDriver cd = new CreateDriver();
//		WebDriver driver = cd.returnChromeDriver();
//		
//		driver.get("http://192.168.29.159/carrental/");
//		
//		contactusOR ctus = new contactusOR(driver);
//		ctus.contactUs(driver);
//		
//	}
//	
//	@Test
//	public void contactUs12() throws InterruptedException {
//		CreateDriver cd = new CreateDriver();
//		WebDriver driver = cd.returnChromeDriver();
//		
//		driver.get("http://192.168.29.159/carrental/");
//		
//		contactusOR ctus = new contactusOR(driver);
//		ctus.contactUs(driver);
//		
//	}
//	
//	@Test
//	public void contactUs13() throws InterruptedException {
//		CreateDriver cd = new CreateDriver();
//		WebDriver driver = cd.returnChromeDriver();
//		
//		driver.get("http://192.168.29.159/carrental/");
//		
//		contactusOR ctus = new contactusOR(driver);
//		ctus.contactUs(driver);
//		
//	}
//	
//	@Test
//	public void contactUs14() throws InterruptedException {
//		CreateDriver cd = new CreateDriver();
//		WebDriver driver = cd.returnChromeDriver();
//		
//		driver.get("http://192.168.29.159/carrental/");
//		
//		contactusOR ctus = new contactusOR(driver);
//		ctus.contactUs(driver);
//		
//	}
//	
//	@Test
//	public void contactUs15() throws InterruptedException {
//		CreateDriver cd = new CreateDriver();
//		WebDriver driver = cd.returnChromeDriver();
//		
//		driver.get("http://192.168.29.159/carrental/");
//		
//		contactusOR ctus = new contactusOR(driver);
//		ctus.contactUs(driver);
//		
//	}
//	
//	@Test
//	public void contactUs16() throws InterruptedException {
//		CreateDriver cd = new CreateDriver();
//		WebDriver driver = cd.returnChromeDriver();
//		
//		driver.get("http://192.168.29.159/carrental/");
//		
//		contactusOR ctus = new contactusOR(driver);
//		ctus.contactUs(driver);
//		
//	}
//	
//	@Test
//	public void contactUs17() throws InterruptedException {
//		CreateDriver cd = new CreateDriver();
//		WebDriver driver = cd.returnChromeDriver();
//		
//		driver.get("http://192.168.29.159/carrental/");
//		
//		contactusOR ctus = new contactusOR(driver);
//		ctus.contactUs(driver);
//		
//	}
//	
//	@Test
//	public void contactUs18() throws InterruptedException {
//		CreateDriver cd = new CreateDriver();
//		WebDriver driver = cd.returnChromeDriver();
//		
//		driver.get("http://192.168.29.159/carrental/");
//		
//		contactusOR ctus = new contactusOR(driver);
//		ctus.contactUs(driver);
//		
//	}
//	
//	@Test
//	public void contactUs19() throws InterruptedException {
//		CreateDriver cd = new CreateDriver();
//		WebDriver driver = cd.returnChromeDriver();
//		
//		driver.get("http://192.168.29.159/carrental/");
//		
//		contactusOR ctus = new contactusOR(driver);
//		ctus.contactUs(driver);
//		
//	}
//	
//	@Test
//	public void contactUs20() throws InterruptedException {
//		CreateDriver cd = new CreateDriver();
//		WebDriver driver = cd.returnChromeDriver();
//		
//		driver.get("http://192.168.29.159/carrental/");
//		
//		contactusOR ctus = new contactusOR(driver);
//		ctus.contactUs(driver);
//		
//	}
//	
//	@Test
//	public void contactUs21() throws InterruptedException {
//		CreateDriver cd = new CreateDriver();
//		WebDriver driver = cd.returnChromeDriver();
//		
//		driver.get("http://192.168.29.159/carrental/");
//		
//		contactusOR ctus = new contactusOR(driver);
//		ctus.contactUs(driver);
//		
//	}
//	
//	@Test
//	public void contactUs22() throws InterruptedException {
//		CreateDriver cd = new CreateDriver();
//		WebDriver driver = cd.returnChromeDriver();
//		
//		driver.get("http://192.168.29.159/carrental/");
//		
//		contactusOR ctus = new contactusOR(driver);
//		ctus.contactUs(driver);
//		
//	}
//	
//	@Test
//	public void contactUs23() throws InterruptedException {
//		CreateDriver cd = new CreateDriver();
//		WebDriver driver = cd.returnChromeDriver();
//		
//		driver.get("http://192.168.29.159/carrental/");
//		
//		contactusOR ctus = new contactusOR(driver);
//		ctus.contactUs(driver);
//		
//	}
//	
//	@Test
//	public void contactUs24() throws InterruptedException {
//		CreateDriver cd = new CreateDriver();
//		WebDriver driver = cd.returnChromeDriver();
//		
//		driver.get("http://192.168.29.159/carrental/");
//		
//		contactusOR ctus = new contactusOR(driver);
//		ctus.contactUs(driver);
//		
//	}
//	
//	@Test
//	public void contactUs25() throws InterruptedException {
//		CreateDriver cd = new CreateDriver();
//		WebDriver driver = cd.returnChromeDriver();
//		
//		driver.get("http://192.168.29.159/carrental/");
//		
//		contactusOR ctus = new contactusOR(driver);
//		ctus.contactUs(driver);
//		
//	}

}
