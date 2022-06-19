package hust.soict.hedspi.aims.media;
import javax.swing.JOptionPane;

import hust.soict.hedspi.aims.PlayerException;
public abstract class Media implements Comparable {
private String title;
private String category;
private float cost;
private int id;
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
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
/*public boolean equals(Object obj)  {
	if (obj == null)
        return false;
    if (getClass().getSimpleName() != obj.getClass().getSimpleName())
        return false;
    Media tmp = (Media) obj;
    if(this.id==tmp.getId()) {
    	return true;
    }
    return false;
}*/
public boolean equals(Object obj)  {
	
	try {
    Media tmp = (Media) obj;
    if(this.getTitle()==tmp.getTitle()) {
    	return true;
    }
	}catch(NullPointerException e) {
		JOptionPane.showMessageDialog(null,
			    "Has null pointer",
			    "Compare ERROR",
			    JOptionPane.ERROR_MESSAGE);
		
	}catch(ClassCastException e) {
		JOptionPane.showMessageDialog(null,
			    "ClassCastException",
			    "Compare ERROR",
			    JOptionPane.ERROR_MESSAGE);
	}
    return false;
}
/*public int compareTo(Media obj) {
	
	    assert obj != null :"Error because has null";
    	assert getClass().getSimpleName() == obj.getClass().getSimpleName() :"Error because does't match class";
    //Media tmp = (Media) obj;
    if(obj.getTitle().compareTo(this.title)==0) {
    	return 0;
    }
    if(obj.getTitle().compareTo(this.title)<0) {
    	return 1;
    }
     return -1;
}*/
public int compareTo(Object obj) {
	
		try{
   Media tmp=(Media) obj;
if(tmp.getTitle().compareTo(this.title)==0) {
	if(tmp.getCost()==this.cost) {
		return 0;
	}
}
if(tmp.getTitle().compareTo(this.title)<0) {
	return 1;
}
 
		}catch(NullPointerException e){
			JOptionPane.showMessageDialog(null,
				    "Has null pointer",
				    "Compare ERROR",
				    JOptionPane.ERROR_MESSAGE);
		}catch(ClassCastException e) {
			JOptionPane.showMessageDialog(null,
				    "ClassCastException",
				    "Compare ERROR",
				    JOptionPane.ERROR_MESSAGE);
		}
		return -1;
	}
	

public String toString() {
	return this.title;
}
public abstract String getDetail() ;
public void setCost(float i) {
	this.cost=i;
	
}


}
