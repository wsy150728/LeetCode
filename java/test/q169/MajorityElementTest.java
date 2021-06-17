package test.q169;


import code.q121.MaxProfit;
import code.q169.MajorityElement;

public class MajorityElementTest {
    public static void main(String[] args) {
        int[] x = {7,6,4,3,1};
        MajorityElement model = new MajorityElement();
        int res = model.majorityElement(x);

        System.out.println(res);
    }
}
