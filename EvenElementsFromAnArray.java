package Array1;

import java.util.Scanner;

public class EvenElementsFromAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaration :
				int[] array;
				
				int n ;
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the size of an array :");
				n = sc.nextInt();
//				Creation 
				array = new int[n];
			    System.out.println();
				System.out.println("Enter the " + n + " elements in an array");
//				Insert Array Elements 
				for(int i=0; i<array.length;i++) {
					array[i] = sc.nextInt();	
				}
				System.out.println();
				System.out.println("The elements are :");    
//				Printing all elements from an array
				for(int i=0; i<array.length;i++) {
					System.out.println(array[i]);	
				}
				System.out.println();
				System.out.println("The reverse of an array is :");
//				Reverse Of an array
				for(int i=array.length-1;i>=0;i--) {
					System.out.println(array[i]);
				}

				System.out.println("Print the numbers that are divisible by 2 :");
				
				for(int i=0;i<=array.length;i++) {
					if(array[i]%2==0) {
						System.out.println(array[i]);
					}
				}
	}

}
