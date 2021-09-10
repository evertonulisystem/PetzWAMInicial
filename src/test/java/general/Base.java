package general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    protected WebDriver driver; //declarando a "bola"
    //alterado de public para protegido..todos utilizam masuma de cada vez devio ao pageobjetc

    //criar construtor e inicializar elementos do PageFactory
    public Base(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }


}
