package codility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

public class FrogRiverOne {

    //O(N)
    static int solution(int X, int[] A) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for( int i = 0; i < A.length; i++) {

            if(A[i] <= X ) { //&& map.get(A[i]) == null
                map.put(A[i], 1);
            }

            if(map.size() == X) {
                return i;
            }
        }

        return -1;
    }

    //O(N ** 2)
    static int solution2(int X, int[] A) {
        int[] arr = new int[X];
        int total = IntStream.rangeClosed(1,X).sum();

        for( int i = 0; i < A.length; i++) {
            arr[ A[i]-1 ] = A[i];
            int sum = Arrays.stream(arr).sum();
            if(sum == total) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] A = {1,3,1,4,2,3,5,4};
        System.out.println(solution(5, A));
    }
}
