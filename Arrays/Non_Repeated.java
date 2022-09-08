package Array;

public class Non_Repeated {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 3, 5, 7, 10, 2,4,6,4,5 };
		
		int count = 0;
//		System.out.print("Repeated Element in Array: ");
		for(int i=0; i<arr.length-1;i++) {
			if(arr[i] == arr[i+1]) {
				System.out.print("Repeated Element in Array: "+arr[i]+" ");
			}else {
//				System.out.println("Non - Repeated Element in Array: "+arr[i]+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println("Number of Non-Repeated Element: "+ count);
	}
}