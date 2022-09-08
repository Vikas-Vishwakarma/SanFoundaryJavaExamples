package Array;

public class Average {
	public static void main(String[] args) {
		int[] array = {2, 3, 3, 5, 7,  10};
		
		int sum =0, count = 0;
		
		for(int i : array) {
			sum += i;
			count++;
		}
		int average = sum/count;
		System.out.println("Sum of Array element: "+sum);
		System.out.println("Average: "+average);
	}
}
