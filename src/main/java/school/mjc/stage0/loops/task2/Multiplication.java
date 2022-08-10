package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i = 0;
        int res;

        while(i <= Math.abs(multiplyByAndToInclusive) && multiplyByAndToInclusive!=0){
            res = multiplyByAndToInclusive * i;
            System.out.println(res);

            i++;
        }
    }
}
