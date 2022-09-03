package chapter05;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("输入字符");
        char c1 = myScanner.next().charAt(0);
        switch(c1){
            case'a':
                System.out.println("1");
                break;
            case'b':
                System.out.println("2");
                break;
            case'c':
                System.out.println("3");
                break;
            default:
                System.out.println("没有匹配");
        }
    }
}
