package day05_code;


public class static_excess {
    private static int numInstances = 0;//私有的静态变量

    protected static int getCount() {//获取数据
        return numInstances;
    }

    private static void addInstance() {//添加数据
        numInstances++;
    }

    static_excess() {//gouzaohanshu
        static_excess.addInstance();
    }


    public static void main(String[] arguments) {
        System.out.println("Starting with " + static_excess.getCount() + " instances");
        for (int i = 0; i < 500; ++i) {

            new static_excess();
        }
        System.out.println("Created " + static_excess.getCount() + " instances");
    }

}
