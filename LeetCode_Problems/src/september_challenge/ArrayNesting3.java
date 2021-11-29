package september_challenge;

public class ArrayNesting3 {

	public static int longestSet3(int[] nums) {
		int res = 0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] != Integer.MAX_VALUE) {
				int start = nums[i], count = 0;
				while(nums[start] != Integer.MAX_VALUE) {
					int temp = start;
					start = nums[start];
					count++;
					nums[temp] = Integer.MAX_VALUE;
				}
				res = Math.max(res, count);
			}
		}
		return res;
	}
	public static void main(String[] args) {
//		int[] numsArray = new int[] {5, 4, 0, 3, 1, 6, 2};
		int[] numsArray = new int[] {0, 2, 1};
		int ans = longestSet3(numsArray);
		System.out.println(ans);

	}

}
