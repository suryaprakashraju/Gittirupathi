package tirupathi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	
		
	}

}
