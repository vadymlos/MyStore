package steps.UI;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import pages.OrderHistoryPage;

public class OrderHistoryStep {
    OrderHistoryPage orderHistoryPage = new OrderHistoryPage();

    @Step("Check order status")
    public void checkOrderStatus(){
        orderHistoryPage.getStatusOnBackorder().shouldHave(Condition.text("On backorder"));
    }
}
