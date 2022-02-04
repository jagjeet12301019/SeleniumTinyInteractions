package seleniumInteractionsPart1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckRadioAndCheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		// Setup code 
		WebDriver driver = new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Start TC with finding elements 
		WebElement radioButtonBMW = driver.findElement(By.cssSelector("input[id=bmwradio"));
		radioButtonBMW.click();
		Thread.sleep(2000);

		WebElement radioButtonBenz = driver.findElement(By.cssSelector("input[id=benzradio"));
		radioButtonBenz.click();
		Thread.sleep(2000);

		WebElement radioButtonHonda = driver.findElement(By.cssSelector("input[id='hondaradio']"));

		// check if particular radio button is selected or not? element.esiSelected()
		System.out.println(radioButtonBMW.isSelected());
		System.out.println(radioButtonBenz.isSelected());
		System.out.println(radioButtonHonda.isSelected());

		// Check-boxes - multiple can be checked together.Value of name attribute should
		// be same but is different for value attribute's value
		WebElement checkBoxBMW = driver.findElement(By.cssSelector("#bmwcheck"));
		checkBoxBMW.click();
		Thread.sleep(2000);

		WebElement checkBoxBenz = driver.findElement(By.cssSelector("#benzcheck"));
		checkBoxBenz.click();
		Thread.sleep(2000);

		WebElement checkBoxHonda = driver.findElement(By.cssSelector("#hondacheck"));
		System.out.println(checkBoxBMW.isSelected());
		System.out.println(checkBoxBenz.isSelected());
		System.out.println(checkBoxHonda.isSelected());
		Thread.sleep(5000);		
		
		driver.quit();
	}

}
