package programmers.test.level1;

public class 대충만든자판 {
    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        for (int i = 0; i < targets.length; i++) {
            int index = -1;
            int sum = 0;
            for (int j = 0; j < targets[i].length(); j++) {
                char c = targets[i].charAt(j);

                for (int k = 0; k < keymap.length; k++) {
                    if( keymap[k].indexOf(c) > -1) {
                       index =  keymap[k].indexOf(c) + 1;
                    }
                } //end k

                if(index == -1){
                    answer[i] = -1;
                } else {
                    sum += index;
                }

            } // end j

            answer[i] = index == -1 ? -1 : sum;
            System.out.println(answer[i]);

        } // end i
        return answer;
    }

    public static void main(String[] args) {
        String[] keymap = {"AAAAAAAAAAAAAA1213141516171819202122232425262728293031323334353637383940414243444546474849505152535455565758596061626364656667" +
                "676869707172737475767778798081828384858687888990"};
        String[] targets = {"BBBBBBBBBBBBBB1213141516171819202122232425262728293031323334353637383940414243444546474849505152535455565758596061626364656667" +
                "676869707172737475767778798081828384858687888990"};
        solution(keymap, targets);

        System.out.println("display 12345");

        System.out.println("display_new 12");
    }
}
