package demo06;

/**
 * 静态方法的多态测试
 *
 * @author 小明
 *
 */
public class StaticFunText {
    public static void main(String[] args) {
        A a=new B();
        a.f();
        a.f1();
//        a.f2();//子类特有的方法不能被继承

    }
}

    class A {
    public void f() {
        System.out.println("A类的非静态方法，多态机制可以实现");
    }

    public static void f1() {
        System.out.println("A类的静态方法，多态机制无法实现");
    }
}

class B extends A {
    public void f() {
        System.out.println("子类的非static方法是可以被调用的！！");
    }

    public static void f1() {
        System.out.println("子类的stati方法是不可以被重写的！！");
    }
    public void f2()
    {
        System.out.println("子类的特有！！");
    }

}