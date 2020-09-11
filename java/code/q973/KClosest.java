package code.q973;


import java.util.*;

/**
 * Tag Heap
 * Tag Sort
 * Tag Divide and Conquer
 */
public class KClosest {

    public int[][] kClosest(int[][] points, int K) {
        int[][] res = new int[K][2];
        Map<Integer, List<Integer>> rankMap = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            int rankValue = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            if (rankMap.containsKey(rankValue)) {
                List<Integer> list = rankMap.get(rankValue);
                list.add(i);
                rankMap.replace(rankValue, list);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                rankMap.put(rankValue, list);
            }
        }

        List<Map.Entry<Integer, List<Integer>>> list = new ArrayList<>(rankMap.entrySet()); //转换为list

        list.sort(Map.Entry.comparingByKey());

        int index = 0;
        for (Map.Entry<Integer, List<Integer>> x : list) {
            List<Integer> childList = x.getValue();
            for (int a : childList) {
                res[index++] = points[a];
                if (index == K) {
                    return res;
                }
            }
        }

        return res;
    }

    /**
     * 直接运用Arrays.sort实现
     * @param points
     * @param K
     * @return
     */
    public int[][] kClosest2(int[][] points, int K) {
        int[][] ans = new int[K][2];
        Arrays.sort(points, (int[] o1, int[] o2) -> (o1[0] * o1[0] + o1[1] * o1[1] - o2[0] * o2[0] - o2[1] * o2[1]));
        System.arraycopy(points, 0, ans, 0, K);
        return ans;
    }

    /**
     * 有序队列实现
     * @param points
     * @param K
     * @return
     */
    public int[][] kClosest3(int[][] points, int K) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> (cal(b) - cal(a)));
        int[][] result = new int[K][2];
        for(int i = 0; i < K; i++){
            maxHeap.offer(points[i]);
        }
        for(int i = K; i < points.length; i++){
            if(cal(maxHeap.peek()) > cal(points[i])){
                maxHeap.poll();
                maxHeap.offer(points[i]);
            }
        }
        for(int i = 0; i < K; i++){
            result[i] = maxHeap.poll();
        }
        return result;
    }

    public int cal(int a[]){
        return (a[0] * a[0]) + (a[1] * a[1]);
    }

}
