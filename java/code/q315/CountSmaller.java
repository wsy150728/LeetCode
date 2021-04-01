package code.q315;

import java.util.*;

/**
 *
 */
public class CountSmaller {
    public List<Integer> countSmaller(int[] nums) {
        //初始化不重复数组
        Set<Integer> numsSet = new HashSet<>();
        for(Integer num : nums){
            numsSet.add(num);
        }
        int[] a = numsSet.stream().mapToInt(Number::intValue).toArray();
        Arrays.sort(a);
        // 初始化数组
        int[] c = new int [nums.length + 5];
        Arrays.fill(c, 0);

        int resNum;
        List<Integer> res = new ArrayList<>();
        for(int i = nums.length - 1;i >= 0;i--){
            resNum = 0;
            // 获取所在位置
            int pos = Arrays.binarySearch(a,nums[i]);
            c[pos]++;
            while (pos > 0){
                resNum += c[pos--];
            }
            res.add(resNum);
        }
        Collections.reverse(res);
        return res;
    }

    /**
     * 暴力解法通不过
     * @param nums
     * @return
     */
//    public List<Integer> countSmaller(int[] nums) {
//        List<Integer> res = new ArrayList<>();
//        res.add(0);
//        int t = 0;
//        for (int i = nums.length - 2; i >= 0; i--) {
//            t++;
//            if (nums[i] > nums[i + 1]) {
//                res.add(res.get(t - 1) + 1);
//                continue;
//            }
//            int x = 0;
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] > nums[j]) {
//                    x++;
//                }
//            }
//            res.add(x);
//        }
//        Collections.reverse(res);
//        return res;
//    }
}
