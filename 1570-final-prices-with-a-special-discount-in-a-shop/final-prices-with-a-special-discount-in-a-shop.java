class Solution {
    public int[] finalPrices(int[] prices) {
        int[] ans= new int[prices.length];
        int i=ans.length-1;
        int j=i;
        Stack<Integer> stk = new Stack<>();
        
        while(i>=0){
            if(stk.isEmpty()){
                ans[i] = prices[i];
                stk.push(prices[i]);
                i--;
            }else if(stk.peek() <= prices[i]){
                ans[i] = prices[i] - stk.peek();
                stk.push(prices[i]);
                i--;
            }else{
                stk.pop();
            }
        }
        return ans;
    }
}