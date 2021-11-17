import java.util.Arrays;

public class OddOccurrencesArray {

    static int solutionxor(int [] A){
        int result = 0;
        for (int i = 0; i < A.length; i++){
            result = result ^ A[i];
        }

        return result;
    }
    static int solutionsort(int [] A){
        Arrays.sort(A);

        for (int i = 0; i < A.length; i=i+2){
            if(!(A[i] == A[i+1])){
                return A[i];
            }
        }

        return 0;
    }



}
