//Divide and Conquer approach

package max_sub_array_sum;

public class MaxSubArraySum_DC {

	public static int maxCrossingSubArrSum(int arr[], int low, int mid, int high) {
		
		int left_sum = Integer.MIN_VALUE;
		int sum = 0;
		for(int i=mid; i>=low; i--) {
			sum = sum + arr[i];
			
			if(sum > left_sum)
				left_sum = sum;
		}
		
		sum = 0;
		int right_sum = Integer.MIN_VALUE;
		for(int j=mid+1; j<=high; j++) {
			sum = sum + arr[j];
			
			if(sum > right_sum)
				right_sum = sum;
		}
		return Math.max(left_sum + right_sum, Math.max(left_sum, right_sum));
		
	}
	public static int maxSubArrSum(int arr[], int low, int high) {
		if(low == high)
			return arr[low];		
		int mid = (low + high) / 2;
		
		return(Math.max(Math.max(maxSubArrSum(arr, low, mid), maxSubArrSum(arr, mid+1, high)), maxCrossingSubArrSum(arr, low, mid, high)));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {2, 3, 4, 5, 7};
		int arr[] = {-2, -5, 6, -2, -3, 1, 5, -6};
		int len = arr.length;
		int maxSum = maxSubArrSum(arr, 0, len-1);
		System.out.println("The max sum is = "+maxSum);

	}

}
