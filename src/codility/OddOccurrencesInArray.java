package codility;

public class OddOccurrencesInArray {

    //홀수 개의 요소에서 발생하는 값을 찾습니다.
    //O(N) or O(N*log(N))
    static int solution(int[] A) {

        int result = 0;

        for( int i = 0; i < A.length; i++) {
            result = result ^ A[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] A = {9,3,9,3,9,7,9};
        System.out.println(solution(A));
    }
}
