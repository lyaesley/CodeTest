package basic;

/**
 * 설명: 깊이 우선 탐색(DFS)과 너비 우선 탐색(BFS)을 활용한 그래프나 트리 탐색.
 * 적용 예제: 경로 찾기, 최단 경로 계산.
 * 문제 예시:
 * LeetCode 200: Number of Islands
 * LeetCode 127: Word Ladder
 *
 * 10. 그래프 탐색 (DFS/BFS)
 * 문제: 2D 격자에서 섬(1로 표시된 연속된 영역)의 개수를 구하세요.
 */
public class GraphSearchExample {
    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int count = 0;
        int rows = grid.length, cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j); // DFS로 섬 탐색
                }
            }
        }
        return count;
    }

    private static void dfs(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0'; // 방문한 곳을 0으로 변경
        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);
    }

    public static void main(String[] args) {
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        System.out.println(numIslands(grid)); // Output: 3
    }
}
