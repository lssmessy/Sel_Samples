import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.opera.core.systems.internal.ImplicitWait;


public class Way2sms {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*String s=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", s+"\\Chrome090615\\chromedriver.exe");*/
			FirefoxDriver driver=new FirefoxDriver();
			try{
				driver.manage().window().maximize();
			driver.get("http://site21.way2sms.com/content/index.html");
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElementByXPath("//*[@id='username']").sendKeys("9426576315");
			driver.findElementByXPath("//*[@id='password']").sendKeys("8051");
			driver.findElementByXPath("//*[@id='loginBTN']").click();
			
			//driver.findElement(By.id("ebFrm")).click();
			System.out.println("Waiting for 5 secs");
			WebElement we=(new WebDriverWait(driver, 5)).until(ExpectedConditions.elementToBeClickable(By.id("ebFrm")));
			System.out.println(we.isDisplayed());
			if(we.isDisplayed()==true){
				//driver.findElement(By.id("ebFrm")).click();
				driver.findElementByXPath("//*[@id='ebFrm']/div[2]/div[1]/input").click();	
				System.out.println("WE cliekded");
				}else{
					System.out.println("Not found");
					new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.id("ebFrm")));
				}
			
			driver.findElementByXPath("//*[@id='sendSMS']/a").click();
			System.out.println("Sent sms Clicked ");
			WebElement mo=(new WebDriverWait(driver, 15)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#mobile")));
			System.out.println("after 15 secs");
			boolean dis=mo.isDisplayed();
			System.out.println(dis);
								
			}catch(Exception e){
				e.printStackTrace();
			}
			
		
	}

}
