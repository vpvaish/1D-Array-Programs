package Array1;

import java.util.*;

public class Array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array Declaration :
		int array1[];
		
		//Array Creation : 
		array1 = new int[5];
		
		//initialization : 
		array1[0] = 12;
		array1[1] = 22;
		array1[2] = 32;
		array1[3] = 42;
		array1[4] = 52;
		
		System.out.println();
	
		//array1.length = 5;
		//array1.length-1 = 4;
		
		
		
		//Array Traversing :
		for(int i=0; i<=array1.length-1;i++) {
			System.out.println(array1[i]);
		}
	}
}
