package chapter08.com.tryoung.encap;

public class Encapsulation {
    public static void main(String[] args) {
        Person person =new Person();
        person.setName("jack");
        person.setAge(3000);
        person.setSalary(10.0);
        System.out.println(person.info());
    }
}

class  Person{
    public  String name;
    private int age;
    private  double salary;

    public Person() {

    }

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=1&&age<=120){
        this.age = age;
        }else{
            System.out.println("年龄不合规");
            this.age=18;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info(){
        return "信息为="+name+"age="+age+"薪水="+salary;
    }
}