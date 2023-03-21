package programmers.test.ht;

import java.util.HashSet;
import java.util.Set;

//2016년은 아름다운 해입니다. 아름다운 해란 한 해를 구성하는 0부터 9까지의 숫자가 겹치지 않고 사용되는 해를 의미합니다.
// 즉, 2는 1번, 0은 1번, 1은 1번, 6은 1번을 사용하기 때문에 2016년을 아름다운 해라고 합니다.
//그러나 2344년은 4가 두 번 사용되기 때문에 아름다운 해가 아닙니다.
//어떤 아름다운 해는 2015년과 2016년처럼 연속적으로 존재하지만 특정 해가 지나면 아주 오랫동안 나오지 않는 때도 있습니다.
// 예를 들어, 1987년 이후 처음으로 나타나는 아름다운 해는 2013년이다.
// 특권 영 P를 매개변수로 주면 해당 해보다 큰 아름다운 해 중에서 가장 작은 아름다운 해를 반환하는 해 함수를 완성한다.
public class Solution2 {
    public static int solution(int P) {
        int answer = P + 1;
        while (!isBeautiful(answer)) {
            answer++;
        }
        return answer;
    }

    public static boolean isBeautiful(int year) {
        int[] digits = new int[10];
        while (year > 0) {
            int digit = year % 10;
            digits[digit]++;
            if (digits[digit] > 1) {
                return false;
            }
            year /= 10;
        }
        return true;
    }

    int solution2(int p) {
        int answer = 0;

        for (int i = p + 1; i <= 10000; i++) {

            Set<Integer> beautifulYear = new HashSet<>();
            int refNumber = i;
            boolean isFind = true;
            while(refNumber > 0) {
                int targetNumber = refNumber % 10;

                if (beautifulYear.contains(targetNumber)) {
                    isFind = false;
                    break;
                }

                beautifulYear.add(targetNumber);

                refNumber /= 10;
            }

            if (isFind) {
                answer = i;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int a = 1987;

        System.out.println(solution(a));

    }
}
