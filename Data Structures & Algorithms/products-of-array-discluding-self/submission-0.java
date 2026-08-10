class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] products = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        
        prefix[0]=1;
        //get left to right products
        for(int i=1; i<nums.length; i++){
            prefix[i] = nums[i-1]*prefix[i-1];
        }
            
        
        //get right to left products
        suffix[nums.length-1] = 1;
        for(int i=nums.length-2; i>=0; i--){
            suffix[i] = nums[i+1]*suffix[i+1];

        }
        //get products excluding i
        for(int i=0; i<nums.length; i++){
            products[i] = suffix[i]*prefix[i];

        }

        return products;
    }
}  
