package pages;
import general.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


    public class List extends Base{

        public List(WebDriver driver) {
            super(driver);
        }
    }

    //Definindo mapeamentos
    @FindBy(css="h1.h2Categoria.nomeCategoria")
    private WebElement lblResultBy;

    //@FindBy(xpath = "//h3[contains(text(),'Aquário Boyu Curvo 150 472 Litros Preto Champagne')]")
    //@findBy naõ pode ser parametrizado..ele nao pode ficar aqui, pois estaria desejando o produto
    //forma de mapear:
    //grid:

    //nao devo ter em assert ..nao se mistura com pageFActory
    //assert SO DEVE TER NOS STEPS..aqui sera as chamadas para o STEP ocm asserts

    //le o itulo da guia e devolve o textp
    public String readTitleTab(){
        return driver.getTitle();
        }

    public void String clickAtDesiredProduct(String product ){
        driver.findElement(By.xpath("//h3[contains(text(), '" +product+ "')]")).click();
        }

    public String readResultBy(){
        return lblResultBy.getText();

        }

}
