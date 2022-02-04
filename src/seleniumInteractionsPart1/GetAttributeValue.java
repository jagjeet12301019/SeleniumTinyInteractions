package seleniumInteractionsPart1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Setup code 
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement element = driver.findElement(By.xpath("//button[@type='submit' and text()='Search']"));
		String attributeCLassValue = element.getAttribute("class");
		System.out.println("Class of the button is ::- " + attributeCLassValue);
		driver.quit();

	}

}
