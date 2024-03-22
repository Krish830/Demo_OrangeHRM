package Genric;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
     @FindBy(xpath="//input[@name='username']")
     private WebElement ele;     
     @FindBy(xpath="//input[@name='password']")
     private WebElement ele2;    
      @FindBy(xpath="//button[.=' Login ']")
     private WebElement ele3;
      @FindBy(xpath="//span[.='Admin']/../../../li[2]")
      private WebElement ele4;
      @FindBy(xpath="//a[.='Add Employee']")
      private WebElement ele5;
      @FindBy(xpath="//input[@name='firstName']")
      private WebElement ele6;
      @FindBy(xpath="//input[@name='middleName']")
      private WebElement ele7;
      @FindBy(xpath="//input[@name='lastName']")
      private WebElement ele8;
      @FindBy(xpath="//label[.='Employee Id']/../../div[2]")
      private WebElement ele9;
      @FindBy(xpath="//button[.=' Save ']")
      private WebElement ele10;
      @FindBy(xpath="//a[.='Immigration']")
      private WebElement confirm;
      @FindBy(xpath="//a[.='Personal Details']")
      private WebElement confirm2;
      @FindBy(xpath="//a[.='Employee List']")
      private WebElement ele11;
      @FindBy(xpath="//h5[.='Employee Information']")
      private WebElement confirm3;
      @FindBy(xpath="//div[.='Raj kumar']")
      private WebElement ele12;
      @FindBy(xpath="((//div[.='Raj kumar'])[2]/../../div[9]/div/button/i)[1]")
      private WebElement delete;
      @FindBy(xpath="//p[.='Are you Sure?']/../../div[3]/button[2]")
      private WebElement del_option;
      @FindBy(xpath="//a[.='Reports']")
      private WebElement reports;
      @FindBy(xpath="//h6[.='PIM']/../../../div[2]/ul/li/span/i")
      private WebElement arrow;
      @FindBy(xpath="//a[.='About']")
      private WebElement about;
      @FindBy(xpath="//a[.='Logout']")
      private WebElement logout;
     
     public Pom(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }
     
     public WebElement user()
     {
    	 return ele;
     }
     public WebElement pass()
     {
    	 return ele2;
     }
     public WebElement login()
     {
    	 return ele3;
     }
     public WebElement Pim()
     {
    	 return ele4;
     }
     public WebElement Add_employee()
     {
    	 return ele5;
     }
     public WebElement first_name()
     {
    	 return ele6;
     }
     public WebElement middle_name()
     {
    	 return ele7;
     }
     public WebElement last_name()
     {
    	 return ele8;
     }
     public WebElement Emp_id()
     {
    	 return ele9;
     }
     public WebElement save()
     {
    	 return ele10;
     }
     public WebElement Imm()
     {
    	 return confirm;
     }
     public WebElement Per_detail()
     {
    	 return confirm2;
     }
     public WebElement Emp_list()
     {
    	 return ele11;
     }
     public WebElement Emp_information()
     {
    	 return confirm3;
     }
     public WebElement Emp_name()
     {
    	 return ele12;
     }
     public WebElement Delete()
     {
    	 return delete;
     }
     public WebElement Del_popup()
     {
    	 return del_option;
     }
     public WebElement Reports()
     {
    	 return reports;
     }
     public WebElement down_arrow()
     {
    	 return arrow;
     }
     public WebElement About()
     {
    	 return about;
     }
     public WebElement Logout()
     {
    	 return logout;
     }
     
     
}
