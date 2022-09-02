public class FloatDetail {
    public static void main(String[] args){


//        float num1 =1.1;
        float num1 =1.1f;
        double num2 =1.1f;
        double num3 = .123;
        System.out.println(num3);
        double num4 = 2.123133123121;
        float num5 = 2.123133123121F;
        System.out.println(num4);
        System.out.println(num5);

        double num6 =2.7;
        double num7=8.1/3;
        System.out.println(num6);
        System.out.println(num7);

//        if(num6==num7){
//            System.out.println("相等");
//        }
        //无法判断

        if(Math.abs(num6-num7)<0.00001){
            System.out.println("相等");
        }

    }
}
