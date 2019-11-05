import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteAutomatizado {
	public static void main(String[] args) {
		//configura caminho absoluto
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\angel\\Desktop\\wks_Photon\\Selenium_Alura\\bin\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		
		//configura caminho relativo
		System.setProperty("webdriver.gecko.driver", "bin/geckodriver-v0.26.0-win32/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.bing.com");
		
		WebElement query = driver.findElement(By.name("q"));
		query.sendKeys("Caelum");
		
		//submete o fom
		query.submit();
	}
}
