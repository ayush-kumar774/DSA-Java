import java.util.ArrayList;
import java.util.*;

public class CA {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        ArrayList < ArrayList<Integer> > answer = new ArrayList<ArrayList<Integer> >();
        int t ;
        while (n > 0)
        {
            ArrayList<Integer> arr= new ArrayList<>();
            if (n < num)
            {
                num = n ;
            }
            for(int i = 0 ; i < num; i++)
            {
                t = sc.nextInt();
                arr.add(t);
            }
            answer.add(arr);
            n -= num;
            num *= 2;
        }
        int count = 0 ;
        for (int i = 0 ; i < answer.size(); i++)
        {
            if (i % 2 == 1)
            {
                Collections.reverse(answer.get(i));
            }
            for(int x : answer.get(i)){
                System.out.print(x + " ");
            }
        }
    }
}
