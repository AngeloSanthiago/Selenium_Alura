package testes.personalizados;
import static org.junit.Assert.assertEquals;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MapeamentoElementosTest {
	private WebDriver driver;

	@Before
	public void inicializacao() {
		System.setProperty("webdriver.gecko.driver", "bin/geckodriver-v0.26.0-win32/geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void mapeiaElemento_H1_DeIframe() {
		Path sampleFile = Paths.get("Web/Index.html");
		driver.get(sampleFile.toUri().toString());
		
		driver.switchTo().frame(driver.findElement(By.id("docker")));
		WebElement H1EmIFrame = driver.findElement(By.xpath("//h1"));
		System.out.println(H1EmIFrame.getText());
		assertEquals("Principais Características do Docker", H1EmIFrame.getText());
		
//		ativar o comando abaixo para voltar a localizar elementos no documento principal Index.html
//		driver.switchTo().defaultContent();
		
//		In case if your frameId is dynamic, and you only have one iframe, you can use something like:
//		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
	}
}
