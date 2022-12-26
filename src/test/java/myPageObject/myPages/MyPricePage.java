package myPageObject.myPages;

import myPageObject.BasicFunctions;
import org.openqa.selenium.By;

public class MyPricePage {
    private  final By BOOK_PRICE = By.id("book2");
    private BasicFunctions basicFunctions;

    public MyPricePage(BasicFunctions basicFunctions) {
        this.basicFunctions = basicFunctions;

    }
    public void bookPrice(){
        basicFunctions.click(BOOK_PRICE);
    }



}
