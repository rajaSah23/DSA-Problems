class Solution {
    public String removeStars(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch == '*'){
                if(!stk.isEmpty()) stk.pop();
            }
            else
                stk.push(ch);
        }
        StringBuilder ans = new StringBuilder();
        while(!stk.isEmpty()){
            ans.insert(0,stk.pop());
        }

        return ans.toString();
    }
}