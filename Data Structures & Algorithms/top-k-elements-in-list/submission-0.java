class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> freqs = new HashMap<>();
        
        //get all freqs of numbers and store in hashmap
        for(int i=0; i<nums.length; i++){
            if(freqs.containsKey(nums[i]))
                freqs.put(nums[i], freqs.get(nums[i])+1);
            else
                freqs.put(nums[i], 1);

        }

        //place entries into heap based on their freqs
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>
            ((a,b) -> a.getValue()-b.getValue());//this tells the pq how we want to compare
        
        //loops through every entry in freqs set and names the var entry
        for(Map.Entry<Integer, Integer> entry : freqs.entrySet()){

            //adds entry to pq
            pq.add(entry);

            //if the size of becomes larger than k then drop the smallest num
            if(pq.size()>k)
                pq.poll();

        }
        //final ans array
        int[] ans = new int[k];

        //loop to add every key making sure to drop it after done
        for(int i=0; i<k; i++){
            ans[i]=pq.poll().getKey();

        }
        return ans;
            
    }
}
