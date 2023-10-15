 //Find the peak element in an array
 class BS_Que1 
{
    // Recursive function to find the peak element in an array
    public static int findPeakElement(int[] nums, int left, int right)
    {
        // find the middle element. To avoid overflow, use mid = low + (high - low) / 2
        int mid = (left + right) / 2;
 
        // check if the middle element is greater than its neighbors
        if ((mid == 0 || nums[mid - 1] <= nums[mid]) &&
                (mid == nums.length - 1 || nums[mid + 1] <= nums[mid])) {
            return mid;
        }
 
        // If the left neighbor of `mid` is greater than the middle element,
        // find the peak recursively in the left subarray
        if (mid - 1 >= 0 && nums[mid - 1] > nums[mid]) {
            return findPeakElement(nums, left, mid - 1);
        }
 
        // If the right neighbor of `mid` is greater than the middle element,
        // find the peak recursively in the right subarray
        return findPeakElement(nums, mid + 1, right);
    }
 
    public static int findPeakElement(int[] nums)
    {
        // base case
        if (nums == null || nums.length == 0) {
            System.exit(-1);
        }
 
        int index = findPeakElement(nums, 0, nums.length - 1);
        return nums[index];
    }
 
    public static void main(String[] args)
    {
        int[] nums = { 8, 9, 10, 2, 5, 6 };
        System.out.println("The peak element is " + findPeakElement(nums));
    }
}

