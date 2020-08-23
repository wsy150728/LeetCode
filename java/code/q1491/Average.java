package code.q1491;

import java.util.Arrays;

/**
 * Tag Sort
 * Tag Array
 */
public class Average {
    public static double average(int[] salary) {
        double sum = 0;
        Arrays.sort(salary);
        for(int i = 1; i < salary.length - 1; i++){
            sum += salary[i];
        }


        return sum / (salary.length - 2);
    }
}
