package array.sortAndMergeOperations;


import arrays.insertingAnddeleting.*;

public class DescendinOrder {
	public static void main(String[] args) {
		int[] array = InsertElement.insertValues();
//		int[] array = {30,50,20,10,23,56};

		bubbleSort(array);
		System.out.println("Using Bubble Sort: ");
		EvenOddElement.printArray(array);
		
		selectionSort(array);
		System.out.println("Using Selection Sort: ");
		EvenOddElement.printArray(array);
	
		insertionSort(array);
		System.out.println("Using Insertion Sort: ");
		EvenOddElement.printArray(array);
	}
	
	//Bubble Sort
	public static void bubbleSort(int[] array) {
		
		for(int i=0;i<array.length-1;i++) {
			for(int j =0; j<array.length-i -1;j++) {
				if(array[j]< array[j+1]) {
					//swap 
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	
	//Selection Sort
	public static void selectionSort(int[] arr) {
		
		for(int i =0; i<arr.length; i++) {
			
			int smallest = i;
			for(int j =i+1;j<arr.length;j++) {
				if(arr[smallest] < arr[j])
					smallest = j;
			}
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
	}
	
	//Insertion Sort
	public static void insertionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int temp = arr[i];
			int j = i;
			while(j < 0 && j < temp) {
				arr[j] = arr[j+1];
				j++;
			}
			arr[j] = temp;
		}
	}

}
