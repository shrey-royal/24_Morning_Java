public class Array_T72 {
	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 0, 4, 6 };
		int[] nums2 = { 1, 3, 2, 7, 5, 6, 4, 8 };
		
		findContSubArray(nums1);
		findContSubArray(nums2);
	}
	
	public static void findContSubArray(int[] nums) {
		int n = nums.length;
		int start = 0, end = n-1;
		
		while (start < n-1 && nums[start] <= nums[start+1]) {
			start++;
		}
		
		if(start == n-1) {
			System.out.println("The array is already sorted!");
			return;
		}
		
		while(end > 0 && nums[end] >= nums[end-1]) {
			end--;
		}
		
		int min = nums[start], max = nums[end];
		for(int i = start+1; i<=end; i++) {
			if(nums[i] < min) min = nums[i];
			if(nums[i] > max) max = nums[i];
		}
		
		while (start > 0 && nums[start - 1] > min) {
			start--;
		}
		
		while (end < n-1 && nums[end + 1] < max) {
			end++;
		}
		
		System.out.println("Continous SubArray: ");
		for(int i=start; i<=end; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
}

/*
72. Write a Java program to find and print one continuous subarray (from a given array of integers) that if you only sort the said subarray in ascending order then the entire array will be sorted in ascending order.  

Example:
Input :
nums1 = {1, 2, 3, 0, 4, 6}
nums2 = { 1, 3, 2, 7, 5, 6, 4, 8 }
Output:
Continuous subarray:
1 2 3 0
Continuous subarray:
3 2 7 5 6 4
*/