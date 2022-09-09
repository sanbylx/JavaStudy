package chapter09.com.tryoung.houserent.view;

import chapter09.com.tryoung.houserent.domain.House;
import chapter09.com.tryoung.houserent.service.HouseService;
import chapter09.com.tryoung.houserent.utils.Utility;

public class HouseView {
    private boolean loop =true;
    private char key =' ';

    private HouseService houseService = new HouseService(10);

    public void addHouse(){
        System.out.println("========添加房屋========");
        System.out.println("姓名：");
        String name = Utility.readString(8);
        System.out.println("电话：");
        String phone = Utility.readString(12);
        System.out.println("地址：");
        String address = Utility.readString(16);
        System.out.println("月租：");
        int rent = Utility.readInt();
        System.out.println("状态：");
        String state = Utility.readString(3);
        House newHouse=new House(0,name,phone,address,rent,state);
        if (houseService.add(newHouse)){
            System.out.println("======添加房屋成功======");
        }else{
            System.out.println("======添加房屋失败======");
        }

    }
    public void listHouses(){

        System.out.println("========房屋列表========");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态（是否出租）");

        House[] houses =houseService.list();
        for (int i=0;i<houses.length;i++){
            if (houses[i]==null){
                break;
            }
            System.out.println(houses[i]);

        }
        System.out.println("========显示完毕========");

    }
    public void mainMenu(){
        do {
            System.out.println("\t============房屋出租系统===========");
            System.out.println("\t\t\t1 新增房源");
            System.out.println("\t\t\t2 查找房屋");
            System.out.println("\t\t\t3 删除房屋信息");
            System.out.println("\t\t\t4 修改房屋信息");
            System.out.println("\t\t\t5 房屋列表");
            System.out.println("\t\t\t6 退出");
            System.out.println("请输入你的选择1-6");
            key = Utility.readChar();
            switch (key){
                case '1':
                    System.out.println("新增");
                    break;

                case '2':
                    System.out.println("查找");
                    break;
                case '3':
                    System.out.println("删除");
                    break;
                case '4':
                    System.out.println("修改");
                    break;
                case '5':
                    System.out.println("房屋列表");
                    break;
                case '6':
                    System.out.println("退出");
                    loop = false;
                    break;

            }
        }while (loop);
    }
}
