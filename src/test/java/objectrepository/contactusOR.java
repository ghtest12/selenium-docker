package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class contactusOR {
	WebDriver driver;
	public contactusOR(WebDriver driver){
		this.driver = driver;
	}
	public WebElement contactuslink() {
		WebElement contactuslink = driver.findElement(By.xpath("//a[text()='Contact Us']"));
		return contactuslink;
	}
	public WebElement userenterfullnamecontactus() {
		WebElement fullnameelement = driver.findElement(By.xpath("//input[@id='fullname']"));
		return fullnameelement;
	}
	public WebElement userenteremailcontactus() {
		WebElement emailelement = driver.findElement(By.xpath("//input[@id='emailaddress']"));
		return emailelement;
	}
	public WebElement userenterphonecontactus() {
		WebElement phoneelement = driver.findElement(By.xpath("//input[@id='phonenumber']"));
		return phoneelement;
	}
	public WebElement userentermessagecontactus() {
		WebElement messageelement = driver.findElement(By.xpath("//textarea[@name='message']"));
		return messageelement;
	}
	public WebElement userclickonsendmessagecontactus() {
		WebElement sendbuttonelement = driver.findElement(By.xpath("//button[@name='send']"));
		return sendbuttonelement;
	}
	public WebElement checkcontactussuccessmsg() {
		WebElement successmsgelement = driver.findElement(By.cssSelector(".succWrap"));
		return successmsgelement;
	}
	
	public void contactUs(WebDriver driver) throws InterruptedException {
		
		contactusOR ctus = new contactusOR(driver); 
		
		Thread.sleep(1000);
		ctus.contactuslink().click();
		
		Thread.sleep(1000);
		
		ctus.userenterfullnamecontactus().sendKeys("subbu");
		ctus.userenteremailcontactus().sendKeys("subbu1@gmail.com");
		ctus.userenterphonecontactus().sendKeys("6767676767");
		ctus.userentermessagecontactus().sendKeys("Hello1");
		ctus.userclickonsendmessagecontactus().click();
		Thread.sleep(1000);
		
		String message = ctus.checkcontactussuccessmsg().getText();
		Thread.sleep(1000);
		
		System.out.println(message);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(message, "SUCCESS:Query Sent. We will contact you shortly");
		driver.quit();
	}
}
