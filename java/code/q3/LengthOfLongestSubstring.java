package code.q3;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wangshengyi
 */
public class LengthOfLongestSubstring {
    public static void main(String[] args){
        String s = "pwwkew";
        int x = lengthOfLongestSubstring(s);
        System.out.println(x);
    }


    // 暴力解法
    public static int lengthOfLongestSubstring2(String s) {
        char[] sArr = s.toCharArray();
        int max = 0;

        for(int i = 0;i < sArr.length;i++){
            List<Character> temp = new ArrayList<>();
            for(int j = i;j < sArr.length;j++){
                if(!temp.contains(sArr[j])){
                    temp.add(sArr[j]);
                }else{
                    break;
                }
            }
            max = Math.max(max, temp.size());
        }

        return max;
    }

    public static int lengthOfLongestSubstring(String s) {
       int max = 0;
       int left = 0;
       Map<Character,Integer> map = new HashMap<>();
       for(int i = 0;i < s.length();i++){
           Character key = s.charAt(i);
           // 不包含
           if(map.containsKey(key)){
               left = Math.max(left,map.get(key) + 1);
           }
           map.put(key, i);
           max = Math.max(max, i - left + 1);
       }

       return max;
    }

}
