class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> arr = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String temp = new String(chars);
            
            if(arr.containsKey(temp))
                arr.get(temp).add(strs[i]);
            else{
                arr.put(temp, new ArrayList<>());
                arr.get(temp).add(strs[i]);
            }

        }
        
        List<List<String>> ret = new ArrayList<>();

        for(List<String> list : arr.values()){
            ret.add(list);
        }
        return ret;
    }
}
