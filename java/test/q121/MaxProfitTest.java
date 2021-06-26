package test.q121;


import code.q121.MaxProfit;

public class MaxProfitTest {
    public static void main(String[] args) {
        int[] x = {7,6,4,3,1};
        MaxProfit model = new MaxProfit();
        int res = model.maxProfit(x);

        System.out.println(res);
    }
}
