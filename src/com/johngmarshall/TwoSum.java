package com.johngmarshall;

public class TwoSum {
    public TwoSum() {

    }




    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{2,7,11,15},9).toString());
    }

    public static int[] twoSum(int[] nums, int target) {
/*
Best solution
public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[] { map.get(complement), i };
        }
        map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
}
* */


        for(int i = 0; i < nums.length;i++) {
            for(int j =0; j < nums.length;j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{nums[i], nums[j]};
                }
            }
        }
        return null;
    }

}
