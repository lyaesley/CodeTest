package codility;

public class PassingCars {
    //도로에서 지나가는 자동차의 수를 세십시오.
    //O(N) , 100%
    static int solution(int[] A) {

        int p = 0;
        int sum = 0;

        //{0,1,0,1,1}
        for(int i = 0; i < A.length; i++) {
            if(A[i]== 0) {
                p++;
            }

            if(A[i]== 1) {
                sum += p;
            }
        }

        if( sum > 1000000000 || sum < 0) {
            sum = -1;
        }
        return sum;
    }


    public static void main(String[] args) {
        int[] A = {0,1,0,1,1}; //5
        int[] B = {0,1,0,1,1,1,1,1}; //11
        int[] C = {0,1,0,1,0,1,1,1}; //12
        System.out.println(solution(A));
        System.out.println(solution(B));
        System.out.println(solution(C));
    }
}
