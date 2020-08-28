package code.q1329;


import java.util.Arrays;

/**
 * Tag Sort
 * Tag Array
 */
public class DiagonalSort {
    public static int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int length;

        for (int i = 0; i < m - 1; i++) {
            if(m - i > n){
                length = n;
            }else{
                length = m - i;
            }
            int[] a = new int[length];
            int x = 0;
            int p = i;
            int q = 0;
            for (int j = 0; j < length; j++) {
                a[x++] = mat[p++][q++];
            }
            Arrays.sort(a);
            while (p > 0 && q > 0) {
                mat[--p][--q] = a[--x];
            }
        }


        if (m > 1) {
            for (int i = 1; i < n; i++) {
                if(n - i > m){
                    length = m;
                }else{
                    length = n - i;
                }
                int[] b = new int[length];
                int x = 0;
                int p = 0;
                int q = i;
                for (int j = 0; j < length; j++) {
                    b[x++] = mat[p++][q++];
                }
                Arrays.sort(b);
                while (p > 0 && q > 0) {
                    mat[--p][--q] = b[--x];
                }
            }
        }


        return mat;
    }


}
