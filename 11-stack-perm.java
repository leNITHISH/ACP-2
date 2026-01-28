
import java.util.Stack;

class StackPermutation {
    static boolean isValid(int[] input, int[] output, int n) {

        Stack<Integer> st = new Stack<>();
        int j = 0;

        for (int i = 0; i < n; i++) {
            st.push(input[i]);

            while (!st.isEmpty() && st.peek() == output[j]) {
                st.pop();
                j++;
            }
        }

        return st.isEmpty();
    }
}
