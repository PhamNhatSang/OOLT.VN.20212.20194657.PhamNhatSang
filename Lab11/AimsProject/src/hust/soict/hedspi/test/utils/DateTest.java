package hust.soict.hedspi.test.utils;

import hust.soict.hedspi.aims.utils.DateUtils;
import hust.soict.hedspi.aims.utils.MyDate;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate mydate1= new MyDate();
		if(mydate1.checkday()==1&&mydate1.checkmonth()==1) {
			System.out.println("mydate1 is :"+mydate1.getDay()+"-"+mydate1.getMonth()+"-"+mydate1.getYear());
		}else {
			if(mydate1.checkday()==0) {
				System.out.println("mydate1 error day:");
			}
			if(mydate1.checkmonth()==0) {
				System.out.println("mydate1 error month:");
			}
		}
       MyDate mydate=new MyDate(1,19,2020);
       if(mydate.checkday()==1&&mydate.checkmonth()==1) {
			System.out.println("mydate is :"+mydate.getDay()+"-"+mydate.getMonth()+"-"+mydate.getYear());
		}else {
			if(mydate.checkday()==0) {
				System.out.println("mydate error day:");
			}
			if(mydate.checkmonth()==0) {
				System.out.println("mydate error month:");
			}
		}
		MyDate mydate2=new MyDate("February 18th 2020");
		if(mydate2.checkday()==1&&mydate2.checkmonth()==1) {
			System.out.println("mydate2 is :"+mydate2.getDay()+"-"+mydate2.getMonth()+"-"+mydate2.getYear());
		}else {
			if(mydate2.checkday()==0) {
				System.out.println("mydate2 error day:");
			}
			if(mydate2.checkmonth()==0) {
				System.out.println("mydate2 error month:");
			}
		}
		MyDate mydate3=new MyDate("February 33th 2020");
		if(mydate3.checkday()==1&&mydate3.checkmonth()==1) {
			System.out.println("mydate3 is :"+mydate3.getDay()+"-"+mydate3.getMonth()+"-"+mydate3.getYear());
		}else {
			if(mydate3.checkday()==0) {
				System.out.println("mydate3 error day:");
			}
			if(mydate3.checkmonth()==0) {
				System.out.println("mydate3 error month:");
			}
		}
		MyDate[]  mydate4 =new MyDate[6];
		 mydate4[0] =new MyDate ("third","October","twenty nineteen");
		MyDate.print1(mydate4[0]);
		 mydate4[1] = new MyDate ("first","November","two thousand and six");
		MyDate.print2(mydate4[1]);
		mydate4[2]=new MyDate ("second","January","two thousand and ninetysix");
		MyDate.print3(mydate4[2]);
	    mydate4[3]=new MyDate ("sixth","December","nineteen ninetysix");
	    MyDate.print4(mydate4[3]);
		mydate4[4]=new MyDate ("fifteenth","February","twenty twentytwo");
		MyDate.print5(mydate4[4]);
		mydate4[5]=new MyDate ("thirtyfirst","July","twenty nineteen");
		
		MyDate.printdatebychoose(mydate4[5]);
		DateUtils Untl=new DateUtils();
		System.out.println("The list before sort");
		for(int i=0;i<mydate4.length;i++) {
			MyDate.print1(mydate4[i]);
		}
		Untl.SortDate(mydate4);
		System.out.println("The list After sort");
		for(int i=0;i<mydate4.length;i++) {
			MyDate.print1(mydate4[i]);
		}
		System.out.println("Current day is:");
		
		MyDate.printcurrentconvert();
		

}
}
