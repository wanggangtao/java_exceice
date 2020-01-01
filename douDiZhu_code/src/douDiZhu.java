import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/****
 *
 * 斗地主综合案例
 *
 * 1.准备
 * 2.洗牌
 * 3.发牌
 * 4.看牌
 *
 *
 * */

public class douDiZhu {
    public static void main(String[] args) {
        ArrayList<String> poker=new ArrayList<>();
        String []colors={"♠","♥","♦","♣"};//存储在常量池中
        String [] numbers={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};//存储在常量池中
        poker.add("大王");//存储在集合当中
        poker.add("小王");
        for(String number :numbers)//超强for循环
            for (String color : colors) {
//                System.out.println(number+color);
// 把组装好的牌存储在集合中
                poker.add(number+color);//调用自带的方法函数
            }
        System.out.println(poker);

        /****
         * 2.洗牌
         */
        Collections.shuffle(poker);//集合自带的方法，打乱元素
        System.out.println(poker);//poker是对象它的类中重写了tostring方法，因此打印的是集合的元素，而不是集合的地址
        /***
         * 发牌
         * 定义4个集合
         */
        ArrayList<String> player01=new ArrayList<>();//泛型数据
        ArrayList<String> player02=new ArrayList<>();
        ArrayList<String> player03=new ArrayList<>();
        ArrayList<String> dipai=new ArrayList<>();

        /***
         * 遍历底牌
         */
        for (int i = 0; i <poker.size() ; i++) {//获取每一张牌,超强for没有索引，所以此处不能用超强for
            String p=poker.get(i);
            if(i>=51)
            {
                dipai.add(p);
            }
            else if(i%3==0)
            {
                player01.add(p);
            }
            else if(i%3==1)
            {
                player02.add(p);
            }
            else if(i%3==2)
            {
                player03.add(p);
            }
        }
/***
 * 看牌
 */
        System.out.println("刘德华"+player01.size()+"张牌"+player01);
        System.out.println("周润发"+player02.size()+"张牌"+player02);
        System.out.println("周星驰"+player03.size()+"张牌"+player03);
        System.out.println("底牌"+dipai);



    }
}
