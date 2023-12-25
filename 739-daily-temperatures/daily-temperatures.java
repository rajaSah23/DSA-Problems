class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //Approach: Next largest element array
        int[] arr= new int[temperatures.length];
        Stack<Integer> stk= new Stack<>();
        for(int i=temperatures.length-1;i>=0;i--){
            while(!stk.isEmpty() && temperatures[stk.peek()]<=temperatures[i])
                stk.pop();
            
            if(stk.isEmpty())
                arr[i]=0;
            else
                arr[i]=stk.peek()-i;
            
            stk.push(i);
        }

        return arr;
    }
}