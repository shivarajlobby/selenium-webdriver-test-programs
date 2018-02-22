package command.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GeckoDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		   //Change the path based on your file path
        //System.setProperty("webdriver.gecko.driver","Path of geckodriver.exe")

        System.setProperty("webdriver.gecko.driver","C:\\softwares\\geckodriver.exe"); 

        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://www.softwaretestingmaterial.com/software-testing-interview-questions-free-ebook/");
        
        System.out.println("Selenium Webdriver Script in Firefox browser using Gecko Driver | Software Testing Material");
        
        driver.close();
	
	}

}
