package chapter07;

public class VarScope {
    public static void main(){

    }

}
class Cat{
    //全局变量，作用于cat整个类体
    int age =10;
    public void cry(){
        //n和name为局部变量
        int n=10;
        String name = "jack";
    }
}