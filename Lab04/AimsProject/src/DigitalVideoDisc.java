
public class DigitalVideoDisc {
 
	private String title;
	private String director;
	private String category;
	private int length;
	private float cost;

public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getDirector() {
	return director;
}
public void setDirector(String director) {
	this.director = director;
}
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public float getCost() {
	return cost;
}
public void setCost(float cost) {
	this.cost = cost;
}
 public DigitalVideoDisc(String title) {
	 super();
	 this.title=title;
 }
 public DigitalVideoDisc(String title,String category) {
	 this(title);
	 this.category=category;
 }
 public DigitalVideoDisc(String title,String category,String director) {
	this(title,category);
	 this.director=director;
 }
 public DigitalVideoDisc(String title,String category,String director,int length,float cost) {
	 this(title,category,director);
	 this.length=length;
	 this.cost=cost;
 }
 public void PrintD() {
	 System.out.println(this.getCategory()+"-"+this.getDirector()+"-"+this.getCost()+"-"+this.getLength()+"-"+this.getTitle());
 }
}
