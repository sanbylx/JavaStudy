package chapter04;

public class LogicOperator {
    public static void main(String[] args) {
        int a =4;
        int b=9 ;
        if (a<1 && ++b<50){
            System.out.println("ok");

        }
        System.out.println(a+b);

        if (a<1 & ++b<50){
            System.out.println("ok");

        }
        System.out.println(a+b);


    }
}
