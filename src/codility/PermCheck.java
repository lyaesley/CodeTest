package codility;

import java.util.Arrays;

public class PermCheck {

    //배열 A가 순열인지 확인합니다.
    //O(N) or O(N * log(N))
    static int solution(int[] A) {
        Arrays.sort(A);
        int i = 1;
        for(int e : A) {
            if(i!=e) {
                return 0;
            }
            i++;
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] A = {4,1,3};
        System.out.println(solution(A));
    }
}
