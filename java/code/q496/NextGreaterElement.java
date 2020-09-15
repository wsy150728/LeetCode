package code.q496;


import java.awt.font.NumericShaper;
import java.util.HashMap;
import java.util.Map;

/**
 * Tag Stack
 */
public class NextGreaterElement {

    /**
     * 数组的方法
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i< nums2.length; i++) {
            map.put(nums2[i],i);
        }
        for (int x = 0; x < nums1.length;x++){
            res[x] = -1;
            for (int y = map.get(nums1[x]) + 1; y < nums2.length;y++){
                if(nums1[x] < nums2[y]){
                    res[x] = nums2[y];
                    break;
                }
            }
        }

        return res;
    }

    /**
     * 栈的方法
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] nextGreaterElement2(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i< nums2.length; i++) {
            map.put(nums2[i],i);
        }
        for (int x = 0; x < nums1.length;x++){
            res[x] = -1;
            for (int y = map.get(nums1[x]) + 1; y < nums2.length;y++){
                if(nums1[x] < nums2[y]){
                    res[x] = nums2[y];
                    break;
                }
            }
        }

        return res;
    }
}
