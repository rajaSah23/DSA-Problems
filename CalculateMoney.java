class Solution {
    public int totalMoney(int n) {
        int m=n/7;  //no. of full weeks
        //first week: 1 2 3 4 5 6 7 (sum=28 ,i.e: 7*(i+3) if i=1)
        //second week: 2 3 4 5 6 7 8 (sum=35 ,i.e: 7*(i+3) if i=2)
        //...so  on

        int sum=0;

        for(int i=1;i<=m;i++){
            sum+= 7*(i+3);
        }

        //for left days
        for(int i=7*m;i<n;i++){
            sum+= ++m;
        }
        return sum;
    }

}
