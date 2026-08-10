class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> numHM = new HashMap<>();

        int[] ans = new int[2];

        for(int i=0; i<nums.length; i++){

            int comp = target-nums[i];
            if(numHM.containsKey(comp)){
                 ans[1]=i;
                 ans[0]=numHM.get(comp);
                 return ans;
            }
            numHM.put(nums[i], i);

            

        }
        return ans;
    }
}
