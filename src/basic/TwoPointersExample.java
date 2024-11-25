package basic;

/**
 * 설명: 배열이나 리스트의 양 끝에서 시작하거나, 두 개의 포인터를 특정 방식으로 이동하며 문제를 해결하는 기법.
 * 적용 예제: 정렬된 배열에서 두 수의 합 찾기, 중복 제거, 회문 판단.
 * 문제 예시:
 * LeetCode 167: Two Sum II - Input Array Is Sorted
 * LeetCode 125: Valid Palindrome
 *
 * 2. 투 포인터 (Two Pointers)
 * 문제: 정렬된 배열에서 합이 target인 두 숫자의 인덱스를 찾으세요.
 */
public class TwoPointersExample {
    public static int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1}; // 값이 없을 경우
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 6};
        int target = 8;
        int[] result = twoSum(nums, target);
        System.out.println(result[0] + ", " + result[1]); // Output: 1, 4
    }
}
