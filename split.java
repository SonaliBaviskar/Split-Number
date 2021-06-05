import java.util.*;
class split{
public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int N = sc.nextInt();
        while(N!=0)
        {
            int D = N%10;
            N = N/10;
             System.out.print(D+ " ");
        }
       
    }
}