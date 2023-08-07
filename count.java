// A pair (i, j) is called good if nums[i] == nums[j] and i < j.

// example 1
// Input: nums = [1,2,3,1,1,3]
// Output: 4
// Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

// example 2
// Input: nums = [1,1,1,1]
// Output: 6

import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        int count = 0, i, j, n;
        int s[] = new int[10];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.print("enter string ");
        for (int k = 0; k < n; k++) {
            s[k] = sc.nextInt();
        }

        for (i = 0; i < (n - 1); i++) {
            for (j = i + 1; j < n; j++) {
                if (s[i] == s[j]) {
                    count++;
                    System.out.print(i);
                    System.out.print(" ");
                    System.out.println(j);

                }
            }
        }
        System.out.print(count);
    }
}
