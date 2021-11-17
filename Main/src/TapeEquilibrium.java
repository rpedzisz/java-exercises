public class TapeEquilibrium {
    static int solutionbrute(int A[]){
        int min = 2147000000;
        int currentMin = 0;
        for(int i = 0; i< A.length; i++){
            int currIndex = i;
            int leftsum = 0;
            int rightsum = 0;
            for (int j = 0; j< currIndex; j++){
                leftsum += A[j];

            }
            for (int j = currIndex; j< A.length; j++){
                rightsum += A[j];

            }
            currentMin = Math.abs(leftsum-rightsum);

            if(currentMin< min){
                min = currentMin;
            }



        }
    return min;
    }

    static int solutionNcomplexity(int A[]){
        int min = 2147000000;

        int rightValue = 0;
        int leftValue = 0;

        for (int j = 0; j< A.length; j++){
            rightValue += A[j]; // summ all to right

        }
        for (int j = 0; j< A.length-1; j++){
            leftValue += A[j]; // sum left up to current index

            rightValue-=A[j]; //substract difference with current index

            int difference = Math.abs(leftValue-rightValue);

            if(difference< min){
                min = difference;
            }
        }






        return min;
    }


}
