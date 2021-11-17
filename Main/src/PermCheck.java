import java.util.HashSet;
import java.util.Set;

public class PermCheck {
    static int solution(int A[]){
        Set<Integer> hset = new HashSet<Integer>();
        for (int i = 0; i < A.length; i++){
            hset.add(A[i]);
        }

        for (int i = 1; i <= hset.size(); i++){
            if(!hset.contains(i)){
                return 0;
            }
        }

    return  1;
    }
}
