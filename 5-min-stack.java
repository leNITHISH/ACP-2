
import java.util.Stack;

class MinStack {
    Stack<Integer> main = new Stack<>();
    Stack<Integer> min = new Stack<>();

    void push(int x) {
        main.push(x);
        if (min.isEmpty() || x <= min.peek()) {
            min.push(x);
        }
    }

    void pop() {
        if (main.isEmpty()) return;

        int removed = main.pop();
        if (removed == min.peek()) {
            min.pop();
        }
    }

    int getMin() {
        if (min.isEmpty()) return -1;
        return min.peek();
    }
}
