package basic;

/**
 * 설명: 고정된 크기나 가변적인 크기의 윈도우를 배열이나 문자열에서 이동시키며 문제를 해결하는 기법.
 * 적용 예제: 최대/최소 합 구하기, 부분 배열의 길이 조절, 특정 조건 만족 여부 확인.
 * 문제 예시:
 * LeetCode 209: Minimum Size Subarray Sum
 * LeetCode 567: Permutation in String
 *
 * 1. 슬라이딩 윈도우 (Sliding Window)
 * 문제: 주어진 배열에서 연속된 k개의 숫자 합의 최대값을 구하세요.
 */
public class SlidingWindowExample {
    public static int maxSum(int[] nums, int k) {
        int maxSum = 0, windowSum = 0;

        // 초기 윈도우 합 계산
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        maxSum = windowSum;

        // 슬라이딩 윈도우 적용
        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9, 2};
        int k = 3;
        System.out.println(maxSum(nums, k)); // Output: 21 (7+9+5)
    }
}

