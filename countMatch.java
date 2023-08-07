import java.util.Scanner;

public class countMatch {
    public static void main(String[] args)
    {
        int team, match = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("enter no. of team ");
        team = sc.nextInt();

        while(team > 1)
        {
            if(team % 2 == 0)
            {
                match += team / 2;
                team = team / 2;
            }
            else{
                match +=( (team - 1) / 2);
                team =( (team - 1) / 2) + 1;
            }
        }
        System.out.println("match: "+ match);
        System.out.print(team);

    }
}
