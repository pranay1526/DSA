import java.util.Arrays;

public class TwoSumSortedArray {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(getTwoSumInSortedArray(nums, target)));
    }

    private static int[] getTwoSumInSortedArray(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r)
        {
            int sum = nums[l]+nums[r];
            if(sum == target)
            {
                return new int[]{l,r};
            }
            else if(sum > target)
            {
                r--;
            }
            else
            {
                l++;
            }
        }
        return new int[]{};
    }
}
