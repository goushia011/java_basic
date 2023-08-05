import java.util.Scanner;

public class romanToInteger 
{
    public static void main(String srgs[]) {
        int j,size, result = 0;
        int[] decimal;
        decimal = new int[40];
        String roman;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        roman = sc.next();

        for ( j = 0; j < roman.length(); j++);
        {
            for (int i = 0; i < j; i++)
            {
                decimal[i] = romanToDecimal(roman.charAt(i));
            }

            for (int i = 0; i < j - 1; i++) 
            {
                if (decimal[i] < decimal[i + 1]) 
                {
                    decimal[i + 1] -= decimal[i];
                    decimal[i] = 0;
                }
            }

            for (int i = 0; i < j; i++) 
            {
                result += decimal[i];
            }
        }
        System.out.println(result);
    }

    public static int romanToDecimal(char roman)
    {
        int decimal;
        switch (roman)
        {
            case 'I':
            case 'i':
                decimal = 1;
                break;
            case 'V':
            case 'v':
                decimal = 5;
                break;
            case 'X':
            case 'x':
                decimal = 10;
                break;
            case 'L':
            case 'l':
                decimal = 50;
                break;
            case 'C':
            case 'c':
                decimal = 100;
                break;
            case 'D':
            case 'd':
                decimal = 500;
                break;
            case 'M':
            case 'm':
                decimal = 1000;
                break;
            default:
                decimal = 0;
        }

        return decimal;
    }
}
