package array.sortAndMergeOperations;

import arrays.insertingAnddeleting.*;

public class AscendingOrder {
	public static void main(String[] args) {
//		int[] arr = InsertElement.insertValues();
		int[] arr = {30,50,20,10,23,56};
		EvenOddElement.printArray(arr);
		
		bubbleSort(arr);
		System.out.println("Using Bubble Sort: ");
		EvenOddElement.printArray(arr);
		
		selectionSort(arr);
		System.out.println("Using Selection Sort: ");
		EvenOddElement.printArray(arr);
		
		insertionSort(arr);
		System.out.println("Using Insertion Sort: ");
		EvenOddElement.printArray(arr);
	}
	
	//Bubble sort
	public static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0; j<arr.length-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					//Swap
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	//selection Sort 
	public static void selectionSort(int[] arr) {
		
		for(int i =0;i<arr.length;i++) {
			
			int smallest = i;
			for(int j =i+1; j<arr.length;j++) {
				if(arr[smallest] > arr[j]) {
					smallest = j;
				}
			}
			//Swap
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
	}
	
	//Insertion sort
	public static void insertionSort(int[] arr) {
		
		for(int i =1;i<arr.length;i++) {
			int temp = arr[i];
			int j = i;
			while(j > 0 && arr[j-1] > temp) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] =  temp;
		}
	}
}
