package test.q242;

import code.q242.IsAnagram;
import code.q349.Intersection;

import java.util.Arrays;

public class IsAnagramTest {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "anmgraa";

        boolean flag = IsAnagram.isAnagram(s, t);

        System.out.println(flag);
    }
}
