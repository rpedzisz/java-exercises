import java.util.HashSet;
import java.util.Set;

public class PermMissingElem {
    static float solution(int []A){

        Set<Integer> hset = new HashSet<Integer>();

        for(int i =0; i< A.length; i++){
            hset.add(A[i]);
        }

        System.out.println(hset);

        for (int j=0; j <= hset.size(); j++ ){

            if(!hset.contains(j)){
                return j;
            }
        }


        return 0;
    }
}
