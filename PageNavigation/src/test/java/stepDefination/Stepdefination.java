package stepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Stepdefination {
	SoftAssert sa = new SoftAssert();
	WebDriver li;
	
	WebDriver driver;

    @Given("^User is on \"([^\"]*)\"$")
    public void user_is_on_something(String link) throws Throwable {
    	driver.navigate().to("https://www.amcsgroup.com ")  ;
    }
 @When("^Default Language is English $")
    public void default_language_is_english() throws Throwable {
    	driver.findElement(By.xpath("//div[@class='language-nav_inner']/true-dropdown/a")) ;
    }

    @When("^User click on English $")
    public void user_click_on_english() throws Throwable {
    	 driver.findElement(By.xpath("//div[@class='language-nav_inner']/true-dropdown/a")).click();
    }

    @When("^User click on the option \"([^\"]*)\" on the bottom of the page$")
    public void user_click_on_the_option_something_on_the_bottom_of_the_page(String link) throws Throwable {
    	driver.get("https://www.amcsgroup.com");
		driver.findElement(By.xpath("/html/body/amcs-footer/a[1]"));
    }

    @When("^User scroll down to Explore our careers section$")
    public void user_scroll_down_to_explore_our_careers_section() throws Throwable {
    	driver.get("https://www.amcsgroup.com");
		driver.findElement(By.xpath("/html/body/amcs-footer/a[1]")).click();
		
}
   

    @Then("^Language dropdown list should contain \"([^\"]*)\"$")
    public void language_dropdown_list_should_contain_something(List<String> list1) throws Throwable {
    	List<WebElement> list  = driver.findElements(By.xpath("//div[@class='nav-dropdown']/true-list-box/a")); 
    	String ne = list.get(0).getText();
		sa.assertEquals(ne,"Netherlands");
		String de = list.get(0).getText();
		sa.assertEquals(de,"Deutch");
		String es = list.get(0).getText();
		sa.assertEquals(es,"Esponal");
		String da = list.get(0).getText();
		sa.assertEquals(da,"Dansk");
		String fr = list.get(0).getText();
		sa.assertEquals(fr,"Francais");
		String en = list.get(0).getText();
		sa.assertEquals(en,"English");
		sa.assertAll();
    }

    @Then("^Verify that in drop down are not options: Slovak, Irish, undefined$")
    public void verify_that_in_drop_down_are_not_options_slovak_irish_undefined() throws Throwable {
    	driver.get("https://www.amcsgroup.com/?gclid=Cj0KCQjw8_qRBhCXARIsAE2AtRZ-RFECq8JyhjOJq_6TdtWQFfR-88emijROIHtAsrXUAtWgUed4QcgaAuHEEALw_wcB");
		driver.findElement(By.xpath("//div[@class='language-nav_inner']/true-dropdown/a")).click();
		List<WebElement> list  = driver.findElements(By.xpath("//div[@class='nav-dropdown']/true-list-box/a"));
				for(int i=0;i<list.size();i++ ) {
					
					String value = li.get(i).getText();
					if(value.equals("Slovak")) {
						sa.assertEquals(true,false);
					}else if(value.equals("Irish")) {
						sa.assertEquals(true,false);
				}else if(value.equals("undefined")) 
				{
					sa.assertEquals(true,false);
				}
					else
						sa.assertEquals(true,true);
				}
    }

    @Then("^Page Url should be \"([^\"]*)\"	$")
    public void page_url_should_be_something(String link) throws Throwable {
      driver.get("https://www.amcsgroup.com/careers/#"); 
      String url = driver.getCurrentUrl();
		if(url.contains("careers")) {
			sa.assertEquals(true,true);
		}else
	
			sa.assertEquals(true,false);
      
    }

    @Then("^ Countries list should contain	\"([^\"]*)\" $")
    public void countries_list_should_containsomething(List<String> list1) throws Throwable {
    	List<WebElement> list  = driver.findElements(By.xpath("//div[@class='nav-dropdown']/true-list-box/a")); 
    	String ne = list.get(0).getText();
		sa.assertEquals(ne,"Netherlands");
		String de = list.get(0).getText();
		sa.assertEquals(de,"Deutch");
		String es = list.get(0).getText();
		sa.assertEquals(es,"Esponal");
		String da = list.get(0).getText();
		sa.assertEquals(da,"Dansk");
		String fr = list.get(0).getText();
		sa.assertEquals(fr,"Francais");
		String en = list.get(0).getText();
		sa.assertEquals(en,"English");
		sa.assertAll() ;
    }

    @Then("^ categories list should contain	\"([^\"]*)\" $")
    public void categories_list_should_containsomething(List<String> list1) throws Throwable {
    	List<WebElement> list  = driver.findElements(By.xpath("//div[@class='filter-group']/true-checkbox/a")); 
    	
    }

    @And("^User click on \"([^\"]*)\"$")
    public void user_click_on_something(String strrg1) throws Throwable {
       
    	;
    }

    @And("^  Countries list should not contain \"([^\"]*)\"$")
    public void countries_list_should_not_contain_something(List<String> list1) throws Throwable {
    	driver.get("https://www.amcsgroup.com");
		driver.findElement(By.xpath("//div[@class='language-nav_inner']/true-dropdown/a")).click();
		List<WebElement> list  = driver.findElements(By.xpath("//div[@class='nav-dropdown']/true-list-box/a"));
		
		for(int i=0;i<list.size();i++ ) {
			String value = li.get(i).getText();
			if(value.equals("Slovak")) {
				sa.assertEquals(true,false);
			}else if(value.equals("Irish")) {
				sa.assertEquals(true,false);
		}else if(value.equals("undefined")) {
			sa.assertEquals(true,false);
		}
			else
				sa.assertEquals(true,true);	
	}
    }

    @And("^  categories list should not contain \"([^\"]*)\"$")
    public void categories_list_should_not_contain_something(List<String> list1) throws Throwable {
    	driver.get("https://www.amcsgroup.com/careers/#");
		driver.findElement(By.xpath("//div[@class='']/true-checkbox/a")).click();
		List<WebElement> list  = driver.findElements(By.xpath("//div[@class='filter-group']/true-checkbox/a"));
		//double check xpath created
		for(int i=0;i<list.size();i++ ) {
			String value = li.get(i).getText();
			if(value.equals("Fishing")) {
				sa.assertEquals(true,false);
			}else if(value.equals("Hunting")) {
				sa.assertEquals(true,false);
		}else if(value.equals("Driving")) {
			sa.assertEquals(true,false);
		}
			else
				sa.assertEquals(true,true);
   


    @When("^ User click on \"([^\"]*)\" checkboxin countries list$")
    public void user_click_on_something_checkboxin_countries_list(String checkbox) throws Throwable {
    	driver.findElement(By.xpath("//div[@class='']/true-checkbox/a")).click();;
    }

    @Then("^ User should land on \"([^\"]*)\"$")
    public void user_should_land_on_something(String strArg1) throws Throwable {
    	driver.get("https://www.amcsgroup.com/careers/#");
		driver.findElement(By.xpath(" ")).click();
		String url = driver.getCurrentUrl();
		if(url.contains("ireland")) {
			sa.assertEquals(true,true);
		}else
	
			sa.assertEquals(true,false);  

	
    }
		}
	
	