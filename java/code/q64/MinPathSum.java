package code.q64;

/**
 * @author wangshengyi
 */
public class MinPathSum {
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int m = grid.length;
        int n = grid[0].length;
        int[][] sumArr = new int[m][n];
        sumArr[0][0] = grid[0][0];
        for (int i = 1; i < m; ++i) {
            sumArr[i][0] = grid[i][0] + sumArr[i - 1][0];
        }
        for (int j = 1; j < n; ++j) {
            sumArr[0][j] = grid[0][j] + sumArr[0][j - 1];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                sumArr[i][j] = Math.min(sumArr[i - 1][j], sumArr[i][j - 1]) + grid[i][j];
            }
        }

        return sumArr[m - 1][n - 1];
    }

    public int minPathSum1(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                if (i == 0) {
                    grid[i][j] = grid[i][j - 1] + grid[i][j];
                } else if (j == 0) {
                    grid[i][j] = grid[i - 1][j] + grid[i][j];
                } else {
                    grid[i][j] = Math.min(grid[i - 1][j], grid[i][j - 1]) + grid[i][j];
                }
            }
        }
        return grid[m - 1][n - 1];
    }

}
