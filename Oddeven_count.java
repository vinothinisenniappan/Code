import java.util.*;

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
    
      int count = 0;
      int county = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(a>0)
            {
               count = count+1;
            }
            else if(a<0)
            {
                county = county+1;
            }
          }
        System.out.println("even: "+count);
        System.out.println("odd: "+county);
    }
}