package code.sort;

/**
 * @author wangshengyi
 */
public class BubbleSort {
    public int[] bubbleSortAsc(int[] list) {
        int temp;
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i; j < list.length -1; j++) {
                if(list[j] > list[j + 1]){
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }

        return list;
    }

}
