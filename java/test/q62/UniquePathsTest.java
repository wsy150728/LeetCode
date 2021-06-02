package test.q62;


import code.q62.UniquePaths;

public class UniquePathsTest {
    public static void main(String[] args) {
        int m = 4;
        int n = 7;

        UniquePaths model = new UniquePaths();
        int res = model.uniquePaths(m, n);

        System.out.println(res);
    }
}
