import java.util.Scanner;
public class makethesumeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int sum=0;
            int n=sc.nextInt();
            int[] arr = new int[n];
          for(int i=0;i<n;i++){
              arr[i]= sc.nextInt();
              sum +=arr[i];
        }
        if(sum%2==0){
            System.out.println(0);
        }else {
            byte flag=1;
          for (int ele : arr) {
              if(ele%2==0){
                  int p=Math.max(0, ele/2 -1);
                  if(p==0){
                      System.out.println(1);
                      flag=0;
                      break;
                  }
              }
          }
          if(flag==1){
              System.out.println(-1);
          }
        }
 }
}
}

