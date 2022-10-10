package thread2;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assertionm {
	
	@Test
	public void testing() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		String exp=driver.getTitle();
		String act="Youube";
//		assertEquals(act, exp);
		SoftAssert ast=new SoftAssert();
		ast.assertEquals(act, exp);
		System.out.println("after test");
//		ast.assertAll();
		System.out.println("after asert");
		ast.assertAll();
				}

}
