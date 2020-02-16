package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainNavBarPage {
     private WebDriver driver;
    @FindBy(xpath = "//a(text()='Academics')")
    private  WebElement academicsLink;

    @FindBy(xpath = "//a(text()='Pre-Arrival/Travel')")
    private WebElement preArrival;

    public MainNavBarPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public StudentAcademicsPage clickAcademicsLink(){
        this.academicsLink.click();
        return new StudentAcademicsPage(driver);
    }
}
