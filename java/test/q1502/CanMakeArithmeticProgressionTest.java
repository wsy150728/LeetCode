package test.q1502;

import code.q1502.CanMakeArithmeticProgression;

public class CanMakeArithmeticProgressionTest {
    public static void main(String[] args) {
        int[] nums = {3,5,1};

        boolean flag = CanMakeArithmeticProgression.canMakeArithmeticProgression(nums);

        System.out.println(flag);
    }
}
