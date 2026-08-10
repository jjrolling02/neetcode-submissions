class Solution {
    public boolean isAnagram(String s, String t) {
              char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        Arrays.sort(sc);
        Arrays.sort(tc);

        if(Arrays.equals(tc, sc))
            return true;
        else return false;
    }
}
