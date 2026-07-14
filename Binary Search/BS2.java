public class BS2 {

  // T=O(LogN) , S=O(1)
  public static int lowerBound(int[] nums, int target) {

    int ans = nums.length;
    int n = nums.length;
    int low = 0;
    int high = n - 1;

    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (nums[mid] >= target) {
        ans = mid;
        high = mid - 1;
      } else {
        low = mid + 1;
      }

    }

    return ans;

  }

  // T=O(LogN) , S=O(1)
  public static int upperBound(int[] nums, int target) {

    int ans = nums.length;

    int low = 0;
    int n = nums.length;
    int high = n - 1;

    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (nums[mid] > target) {
        ans = mid;
        high = mid - 1;
      } else {
        low = mid + 1;
      }

    }

    return ans;

  }
}
