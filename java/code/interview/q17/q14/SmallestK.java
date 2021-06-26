package code.interview.q17.q14;


import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Tag Heap
 * Tag Sort
 * Tag Divide and Conquer
 */
public class SmallestK {

    public int[] smallestK(int[] arr, int k) {
        int[] res = new int[k];
        Arrays.sort(arr);
        for (int i = 0;i < k; i++){
            res[i] = arr[i];
        }

        return res;
    }

//    public int[] smallestK2(int[] arr, int k) {
//        PriorityQueue<Integer> mapHeap = new PriorityQueue<>((a,b)->b-a);
//        for ()
//
//        return res;
//    }
    public int[] smallestK2(int[] arr, int k) {
        int[] res = new int[k];

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->b-a);

        for (int i = 0;i < arr.length; i++){
            if(maxHeap.peek() > arr[i]){
                maxHeap.poll();
                maxHeap.offer(arr[i]);
            }
        }

        for (int i = 0;i<k;i++){
            res[i] = maxHeap.poll();
        }

        return res;
    }

}
