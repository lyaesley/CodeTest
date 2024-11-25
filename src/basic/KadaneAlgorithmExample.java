package basic;

/**
 * 설명: 부분 배열의 최대 합을 구하는 효율적인 알고리즘.
 * 적용 예제: 연속 부분 최대/최소 합.
 * 문제 예시:
 * LeetCode 53: Maximum Subarray
 *
 * 11. 카데인 알고리즘 (Kadane's Algorithm)
 * 문제: 배열에서 연속된 부분 배열의 최대 합을 구하세요.
 */
public class KadaneAlgorithmExample {
    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums)); // Output: 6 (4 + -1 + 2 + 1)
    }
}

