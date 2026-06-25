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
        int max = 0;
        int s_max = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                s_max = max;
                max = arr[i];
            }
            else if(arr[i]>s_max && arr[i]!=max)
            {
                s_max = arr[i];
            }
        }
        System.out.print(s_max);
    }
}