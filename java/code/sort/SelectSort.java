package code.sort;

/**
 * @author wangshengyi
 */
public class SelectSort {
    public int[] selectSort(int[] list) {
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
