import java.util.Stack;

public class baseball_Game {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for (String op : operations) {
            if (op.equals("+")) {
                int top = st.pop();
                int newScore = top + st.peek();
                st.push(top); // push back the popped one
                st.push(newScore);
            } else if (op.equals("D")) {
                st.push(2 * st.peek());
            } else if (op.equals("C")) {
                st.pop();
            } else {
                st.push(Integer.parseInt(op)); // convert string to int
            }
        }

        int sum = 0;
        for (int score : st) {
            sum += score;
        }

        return sum;
    }

    public static void main(String[] args) {
        baseball_Game game = new baseball_Game();
        String[] operations = {"5", "2", "C", "D", "+"};
        int result = game.calPoints(operations);
        System.out.println("Total Points: " + result); // Output should be 30
    }
}

// STEP:
/*
1. ek st name ka stack create kro..
2. for loop chlao string array(operations) ko traverse krne ke liye with the help of op varible
3. agr op=(+) ho to top ka value initilase kro st.pop(), newScore=st.peek()+top, aur phir dono ko push krdo stack me
4. agr op=(D) ho to st me 2*st.peek() ko push kro stack me
5. agr op=(C) ho to st me se pop out krdo 
6. otherwise, directly push kro integer me convert krke
7. sum variable ko initialse kro 0 se
8. st ka saare element ko add krdo 
9. last me sum ko return krdo
 */