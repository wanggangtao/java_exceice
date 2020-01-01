package dem03;

public class string {
    public static void main(String[] args) {
        String str1="abc";
        String str2="abc";//常量池中保存
        char[]str31={'a','b','c'};
        String str3=new String (str31);
        System.out.println(str3);


        char[]str51={'a','b','c'};
        String str5=new String (str51);
        System.out.println(str5);

        char[]str61={'a','b','c'};
        String str6=new String (str61);
        System.out.println(str6);



         byte[] str41={97,98,99};
        String str4=new String (str41);
        System.out.println(str4);





        System.out.println(str1==str2);//常量池
        System.out.println(str1==str3);
        System.out.println(str1==str4);
        System.out.println(str3==str4);
        System.out.println(str3==str5);
        System.out.println(str6==str5);
        System.out.println("第6个字符串的地址是"+str6+"第5个字符串的地址是"+str5);
    }
}
