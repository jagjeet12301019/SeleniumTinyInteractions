package seleniumInteractionsPart1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetTextFromAnElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String title = driver.getTitle();
		
		if(title.equals(title)) {
			System.out.println("good");
			driver.get("https://demo.nopcommerce.com/");
			String textElement = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/digital-downloads']")).getText();
			System.out.println("Text On Element is - " + textElement);
			}else {
				System.out.println("something went wrong");
			}
		driver.quit();

	}

}
