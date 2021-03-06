package trainingpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_css {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mhmty\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        /*Create a class : Locators_css
Create main method and complete the following task.
When user goes to http://a.testaddressbook.com/sign_in
Locate the elements of email textbox,password textbox, and signin button
Enter below username and password then click sign in button
Username :  testtechproed@gmail.com
Password : Test1234!
USE CSS SELECTOR TO LOCATE ELEMENTS*/

        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement emailTextBox=driver.findElement(By.cssSelector("input[type='email']"));
        emailTextBox.sendKeys("testtechproed@gmail.com");

        WebElement passwordTextBox=driver.findElement(By.cssSelector("input#session_password"));
        passwordTextBox.sendKeys("Test1234!");

        WebElement signInButton=driver.findElement(By.cssSelector("input[class='btn btn-primary']"));
        signInButton.click();


    }
}
