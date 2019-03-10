package firstDayTask3;

import java.util.Scanner;
/**
 * 位哲武
 * 2019/3/10
 */

//创建Circle类，继承父类Shape
public class Circle extends Shape {
    public void getArea2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入圆的半径：");
        super.getArea2();
        int r=scanner.nextInt();
        final double z = 3.14;
        System.out.println("圆的面积是："+z*r*r);
    }
}
