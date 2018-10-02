package Pages;

import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

public class BuscarSimuladoresPage {

  private WebDriver driver;

  @FindBy(xpath = ".//*[@id='terminoBusqueda']")
  WebElementFacade txtBuscador;

  @FindBy(xpath = ".//*[@input='submit']")
  WebElementFacade btnBuscar;

  public BuscarSimuladoresPage(WebDriver driver) {
    this.driver = driver;
  }

  public void buscarSimulador() {
    txtBuscador.sendKeys("Simulador");
    btnBuscar.click();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

}
