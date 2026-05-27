class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // return a list with lists of strings, length of ans list is length of strs
        //can have arraylist inside of main List
        // need a word frequency map to order words
        // append if hash of frequ matches existant
        /*
        return type is list generic, can use arraylist
        create arraylist for ans
        create freqmap for saving hashes

        #hash creation
        for every char in the word saved the char in charcode ofset (index in array len26)
        call array to string to create inmutable for freq map key
        if key exists the append, else put new key and value
        for every key and value in the map append value to ans (value is array of valid anagrams)
        return ans
        */
        // step 1 create freqmap and ans list
        Map<String, List<String>> freqMap = new HashMap<>();
        ArrayList<List<String>> ans = new ArrayList<>();

        //create hashes
        for(String word: strs){
            int[] key = new int[26];
            for(char c : word.toCharArray()){
                int index = c - 'a';
                key[index]++;
            }
            String hashKey = Arrays.toString(key);
            freqMap.putIfAbsent(hashKey, new ArrayList<>());
            freqMap.get(hashKey).add(word);
        }

        for(String hkey : freqMap.keySet()){
            ans.add(freqMap.get(hkey));
        }
        return ans;
    }
}
