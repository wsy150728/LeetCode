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


    public static int getKth1(int lo, int hi, int k) {
        PriorityQueue<int[]> heap = new PriorityQueue<>((o1,o2) -> o1[1] == o2[0] ? o2[0] - o1[0] : o2[1] - o1[1]);

        for (int i = lo; i <= hi; i++) {
            heap.offer(new int[]{i,getWeight(i)});
//            if(heap.size() > k){
//                heap.poll();
//            }
        }

        return heap.peek()[0];
    }

}
