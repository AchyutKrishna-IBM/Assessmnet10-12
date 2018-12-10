package test2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DataTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://datatables.net");
		WebElement exampleEle = driver.findElement(By.xpath("//select[@name='example_length']"));

		Select s = new Select(exampleEle);
		s.selectByValue("50");
		WebElement tableEle = driver.findElement(By.xpath("//@table[id='example']"));
		WebElement bodyEle = tableEle.findElement(By.xpath("//@table[id='example']/tbody"));
		WebElement rowsEle = bodyEle.findElement(By.xpath("//@table[id='example']/tbody/tr"));
		rowsEle.findElement(By.xpath("//@table[id='example']/tbody/tr/td"));

	}

}
