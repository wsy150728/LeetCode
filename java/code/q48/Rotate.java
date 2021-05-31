package code.q48;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangshengyi
 */
public class Rotate {
    public int[][] rotate(int[][] matrix) {
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0;i < matrix.length;i++){
            for (int j = 0; j < matrix.length;j++){
                map.put(i+"-"+j,matrix[i][j]);
            }
        }
        for(int i = 0;i < matrix.length;i++){
            for (int j = 0; j < matrix.length;j++){
                matrix[j][matrix.length - 1 - i] = map.get(i+"-"+j);
            }
        }

        return matrix;
    }

    // 自转
    public void rotate1(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; ++i) {
            for (int j = 0; j < (n + 1) / 2; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = temp;
            }
        }
    }
}
