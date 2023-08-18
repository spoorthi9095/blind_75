import java.util.HashMap;

public class TwoSum {
    //1st of 75
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> treeMap = new HashMap<>();
        int[] ret = new int[2];

        System.out.println(treeMap.toString());

        for(int i=0;i<nums.length;i++) {
            int key = target - nums[i];
            if(treeMap.containsKey(key) && i!=treeMap.get(key) ){
                ret[0] = i;
                ret[1] = treeMap.get(key);
                break;
            }
            treeMap.put(nums[i],i);
        }
        return ret;
    }
}
