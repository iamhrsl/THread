package THREAD4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class thread4 {

	
		@Test
		public void test1(){
			System.out.println("thread4 Test1");
		}
		
		@Test
		public void test2(){
			System.out.println("thread4 Test2");
		}
		
		@Test
		public void test3(){
			System.out.println("thread4 Test3");
		}
		
		@Test
		public void browser() {
			
			WebDriverManager.edgedriver().setup();
			EdgeDriver driver=new EdgeDriver();
//			driver.get("www.gmail.com");
			System.out.println("browser thread4");

		}

}
