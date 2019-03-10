package firstDayTask4;
/**
 *位哲武
 * 2019/3/10
 */

//创建一个精灵类，实现接口CanMove和CanSing
public class Spirit implements CanMove ,CanSing{
//    实现CanMove方法
    public void move() {
        System.out.println("可移动");
    }
//    实现CanMove方法
    public void sing(){
        System.out.println("可唱歌");
    }
    public static void main(String[] args) {
//        通过子类创建接口对象
        Spirit spirit = new Spirit();
        System.out.println("精灵可以做的事有：");
//        子类调用CanMove和CanSing两个接口被实现的所有方法
        spirit.move();
        spirit.sing();
    }
}
