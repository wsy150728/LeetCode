package code.sort;

/**
 * @author wangshengyi
 */
public class InsertSort {
    public int[] insertSort(int[] list) {
        int temp;
        int j;
        for (int i = 1; i < list.length;i++){
            temp = list[i];

            j = i;
            while(j > 0 && temp < list[j -1]){
                list[j] = list[j - 1];
                j--;
            }

            if(i != j){
                list[j] = temp;
            }
        }

        return list;
    }

}
