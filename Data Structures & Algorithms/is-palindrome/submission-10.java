class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toLowerCase().toCharArray()){
            if(Character.isLetterOrDigit(c)) sb.append(c);
        }
        String cleaned = sb.toString();
        System.out.println(cleaned);
        int i = 0;
        int j = cleaned.length() - 1;
        while( i < j){
            if(cleaned.charAt(i) != cleaned.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
