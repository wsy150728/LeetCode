package code.sort;

/**
 * @author wangshengyi
 * 选择一个增量序列 t1，t2，……，tk，其中 ti > tj, tk = 1；
 * <p>
 * 按增量序列个数 k，对序列进行 k 趟排序；
 * <p>
 * 每趟排序，根据对应的增量 ti，将待排序列分割成若干长度为 m 的子序列，分别对各子表进行直接插入排序。仅增量因子为 1 时，整个序列作为一个表来处理，表长度即为整个序列的长度。
 */
public class ShellSort {
    public int[] shellSort(int[] list) {
        int n = list.length;
        int temp;
        // 初始化gap
        int gap = n / 2;
        while (gap > 0) {
            for (int j = gap; j < n; j++) {
                int i = j;

                while (i >= gap && list[i - gap] > list[i]) {
                    temp = list[i - gap] + list[i];
                    list[i - gap] = temp - list[i - gap];
                    list[i] = temp - list[i - gap];
                    i -= gap;
                }
            }
            gap = gap / 2;
        }

        return list;
    }

}
