package code.sort;

/**
 * @author wangshengyi
 * 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置
 *
 * 再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 *
 * 重复第二步，直到所有元素均排序完毕。
 */
public class SelectSort {
    public int[] selectSort(int[] list) {
        int min;
        int index = 0;
        for(int i = 0;i < list.length - 1;i ++){
            min = list[i];
            for(int j = i + 1; j < list.length;j++){
                if(list[j] < min){
                    min = list[j];
                    index = j;
                }
            }
            if(min != list[i]){
                list[index] = list[i];
                list[i] = min;
            }
        }

        return list;
    }

    public int[] selectSort1(int[] list) {
        int min;
        int temp;

        for (int i = 0; i < list.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < list.length; j++) {
                if(list[j] < list[min]){
                    min = j;
                }
            }

            if(i!=min){
                temp = list[i];
                list[i] = list[min];
                list[min] = temp;
            }
        }

        return list;
    }

}

