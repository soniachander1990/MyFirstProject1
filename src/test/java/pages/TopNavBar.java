package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopNavBar {
    private WebDriver driver;

    @FindBy(css="*(class='fa fa-history')")
    private WebElement SearchModel;

    @FindBy(css="a(class='btn btn-dark2')")
    private WebElement DataSheetView;

    @FindBy(css="a(class='btn btn-dark2 m-l-7 ng-scope')")
    private WebElement AddNewStudent;

    @FindBy(css="span(class='hidden-sm')")
    private WebElement Save;

    @FindBy(css="*(class='fa fa-question-circle isHovered')")
    private WebElement QuestionCircle;

    @FindBy(css="*(class='lbl-dropdown-search hidden-sm')")
    private WebElement search;

    @FindBy(css="input(type=text][id='globalSearchStudent')")
    private WebElement seacrchStudent;

    public TopNavBar(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
}
