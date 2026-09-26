import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 22;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> map= new HashMap<>();
        List<Integer> list =new ArrayList<>();
        for(int i = 0; i< nums.length; i++)
        {
            int diff = target - nums[i];
            if(list.contains(diff))
            {
                return new int[]{diff, nums[i]};
            }
            list.add(nums[i]);
        }
        return new int[]{};
    }
}
