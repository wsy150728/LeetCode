package test.q20;


import code.q20.IsValid;


public class IsValidTest {
    public static void main(String[] args) {

        String digits = "([)]";
//        String digits = "()";

        IsValid model = new IsValid();
        boolean res = model.isValid(digits);

        System.out.println(res);
    }
}
