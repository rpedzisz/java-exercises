public class Silnia {
    static int solution(int n){
       int  result = 1;
        if(n == 0 ){
            return result;
        }
        else{
            for(int i=1; i <= n; i++) {
                result = result * i;
            }
        }

        return result;
    }
}
