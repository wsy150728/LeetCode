package code.q55;

/**
 * @author wangshengyi
 */
public class CanJump {
    public boolean canJump(int[] nums) {
        if(nums.length <= 1){
            return true;
        }
        return canJump(nums, 0);
    }

    public boolean canJump(int[] nums, int i){
        if(i == nums.length - 1){
            return true;
        }
        if(nums[i] == 0){
            return false;
        }
        for(int x = nums[i]; x >= 1; x--){
            if(nums.length - i <= x){
                return true;
            }
            boolean flag = canJump(nums,i + x);
            if(flag){
                return true;
            }
        }

        return false;
    }

    public boolean canJump2(int[] nums) {
        if(nums.length <= 1){
            return true;
        }

        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > max){
                break;
            }
            max = Math.max(i + nums[i], max);
            if(max >= nums.length - 1){
                return true;
            }
        }

        return false;
    }

}
