package codility;

import java.util.Arrays;

public class MaxProductOfThree {
    //삼중선(P, Q, R)에 대해 A[P] * A[Q] * A[R]을 최대화합니다.

    //O(N * log(N)), 100%
    static int solution2(int[] A) {

        if(A.length == 0) return 0;

        int[] arr = Arrays.stream(A).sorted().toArray();

        int a = 0;
        int b = 0;


        if(arr[0] < 0 && arr[1] < 0 ) {
            a = arr[0] * arr[1] * arr[arr.length-1];
        }

        b = arr[arr.length-3] * arr[arr.length-2] * arr[arr.length-1];


        return a > b ? a : b;
    }

    //O(N * log(N)), 100%
    static int solution(int[] A) {
        if(A.length == 0) return 0;
        Arrays.sort(A);

        int i = A.length - 1;

        int answer = A[i] * A[i - 1] * A[i - 2];


        if(A[0] <= 0 && A[1] <= 0 && A[i] >= 0 ) {
            int answer2 = A[0] * A[1] * A[i];
            if (answer2 > answer) answer = answer2;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] A = {-3,1,2,-2,5,6};
        int[] B = {6,5,0,-2,1,-1,7};
        int[] C = {6,-5,0,-2,1,-1,-7};
        int[] D = {};
        System.out.println(solution(A));
        System.out.println(solution(B));
        System.out.println(solution(C));
        System.out.println(solution(D));
    }
}
