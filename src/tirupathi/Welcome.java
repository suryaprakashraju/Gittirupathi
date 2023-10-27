package tirupathi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Welcome {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.out.println("Sambasivarao");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("java");
		

	}

}
