package Array1;

public class ReverseArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Syntax
		String array[] = new String[4];
		
//		initialization 
		
		array[0] = "Sakshi";
		array[1] = "Rohan";
		array[2] = "Priti";
		array[3] = "vaish";
	
//		Reverse : 
		
		for(int i=array.length-1; i>=0 ; i--) {
			System.out.println(array[i]);
		}
		
	}

}
