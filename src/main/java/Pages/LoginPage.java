package Pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}
	
	public void buscarSimulador() {
		driver.findElement(By.xpath("//*[@id='terminoBusqueda']")).sendKeys("Simuladores");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		}
	
}
