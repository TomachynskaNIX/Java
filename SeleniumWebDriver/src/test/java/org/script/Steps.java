package org.script;
import static junit.framework.Assert.fail;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.script.interfaces.Pages;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Steps {

    //region[Basic Steps]

    public boolean CheckDescSort (List <WebElement> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (Double.parseDouble(list.get(i).getText().trim().replaceAll("\\pL",""))
                    <= Double.parseDouble(list.get(i + 1).getText().trim().replaceAll("\\pL","")))  i++;
            else return false;
            break;
        }
        return true;
    }

    public void closeAdvertising() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            if (pages.close_advertising_button.isDisplayed()) {
                pages.close_advertising_button.click();
            }
        } catch (WebDriverException e) {
            System.out.println("There is no advertising on the page.");
        }
    }

    public void search (String value) {
        if (pages.icon_search.isDisplayed()) {
            pages.icon_search.click();
        } else {
            fail("Icon search isn't displayed");
        }
        if (pages.input_search.isDisplayed()) {
            pages.input_search.click();
            pages.input_search.sendKeys(value, Keys.ENTER);
        } else {
            fail("Input search isn't displayed");
        }
    }

    public void addToBasket () {
        if (pages.addToBasket.isDisplayed()) {
            pages.addToBasket.click();
        } else {
            fail("Button 'add to basket' isn't displayed");
        }
        if (!pages.modal_basket_window.isDisplayed()) {
            fail("Modal basket window isn't displayed");
        }
    }

    public void continueShopping() {
        if (pages.close.isDisplayed()) {
            pages.close.click();
        } else {
            fail("Button 'X' to close the window isn't displayed");
        }
    }

    public void deleteProductFromBasket () {
        pages.delete_product_from_basket.get(1).click();
        driver.navigate().refresh();
        pages.basket.click();
        assertThat(pages.product_title_in_basket.size(), equalTo(1));
        assertThat(pages.product_title_in_basket.get(0).getText(), containsString("блуза"));
    }

    public void clearBasket()  {
        if (pages.delete_product_from_basket.get(0).isDisplayed()) {
            pages.delete_product_from_basket.get(0).click();
        } else {
            fail("Button 'X' to delete product from basket isn't displayed");
        }
        if (pages.close.isDisplayed()) {
            pages.close.click();
        } else {
            fail("Button 'X' to close the window isn't displayed");
        }
    }

    public void selectFirstProduct () {
        if (pages.first_product_to_buy.isDisplayed()) {
            pages.first_product_to_buy.click();
        } else {
            fail("There is no available product");
        }
    }

    public void selectColor () {
        try{
            if(pages.color_option.isDisplayed()) {
                pages.color_option.click();
            }
        } catch (NoSuchElementException e) {
            System.out.println("There is no choice color option ");
        }
    }

    public void selectSize () {
        if (pages.inputSize.isDisplayed()) {
            pages.inputSize.click();
            variables.setSize(pages.size_value.getAttribute("innerText"));
            variables.setTitle(pages.first_found_product_title.getText());
            variables.setVendorCode(pages.vendor_code.getText());
        } else {
            fail("Choice size radio isn't displayed");
        }
    }

    public void selectQuantity (int quantity) {
        int available_quantity = Integer.parseInt(pages.data_option_quantity.getAttribute("data-option-quantity"));
        if (available_quantity < quantity) {
            quantity = available_quantity;
        }
        int i;
        for (i = 1; i < quantity; i ++) {
            pages.quantity_plus.click();
        }
        variables.setQuantity(i);
        variables.setPrice(Double.parseDouble(pages.first_found_product_price.getAttribute("data-price")));
    }

    public void checkCorrectnessTitlesProduct () {
        String title_in_basket = pages.product_title_in_basket.get(pages.product_title_in_basket.size()-1).getText();
        assertThat("Product titles aren't match in basket and product container", title_in_basket, equalTo(variables.getTitle()));
    }

    public void checkCorrectnessSizeProduct () {
        String size_value_in_basket = pages.product_size_in_basket.get(pages.product_size_in_basket.size()-1).getText().replaceAll("\\s" ,"").replaceAll("\\d", "");
        String size_value_in_product_container = variables.getSize().replaceAll("\\s" ,"").replaceAll("\\d", "");
        assertThat("Product sizes aren't match in basket and product container",size_value_in_basket, containsString(size_value_in_product_container));
    }

    public void checkCorrectnessPriceProduct () {
        double price_in_basket = Double.parseDouble(pages.product_price_in_basket
                .get(pages.product_price_in_basket.size()-1)
                .getText().replaceAll("\\s","")
                .replaceAll("\\pL", ""));
        assertThat("Product prices aren't match in basket and product container", price_in_basket, equalTo(variables.getPrice() * variables.getQuantity()));
    }

    public void checkTwoDifferentProductsInBasket () {
        assertThat("there are no 2 products in the basket", pages.product_title_in_basket.size(), equalTo(2));
        assertThat("there are no product 'блуза' in the basket", pages.product_title_in_basket.get(0).getText(), containsString("блуза"));
        assertThat("there are no product 'шорти' in the basket", pages.product_title_in_basket.get(1).getText(), containsString("шорти"));
    }

    public void queryMapping () {
        String input_search_value = pages.input_search.getAttribute("value");
        String[] category_title_value_array = pages.category_title.getText().split(" "); // split a string into substrings into an array
        String category_title_value = category_title_value_array[category_title_value_array.length-1]; // get a substring from the array, which contains the name of the search product
        assertThat("Product titles aren`t match in basket and product container", category_title_value, equalTo(input_search_value));
    }

    public void descSortPrice() throws InterruptedException {
        if (pages.sort_dropdown.isDisplayed()) {
            pages.sort_dropdown.click();
        } else {
            fail("Sorting dropdown isn't displayed");
        }
        if (pages.sorting_block_desk_titles.isDisplayed()) {
            pages.sorting_block_desk_titles.click();
        } else {
            fail("There is no such sorting point in sorting dropdown");
        }
        if (CheckDescSort(pages.discounted_price_boxes)) { Assert.fail("Sorting discounted products is incorrect"); }
        if (CheckDescSort(pages.price_boxes)) { Assert.fail("Sorting products is incorrect"); }
    }

    //endregion

    //region[Complex Steps]

    public void checkProductsCorrectnessProduct() {
        checkCorrectnessTitlesProduct();
        checkCorrectnessSizeProduct();
        checkCorrectnessPriceProduct();
    }

    public void selectProduct(String productName) {
        search(productName);
        selectFirstProduct();
    }

    public void selectProductDetails(int quantity) {
        selectColor();
        selectSize();
        selectQuantity(quantity);
    }

    public void checkBasketBehaviour() {
        checkTwoDifferentProductsInBasket();
        deleteProductFromBasket();
        clearBasket();
    }

    //endregion

    //region[Utility]

    public WebDriver driver;
    public Variables variables = new Variables();
    Pages pages = new Pages();

    public Steps(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //endregion
}