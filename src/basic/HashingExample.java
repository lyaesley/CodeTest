package basic;

import java.util.*;

/**
 * 설명: 데이터를 효율적으로 저장하고 탐색하기 위한 기법.
 * 적용 예제: 빈도 계산, 두 수 합 문제.
 * 문제 예시:
 * LeetCode 1: Two Sum
 * LeetCode 347: Top K Frequent Elements
 *
 * 12. 해시와 맵 (Hashing)
 * 문제: 주어진 배열에서 k번 이상 등장하는 숫자를 구하세요.
 */
public class HashingExample {
    public static List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        maxHeap.addAll(frequencyMap.entrySet());

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(maxHeap.poll().getKey());
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println(topKFrequent(nums, k)); // Output: [1, 2]
    }
}

