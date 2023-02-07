package codility.sorting;

import java.util.Arrays;

public class Triangle {
    /**
     * 주어진 모서리 집합에서 삼각형을 만들 수 있는지 확인합니다.
     * 효율적, 성능
     * idea : 정렬후 i, i+1 합이 i+2 보다 작으면 true 로 가정한다.
     * @param
     * @return
     */
    //O(N*log(N)), 93%, 1문제 오답.
    //오버플로우가 발생 될 경우 오답이 나온다
    static int solution2(int[] A) {

        Arrays.sort(A); //1,2,5,8,10,20

        for(int i = 0; i < A.length-2; i++) {
            if(A[i] + A[i+1] > A[i+2]) {
                return 1;
            }
        }
        return 0;
    }

    //O(N*log(N)), 100%
    static int solution(int[] A) {

        Arrays.sort(A); //1,2,5,8,10,20

        for(int i = 0; i < A.length-2; i++) {
            if(A[i+1] > A[i+2] - A[i]) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] A = {10,2,5,1,8,20};
        int[] B = {10,50,5,1};
        int[] C = {2147483645,2147483646,2147483647};
        System.out.println(solution(A));
        System.out.println(solution(B));
        System.out.println(solution(C));
    }
}
