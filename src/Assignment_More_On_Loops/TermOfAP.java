package Assignment_More_On_Loops;

import java.util.Scanner;

public class TermOfAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int term = 0 ;// (3 N + 2)
        int counter = 0 ;
        int i = 1 ;
        while (counter < n) {
            term = 3 * i + 2;
            if (term % 4 != 0)
            {
                System.out.print(term + " ");
                counter++ ;
            }
            i++ ;
        }
    }
}
