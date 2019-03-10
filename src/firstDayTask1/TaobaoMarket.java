package firstDayTask1;
/**
 *位哲武
 * 2019/3/10
 */

//定义一个TaobaoMarket类，继承父类Market抽象类，实现其中的shop()方法
public class TaobaoMarket extends Market {
    @Override
    public void shop() {
        System.out.println(name+"网购"+goods);
    }
}
