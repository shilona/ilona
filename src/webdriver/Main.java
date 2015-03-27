package webdriver;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;
import org.testng.annotations.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FirefoxBinary binary = new FirefoxBinary(new File("C:\\Users\\student\\AppData\\Local\\Mozilla Firefox\\firefox.exe"));
        WebDriver driver = new FirefoxDriver(binary,new FirefoxProfile());      
        driver.get("http://www.github.com");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       WebElement searchBut= driver.findElement(By.linkText("Sign in"));
       searchBut.click();
    WebElement username = driver.findElement(By.name("login"));
    username.sendKeys("shilona");
    WebElement passname = driver.findElement(By.name("password"));
    passname.sendKeys("shilona94");
    passname.submit();
    WebElement toolrep =driver.findElement(By.className("tooltipped"));
    toolrep.click();
     WebElement createrep =driver.findElement(By.linkText("New repository"));
    createrep.click();
    WebElement repname =driver.findElement(By.id("repository_name"));
    repname.sendKeys("ilona");
    WebElement description =driver.findElement(By.id("repository_description"));
    description.sendKeys("lola");
    description.submit();
 //   WebElement searchButT= driver.findElement(By.("commit"));
  // searchButT.click();
        
    }

}
