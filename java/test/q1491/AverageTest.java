package test.q1491;

import code.q1491.Average;

public class AverageTest {
    public static void main(String[] args) {
        int[] nums = {1000, 2000, 3000, 5000, 4000, 6000};

        Double res = Average.average(nums);

        System.out.println(res);
    }
}
