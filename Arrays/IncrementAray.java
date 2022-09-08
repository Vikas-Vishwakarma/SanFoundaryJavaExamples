package Array;

public class IncrementAray {
	public static void main(String[] args) {
		int[] array = {2, 3, 3, 5, 7,  10};
		for(int i : array) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i=0;i<array.length;i++) {
			int temp = array[i];
			temp += 1;
			array[i] = temp;
		}
		
		for(int i : array) {
			System.out.print(i+" ");
		}
	}

}
