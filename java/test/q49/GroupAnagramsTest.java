package test.q49;


import code.q49.GroupAnagrams;

import java.util.List;


public class GroupAnagramsTest {
    public static void main(String[] args) {
        String[] nums = {"eat", "tea", "tan", "ate", "nat", "bat"};

        GroupAnagrams model = new GroupAnagrams();
        List<List<String>> res = model.groupAnagrams(nums);

        System.out.println(res.toString());
    }
}
