package codility;

import java.util.Arrays;

public class TapeEquilibrium {
    //O(n)
    //|(A[0] + ... + A[P-1]) - (A[P] + ... + A[N-1])| 값을 최소화합니다.
    static int solution(int[] A) {
        int total = Arrays.stream(A).sum();
        int minimumDifference = 0;
        int sum = 0;

        for(int i = 0; i < A.length-1; i++) {
            sum +=  A[i];
            int difference = sum - (total-sum);

            difference = Math.abs(difference);

            if(i==0) {
                minimumDifference = difference;
                continue;
            }

            if(difference < minimumDifference) {
                minimumDifference = difference;
            }
        }

        return minimumDifference;
    }


    public static void main(String[] args) {
        int[] A = {-1000, 1000}; //2000
        int[] B = {3, 1, 2, 4, 3}; //1
        int[] C = {-2, -3, -4, -1}; //0
        int[] D = {-1, -2, 3, 4}; //4
        System.out.println(solution(A));
        System.out.println(solution(B));
        System.out.println(solution(C));
        System.out.println(solution(D));
    }
}
