package chapter07;

public class MethodParameter01 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        AAA obj=new AAA();
        obj.swap(a,b);
        System.out.println(a+" "+b);
    }
}

class AAA {
    public void swap(int a, int b) {
        System.out.println(a+" "+b);
        int tmp=a;
        a=b;
        b=tmp;
        System.out.println(a+" "+b);
    }
}