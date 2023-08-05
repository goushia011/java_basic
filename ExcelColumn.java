import java.util.Scanner;

public class ExcelColumn {
    public static void main(String[] args) {
        String s;
        int y, result = 0, length = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter string");
        s = sc.next();

        for (int i = 0; i < s.length(); ++i) {
            length++;
        }
        length--;

        for (int i = 0; i <= length; i++) {
            y = power(26, (length - i) * (s.charAt(i) - 64));
            result += y;
        }
        System.out.print(result);
    }

    static int power(int base, int exp) {
        if (exp == 0)
            return 1;

        while (--exp > 0) {
            base *= base;
        }
        return base;

    }
}