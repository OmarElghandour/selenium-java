package src.samplePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo {

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.browserstack.com/guide/selenium-with-java-for-automated-test");
    }



}
