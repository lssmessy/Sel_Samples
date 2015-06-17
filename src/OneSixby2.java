import org.openqa.selenium.chrome.ChromeDriver;


public class OneSixby2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", s+"\\Chrome090615\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.160by2.com/Index");
		driver.findElementByXPath("//*[@id='username']").sendKeys("9426576315");
		driver.findElementByXPath("//*[@id='password']").sendKeys("08moth42");
		driver.findElementByXPath("//*[@id='loginform']/div/section/div/div[1]/div[3]/div[3]/button").click();
		try {
			System.out.println("Sleeping for 10 secs");
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElementByXPath("//*[@id='frmDashboard']/div[1]/div[2]/div[1]/button").click();
		driver.findElementByXPath("//*[@id='IFXRHR']").sendKeys("9426576315");
			
		
	}

}
