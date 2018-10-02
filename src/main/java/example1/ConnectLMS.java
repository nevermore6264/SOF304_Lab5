package example1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ConnectLMS {
    @Test
    public void verifyHomepageTitle() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\SOF304_Lab5\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "http://lms.poly.edu.vn/";

        String titleWebsite = "HỆ THỐNG QUẢN TRỊ HỌC TẬP FPT POLYTECHNIC";

        String titleExpect = "";

        driver.get(url);

        titleExpect = driver.getTitle();

        if (titleExpect.contentEquals(titleWebsite)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        driver.close();
    }
}
