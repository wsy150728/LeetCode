package test.q179;


import code.q179.LargestNumber;

public class largestNumberTest {
    public static void main(String[] args) {
        int[] nums = {30,3,34,5,9};

        LargestNumber model = new LargestNumber();
        String res = model.largestNumber(nums);

        System.out.println(res);
    }
}
