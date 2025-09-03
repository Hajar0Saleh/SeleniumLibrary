package Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task6 {
    public static void main(String[] args) {


        WebDriver driver = new FirefoxDriver();


        driver.get("https://www.youtube.com");


        driver.manage().window().maximize();


        String title = driver.getTitle();
        if (title.toLowerCase().contains("video")) {
            System.out.println("Test Passed  ");
        } else {
            System.out.println("Test Failed  ");
        }

        driver.manage().window().minimize();

        String titleAfterMinimize = driver.getTitle();
        if (titleAfterMinimize.toLowerCase().contains("video")) {
            System.out.println("Test Passed ");
        } else {
            System.out.println("Test Failed ");
        }

        driver.manage().window().fullscreen();

        driver.quit();
    }
}
