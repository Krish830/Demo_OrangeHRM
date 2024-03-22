package Genric;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
     @FindBy(xpath="//input[@name='username']")
     private WebElement username;     
     @FindBy(xpath="//input[@name='password']")
     private WebElement password;    
      @FindBy(xpath="//button[.=' Login ']")
     private WebElement login_button;
      @FindBy(xpath="//span[.='Admin']/../../../li[2]")
      private WebElement PIM;
      @FindBy(xpath="//a[.='Add Employee']")
      private WebElement add_employee;
      @FindBy(xpath="//input[@name='firstName']")
      private WebElement first_name;
      @FindBy(xpath="//input[@name='middleName']")
      private WebElement mid_name;
      @FindBy(xpath="//input[@name='lastName']")
      private WebElement last_name;
      @FindBy(xpath="//label[.='Employee Id']/../../div[2]")
      private WebElement id;
      @FindBy(xpath="//button[.=' Save ']")
      private WebElement save_button;
      @FindBy(xpath="//a[.='Immigration']")
      private WebElement confirm;
      @FindBy(xpath="//a[.='Personal Details']")
      private WebElement confirm2;
      @FindBy(xpath="//a[.='Employee List']")
      private WebElement emp_list;
      @FindBy(xpath="//h5[.='Employee Information']")
      private WebElement confirm3;
      @FindBy(xpath="//div[.='Raj kumar']")
      private WebElement search;
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
    	 return username;
     }
     public WebElement pass()
     {
    	 return password;
     }
     public WebElement login()
     {
    	 return login_button;
     }
     public WebElement Pim()
     {
    	 return PIM;
     }
     public WebElement Add_employee()
     {
    	 return add_employee;
     }
     public WebElement first_name()
     {
    	 return first_name;
     }
     public WebElement middle_name()
     {
    	 return mid_name;
     }
     public WebElement last_name()
     {
    	 return last_name;
     }
     public WebElement Emp_id()
     {
    	 return id;
     }
     public WebElement save()
     {
    	 return save_button;
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
    	 return emp_list;
     }
     public WebElement Emp_information()
     {
    	 return confirm3;
     }
     public WebElement Emp_name()
     {
    	 return search;
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
