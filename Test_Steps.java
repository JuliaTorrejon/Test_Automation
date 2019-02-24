package stepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestSteps {
    ChromeDriver driver = new ChromeDriver();

    @Given("I go to the Cambridge University website")
    public void iGoToCamUniWebsite (){
        driver.manage().window().maximize();
        driver.get("https://www.cam.ac.uk");
    }

    @When("I click Give to Cambridge link")
    public void iClickGiveToCambridgeLink() {
        driver.findElementByLinkText("Give to Cambridge").click();
        driver.get("https://www.philanthropy.cam.ac.uk/how-to-give-to-cambridge");
        driver.findElement(By.name("donation")).sendKeys("20");
        driver.findElement(By.name("Reset")).click();
    }

    @And("I can click the Alumni website link")
    public void iCanClickTheAlumniWebsiteLink() {
        driver.findElementByLinkText("Alumni website").click();
        driver.get("https://www.alumni.cam.ac.uk/");
    }

    @When("I enter the search word {string}")
    public void iEnterTheSearchWord(String word){
        driver.findElement(By.id("edit-search-block-form--2")).sendKeys(word);
    }

    @And("I click the search icon")
    public void iClickTheSearchIcon() {
        driver.findElement(By.id("edit-submit")).click();
    }

    @And("The URL has the word {string} in it")
    public void theURLHasTheWordInIt(String word) {
        driver.getCurrentUrl().contains(word);
    }

    @And("The tab title contains the {string}")
    public void theTabTitleContainsThe(String word) {
        driver.getTitle().contains(word);
    }

    @Then("I close the browser")
    public void iCloseTheBrowser() {
        driver.quit();
        driver.get("https://www.alumni.cam.ac.uk");
    }

}

