package codility.stacksQueues;

import java.util.Stack;

public class Brackets {

    static int solution(String S) {
        Stack<Integer> st = new Stack<>();
        //ASCII code () 40/41, [] 91/93, {} 123/125

        for (int i = 0; i < S.length(); i++) {
            int tmp = S.charAt(i);
            if (tmp == 40 || tmp == 91 || tmp == 123) {
                st.push(tmp);
            } else if (tmp == 41 || tmp == 93 || tmp == 125) {
                if (st.empty())
                    return 0;

                switch (tmp) {
                    case 41:
                        if (st.pop() != 40) {
                            return 0;
                        }
                        break;
                    case 93:
                        if (st.pop() != 91) {
                            return 0;
                        }
                        break;
                    case 125:
                        if (st.pop() != 123) {
                            return 0;
                        }
                        break;
                }
            }
        }

        if (st.size() != 0) {
            return 0;
        } else {
            return 1;
        }
    }
    
    static int solutionV2(String S) {
        Stack<Character> st = new Stack<>();
        char openChar;
        
        for (char c : S.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            }else {
                if (st.empty()) return 0;
                openChar = st.pop();

                if (c == ')' && openChar != '(') return 0;
                else if (c == ']' && openChar != '[') return 0;
                else if (c == '}' && openChar != '{') return 0;
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
