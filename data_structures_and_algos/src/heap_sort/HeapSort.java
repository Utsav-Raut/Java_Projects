package heap_sort;

public class HeapSort {

	public int[] sort(int arr[]) {
		int n = arr.length;
		
		for(int i = (n/2 - 1); i >= 0; i--) {
			heapify(arr, n, i);
		}
		
		for(int i = (n-1); i > 0; i--) {
			int val = arr[0];
			arr[0] = arr[i];
			arr[i] = val;
			heapify(arr, i, 0);
		}
		
		return arr;
	}
	
	public void heapify(int arr[], int n, int i) {
		int largest = i;
		int left = (2 * i + 1);
		int right = (2 * i + 2);

		if(left < n && arr[left] > arr[largest])
			largest = left;
		if(right < n && arr[right] > arr[largest])
			largest = right;
		
		if(largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
		
			heapify(arr, n, largest);
		}
	}
	
	
	public void printArray(int arr[]) {
		System.out.println("The sorted array is : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
