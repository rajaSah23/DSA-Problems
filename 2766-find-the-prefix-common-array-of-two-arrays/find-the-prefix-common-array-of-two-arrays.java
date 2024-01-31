class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> arr1= new HashSet<>();
        HashSet<Integer> arr2= new HashSet<>();

        int[] ans= new int[A.length];
        int count=0;
        for(int i=0;i<A.length;i++){
            if(arr2.contains(A[i]))
                count++;
            arr1.add(A[i]);
            if(arr1.contains(B[i]))
                count++;
            arr2.add(B[i]);

            ans[i]=count;
        }
        return ans;
    }
}