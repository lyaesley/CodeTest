package basic;

import java.util.Arrays;

/**
 * 설명: 현재 상황에서 가장 최적인 선택을 반복하여 전체 최적 해를 도출.
 * 적용 예제: 최소 스패닝 트리, 최단 경로.
 * 문제 예시:
 * LeetCode 435: Non-overlapping Intervals
 * LeetCode 55: Jump Game
 *
 * 7. 그리디 (Greedy)
 * 문제: 가장 적은 동전으로 금액을 맞추세요.
 */
public class GreedyExample {
    public static int minCoins(int[] coins, int amount) {
        Arrays.sort(coins);
        int count = 0;

        for (int i = coins.length - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                count++;
            }
        }
        return amount == 0 ? count : -1;
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        System.out.println(minCoins(coins, amount)); // Output: 3 (5+5+1)
    }
}

