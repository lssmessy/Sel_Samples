import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
			String s=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", s+"\\Chrome090615\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			try{
				driver.manage().window().maximize();
			driver.get("http://site21.way2sms.com/content/index.html");
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElementByXPath("//*[@id='username']").sendKeys("9426576315");
			driver.findElementByXPath("//*[@id='password']").sendKeys("6881");
			driver.findElementByXPath("//*[@id='loginBTN']").click();
			if(driver.findElementByXPath("//*[@id='ebFrm']/div[2]/div[1]/input").isDisplayed()==true)
			{
			driver.findElementByXPath("//*[@id='ebFrm']/div[2]/div[1]/input").click();
			}
			else {
				new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.id("ebFrm")));
				System.out.println("Waiting for 5 secs");
			}
			boolean ispresent=driver.findElementByXPath("//*[@id='sendSMS']/a").isDisplayed();
			driver.findElementByXPath("//*[@id='sendSMS']/a").click();
			System.out.println("Clicked sendSms");
			/*driver.findElementByXPath("//*[@id='sentSMS']/a").click();
			System.out.println("Sent sms Clicked ");*/
					
			while(driver.findElement(By.cssSelector("#mobile")).isDisplayed()==false)
			{
				System.out.println("In while loop");
				try{
				boolean visible=driver.findElement(By.cssSelector("#mobile")).isDisplayed();
				if(visible==true) break;
				else continue;
				}catch(NoSuchElementException e){
					e.printStackTrace();
					continue;
				}
					
			}
			System.out.println("After 10 secs");
			driver.findElementByXPath("//*[@id='frd']").click();
			System.out.println("Forward cliecked");
						
					
			}catch(Exception e){
				e.printStackTrace();
			}
			
		
	}

}
