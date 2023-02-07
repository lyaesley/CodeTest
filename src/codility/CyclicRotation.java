package codility;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CyclicRotation {

    //배열을 주어진 단계만큼 오른쪽으로 회전합니다.
    static int[] solution(int[] A, int K) {
        List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());

        Collections.rotate(list, K);

        int[] result = list.stream().mapToInt(Integer::intValue).toArray();
//        Arrays.stream(result).forEach(v -> System.out.print(v));
//        System.out.println();
        return result;

    }

    static int[] solution2(int[] A, int K) {
        int[] arr = new int[A.length];
        for(int i = 0; i < A.length; i++) {
            arr[(i + K) % A.length] = A[i];
        }
        Arrays.stream(arr).forEach(v -> System.out.print(v)); System.out.println();
        return arr;
    }


    public static void main(String[] args) {
        int[] A = {3,8,9,7,6};
        int[] B = {0,0,0};
        int[] C = {1,2,3,4};
        solution2(A,3);
        solution2(B,1);
        solution2(C,4);
    }
}
