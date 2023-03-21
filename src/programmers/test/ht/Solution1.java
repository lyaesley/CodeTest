package programmers.test.ht;

public class Solution1 {

//    Java 문자열 문자열에 a부터 z까지의 모든 알파벳이 있는지 확인하고 누락된 알파벳을 출력하는 함수를 만듭니다.

    public static String solution(String sentence) {
        String answer = "";

        String str = sentence.replaceAll("[^a-zA-Z]", "").toLowerCase();

        boolean[] alphabets = new boolean[26];

        //ascii a=97 z=122
        // iterate over each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') { // check if character is an alphabet
                alphabets[ch - 'a'] = true; // mark the alphabet as present in the array
            }
        }

        StringBuilder missing = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            if (!alphabets[i]) { // alphabet is missing
                missing.append((char)('a' + i)); // add missing alphabet to the string
            }
        }
        answer = missing.toString();

        return answer.equals("") ? "perfect" : answer;
    }

    public static void main(String[] args) {

        String a = "asdfasdfasdf#$%@ as23489057983dkjhafdskASDFASDFwqarezlxncvoiawrhn";

        System.out.println(solution(a));

    }
}
