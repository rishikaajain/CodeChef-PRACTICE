import java.util.Scanner;

public class T20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int R =sc.nextInt();
        int O =sc.nextInt();
        int C =sc.nextInt();
        int check;
         check=(20-O)*6;
           int result= check*6;
           int runs=C+result;
           if(runs>R){
               System.out.println("Yes");
           }else{
            System.out.println("No");
        }
        
    }
}
