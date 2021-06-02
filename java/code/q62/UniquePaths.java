package code.q62;

/**
 * @author wangshengyi
 */
public class UniquePaths {
    private int sum = 0;

    public int uniquePaths(int m, int n) {
        step(m, n, 1, 1);

        return sum;
    }

    public void step(int m, int n, int x, int y) {
        if (x == m && y == n) {
            sum++;
            return;
        }

        if(x < m){
            step(m, n, x + 1, y);
        }

        if(y < n){
            step(m, n, x, y + 1);
        }
    }

    public int uniquePaths1(int m, int n) {
        int[][] f = new int[m][n];
        for (int i = 0; i < m; ++i) {
            f[i][0] = 1;
        }
        for (int j = 0; j < n; ++j) {
            f[0][j] = 1;
        }
        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                f[i][j] = f[i - 1][j] + f[i][j - 1];
            }
        }
        return f[m - 1][n - 1];
    }
}

