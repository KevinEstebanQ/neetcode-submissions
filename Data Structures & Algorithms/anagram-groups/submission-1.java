class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> myMap = new HashMap<>();

        for(String word : strs){
            int[] freqList = new int[26];
            for(char c : word.toCharArray()){
                int index = c - 'a';
                freqList[index]++; 
            }
            String key = Arrays.toString(freqList); 
            myMap.putIfAbsent(key, new ArrayList<>());
            myMap.get(key).add(word);
        }
        ArrayList<List<String>> ans = new ArrayList<>();
        for(List<String> list : myMap.values()){
            ans.add(list);
        }
        return ans;
    }
}
