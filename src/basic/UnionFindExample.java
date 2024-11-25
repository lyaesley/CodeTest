package basic;

/**
 *설명: 데이터 간 연결 관계를 추적하고 관리. 그래프의 연결 요소를 효율적으로 계산.
 * 적용 예제: 네트워크 연결 여부, 사이클 판별.
 * 문제 예시:
 * LeetCode 684: Redundant Connection
 * LeetCode 323: Number of Connected Components in an Undirected Graph
 *
 * 8. 유니온 파인드 (Union-Find)
 * 문제: n개의 노드와 간선이 주어졌을 때, 모든 노드가 연결되어 있는지 확인하세요.
 *
 */
public class UnionFindExample {
    static class UnionFind {
        private int[] parent;

        public UnionFind(int size) {
            parent = new int[size];
            for (int i = 0; i < size; i++) {
                parent[i] = i;
            }
        }

        public int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX != rootY) {
                parent[rootY] = rootX;
            }
        }

        public boolean isConnected(int x, int y) {
            return find(x) == find(y);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        UnionFind uf = new UnionFind(n);

        uf.union(0, 1);
        uf.union(1, 2);
        uf.union(3, 4);

        System.out.println(uf.isConnected(0, 2)); // Output: true
        System.out.println(uf.isConnected(0, 4)); // Output: false
    }
}
