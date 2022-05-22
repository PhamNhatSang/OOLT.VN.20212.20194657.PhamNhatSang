package hust.soict.hedspi.aims;
import java.util.ArrayList;
import java.util.Scanner;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;
import hust.soict.hedspi.test.disc.TestPassingParameter;
public class Aims {
	public static void main(String[] args) {
		showMenu();
	}
	public static void showMenu() {
		Order order = new Order();
		
		while(true) { 
			System.out.println("Order Management Application: ");
			System.out.println("--------------------------------");
			System.out.println("1. Create new order");
			System.out.println("2. Add item to the order");
			System.out.println("3. Delete item by id");
			System.out.println("4. Display the items list of order");
			System.out.println("0. Exit");
			System.out.println("--------------------------------");
			System.out.println("Please choose a number: 0-1-2-3-4");
			
			Scanner keyboard = new Scanner(System.in);
			int choice= keyboard.nextInt();
			
			switch (choice) {
			case 1: order = new Order();
				break;
			case 2: order.addMedia();
				break;
			case 3: 
				System.out.print("Nhap id can xoa: ");
				int id = keyboard.nextInt();
				order.removeMedia(id);
				break;
			case 4:
				order.Printlist();
				break;
			default: 
				return;
			}
		}
	}

    public static Order CreatnewOrder() {
    	Order order=new Order();
    	return order;
    }
   
	
}
