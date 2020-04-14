package Collection;

import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push("1st in");
        st.push("2nd in");
        st.push("3th in");
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
    }
}
