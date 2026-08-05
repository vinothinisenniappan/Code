import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        for( int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        //   int[] cl = new int[arr.length];
        int cl[] = arr.clone();
        for(int i=0;i<cl.length;i++){
            System.out.print(cl[i]+" ");
        }
    
    }
    
}