package demo06;

/***
 * 多态
 */
public class Base {
    public static void main(String[] args) {
        //使用多态方法
        //左侧父类的引用指向了右侧子类的对象
        Fu obj = new Zi();//左侧生成了子类的对象，在堆上存储，左侧是父类的引用
        obj.method();
        obj.methodFu();
        obj.shownum();
//        obj.showtest();//子类私有方法不能被继承
//        obj.methodZi();//子类方法丢失

    }

}
