import java.util.Arrays;
import java.util.Collections;

public class MaxCounters {
    static int [] solutionbrute(int A[], int N){
        int [] counters =  new int[N];
        for (int i = 0; i< counters.length; i++){
            counters[i] = 0;
        }
        //loop entry array
        for (int j = 0; j< A.length; j++){
            if(A[j] >= 1 && A[j] <= N){
                counters[A[j]-1]++;
            }
            if(A[j] == N+1){
                maxvalue(counters);
            }

        }


        return counters;
    }


    public static void maxvalue( int[] tab){
        int max = Arrays.stream(tab).max().getAsInt();

        for(int i = 0; i < tab.length; i++){
            tab[i] = max;
        }
    }



}
