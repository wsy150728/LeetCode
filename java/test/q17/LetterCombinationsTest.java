package test.q17;


import code.q17.LetterCombinations;

import java.util.List;

public class LetterCombinationsTest {
    public static void main(String[] args) {

        String digits = "23";

        LetterCombinations model = new LetterCombinations();
        List<String> res = model.letterCombinations(digits);

        System.out.println(res);
    }
}
