package codility;

import java.util.Arrays;

public class BinaryGap {

    //정수의 이진 표현에서 가장 긴 0 시퀀스를 찾습니다.
    static int solution(int N) {

        int result = 0;
        String binary = Integer.toBinaryString(N);

        if(!binary.contains("0")) {
            result = 0;
            return result;
        };

        int index = 0;
        int tmp = binary.indexOf("1");

        while( tmp > -1) {
            index = tmp;
            tmp = binary.indexOf("1", index+1);
            int gap = index+1 - tmp;
            if(result > gap){
                result = gap;
            }
        }
        return Math.abs(result);
    }

    public static void main(String[] args) {
        int A = 32;
        System.out.println(solution(A));

    }
}
