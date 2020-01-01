package demo06;

import demo06.Fu;

public class Zi extends Fu
{
    int num=20;
    @Override
    public  void method()
    {
        System.out.println("子类覆盖重写对象");
    }
    public  void shownum()
    {
        System.out.println(num);
    }
    public  void methodZi()
    {
        System.out.println("子类特有对象");
    }
}
