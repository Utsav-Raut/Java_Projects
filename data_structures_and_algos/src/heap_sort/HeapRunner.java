package heap_sort;

public class HeapRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {11, 7, 9, 6, 8, 21, 13};
		
		HeapSort ob = new HeapSort();
		int return_arr[] = ob.sort(arr);
		ob.printArray(return_arr);

	}

}
