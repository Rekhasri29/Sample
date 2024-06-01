package com.pageexe;

import com.base.BaseClass;
import com.pageobject.SelectHotelLocator;

public class SelectAHotelExe extends SearchAHotelExe {
	public static void clickRadioButton() {
		BaseClass.clickData(SelectHotelLocator.getSelect());
	}

	public static void continueButton() {
		BaseClass.clickData(SelectHotelLocator.getContinueButton());
	}
}
