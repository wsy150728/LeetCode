package code.q70;

/**
 * @author wangshengyi
 */
public class ClimbStairs {
    private int sum = 0;

    public int climbStairs(int n) {
        step(n,0);

        return sum;
    }

    private void step(int n,int i){
        if(i > n){
            return;
        }
        if(i == n){
            sum++;
            return;
        }
        step(n, i + 1);
        step(n, i + 2);
    }

    public int climbStairs1(int n) {
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; ++i) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }

    public int climbStairs2(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
