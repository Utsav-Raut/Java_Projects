// Brute force approach with cubic time complexity

package max_sub_array_sum;

public class MaxSubArraySum_BF1 {

	public static int maxSubArrSum(int arr[], int low, int high) {
		int max_sum = Integer.MIN_VALUE;
		
		for(int left=low; left<high; left++) {
			for(int right=left; right<high; right++) {
				int windowSum = 0;
				
				for(int k=left; k<=right; k++) {
					windowSum += arr[k];
				}
				
				max_sum = Integer.max(windowSum, max_sum);
			}
		}
		return max_sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 3, 4, 5, 7};
//		int arr[] = {-2, -5, 6, -2, -3, 1, 5, -6};
		int len = arr.length;
		int maxSum = maxSubArrSum(arr, 0, len);
		System.out.println("The max sum is = "+maxSum);

	}

}
