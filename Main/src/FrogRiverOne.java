import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
    static float solution(int A[],  int X){

        Set<Integer> hset = new HashSet<Integer>();

        for(int i = 1; i<= X; i++){
            hset.add(i);
        }

        for(int j = 0; j< A.length; j++ ){
            if(hset.remove(A[j])){
                if(hset.isEmpty()){
                    return j;
                }
            }

        }


        return -1;
    }
}
