//{ Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG{
    public void pushBottom(Stack<Integer> stk, int a){
        if(stk.isEmpty() || stk.peek()<a){
            stk.push(a);
            return;
        }

        
        int top=stk.pop();
        pushBottom(stk,a);
        stk.push(top);
    }
	public Stack<Integer> sort(Stack<Integer> s)
	{
        
		if(s.isEmpty())
		    return s;
		    
		int top=s.pop();
		sort(s);
		pushBottom(s,top);
		return s;
	}
}