import java.util.Scanner;
public class B5_flow006 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
        int N=sc.nextInt();
        int sum=0;
         while(N>0){
           
              int x = N % 10;
                sum = sum + x ;
                N = N / 10;
            
         }
         System.out.println(sum);

    }
}
}
