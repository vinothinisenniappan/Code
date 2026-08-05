import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        for( int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        int val = arr[0];
        for(int i=1;i<a;i++){
            if(arr[i]>val){
                System.out.print("Not sorted");
                return;
            }
        }
        System.out.print("Sorted");
    }
    
}