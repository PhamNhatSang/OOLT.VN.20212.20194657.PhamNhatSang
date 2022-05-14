package hust.soict.hedspi.lab02;
import java.util.Scanner;
public class Sortnumeric {
	public static Scanner scanner = new Scanner(System.in);
    
	public static void sortASC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
     
  
    public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int Sum(int[] arr) {
    	int sum=0;
    	for(int i=0;i<arr.length;i++) {
    		sum+=arr[i];
    	}
    	return sum;
    
    }
    public static void main(String[] args) {
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        
        int [] arr = new int [n];
        System.out.print("Nhap cac phan tu cua mang  \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
      
        sortASC(arr);
        System.out.println("Dãy số được sắp xếp tăng dần: ");
        show(arr);
        System.out.println("\nTong cac phan tu cua day: "+Sum(arr));
        
        
    }
     
    
    
}
