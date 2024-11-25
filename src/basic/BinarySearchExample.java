package basic;

/**
 * 설명: 정렬된 배열에서 특정 값을 효율적으로 찾는 방법. 탐색 공간을 절반으로 줄이며 탐색.
 * 적용 예제: 값 찾기, 최소/최대 조건 만족 여부 확인.
 * 문제 예시:
 * LeetCode 34: Find First and Last Position of Element in Sorted Array
 * LeetCode 74: Search a 2D Matrix
 *
 * 3. 이진 탐색 (Binary Search)
 * 문제: 정렬된 배열에서 특정 값을 찾으세요.
 */
public class BinarySearchExample {
    public static int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // 값이 없을 경우
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9};
        int target = 5;
        System.out.println(binarySearch(nums, target)); // Output: 2
    }
}
