package code.sort;

/**
 * @author admin
 * 冒泡排序算法的原理如下：
 * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * 对每一对相邻元素做同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
 * 针对所有的元素重复以上的步骤，除了最后一个。
 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 */

public class BubbleSort{
    public int[] bubbleSort(int[] list){
        int temp;
        for(int i = 0; i < list.length;i++){
            for(int j= 0 ;j< list.length - i - 1;j++){
                if(list[j] > list[j + 1]){
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j+1] = temp;
                }
            }
        }
        return list;
    }
}
