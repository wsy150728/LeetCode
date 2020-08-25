package code.q1030;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Tag Sort
 */
public class AllCellsDistOrder {
    public static int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] re = new int[R * C][2];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                int t = i * C + j;
                re[t][0] = i;
                re[t][1] = j;
            }
        }
        Arrays.sort(re, (arr1, arr2) -> {
            int d1 = dist(arr1[0], arr1[1], r0, c0);
            int d2 = dist(arr2[0], arr2[1], r0, c0);
            return Integer.compare(d1, d2);
        });

        return re;
    }

    private static int dist(int r1, int c1, int r2, int c2) {
        return Math.abs(r1 - r2) + Math.abs(c1 - c2);
    }

    // BFS - 广度优先搜索
    public int[][] allCellsDistOrder2(int R, int C, int r0, int c0) {
        LinkedList<int[]> queue = new LinkedList<>();
        queue.add(new int[]{r0, c0});
        // 记录是否访问过
        boolean[][] visited = new boolean[R][C];
        visited[r0][c0] = true;

        int[][] ansArr = new int[R * C][2];
        int num = 0;

        while (!queue.isEmpty()) {
            List<int[]> nodeList = new ArrayList<>();
            while (!queue.isEmpty()) {
                int[] node = queue.removeFirst();
                ansArr[num++] = node;
                nodeList.add(node);
            }

            for (int[] node : nodeList) {
                int row = node[0];
                int col = node[1];

                // 上
                if (row > 0 && !visited[row - 1][col]) {
                    queue.add(new int[]{row - 1, col});
                    visited[row - 1][col] = true;
                }

                // 下
                if (row < R - 1 && !visited[row + 1][col]) {
                    queue.add(new int[]{row + 1, col});
                    visited[row + 1][col] = true;
                }

                // 左
                if (col > 0 && !visited[row][col - 1]) {
                    queue.add(new int[]{row, col - 1});
                    visited[row][col - 1] = true;
                }

                // 右
                if (col < C - 1 && !visited[row][col + 1]) {
                    queue.add(new int[]{row, col + 1});
                    visited[row][col + 1] = true;
                }
            }
        }

        return ansArr;

    }

}
