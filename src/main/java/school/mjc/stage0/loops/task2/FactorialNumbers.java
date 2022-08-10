package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {

        int i = 1, res = 1;
        System.out.println(1);

        while(i <= printToInclusive){
            res *= i;
            System.out.println(res);
            i++;
        }

    }
}
