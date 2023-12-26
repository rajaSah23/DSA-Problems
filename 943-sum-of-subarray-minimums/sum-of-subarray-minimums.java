class Solution {
    public int sumSubarrayMins(int[] arr) {
        int[] ps= new int[arr.length];//prev Smallest element
        int[] ns=new int[arr.length];

        Stack<Integer> stk= new Stack<>();//monotonic stack
        //for perv Smallest elements
        for(int i=0; i<arr.length;i++){
            while(!stk.isEmpty() && arr[stk.peek()]>= arr[i] )
                stk.pop();

            if(stk.isEmpty())
                ps[i]=-1;
            else
                ps[i]=stk.peek();
            
            stk.push(i);
        }
        
        //for next Smallest elements
        stk.clear();
        for(int i=arr.length-1; i>=0;i--){
            while(!stk.isEmpty() && arr[stk.peek()]> arr[i] )  // '>' (not '>=') to handle duplicates
                stk.pop();

            if(stk.isEmpty())
                ns[i]=arr.length;
            else
                ns[i]=stk.peek();
            
            stk.push(i);
        }

        //check for each element: in many subarray it is min 
        //ie: (currIdx-psIdx) * (nsIdx-currIdx)
        long sum=0;
         final int mod =(int) 1e9 + 7;
        for(int i=0;i<arr.length;i++){
            sum=(sum+ 1l*arr[i] *(i-ps[i])*(ns[i]-i) )%mod;
        }
        return (int)sum;
    }
}