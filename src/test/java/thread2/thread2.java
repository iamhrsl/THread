package thread2;



import org.apache.logging.log4j.*;
import org.apache.logging.log4j.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
	
@Listeners(listneer.Itestlistners.class)
public class thread2 {
	
	
	@Test
	public void test1(){
		System.out.println("thread2 Test1");
	}
	

	@Test(groups = "regression")
	public void test2(){
		System.out.println("thread2 Test2");
	}
	
	@Test
	public void test3(){
		System.out.println("thread2 Test3");
	}
	
	@Test
	public void browser() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.guru99.com/cross-browser-testing-using-selenium.html");
		Assert.fail();
	}

	public static void main(String[] args) {
		Logger log=LogManager.getLogger("thread2");
		log.info("Im in thread2");
	}
}
