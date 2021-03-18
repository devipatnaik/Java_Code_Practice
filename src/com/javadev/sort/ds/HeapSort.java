package com.javadev.sort.ds;

public class HeapSort {

	public static void main(String[] args) {
		
		int[] arr = {22,13,17,11,10,14,12};
		
		HeapSort hs = new HeapSort();
		hs.sort(arr);
		hs.printArray(arr);
	}
	
	void sort(int[] arr) {
		
		int len = arr.length;
		
		for(int i=len/2-1; i>=0; i--) {
			heapify(arr, len, i);
		}
		
		for(int i = len-1; i>=0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			heapify(arr, i, 0);
		}
		
	}

	private void heapify(int[] arr, int len, int i) {
		
		int largest = i;  // parent node index position
		int li = 2*i + 1; // left child node index position
		int ri = 2*i + 2;  // right child node index position
		
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
	
	private void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}

}
