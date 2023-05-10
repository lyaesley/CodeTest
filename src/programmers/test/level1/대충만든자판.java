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
        String[] keymap = {"AAAAAAAAAAAAAA121314151617181920212223242526272829303132333435"};
        String[] targets = {"BBBBBBBBBBBBBB121314151617181920212223242526272829303132333435"};
        solution(keymap, targets);
    }
}
