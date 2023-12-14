class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;

        int w=x; //temp variable
        int y=0;
        //reverse the given number and store in y
        while(w!=0){
            y=y*10+w%10;
            w/=10;
        }
        //compare both x and y
        return x==y;

        //method2: convert into string
    }
}