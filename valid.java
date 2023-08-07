import java.util.Scanner;
import java.util.Stack;

public class valid {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        if(valid(s))
        {
            System.out.print("valid");
        }
        else    
            System.out.print("not valid");

    }

    public static boolean valid(String s) {
        Stack<Character> st = new Stack<>();
        char popped;
        int flag = 1;
        for (int i = 0; (i < s.length()) && (flag == 1); i++) {
            switch (s.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    st.push(s.charAt(i));
                    break;
                case ')':
                    if (st.empty()) {
                        flag = 0;
                        break;
                    }
                    popped = st.peek();
                    st.pop();

                    if (popped != '(')
                        flag = 0;
                    break;
                case ']':
                    if (st.empty()) {
                        flag = 0;
                        break;
                    }
                    popped = st.peek();
                    st.pop();
                    if (popped != '[')
                        flag = 0;
                    break;
                case '}':
                    if (st.empty()) {
                        flag = 0;
                        break;
                    }
                    popped = st.peek();
                    st.pop();
                    if (popped != '{')
                        flag = 0;
                    break;
            }
        }

        if (flag == 1 && st.empty()) {
            return true;
        } else {
            return false;
        }
    }
}
