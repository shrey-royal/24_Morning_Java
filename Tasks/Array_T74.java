import java.util.Arrays;

public class Array_T74 {
	public static void findTriplets(int[] nums, int target) {
		Arrays.sort(nums);
		int n = nums.length;
		
		for(int i=0; i<n-2; i++) {
			if(i > 0 && nums[i] == nums[i-1]) continue;
			int left = i+1, right = n-1;
			
			while(left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				if(sum == target) {
					System.out.println("(" + nums[i] + " " + nums[left] + " " + nums[right] + ")");
					while(left < right && nums[left] == nums[++left]);
					while(left < right && nums[right] == nums[--right]);
				} else if(sum < target) {
					left++;
				} else {
					right--;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] nums = { 1, 6, 3, 0, 8, 4, 1, 7 };
		
		findTriplets(nums, 7);
	}
}