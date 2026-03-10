class Node{
    int val;
    int min;
    public Node(int v, int m){
        this.val = v;
        this.min = m;
    }
}
class MinStack {
    Stack<Node> stack;
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.push(new Node(val, val));
            return;
        }
        int currMin = stack.peek().min;
        int getMin = Math.min(currMin, val);
        stack.push(new Node(val, getMin));
    }
    
    public void pop() {
        if(!stack.isEmpty()) stack.pop();
    }
    
    public int top() {
        if(stack.isEmpty()) return -1;
        return stack.peek().val;
    }
    
    public int getMin() {
        if(stack.isEmpty()) return -1;
        return stack.peek().min;
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