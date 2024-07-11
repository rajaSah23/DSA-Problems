//{ Driver Code Starts
// Initial Template for Java

import java.util.*;

public class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            List<Integer> brr = new ArrayList<>();
            List<Integer> crr = new ArrayList<>();

            String input1 = sc.nextLine();
            Scanner ss1 = new Scanner(input1);
            while (ss1.hasNextInt()) {
                arr.add(ss1.nextInt());
            }

            String input2 = sc.nextLine();
            Scanner ss2 = new Scanner(input2);
            while (ss2.hasNextInt()) {
                brr.add(ss2.nextInt());
            }

            String input3 = sc.nextLine();
            Scanner ss3 = new Scanner(input3);
            while (ss3.hasNextInt()) {
                crr.add(ss3.nextInt());
            }

            Solution ob = new Solution();
            List<Integer> res = ob.commonElements(arr, brr, crr);

            if (res.size() == 0) System.out.print(-1);
            for (int i = 0; i < res.size(); i++) System.out.print(res.get(i) + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        // Code Here
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        HashSet<Integer> hs3 = new HashSet<>();

        for(int a:arr1)
            hs1.add(a);
        
        for(int a:arr2)
            hs2.add(a);
        
        List<Integer> ans= new ArrayList<>();
        for(int a:arr3)
            if(!hs3.contains(a))
                if(hs1.contains(a) && hs2.contains(a)){
                    ans.add(a);
                    hs3.add(a);
                }
            
        return ans;
        
        // HashSet<Integer> hs1 = new HashSet<>();
        // HashSet<Integer> hs2 = new HashSet<>();
        
        // int n= Math.max(arr1.size(),Math.max(arr2.size(),arr3.size()));
        //  List<Integer> ans= new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     int a=0;
        //     if(i<arr1.length){
        //         a=arr1[i];
        //     }
        // }
        
        
    }
}