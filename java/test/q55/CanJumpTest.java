package test.q55;


import code.q55.CanJump;


public class CanJumpTest {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};

        CanJump model = new CanJump();
        boolean res = model.canJump(nums);

        System.out.println(res);
    }
}
