package programmers.test.level0;

public class 중복된숫자개수 {

    public static int solution(int[] array, int n) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] == n)
                answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1,1,2,3,4,5}; //result 2
        int n = 1;

        int[] array2 = {0,2,3,4}; //result 0
        int n2 = 1;

        System.out.println(solution(array, n));
        System.out.println(solution(array2, n2));
    }
}
