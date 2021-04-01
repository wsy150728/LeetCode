package test.q42;


import code.q35.SearchInsert;
import code.q42.Trap;

public class TrapTest {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        Trap model = new Trap();
        int res = model.trap(height);

        System.out.println(res);
    }
}
