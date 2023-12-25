class MinStack {
    ArrayList<Integer> stack;
    ArrayList<Integer> minStack;
    public MinStack() {
        this.stack= new ArrayList<>();
        this.minStack=new ArrayList<>();
    }
    
    public void push(int val) {
        stack.add(val);    
        //to maintain Min value of stack
        if(minStack.isEmpty() || val<=minStack.get(minStack.size()-1))
            minStack.add(val);
    }
    
    public void pop() {
        int val= stack.remove(stack.size()-1);

        //case: if deleted element is min val
        if(!minStack.isEmpty() && minStack.get(minStack.size()-1)==val)
            minStack.remove(minStack.size()-1);

    }
    
    public int top() {
        return stack.get(stack.size()-1);
    }
    
    public int getMin() {
        return minStack.get(minStack.size()-1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */