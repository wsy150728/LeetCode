package test.q35;


import code.q35.SearchInsert;

public class SearchInsertTest {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;

        SearchInsert model = new SearchInsert();
        int res = model.searchInsert(nums, target);

        System.out.println(res);
    }
}
