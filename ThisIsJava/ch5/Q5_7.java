package ch5;

public class Q5_7 {

	public static void main(String[] args) {
		int[] array = { 1, 5, 3, 8, 2 };
		int maxNum = array[0];
		
		for(int i=1; i<array.length; i++) {
			if (maxNum < array[i]) {
				maxNum = array[i];
			}
		}
		
		System.out.println(maxNum);
	}
	
}