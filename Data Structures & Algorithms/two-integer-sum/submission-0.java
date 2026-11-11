class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ii =new int[2];
        /*
        //brute force
        for (int i =0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                ii[0]=i;
                ii[1]=j;
                return ii;
                }
            }
        }*/
        //key holds the nums values, value the indice
       Map<Integer,Integer> m = new HashMap<>();
       for (int i =0;i<nums.length;i++){
            int reqdAddendum = target-nums[i];

            if(m.containsKey(reqdAddendum))
            return new int[]{m.get(reqdAddendum),i};

            m.put(nums[i],i);
        }
//Time Complexity: O(n) — a single pass through the array with O(1) map lookups.
//Space Complexity: O(n) — storing up to n entries in the HashMap.

throw new IllegalArgumentException("No two sum solution");
    }
    
}
