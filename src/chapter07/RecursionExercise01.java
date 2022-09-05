package chapter07;

public class RecursionExercise01 {
    public static void main(String[] args) {
        F f1 =new F();
        System.out.println("斐波那契数="+f1.fibonacci(9));
    }
}

class F {
    public int fibonacci(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        } else {
            System.out.println("要求输入的你>=1的整数");
            return -1;
        }
    }
}