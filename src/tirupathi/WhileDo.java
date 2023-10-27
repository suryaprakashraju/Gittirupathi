package tirupathi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhileDo {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.close();
		
		

		
		
	}

}
