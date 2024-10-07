class Solution {
    public int minLength(String s) {
        Stack<Character> stk = new Stack<>();
        for(char ch : s.toCharArray()){
            if(!stk.isEmpty() && stk.peek()=='A' && ch=='B')
                stk.pop();
            else if(!stk.isEmpty() && stk.peek()=='C' && ch=='D')
                 stk.pop();
            else
                stk.push(ch);
        }
        return stk.size();
    }
}