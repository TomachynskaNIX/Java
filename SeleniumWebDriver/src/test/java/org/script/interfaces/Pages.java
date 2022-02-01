package org.script.interfaces;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class Pages {
    @FindBy(xpath = "//div[@class='bottom-header__tools-search']")
    public WebElement icon_search;

    @FindBy(xpath = "//div[@id='search']/input")
    public WebElement input_search;

    @FindBy(xpath = "//button[@class='close']")
    public WebElement close_advertising_button;

    @FindBy(xpath = "//div[@class='category__title']/h1")
    public WebElement category_title;

    @FindBy(xpath = "//div[@class='sorting__list']")
    public WebElement sort_dropdown;

    @FindBy(xpath = "//div[@class='sorting__block']/a[text()='Ціна ▼']")
    public WebElement sorting_block_desk_titles;

    @FindBy(xpath = "//span[@class='price-old']")
    public List<WebElement> discounted_price_boxes;

    @FindBy(xpath = "//p[@class='product__body-price__price']")
    public List<WebElement> price_boxes;

    @FindBy(xpath = "//div[@class='product__body ']")
    public WebElement first_product_to_buy;

    @FindBy(xpath = "//button[@id='button-cart']")
    public WebElement addToBasket;

    @FindBy(xpath = "//div[@class='radio ']")
    public WebElement inputSize;

    @FindBy(xpath = "//div[@class='radio ']/label")
    public WebElement size_value;

    @FindBy(xpath = "//div[@class='product__title']/h1")
    public WebElement first_found_product_title;

    @FindBy(xpath = "//div[@class='cart__name']/a")
    public List <WebElement> product_title_in_basket;

    @FindBy(xpath = "//div[@class='product__price']")
    public WebElement first_found_product_price;

    @FindBy(xpath = "//span[@class='cart__price']")
    public List <WebElement> product_price_in_basket;

    @FindBy(xpath = "//button[@class='remodal-close']")
    public WebElement close;

    @FindBy(xpath = "//td[@class='cart-delete cart__item-delete']/a")
    public List <WebElement> delete_product_from_basket;

    @FindBy(xpath = "//tr[@class='cart__product']")
    public List <WebElement> count_products_in_basket;

    @FindBy(xpath = "//div[@class='product__pds-item']/a")
    public WebElement color_option;

    @FindBy(xpath = "//button[@class='button__plus']")
    public WebElement quantity_plus;

    @FindBy(xpath = "//div[@class='radio ']/input")
    public WebElement data_option_quantity;

    @FindBy(xpath = "//div[@class='product__title']/span")
    public WebElement vendor_code;

    @FindBy(xpath = "//div[@class='remodal-overlay remodal-is-opened']")
    public WebElement modal_basket_window;

    @FindBy(xpath = "//div[@class='cart__option']/small")
    public List <WebElement> product_size_in_basket;

    @FindBy(xpath = "//div[@class='header__cart']")
    public WebElement basket;
}
