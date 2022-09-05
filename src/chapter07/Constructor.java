package chapter07;

public class Constructor {
    public static void main(String[] args){
        Person p1=new Person("smith",80);
        System.out.println("p1信息如下");
        System.out.println("p1对象name="+p1.name);
        System.out.println("p1对象age="+p1.age);
    }
}

class Person{
    String name;
    int age;
    public Person(String pName,int pAge){
        System.out.println("构造器被调用，完成属性初始化");
        name=pName;
        age=pAge;
    }
    //构造器的重载
    public Person(String pName){
        System.out.println("构造器被调用，完成属性初始化");
        name=pName;
    }
}