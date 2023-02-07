package codility.sorting;

import java.util.Arrays;

public class Distinct {
    //배열에서 개별 값의 수를 계산합니다.
    //O(N*log(N)) or O(N), 100%
    static int solution(int[] A) {

        return (int) Arrays.stream(A).distinct().count();
    }

    public static void main(String[] args) {
        int[] A = {2,1,1,2,3,1};
        int[] B = {};
        System.out.println(solution(A));
        System.out.println(solution(B));
    }
}
