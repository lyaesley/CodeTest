package basic;

/**
 * 설명: 정수의 비트 연산을 활용해 문제를 해결.
 * 적용 예제: 부분 집합 생성, 특정 조건 체크.
 * 문제 예시:
 * LeetCode 78: Subsets
 * LeetCode 136: Single Number
 *
 * 9. 비트 마스킹 (Bit Manipulation)
 * 문제: 주어진 배열에서 모든 숫자가 두 번씩 나오고 단 한 개의 숫자만 한 번 나옵니다. 이 숫자를 찾으세요.
 */
public class BitManipulationExample {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR 연산: 동일한 숫자는 상쇄됨
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums)); // Output: 4
    }
}
