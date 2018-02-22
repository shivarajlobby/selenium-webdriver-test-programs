package command.org;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HandleScroll {

	 @Test (enabled=false)
	public void scrollDown(){
		System.setProperty("webdriver.gecko.driver","C:\\softwares\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.softwaretestingmaterial.com");
		//to perform Scroll on application using  Selenium
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(50,600)", "");
}
}