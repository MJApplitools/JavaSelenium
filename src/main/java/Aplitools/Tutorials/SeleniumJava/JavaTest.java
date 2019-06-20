package Aplitools.Tutorials.SeleniumJava;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.applitools.eyes.selenium.Eyes; 
import com.applitools.eyes.RectangleSize; 

public class JavaTest {

	public static void javaTest() {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver(); 
		Eyes eyes = new Eyes(); 
		
		eyes.setApiKey("Api Key");
		
		try {
			
			eyes.open(driver, "appName", "Login Window", new RectangleSize(600, 400)); 
			driver.get("https://demo.applitools.com");
			eyes.checkWindow("Login Window"); 
			
			eyes.close();
			
		} catch( Exception e) {
			e.printStackTrace();
		} finally {
			driver.quit();
			eyes.abortIfNotClosed();
			System.exit(0);
		}
		
	}

}
