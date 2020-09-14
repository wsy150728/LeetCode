package test.q75;


import code.q75.SortColors;

import java.util.Arrays;

public class SortColorsTest {
    public static void main(String[] args) {
        int[] s = {2, 0, 2, 1, 1, 0};

        SortColors model = new SortColors();
        model.sortColors(s);

        System.out.println(Arrays.toString(s));
    }
}
