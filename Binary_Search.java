// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int left=0;
        int right=arr.length-1;
        while(left<=right){
        int mid=(left+right)/2;
        if(arr[mid]==target){
        System.out.println(mid);
        break;
        }
        if(arr[mid]>target){
            right=mid-1;
        }
        if(arr[mid]<target){
            left=mid+1;
        }   
        else{
                System.out.println("Not found");
        }
        }
    }
}