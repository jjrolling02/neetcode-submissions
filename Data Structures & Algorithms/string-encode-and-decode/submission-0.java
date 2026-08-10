class Solution {

    public String encode(List<String> strs) {
        String encoded_string = "";

        for(String curr : strs){
            encoded_string += curr.length() + "#";
            encoded_string += curr;
        }
        return encoded_string;
    }

    public List<String> decode(String str) {
        List<String> decoded_strings = new ArrayList<>();

        int i=0;
        while (i < str.length()){
            int j = i;
            String strLen = "";
            
            while(str.charAt(j) != '#'){
                strLen += str.charAt(j);
                j++;
            }
            int length = Integer.parseInt(strLen);

            String curr = "";
            int end = j+1 + length;


            for(i = j+1; i < end; i++){
                curr += str.charAt(i);
            }
            
            decoded_strings.add(curr);
        }
        return decoded_strings;
    }
    
}
