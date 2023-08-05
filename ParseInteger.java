import java.util.Scanner;

class ParseInteger
{
    public static void main(String args[]) 
    {
        int divider = 0, sign = 1;
        float result = 0;
        String s;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter string ");
        s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-') {
                sign = -1;
                continue;
            }
            if (s.charAt(i) == '.') {
                divider = 1;
            }
            result = result * 10 + parseInteger(s.charAt(i));
        }
        System.out.print(result);
        sc.close();
    }

    public static int parseInteger(char c) 
    {
        switch (c)
         {
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7; 
            case '8':
                return 8;               
            case '9':
                return 9;              
            case '0':
                return 0;
            default:
                return 0;
        }
    }
}