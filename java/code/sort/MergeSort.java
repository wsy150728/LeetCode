package code.sort;


/**
 * @author admin
 * 申请空间，使其大小为两个已经排序序列之和，该空间用来存放合并后的序列；
 * <p>
 * 设定两个指针，最初位置分别为两个已经排序序列的起始位置；
 * <p>
 * 比较两个指针所指向的元素，选择相对小的元素放入到合并空间，并移动指针到下一位置；
 * <p>
 * 重复步骤 3 直到某一指针达到序列尾；
 * <p>
 * 将另一序列剩下的所有元素直接复制到合并序列尾。
 */

public class MergeSort {
//    public int[] mergeSort(int[] arr) {
//        if (arr.length == 0){
//            return arr;
//        }
//        return mergeSort(arr, 0, arr.length - 1);
//    }
//
//    // 对 arr 的 [start, end] 区间归并排序
//    private static int[] mergeSort(int[] arr, int start, int end) {
//        // 只剩下一个数字，停止拆分，返回单个数字组成的数组
//        if(start == end) {
//            return new int[]{arr[start]};
//        }
//        int middle = (start + end) / 2;
//        // 拆分左边区域
//        int[] left = mergeSort(arr, start, middle);
//        // 拆分右边区域
//        int[] right = mergeSort(arr, middle + 1, end);
//        // 合并左右区域
//        return merge(left, right);
//    }
//
//    // 将两个有序数组合并为一个有序数组
//    private static int[] merge(int[] arr1, int[] arr2) {
//        int[] result = new int[arr1.length + arr2.length];
//        int index1 = 0, index2 = 0;
//        while (index1 < arr1.length && index2 < arr2.length) {
//            if (arr1[index1] <= arr2[index2]) {
//                result[index1 + index2] = arr1[index1++];
//            } else {
//                result[index1 + index2] = arr2[index2++];
//            }
//        }
//
//        // 将剩余数字补到结果数组之后
//        while (index1 < arr1.length) {
//            result[index1 + index2] = arr1[index1++];
//        }
//        while (index2 < arr2.length) {
//            result[index1 + index2] = arr2[index2++];
//        }
//
//        return result;
//    }
//

    public int[] mergeSort(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }

        return mergeSort(arr, 0, arr.length - 1);
    }

    public int[] mergeSort(int[] arr, int start, int end) {
        if(start == end){
            return new int[]{arr[start]};
        }

        // 拆分
        int middle = (start + end) / 2;

        int[] left = mergeSort(arr, start, middle);
        int[] right = mergeSort(arr, middle + 1, end);

        return merge(left, right);
    }

    // 合并
    public int[] merge(int[] left, int[] right) {
        int index1 = 0;
        int index2 = 0;
        int[] res = new int[left.length + right.length];

        while (index1 < left.length && index2 < right.length) {
            if (left[index1] <= right[index2]) {
                res[index1 + index2] = left[index1++];
            } else {
                res[index1 + index2] = right[index2++];
            }

        }
        while (index1 < left.length) {
            res[index1 + index2] = left[index1++];
        }

        while (index2 < right.length) {
            res[index1 + index2] = right[index2++];
        }

        return res;
    }


}
