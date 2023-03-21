package programmers.test.level1;

import java.util.HashMap;
import java.util.Map;

public class StringTest {
    public static int[] solution(String s) {
        int[] answer = new int[s.length()];

        Map<Character, Integer> tmp = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(tmp.containsKey(c)) {
                int len = i - tmp.get(c);
                answer[i] = len;
            } else {
                answer[i] = -1;
            }
            tmp.put(c, i);
        }

        return answer;

    }

    public static void main(String[] args) {
        String s = "banana";
        solution(s);
    }
}
