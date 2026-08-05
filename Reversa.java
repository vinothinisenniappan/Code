import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        for( int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
       int left = 0;
       int right=arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for(int i=0;i<a;i++){
    System.out.print(arr[i]+" ");         
        }
    }   
}