package com.javadev.sort.ds;

public class HeapSort1 {
	
	public static void main(String[] args) {
		
		int arr[] = {12,23,17,11,28};
		
		HeapSort1 hs1 = new HeapSort1();
		hs1.sort(arr);
		hs1.printArray(arr);
		
	}

	private void sort(int[] arr) {
		
		int len = arr.length;

		for (int i = 0; i < len/2 - 1; i++) {
			heapify(arr, len, i);
		}
		
		for(int i=len-1; i>=0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			heapify(arr, len, 0);
		}
		
	}

	private void heapify(int[] arr, int len, int i) {
		
		int largest = i;  // parent node index position
		int li = 2*i + 1; // left child node index position
		int ri = 2*i + 2; // right child node index position
		
		if(li < len && arr[li] > arr[largest]) {
			largest = li;
		}
		if(ri < len && arr[ri] > arr[largest]) {
			largest = ri;
		}
		if(largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			
			heapify(arr, len, largest);
		}
	}
	
	private void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+  " ");
		}
		
	}

}
