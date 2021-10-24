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
import pageobjects.HomeLogin;


public class ValidarLoginStep {

    private WebDriver driver;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Given("^El usuario ingresa a la pagina de Odoo$")
    public void elUsuarioIngresaALaPaginaDeOdoo() {
        driver.get("https://manuel2.odoo.com/web/login");
    }
    @When("^Ingresa el usuario \"([^\"]*)\" y clave \"([^\"]*)\" y presiona el boton ingresar$")
    public void ingresaElUsuarioYClaveYPresionaElBotonIngresar(String usuarios,String pass) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        HomeLogin HomeLg = new HomeLogin(driver);
        HomeLg.IngresarUsuario(usuarios);
        HomeLg.IngresarClave(pass);
        HomeLg.ClickIngresar();
        throw new PendingException();
    }
    @Then("^Verifica que muestra el mensaje \"([^\"]*)\"$")
    public void verificaQueMuestraElMensaje(String MsjEsperado) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        HomeLogin Mensaje = new HomeLogin(driver);
        Assert.assertEquals(Mensaje.MensajeValidacion(),MsjEsperado);
        throw new PendingException();
    }

    @After  //CAPTURA SOLO FALLIDOS
    public void tearDown(Scenario scenario){
        if (scenario.isFailed())
            takeScreenshot(scenario);
        driver.quit();
    }
 // captura para FALLIDO Y CORRECTO
 //   public  void tearDown(Scenario scenario){
 //       final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
 //       scenario.embed(screenshot,"image/png");
 //       driver.quit();
 //   }
    public  void takeScreenshot(Scenario scenario){
        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot,"image/png");
    }
}
