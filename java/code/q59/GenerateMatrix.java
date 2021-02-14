package code.q59;

/**
 */
public class GenerateMatrix {

    public int[][] generateMatrix(int n) {
        int l = 0, r = n - 1, t = 0, b = n - 1;
        int[][] mat = new int[n][n];
        int num = 1, tar = n * n;
        while(num <= tar){
            for(int i = l; i <= r; i++) {
                // left to right.
                mat[t][i] = num++;
            }
            t++;
            for(int i = t; i <= b; i++) {
                // top to bottom.
                mat[i][r] = num++;
            }
            r--;
            for(int i = r; i >= l; i--) {
                // right to left.
                mat[b][i] = num++;
            }
            b--;
            for(int i = b; i >= t; i--) {
                // bottom to top.
                mat[i][l] = num++;
            }
            l++;
        }
        return mat;
    }

}
