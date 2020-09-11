package code.q969;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        int x= right + 1;
        for (int i = 0; i <= x/2;i++){
            int temp = arr[i];
            arr[i] = arr[right];
            arr[right] = temp;
            right--;
        }
    }



}
