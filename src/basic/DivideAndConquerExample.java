package basic;

/**
 *
 * 설명: 문제를 더 작은 하위 문제로 분할하여 해결하고, 결과를 합쳐서 원래 문제를 해결.
 * 적용 예제: 병합 정렬, 퀵 정렬, 큰 정수 곱셈.
 * 문제 예시:
 * LeetCode 53: Maximum Subarray
 * Merge Sort Algorithm
 *
 * 4. 분할 정복 (Divide and Conquer)
 * 문제: 배열의 최대값을 구하세요.
 */
public class DivideAndConquerExample {
    public static int findMax(int[] nums, int left, int right) {
        if (left == right) {
            return nums[left];
        }
        int mid = left + (right - left) / 2;
        int leftMax = findMax(nums, left, mid);
        int rightMax = findMax(nums, mid + 1, right);
        return Math.max(leftMax, rightMax);
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 3, 9, 2};
        System.out.println(findMax(nums, 0, nums.length - 1)); // Output: 9
    }
}
