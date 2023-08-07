import java.util.Scanner;

public class sumProduct {
    public static void main(String[] args)
    {
        int sum  = 0, product = 1, n, result;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number ");
        n = sc.nextInt();
        while(n > 1)
        {
            int digit;
            digit  = n % 10;
            sum += digit;
            product *= digit;
            n = n / 10;
        }
        result = product - sum;
        System.out.print(result);
    }
}
