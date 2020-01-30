package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Master {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sarvan\\eclipse-workspace\\Manojdurairaj\\selenium\\driver\\chromedriver.exe");
	WebDriver m=new ChromeDriver();
	//m.get("https://www.adactin.com/HotelApp/index.php");
    m.get("https://www.adactin.com/HotelApp/Register.php");

}
}