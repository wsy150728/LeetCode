package code.q1528;

/**
 * Tag Sort
 */
public class ShuffleString {
    public static String restoreString(String s, int[] indices) {
        char[] arr = new char[s.length()];

        for (int i = 0; i < indices.length; i++) {
            arr[indices[i]] = s.charAt(i);
        }

        return new String(arr);
        // 另一种方法
//        return String.valueOf(arr);
    }
}
