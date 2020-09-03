package code.q1387;

import java.util.*;

public class GetKth {
    public static int getKth(int lo, int hi, int k) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = lo; i <= hi; i++) {
            int weight = getWeight(i);
            if(map.containsKey(weight)){
                List<Integer> list = map.get(weight);
                list.add(i);
                map.replace(weight, list);
            } else{
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(weight,list);
            }
        }

        List<Map.Entry<Integer, List<Integer>>> list = new ArrayList<>(map.entrySet()); //转换为list

        list.sort(Map.Entry.comparingByKey());

        int index = 1;
        int res = 0;
        for (Map.Entry<Integer, List<Integer>> x : list){
            List<Integer> childList = x.getValue();
            for (int a : childList){
                if(index++ == k){
                    res = a;
                }
            }
        }

        return res;
    }

    public static int getWeight(int x) {
        int res = 0;
        while (x != 1) {
            if (x % 2 == 0) {
                x = x / 2;
            } else {
                x = 3 * x + 1;
            }
            res++;
        }
        return res;
    }

// ======================================================分割线========================================================


    private Map<Integer, Integer> memo;

    private int getWeight1(int num) {
        if (num == 1) {
            return 0;
        }

        if (memo.containsKey(num)) {
            return memo.get(num);
        }

        int count = (num & 1) == 0 ? getWeight(num >>> 1) : getWeight(3 * num + 1);
        count++;
        memo.put(num, count);
        return count;
    }


    /**
     * java 优先队列 + 记忆化
     * @param lo
     * @param hi
     * @param k
     * @return
     */
    public int getKth1(int lo, int hi, int k) {
        // 权重相同时,比较数值大小,权重不同时比较权重
        // 逆向为从大到小排列,poll取队首,则第k个就是队首那个
        PriorityQueue<int[]> heap = new PriorityQueue<>((o1, o2) -> o1[1] == o2[1] ? o2[0] - o1[0] : o2[1] - o1[1]);

        memo = new HashMap<>();

        for (int i = lo; i <= hi; i++) {
            heap.add(new int[]{i, getWeight1(i)});
            if (heap.size() > k) {
                heap.poll();
            }
        }
//        for (int[] x : heap){
//            System.out.println(Arrays.toString(x));
//        }
//
        return heap.peek()[0];
    }

}
