package homework;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Genric.Base_class;
import Genric.Pom;

public class Demo_orange_hrm extends Base_class
{
@Test

    public void test() throws InterruptedException
    {
	Pom p = new Pom(driver);
	p.user().sendKeys("Admin");
	p.pass().sendKeys("admin123");
	p.login().click();
	p.Pim().click();
	p.Add_employee().click();
	p.first_name().sendKeys("Raj");
	p.middle_name().sendKeys("kumar");
	p.last_name().sendKeys("Sinhaaa");
//	p.Emp_id().clear();
//	p.Emp_id().sendKeys("11111");
	p.save().click();    //Employee created

	WebDriverWait w=new WebDriverWait(driver, 10);
	w.until(ExpectedConditions.visibilityOf(p.Imm() ));
	w.until(ExpectedConditions.visibilityOf(p.Per_detail()));
	p.Emp_list().click();
    w.until(ExpectedConditions.visibilityOf(p.Emp_information()));
    
	JavascriptExecutor j=(JavascriptExecutor)driver;
	//j.executeScript("arguments[0].scrollInToView();", p.Emp_name());
	j.executeScript("window.scrollBy(0,600)");
	
	Actions act=new Actions(driver);
	act.moveToElement(p.Delete()).build().perform();
	p.Delete().click();
	
	act.moveToElement(p.Del_popup()).build().perform();
	p.Del_popup().click();      //Employee deleted
	
	w.until(ExpectedConditions.visibilityOf(p.Reports()));
	p.down_arrow().click();
	
	w.until(ExpectedConditions.visibilityOf(p.About()));
	p.Logout().click();


	 
	
	
    }
}
