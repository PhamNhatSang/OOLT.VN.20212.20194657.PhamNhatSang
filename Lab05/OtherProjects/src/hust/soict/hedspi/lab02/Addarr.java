package hust.soict.hedspi.lab02;
import java.util.Scanner;

public class Addarr {
public static void main(String args[]) {
	Scanner temp= new Scanner(System.in);
	System.out.println("Nhap so phan tu cua mang");
	int sopt=temp.nextInt();
	int[] arr1= new int[sopt];
	int[] arr2= new int[sopt];
	System.out.println("Nhap mang 1: ");
	for(int i=0;i<sopt;i++) {
		System.out.println("arr1["+i+"]= ");
		arr1[i]=temp.nextInt();
	}
	System.out.println("Nhap mang 2: ");
	for(int i=0;i<sopt;i++) {
		System.out.println("arr2["+i+"]= ");
		arr2[i]=temp.nextInt();
	}
	System.out.println("Xuat 2 mang:");
	for(int i=0;i<sopt;i++) {
		System.out.println("arr1["+i+"]= "+arr1[i]);
		
	}
	for(int i=0;i<sopt;i++) {
		System.out.println("arr2["+i+"]= "+arr2[i]);
		
	}
}
}
