package system.change_quantity_item;

import base.Base;
import org.testng.annotations.Test;
import page_library.AddingToCartPage;
import page_library.HomePage;
import page_library.ProductPage;

import static org.testng.AssertJUnit.assertEquals;

public class TestChangeQuantity extends Base {
    @Test
    public void changeQuantityTest(){
        HomePage homePage = new HomePage();
        ProductPage productPage = new ProductPage();
        AddingToCartPage addingToCartPage = new AddingToCartPage();
        String item = prop.getProperty("item_to_search");
        homePage.searchItems(item);
        productPage.clickItem();
        addingToCartPage.clickOnPlusIcon();
        String quantityWanted=prop.getProperty("quantity");
        assertEquals(quantityWanted,addingToCartPage.quantityValue.getAttribute("value"));


    }
}
