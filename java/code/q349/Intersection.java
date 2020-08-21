package code.q349;

import com.sun.tools.javac.util.ArrayUtils;
import sun.security.util.ArrayUtil;

import java.util.*;

public class Intersection {
    // 第一次自己实现的方法，这种的确更适合用set集合的形式，忘记集合的特性了
    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if ((nums2[j] == nums1[i]) && !nums.contains(nums2[j])) {
                    nums.add(nums2[j]);
                    break;
                }
            }
        }

        return nums.stream().mapToInt(Integer::valueOf).toArray();
    }



    public static int[] intersection2(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int[] nums = new int[nums1.length];
        int x = 0;
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int j = 0; j < nums2.length; j++) {
            set2.add(nums2[j]);
        }
        for (int s : set1) {
            if (set2.contains(s)) {
                nums[x++] = s;
            }
        }

        return Arrays.copyOf(nums, x);
    }

    // 针对0的特殊情况需要处理
    public static int[] intersection3(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length];
        int x = 0;
        boolean flag = true;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                // 0的情况要特殊处理,因为初始化的nums中包含了0
                if(nums2[j] == nums1[i] && nums2[j] == 0 && flag){
                    nums[x++] = 0;
                    flag = false;
                    break;
                }
                if ((nums2[j] == nums1[i]) && !contains(nums, nums2[j])) {
                    nums[x++] = nums2[j];
                    break;
                }
            }
        }

        return Arrays.copyOf(nums, x);
    }

    private static boolean contains(int[] a, int s) {
        for (int i : a) {
            if (i == s) {
                return true;
            }
        }

        return false;
    }
}
