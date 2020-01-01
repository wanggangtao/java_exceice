package demo06;

public class Fu {

    int num=10;
    public  void method()
    {
        System.out.println("父类方法 ");
    }
    public  void methodFu()
    {
        System.out.println("父类特有对象");
    }
    public  void shownum()
    {
        System.out.println(num);
    }
    private  void showtest()
    {
        System.out.println("私有方法不能被继承");
    }
}
