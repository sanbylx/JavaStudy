package chapter05;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args){
//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("输入年龄");
//        int age = myScanner.nextInt();
//        if(age>18){
//            System.out.println("年龄已满18岁");
//        }else{
//            System.out.println("年龄未满18");
//        }

        Scanner myScanner = new Scanner(System.in);
        System.out.println("信用分");
        int grade = myScanner.nextInt();
        if (grade == 100) {
            System.out.println("信用极好");
        } else if(grade >80 && grade<= 99) {
            System.out.println("信用优秀");
        } else if (grade>=60&&grade<=80){
            System.out.println("信用一般");
        }else{
            System.out.println("信用不及格");
        }

        System.out.print("程序继续");
    }
}
