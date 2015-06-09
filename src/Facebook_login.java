import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Facebook_login extends ReadfrmExcel{

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
	
	ReadfrmExcel rd=new ReadfrmExcel();
	String[][] readata=rd.excelRead();
	//FirefoxDriver ff=new FirefoxDriver();
	String s=System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", s+"\\ChromeDriver\\chromedriver.exe");
	ChromeDriver ff=new ChromeDriver();
	
	ff.manage().window().maximize();
	for(int i=1; i<readata.length; i++)
	{
		
		ff.get("http://www.facebook.com");
		ff.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		ff.findElement(By.id("email")).sendKeys(readata[i][0]);
		ff.findElement(By.id("pass")).sendKeys(readata[i][1]);
		ff.findElement(By.xpath("//*[@id='u_0_n']")).click();
		
		ff.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		ff.findElement(By.xpath("//*[@id='userNavigationLabel']")).click();
		Thread.sleep(5000);
		ff.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		ff.findElement(By.id("logout_form")).click();
						
		
		System.out.println("Username=> "+readata[i][0]+"\n Password==>"+readata[i][1]+"==> Done \n");
	}
	ff.close();
	System.out.println("All Successfully done");

	}

}
