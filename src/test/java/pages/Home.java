package pages;

import general.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends Base {
    //mapeamentos barra de pesquisa
    @FindBy(id="search") //em vez de driverByFindElements
    private WebElement txtInputSearch;
    //mapeamentos botao da lupa
    @FindBy(css="button.button-search")
    private WebElement btnSearch;

    //Construtor
    public Home(WebDriver driver) {

    super(driver); //super..classe especial para varias outras
    }

    public void search(String product){
        txtInputSearch.click();//clicar na caixa de pesquisa
        txtInputSearch.clear();//limpa na caixa
        txtInputSearch.sendKeys(product); //escrever na caixa de texto
    }

    //métodos(Ações)
    public void searchWithMagnifierButton(String product){
//        txtInputSearch.click();//clicar na caixa de pesquisa
//        txtInputSearch.clear();//limpa na caixa
//        txtInputSearch.sendKeys(product); //escrever na caixa de texto
        search(product);
        btnSearch.click();//clicar no botao
    }

    public void searchWithEnter(String product){
//        txtInputSearch.click();//clicar na caixa de pesquisa
//        txtInputSearch.clear();//limpa na caixa
//        txtInputSearch.sendKeys(product); //escrever na caixa de texto
        search(product);
        txtInputSearch.sendKeys(Keys.ENTER);
    }


}
