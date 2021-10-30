import java.util.Scanner;
public class Motivation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
    while (t-- > 0){
        int n=sc.nextInt();
        int x=sc.nextInt();
        int maxrat=0;
        for(int i=1;i<=n;i++){
            int s=sc.nextInt();
            int r=sc.nextInt();
            if(x>=s){
                maxrat=Math.max(maxrat, r);
            }
        }
        System.out.println(maxrat);


    
    }

}
}
