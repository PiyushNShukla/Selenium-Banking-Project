package com.ibm.banking.pages;

import org.openqa.selenium.By;

import com.ibm.framework.base.BasePage;

public class DashboardPage extends BasePage {
	
    private By totalAvailableBalanceLabel =
            By.xpath("//p[text()='Total Available Balance']");

	
    public boolean isDashboardDisplayed() {
        return isDisplayed(totalAvailableBalanceLabel);
    }
}
