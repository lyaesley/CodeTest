package codility;

public class MinAvgTwoSlice {

    static int solution2(int[] A) {

        int index = 0;
        double minAvg = Double.MAX_VALUE;

        for(int i = 0; i < A.length-2; i++) {

            double avg2 = (A[i] + A[i+1]) / 2.0;

            if(minAvg > avg2) {
                minAvg = avg2;
                index = i;
            }

        }

        return index;
    }

    //O(N), 100%
    static int solution(int[] A) {

        int index = 0;
        double minAvg = Double.MAX_VALUE;

        for(int i = 0; i < A.length-2; i++) {

            double avg2 = (A[i] + A[i+1]) / 2.0;
            double avg3 = (A[i] + A[i+1] + A[i+2]) / 3.0;

            if(minAvg > Math.min(avg2, avg3)) {
                minAvg = Math.min(avg2, avg3);
                index = i;
            }

        }

        if(minAvg > (A[A.length -2] + A[A.length -1]) / 2.0) {
            minAvg = (A[A.length -2] + A[A.length -1]) / 2.0;
            index = A.length -2;
        }

        return index;
    }

    public static void main(String[] args) {
        int[] A = {4,2,2,5,1,5,8}; //1
        int[] B = {-3, -5, -8, -4, -10}; //2
//        System.out.println(solution(A));
        System.out.println(solution(B));
    }
}
