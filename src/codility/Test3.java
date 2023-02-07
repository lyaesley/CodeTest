package codility;

import java.util.Arrays;

public class Test3 {

    static boolean solution(int[] A, int K) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            if (A[i] + 1 < A[i + 1])
                return false;
        }
        if (A[0] != 1 || A[n - 1] != K)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        int[] A = {1,1,2,3,3};
        int[] B = {0,1,2,3};
        int[] C = {1,2,3,5};
        System.out.println(solution(A,3));
        System.out.println(solution(B,2));
        System.out.println(solution(C,5));
    }
}
