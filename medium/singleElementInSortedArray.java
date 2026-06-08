
class singleElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        int n = nums.length;
        if (n == 1)
            System.out.println(nums[0]);
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid == 0 && nums[0] == nums[1])
                System.out.println(nums[mid]);
            if (mid == n - 1 && nums[n - 1] == nums[n - 2])
                System.out.println(nums[mid]);

            if (nums[mid - 1] != nums[mid] && nums[mid] != nums[mid + 1]) {
                System.out.println(nums[mid]);
            }
            // even condition
            else if (mid % 2 == 0) {
                if (nums[mid - 1] == nums[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            // odd condition
            else {
                if (nums[mid - 1] == nums[mid])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }

    }
}