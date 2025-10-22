public class min_stack{



    Stack<Integer> st = new Stack<>();
    Stack<Integer> ss = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        if(st.size()==0){
            st.push(val);
            ss.push(val);
        }
        else{
            st.push (val);
            if(ss.peek()<val){
                ss.push(ss.peek());
            }
            else{
                ss.push(val);
            }
        }
        
    }
    
    public void pop() {
        
        ss.pop();
        st.pop();
    }
    
    public int top() {
        return st.peek();
        
    }
    
    public int getMin() {
        return ss.peek();
    }

}