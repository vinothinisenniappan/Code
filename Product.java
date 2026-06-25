import java.util.*;
class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int product =1;
        for(int i=0;i<arr.length;i++)
        {
            product=product*arr[i];
        }
        System.out.print(product);
    }
}