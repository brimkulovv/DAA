package DAA.week2.binarySearch1;

public class Solution2 {
    public static int binarySearch (int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (target < nums[mid]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(nums, 9));
    }
}
