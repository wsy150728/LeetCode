package code.q56;


import java.util.*;

/**
 * @author wangshengyi
 * 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。请你合并所有重叠的区间，并返回一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间。
 * 1、循环获取所有包含的数
 * 2、碰到断点形成一个子集
 */
public class Merge {
    // 第一次想先把所有数提取成一个数组，然后再处理，发现这样并不正确
//    public int[][] merge(int[][] intervals) {
//        List<Integer> res = new ArrayList<>();
//        for (int i = 0; i < intervals.length;i ++){
//            for(int j = 0; j < intervals[0].length;j++){
//                if(!res.contains(intervals[i][j])){
//                    res.add(intervals[i][j]);
//                }
//            }
//        }
//
//        Collections.sort(res);
//
//        Map<Integer,List<Integer>> map = new HashMap<>();
//        int index = 0;
//        for (int x = 0;x < res.size();x++){
//            if(map.get(index).get(0) == null){
//
//                map.put(index, res[x]);
//                continue;
//            }
//            if(res.get(1) - 1 > res.get(x - 1)){
//                map.get(0).add(res.get(x));
//                index++;
//            }
//        }
//
//        int[][] result = new int[map.size()][];
//        for(int t = 0;t < map.size();t++){
//            result[t][0] = map.get(t).get(0);
//            result[t][1] = map.get(t).get(1);
//        }
//
//        return result;
//    }

    public int[][] merge(int[][] intervals){
        // 题目并没有说是按照左端从小到大排列的，所以先按照左端进行排序
        Arrays.sort(intervals, Comparator.comparingInt(v -> v[0]));
        int[][] res = new int[intervals.length][2];
        int idx = 0;
        for(int[] interval : intervals){
            if(idx == 0 || res[idx - 1][1] < interval[0]){
                res[idx] = interval;
                idx++;
            }else{
                res[idx-1][1] = Math.max(res[idx-1][1],interval[1]);
            }

        }

        return Arrays.copyOf(res,idx);
    }

    public int[][] merge11(int[][] intervals){
        // v0 升序
        Arrays.sort(intervals, Comparator.comparingInt(v ->v[0]));
        int index = 0;
        int[][] res = new int[intervals.length][2];
        for(int[] interval : intervals){
            if(index == 0 || res[index-1][1] < interval[0]){
                res[index] = interval;
                index++;
            }else{
                // 左侧比完应该比右侧哪个更大，而不是直接赋值
                res[index-1][1] = Math.max(interval[1], res[index-1][1]);
            }
        }

        return Arrays.copyOf(res, index);
    }
}
