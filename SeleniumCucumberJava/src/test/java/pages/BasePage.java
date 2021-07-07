package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    //un solo valor para todas las instancias y clases - objetos estáticos-
    protected static WebDriver driver; 
    private static WebDriverWait wait;

    //Bloque estático -> es lo que se ejecuta al inicio de todo esto
    static{
        
        
        ChromeOptions chromeOptions = new ChromeOptions(); //creación de una instancia
        driver = new ChromeDriver(chromeOptions); //creamos el objeto del driver usando las opciones de chrome
        wait = new WebDriverWait(driver, 10); //pasamos el objeto del WebDriver y el tiempo 
                                              //de espera máximo al usar el driver
        System.setProperty("webdriver.chrome.driver", "C:/Users/soulm/OneDrive/Documentos/Autoestudio/SW-Testing/TheFreeRangerTester/chromedriver");
    }

    //creamos el constructor de esta clase (con el objeto WebDriver llamado driver)-- cada vez que instanciemos esta página hará lo siguiente:
    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    //creamos la función de navegar
    public void navigateTo(String url){
        driver.get(url);
    }

    
}
