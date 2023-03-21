package programmers.test.ht;

//게임은 플레이어가 게임 로비에 입장하는 순서와 플레이어의 순위에 따라 자동으로 팀을 구성합니다. 이때 팀 구성 기준은 다음과 같다.
//- 먼저 입장한 플레이어의 팀을 결정합니다.
//- 새로운 선수를 새로운 팀에 배정하거나 모든 팀원의 등급이 선수 등급보다 낮은 팀에만 배정할 수 있습니다. (숫자가 낮을수록 등급이 낮습니다.)
//- 일단 팀이 설정되면 변경할 수 없습니다.
//- 팀이 적을수록 좋습니다.
public class Solution4 {
    public static int solution(int[] stats) {
        int answer = 1;
        int[] teamRanks = new int[stats.length];
        teamRanks[0] = stats[0];

        for (int i = 1; i < stats.length; i++) {
            boolean foundTeam = false;

            for (int j = 0; j < answer; j++) {
                if (stats[i] >= teamRanks[j]) {
                    foundTeam = true;
                    teamRanks[j] = stats[i];
                    break;
                }
            }

            if (!foundTeam) {
                answer++;
                teamRanks[answer - 1] = stats[i];
            }
        }

        return answer;
    }




    public static void main(String[] args) {

        int[] a = {5,3,4,6,2,1}; //4
        int[] b = {6,2,3,4,1,5}; //3

        System.out.println(solution(a));
        System.out.println(solution(b));

    }
}
