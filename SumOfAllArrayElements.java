package Array1;
import java.util.*;
public class SumOfAllArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		syntax
		Scanner sc = new Scanner(System.in);
//		Size
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		int[] array = new int[n];
		
//		elements 
		System.out.println("Enter the "+ n + " numbers of elements in an array :");
		for(int i=0;i<array.length;i++) {
			array[i] = sc.nextInt();
		}
		
//		sum of elements 
		int sum = 0;
		for(int i=0;i<array.length;i++) {
			sum = sum + array[i];
		}
//		print the sum of array :
		System.out.println(sum);
	}
}
