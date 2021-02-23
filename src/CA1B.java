import java.util.ArrayList;
import java.util.Scanner;
public class CA1B {
    public static boolean isVowel(char ch)
    {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u')  {
            return true ;
        }
        else {
            return  false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0 ;
        char arr[] = new char[n];
        for (int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.next().charAt(0);
        }
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0 ; i < n ; i++)
        {
            if(isVowel(arr[i]))
            {
                index.add(i);
            }
        }
        if (index.size() == 1){
            System.out.print("1");
        }
        else
        {
            for (int i = 0 ; i < index.size() - 1 ;i++)
            {
                ans = Math.max(((index.get(i + 1) - index.get(i) )- 1), ans);
            }
            System.out.print(ans);
        }
    }
}
