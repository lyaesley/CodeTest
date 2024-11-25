package basic;

import java.util.ArrayList;
import java.util.List;

/**
 * 설명: 가능한 모든 경우를 탐색하되, 유망하지 않은 경우는 가지치기로 제외.
 * 적용 예제: 순열, 조합, 그래프 탐색.
 * 문제 예시:
 * LeetCode 46: Permutations
 * LeetCode 39: Combination Sum
 *
 * 6. 백트래킹 (Backtracking)
 * 문제: 배열의 모든 순열을 출력하세요.
 */
public class BacktrackingExample {
    public static void permute(int[] nums, List<Integer> current, boolean[] used, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            current.add(nums[i]);
            permute(nums, current, used, result);
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        permute(nums, new ArrayList<>(), new boolean[nums.length], result);
        System.out.println(result); // Output: [[1, 2, 3], [1, 3, 2], ...]
    }
}

