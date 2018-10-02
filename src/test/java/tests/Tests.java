package tests;

import Pages.BuscarSimuladoresPage;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests {

	private WebDriver driver;	
	
	@BeforeMethod
	public void setUp() {
		DesiredCapabilities caps = new DesiredCapabilities();
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.grupobancolombia.com/wps/portal/personas");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
		
	@Test
	public void buscarSimuladores() {
		BuscarSimuladoresPage buscarSimuladoresPage = new BuscarSimuladoresPage(driver);
		buscarSimuladoresPage.buscarSimulador();

	}
/*
	@Test
	public void loginSahiTestOK() {
		//Assert.assertTrue(driver.findElement(By.xpath("//div[@id='available']/h2")).getText().contains("All available books"));
		//loginSahiTest("mercury", "mercury");
		ReservacionPage reservacionPage = new ReservacionPage(driver);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginSahiTest("mercury", "mercury");
		helpers.esperarSegundos(2);
		reservacionPage.assertReservacion();
	}	

	
	@Test
	public void seleccionarPasajeros() {
		ReservacionPage reservacionPage = new ReservacionPage(driver);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginSahiTest("mercury", "mercury");
		helpers.esperarSegundos(2);
		reservacionPage.seleccionarPasajeros(2);
		reservacionPage.seleccionarOrigen(2);
		reservacionPage.seleccionarDestino(4);
		helpers.esperarSegundos(5);
	}
	*/
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
