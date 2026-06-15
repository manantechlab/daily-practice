import java.util.Stack;
class reversepolishnotation {
public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens){

            if (token.equals("+")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b+a);
            }
            else if (token.equals("-")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b-a);
            }
            else if (token.equals("*")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b*a);
            }
            else if (token.equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b/a);
            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();

    }
    public static void main(String[] args) {
        reversepolishnotation rpn = new reversepolishnotation();
        String[] tokens = {"2", "1", "+", "3", "*"};
        System.out.println(rpn.evalRPN(tokens)); // Output: 9
    }
}