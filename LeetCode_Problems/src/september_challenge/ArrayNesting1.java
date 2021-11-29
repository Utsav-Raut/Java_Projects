//You are given an integer array nums of length n where nums is a permutation of the numbers in the range [0, n - 1].
//
//You should build a set s[k] = {nums[k], nums[nums[k]], nums[nums[nums[k]]], ... } subjected to the following rule:
//
//The first element in s[k] starts with the selection of the element nums[k] of index = k.
//The next element in s[k] should be nums[nums[k]], and then nums[nums[nums[k]]], and so on.
//We stop adding right before a duplicate element occurs in s[k].

//Return the longest length of a set s[k].

package september_challenge;

public class ArrayNesting1 {

	public static int longestSet1(int[] nums) {
		int res = 0;
		for(int i=0; i<nums.length; i++) {
			int start = nums[i], count = 0;
			do {
				start = nums[start];
				count++;
			}while(start != nums[i]);
			res = Math.max(count, res);
		}
		
		return res;
	}
	public static void main(String[] args) {
		
//		int[] numsArray = new int[] {5, 4, 0, 3, 1, 6, 2};
		int[] numsArray = new int[] {0, 2, 1};
		int ans = longestSet1(numsArray);
		System.out.println(ans);
	}

}
