package scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CreateDriver {
	public WebDriver returnChromeDriver() {	
//		DesiredCapabilities dc = DesiredCapabilities.chrome();
//		System.setProperty("webdriver.chrome.driver", "servers/chromedriver.exe");
//		
//		WebDriver driver = null;
//		try {
//			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		}
//		//WebDriver driver = new ChromeDriver();
//		return driver;
		
		//BROWSER => chrome/firefox
		//HUB_HOST => localhost
		
		String host = "localhost";
		DesiredCapabilities dc;
		
		if(System.getProperty("BROWSER") != null && System.getProperty("BROWSER").equalsIgnoreCase("firefox")) {
			dc = DesiredCapabilities.firefox();
		}
		else {
			dc = DesiredCapabilities.chrome();
		}
		if(System.getProperty("HUB_HOST") != null) {
			host = System.getProperty("HUB_HOST");
		}
		
		WebDriver driver = null;
		try {
			driver = new RemoteWebDriver(new URL("http://"+host+":4444/wd/hub"), dc);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		return driver;
	}
}
