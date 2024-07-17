public class Array_T68 {
	public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 2, 3};

        System.out.println("Possible permutations of the said array:");
        generatePermutations(nums1, 0);

        System.out.println("Possible permutations of the said array:");
        generatePermutations(nums2, 0);
    }
	
	public static void generatePermutations(int[] arr, int startIndex) {
		if(startIndex == arr.length - 1) {
			printArray(arr);
		} else {
			for(int i=startIndex; i< arr.length; i++) {
				swap(arr, startIndex, i);
				generatePermutations(arr, startIndex + 1);
				swap(arr, startIndex, i);	//backtrack
			}
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
	
	public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}


/*
68. Write a Java program to create all possible permutations of a given array of distinct integers.  

Example:
Input :
nums1 = {1, 2, 3, 4}
nums2 = {1, 2, 3}
Output:
Possible permutations of the said array:
[1, 2, 3, 4]
[1, 2, 4, 3]
....
[4, 1, 3, 2]
[4, 1, 2, 3]
Possible permutations of the said array:
[1, 2, 3]
[1, 3, 2]
...
[3, 2, 1]
[3, 1, 2]
*/