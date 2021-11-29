//Brute Force Approach (quadratic time complexity)

package max_sub_array_sum;

public class MaxSubArraySum_BF {
	
	public static int maxSubArraySum(int arr[], int low, int high) {
		int maxSum = 0;
		for(int i=0; i<=high; i++) {
			int sum = 0;
			for(int j=i; j<=high; j++) {
				sum += arr[j];
				if(sum > maxSum)
					maxSum = sum;
			}
		}
		return maxSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 3, 4, 5, 7};
//		int arr[] = {-2, -5, 6, -2, -3, 1, 5, -6};
		int len = arr.length;
		int maxSum = maxSubArraySum(arr, 0, len-1);
		System.out.println("The max sum is = "+maxSum);

	}

}
