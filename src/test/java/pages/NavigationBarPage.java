package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationBarPage {

    @FindBy(css="*(class='p-t-1 school-year-label ng-binding')")
    private WebElement Session;

    @FindBy(css="a(placeholder='Session')")
    private WebElement TopDown;

    @FindBy(css="*(class='fa fa-filter fs-16 f-r')")
    private WebElement Filter;

    @FindBy(css="span(class='logout-text ng-binding')")
    private WebElement Training;

    @FindBy(css="span(class='logout-text')")
    private WebElement support;

    @FindBy(css="span(class='logout-text')")
    private WebElement logout;

    public NavigationBarPage(WebDriver driver){
        PageFactory.initElements(driver,
                this);
    }
}
