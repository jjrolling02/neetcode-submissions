class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> set  = new HashSet<>();
        int max=0;

        for(int num : nums)
            set.add(num);

        for(int num : set){
            
            if(!set.contains(num-1)){
                int length = 1;
                int curr = num;
                
                while(set.contains(curr + 1)){
                    curr++;
                    length++;
                }
                if(length>max)
                    max = length;

            }

        }
        return max;
    }
}