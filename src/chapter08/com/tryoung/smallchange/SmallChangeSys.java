package chapter08.com.tryoung.smallchange;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        //定义相关的变量
        boolean loop =true;
        Scanner scanner =new Scanner(System.in);
        String key ="";

        String details ="======零钱通明细======";
        double money =0;
        double balance =0;
        Date date=null;
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm");

        String note= null;

        do {
            System.out.println("======零钱通======");
            System.out.println("\t\t1、零钱通明细");
            System.out.println("\t\t2、收益入账");
            System.out.println("\t\t3、消费");
            System.out.println("\t\t4、退出");
            System.out.println("请选择（1-4）：");
            key=scanner.next();

            switch(key){
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("收益入账金额：");
                    money =scanner.nextDouble();
                    if(money<=0){
                        System.out.println("收益需要大于0");
                        break;
                    }
                    balance += money;
                    date=new Date();
                    details +="\n收益入账+"+money+"\t"+sdf.format(date)+"\t"+balance;

                    break;
                case "3":
                    System.out.println("消费金额：");
                    money=scanner.nextDouble();
                    System.out.println("消费详情：");
                    note =scanner.next();
                    balance -= money;
                    date=new Date();
                    details +="\n"+note+"\t-"+money+"\t"+sdf.format(date)+"\t"+balance;
                break;


                case "4":
                    String choice = "";
                    while (true){
                        System.out.println("确认要退出吗？y/n");
                        choice =scanner.next();
                        if ("y".equals(choice)||"n".equals(choice)){
                            break;
                        }
                    }
                    if(choice.equals("y")){
                        loop=false;
                    }
                    break;
                default:
                    System.out.println("选择有误，重新选择");
            }

        }while(loop);
        System.out.println("======退出项目======");
    }
}
