import java.time.LocalDate;

public class Order {
	public static final int MAX_NUMBERS_ORDERS=5;
	 private static int nOrders=0; 
 int itemorders=0;
 public static final int MAX_NUMBERS_ORDERED=10;
 private static MyDate dateOrdered;
 private DigitalVideoDisc itemsOrdered[]=new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
 int qtyOrdered=0;
 public Order() {
	 if(this.nOrders>=this.MAX_NUMBERS_ORDERS) {
		System.out.println("full size of orders");
		 this.itemorders=this.nOrders;
	 }else {
			this.dateOrdered=new MyDate();
			LocalDate h=java.time.LocalDate.now();
			String date=h.toString();
			int days,months,years;
			String[] checkM = {"January","February","March","April","May","June","July","August","September","October","November","December"};

			String[] daysconvert={"1st","2nd","3rd","4th","5th","6th","7th","8th","9th","10th","11th","12th","13th","14th","15th","16th","17th","18th","19th","21th","22th","23th","24th","25th","26th","27th","28th","29th","30th","31st"};
			String [] part=date.split("-");
			days=Integer.parseInt(part[2]);
			months=Integer.parseInt(part[1]);
			years=Integer.parseInt(part[0]);
			this.dateOrdered.setDay(days);
			this.dateOrdered.setMonth(months);
			this.dateOrdered.setYear(years);
	
		 this.nOrders++;
		 this.itemorders=this.nOrders;
		 
	 }
 }
public  void addDigitalVideoDisc(DigitalVideoDisc disc) {
	if(this.itemorders<MAX_NUMBERS_ORDERS) {
	if(this.qtyOrdered<MAX_NUMBERS_ORDERED) {
		this.itemsOrdered[this.qtyOrdered]=new DigitalVideoDisc(disc.getTitle(),disc.getCategory(),disc.getDirector(),disc.getLength(),disc.getCost());
	
	System.out.println("The disc has been added");
	this.qtyOrdered++;
	}else {
		System.out.println("The order is almost full");
	}
	}else {
		System.out.println("Can't add because full size of orders");
	}
}
public  void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
	if(this.itemorders<MAX_NUMBERS_ORDERS) {
	for(int i=0;i< dvdList.length;i++) {
		addDigitalVideoDisc(dvdList[i]);
		if(i>MAX_NUMBERS_ORDERED) {
			break;
		}
	}
	}else {
		System.out.println("Can't add because full size of orders");
	}
}
public  void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
	if(this.itemorders<MAX_NUMBERS_ORDERS) {
	if(this.qtyOrdered==MAX_NUMBERS_ORDERED) {
		System.out.println("The item quantity has reached its limit.");
	}
	if(this.qtyOrdered<MAX_NUMBERS_ORDERED) {
		addDigitalVideoDisc(dvd1);
	}else {
		System.out.println("The dvd could not be added : Title: " +dvd1.getTitle()+"-"+"Category: "+dvd1.getCategory()+"-"+"Director: "+dvd1.getDirector());
		
	}
	if(this.qtyOrdered==MAX_NUMBERS_ORDERED) {
		System.out.println("The item quantity has reached its limit.");
	}
	if(this.qtyOrdered<MAX_NUMBERS_ORDERED) {
		addDigitalVideoDisc(dvd2);
	}else {
		System.out.println("The dvd could not be added : Title: " +dvd2.getTitle()+"-"+"Category: "+dvd2.getCategory()+"-"+"Director: "+dvd2.getDirector());
		
	}
	}else {
		System.out.println("Can't add because full size of orders");
	}
}
public int compare(DigitalVideoDisc disc,DigitalVideoDisc disc2) {
	
	if(disc.getCategory().equals(disc2.getCategory()) && disc.getDirector().equals(disc2.getDirector()) && disc.getCost()==disc2.getCost() && disc.getLength()==disc2.getLength() && disc.getTitle().equals(disc2.getTitle())) {
		return 1 ;
	}
	return 0;
}
public  void removeDigitalVideoDisc(DigitalVideoDisc disc)  {
	int index;
	for(int i=0;i<this.qtyOrdered;i++) {
		if(compare(itemsOrdered[i],disc)==1) {
			index=i;
			for(int k=index;k<this.qtyOrdered;k++) {
				if(k+1 < this.qtyOrdered) {
					this.itemsOrdered[k].setTitle(this.itemsOrdered[k+1].getTitle());
					this.itemsOrdered[k].setCategory(this.itemsOrdered[k+1].getCategory());
					this.itemsOrdered[k].setDirector(this.itemsOrdered[k+1].getDirector());
					this.itemsOrdered[k].setLength(this.itemsOrdered[k+1].getLength());
					this.itemsOrdered[k].setCost(this.itemsOrdered[k+1].getCost());
				}
			}
			System.out.println("Remove ok");
			qtyOrdered--;
		}
	}
	
}
public float totalCost() {
	float sum=0;
	for(int i=0;i<this.qtyOrdered;i++) {
		sum+=this.itemsOrdered[i].getCost();
	}
	return sum;
}
public void Printlist() {
	System.out.println("***********************Order***********************");
	System.out.print("Date :");
    MyDate.print1(dateOrdered);
	for(int i=0;i<this.qtyOrdered;i++) {
		System.out.println(i+"."+"DVD"+"-"+"["+this.itemsOrdered[i].getTitle()+"]"+"-"+"["+this.itemsOrdered[i].getCategory()+"]"+"-"+"["+this.itemsOrdered[i].getDirector()+"]"+"-"+"["+this.itemsOrdered[i].getLength()+"]"+":"+"["+this.itemsOrdered[i].getCost()+"]");
	}
	System.out.println("Total cost: "+"["+totalCost()+"]");
	System.out.println("***************************************************");

}
}
