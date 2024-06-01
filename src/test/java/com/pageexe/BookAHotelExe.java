package com.pageexe;

import com.base.BaseClass;
import com.pageobject.BookAHotelLocator;

public class BookAHotelExe extends SelectAHotelExe {
	public static void firstName() {
		BaseClass.inputData(BookAHotelLocator.getFirstName(), BaseClass.reuseExcel(1, 11));
	}

	public static void lastName() {
		BaseClass.inputData(BookAHotelLocator.getLastName(), BaseClass.reuseExcel(1, 12));
	}

	public static void billingAddress() {
		BaseClass.inputData(BookAHotelLocator.getBillingAddress(), BaseClass.reuseExcel(1, 13));
	}

	public static void crediCardNo() {
		BaseClass.inputData(BookAHotelLocator.getCreditCardNo(), BaseClass.reuseExcel(1, 14));
	}

	public static void creditCardType() {
		BaseClass.selectByValue(BookAHotelLocator.getCreditCardType(), BaseClass.reuseExcel(2, 15));
	}

	public static void expiryMonth() {
		BaseClass.selectByValue(BookAHotelLocator.getExpiryMonth(), BaseClass.reuseExcel(4, 16));
	}

	public static void expiryYear() {
		BaseClass.selectByValue(BookAHotelLocator.getExpiryYear(), BaseClass.reuseExcel(15, 17));
	}

	public static void cvvNumber() {
		BaseClass.inputData(BookAHotelLocator.getCvvNumber(), BaseClass.reuseExcel(1, 18));
	}

	public static void bookNowButton() {
		BaseClass.clickData(BookAHotelLocator.getBookNowButton());
	}

	public static void orderNo() {
		BaseClass.getAttributeMethod(BookAHotelLocator.getOrderNo(), "value");
	}
}
