package Coditional_Statetements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_Case {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		

		String websiteName = "flipkart11";

		switch (websiteName)
		{
		
		case "Google":
			driver.get("https://www.google.co.in/");
			break;
			
		case "amazon" :
			driver.get("https://www.amazon.co.in/");
			break;
			
		case "flipkart" :
			driver.get("https://www.flipkart.co.in/");
			break;
			
		case "facebook" :
			driver.get("https://www.facebook.co.in/");
			break;
			
		default: 
			System.out.println("Not a valid website Name");
		}
	}

}
