package codility;

public class Test1 {

    static int solution(int N) {

        int P = N;
        int sum = 0;
        int answer = 0;

        while( P > 0) {
            sum += P % 10;
            P /= 10;
        }


        for(int i = N+1; ;i++) {
            int tmp = i;
            int sum2 = 0
                    ;
            while( tmp > 0) {
                sum2 += tmp % 10;
                tmp /= 10;
            }

            if(sum == sum2) {
                answer = i;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution(28)); //37
        System.out.println(solution(734)); //743
        System.out.println(solution(1990)); //2089
        System.out.println(solution(1000)); //10000
    }
}
