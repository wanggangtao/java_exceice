package dem03;

import java.util.ArrayList;

public class Person {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("王宝钏");
        list.add("王");
        list.add("宝");
        list.add("钏");
        list.get(2);
        System.out.println("数组的大小为："+list.size());

        System.out.println("删除的元素为："+list.remove(2));

        System.out.println("数组的大小为："+list.size());
        System.out.println("数组的打印为："+list);
        String str="df";
    }
}
