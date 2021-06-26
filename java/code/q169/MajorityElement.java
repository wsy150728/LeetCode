package code.q169;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wangshengyi
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int x = nums.length / 2;
        int res = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            int mapRes = map.getOrDefault(num,0) + 1;
            if (mapRes > x) {
                res = num;
                break;
            }
            map.put(num, mapRes);
        }
        return res;
    }
}
