package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screenshot {
	@Test

	public static void Utility(WebDriver driver, String Screenshot) 
	{
        try {
			TakesScreenshot sc= (TakesScreenshot)driver;
			File src =sc.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src,new File("./Screenshots/" +Screenshot+ ".png"));
		
		} 
        catch (IOException e) 
        
        {
			
			System.out.println("Exception while taking screemshot "+e.getMessage());
		}
        
        
	}
}
