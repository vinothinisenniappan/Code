import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[a];
        
        for(int i=0;i<a;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<a;i++)
        {
            for(int j=i+1;j<a;j++)
            {
                int sum = arr[i]+arr[j];
            
            if(sum == k)
            {
                System.out.print(i+" "+j);
                return;
            }
        }
    }
}
}