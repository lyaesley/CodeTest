package programmers.test.ht;

public class Solution3 {
    //두 양의 정수가 문자열 형태로 주어질 떄, 두 양의 정수의 합을 문자열 형태로 반환하는 함수를 완성해주세요.
    public static String solution(String a, String b) {
        String answer = "";
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = i >= 0 ? a.charAt(i) - '0' : 0;
            int digit2 = j >= 0 ? b.charAt(j) - '0' : 0;
            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            int digit = sum % 10;
            result.append(digit);
            i--;
            j--;
        }
        answer = result.reverse().toString();
        return answer;
    }

    public static void main(String[] args) {

        String a = "1111";
        String b = "8889";

        System.out.println(solution(a,b));

    }
}
