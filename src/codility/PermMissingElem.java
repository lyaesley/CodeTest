package codility;

import java.util.Arrays;

public class PermMissingElem {

    //주어진 순열에서 누락된 요소를 찾습니다.
    //O(n) or O(n log(n))
    static int solution(int[] A) {
        // Implement your solution here
        int[] sortArr;
        int result = 0;
        sortArr = Arrays.stream(A)
                .filter(v -> v > 0)
                .distinct()
                .sorted()
                .toArray();

        if(sortArr.length == 0) {
            result = 1;
            return result;
        }

        int sum = 0;
        for (int i = 0; i < sortArr.length ; i++) {
            sum++;

            if(sum != sortArr[i]) {
                result = sum;
                break;
            }
        }
        if(result == 0) { result = sortArr.length + 1;}


        return result;
    }

    public int solution2(int[] A) {
        Arrays.sort(A);

        for(int i = 0; i < A.length; i++) {
            if( i + 1 != A[i]) {
                return i + 1;
            }
        }

        return A.length + 1;
    }

    public static void main(String[] args) {
        int[] A = {-1000, 1000};
        int[] B = {3, 1, 2, 4, 3};
        int[] C = {-2, -3, -4, -1};
        int[] D = {-1, -2, 3, 4};
        System.out.println(solution(A));
        System.out.println(solution(B));
        System.out.println(solution(C));
        System.out.println(solution(D));
    }
}
