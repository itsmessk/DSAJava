import java.util.Stack;

class InfixToPostfix {
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String s) {
        // Your code here
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i =0; i< s.length(); i++){
            char c = s.charAt(i);
            
            if(Character.isLetterOrDigit(c)){
                result.append(c);
            }
            
            else if(c == '('){
                stack.push(c);
            }
            
            else if(c == ')'){
                while(!stack.empty() && stack.peek() != '('){
                    result.append(stack.pop());
                }
                stack.pop();
            }
            
            else{
                while(!stack.empty() && (priority(stack.peek()) >= priority(c))){
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }
        
        while(!stack.empty()){
            result.append(stack.pop());
        }
        
        return result.toString();
    }
    
    
    public static int priority(char s){
        switch(s){
            case '^' -> {
                return 3;
            }
            case '*', '/' -> { 
                return 2;
            }
            case '+', '-' -> {
                return 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        String infix = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println("Postfix Expression: " + infixToPostfix(infix));
    }
}