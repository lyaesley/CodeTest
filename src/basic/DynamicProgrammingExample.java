package basic;

/**
 * 설명: 큰 문제를 작은 문제로 나누고, 중복된 계산을 방지하며 점진적으로 해결.
 * 적용 예제: 최적 경로 계산, 최대 이익 계산.
 * 문제 예시:
 * LeetCode 70: Climbing Stairs
 * LeetCode 300: Longest Increasing Subsequence
 *
 * 5. 동적 프로그래밍 (Dynamic Programming)
 * 문제: 계단을 오르는 방법의 수를 구하세요. 한 번에 1계단 또는 2계단 오를 수 있습니다.
 */
public class DynamicProgrammingExample {
    public static int climbStairs(int n) {
        if (n <= 2) return n;

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5)); // Output: 8
    }
}

