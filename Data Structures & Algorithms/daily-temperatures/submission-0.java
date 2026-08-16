class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];

        Stack <Integer> index = new Stack<>();

        for(int i = 0; i < temperatures.length; i++){
            while(!index.isEmpty() && temperatures[i] > temperatures[index.peek()]){
                int currIdx =  index.pop();
                ans[currIdx] = i - currIdx;
            }
            index.push(i);
        }

        return ans;
    }
}