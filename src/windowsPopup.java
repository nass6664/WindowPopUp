import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class windowsPopup {

    public static void main(String[] args) throws IOException, InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/nasabousaleh/java/Github/Grid/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://admin:admin@the-internet.herokuapp.com/");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("a[href*='/basic_auth']")).click();



        //handling autentication windows in selenuim
       // http://Username:Password@SiteURL


    }
}
