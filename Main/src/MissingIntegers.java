import java.util.HashSet;

public class MissingIntegers {
    static public int solution(int A[]){
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i = 0; i< A.length; i++){

            hashSet.add(A[i]);
        }
       // System.out.println(hashSet);

        for(int j = 0 ; j<hashSet.size(); j++){
            if(!hashSet.contains(j+1)){
                return (j+1);
            }
        }



        return 0;
    }
}
