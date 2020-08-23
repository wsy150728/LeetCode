package code.q922;

public class SortArrayByParityII {
    public static int[] sortArrayByParityII(int[] A) {
        int[] odd = new int[A.length/2];
        int[] even = new int[A.length/2];
        int[] res = new int[A.length];
        int oddIndex = 0;
        int evenIndex = 0;

        for (int x:A) {
            if(x%2 == 0){
               even[evenIndex++] = x;
            }else{
               odd[oddIndex++] = x;
            }
        }

        for (int i = 0;i<A.length;i++){
            res[i] = (i % 2 == 0) ? even[i/2] : odd[i/2];
        }

        return res;
    }

    public static int[] sortArrayByParityII2(int[] A) {
        int[] res = new int[A.length];
        int oddIndex = 1;
        int evenIndex = 0;

        for (int i = 0;i<A.length;i++){
            if(A[i] % 2 == 0){
                res[evenIndex] = A[i];
                evenIndex += 2;
            } else {
                res[oddIndex] = A[i];
                oddIndex+= 2;
            }
        }

        return res;
    }

}
