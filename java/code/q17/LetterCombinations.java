package code.q17;

import java.util.*;

/**
 * @author wangshengyi
 */
public class LetterCombinations {

    private List<String> res = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        Map<Integer,List<String>> map = new HashMap<>();
        map.put(2, new ArrayList<>(Arrays.asList("a","b","c")) );
        map.put(3, new ArrayList<>(Arrays.asList("d","e","f")) );
        map.put(4, new ArrayList<>(Arrays.asList("g","h","i")) );
        map.put(5, new ArrayList<>(Arrays.asList("j","k","l")) );
        map.put(6, new ArrayList<>(Arrays.asList("m","n","o")) );
        map.put(7, new ArrayList<>(Arrays.asList("p","q","r","s")) );
        map.put(8, new ArrayList<>(Arrays.asList("t","u","v")) );
        map.put(9, new ArrayList<>(Arrays.asList("w","x","y","z")) );

        if(digits.isEmpty()){
            return res;
        }

        findCombination(digits, map, 0, "");

        return res;
    }

    private void findCombination(String digits, Map<Integer,List<String>> map, int index, String s) {
        if(index == digits.length()){
            res.add(s);
            return;
        }

        char c = digits.charAt(index);
        List<String> list = map.get(Integer.parseInt(String.valueOf(c)));
        for(int i = 0 ; i < list.size() ; i ++){
            findCombination(digits,map, index+1, s + list.get(i));
        }
    }
}
