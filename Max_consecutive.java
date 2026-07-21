import java.util.Scanner;

public class Max_consecutive {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int arr[] = new int[a];
    for(int i=0;i<a;i++){
        arr[i] = sc.nextInt();
    }
    int count=0;
    int max=0;
    int num=0;
    for(int i=0;i<a;i++){
            num+=arr[i];
            count+=1;          
        if(arr[i]==0){
            count = 0; 
        }
            if(count>max){
        max=count;
    }
    num=0;
      }   
     System.out.println(max);
   } 
}
