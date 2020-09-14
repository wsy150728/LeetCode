package test.offer.q45;


import code.offer.q45.MinNumber;

public class MinNumberTest {
    public static void main(String[] args) {

        int[] nums = {3, 30, 34, 5, 9};

        MinNumber model = new MinNumber();
        String res = model.minNumber(nums);

        System.out.println(res);
    }
}
