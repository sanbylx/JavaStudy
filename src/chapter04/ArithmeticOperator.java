package chapter04;

public class ArithmeticOperator {

    public static void main(String[] args) {
        //除法
        System.out.println(10/4);
        System.out.println(10.0/4);
        double d=10/4;
        System.out.println(d);

        //取模
        System.out.println(10%3);
        System.out.println(-10%3);
        System.out.println(10%-3);
        System.out.println(-10%-3);

        //自增
        int i =10;
        i++;
        ++i;
        System.out.println("i="+i);

        int j=8;
        int k=++j;
        System.out.println("k="+k+"j="+j);




    }
}
