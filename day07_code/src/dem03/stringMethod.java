package dem03;

public class stringMethod {
    public static void main(String[] args) {
        System.out.println("qwertyuiop".length());//长度
        String str1="hello";
        String str2="wrold";
        String str3=str1.concat(str2);
        System.out.println(str3);//字符串的拼接
        System.out.println(str3.charAt(4));//查找索引位置的值
        System.out.println(str3.indexOf(str2));//查找子串
        str1=str2;
        System.out.println(str1);//字符串的拼接
    }

}
