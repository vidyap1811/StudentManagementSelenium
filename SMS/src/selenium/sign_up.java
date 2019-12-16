package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sign_up {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","H:\\TR soft\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:9090/studentmanagement/login.jsp");
		Thread.sleep(6000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/center[2]/div/input")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/form/center/input[1]")).sendKeys("slk");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/form/center/input[2]")).sendKeys("slk");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/form/center/input[3]")).sendKeys("slk");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/form/center/div/button")).click();

	}

}
