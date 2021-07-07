package pages;


//GooglePage hereda de BasePage -> hay que invocar a super
public class GooglePage extends BasePage{

    public GooglePage() {
        super(driver);
    }

    //la función de BasePage navigateToGoogle(String url) tiene como argumento de este tipo.
    //Tomo esa función pública heredada, pero con el mismo tipo y argumento
    public void navigateToGoogle(){
        navigateTo("https://www.google.com");
    }
    
}
