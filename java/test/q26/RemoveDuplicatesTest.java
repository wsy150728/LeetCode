package test.q26;


import code.q26.RemoveDuplicates;

public class RemoveDuplicatesTest {
    public static void main(String[] args) {

//        int[] nums = {4,5,6,7,8,1,2,3};
//        int target = 8;
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        RemoveDuplicates model = new RemoveDuplicates();
        int res = model.removeDuplicates(nums);

        System.out.println(res);
    }
}
