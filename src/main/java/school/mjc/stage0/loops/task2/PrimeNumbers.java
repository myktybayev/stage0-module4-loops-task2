package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public  void printPrimeNumbers(int printToInclusive) {

        int i = 2, j;
        boolean prime = true;

        while(i <= printToInclusive){
            j = 2;
            while(j < i){
                prime = true;

                if(i % j == 0) {
                    prime = false;
                    break;
                }
                j++;
            }
            if(prime) System.out.println(i);

            i++;
        }
    }
}
