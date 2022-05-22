package Mindtree.Project_scriptss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo3_pro_implicit {

	 public static void main(String[] args) throws InterruptedException {
			// how to add to wish list for a registered customer
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mindsdet296\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver d= new ChromeDriver();
			d.get("https://www.urbanladder.com/");
			d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//wait for n no. of sec before throwing exception
			Actions at= new Actions(d);
			at.moveToElement(d.findElement(By.cssSelector("li.topnav_item.studyunit"))).build().perform(); //move to study

			d.findElement(By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[7]/div/div/ul/li[1]/ul/li[4]/a")).click(); // study tables with storage

			d.findElement(By.xpath("//*[@id=\"authentication_popup\"]/div[1]/div/div[2]/a[1]")).click(); //close the pop up

			at.moveToElement(d.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/ul/li[1]/div/a"))).build().perform();//moving cursor to image
			Thread.sleep(1000L);
			d.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/ul/li[1]/div/div[6]/span[1]")).click();//click on add to wish list
			Thread.sleep(4000L);
			at.moveToElement(d.findElement(By.xpath("//*[@placeholder='Email Address']"))).click().sendKeys("varthya1@gmail.com").build().perform();

			d.findElement(By.xpath("//*[@placeholder='Password']")).click();
			d.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("west@1234");
			d.findElement(By.cssSelector("input#ul_site_login.button.primary")).click();

	}

}
