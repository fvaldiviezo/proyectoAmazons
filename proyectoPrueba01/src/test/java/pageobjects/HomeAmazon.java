package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

public class HomeAmazon {
   // private WebDriver driver;
    private WebDriverWait wait;
    public WebDriver driver;
  //  Properties prop = new Properties();

    public HomeAmazon(WebDriver driver) {
       //super(driver);
       this.driver = driver;
       PageFactory.initElements(driver, this);
       wait = new WebDriverWait(driver, 20);
    }
    //locatros
    @FindBy(xpath = "//form/div[2]/div/div/div/i")
    private WebElement BtnCat;
    @FindBy(xpath = "//form/div[2]/div/div/select/option[7]")
    private WebElement sltCat;
    @FindBy(xpath = "//div[3]/div[1]/div[2]/div/div[2]/a/div/img")
    private WebElement ImgCat;
    @FindBy(xpath = "//input[@id=\"twotabsearchtextbox\"]")
    private WebElement TxtPrd;
    @FindBy(xpath = "//input[@id=\"nav-search-submit-button\"]")
    private WebElement BtnBus;


    @FindBy(xpath = "//h1/div/div[2]/div/div/form/span/span/span/span")
    private WebElement BtnOrd;
    @FindBy(xpath = "//div[4]/div/div/ul/li[2]/a")
    private WebElement SelOrd;


    @FindBy(xpath = "//div[2]/div/span/div/div/div[2]/div[2]//div[1]/h2/a/span")
    private WebElement ObtNom;
    @FindBy(xpath = "//div[2]/div/span/div/div/div[2]/div[2]//div[1]/h2/a/span")
    private WebElement SelPrd;
    @FindBy(xpath = "//*[@id=\"title\"]")
    private WebElement Datval;


    //Acciones
    public void ClickCbxCategoria()
    {
        wait.until(ExpectedConditions.elementToBeClickable(BtnCat)).click();
        //  click((By) BtnIng);
    }
    public void ClickSltCategoria()
    {

       wait.until(ExpectedConditions.elementToBeClickable(ImgCat)).click();

    }
    public void IngresarProducto(String term){
        wait.until(ExpectedConditions.elementToBeClickable(TxtPrd)).sendKeys(term);
    }
    public void ClickBuscar()
    {
        wait.until(ExpectedConditions.elementToBeClickable(BtnBus)).click();
    }
    public void ClickOrden()
    {
        wait.until(ExpectedConditions.elementToBeClickable(BtnOrd)).click();
    }
    public void ClickSeleccionarAscendente()
    {
        wait.until(ExpectedConditions.elementToBeClickable(SelOrd)).click();
    }
    public String ObtenerNombreProducto()
    {
        return  wait.until(ExpectedConditions.elementToBeClickable(ObtNom)).getText().trim();
    }
    public void ClickSeleccionarProducto()
    {
        wait.until(ExpectedConditions.elementToBeClickable(SelPrd)).click();
    }
    public String ObtenertituloProductoValidacion(){

       return wait.until(ExpectedConditions.visibilityOf(Datval)).getText().trim();
   }
}
