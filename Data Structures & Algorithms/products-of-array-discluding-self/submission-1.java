class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] before = new int[size];   
        before[0] = 1;
        int[] after = new int[size];
        after[size-1] = 1;
        int[] ans = new int[size];

        int currProduct = before[0]*nums[0];
        for(int i=1; i<size; i++){
            before[i] = currProduct;            
            currProduct *= nums[i];
        }

        currProduct = after[size-1]*nums[size-1];
        for(int i=size-2; i>=0; i--){
            after[i] = currProduct;
            currProduct *= nums[i];            
        }

        for(int i=0; i<size; i++){
            ans[i] = before[i]*after[i];
        }
        return ans;
    }
}  
