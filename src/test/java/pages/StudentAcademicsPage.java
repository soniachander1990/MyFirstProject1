package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentAcademicsPage {
     private WebDriver driver;

    @FindBy(xpath = "//a(text()='Academics')")
    private  WebElement academicsLink;

     @FindBy(xpath="//div(@class='selectize-input items not-full ng-valid ng-pristine has-options')")
    private WebElement diplomaType;

     @FindBy(css="input(type=text)(placeholder='Course Protocol')")
    private WebElement courseProtocol;

    @FindBy(css="input(type=text)(placeholder='Grad Date')")
    private WebElement GraduationDate;

    @FindBy(css="input(type=text)(placeholder='Course Protocol Date Sent')")
    private WebElement courseProtocolDateSent;

    @FindBy(css="textarea(placeholder='Course Protocol Notes')")
    private WebElement courseProtocolNotes;

    @FindBy(css="*(class='ng-scope')")
    private WebElement exitReason;

    @FindBy(css="input(type=text)(placeholder='Attendance Notes')")
    private WebElement attendanceNotes;

    @FindBy(css="textarea(placeholder='Academic Notes')")
    private WebElement academicNotes;

    @FindBy(css="input(type=text)(placeholder='UB Partner Letter Issued')")
    private WebElement UBPartner;

    @FindBy(css="input(type=text)(placeholder='Student Placement Notes')")
    private WebElement studentPlacementNotes;

    @FindBy(css="textarea(placeholder='Host Family Notes')")
    private WebElement hostFamilyNotes;


    public StudentAcademicsPage(WebDriver driver) {

        PageFactory.initElements(driver,this);
    }

    public StudentAcademicsPage KeyInCourseProtocol(String courseProtocol){
        this.courseProtocol.sendKeys(courseProtocol);
        return this;

    }

    public void KeyInCourseProtocolNotes(String courseProtocolNotes){
        this.courseProtocolNotes.sendKeys(courseProtocolNotes);

    }
}
