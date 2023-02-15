package codility.stacksQueues;

import java.util.Stack;

public class StoneWall {

    static int solution(int[] H) {

        Stack<Integer> stack = new Stack<>();
        int blocks = 0;

        for (int h : H) {
            while(!stack.isEmpty() && stack.peek() > h) {
                stack.pop();
                blocks++;
            }
            if(stack.isEmpty() || stack.peek() < h) {
                stack.push(h);
            }
        }
        blocks += stack.size();
        return blocks;
    }


    public static void main(String[] args) {
        int[] A = {8,8,5,7,9,8,7,4,8};      //return 7
        System.out.println(solution(A));
    }
}
