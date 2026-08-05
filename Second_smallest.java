import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        for( int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        int small = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i=0;i<a;i++){
            if(small>arr[i]){
                second = small;
                small = arr[i];
                
            }
            else if(second>arr[i] && small!=arr[i]){
                second = arr[i];
            }
        }
        System.out.print(second);
    }
    
}