package codility;

import java.util.Arrays;

public class GenomicRangeQuery {
    //시퀀스 DNA의 범위에서 최소 뉴클레오티드를 찾으십시오.
    //O(N * M), Task Score 62% Correctness 100% Performance 0%
    static int[] solution(String S, int[] P, int[] Q) {
        int[] resultArr = new int[P.length];

        for(int i = 0; i < P.length; i++) {
            // slice메소드는 두 번째 index까지는 포함시키지 않으므로 포함해서 자를수있도록 +1 해줌
            String temp = S.substring(P[i], Q[i]+1);

            if(temp.indexOf('A') != -1) {
                resultArr[i] = 1;
            } else if (temp.indexOf('C') != -1) {
                resultArr[i] = 2;
            } else if (temp.indexOf('G') != -1) {
                resultArr[i] = 3;
            } else {
                resultArr[i] = 4;
            }
        }

        Arrays.stream(resultArr).forEach(v -> System.out.println(v));
        return resultArr;
    }

    public static void main(String[] args) {
        int[] P = {2,5,0};
        int[] Q = {4,5,6};
        System.out.println(solution("CAGCCTA", P, Q));
    }
}
