package codility;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class MissingInteger {

    //O(N) or O(N * log(N)), 100%
    static int solution(int[] A) {
        Arrays.sort(A);
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : A) {
            map.put(i,i);
        }

        for(int i = 1; i <= A.length; i++) {
            if(map.get(i) == null) {
                return i;
            }
        }
        return A.length + 1;
    }

    //주어진 시퀀스에서 발생하지 않는 가장 작은 양의 정수를 찾으십시오.
    //O(N) or O(N * log(N)), 100%
    static int solution2(int[] A) {
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

        int count = 0;
        for (int i = 0; i < sortArr.length ; i++) {
            count++;

            if(count != sortArr[i]) {
                result = count;
                break;
            }
        }
        if(result == 0) { result = sortArr.length + 1;}


        return result;
    }

    public static void main(String[] args) {
        int[] A = {1,3,6,4,1,2};
        int[] B = {1,2,3};
        int[] C = {-1,-3};
        System.out.println(solution(A));
        System.out.println(solution(B));
        System.out.println(solution(C));
    }
}
