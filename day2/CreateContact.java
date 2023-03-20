package selenium.assignment.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize(); //To maximize the window/browser size
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Create Contact')]")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Abcd");
		
		driver.findElement(By.id("lastNameField")).sendKeys("Efgh");
		
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("localAbcd");
		
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("localEfgh");
		
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("IT");
		
		driver.findElement(By.id("createContactForm_description")).sendKeys("Description");
		
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("abcd@gmail.com");
		
		WebElement sourceDropDown=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		
		Select dropDown =new Select(sourceDropDown);
		
		dropDown.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateContactForm_description")).clear();
		
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("important note");
		
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		
		System.out.println(driver.getTitle());
		
		
		
	}

}
