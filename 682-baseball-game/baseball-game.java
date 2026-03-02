import java.util.*;

class Solution {
    public int calPoints(String[] ops) {

        Stack<Integer> st = new Stack<>();

        for (String op : ops) {

            if (op.equals("+")) {
                int last = st.pop();
                int sum = last + st.peek();
                st.push(last);
                st.push(sum);
            }
            else if (op.equals("D")) {
                st.push(2 * st.peek());
            }
            else if (op.equals("C")) {
                st.pop();
            }
            else {
  
                st.push(Integer.parseInt(op));
            }
        }

        int total = 0;
        for (int score : st) {
            total += score;
        }

        return total;
    }
}