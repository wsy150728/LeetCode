package code.q76;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author wangshengyi
 */
public class MinWindow {
    Map<Character, Integer> ori = new HashMap<>();
    Map<Character, Integer> cnt = new HashMap<>();

    public String minWindow(String s, String t) {
        // 子串长度
        int tLen = t.length();

        // 构建子串map
        for (int i = 0; i < tLen; i++) {
            char c = t.charAt(i);
            ori.put(c, ori.getOrDefault(c, 0) + 1);
        }

        int l = 0;
        int r = -1;
        int len = Integer.MAX_VALUE;
        int ansL = -1;
        int ansR = -1;
        int sLen = s.length();
        while (r < sLen) {
            ++r;
            char sChar = s.charAt(r);
            if (r < sLen && ori.containsKey(sChar)) {
                cnt.put(sChar, cnt.getOrDefault(sChar, 0) + 1);
            }
            while (check() && l <= r) {
                if (r - l + 1 < len) {
                    len = r - l + 1;
                    ansL = l;
                    ansR = l + len;
                }
                if (ori.containsKey(s.charAt(l))) {
                    cnt.put(s.charAt(l), cnt.getOrDefault(s.charAt(l), 0) - 1);
                }
                ++l;
            }
        }
        return ansL == -1 ? "" : s.substring(ansL, ansR);
    }

    public boolean check() {
        Iterator iter = ori.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Character key = (Character) entry.getKey();
            Integer val = (Integer) entry.getValue();
            if (cnt.getOrDefault(key, 0) < val) {
                return false;
            }
        }
        return true;
    }

}
