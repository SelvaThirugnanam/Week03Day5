package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead 
{
     public static void main(String[] args)
    {
    	ChromeDriver driver=new ChromeDriver();
 		driver.get("http://leaftaps.com/opentaps/control/main");
 		driver.manage().window().maximize();
 		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
 		driver.findElement(By.id("password")).sendKeys("crmsfa");
 		driver.findElement(By.className("decorativeSubmit")).click();
 		String text=driver.findElement(By.tagName("h2")).getText();
 		System.out.println(text);
 		driver.findElement(By.linkText("CRM/SFA")).click();
 		driver.findElement(By.linkText("Leads")).click();
 		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
 		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("agilysis");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("selva");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("surya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("thirugnanam");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("t");
		WebElement findElement = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select selectsource=new Select(findElement);
		selectsource.selectByValue("LEAD_CONFERENCE");
		WebElement findElement4 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select selectmarketing=new Select(findElement4);
		selectmarketing.selectByValue("CATRQ_AUTOMOBILE");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("mr");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("mukkara");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("600000");
		WebElement findElement2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select selectindustry=new Select(findElement2);
		selectindustry.selectByValue("IND_TELECOM");
		WebElement findElement3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select selectownership=new Select(findElement3);
		selectownership.selectByValue("OWN_PARTNERSHIP");
		driver.findElement(By.name("sicCode")).sendKeys("098");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("testing");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("3");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("TAD");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("software testing");
		driver.findElement(By.name("importantNote")).sendKeys("fresher");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("2435678");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("selva@gmail.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("selva");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("west Tambaram");
		WebElement findElement5 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select selectprovince=new Select(findElement5);
		selectprovince.selectByValue("GA");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600045");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9345668614");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("selvendran");
		driver.findElement(By.name("primaryWebUrl")).sendKeys("www.selva.linkedin.in");
		driver.findElement(By.name("generalAttnName")).sendKeys("lead");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("california");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		

    }
}
