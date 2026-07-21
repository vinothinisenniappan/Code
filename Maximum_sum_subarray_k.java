import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        int count=0;
        int num=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=a-k;i++){
            for(int j=i;j<arr.length;j++){
              num+=arr[j];
              count = count+1;
              if(count==k){
                  count=0;
                  break;
              }
            }
            if(num>max){
               max=num;
            }
                num = 0;
        }
        System.out.println(max);
    }
}