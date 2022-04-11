# How to do some things in Selenium
**Verify All broken links on a web page** 
Approach - Get all the links into a List of elements. Get a list of Strings with values of "href" attribute. Then pass these values in a loop to the verifyLinks mehtod. This verify link method can take value as string (or the URL from above list) and verify responseCode for same. We can do this using **HttpURLConnection** class as:  
      URL url = new URL("https://demo.nopcommerce.com/vendor/apply");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.connect();			
			int resCode = conn.getResponseCode();  
