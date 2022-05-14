package hust.soict.hedspi.lab02;
import java.util.Arrays;
import java.util.Scanner;



public class DayAndMonth {
	
 public static int RightMonth(String month) {
	String[] checkM = {"January","Jan","1","February","Feb","2","March","Mar","3","April","Apr","4","May","5","June","Jun","6","July","Jul","7","August","Aug","8","Sept","September","9","October","Oct","10","November","Nov","11","December","Dec","12"};
	for( int i=0;i<checkM.length;i++) {
		if(month.equals(checkM[i])) {
			return 1;
		}
	}
	return 0;
	
}


public static void main(String args[]) {
	String month;
	int years;

	
	do {
		Scanner temp =new Scanner(System.in);
		System.out.println("Insert month: ");
		month=temp.nextLine();
		System.out.println("Insert year: ");
		years=temp.nextInt();
		if(RightMonth(month)==0||years<400) {
			System.out.println("Wrong data please insert again: ");
		}
	}while(RightMonth(month)==0||years<400);
	
	if(month.equals("January")||month.equals("Jan")||month.equals("1")) {
		System.out.println("31");
	}
	if(month.equals("February")||month.equals("Feb")||month.equals("2")) {
		if((years % 100)==0 ) {
			if((years % 400)==0){
				System.out.println("29");
			}else {
				System.out.println("28");
			}
		}else {
			if((years % 4)==0){
				System.out.println("28");
			}
		}
	}
	if(month.equals("March")||month.equals("Mar")||month.equals("3")) {
		System.out.println("31");
	}
	if(month.equals("April")||month.equals("Apr")||month.equals("4")) {
		System.out.println("30");
	}
	if(month.equals("May")||month.equals("5")) {
		System.out.println("31");
	}
	if(month.equals("June")||month.equals("Jun")||month.equals("6")) {
		System.out.println("30");
	}
	if(month.equals("July")||month.equals("Jul")||month.equals("7")) {
		System.out.println("31");
	}
	if(month.equals("August")||month.equals("Aug")||month.equals("8")) {
		System.out.println("31");
	}
	if(month.equals("September")||month.equals("Sep")||month.equals("9")) {
		System.out.println("30");
	}
	if(month.equals("October")||month.equals("Oct")||month.equals("10")) {
		System.out.println("31");
	}
	if(month.equals("November")||month.equals("Nov")||month.equals("11")) {
		System.out.println("30");
	}
	if(month.equals("December")||month.equals("Dec")||month.equals("12")) {
		System.out.println("31");
	}
	
}
}
