class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String word : strs){
            int strlen = word.length();
            sb.append(String.format("%d#%s", strlen, word));
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
        int i = 0;
        ArrayList<String> ans = new ArrayList<>();
        while( i < str.length()){
            
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int strLen = Integer.parseInt(str.substring(i,j));
            i = j+1;
            j = i + strLen;
            ans.add(str.substring(i,j));
            i=j;
        }

        return ans;
    }
}
