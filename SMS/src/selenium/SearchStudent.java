package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchStudent {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","H:\\TR soft\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:9090/studentmanagement/login.jsp");
		Thread.sleep(6000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"uname\"]")).sendKeys("slk");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("slk");
		Thread.sleep(2000);
		driver.findElement(By.className("button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/nav[1]/ul/li[4]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/center/nav[2]/nav/nav/nav/nav/div/form/input")).sendKeys("s004");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/center/nav[2]/nav/nav/nav/nav/div/form/button")).click();
		Thread.sleep(2000);

	}

}
