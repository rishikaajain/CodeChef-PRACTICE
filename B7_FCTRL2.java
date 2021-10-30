import java.util.Scanner;
public class B7_FCTRL2 {
    static int factorial(int n){
        if(n==0){
            return 1;
        }else{
            return (n*factorial(n-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fact=1;
        fact=factorial(sc.nextInt());
        System.out.println(fact);
    }
}
