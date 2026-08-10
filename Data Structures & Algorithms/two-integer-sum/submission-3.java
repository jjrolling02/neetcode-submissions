class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> idx = new HashMap<>();
        int comp;

        for(int i=0; i<nums.length; i++){
            comp = target - nums[i];

            if(idx.containsKey(comp)){
                return new int[] {idx.get(comp), i};
            }
            idx.put(nums[i], i);
        }
        return new int[] {};
    
    }
}
