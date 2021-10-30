import java.util.Arrays;
import java.util.Scanner;

public class nobelprize {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int T = scn.nextInt();

        while (T-- > 0) {

            int N = scn.nextInt();
            int M = scn.nextInt();

            byte flag = 1;
            
            if (N>=M){
                
                int[] researcherTopics = new int[N+1];

                for (int i = 1; i <= N; i++) {
                    researcherTopics[scn.nextInt()] = -1;
                }
    
                Arrays.sort(researcherTopics);
    
                if(researcherTopics[M-1] == 0){
                    System.out.println("YES");
                    flag = 0;

                }
    
                if(flag == 1)
                System.out.println("NO");

            }

            else{

                int[] researcherTopics = new int[M+1];

                for (int i = 1; i <= N; i++) {
                    researcherTopics[scn.nextInt()] = -1;
                }
    
                Arrays.sort(researcherTopics);
    

                if(researcherTopics[M-1] == 0){
                    System.out.println("YES");
                    flag = 0;
                }
    
                if(flag == 1)
                System.out.println("NO");

            }

            
            
        }
        scn.close();
        
    }
}
