package hust.soict.hedspi.aims.media;

public class Media {
	protected String title;
	protected String category;
	protected float cost;
	protected int id;
	
	public Media(){
		this.title = "null";
	}
	public Media(String title){
		this.title = title;
	}
	public Media(String title, String category){
		this(title);
		this.category = category;
	}
	public Media(int id, String title, String category,float cost){
		this(title,category);
		this.cost=cost;
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
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
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
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
