package org.example.ReadQR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchbrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/sikalidas/IdeaProjects/Read_Write_Generate_QRCODE/src/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.close();
    }
}
