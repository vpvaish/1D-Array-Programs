package Array1;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		System.out.println("Enter Size Of ");
//		Enter size
		Scanner sc = new Scanner(System.in);
		
	int size = sc.nextInt();
		
//		Array syntax : 
		int Array1[] = new int[size];
		
		System.out.println("Enter the " + size + " Elements in an array ");
//		Enter elements 
		for(int i=0; i<Array1.length;i++) {
			
			Array1[i] = sc.nextInt();
			
		}
		
//		System.out.println("Array Elements are :");
////		Print elements : 
//		
//for(int i=0; i<Array1.length;i++) {
//			System.out.println(Array1[i]);
//		}
//
//// Reverse 
//
//System.out.println("Reverse Of An Array : : : ");
//
//for(int i=Array1.length-1; i>=0;i--) {
//	
//	System.out.println(Array1[i]);
//}

//Sum of all array elements : 

		int sum = 0 ;
		for(int i=0 ; i<= Array1.length; i++) {
			sum = sum + Array1[i];
			System.out.println(sum);
		}
		
	}
}
		
		
	
	