import java.util.Scanner;
public class NOTIME{
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int N = sc.nextInt();
     int H=sc.nextInt();
     int x=sc.nextInt();
     int y;
     for(int i=1;i<=N;i++){
         y=sc.nextInt();
         if(y+x >= H ){
             System.out.println("YES");
             System.exit(0);
         }
     }
     System.out.println("NO");
     
    }
}