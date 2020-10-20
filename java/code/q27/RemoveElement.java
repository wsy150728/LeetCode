package code.q27;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int len = 0;
        for (int v:nums) {
            if(v == val){
                continue;
            }
            nums[++i] = v;
            len++;
        }
        return len;
    }
}
