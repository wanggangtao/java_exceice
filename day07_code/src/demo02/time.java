package demo02;


//import java.util.Date;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class time {
           public static void main(String args[]) throws ParseException {
            // 初始化 Date 对象
            Date date = new Date();

            // 使用 toString() 函数显示日期时间
            System.out.println(date.toString());
            System.out.println(date.getTime());//1970,1,1到至今的毫秒数，当前时间的时间戳
               Scanner sc =new Scanner(System.in);
               System.out.println("请输入相应的时间格式为”yyyy-mm-dd“");
               String birthdaystring =sc.next();
               System.out.println("输入的日期为："+birthdaystring);
               System.out.println("====================================");
               System.out.println("将Date转化为时复合字符串：");//Wed Jan 30 00:12:00 CST 2019
               SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
               Date birthdayDate=sdf.parse(birthdaystring);
               System.out.println(birthdayDate);

               System.out.println("====================================");
               System.out.println("当前时间戳为：");
               long time =date.getTime();
               System.out.println(time);








            SimpleDateFormat ft = new SimpleDateFormat("yyyy年MM月dd");

            System.out.println("当前时间为: " + ft.format(date));


        }
    }