package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int i = 0, res = 1;

        if(power < 0) System.out.println("too much power");
        else System.out.println(1);

        while (i < power){
            res *= 2;
            i++;
            System.out.println(res);
        }
    }
}
