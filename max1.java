import java.util.Scanner;
public class max1 {
    public static void main(String[] args)
    {
        int row, col ,count = 0,max1 = 0, maxi = 0;
        Scanner sc = new Scanner(System.in);
        int[][] a= new int[10][10];

        row = sc.nextInt();
        col = sc.nextInt();
        System.out.println("enter array ");
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(a[i][j] == 1)
                {
                    count++;
                }
                if(count > max1)
                {
                max1 = count;
                maxi = i;
                }
            }
        }
        System.out.println(max1);
        System.out.println(maxi);
    }
}
