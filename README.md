# How to do some things in Selenium
**Verify All broken links on a web page**   
Approach - Get all the links into a List of elements. Get a list of Strings with values of "href" attribute. Then pass these values in a loop to the verifyLinks mehtod. This verify link method can take value as string (or the URL from above list) and verify responseCode for same. We can do this using **HttpURLConnection** class as:  
      URL url = new URL("https://demo.nopcommerce.com/vendor/apply");  
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();  
			conn.connect();    	
			int resCode = conn.getResponseCode();  
			String message = conn.getResponseMessage();  
In the same way we use and check responseCodes and responseMessages provided in **HttpURLConnection** class  

**Different wait types in Selenium and there SYNTAX and Usage**  
If we have Implicit wait applied in Base class. Then first stop implicit wait, then apply Explicit wait and again initialize implicit wait.Two types of waits can cause asynchronous issues and possiblitiy is may none of those is not applied. Try to avoid Implicit wait and make some generic methods for Explicit waits and use them in framework wherever required.  
**1.) Implicit - SYNTAX ->**  
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
**2.) Explicit Wait ->  SYNTAX ->**  
WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));  
wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("Locator value")));  
We can wait for multiple expected conditions like ::  
wait.until(expectedConditions.visibilityOfElementLocated  
				.titleContains("Title Value")  
				.frameToBeAvailableAndSwitchToIt("Frame Locator or element etc");  
				And Many more what we can think of applying.  
**3.) Fluent Waits ->**  
Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)  
  .withTimeout(30, TimeUnit.SECONDS)  
  .pollingEvery(5, TimeUnit.SECONDS)  
  .ignoring(NoSuchElementException.class);  
**4.) Script Timeout and pageLoadTimeout->**  
driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));  
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));.  



