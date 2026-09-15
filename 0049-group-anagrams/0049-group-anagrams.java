class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> mp = new HashMap<>();
        for(int i = 0; i<strs.length;i++){
            char[] arr = strs[i].toCharArray();
        Arrays.sort(arr);
        String x = new String(arr);
        if( mp.containsKey(x)){
            mp.get(x).add(strs[i]);
        }
        else{
            ArrayList<String> yz = new ArrayList<>();
            yz.add(strs[i]);
            mp.put(x,yz);
        } 
        }
        List<List<String>> ans = new ArrayList<>();

        for(String Key: mp.keySet()){
            ans.add(mp.get(Key));

        }
        return ans;
    }
}