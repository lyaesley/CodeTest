package codility.stacksQueues;

import java.util.Stack;

public class Nesting {

    static int solution(String S) {
        Stack<Character> st = new Stack<>();
        char openChar;

        for (char c : S.toCharArray()) {
            if (c == '(') {
                st.push(c);
            }else {
                if (st.empty()) return 0;
                openChar = st.pop();

                if (c == ')' && openChar != '(') return 0;
            }
        }
        return st.isEmpty() ? 1 : 0;
    }


    public static void main(String[] args) {
        String A = "{[()()]}";      //return 1;
        String B = "([)()]";        //return 0;
        String C = ")(";        //return 0;
        System.out.println(solution(A));
        System.out.println(solution(B));
        System.out.println(solution(C));
    }
}
