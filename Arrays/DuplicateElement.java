package array.sortAndMergeOperations;

import java.util.*;

public class DuplicateElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Eneter Values in Array: ");
		for(int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
//		int[] arr = {1,3,2,2,3,3,6,3,4,5,2,4,3,5,6};
		duplicateUsingHashTable(arr);
		
	}
	public static void duplicateUsingSet(int[] arr) {
		System.out.println("Duplicate Numbers are : ");
		Set<Integer> s = new HashSet<>();
		for(int element: arr) {
			if(s.add(element) == false) {
				System.out.print(element +" ");
			}
		}
	}
	
	public static void duplicateUsingHashTable(int[] arr) {
		Map<Integer, Integer> hm = new HashMap<>();
		for(int element : arr) {
			Integer count = hm.get(element);
			if(count == null) {
				hm.put(element, 1);
			}else {
				count++;
				hm.put(element, count);
			}
		}
		System.out.println("Duplicate elements are: ");
		Set<Map.Entry<Integer, Integer>> s = hm.entrySet();
		
		for(Map.Entry<Integer, Integer> me : s) {
			if(me.getValue() > 1) {
				System.out.print(me.getKey()+" ");
			}
		}		
	}
}
