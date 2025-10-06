package Home_assignment8;

import java.util.Stack;

public class stocks_span {


        Stack<int[]> st;
    public StockSpanner() {

        st=new Stack<>();
        
    }
    
    public int next(int price) {
        int c=1;
        while(!st.isEmpty()&& st.peek()[0]<=price){
            c+=st.pop()[1];
        }
        st.push(new int[]{price,c});
        return c;
        
        
    }
}
    
//  Time Complexity: O(1) amortized for each next call
// -Each price is pushed and popped at most once.
