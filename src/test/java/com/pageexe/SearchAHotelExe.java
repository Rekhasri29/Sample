package com.pageexe;

import com.base.BaseClass;
import com.pageobject.SearchHotelLocator;

public class SearchAHotelExe extends LoginPageExe {
	public static void location() {
		BaseClass.selectByValue(SearchHotelLocator.getLocation(), BaseClass.reuseExcel(1, 3));
	}

	public static void hotels() {
		BaseClass.selectByValue(SearchHotelLocator.getHotels(), BaseClass.reuseExcel(2, 4));
	}

	public static void roomType() {
		BaseClass.selectByValue(SearchHotelLocator.getRoomType(), BaseClass.reuseExcel(1, 5));
	}

	public static void numberOfRooms() {
		BaseClass.selectByValue(SearchHotelLocator.getNumberOfRooms(), BaseClass.reuseExcel(2, 6));
	}

	public static void clearOne() {
		BaseClass.clearMethod(SearchHotelLocator.getClearCheckIn());
	}

	public static void checkInDate() {
		BaseClass.inputData(SearchHotelLocator.getCheckInDate(), BaseClass.reuseExcel(1, 7));
	}

	public static void clearTwo() {
		BaseClass.clearMethod(SearchHotelLocator.getClearCheckOut());
	}

	public static void checkOutDate() {
		BaseClass.inputData(SearchHotelLocator.getCheckOutDate(), BaseClass.reuseExcel(1, 8));
	}

	public static void adultsPerRoom() {
		BaseClass.selectByValue(SearchHotelLocator.getAdultsPerRoom(), BaseClass.reuseExcel(2, 9));
	}

	public static void childrenPerRoom() {
		BaseClass.selectByValue(SearchHotelLocator.getChildrenPerRoom(), BaseClass.reuseExcel(3, 10));
	}

	public static void submit() {
		BaseClass.clickData(SearchHotelLocator.getSubmitButton());
	}

}
