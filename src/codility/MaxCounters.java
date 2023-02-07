package codility;

import java.util.Arrays;

public class MaxCounters {

    //O(N + M) 100%
    static int[] solution(int N, int[] A) {
        int[] arr = new int[N];

        int temp = 0;
        int max = 0;

        for( int e : A) {
            if(e > N) {
                max = temp;
                continue;
            }

            if( arr[e-1] < max) {
                arr[e-1] = max;
            }

            arr[ e-1 ] += 1;

            if( arr[e-1] > temp) {
                temp = arr[e-1];
            }
        }

        for(int i = 0; i < N; i++) {
            if(arr[i] < max) {
                arr[i] = max;
            }
        }

        return arr;
    }

    //O(N*M) 55%
    static int[] solution3(int N, int[] A) {
        int[] arr = new int[N];

        int i = 0;
        int max = 0;


        for( int e : A) {

            if(e > N) {
                //최대 카운터 값으로 세팅
                //arr 의 모든 자리를 max 값으로 변경;
                Arrays.fill(arr, max);
                int finalMax = max;
                Arrays.setAll(arr, v -> finalMax);

            }else {
                arr[ e-1 ] += 1;
                max = max < arr[e-1] ? arr[e-1] : max;
            }

            i++;
        }

        Arrays.stream(arr).forEach(System.out::print);
        return arr;

    }

    //O(N*M) 55%
    static int[] solution2(int N, int[] A) {
        int[] arr = new int[N];

        int i = 0;
        int max = 0;

        for( int e : A) {

            if(A[i] > N) {
                //최대 카운터 값으로 세팅
                max = Arrays.stream(arr).max().getAsInt();
                int finalMax = max;
                arr = Arrays.stream(arr).map(v -> v = finalMax).toArray();
            }else {
                arr[ A[i]-1 ] += 1;
            }
            i++;
        }

        Arrays.stream(arr).forEach(System.out::print);
        return arr;
    }

    public static void main(String[] args) {
        int[] A = {3,4,4,6,1,4,4};
        int[] B = {2,1,1,2,1};
        int[] C = {1};
        System.out.println(solution(5,A));
        System.out.println(solution(1,B));
        System.out.println(solution(1,C));
    }
}
