package Mindtree.Project_scriptss;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1_project {
//	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mindsdet296\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.urbanladder.com/");
		//d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//wait for n no. of sec before throwing exception
		Thread.sleep(5000L);
		Actions at= new Actions(d);
		at.moveToElement(d.findElement(By.cssSelector("li.topnav_item.livingunit"))).build().perform();
		Thread.sleep(2000L);
		d.findElement(By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[2]/div/div/ul/li[1]/ul/li[1]")).click();
		Thread.sleep(5000L);
		d.findElement(By.cssSelector("#authentication_popup > div.vert-wrapper > div > div.popup-text.text-center.vert.large-6.columns > a.close-reveal-modal.hide-mobile")).click(); //close the pop up
		//d.findElement(By.cssSelector("#content > div.categories.row > div > ul > li:nth-child(2) > div > a.product-img")).click();//click on image
		d.findElement(By.xpath("//*[@id='content']/div[3]/div/ul/li[2]/div/a[1]")).click();
		//d.findElement(By.cssSelector("a.product-img")).click();
		d.findElement(By.xpath("//*[@id=\"product-overview\"]/ul/li[2]")).click();//change color to grey
		Thread.sleep(2000L);
		d.findElement(By.id("add-to-cart-button")).click();// add to cart
	}

}
