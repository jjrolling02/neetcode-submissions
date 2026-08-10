class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, Integer> anas = new HashMap<>();
        int listMaxIndex = 0;
        List<List<String>> ans = new ArrayList<>();

        //full list
        for(int i=0; i<strs.length; i++){

            //convert current str and sort
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String currStr = new String(temp);

            //check if already in hashmap and put in correc tlsit spot if is
            if(anas.containsKey(currStr)){
                int index = anas.get(currStr);
                ans.get(index).add(strs[i]);

            }
            //if not present then add to hashmap and make new index in final list
            else{
                ans.add(new ArrayList<>());
                ans.get(listMaxIndex).add(strs[i]);
                anas.put(currStr, listMaxIndex);
                listMaxIndex++;

            }


        }

        return ans;

    }
}
