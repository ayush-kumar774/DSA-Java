package ConditionalsAndLoops;
import java.util.Scanner;

public class TotalSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basic = sc.nextInt();
        char grade = sc.next().charAt(0);
        int hra = (basic * 20) / 100 ;
        int da = (basic * 50) / 100 ;
        int pf = (basic * 11) / 100 ;
        if(grade == 'A')
        {
            System.out.println(basic + hra + da + 1700 - pf);
        }
        else if(grade == 'B')
        {
            System.out.println(basic + hra + da + 1500 - pf);
        }
        else
        {
            System.out.println(basic + hra + da + 1300 - pf);
        }
    }
}
