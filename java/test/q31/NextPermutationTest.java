package test.q31;


import code.q31.NextPermutation;

public class NextPermutationTest {
    public static void main(String[] args) {

        int[] nums = {5,4,3};

        NextPermutation model = new NextPermutation();
        model.nextPermutation(nums);

        System.out.println(nums);
    }
}
