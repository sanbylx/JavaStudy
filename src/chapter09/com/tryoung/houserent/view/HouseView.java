package chapter09.com.tryoung.houserent.view;

import chapter09.com.tryoung.houserent.domain.House;
import chapter09.com.tryoung.houserent.service.HouseService;
import chapter09.com.tryoung.houserent.utils.Utility;

public class HouseView {
    private boolean loop =true;
    private char key =' ';

    private HouseService houseService = new HouseService(10);

    public void update(){
        System.out.println("修改房屋信息");
        System.out.println("请选择待修改的房屋编号");
        int updateId = Utility.readInt();
        if (updateId==-1){
            System.out.println("放弃修改");
            return;
        }

        House house =houseService.findById(updateId);
        if (house ==null ){
            System.out.println("编号不存在");
            return;
        }
        System.out.println("姓名（"+house.getName()+"):");
        String name =Utility.readString(8,"");
        if (!"".equals(name)){
            house.setName(name);
        }
        System.out.println("电话（"+house.getPhone()+"):");
        String phone =Utility.readString(12);
        if (!"".equals(phone)){
            house.setPhone(phone);
        }
        System.out.println("地址（"+house.getAddress()+"):");
        String address =Utility.readString(18,"");
        if (!"".equals(address)){
            house.setAddress(address);
        }
        System.out.println("租金（"+house.getRent()+"):");
        int rent =Utility.readInt(-1);
        if (rent != -1){
            house.setRent(rent);
        }
        System.out.println("状态（"+house.getName()+"):");
        String state =Utility.readString(3,"");
        if (!"".equals(state)){
            house.setState(state);
        }
        System.out.println("修改成功");
    }

    public void findHouse(){
        System.out.println("========查找房屋信息========");
        System.out.println("请输入要查找的id：");
        int findId= Utility.readInt();
        House house =houseService.findById(findId);
        if (house!=null){
            System.out.println(house);
        }else{
            System.out.println("查找的房屋信息不存在");
        }

    }


    public void exit(){
        char c =Utility.readConfirmSelection();
        if (c == 'y') {
            loop = false;
        }
    }

    public  void delHouse(){
        System.out.println("========删除房屋========");
        System.out.println("请输入待删除房屋编号");
        int delId  = Utility.readInt();
        if (delId == -1) {
            System.out.println("放弃删除");
            return;
        }
        char choice = Utility.readConfirmSelection();
        if(choice=='Y'){
            if(houseService.del(delId)){
                System.out.println("删除成功");
            }else {
                System.out.println("房屋编号不存在，删除");
            }

        }else{
            System.out.println("放弃删除房屋信息");
        }

    }

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
                    addHouse();
                    break;

                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    update();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    exit();
                    break;

            }
        }while (loop);
    }
}
