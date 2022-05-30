package hust.soict.hedspi.aims.media;

public abstract class Media {
private String title;
private String category;
private float cost;
public Media(){
	super();
}
public Media(String title){
	this.title = title;
}
public Media(String title, String category){
this(title);
this.category = category;
}
public Media(String title, String category,float cost){
this(title,category);
this.cost=cost;
}

public String getTitle() {
	return title;
}

public String getCategory() {
	return category;
}

public float getCost() {
	return cost;
}

public void Print() {
	 System.out.println("["+this.getCategory()+"]-["+this.getCost()+"]-["+this.getTitle()+"]");
}
public static int compare(Media media1,Media media2) {
	if(media1.getCategory().equals(media2.getCategory())  && media1.getCost()==media2.getCost() && media1.getTitle().equals(media2.getTitle())) {
 return 1;
}
	return 0;

}
}
