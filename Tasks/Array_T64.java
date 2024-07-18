public class Array_T64 {

    public static int[] longestSubArray(int[] nums) {
        int n = nums.length;

        if(n == 0) return new int[] {-1, -1};

        int[] inc = new int[n];
        int[] dec = new int[n];

        inc[0] = 1;
        for(int i=1; i<n; i++) {
            inc[i] = (nums[i] > nums[i-1]) ? inc[i-1] + 1 : 1;
        }

        dec[n-1] = 1;
        for(int i=n-2; i>=0; i--) {
            dec[i] = (nums[i] > nums[i+1]) ? dec[i+1] + 1 : 1;
        }

        int maxLength = 1;
        int start = 0, end = 0;
        for (int i = 0; i < n; i++) {
            int length = inc[i] + dec[i] - 1;
            if(length > maxLength) {
                maxLength = length;
                start = i - inc[i] + 1;
                end = i + dec[i] - 1;
            }
        }

        return new int[] { start, end };
    }

    public static void printSubArray(int[] nums, int start, int end) {
        for (int i = start; i < end; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

                                                                                         
    public static void main(String[] args) {
        int[] nums = { 4, 5, 9, 5, 6, 10, 11, 9, 6, 4, 5 };

        int[] result = longestSubArray(nums);
        int start = result[0];
        int end = result[1];


        System.out.println("The longest bitonic subarray is ["+start+","+end+"]");
        System.out.print("Elements of the said sub-array: ");
        printSubArray(nums, start, end);
        System.out.println("The length of longest bitonic subarray is " + (end-start+1));
    }
}