package Array1;
import java.util.*;
import java.util.Scanner;

public class Missing_number_from_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = new int[5];
		
		array1[0] = 3;
		array1[1] = 0;
		array1[2] = 2;
		array1[3] = 4;
	
		int sum=0;
		int add=0;
		
		for(int i=0; i<array1.length; i++) {
			int reminder = array1[i]%10;
			sum = sum+reminder;
			System.out.println(reminder);
			add = add+i;
		}
		
		int result = add - sum;
		System.out.println("The missing number is  : "+ result);
		System.out.println(sum);
		System.out.println("add:::: "+add);
			}
}
