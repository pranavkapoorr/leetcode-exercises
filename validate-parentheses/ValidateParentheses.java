import java.util.Stack;

public class ValidateParentheses{

    private boolean validate(String s){
        Stack<Character> charStack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '{' || ch == '[' || ch == '('){
                charStack.push(ch);
            }else{
                if(!charStack.isEmpty() && isPair(charStack.peek(), ch)){
                    charStack.pop();
                }else{
                    return false;
                }
            }
        }
    
        return charStack.isEmpty();
    }

    private boolean isPair(char c1, char c2){
        return (
            c1 == '{' && c2 == '}'
            || c1 == '[' && c2 == ']'
            || c1 == '(' && c2 == ')'
        );
    }

    public static void main(String[] args){
        System.out.println(new ValidateParentheses().validate("[{hello]}"));
    }
}