package test.q70;


import code.q70.ClimbStairs;

public class ClimbStairsTest {
    public static void main(String[] args) {
        int n = 3;

        ClimbStairs model = new ClimbStairs();
        int res = model.climbStairs(n);

        System.out.println(res);
    }
}
