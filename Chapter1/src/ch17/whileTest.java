package ch17;

public class whileTest {

    public static void main(String[] args){
        int num = 1;
        int sum = 0;

        while(num<=10){
           sum += num;
            num++;

        }
        System.out.println("1부터10까지 더한 값 : " + sum);
    }
}
