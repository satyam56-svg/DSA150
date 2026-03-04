public class two_stack_arr {
    static class twoStacks {
        int arr[];
        int top1;
        int top2;
        int n;

        twoStacks() {
            n = 1000; // fixed array size (GFG style)
            arr = new int[n];
            top1 = -1;
            top2 = n;
        }

        // push in stack1
        void push1(int x) {

            if (top1 < top2 - 1) {
                top1++;
                arr[top1] = x;
            }
        }

        // push in stack2
        void push2(int x) {

            if (top1 < top2 - 1) {
                top2--;
                arr[top2] = x;
            }
        }

        // pop from stack1
        int pop1() {

            if (top1 >= 0) {
                int x = arr[top1];
                top1--;
                return x;
            }

            return -1;
        }

        // pop from stack2
        int pop2() {

            if (top2 < n) {
                int x = arr[top2];
                top2++;
                return x;
            }

            return -1;
        }
    }

    public static void main(String[] args) {
        twoStacks ts = new twoStacks();
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);

        System.out.println("Popped element from stack1 is " + ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from stack2 is " + ts.pop2());
    }

}
