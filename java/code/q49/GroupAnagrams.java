package code.q49;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author wangshengyi
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] each = strs[i].toCharArray();
            Arrays.sort(each);
            String key = Arrays.toString(each);

            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(strs[i]);
            map.put(key, list);
        }
        return new ArrayList(map.values());
//        return new ArrayList<>(
//                Arrays.stream(strs).collect(
//                        Collectors.groupingBy(
//                                str -> str.chars().sorted().collect(
//                                        StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append
//                                ).toString()
//                        )
//                ).values()
//        );

    }
}
