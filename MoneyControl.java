package test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoneyControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.driver", ".//Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://wwww.moneycontrol.com");
		driver.findElement(By.xpath("(//a[@title='Stocks'])[1]")).click();
		driver.findElement(By.xpath("(//a[@title='A'])[1]")).click();
		WebElement tableEle = driver.findElement(By.xpath("//div[@class='PT15']"));

		List<WebElement> links = tableEle.findElements(By.tagName("A"));
		int linkscount = links.size();
		for(WebElement link:links)
		{
		String text=link.getText();
		System.out.println(text);
		String linktext=link.getAttribute("href");
		}

	}

}
