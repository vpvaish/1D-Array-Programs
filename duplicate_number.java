package Array1;

public class duplicate_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array2 = new int[] {2,4,5,23,4,21,2,6,7,6};
//		OR
		int[] array1 = {12,2,5,2,6};
	
		for(int i=0; i<array1.length; i++) {
			for(int j = i + 1; j < array1.length ;j++) {
				if(array1[i] == array1[j]) {
					System.out.println(array1[j] + "is duplicate");
				    break;
				}
					
			}
			
		}
	}
}
