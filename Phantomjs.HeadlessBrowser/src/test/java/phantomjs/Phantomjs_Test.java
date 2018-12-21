package phantomjs;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

import screenShot.Screenshot;

public class Phantomjs_Test {
	@Test
	public void Phantomjs() 
	{
        File src = new File("C:\\Program Files\\Selenium\\Phantomjs\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe\\");
        System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
        WebDriver driver = new PhantomJSDriver();
        driver.get("https://www.google.com/");
        System.out.println("Title of the page is "+driver.getTitle());
        Screenshot.Utility(driver, "Home Page");
        
	}
}
