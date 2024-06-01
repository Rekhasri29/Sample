package com.exe;

import com.pageexe.BookAHotelExe;
import com.pageexe.LoginPageExe;

public class Exe extends BookAHotelExe {
	public static void main(String[] args) {

		browserLaunch();
		username();
		password();
		login();
		threadSleep(2000);
		
		location();
		hotels();
		roomType();
		numberOfRooms();
		clearOne();
		checkInDate();
		clearTwo();
		checkOutDate();
		adultsPerRoom();
		childrenPerRoom();
		submit();
		threadSleep(2000);
		
		clickRadioButton();
		continueButton();
		threadSleep(2000);
		
		firstName();
		lastName();
		billingAddress();
		crediCardNo();
		creditCardType();
		expiryMonth();
		expiryYear();
		cvvNumber();
		bookNowButton();
		threadSleep(5000);
		
		orderNo();
	}
}
