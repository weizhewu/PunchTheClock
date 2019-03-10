package firstDayTask3;

import java.util.Scanner;
/**
 * 位哲武
 * 2019/3/10
 */

//创建Rectangle类，继承父类Shape
public class Rectangle extends Shape {
    public void getArea1(){
        Scanner scanner = new Scanner(System.in);
        super.getArea1();
        System.out.println("请输入矩形的长：");
        int x=scanner.nextInt();
        System.out.println("请输入矩形的宽：");
        int y=scanner.nextInt();
        System.out.println("矩形的面积是："+x*y);
    }
}
