package code.q1370;

/**
 * Tag Sort
 * Tag String
 */
public class SortString {
    public static String sortString(String s) {
        int[] count = new int[26];

        for (char c : s.toCharArray())
            count[c - 'a'] += 1;


        StringBuilder res = new StringBuilder();

        while (res.length() != s.length()) {
            for (int i = 0; i < 26; i++) {
                if (count[i] == 0) {
                    continue;
                }
                res.append((char) (i + 'a'));
                count[i]--;
            }

            for (int j = 25; j >= 0; j--) {
                if (count[j] == 0) {
                    continue;
                }
                res.append((char) (j + 'a'));
                count[j]--;
            }
        }

        return res.toString();
    }
}
