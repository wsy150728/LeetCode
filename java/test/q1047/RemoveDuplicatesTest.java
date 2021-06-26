package test.q1047;

import code.q1047.RemoveDuplicates;

public class RemoveDuplicatesTest {
    public static void main(String[] args) {
        String s = "abbaca";

        RemoveDuplicates model = new RemoveDuplicates();

        String res = model.removeDuplicates(s);

        System.out.println(res);
    }
}
