package Array1;

public class sumOf2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] array1 = {1, 2, 3, 4, 5};
	        int[] array2 = {6, 7, 8, 9, 10};

	       if(array1.length != array2.length) {
	    	   System.out.println("Size of two array should have be same for addition of two arrays : ");
	       }
	       
	       int sum[] = new int[array1.length];
	       
	       for(int i=0; i<array1.length; i++) {
	    	   sum[i] = array1[i] + array2[i];
	    	   System.out.println(sum[i]);
	   }
	}
}
