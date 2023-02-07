package codility;

public class CountDiv {
    //범위 [a..b]에서 k로 나누어지는 정수의 수를 계산합니다.

    //O(1), 100%
    static int solution(int A, int B, int K) {

        if( A == 0)
            return B / K + 1;
        else
            return (B / K) - (A-1) / K;


    }

    public static void main(String[] args) {
        System.out.println(solution(6,11,2));
        System.out.println(solution(0,0,11));
        System.out.println(solution(11,14,2));
        System.out.println(solution(0,14,2));
    }
}
