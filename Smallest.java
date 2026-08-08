import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int s = 9;
        while(a>0)
        {
            int d = a%10;
            if(d<s)
            {
                s = d;
            }
            a=a/10;
        }
        System.out.print(s);
    }
}t