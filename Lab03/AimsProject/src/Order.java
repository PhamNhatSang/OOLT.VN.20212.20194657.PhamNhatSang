
public class Order {
 public static final int MAX_NUMBERS_ORDERED=10;
 private DigitalVideoDisc itemsOrdered[]=new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
 int qtyOrdered=0;
public  void addDigitalVideoDisc(DigitalVideoDisc disc) {
	if(this.qtyOrdered<MAX_NUMBERS_ORDERED) {
		this.itemsOrdered[this.qtyOrdered]=new DigitalVideoDisc(disc.getTitle(),disc.getCategory(),disc.getDirector(),disc.getLength(),disc.getCost());
	
	System.out.println("The disc has been added");
	this.qtyOrdered++;
	}else {
		System.out.println("The order is almost full");
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
}
