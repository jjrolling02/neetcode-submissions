class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> freq = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i],0)+1);
        }

        ArrayList<Map.Entry<Integer, Integer>> arr = new ArrayList<>(freq.entrySet());

        arr.sort((a,b)->b.getValue()-a.getValue());

        int[] lastK = new int[k];

        for(int i=0; i<k; i++){
            lastK[i] = arr.get(i).getKey();
        }

        return lastK;
    }
}
