package test.q64;


import code.q64.MinPathSum;

public class MinPathSumTest {
    public static void main(String[] args) {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};

        MinPathSum model = new MinPathSum();
        int res = model.minPathSum(grid);

        System.out.println(res);
    }
}
