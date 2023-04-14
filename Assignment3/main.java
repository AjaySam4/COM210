package Assignment3;
import java.util.*;

class Main{


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text to check for delimiters: ");
        String input = scanner.nextLine();
        if (checkBalance(input)){
            System.out.println("Balanced");
        }
        else {
            System.out.println("Unbalanced");
        }
        scanner.close();
    }

    private static boolean checkBalance(String input) {
        stackC stack = new stackC(input.length());
        for (int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            if (c == '(') {
                stack.push(c);
            }
            else if(c == ')'){
                if (stack.isEmpty()) {
                    return false;
            }
            char top = (char) stack.pop();
            if ((c == ')' && top != '(')) {
                return false;
            }
        }
    }
    return stack.isEmpty();
}
 }
