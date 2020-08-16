package test.q1528;

import code.q1528.ShuffleString;

public class ShuffleStringTest {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};

        String output = ShuffleString.restoreString(s,indices);

        System.out.println(output);
    }
}
