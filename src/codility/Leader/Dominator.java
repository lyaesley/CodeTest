package codility.Leader;

import java.util.Stack;

public class Dominator {

    static int solution(int[] A) {

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            if (stack.isEmpty()) {
                stack.push(A[i]);
            } else if (stack.peek() == A[i]) {
                stack.push(A[i]);
            } else {
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            return -1;
        }
        int candidate = stack.peek();
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == candidate) {
                count++;
                if (count > A.length / 2) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {3,4,3,2,3,-1,3,1,3};
        System.out.println(solution(A));
    }
}
