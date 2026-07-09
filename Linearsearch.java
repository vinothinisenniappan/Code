import java.util.*;
public class Linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean set = true;
        int arr[] = new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        for(int i=0;i<a;i++)
        {
            if(arr[i]==target)
            {
              set = true;  
              break;
            }
            
        }
        if(set){
         System.out.print("Target element found");
       
    }
else{
     System.out.print("Target element not found");
}}
}
