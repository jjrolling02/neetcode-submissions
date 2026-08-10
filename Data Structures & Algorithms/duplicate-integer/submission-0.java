class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet <Integer> used = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            if(used.contains(nums[i]))
                return true;
            else
                used.add(nums[i]);

        }
        return false;
    }
}