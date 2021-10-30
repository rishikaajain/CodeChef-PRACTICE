import java.util.Scanner;

public class trunit {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
        double v;
        int u,a,s;
        u = sc.nextInt();
        v = sc.nextDouble();
        a = sc.nextInt();
        s = sc.nextInt();
        System.out.println(u<=v ? "yes" :( Math.sqrt((u*u)-2*a*s)<=v ? "yes":"No"));
    }
}
}