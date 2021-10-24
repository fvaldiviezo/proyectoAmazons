package pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import plantillas.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.io.FileReader;
import java.util.List;
import java.util.Properties;

public class HomeLogin {
   // private WebDriver driver;
    private WebDriverWait wait;
    public WebDriver driver;
  //  Properties prop = new Properties();

    public HomeLogin(WebDriver driver) {
       //super(driver);
       this.driver = driver;
       PageFactory.initElements(driver, this);
       wait = new WebDriverWait(driver, 20);
    }
    //locatros
    @FindBy(xpath = "//*[@id=\"login\"]")
    private WebElement TxtUsu;
    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement TxtPas;
    @FindBy(xpath = "//*[@id=\"wrapwrap\"]//div[3]/button")
    private WebElement BtnIng;
    @FindBy(xpath = "//*[@id=\"wrapwrap\"]//form/p")
    private WebElement Msjval;
    //Acciones
    public void IngresarUsuario(String term){
        wait.until(ExpectedConditions.elementToBeClickable(TxtUsu)).sendKeys(term);
    }

    public void IngresarClave(String term){
        wait.until(ExpectedConditions.elementToBeClickable(TxtPas)).sendKeys(term);
    }
    public void ClickIngresar()
    {
        wait.until(ExpectedConditions.elementToBeClickable(BtnIng)).click();
      //  click((By) BtnIng);
    }
     public String MensajeValidacion(){
        return wait.until(ExpectedConditions.visibilityOf(Msjval)).getText().trim();
    }
}
