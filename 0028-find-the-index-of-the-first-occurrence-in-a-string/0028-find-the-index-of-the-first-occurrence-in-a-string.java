class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        if ( haystack.indexOf(needle) != -1){
            return haystack.indexOf(needle);
        }
        return -1;
    }
}