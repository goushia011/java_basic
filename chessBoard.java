import java.util.Scanner;

public class chessBoard {
    public static void main(String[] args) {
        int box;
        String s = new String();

        Scanner sc = new Scanner(System.in);

        System.out.println("enter chess board ");
        s = sc.next();

        box = (int) s.charAt(0) + (int) s.codePointAt(1);

        if (box % 2 == 0) {
            System.out.print("white");
        } else {
            System.out.print("black");
        }
    }

}