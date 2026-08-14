class MinStack {

    Deque<Integer> stack;
    Deque<Integer> minStack;
    int min;
    int length;
    
    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }
    
    public void push(int value) {
        stack.push(value);
        if(minStack.isEmpty()){
            min = value;
            minStack.push(value);
        }

        else if(value <= min){
            min = value;
            minStack.push(value);
        }
            
    }
    
    public void pop() {
        if(stack.pop() == min){
            minStack.pop();
            if(minStack.isEmpty())
                return;
            else
                min = minStack.peek();
        }
       
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */