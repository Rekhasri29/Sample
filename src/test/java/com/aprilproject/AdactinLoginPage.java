package com.aprilproject;

import org.openqa.selenium.By;

public class AdactinLoginPage extends PageLocators {
	public static void main(String[] args) throws InterruptedException {
		BaseClass.browserLaunch();
		BaseClass.loadUrl(BaseClass.reuseExcel(1, 2));
		BaseClass.input_Text(PageLocators.byId("username"), BaseClass.reuseExcel(1, 0));
		BaseClass.input_Text(PageLocators.byId("password"), BaseClass.reuseExcel(1, 1));
		BaseClass.click(PageLocators.byId("login"));
		
		BaseClass.threadSleep(3000);
		
		BaseClass.selectByValue(PageLocators.byId("location"), BaseClass.reuseExcel(1, 3));
		BaseClass.selectByValue(PageLocators.byId("hotels"), BaseClass.reuseExcel(2, 4));
		BaseClass.selectByValue(PageLocators.byId("room_type"), BaseClass.reuseExcel(1, 5));
//		BaseClass.click(PageLocators.byXpath("//option[@value='Standard']"));
		BaseClass.selectByVisibleText(PageLocators.byId("room_nos"), BaseClass.reuseExcel(2, 6));
		BaseClass.clear(PageLocators.byId("datepick_in"));
		BaseClass.input_Text(PageLocators.byId("datepick_in"), BaseClass.reuseExcel(1, 7));
		BaseClass.clear(PageLocators.byId("datepick_out"));
		BaseClass.input_Text(PageLocators.byId("datepick_out"), BaseClass.reuseExcel(1, 8));
		BaseClass.selectByVisibleText(PageLocators.byId("adult_room"), BaseClass.reuseExcel(2, 9));
		BaseClass.selectByVisibleText(PageLocators.byId("child_room"), BaseClass.reuseExcel(3, 10));
		BaseClass.click(PageLocators.byId("Submit"));

		BaseClass.click(PageLocators.byXpath("//input[@type='radio']"));
		BaseClass.click(PageLocators.byId("continue"));
		
		BaseClass.input_Text(PageLocators.byId("first_name"), BaseClass.reuseExcel(1, 11));
		BaseClass.input_Text(PageLocators.byId("last_name"), BaseClass.reuseExcel(1, 12));
		BaseClass.input_Text(PageLocators.byId("address"), BaseClass.reuseExcel(1, 13));
		BaseClass.input_Text(PageLocators.byId("cc_num"), BaseClass.reuseExcel(1, 14));
		BaseClass.selectByValue(PageLocators.byId("cc_type"), BaseClass.reuseExcel(2, 15));
		BaseClass.selectByVisibleText(PageLocators.byId("cc_exp_month"), BaseClass.reuseExcel(4, 16));
		BaseClass.selectByVisibleText(PageLocators.byId("cc_exp_year"), BaseClass.reuseExcel(15, 17));
		BaseClass.input_Text(PageLocators.byId("cc_cvv"), BaseClass.reuseExcel(1, 18));
		BaseClass.click(PageLocators.byId("book_now"));
		
		BaseClass.threadSleep(5000);
		
		BaseClass.getattribute(PageLocators.byXpath("//input[@name='order_no']"),"value");
		
		
			
	}
}
