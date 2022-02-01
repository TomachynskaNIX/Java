package org.script;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class BuyProducts<region, Basic> {
    public static Steps steps;
    public static WebDriver driver;

    @BeforeAll
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        steps = new Steps(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("loginpage"));
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

    @Test
        public void buyTwoProducts() throws InterruptedException {
        steps.closeAdvertising();
        steps.selectProduct("блуза");
        steps.selectProductDetails(2);
        steps.addToBasket();
        steps.checkProductsCorrectnessProduct();
        steps.continueShopping();
        steps.selectProduct("шорти");
        steps.selectProductDetails(3);
        steps.addToBasket();
        steps.checkProductsCorrectnessProduct();
        steps.checkBasketBehaviour();
    }

//    @ParameterizedTest
//    @ValueSource(strings = {"футболка", "сукня", "штани"})
//    public void buyAnyProducts(String input) throws InterruptedException {
//        steps.closeAdvertising();
//        steps.search(input);
//        steps.queryMapping();
//        steps.descSortPrice();
//        steps.choiceFirstProduct();
//        steps.choiceColor();
//        steps.choiceSize();
//        steps.choiceQuantity(3);
//        steps.addToBasket();
//        steps.checkCorrectnessProduct();
//        steps.closeTest();
//    }
}
