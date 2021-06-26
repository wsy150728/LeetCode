package code.sort;

/**
 * @author wangshengyi
 * 将第一待排序序列第一个元素看做一个有序序列，把第二个元素到最后一个元素当成是未排序序列。
 *
 * 从头到尾依次扫描未排序序列，将扫描到的每个元素插入有序序列的适当位置。（如果待插入的元素与有序序列中的某个元素相等，则将待插入元素插入到相等元素的后面。）
 */
public class InsertSort {
    public int[] insertSort(int[] list) {
        int j;
        int tmp;
        for(int i = 1; i < list.length; i++){
            j = i;

            tmp = list[i];
            while (j > 0  && tmp < list[j - 1]){
                list[j] = list[j - 1];
                j--;
            }

            if(i != j){
                list[j] = tmp;
            }
        }
        return list;
    }

}
