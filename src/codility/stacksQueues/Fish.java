package codility.stacksQueues;

import java.util.*;

public class Fish {
    //N 탐욕스러운 물고기들이 강을 따라 움직이고 있습니다. 얼마나 많은 물고기가 살아 있는지 계산하십시오.
    //O(N), 100%
    static int solution2(int[] A, int[] B) {

        Stack<Integer> size = new Stack<>();
        Stack<Integer> way = new Stack<>();
        Stack<Integer> down = new Stack<>();


        for(int i = A.length-1; i >= 0;  i--) {
            size.push(A[i]);
            way.push(B[i]);
        }

        int result = 0;

        while(!size.empty() && !way.empty()) {

            int p1Size = size.pop();
            int p1Way = way.pop();

            if(down.empty() && p1Way == 0) {
                result++;
                continue;
            }

            if(p1Way == 1) {
                //하류로 가는 애들 담기
                down.push(p1Size);
                continue;
            }

            while (!down.empty() && down.peek() < p1Size) {
                    down.pop();
            }
            if(down.empty()) { result++; }

        }
        result += down.size();
        return result;
    }

    //개선
    //O(N), 100%
    static int solution(int[] A, int[] B) {
        Stack<Integer> down = new Stack<>();
        int alive = 0;
        for (int i = 0; i < A.length; i++) {
            if (B[i] == 1) {
                down.push(A[i]);
            } else {
                while (!down.isEmpty() && down.peek() < A[i]) {
                    down.pop();
                }
                if (down.isEmpty()) {
                    alive++;
                }
            }
        }
        return alive + down.size();
    }
    public static void main(String[] args) {
        int[] A = {4,3,2,1,5};
        int[] B = {0 ,1, 0, 0, 0};
//        int[] A = {50,30,20,40,41};
//        int[] B = {1 ,1, 0, 1, 0};

        System.out.println(solution(A,B));
    }
}
