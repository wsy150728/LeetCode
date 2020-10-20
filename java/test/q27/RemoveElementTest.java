package test.q27;


import code.q27.RemoveElement;
import code.q33.Search;

public class RemoveElementTest {
    public static void main(String[] args) {

//        int[] nums = {4,5,6,7,8,1,2,3};
//        int target = 8;
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        RemoveElement model = new RemoveElement();
        int res = model.removeElement(nums, val);

        System.out.println(res);
    }
}
