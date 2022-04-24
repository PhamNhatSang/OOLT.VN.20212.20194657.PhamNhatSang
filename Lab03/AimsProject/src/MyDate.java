import java.util.Scanner;
import java.util.Calendar;

public class MyDate {
 private int day;
 private int month;
 private int year;
 public MyDate() {
	 Calendar cal = Calendar.getInstance();
	 this.day=cal.get(Calendar.DAY_OF_MONTH);
	 this.month=cal.get(Calendar.MONTH)+1;
	 this.year=cal.get(Calendar.YEAR);
 }
 
 public int Month(String m) {
	 if(m.equals("January")) {
		 return 1;
	 }
	 if(m.equals("February")) {
		 return 2;
	 }
	 if(m.equals("March")) {
		 return 3;
	 }
	 if(m.equals("April")) {
		 return 4;
	 }
	 if(m.equals("May")) {
		 return 5;
	 }
	 if(m.equals("June")) {
		 return 6;
	 }
	 if(m.equals("July")) {
		 return 7;
	 }
	 if(m.equals("August")) {
		 return 8;
	 }
	 if(m.equals("September")) {
		 return 9;
	 }
	 if(m.equals("October")) {
		 return 10;
	 }
	 if(m.equals("November")) {
		 return 11;
	 }
	 if(m.equals("December")) {
		 return 12;
	 }
	 return -1;
	 
	
 }
 public MyDate(int day,int month,int year) {
	 	     this.month=month;
	    
	     
	     this.day=day;
	     
		 this.year=year;
 }
 public MyDate(String date) {
	 int day ,month,year;
	 String[] part= date.split(" ");
	 String[] part1;
	 char c=part[1].charAt(1);
	 char d=part[1].charAt(2);
	 if(c=='s'||d=='s') {
		 day=1;
	 }else {if(c=='n'||d=='n') {
		 day=2;
	 }else {
		 if(c=='r'||d=='r') {
		 day=3;
	 }else {
		 part1=part[1].split("th");
		 day=Integer.parseInt(part1[0]);
	 } 
	 }
	 }
	 
     
     
     month=Month(part[0]);
     
     this.month=month;
    
     year=Integer.parseInt(part[2]);
    
     this.day=day;
     
	 this.year=year;
 }
 public void accept() {
	 Scanner keyboard = new Scanner(System.in);
	 System.out.println("Insert the day month and year");
	 String date=keyboard.nextLine();
	 int day ,month,year;
	 String[] part= date.split(" ");
	 String[] part1;
	 char c=part[1].charAt(1);
	 char d=part[1].charAt(2);
	 if(c=='s'||d=='s') {
		 day=1;
	 }else {if(c=='n'||d=='n') {
		 day=2;
	 }else {
		 if(c=='r'||d=='r') {
		 day=3;
	 }else {
		 part1=part[1].split("th");
		 day=Integer.parseInt(part1[0]);
	 } 
	 }
	 }
	 
     
     
     month=Month(part[0]);
     
     this.month=month;
    
     year=Integer.parseInt(part[2]);
    
     this.day=day;
     
	 this.year=year;
	 }
 public void print() {
	 System.out.println("Current date is: ");
	 System.out.println(java.time.LocalDate.now());

 }
public int getDay() {
	return day;
}
public void setDay(int day) {
	
	this.day = day;
	
}
public int getMonth() {
	return month;
}
public void setMonth(int month) {
	if(month>=1&&month<=12) {
	this.month = month;
	
}
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int checkday() {
	if(this.day>=1&&this.day<=31) {
		if(this.month==2) {
			if(this.day>29) {
				return 0;
			}
		}
		return 1;
	}
	return 0;
}
public int checkmonth() {
	if(this.month>=1&&this.month<=12) {
		return 1;
	}
	return 0;
}
 
}
