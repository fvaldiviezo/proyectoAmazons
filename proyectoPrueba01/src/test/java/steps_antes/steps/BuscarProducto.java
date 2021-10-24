package steps_antes.steps;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageobjects.HomeAmazon;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuscarProducto {

    private WebDriver driver;
    private String nombreProducto;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
        WebDriverWait wait = new WebDriverWait(driver,30);
        driver = new ChromeDriver();
    }

@Given("^El usuario ingresa a la pagina de amazons$")
public void elUsuarioIngresaALaPaginaDeAmazons() {
    driver.get("https://www.amazon.com/");
}


@Then("^Y elegir el primer producto$")
public void yElegirElPrimerProducto() {

    HomeAmazon mensaje = new HomeAmazon(driver);
    Assert.assertEquals(mensaje.ObtenertituloProductoValidacion(),nombreProducto);
}

@After  //CAPTURA SOLO FALLIDOS
public void tearDown(Scenario scenario){
    if (scenario.isFailed())
        takeScreenshot(scenario);
    driver.quit();
}

public  void takeScreenshot(Scenario scenario){
    final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    scenario.embed(screenshot,"image/png");
}

}
