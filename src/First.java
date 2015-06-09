import java.io.File;
import java.nio.file.Path;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.Select;
import org.apache.commons.lang3.SystemUtils;
import org.jboss.netty.util.internal.SystemPropertyUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class First {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", s+"\\ChromeDriver\\chromedriver.exe");
		ChromeDriver ff=new ChromeDriver();
////		
//		FirefoxDriver ff=new FirefoxDriver();
		ff.manage().window().maximize();
		ff.get("https://twitter.com");
	/// Login credentials
		
		ff.findElement(By.id("signin-email")).sendKeys("nilam@inheritx.com");
		
		ff.findElement(By.id("signin-password")).sendKeys("inx@123");
		
		ff.findElement(By.xpath("//*[@id='front-container']/div[2]/div[2]/form/table/tbody/tr/td[2]/button")).click();
				
		//click on home tab
		ff.findElement(By.xpath("//*[@id='global-nav-home']/a")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ff.findElement(By.id("user-dropdown-toggle")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ff.close();
		
		
		//ff.findElement(By.xpath("//*[@id='signout-button']/button")).click();
		
		
		}
		
		
		
	}


