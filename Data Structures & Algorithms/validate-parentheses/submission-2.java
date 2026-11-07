class Solution {
    public boolean isValid(String s) {
        Set<Character> closing = new HashSet<>(Set.of(')', '}', ']'));
        Deque<Character> stack = new ArrayDeque<>();

        for(Character c: s.toCharArray()){
            if(!closing.contains(c)){
                stack.addFirst(c);
                continue;
            }
            
            Character popped = stack.isEmpty() ? 'a' :stack.pop();

            if(c == ')' && popped != '(') return false;
            if(c == '}' && popped != '{') return false;
            if(c == ']' && popped != '[') return false;
        }
        return stack.isEmpty();
    }
}
