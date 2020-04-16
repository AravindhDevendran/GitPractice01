package com.Java.Practice;

public class AmusementParkTicketing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int TicketPrice=400;
		int Tickets =25;
		int Total1 = 0;
		int Total2 = 0;
		int discount1;
		int discount2;
		int ActualPrice;
		int discountvalue [] = {10,20};
		
ActualPrice = Tickets*TicketPrice;
	
if (Tickets >=10 && Tickets <20)
{	
	discount1 = (ActualPrice*discountvalue[0])/100;
	Total1 = ActualPrice - discount1;
	System.out.println("Actual Amount is " + ActualPrice);
	System.out.println("Eligible for " + discountvalue[0] +"% discount");
	System.out.println("Total Amount is " + Total1);
}
else if  (Tickets >=20){
	discount2 = (ActualPrice*discountvalue[1])/100;
	Total2 = ActualPrice - discount2;
	System.out.println("Actual Amount is " + ActualPrice);
	System.out.println("Eligible for " + discountvalue[1] +"% discount");
	System.out.println("Discount Amount " + discount2);
	System.out.println("Total Amount is " + Total2);
}
else {
	System.out.println("Total Amount is " + ActualPrice);
	System.out.println("Not Eligible for discount");
}
	}
}
