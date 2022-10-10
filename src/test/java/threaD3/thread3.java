package threaD3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class thread3 {
	
	@Test(enabled = false)
	public void test1(){
		System.out.println("thread3 Test1");
	}
	
	@Test
	public void test2(){
		System.out.println("thread3 Test2");
	}
	
	@Test
	public void test3(){
		System.out.println("thread3 Test3");
	}
	
	@Test
	public void browser() {
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		System.out.println("browser thread3");

	}

}
