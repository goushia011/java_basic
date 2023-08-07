import java.util.Scanner;

public class shuffle {
    public static void main(String[] args)
    {
        int n;
        int[] a = new int[10];
        int[] b = new int[10];

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        
        System.out.print("enter array ");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < n / 2; i++)
        {
            b[2 * i] = a[i];
            b[2 * i + 1] = a[n / 2 + i];
        }

        for(int i = 0; i < n; i++)
        {
            System.out.print(b[i]);
        }
    }
}
