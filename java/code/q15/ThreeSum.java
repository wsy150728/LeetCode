package code.q15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wangshengyi
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0;i < nums.length - 2;i++){
            if(nums[i] > 0){ break; }
            if (i > 0 && nums[i] == nums[i - 1]) { continue; }
            int j = i+1;
            int t = nums.length - 1;
            while(j < t){
                if(nums[t] < 0){
                    break;
                }
                int sum = nums[i] + nums[j] + nums[t];
                if(sum < 0){
                    j++;
                }else if(sum > 0){
                    t--;
                }else{
                    list.add(new ArrayList<>(Arrays.asList(nums[i], nums[j++], nums[t--])));
                    // 满足条件后 重复直接跳过
                    while (j < t && nums[j] == nums[j +1]) {j++;}
                    while (j < t && nums[t] == nums[t -1]) {t--;}
                    j++;
                    t--;
                }
            }
        }

        return list;
    }
}
