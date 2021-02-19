package Recursion;
import java.util.Scanner;
public class RemoveX2{

    public static String RemoveXRecur(String str, int index)
    {
        if(str.length() == 0){
            return str;
        }

        if(index == str.length()){
            return "";
        }

        String ans = "" ;

        if(str.charAt(index) != 'x' ) {
            ans += str.charAt(index) ;
        }

        String smallAns = RemoveXRecur(str, index + 1);

        return (ans + smallAns) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the string ");
        String str = sc.next();
        String ans = RemoveXRecur(str, 0) ;
        System.out.println("After removing all the Xs");
        System.out.println(ans);
    }
}