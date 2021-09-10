package pages;

import general.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Product extends Base {

    @FindBy(css = "div.site-wrap:nth-child(39) main.container-produto:nth-child(5) div.container.interna div.row:nth-child(8) div.col-md-9 > div.col-md-7.prod-info:nth-child(6)")
    private WebElement productTitle;

    @FindBy(css="div.price-current");
    private WebElement priceCurrent;

    public Product(WebDriver driver) {
        super(driver);
    }

    //ler o titulo da Guia
public String readTitleTab(){
        return driver.getTitle();
}
    //ler o nome do produto
    public String readProductTitle(){
        return productTitle.getText();

    }

    //ler o preço
    public String readPriceCurrent{
        return priceCurrent.getText();
    }



}


