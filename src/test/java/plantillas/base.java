package plantillas;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class base {
    private WebDriver driver;
    RutasGenerales ruta = new RutasGenerales();

    /*
     * Constructor que invoca el driver del navegador a utilizar
     */
    public base(WebDriver driver) {
        this.driver=driver;
    }
    /*
     * Método que obtiene el driver del navegador Chrome
     */
    public WebDriver chromeDriverConnection() {
        System.setProperty("webdriver.chrome.driver", ruta.rutaDriverChrome());
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    /*
     * Método que obtiene el driver del navegador Firefox
     */
    public WebDriver firefoxDriverConnection() {
        System.setProperty("webdriver.gecko.driver", ruta.rutaDriverFirefox());
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        return driver;

    }

    /*
     * Método que obtiene el driver del navegador Internet Explorer
     */
    public WebDriver iExplorerDriverConnection() {
        System.setProperty("webdriver.ie.driver", ruta.rutaDriverIE());
        driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        return driver;

    }

    /*
     * Método que obtiene el driver del navegador Microsoft Edge
     */
    public WebDriver edgeDriverConnection() {
        System.setProperty("webdriver.edge.driver", ruta.rutaDriverEdge());
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        return driver;

    }

    /*
     * Método que obtiene el driver del navegador Opera
     */
    public WebDriver operaDriverConnection() {
        System.setProperty("webdriver.opera.driver", ruta.rutaDriverOpera());
        driver = new OperaDriver();
        driver.manage().window().maximize();
        return driver;

    }

    /*
     * Método para encontrar un elemento
     */
    public WebElement findElement(By locator)
    {
        return driver.findElement(locator);
    }

    /*
     * Método para encontrar una lista de elementos
     */
    public List<WebElement> findElements(By locator){
        return driver.findElements(locator);
    }

    /*
     * Método para obtener el texto de un elemento
     */
    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    /*
     * Método para obtener si el texto de un elemento es vacío
     */
    public Boolean getTextEmpty(By locator) {
        return driver.findElement(locator).getText().isEmpty();
    }

    /*
     * Método para comparar el texto de un elemento con un valor
     */
    public Boolean getTextCompare(By locator, String inputText) {
        return driver.findElement(locator).getText().trim().equalsIgnoreCase(inputText);
    }

    /*
     * Método para ingresar un valor dentro de un elemento
     */
    public void type(String inputText, By locator) {
        driver.findElement(locator).sendKeys(inputText);
    }

    /*
     * Método para dar clic a un elemento
     */
    public void click(By locator) {
        driver.findElement(locator).click();
    }

    /*
     * Método para validar si se muestra un elemento
     */
    public Boolean isDisplayed(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch(org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    /*
     * Método para setear la url de una pagina al driver
     */
    public void visit(String url) {
        driver.get(url);
    }

    /*
     * Método para imrimir un texto en consola
     */
    public void print(String inputText) {
        System.out.println(inputText);
    }

    /*
     * Método que prepara un WebDriverWait
     * Se utiliza para esperar que se muestr un elemento
     * o si se puede hacer clic, etc.
     */
    public WebDriverWait esperarElemento() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait;
    }

    /*
     * Método que devuelve la ruta del properties
     *
     */
    public String rutaProperties() {
        return ruta.rutaProperties();
    }

    public List<WebElement> tablaListadoFilas(By element) {
        WebElement tableProducts = driver.findElement(element);

        List<WebElement> tableRows = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfNestedElementsLocatedBy(tableProducts, By.tagName("tr")));

        return tableRows;
    }

    public List<WebElement> tablaListadoColumas(WebElement tableProducts) {
        List<WebElement> tableColums = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfNestedElementsLocatedBy(tableProducts, By.tagName("td")));

        return tableColums;
    }

    /*
     * Método para limpiar un valor dentro de un elemento
     */
    public void typeClear(By locator) {
        driver.findElement(locator).clear();;
    }

    public List<WebElement> listadoPorTag(By element, String tag) {
        WebElement tableProducts = driver.findElement(element);

        List<WebElement> tableRows = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfNestedElementsLocatedBy(tableProducts, By.tagName(tag)));

        return tableRows;
    }

    public static void waitForElementPresent(WebDriver driver, By locator) {
        for (int time = 0; time<=30 ; time++){
            try{
                if(isElementPresent(locator, driver))
                    break;
            }catch (Exception e){}
            delay(1);
        }
    }

    public static String selectEnter = Keys.chord(Keys.ENTER);


    public  void SubirScroll(By by) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
        js.executeScript("arguments[0].click();", findElement(by));

    }

    public  void SubirMedioScroll() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, -document.body.scrollHeight/2);");
        //  js.executeScript("arguments[0].click();", findElement(by));

    }


    public  void BajarScroll(By by) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        js.executeScript("arguments[0].click();", findElement(by));

    }

    public static boolean isElementPresent(By by, WebDriver driver) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public static void delay(int n) {
        try {
            Thread.sleep(n*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /*
     * Método para refrescar la página
     */
    public void recargar() {
        driver.navigate().refresh();
    }
}
