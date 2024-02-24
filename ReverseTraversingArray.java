//Reverse Of An Array :

package Array1;

public class ReverseTraversingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//declaration 
	    int[] array;
	    
//	    creation 
	    array = new int[5];
	    
//	    Initialization 
	
	    array[0] = 1;
	    array[1] = 2;
	    array[2] =23;
	    array[3] =54;
	    array[4] = 98;
	    
//	    Reverse Traversing : 
	    
	    for(int i=array.length-1;i>=0;i--) {
	    	System.out.println(array[i]);
	    }
	}
}