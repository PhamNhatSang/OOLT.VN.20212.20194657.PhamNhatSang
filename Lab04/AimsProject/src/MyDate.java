import java.util.Scanner;
import java.util.Calendar;
import java.time.LocalDate;
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
 public int changeDayString(String day) {

String[] days= { "first","second","third","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth","thirteenth","fourteenth","fifteenth","sixteenth","seventeenth","eighteenth","nineteenth","twentieth","twentyfirst","twentysecond","twentythird","twentyfourth","twentyfifth","twentysixth","twentyseventh","twentyeighth","twentyninth","thirtieth","thirtyfirst"};
for(int i=0;i<days.length;i++) {
	if(day.equals(days[i])) {
		return i+1;
	}
}
return -1;
}
 
	 
 
 public int changeMonthString(String month) {
		String[] checkM = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		int i;
		for( i=0;i<checkM.length;i++) {
			if(month.equals(checkM[i])) {
				i=i+1;
				return i ;
			}
		}
		return 0;
 }
 public String CheckStringnumber(String num) {
	 String nums= new String();
	 String[] checkY = {"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen",
				"twenty","twentyone","twentytwo","twentythree","twentyfour","twentyfive","twentysix","twentyseven","twentyeight","twentynine",
				"thirty","thirtyone","thirtytwo","thirtythree","thirtyfour","thirtyfive","thirtysix","thirtyseven","thirtyeight","thirtynine",
				"forty","fortyone","fortytwo","fortythree","fortyfour","fortyfive","fortysix","fortyseven","fortyeight","fortynine",
				"fifty","fiftyone","fiftytwo","fiftythree","fiftyfour","fiftyfive","fiftysix","fiftyseven","fiftyeight","fiftynine",
				"sixty","sixtyone","sixtytwo","sixtythree","sixtyfour","sixtyfive","sixtysix","sixtyseven","sixtyeight","sixtynine",
				"seventy","seventyone","seventytwo","seventythree","seventyfour","seventyfive","seventysix","seventyseven","seventyeight","seventynine",
		        "eighty", "eightyone", "eightytwo", "eightythree", "eightyfour", "eightyfive", "eightysix", "eightyseven", "eightyeight", "eightynine",
		        "ninety", "ninetyone", "ninetytwo", "ninetythree", "ninetyfour", "ninetyfive", "ninetysix", "ninetyseven", "ninetyeight", "ninetynine"};
	 if(num.equals("thousand")) {
		 return "0";
	 }
	 for(int i=0;i<checkY.length;i++) {
		 if(num.equals(checkY[i])) {
			 if((i+1>=0) && (i+1<10)) {
				 nums=nums+"0"+(i+1);
				 return nums;
			 }else {
				 nums=nums+(i+1);
				 return nums;
			 }
		 }
	 }
	 return "x";
	
 }
 public int changeYearString(String year) {
	 String Y=new String();
	 String[] part=year.split(" ");
	 for(int i=0;i<part.length;i++) {
		 if(CheckStringnumber(part[i]).equals("x")==false) {
			 Y=Y+CheckStringnumber(part[i]);
		 }
	 }
	 int years=Integer.parseInt(Y);
	 
	 return years;
	 
 }
 public MyDate(String day,String month,String year) {
	 int days,months,years;
	 days=changeDayString(day);
	 months=changeMonthString(month);
	 years=changeYearString(year);
	 this.day=days;
	 this.month=months;
	 this.year=years;
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
 public void printcurrent() {
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
public  static void printcurrentconvert() {
	String dateconvert=new String();
LocalDate h=java.time.LocalDate.now();
String date=h.toString();
int days,months,years;
String[] checkM = {"January","February","March","April","May","June","July","August","September","October","November","December"};

String[] daysconvert={"1st","2nd","3rd","4th","5th","6th","7th","8th","9th","10th","11th","12th","13th","14th","15th","16th","17th","18th","19th","21th","22th","23th","24th","25th","26th","27th","28th","29th","30th","31st"};
String [] part=date.split("-");
days=Integer.parseInt(part[2]);
months=Integer.parseInt(part[1]);
years=Integer.parseInt(part[0]);
for(int i=0;i<checkM.length;i++) {
	if(i+1==months) {
		dateconvert=dateconvert+checkM[i]+" ";
	}
}
for(int i=0;i<daysconvert.length;i++) {
	if(i+1==days) {
		dateconvert=dateconvert+daysconvert[i]+" ";
	}
}
dateconvert=dateconvert+years;
System.out.println(dateconvert);
}
public static void print1(MyDate date) {
	String dates=new String();
	String months=new String();
	String days =new String();
	if(date.getDay()<10) {
		days=days+"0"+date.getDay();
	}else {
		days=days+date.getDay();
	}
	if(date.getMonth()<10) {
		months=months+"0"+date.getMonth();
	}else {
		months=months+date.getMonth();
	}
	dates=dates+date.getYear()+"-"+months+"-"+days;
	System.out.println(dates);
}
public static void print2(MyDate date) {
	System.out.println(date.getDay()+"/"+date.getMonth()+"/"+date.getYear());
}
public  static void print3(MyDate date) {
	String[] checkM = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};
	
	String months=new String();
	String days =new String();
	if(date.getDay()<10) {
		days=days+"0"+date.getDay();
	}
	for(int i=0;i<checkM.length;i++) {
		if(i+1==date.getMonth()) {
			months = checkM[i] ;
		}
	}
	System.out.println(days+"-"+months+"-"+date.getYear());
	
}
public static void print4(MyDate date) {
String[] checkM = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};
	
	String months=new String();
	String days =new String();
	if(date.getDay()<10) {
		days=days+"0"+date.getDay();
	}
	for(int i=0;i<checkM.length;i++) {
		if(i+1==date.getMonth()) {
			months = checkM[i] ;
		}
	}
	System.out.println(months+" "+date.getDay()+" "+date.getYear());
}
public static void print5(MyDate date) {
	String dates=new String();
	String months=new String();
	String days =new String();
	if(date.getDay()<10) {
		days=days+"0"+date.getDay();
	}else {
		days=days+date.getDay();
	}
	if(date.getMonth()<10) {
		months=months+"0"+date.getMonth();
	}else {
		months=months+date.getMonth();
	}
	dates=dates+months+"-"+days+"-"+date.getYear();
	System.out.println(dates);
}
 public static void printdatebychoose(MyDate date) {

	 System.out.println("Print by format choose 1 2 3 4 5 ");
	 System.out.println("1.yyyy-MM-dd"+"/n"+"2.d/M/yyyy"+"/n"+"3.dd-MMM-yyyy"+"/n"+"4.MMM d yyyy"+"/n"+"5.mm-dd-yyyy");
	 Scanner keyboard = new Scanner(System.in);
	 int choose=keyboard.nextInt();
	 if(choose==1) {
		 print1(date);
	 }
	 if(choose==2) {
		 print2(date);
	 }
	 if(choose==3) {
		 print3(date);
	 }
	 if(choose==4) {
		 print4(date);
	 }
	 if(choose==5) {
		 print5(date);
	 }
 }
}
