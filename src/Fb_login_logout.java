import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.Element;


public class Fb_login_logout {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", s+"\\ChromeDriver\\chromedriver.exe");
		ChromeDriver ff=new ChromeDriver();
		//FirefoxDriver ff=new FirefoxDriver();
		try{
		ff.manage().window().maximize();
		ff.get("http://www.facebook.com");
		Thread.sleep(1000);
		ff.findElementByXPath("//*[@id='email']").sendKeys("nilaminx@yahoo.in");
		ff.findElementByXPath("//*[@id='pass']").sendKeys("inx@123");
		ff.findElement(By.id("u_0_v")).click();
		System.out.println("Waiting for element to appear");
		Thread.sleep(3000);
		WebElement element = (new WebDriverWait(ff, 5))
				   .until(ExpectedConditions.elementToBeClickable(By.id("userNavigationLabel")));
		element.click();
		
		//ff.findElementByXPath("//*[@id='userNavigationLabel']").click();
		System.out.println("sleeping 5 secs");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After 5 secs");
		System.out.println("Waiting for element to appear");
//		WebElement cls = (new WebDriverWait(ff, 5))
//				   .until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[id^='u_']")));
		
		WebElement cls = (new WebDriverWait(ff, 10))
				   .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='_54nc']/span/span[contains(text(), 'Log Out')]")));
		//
		boolean vis=cls.isDisplayed();
		
		//String id_st=ff.findElement(By.cssSelector("*[id^='u_']")).toString();
		//ff.findElement(By.xpath(""));
		System.out.println(vis);
		Thread.sleep(8000);
		System.out.println("Sleeping 8 secs");
		cls.click();
		System.out.println("After clicking");
		//By.xpath("//a[@class='_54nc']/span/span[contains(text(), 'Log Out')]");
		
		System.out.println("Successfully logged out!!");
		//ff.close();
		}catch(Exception e){
			System.out.println(e);
		}
		//*[@id="pageLoginAnchor"]
		

	}

}
