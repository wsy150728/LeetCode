package code.q969;


import java.util.*;

/**
 * Tag Sort
 * Tag Array
 */
public class PancakeSort {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> k = new ArrayList<>();
        int arrLength = arr.length;

        int[] b = Arrays.copyOf(arr, arrLength);
        Arrays.sort(b);
        for (int i = arrLength - 1; i >= 0; i--) {
            if(Arrays.equals(arr, b)){
                return k;
            }
            int maxIndex = findMaxIndex(arr, b[i]);

            if(maxIndex == arrLength){
                --arrLength;
                continue;
            }

            if(maxIndex != 0){
                System.out.println(maxIndex + 1);
                System.out.println(Arrays.toString(arr));
                k.add(maxIndex + 1);
                reverse(arr, maxIndex);
            }



            k.add(arrLength);
            reverse(arr, --arrLength);
            System.out.println(arrLength+1);
            System.out.println(Arrays.toString(arr));
        }

        return k;
    }

    public int findMaxIndex(int[] arr, int v) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == v) {
                return i;
            }
        }
        return 0;
    }

    public void reverse(int[] arr, int right) {
//        int left = 0 ;
//        while (left < right){
//            int temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//            left ++;
//            right --;
//        }
        int x= right + 1;
        for (int i = 0; i <= x/2;i++){
            int temp = arr[i];
            arr[i] = arr[right];
            arr[right] = temp;
            right--;
        }
    }

//    public static List<Integer> pancakeSort(int[] A) {
//        List<Integer> list = new ArrayList<>();
//        int index = A.length - 1;
//        while (index >= 0){
//            int maxIndex = findMaxIndex(A,index);
//            if (maxIndex != index){
//                list.add(maxIndex + 1);
//                pancake(A,maxIndex + 1);
//                list.add(index + 1);
//                pancake(A,index + 1);
//            }
//            index --;
//        }
//        while (list.contains(new Integer(1)))
//            list.remove(new Integer(1));
//        while (list.contains(new Integer(0)))
//            list.remove(new Integer(0));
//
//        return list;
//    }
//
//    public static void pancake(int[] arr , int count){
//        int left = 0 ;
//        int right = count - 1;
//        while (left < right){
//            int temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//            left ++;
//            right --;
//        }
//    }
//
//    public static int findMaxIndex(int[] arr , int right){
//        int max = 0 ;
//        int maxIndex = 0;
//        for (int i = 0 ; i <= right ; i ++){
//            if (arr[i] > max){
//                max = arr[i];
//                maxIndex = i;
//            }
//        }
//        return maxIndex;
//    }



}
