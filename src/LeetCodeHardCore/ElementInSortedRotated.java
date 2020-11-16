package LeetCodeHardCore;

public class ElementInSortedRotated {

    public static void main(String[] args) {
        int[] arr = {8, 9, 2, 3, 4};
        search(arr, 9);
    }

    public static int search(int[] nums, int target) {
        if (nums.length == 1) {
            if (nums[0] == target) {
                return 0;
            } else {
                return -1;
            }
        }
        int pivot = findPivot(nums, 0, nums.length -1 , target);
        if (pivot == -1) {
            return binarySearch(nums, pivot + 1, nums.length -1, target);
        }

        int left = binarySearch(nums, 0, pivot, target);
        int right = binarySearch(nums, pivot + 1, nums.length -1, target);
        if (left != -1) {
            return left;
        }
        if (right != -1) {
            return right;
        }
        return -1;
    }


    private static  int findPivot(int[] nums, int start, int end, int target) {

        if (start >= end) {
            if (start + 1 < nums.length && nums[start] > nums[start + 1])  return start;
            return -1;
        }
        int mid = start + (end - start)/2;
        if (nums[mid] > nums[mid + 1]) {
            return mid;
        } else if (nums[mid] >= nums[start]) {
            return findPivot(nums, mid + 1, end, target);
        } else {
            return findPivot(nums, start, mid - 1, target);
        }
    }



    private static  int binarySearch(int nums[], int start, int end, int target) {
        if ( start >= end) {
            if (nums[start] == target) return start;
            return -1;
        }
        int mid = start + (end - start) / 2;

        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return binarySearch(nums, start, mid -1, target);
        } else {
            return binarySearch(nums, mid + 1, end, target);
        }


    }
}
