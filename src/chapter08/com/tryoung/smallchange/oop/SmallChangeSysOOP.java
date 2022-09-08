package chapter08.com.tryoung.smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysOOP {
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




    public void mainMenu() {
//        System.out.println("显示零钱菜单");
        do {
            System.out.println("======零钱通======");
            System.out.println("\t\t1、零钱通明细");
            System.out.println("\t\t2、收益入账");
            System.out.println("\t\t3、消费");
            System.out.println("\t\t4、退出");
            System.out.println("请选择（1-4）：");
            key = scanner.next();

            switch (key) {
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;


                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("选择有误，重新选择");
            }
        } while (loop);
    }
        public void detail() {
            System.out.println(details);
        }
        public void income() {
            System.out.println("收益入账金额：");
            money = scanner.nextDouble();
            if (money <= 0) {
                System.out.println("收益需要大于0");
                return;
            }
            balance += money;
            date = new Date();
            details += "\n收益入账+" + money + "\t" + sdf.format(date) + "\t" + balance;
        }

        public void pay() {
            System.out.println("消费金额：");
            money = scanner.nextDouble();
            System.out.println("消费详情：");
            note = scanner.next();
            balance -= money;
            date = new Date();
            details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
        }

        public void exit() {
            String choice = "";
            while (true) {
                System.out.println("确认要退出吗？y/n");
                choice = scanner.next();
                if ("y".equals(choice) || "n".equals(choice)) {
                    break;
                }
            }

            if (choice.equals("y")) {
                loop = false;
            }
        }
    }
