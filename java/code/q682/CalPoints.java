package code.q682;


import java.util.Stack;

/**
 * Tag Stack
 */
public class CalPoints {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (String op : ops) {
            switch (op){
                case "C":
                    sum -= stack.pop();
                    break;
                case "D":
                    int calPointsDPeek = stack.peek() * 2;
                    stack.push(calPointsDPeek);
                    sum += calPointsDPeek;
                    break;
                case "+":
                    Integer calPointsAddPop = stack.pop();
                    Integer calPointsAddPeek = stack.peek();
                    stack.push(calPointsAddPop);
                    stack.push(calPointsAddPop + calPointsAddPeek);
                    sum += calPointsAddPop + calPointsAddPeek;
                    break;
                default:
                    stack.push(Integer.valueOf(op));
                    sum += stack.peek();
            }
        }
        return sum;
    }
}
