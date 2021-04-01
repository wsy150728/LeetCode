package code.sort;

/**
 * @author wangshengyi
 * 从数组中取出一个数，称之为基数（pivot）
 * 遍历数组，将比基数大的数字放到它的右边，比基数小的数字放到它的左边。遍历完成后，数组被分成了左右两个区域
 * 将左右两个区域视为两个数组，重复前两个步骤，直到排序完成
 */
public class QuickSort {
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int[] quickSort(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }

        quickSort(arr, 0, arr.length - 1);

        return arr;
    }

    public void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int middle = partition(arr, start, end);

        quickSort(arr, start, middle - 1);
        quickSort(arr, middle + 1, end);
    }

    // 从中取第一个数作为基数，然后从第二个开始挪动
    public int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int left = start + 1;
        int right = end;
        // left比right小的时候才有交换的意义
        while (left < right) {
            // 找到左边第一个比pivot大的，找到右边第一个比pivot小的
            while (left < right && arr[left] <= pivot) {
                left++;
            }
            while (left < right && arr[right] >= pivot) {
                right--;
            }
            if (left < right) {
                swap(arr, left++, right--);
            }
        }

        // 如果 left 和 right 相等，单独比较 arr[right] 和 pivot
        if (left == right && arr[right] > pivot) {
            right--;
        }

        swap(arr, start, right);

        return right;
    }

    //    public int partition(int[] arr, int start, int end) {
//        // 将 arr 从 start 到 end 分区，左边区域比基数小，右边区域比基数大，然后返回中间值的下标
//        // 取第一个数作为基数
//        int pivot = arr[start];
//        int left = start + 1;
//        int right = end;
//        while (left < right) {
//            // 找到第一个大于基数的位置
//            while (left < right && arr[left] <= pivot){ left++;}
//            // 找到第一个小于基数的位置
//            while (left < right && arr[right] >= pivot) {right--;}
//            // 交换这两个数，使得左边分区都小于或等于基数，右边分区大于或等于基数
//            if (left < right) {
//                swap(arr, left, right);
//                left++;
//                right--;
//            }
//        }
//        // 如果 left 和 right 相等，单独比较 arr[right] 和 pivot
//        if (left == right && arr[right] > pivot){ right--;}
//        // 将基数和轴交换
//        swap(arr, start, right);
//        return right;
//    }
//
}
