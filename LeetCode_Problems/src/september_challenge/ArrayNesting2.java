package september_challenge;

public class ArrayNesting2 {

	public static int longestSet2(int[] nums) {
		int res = 0;
		boolean[] visited = new boolean[nums.length];
		for(int i=0; i<nums.length; i++) {
			if(!visited[i]) {
				int start = nums[i], count = 0;
				do {
					start = nums[start];
					count++;
					visited[start] = true;
				}while(start != nums[i]);
				res = Math.max(res, count);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[] numsArray = new int[] {5, 4, 0, 3, 1, 6, 2};
//		int[] numsArray = new int[] {0, 2, 1};
		int ans = longestSet2(numsArray);
		System.out.println(ans);

	}

}
