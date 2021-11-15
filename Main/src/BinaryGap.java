public class BinaryGap {

    static float solution(int n){
    String binary = Integer.toBinaryString(n);

        int maxlenght = 0;
        int currlenght = 0;


    for(int i =0; i< binary.length(); i++){

        String c = binary.substring(i, i+1);

        if(c.equals("1")){
                if(currlenght> maxlenght){
                    maxlenght = currlenght;
                }
            currlenght = 0;

        }
        if (c.equals("0")){
            currlenght++;

        }

    }
    return maxlenght;
    }
}
