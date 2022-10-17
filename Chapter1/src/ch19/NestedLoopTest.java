package ch19;

public class NestedLoopTest {
    public static void main(String[] args){

        int dan;
        int count;
        for(dan = 2; dan<10; dan++){
            for(count = 1; count<10; count++ ) {
                System.out.println(dan + " * " + count + " : " +
                        dan * count);
            }
        }
    }
}
