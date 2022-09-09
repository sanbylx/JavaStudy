package chapter09.com.tryoung.houserent.service;

import chapter09.com.tryoung.houserent.domain.House;

public class HouseService {
    private House[] houses;
    private int houseNums =1;
    private  int idCounter =1;
    public HouseService(int size){
        houses = new House[size];
        houses[0] = new House(1,"hututu","114514","翻斗大街翻斗花园1001室",2000,"未出租");

    }

    public boolean add(House newHouse){
        if(houseNums==houses.length){
            System.out.println("数组已满，无法再添加");
            return false;
        }
        houses[houseNums++] = newHouse;
//        idCounter++;
        newHouse.setId(++idCounter);
        return true;
    }

    public House[] list() {

        return houses;
    }
}
