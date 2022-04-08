import java.util.Scanner;

public class Triangle {
	public static void main(String args[]) {
		int k=0;
		Scanner temp = new Scanner(System.in);
		System.out.println("Insert the stars: ");
		int stars= temp.nextInt();
		for(int i=0;i<stars;i++) {
			for(int j=i+1;j<stars;j++) {
				System.out.print(" ");
			}
			for(int f=0;f<2*k+1;f++) {
				System.out.print("*");
			}
			k++;
			System.out.println();
		}
		
	}
}
