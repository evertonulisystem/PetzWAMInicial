package general;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks extends Base{
    //qdo extende crie objeto local com a extendida (selenium)
    private Base base;


    //gerar construtor da classe Base
    public Hooks(Base base) {
        super(base.driver);
        this.base = base;
    }
    //definir before e after

    @Before
    public void setup(){
        //definir o driver do brower
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver93/chromedriver.exe");
        //instanciar o driver do chrome
        base.driver = new ChromeDriver();
        //maximiza tela
        base.driver.manage().window().maximize();
        //definir tempo
        base.driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
     }

    @After
    public void tearDown(){
         base.driver.quit();
    }
}
